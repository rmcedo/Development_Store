package br.com.senior.mydomain.myservice.handler;

import br.com.senior.SecurityConstants;
import br.com.senior.messaging.ErrorCategory;
import br.com.senior.messaging.model.HandlerImpl;
import br.com.senior.messaging.model.ServiceException;
import br.com.senior.messaging.security.SecureResource;
import br.com.senior.mydomain.myservice.*;
import br.com.senior.mydomain.myservice.pedido.PedidoService;
import br.com.senior.platform.translationhub.api.TranslationHubApi;
import org.springframework.transaction.annotation.Transactional;

import javax.inject.Inject;
import java.util.List;
import java.util.stream.Collectors;

@HandlerImpl
public class PedidoHandlerImpl implements FindByFinalValueGreater {
    @Inject
    PedidoService service;

    @Inject
    TranslationHubApi translationHubApi;



//    @Override
//    @SecureResource(name=PedidoEntity.SECURITY_RESOURCE, action = SecurityConstants.ENTITY_SECURITY_ACTION_VIEW)
//    public FindDateBetweenOutput findDateBetween(FindDateBetweenInput request) { // AJUSTAR TODO
//        final List<PedidoEntity> pedidos = service.findOrderDateBetween(request.date1, request.date2);
//
//        final List<Pedido> pedidoDTO = pedidos
//                .stream()
//                .map(p -> new Pedido(p.getId().toString(),null , null, p.getOrderDate(),p.getFinalValue(),null))
//                .collect(Collectors.toList());
//
//        if (pedidoDTO.isEmpty()){
//            throw new ServiceException(ErrorCategory.BAD_REQUEST, translationHubApi.getMessage("br.com.senior.my_domain.my_service.order_date_between"));
//        }
//        return new FindDateBetweenOutput(pedidoDTO);
//    }

    @Override
    @Transactional
    @SecureResource(name=PedidoEntity.SECURITY_RESOURCE, action = SecurityConstants.ENTITY_SECURITY_ACTION_VIEW)
    public FindByFinalValueGreaterOutput findByFinalValueGreater(FindByFinalValueGreaterInput request) {
        final List<PedidoEntity> pedidos = service.findByFinalValueGreater(request.value);

        final List<Pedido> pedidoDTO = pedidos
                .stream()
                .map(p -> new Pedido(p.getId().toString(),null , null, p.getOrderDate(),p.getFinalValue(),null))
                .collect(Collectors.toList());

        if (pedidoDTO.isEmpty()){
            throw new ServiceException(ErrorCategory.BAD_REQUEST, translationHubApi.getMessage("br.com.senior.my_domain.my_service.order_final_value_greater"));
        }

        return new FindByFinalValueGreaterOutput(pedidoDTO);

    }
}

