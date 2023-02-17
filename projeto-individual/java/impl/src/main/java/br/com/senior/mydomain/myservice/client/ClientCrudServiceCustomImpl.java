package br.com.senior.mydomain.myservice.client;

import br.com.senior.messaging.ErrorCategory;
import br.com.senior.messaging.model.ServiceException;
import br.com.senior.mydomain.myservice.Client;
import br.com.senior.mydomain.myservice.ClientBaseRepository;
import br.com.senior.mydomain.myservice.ClientCrudServiceImpl;
import br.com.senior.mydomain.myservice.ClientEntity;
import br.com.senior.mydomain.myservice.repository.ClientRepository;
import org.springframework.context.annotation.Primary;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import java.util.Optional;
import java.util.UUID;


@Service
@Primary
public class ClientCrudServiceCustomImpl extends ClientCrudServiceImpl {



    @Inject
    ClientRepository clientRepository;



    @Override
    public void deleteClient(Client.Id id) {
        Optional<ClientEntity> client = clientRepository.findById(UUID.fromString(id.id));
        if(client != null && client.get().getActive() == true) {
            client.get().setActive(false);
        }else{
            throw new ServiceException(ErrorCategory.BAD_REQUEST, "Client ID Not Found");
        }
        //super.deleteClient(id);
    }
}
