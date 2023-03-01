package br.com.senior.mydomain.myservice.client;

import br.com.senior.messaging.ErrorCategory;
import br.com.senior.messaging.model.ServiceException;
import br.com.senior.mydomain.myservice.Client;
import br.com.senior.mydomain.myservice.ClientCrudServiceImpl;
import br.com.senior.mydomain.myservice.ClientEntity;
import br.com.senior.platform.translationhub.api.TranslationHubApi;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import java.util.Optional;
import java.util.UUID;


@Service
@Primary
class ClientCrudServiceCustomImpl extends ClientCrudServiceImpl {

    @Inject
    ClientRepository clientRepository;

    @Inject
    TranslationHubApi translationHubApi;


    @Override
    public void deleteClient(Client.Id id) {
        Optional<ClientEntity> client = clientRepository.findById(UUID.fromString(id.id));
        // Realizamos uma verificação para que tenhamos certeza de que a operação seja realizada, para que não ocorra uma operação
        // desnecessária, tentando deletar um cliente do qual seu status está como ativo == false
        if(client != null && client.get().getActive() == true) {
            client.get().setActive(false);
        }else{
            throw new ServiceException(ErrorCategory.BAD_REQUEST, translationHubApi.getMessage("br.com.senior.my_domain.my_service.id_not_found"));
        }
    }
}
