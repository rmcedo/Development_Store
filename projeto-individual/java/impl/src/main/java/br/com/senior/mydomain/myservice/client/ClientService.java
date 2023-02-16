package br.com.senior.mydomain.myservice.client;

import br.com.senior.mydomain.myservice.ClientEntity;
import br.com.senior.mydomain.myservice.repository.ClientRepository;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import java.util.List;

@Service
public class ClientService {

    @Inject
    ClientRepository repository;
    public List<ClientEntity> findByNameContainingIgnoreCase(String name){

        return repository.findByNameContainingIgnoreCase(name);
    }
}