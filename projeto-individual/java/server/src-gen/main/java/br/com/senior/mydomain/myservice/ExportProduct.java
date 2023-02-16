/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;

import br.com.senior.messaging.model.*;

@CommandDescription(name="exportProduct", kind=CommandKind.Query, requestPrimitive="exportProduct", responsePrimitive="exportProductResponse")
public interface ExportProduct extends MessageHandler {
    
    public ExportProductOutput exportProduct(ExportProductInput request);
    
}
