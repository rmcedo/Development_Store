/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;

import br.com.senior.messaging.model.*;

/**
 * The 'retrieve' request primitive for the Product entity.
 */
@CommandDescription(name="retrieveProduct", kind=CommandKind.Retrieve, requestPrimitive="retrieveProduct", responsePrimitive="retrieveProductResponse")
public interface RetrieveProduct extends MessageHandler {
    
    public Product retrieveProduct(Product.GetRequest id);
    
}
