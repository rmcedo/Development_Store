/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;

import br.com.senior.messaging.model.*;

/**
 * The 'list' request primitive for the Client entity.
 */
@CommandDescription(name="listClient", kind=CommandKind.List, requestPrimitive="listClient", responsePrimitive="listClientResponse")
public interface ListClient extends MessageHandler {
    
    public Client.PagedResults listClient(Client.PageRequest pageRequest);
    
}
