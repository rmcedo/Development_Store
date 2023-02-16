/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;

import br.com.senior.messaging.model.*;

/**
 * The 'list' request primitive for the Product entity.
 */
@CommandDescription(name="listProduct", kind=CommandKind.List, requestPrimitive="listProduct", responsePrimitive="listProductResponse")
public interface ListProduct extends MessageHandler {
    
    public Product.PagedResults listProduct(Product.PageRequest pageRequest);
    
}
