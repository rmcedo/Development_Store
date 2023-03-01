/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;

import br.com.senior.messaging.model.*;

@CommandDescription(name = "createBulkProduct", kind = CommandKind.Create, requestPrimitive = "createBulkProduct", responsePrimitive="")
public interface CreateBulkProduct extends MessageHandler {
    public CreateBulkProductOutput createBulkProduct(CreateBulkProductInput toCreate);
}
