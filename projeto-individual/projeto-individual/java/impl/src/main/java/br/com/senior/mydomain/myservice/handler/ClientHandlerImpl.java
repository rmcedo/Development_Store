package br.com.senior.mydomain.myservice.handler;

import br.com.senior.SecurityConstants;
import br.com.senior.messaging.ErrorCategory;
import br.com.senior.messaging.model.HandlerImpl;
import br.com.senior.messaging.model.ServiceException;
import br.com.senior.messaging.security.SecureResource;
import br.com.senior.mydomain.myservice.*;
import br.com.senior.mydomain.myservice.client.ClientConverter;
import br.com.senior.mydomain.myservice.client.ClientService;
import br.com.senior.platform.translationhub.api.TranslationHubApi;
import org.springframework.transaction.annotation.Transactional;

import javax.inject.Inject;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@HandlerImpl
public class ClientHandlerImpl implements FindByName, FindByCpf, FindByBirthday, FindByActiveTrue, AtivarCliente {

    @Inject
    private ClientService service;

    @Inject
    private TranslationHubApi translationHubApi;

    @Inject
    private ClientConverter converter;

    @Override
    @SecureResource(name=ClientEntity.SECURITY_RESOURCE, action = SecurityConstants.ENTITY_SECURITY_ACTION_VIEW)
    public FindByNameOutput findByName(FindByNameInput request) {

        final List<ClientEntity> clients = service.findByNameContainingIgnoreCase(request.name);

        final List<Client> clientDTO = clients
                .stream()
                .map(c -> converter.toDto(c))
                .collect(Collectors.toList());

        if(clientDTO.isEmpty()){
            throw new ServiceException(ErrorCategory.BAD_REQUEST, translationHubApi.getMessage("br.com.senior.my_domain.my_service.client_name_not_found"));
        }
        return new FindByNameOutput(clientDTO);

    }

    @Override
    @SecureResource(name=ClientEntity.SECURITY_RESOURCE, action = SecurityConstants.ENTITY_SECURITY_ACTION_VIEW)
    public FindByCpfOutput findByCpf(FindByCpfInput request) {

        final List<ClientEntity> clients = service.findByCpfEquals(request.cpf);

        final List<Client> clientDTO = clients
                .stream()
                .map(c -> converter.toDto(c))
                .collect(Collectors.toList());

        if (clientDTO.isEmpty()) {

            throw new ServiceException(ErrorCategory.BAD_REQUEST, translationHubApi.getMessage("br.com.senior.my_domain.my_service.client_cpf_not_found"));

        }

        return new FindByCpfOutput(clientDTO);

    }

    @Override
    @SecureResource(name=ClientEntity.SECURITY_RESOURCE, action = SecurityConstants.ENTITY_SECURITY_ACTION_VIEW)
    public FindByBirthdayOutput findByBirthday(FindByBirthdayInput request) {
        final List<ClientEntity> clients = service.findByBirthday(request.birthday);

        final List<Client> clientDTO = clients
                .stream()
                .map(c -> converter.toDto(c))
                .collect(Collectors.toList());

        if (clientDTO.isEmpty()) {
            throw new ServiceException(ErrorCategory.BAD_REQUEST, translationHubApi.getMessage("br.com.senior.my_domain.my_service.client_birthday_not_found"));
        } else {
            return new FindByBirthdayOutput(clientDTO);
        }
    }


    @Override
    @SecureResource(name=ClientEntity.SECURITY_RESOURCE, action = SecurityConstants.ENTITY_SECURITY_ACTION_VIEW)
    public FindByActiveTrueOutput findByActiveTrue(FindByActiveTrueInput request) {
        final List<ClientEntity> clients = service.findByActive(request.active);
        final List<Client> clientDTO = clients
                .stream()
                .map(c -> converter.toDto(c))
                .collect(Collectors.toList());

        if (clientDTO.isEmpty()) {
            throw new ServiceException(ErrorCategory.BAD_REQUEST, translationHubApi.getMessage("br.com.senior.my_domain.my_service.client_active_true"));
        } else {
            return new FindByActiveTrueOutput(clientDTO);
        }
    }


    @Override
    @Transactional
    @SecureResource(name=ClientEntity.SECURITY_RESOURCE, action = SecurityConstants.ENTITY_SECURITY_ACTION_DELETE)
    @SecureResource(name=ClientEntity.SECURITY_RESOURCE, action = SecurityConstants.ENTITY_SECURITY_ACTION_UPDATE)
    public void ativarCliente(AtivarClienteInput payload) {
        service.findById(UUID.fromString(payload.id.toString())).setActive(true);
    }
}
