/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;

import br.com.senior.messaging.model.*;

/**
 * The 'createMerge' request primitive for the Product entity.
 */
@CommandDescription(name="createMergeProduct", kind=CommandKind.CreateMerge, requestPrimitive="createMergeProduct", responsePrimitive="createMergeProductResponse")
public interface CreateMergeProduct extends MessageHandler {
    
    public Product createMergeProduct(Product toCreateMerge);
    
}
