/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;

import br.com.senior.messaging.model.*;

/**
 * The 'updateMerge' request primitive for the Client entity.
 */
@CommandDescription(name="updateMergeClient", kind=CommandKind.UpdateMerge, requestPrimitive="updateMergeClient", responsePrimitive="updateMergeClientResponse")
public interface UpdateMergeClient extends MessageHandler {
    
    public Client updateMergeClient(Client toUpdateMerge);
    
}
