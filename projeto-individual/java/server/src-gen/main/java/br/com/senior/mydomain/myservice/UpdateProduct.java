/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;

import br.com.senior.messaging.model.*;

/**
 * The 'update' request primitive for the Product entity.
 */
@CommandDescription(name="updateProduct", kind=CommandKind.Update, requestPrimitive="updateProduct", responsePrimitive="updateProductResponse")
public interface UpdateProduct extends MessageHandler {
    
    public Product updateProduct(Product toUpdate);
    
}
