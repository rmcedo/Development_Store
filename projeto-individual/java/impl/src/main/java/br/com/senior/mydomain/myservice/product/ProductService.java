package br.com.senior.mydomain.myservice.product;

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

    public List<ProductEntity> findProductWithPriceGreaterThen(BigDecimal value){

        return repository.findProductWithPriceGreaterThen(value);
    }


}
