package br.com.senior.mydomain.myservice.client;

import br.com.senior.mydomain.myservice.Client;
import br.com.senior.mydomain.myservice.ClientEntity;
import br.com.senior.mydomain.myservice.Product;
import br.com.senior.mydomain.myservice.ProductEntity;
import org.springframework.stereotype.Service;

@Service
public class ClientConverter {

    public Client toDto (ClientEntity clients){

       return new Client(clients.getId().toString(),
               clients.getName(),
               clients.getCpf(),
               clients.getBirthday(),
               clients.getActive(),
               null
       );
    }
}
