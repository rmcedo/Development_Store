package br.com.senior.mydomain.myservice.pedido;

import br.com.senior.EventPublisher;
import br.com.senior.messaging.ErrorCategory;
import br.com.senior.messaging.model.ServiceException;
import br.com.senior.mydomain.myservice.*;
import br.com.senior.mydomain.myservice.product.ProductService;
import br.com.senior.platform.translationhub.api.TranslationHubApi;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.inject.Inject;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Service
@Primary
class PedidoCrudServiceCustomImpl extends PedidoCrudServiceImpl {

    @Inject
    private ProductService productService;

    @Inject
    private ItemRepository itemRepository;

    @Inject
    private TranslationHubApi translationHubApi;

    @Transactional
    @Override
    public PedidoEntity createPedido(PedidoEntity entity) {
        List<ItemEntity> itens = entity.getItems();
        validatedStockCalculateFinalValue(itens, entity);

        itens.forEach(item -> {
            ProductEntity product = productService.findById(item.getProduct().getId());
            //Setamos o estoque, subtraindo o valor atual do estoque com a quantidade de cada item, passado dentro de pedido
            product.setStock(product.getStock() - item.getQuantity());

            //Caso o estoque do produto chegue a zero, iremos lançar um evento para avisar outro departamento sobre o estoque
            if (product.getStock() == 0) {

                StockProductPayload payload = new StockProductPayload();
                payload.id = product.getId().toString();
                EventPublisher.publish(MyServiceConstants.Events.STOCK_PRODUCT, payload);

            }
        });
        //Setamos a data do pedido de acordo com o dia atual do sistema, para não setarmos manualmente ao criarmos um pedido
        entity.setOrderDate(LocalDate.now());

        return super.create(entity);
    }


    @Transactional
    @Override
    public PedidoEntity updatePedido(PedidoEntity entity) {
        validatedStockCalculateFinalValue(entity.getItems(), entity);
        entity.getItems().forEach(item -> {
            ProductEntity product = productService.findById(entity.getItems().get(0).getProduct().getId());
            ItemEntity itemOld = itemRepository.findById((item.getId())).orElse(null);

            //Realizamos as operações necessárias para que haja a devolução ou redução do estoque do produto
            if (item.getQuantity() <= itemOld.getQuantity()) {
                product.setStock(product.getStock() + (itemOld.getQuantity() - item.getQuantity()));
            } else {
                product.setStock(product.getStock() - (item.getQuantity() - itemOld.getQuantity()));
            }
            //Caso o estoque do produto chegue a zero, iremos lançar um evento para avisar outro departamento sobre o estoque
            if (product.getStock() == 0) {
                StockProductPayload payload = new StockProductPayload();
                payload.id = product.getId().toString();
                EventPublisher.publish(MyServiceConstants.Events.STOCK_PRODUCT, payload);
            }

        });
        //Setamos a data do pedido de acordo com o dia atual do sistema, para não setarmos manualmente ao criarmos um pedido
        entity.setOrderDate(LocalDate.now());
        return super.updatePedido(entity);
    }

    private void validatedStockCalculateFinalValue(List<ItemEntity> itens, PedidoEntity entity) {

        if (itens != null) {
            BigDecimal orderTotalValue = BigDecimal.ZERO;
            //Necessário criar váriavel para ir salvando os valores totais dos itens

            for (ItemEntity item : itens) {
                ProductEntity product = item.getProduct();
                if (product != null) {
                    product = productService.findById(product.getId());
                    //Valor unitário do item é setado a partir do valor do Produto
                    item.setUnitaryValue(product.getPrice());

                    //Valor total dos itens é obtido através da multiplicação da quantidade de itens com o valor unitário do item
                    BigDecimal value = new BigDecimal(item.getQuantity());
                    item.setTotalValue(value.multiply(item.getUnitaryValue()));

                    if (product != null) {
                        //Verifica se a quantidade do estoque é maior que a quantidade de itens requisitados no pedido
                        // Caso a quantidade seja menor que a pedida, iremos lançar uma exceção e o pedido não será efetuado
                        if (product.getStock() < item.getQuantity()) {
                            throw new ServiceException(ErrorCategory.BAD_REQUEST, translationHubApi.getMessage("br.com.senior.my_domain.my_service.order_stock_not_enough"));
                        }
                    }

                    //Irá adicionar na variavél orderTotalValue os valores totais de cada item
                    orderTotalValue = orderTotalValue.add(item.getTotalValue());
                }
            }

            //setFinalValue recebe os valores somados através do forEach
            entity.setFinalValue(orderTotalValue);

        }
    }


}
