package br.com.senior.mydomain.myservice.repository;

import br.com.senior.mydomain.myservice.ClientBaseRepository;
import br.com.senior.mydomain.myservice.ClientEntity;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClientRepository extends ClientBaseRepository {

    List<ClientEntity> findByNameContainingIgnoreCase(String name);


}