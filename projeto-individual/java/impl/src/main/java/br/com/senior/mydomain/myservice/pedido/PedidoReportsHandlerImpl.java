package br.com.senior.mydomain.myservice.pedido;

import br.com.senior.messaging.ErrorCategory;
import br.com.senior.messaging.model.HandlerImpl;
import br.com.senior.messaging.model.ServiceException;
import br.com.senior.mydomain.myservice.*;

import javax.inject.Inject;
import java.util.List;
import java.util.stream.Collectors;

@HandlerImpl
public class PedidoReportsHandlerImpl implements FindDateBetween {
    @Inject
    PedidoService service;



    @Override
    public FindDateBetweenOutput findDateBetween(FindDateBetweenInput request) {
        final List<PedidoEntity> pedidos = service.findOrderDateBetween(request.date1, request.date2);

        final List<Pedido> pedidoDTO = pedidos
                .stream()
                .map(p -> new Pedido(p.getId().toString(),service.convertClient(p.getClient()) , service.convertItemList(p.getItems()), p.getOrderDate(),p.getFinalValue(),null))
                .collect(Collectors.toList());

        if (pedidoDTO.isEmpty()){
            throw new ServiceException(ErrorCategory.BAD_REQUEST, "There is no record of Pedidos between the dates requested");
        }
        return new FindDateBetweenOutput(pedidoDTO);
    }
}

