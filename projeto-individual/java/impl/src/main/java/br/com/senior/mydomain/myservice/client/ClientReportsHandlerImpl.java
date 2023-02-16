package br.com.senior.mydomain.myservice.client;

import br.com.senior.messaging.model.HandlerImpl;
import br.com.senior.mydomain.myservice.*;

import javax.inject.Inject;
import java.util.List;
import java.util.stream.Collectors;

@HandlerImpl
public class ClientReportsHandlerImpl implements FindByName {
    @Inject
    private ClientService service;

    @Override
    public FindByNameOutput findByName(FindByNameInput request) {

        final List<ClientEntity> clients = service.findByNameContainingIgnoreCase(request.name);

        final List<Client> clientDTO = clients
                .stream()
                .map(c -> new Client(c.getId().toString(), c.getName(), c.getCpf(), c.getBirthday(), c.getActive(), null))
                .collect(Collectors.toList());

        return new FindByNameOutput(clientDTO);

    }

}
