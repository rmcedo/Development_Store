/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;

import br.com.senior.messaging.model.*;

/**
 * The 'delete' request primitive for the Client entity.
 */
@CommandDescription(name="deleteClient", kind=CommandKind.Delete, requestPrimitive="deleteClient", responsePrimitive="deleteClientResponse")
public interface DeleteClient extends MessageHandler {
    
    public void deleteClient(Client.Id id);
    
}
