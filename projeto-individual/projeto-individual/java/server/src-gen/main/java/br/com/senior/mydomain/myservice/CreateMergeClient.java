/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;

import br.com.senior.messaging.model.*;

/**
 * The 'createMerge' request primitive for the Client entity.
 */
@CommandDescription(name="createMergeClient", kind=CommandKind.CreateMerge, requestPrimitive="createMergeClient", responsePrimitive="createMergeClientResponse")
public interface CreateMergeClient extends MessageHandler {
    
    public Client createMergeClient(Client toCreateMerge);
    
}
