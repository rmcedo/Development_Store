/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;

import br.com.senior.messaging.model.*;

@CommandDescription(name="exportClient", kind=CommandKind.Query, requestPrimitive="exportClient", responsePrimitive="exportClientResponse")
public interface ExportClient extends MessageHandler {
    
    public ExportClientOutput exportClient(ExportClientInput request);
    
}
