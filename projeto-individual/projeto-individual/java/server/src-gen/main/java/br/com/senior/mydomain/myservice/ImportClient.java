/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;

import br.com.senior.messaging.model.*;

@CommandDescription(name="importClient", kind=CommandKind.Action, requestPrimitive="importClient", responsePrimitive="importClientResponse")
public interface ImportClient extends MessageHandler {
    
    public ImportClientOutput importClient(ImportClientInput request);
    
}
