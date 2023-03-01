package br.com.senior.mydomain.myservice.client;

import br.com.senior.messaging.ErrorCategory;
import br.com.senior.messaging.model.ServiceException;
import br.com.senior.mydomain.myservice.Client;
import br.com.senior.mydomain.myservice.ClientCrudValidator;
import br.com.senior.mydomain.myservice.ClientEntity;
import br.com.senior.platform.translationhub.api.TranslationHubApi;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Service
class ClientCrudValidatorImpl implements ClientCrudValidator {

    @Inject
    private TranslationHubApi translationHubApi;

    @Inject
    ClientRepository repository;
    @Override
    public void beforeCreate(ClientEntity entity) {

        validateCPF(entity);
        validateUniqueCpf(entity);
    }


    @Override
    public void beforeUpdate(ClientEntity entity) {

        validateCPF(entity);
        validateUniqueCpf(entity);

    }

    @Override
    public void beforeDelete(Client.Id id) {

    }
    private void validateCPF(ClientEntity entity) {
        Pattern pattern = Pattern.compile("(^\\d{3}\\x2E\\d{3}\\x2E\\d{3}\\x2D\\d{2}$)", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(entity.getCpf());
        boolean matchFound = matcher.find();
            if(matchFound) {
                System.out.println("Match found");
            } else {
                throw new ServiceException(ErrorCategory.BAD_REQUEST, translationHubApi.getMessage("br.com.senior.my_domain.my_service.invalid_cpf"));
            }
    }

    public void validateUniqueCpf(ClientEntity entity) {
        List<ClientEntity> existingClients = repository.findByCpfEquals(entity.getCpf());
        if (!existingClients.isEmpty()) {
            ClientEntity existingClient = existingClients.get(0);
            if (!existingClient.getId().equals(entity.getId())) {
                throw new ServiceException(ErrorCategory.BAD_REQUEST, translationHubApi.getMessage("br.com.senior.my_domain.my_service.duplicate_cpf"));
            }
        }
    }
}
