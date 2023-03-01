/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;

import br.com.senior.messaging.model.*;

/**
 * The 'retrieve' request primitive for the Client entity.
 */
@CommandDescription(name="retrieveClient", kind=CommandKind.Retrieve, requestPrimitive="retrieveClient", responsePrimitive="retrieveClientResponse")
public interface RetrieveClient extends MessageHandler {
    
    public Client retrieveClient(Client.GetRequest id);
    
}
