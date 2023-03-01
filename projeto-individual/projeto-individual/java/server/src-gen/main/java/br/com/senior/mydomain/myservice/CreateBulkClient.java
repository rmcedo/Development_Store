/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;

import br.com.senior.messaging.model.*;

@CommandDescription(name = "createBulkClient", kind = CommandKind.Create, requestPrimitive = "createBulkClient", responsePrimitive="")
public interface CreateBulkClient extends MessageHandler {
    public CreateBulkClientOutput createBulkClient(CreateBulkClientInput toCreate);
}
