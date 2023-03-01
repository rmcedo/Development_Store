/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;

import br.com.senior.messaging.model.*;

@CommandDescription(name="importProduct", kind=CommandKind.Action, requestPrimitive="importProduct", responsePrimitive="importProductResponse")
public interface ImportProduct extends MessageHandler {
    
    public ImportProductOutput importProduct(ImportProductInput request);
    
}
