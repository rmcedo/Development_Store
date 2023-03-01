package br.com.senior.mydomain.myservice.product;

import br.com.senior.messaging.ErrorCategory;
import br.com.senior.messaging.model.ServiceException;
import br.com.senior.mydomain.myservice.Categoria;
import br.com.senior.mydomain.myservice.FindAllRecord;
import br.com.senior.mydomain.myservice.ProductEntity;
import br.com.senior.mydomain.myservice.ProductsWithPrice;
import br.com.senior.platform.translationhub.api.TranslationHubApi;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.inject.Inject;
import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
public class ProductService {

    @Inject
    ProductRepository repository;

    @Inject
    TranslationHubApi translationHubApi;



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

    public List<ProductsWithPrice> findAllWithPrice(){
        return repository.findAll().stream().map(p -> new ProductsWithPrice(p.getName(),p.getStock(),p.getPrice())).collect(Collectors.toList());
    }

    public List<ProductEntity> getByCategoria(Categoria categoriaPassada){
        return repository.getByCategoria(categoriaPassada);
    }

    @Transactional
    public ProductEntity findById(UUID id){
        if (repository.findById(id).isEmpty()){
            throw new ServiceException(ErrorCategory.BAD_REQUEST, translationHubApi.getMessage("br.com.senior.my_domain.my_service.id_not_found"));
        }
        return repository.findById(id).get();
    }




}
