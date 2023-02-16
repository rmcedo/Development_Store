package br.com.senior.mydomain.myservice.product;

import br.com.senior.messaging.model.HandlerImpl;
import br.com.senior.mydomain.myservice.*;

import javax.inject.Inject;
import java.util.List;
import java.util.stream.Collectors;

@HandlerImpl
public class ProductReportsHandlerImpl implements FindPriceGreater {

    @Inject
    ProductService service;

    @Override
    public FindPriceGreaterOutput findPriceGreater(FindPriceGreaterInput request) {
        final List<ProductEntity> products = service.findProductWithPriceGreaterThen(request.value);

        final List<Product> productDTO = products
                .stream()
                .map(p -> new Product(p.getId().toString(),p.getName(),p.getDescription(),p.getPrice(),p.getStock(),p.getActive(),null))
                .collect(Collectors.toList());

        return new FindPriceGreaterOutput(productDTO);

    }
}
