package br.com.senior.mydomain.myservice.product;

import br.com.senior.mydomain.myservice.ProductBaseRepository;
import br.com.senior.mydomain.myservice.ProductEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;

@Repository
interface ProductRepository extends ProductBaseRepository, ProductRepositoryCustom {


    @Query("SELECT p FROM my_domain.my_service.ProductEntity p WHERE p.price > :value")
    List<ProductEntity> findProductWithPriceGreaterThen(@Param("value") BigDecimal value);

    List<ProductEntity> findByNameContainingIgnoreCase(String name);
    List<ProductEntity> findByPriceLessThan(BigDecimal price);

    List<ProductEntity> findByStockLessThan(Long stock);

    List<ProductEntity> findByStockGreaterThan(Long stock);
}
