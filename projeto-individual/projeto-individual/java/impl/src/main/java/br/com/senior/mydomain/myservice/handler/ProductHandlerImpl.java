package br.com.senior.mydomain.myservice.handler;

import br.com.senior.EventPublisher;
import br.com.senior.SecurityConstants;
import br.com.senior.messaging.ErrorCategory;
import br.com.senior.messaging.model.HandlerImpl;
import br.com.senior.messaging.model.ServiceException;
import br.com.senior.messaging.security.SecureResource;
import br.com.senior.mydomain.myservice.*;
import br.com.senior.mydomain.myservice.product.ProductConverter;
import br.com.senior.mydomain.myservice.product.ProductService;
import br.com.senior.platform.translationhub.api.TranslationHubApi;
import org.springframework.transaction.annotation.Transactional;

import javax.inject.Inject;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@HandlerImpl
public class ProductHandlerImpl implements FindPriceGreater, FindProductByName,
        FindProductPriceLess, FindProductStockGreater, FindProductStockLess, FindAllRecord, FindByCategoriaDSL, AtivarProduct, ProductActivated, StockProduct {

    @Inject
    private ProductService service;

    @Inject
    private TranslationHubApi translationHubApi;

    @Inject
    private ProductConverter converter;

    @Override
    @SecureResource(name=ProductEntity.SECURITY_RESOURCE, action = SecurityConstants.ENTITY_SECURITY_ACTION_VIEW)
    public FindPriceGreaterOutput findPriceGreater(FindPriceGreaterInput request) {
        final List<ProductEntity> products = service.findProductWithPriceGreaterThan(request.value);

        final List<Product> productDTO = products
                .stream()
                .map(p -> converter.toDto(p))
                .collect(Collectors.toList());
        if (productDTO.isEmpty()){
            throw new ServiceException(ErrorCategory.BAD_REQUEST, translationHubApi.getMessage("br.com.senior.my_domain.my_service.product_greater_value"));
        }

        return new FindPriceGreaterOutput(productDTO);

    }

    @Override
    @SecureResource(name=ProductEntity.SECURITY_RESOURCE, action = SecurityConstants.ENTITY_SECURITY_ACTION_VIEW)
    public FindProductByNameOutput findProductByName(FindProductByNameInput request) {
        final List<ProductEntity> products = service.findByNameContainingIgnoreCase(request.name);

        final List<Product> productDTO = products
                .stream()
                .map(p -> converter.toDto(p))
                .collect(Collectors.toList());
        if (productDTO.isEmpty()){
            throw new ServiceException(ErrorCategory.BAD_REQUEST, translationHubApi.getMessage("br.com.senior.my_domain.my_service.product_product_name"));
        }
        return new FindProductByNameOutput(productDTO);
    }

    @Override
    @SecureResource(name=ProductEntity.SECURITY_RESOURCE, action = SecurityConstants.ENTITY_SECURITY_ACTION_VIEW)
    public FindProductPriceLessOutput findProductPriceLess(FindProductPriceLessInput request) {
        final List<ProductEntity> products = service.findByPriceLessThan(request.price);

        final List<Product> productDTO = products
                .stream()
                .map(p -> converter.toDto(p))
                .collect(Collectors.toList());
        if (productDTO.isEmpty()){
            throw new ServiceException(ErrorCategory.BAD_REQUEST, translationHubApi.getMessage("br.com.senior.my_domain.my_service.product_less_value"));
        }

        return new FindProductPriceLessOutput(productDTO);
    }

    @Override
    @SecureResource(name=ProductEntity.SECURITY_RESOURCE, action = SecurityConstants.ENTITY_SECURITY_ACTION_VIEW)
    public FindProductStockGreaterOutput findProductStockGreater(FindProductStockGreaterInput request) {
        final List<ProductEntity> products = service.findByStockGreaterThan(request.stock);

        final List<Product> productDTO = products
                .stream()
                .map(p -> converter.toDto(p))
                .collect(Collectors.toList());

        if (productDTO.isEmpty()){
            throw new ServiceException(ErrorCategory.BAD_REQUEST, translationHubApi.getMessage("br.com.senior.my_domain.my_service.product_greater_stock"));
        }

        return new FindProductStockGreaterOutput(productDTO);
    }

    @Override
    @SecureResource(name=ProductEntity.SECURITY_RESOURCE, action = SecurityConstants.ENTITY_SECURITY_ACTION_VIEW)
    public FindProductStockLessOutput findProductStockLess(FindProductStockLessInput request) {
        final List<ProductEntity> products = service.findByStockLessThan(request.stock);

        final List<Product> productDTO = products
                .stream()
                .map(p -> converter.toDto(p))
                .collect(Collectors.toList());
        if (productDTO.isEmpty()){
            throw new ServiceException(ErrorCategory.BAD_REQUEST, translationHubApi.getMessage("br.com.senior.my_domain.my_service.product_less_stock"));
        }

        return new FindProductStockLessOutput(productDTO);
    }

    @Override
    @SecureResource(name=ProductEntity.SECURITY_RESOURCE, action = SecurityConstants.ENTITY_SECURITY_ACTION_VIEW)
    public FindAllRecordOutput findAllRecord() {

        return new FindAllRecordOutput(service.findAllWithPrice());

    }


    @Override
    @SecureResource(name=ProductEntity.SECURITY_RESOURCE, action = SecurityConstants.ENTITY_SECURITY_ACTION_VIEW)
    public FindByCategoriaDSLOutput findByCategoriaDSL(FindByCategoriaDSLInput request) {
        final List<ProductEntity> products = service.getByCategoria(request.categoria);

        final List<Product> productDTO = products
                .stream()
                .map(p -> converter.toDto(p))
                .collect(Collectors.toList());

        if (productDTO.isEmpty()){
            throw new ServiceException(ErrorCategory.BAD_REQUEST, translationHubApi.getMessage("br.com.senior.my_domain.my_service.product_with_category_not_found"));
        }
        return new FindByCategoriaDSLOutput(productDTO);
    }


    @Override
    @Transactional
    @SecureResource(name=ClientEntity.SECURITY_RESOURCE, action = SecurityConstants.ENTITY_SECURITY_ACTION_UPDATE)
    @SecureResource(name=ClientEntity.SECURITY_RESOURCE, action = SecurityConstants.ENTITY_SECURITY_ACTION_DELETE)
    public void ativarProduct(AtivarProductInput payload) {

        service.findById(UUID.fromString(payload.id.toString())).setActive(true);

        ProductActivatedPayload payloadEvent = new ProductActivatedPayload();
        payloadEvent.id = service.findById(UUID.fromString(payload.id)).toString();
        EventPublisher.publish(MyServiceConstants.Events.PRODUCT_ACTIVATED, payloadEvent);

    }

    //EVENT
    @Override
    public void productActivated(ProductActivatedPayload payload) {
        System.out.println("PRODUTO ESTÁ ATIVO " + payload.id);
    }

    @Override
    public void stockProduct(StockProductPayload payload) {
        System.out.println("Estoque do produto, está zerado, por favor, repor. PRODUTO: "+payload.id);
    }
}
