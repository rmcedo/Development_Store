package br.com.senior.mydomain.myservice.repository;

import br.com.senior.mydomain.myservice.ProductBaseRepository;
import br.com.senior.mydomain.myservice.ProductEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;

@Repository
public interface ProductRepository extends ProductBaseRepository {

    //NÃO ESTOU UTILIZANDO O QUERY METHOD APENAS PARA NÍVEL DE DEMONSTRAÇÃO, PARA UTILIZAR DIFERENTES ABORDAGENS DENTRO DO PROJETO
    @Query("SELECT p FROM my_domain.my_service.ProductEntity p WHERE p.price > :value")
    List<ProductEntity> findProductWithPriceGreaterThen(@Param("value") BigDecimal value);
}
