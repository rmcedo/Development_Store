/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;

import br.com.senior.messaging.model.*;

/**
 * The 'create' request primitive for the Client entity.
 */
@CommandDescription(name="createClient", kind=CommandKind.Create, requestPrimitive="createClient", responsePrimitive="createClientResponse")
public interface CreateClient extends MessageHandler {
    
    public Client createClient(Client toCreate);
    
}
