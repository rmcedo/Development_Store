package br.com.senior.mydomain.myservice.product;

import br.com.senior.mydomain.myservice.ClientEntity;
import br.com.senior.mydomain.myservice.ProductEntity;
import br.com.senior.mydomain.myservice.repository.ProductRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import java.math.BigDecimal;
import java.util.List;

@Service
public class ProductService {

    @Inject
    ProductRepository repository;

    public List<ProductEntity> findProductWithPriceGreaterThan(BigDecimal value){

        return repository.findProductWithPriceGreaterThen(value);
    }
    public List<ProductEntity> findByNameContainingIgnoreCase(String name){
        return repository.findByNameContainingIgnoreCase(name);
    }

    public List<ProductEntity> findByPriceLessThan(BigDecimal price){
        return repository.findByPriceLessThan(price);
    }

    public List<ProductEntity> findByStockLessThan(Long stock){
        return repository.findByStockLessThan(stock);
    }

    public List<ProductEntity> findByStockGreaterThan(Long stock){
        return repository.findByStockGreaterThan(stock);
    }





}
