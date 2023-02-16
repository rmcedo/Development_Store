/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;

import br.com.senior.messaging.model.*;

/**
 * The 'delete' request primitive for the Product entity.
 */
@CommandDescription(name="deleteProduct", kind=CommandKind.Delete, requestPrimitive="deleteProduct", responsePrimitive="deleteProductResponse")
public interface DeleteProduct extends MessageHandler {
    
    public void deleteProduct(Product.Id id);
    
}
