package br.com.senior.mydomain.myservice.pedido;

import br.com.senior.messaging.ErrorCategory;
import br.com.senior.messaging.model.ServiceException;
import br.com.senior.mydomain.myservice.*;
import br.com.senior.mydomain.myservice.repository.ItemRepository;
import br.com.senior.mydomain.myservice.repository.ProductRepository;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.inject.Inject;
import java.math.BigDecimal;
import java.util.List;

@Service
@Primary
public class PedidoCrudServiceCustomImpl extends PedidoCrudServiceImpl {

    @Inject
    private ProductRepository productRepository; //NECESSÁRIO CRIAR UM SERVICE PARA IMPLEMENTAR, PARA NÃO UTILIZAR O BASEREPOSITORY. TODO

    @Inject
    private ItemRepository itemRepository;

    @Transactional
    @Override
    public PedidoEntity createPedido(PedidoEntity entity) {
        List<ItemEntity> itens = entity.getItems();
        validatedStockCalculateFinalValue(itens,entity);

        itens.forEach(item -> {
            ProductEntity product = productRepository.findById(item.getProduct().getId()).get();
            product.setStock(product.getStock() - item.getQuantity());
        });

        return super.create(entity);
    }


    @Transactional
    @Override
    public PedidoEntity updatePedido(PedidoEntity entity) {
        validatedStockCalculateFinalValue(entity.getItems(), entity);
        entity.getItems().forEach(item->{
            ProductEntity product = productRepository.findById(entity.getItems().get(0).getProduct().getId()).orElse(null);
            ItemEntity itemOld = itemRepository.findById((item.getId())).orElse(null);
            if(item.getQuantity() <= itemOld.getQuantity()){
                product.setStock(product.getStock() + (itemOld.getQuantity() - item.getQuantity()));
            }else {
                product.setStock(product.getStock() - (item.getQuantity() - itemOld.getQuantity()));
            }
        });
        return super.updatePedido(entity);
    }

    private void validatedStockCalculateFinalValue(List<ItemEntity> itens, PedidoEntity entity) {

        if (itens != null) {
            BigDecimal OrderTotalValue = BigDecimal.ZERO;
            for (ItemEntity item : itens) {
                ProductEntity product = item.getProduct();
                if (product != null) {
                    product = productRepository.findById(product.getId()).orElse(null);
                    item.setUnitaryValue(product.getPrice());
                    BigDecimal value = new BigDecimal(item.getQuantity());
                    item.setTotalValue(value.multiply(item.getUnitaryValue()));

                    if (product != null) {
                        if (product.getStock() < item.getQuantity()) {
                            throw new ServiceException(ErrorCategory.BAD_REQUEST, "Not enough stock from the choosen product");
                        }
                    }

                    OrderTotalValue = OrderTotalValue.add(item.getTotalValue());

                }
            }
            entity.setFinalValue(OrderTotalValue);

        }
    }


}
