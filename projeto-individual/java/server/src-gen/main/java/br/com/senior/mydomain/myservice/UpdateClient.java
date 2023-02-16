/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;

import br.com.senior.messaging.model.*;

/**
 * The 'update' request primitive for the Client entity.
 */
@CommandDescription(name="updateClient", kind=CommandKind.Update, requestPrimitive="updateClient", responsePrimitive="updateClientResponse")
public interface UpdateClient extends MessageHandler {
    
    public Client updateClient(Client toUpdate);
    
}
