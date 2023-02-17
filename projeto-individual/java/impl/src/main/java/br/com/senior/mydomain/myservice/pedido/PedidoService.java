package br.com.senior.mydomain.myservice.pedido;

import br.com.senior.mydomain.myservice.*;
import br.com.senior.mydomain.myservice.repository.PedidoRepository;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class PedidoService {

    @Inject
    PedidoRepository repository;

    public List<PedidoEntity> findOrderDateBetween(LocalDate date1, LocalDate date2){
        return repository.findByOrderDateBetween(date1, date2);
    }

    public Client convertClient(ClientEntity client){
        return new Client(client.getId().toString(),client.getName(), client.getCpf(), client.getBirthday(), client.getActive(), null);
    }
    public Product convertProduct(ProductEntity p){
        return new Product(p.getId().toString(),p.getName(),p.getDescription(),p.getPrice(),p.getStock(),p.getActive(),null);
    }
    public Pedido convertPedido(PedidoEntity pedido){
        List<Item> listItens = new ArrayList<>();
        pedido.getItems().forEach(item -> {
            listItens.add(convertItem(item));
        });
        return  new Pedido(pedido.getId().toString(), convertClient(pedido.getClient()), listItens, pedido.getOrderDate(), pedido.getFinalValue(), null);
    }

    public Item convertItem(ItemEntity item){
        return new Item(item.getId().toString(),convertPedido(item.getPedido()), convertProduct(item.getProduct()), item.getQuantity(), item.getUnitaryValue(), item.getTotalValue(), null);
    }

    public List<Item> convertItemList(List<ItemEntity> itens){
        List<Item> response = new ArrayList<>();
        itens.forEach( item -> {
            response.add(convertItem(item));
        });
       return response;
    }
}
