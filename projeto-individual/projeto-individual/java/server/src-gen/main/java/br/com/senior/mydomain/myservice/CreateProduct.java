/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;

import br.com.senior.messaging.model.*;

/**
 * The 'create' request primitive for the Product entity.
 */
@CommandDescription(name="createProduct", kind=CommandKind.Create, requestPrimitive="createProduct", responsePrimitive="createProductResponse")
public interface CreateProduct extends MessageHandler {
    
    public Product createProduct(Product toCreate);
    
}
