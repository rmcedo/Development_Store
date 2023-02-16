/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;

import br.com.senior.messaging.model.*;

/**
 * The 'updateMerge' request primitive for the Product entity.
 */
@CommandDescription(name="updateMergeProduct", kind=CommandKind.UpdateMerge, requestPrimitive="updateMergeProduct", responsePrimitive="updateMergeProductResponse")
public interface UpdateMergeProduct extends MessageHandler {
    
    public Product updateMergeProduct(Product toUpdateMerge);
    
}
