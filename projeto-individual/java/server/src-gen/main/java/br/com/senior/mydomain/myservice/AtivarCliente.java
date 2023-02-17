/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;

import br.com.senior.messaging.model.*;

@CommandDescription(name="ativarCliente", kind=CommandKind.InboundSignal, requestPrimitive="ativarCliente", responsePrimitive="")
public interface AtivarCliente extends MessageHandler {
    
    public void ativarCliente(AtivarClienteInput payload);
    
}
