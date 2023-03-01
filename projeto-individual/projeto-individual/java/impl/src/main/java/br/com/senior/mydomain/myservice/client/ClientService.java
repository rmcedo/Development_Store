package br.com.senior.mydomain.myservice.client;

import br.com.senior.messaging.ErrorCategory;
import br.com.senior.messaging.model.ServiceException;
import br.com.senior.mydomain.myservice.ClientEntity;
import br.com.senior.platform.translationhub.api.TranslationHubApi;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.inject.Inject;
import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

@Service
public class ClientService {

    @Inject
    ClientRepository repository;

    @Inject
    private TranslationHubApi translationHubApi;

    public List<ClientEntity> findByNameContainingIgnoreCase(String name) {

        return repository.findByNameContainingIgnoreCase(name);
    }

    public List<ClientEntity> findByCpfEquals(String cpf) {

        return repository.findByCpfEquals(cpf);
    }

    public List<ClientEntity> findByBirthday(LocalDate birthday) {
        return repository.findByBirthdayEquals(birthday);
    }

    public List<ClientEntity> findByActive(Boolean active){
        return repository.findByActive(active);
    }

    @Transactional
    public ClientEntity findById(UUID id){
        if(repository.findById(id).isEmpty()){
            throw new ServiceException(ErrorCategory.BAD_REQUEST, translationHubApi.getMessage("br.com.senior.my_domain.my_service.id_not_found"));
        }
        return repository.findById(id).get();
    }

}

