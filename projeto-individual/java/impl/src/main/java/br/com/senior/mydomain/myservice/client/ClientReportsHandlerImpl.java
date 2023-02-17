package br.com.senior.mydomain.myservice.client;

import br.com.senior.messaging.ErrorCategory;
import br.com.senior.messaging.model.HandlerImpl;
import br.com.senior.messaging.model.ServiceException;
import br.com.senior.mydomain.myservice.*;
import org.springframework.transaction.annotation.Transactional;

import javax.inject.Inject;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@HandlerImpl
public class ClientReportsHandlerImpl implements FindByName, FindByCpf, FindByBirthday, FindByActiveTrue, AtivarCliente {

    //TODO: SIGNAL para EXCLUSÃO LÓGICA
    @Inject
    private ClientService service;

    @Override
    public FindByNameOutput findByName(FindByNameInput request) {

        final List<ClientEntity> clients = service.findByNameContainingIgnoreCase(request.name);

        final List<Client> clientDTO = clients
                .stream()
                .map(c -> new Client(c.getId().toString(), c.getName(), c.getCpf(), c.getBirthday(), c.getActive(), null))
                .collect(Collectors.toList());

        if(clientDTO.isEmpty()){
            throw new ServiceException(ErrorCategory.BAD_REQUEST, "There is no client with a name that look like this");
        }
        return new FindByNameOutput(clientDTO);

    }

    @Override
    public FindByCpfOutput findByCpf(FindByCpfInput request) {

        final List<ClientEntity> clients = service.findByCpfEquals(request.cpf);

        final List<Client> clientDTO = clients
                .stream()
                .map(c -> new Client(c.getId().toString(), c.getName(), c.getCpf(), c.getBirthday(), c.getActive(), null))
                .collect(Collectors.toList());

        if (clientDTO.isEmpty()) {

            throw new ServiceException(ErrorCategory.BAD_REQUEST, "No client on the database with this CPF");

        }

        return new FindByCpfOutput(clientDTO);

    }

    @Override
    public FindByBirthdayOutput findByBirthday(FindByBirthdayInput request) {
        final List<ClientEntity> clients = service.findByBirthday(request.birthday);

        final List<Client> clientDTO = clients
                .stream()
                .map(c -> new Client(c.getId().toString(), c.getName(), c.getCpf(), c.getBirthday(), c.getActive(), null))
                .collect(Collectors.toList());

        if (clientDTO.isEmpty()) {
            throw new ServiceException(ErrorCategory.BAD_REQUEST, "No client on the database born on this date");
        } else {
            return new FindByBirthdayOutput(clientDTO);
        }
    }


    @Override
    public FindByActiveTrueOutput findByActiveTrue(FindByActiveTrueInput request) {
        final List<ClientEntity> clients = service.findByActive(request.active);
        final List<Client> clientDTO = clients
                .stream()
                .map(c -> new Client(c.getId().toString(), c.getName(), c.getCpf(), c.getBirthday(), c.getActive(), null))
                .collect(Collectors.toList());

        if (clientDTO.isEmpty()) {
            throw new ServiceException(ErrorCategory.BAD_REQUEST, "No client on the database with this parameter");
        } else {
            return new FindByActiveTrueOutput(clientDTO);
        }
    }


    @Override
    @Transactional
    public void ativarCliente(AtivarClienteInput payload) {
        service.findById(UUID.fromString(payload.id.toString())).setActive(true);
    }
}
