package br.com.senior.mydomain.myservice.product;

import br.com.senior.mydomain.myservice.Product;
import br.com.senior.mydomain.myservice.ProductEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductConverter {

    public Product toDto (ProductEntity products){

       return new Product(
               products.getId().toString(),
               products.getName(),
               products.getDescription(),
               products.getPrice(),
               products.getStock(),
               products.getActive(),
               products.getCategoria(),
               null
       );
    }
}
