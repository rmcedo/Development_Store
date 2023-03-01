package br.com.senior.mydomain.myservice.product;

import br.com.senior.messaging.ErrorCategory;
import br.com.senior.messaging.model.ServiceException;
import br.com.senior.mydomain.myservice.Product;
import br.com.senior.mydomain.myservice.ProductCrudServiceImpl;
import br.com.senior.mydomain.myservice.ProductEntity;
import br.com.senior.platform.translationhub.api.TranslationHubApi;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import java.util.Optional;
import java.util.UUID;

@Service
@Primary
class ProductCrudServiceCustomImpl extends ProductCrudServiceImpl {
    @Inject
    ProductRepository productRepository;

    @Inject
    private TranslationHubApi translationHubApi;

    @Override
    public void deleteProduct(Product.Id id) {
        Optional<ProductEntity> product = productRepository.findById(UUID.fromString(id.id));
            if(product != null){
                product.get().setActive(false);
                }else{
                    throw new ServiceException(ErrorCategory.BAD_REQUEST, translationHubApi.getMessage("br.com.senior.my_domain.my_service.id_not_found"));
                }


    }
}
