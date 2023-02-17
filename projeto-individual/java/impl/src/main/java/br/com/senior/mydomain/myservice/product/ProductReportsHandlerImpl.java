package br.com.senior.mydomain.myservice.product;

import br.com.senior.messaging.ErrorCategory;
import br.com.senior.messaging.model.HandlerImpl;
import br.com.senior.messaging.model.ServiceException;
import br.com.senior.mydomain.myservice.*;

import javax.inject.Inject;
import java.util.List;
import java.util.stream.Collectors;

@HandlerImpl
public class ProductReportsHandlerImpl implements FindPriceGreater, FindProductByName, FindProductPriceLess, FindProductStockGreater, FindProductStockLess {

    @Inject
    ProductService service;

    @Override
    public FindPriceGreaterOutput findPriceGreater(FindPriceGreaterInput request) {
        final List<ProductEntity> products = service.findProductWithPriceGreaterThan(request.value);

        final List<Product> productDTO = products
                .stream()
                .map(p -> new Product(p.getId().toString(),p.getName(),p.getDescription(),p.getPrice(),p.getStock(),p.getActive(),null))
                .collect(Collectors.toList());
        if (productDTO.isEmpty()){
            throw new ServiceException(ErrorCategory.BAD_REQUEST, "None of the Products in the stock have greater value than the request");
        }

        return new FindPriceGreaterOutput(productDTO);

    }

    @Override
    public FindProductByNameOutput findProductByName(FindProductByNameInput request) {
        final List<ProductEntity> products = service.findByNameContainingIgnoreCase(request.name);

        final List<Product> productDTO = products
                .stream()
                .map(p -> new Product(p.getId().toString(),p.getName(),p.getDescription(),p.getPrice(),p.getStock(),p.getActive(),null))
                .collect(Collectors.toList());
        if (productDTO.isEmpty()){
            throw new ServiceException(ErrorCategory.BAD_REQUEST, "None of the products have a name that contain the request parameter");
        }
        return new FindProductByNameOutput(productDTO);
    }

    @Override
    public FindProductPriceLessOutput findProductPriceLess(FindProductPriceLessInput request) {
        final List<ProductEntity> products = service.findByPriceLessThan(request.price);

        final List<Product> productDTO = products
                .stream()
                .map(p -> new Product(p.getId().toString(),p.getName(),p.getDescription(),p.getPrice(),p.getStock(),p.getActive(),null))
                .collect(Collectors.toList());
        if (productDTO.isEmpty()){
            throw new ServiceException(ErrorCategory.BAD_REQUEST, "All the products have greater price than the parameter request");
        }

        return new FindProductPriceLessOutput(productDTO);
    }

    @Override
    public FindProductStockGreaterOutput findProductStockGreater(FindProductStockGreaterInput request) {
        final List<ProductEntity> products = service.findByStockGreaterThan(request.stock);

        final List<Product> productDTO = products
                .stream()
                .map(p -> new Product(p.getId().toString(),p.getName(),p.getDescription(),p.getPrice(),p.getStock(),p.getActive(),null))
                .collect(Collectors.toList());

        if (productDTO.isEmpty()){
            throw new ServiceException(ErrorCategory.BAD_REQUEST, "None of the products have a greater stock than the parameter requested");
        }

        return new FindProductStockGreaterOutput(productDTO);
    }

    @Override
    public FindProductStockLessOutput findProductStockLess(FindProductStockLessInput request) {
        final List<ProductEntity> products = service.findByStockLessThan(request.stock);

        final List<Product> productDTO = products
                .stream()
                .map(p -> new Product(p.getId().toString(),p.getName(),p.getDescription(),p.getPrice(),p.getStock(),p.getActive(),null))
                .collect(Collectors.toList());
        if (productDTO.isEmpty()){
            throw new ServiceException(ErrorCategory.BAD_REQUEST, "All the products have a greater stock than the paremeter requested");
        }

        return new FindProductStockLessOutput(productDTO);
    }
}
