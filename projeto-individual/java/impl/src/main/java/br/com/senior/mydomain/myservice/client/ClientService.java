package br.com.senior.mydomain.myservice.client;

import br.com.senior.messaging.ErrorCategory;
import br.com.senior.messaging.model.ServiceException;
import br.com.senior.mydomain.myservice.ClientEntity;
import br.com.senior.mydomain.myservice.repository.ClientRepository;
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
            throw new ServiceException(ErrorCategory.BAD_REQUEST, "ID doesn't exist");
        };
        return repository.findById(id).get();
    }

}

