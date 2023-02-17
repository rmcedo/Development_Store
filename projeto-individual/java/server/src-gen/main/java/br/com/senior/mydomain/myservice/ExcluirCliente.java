/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;

import br.com.senior.messaging.model.*;

@CommandDescription(name="excluirCliente", kind=CommandKind.InboundSignal, requestPrimitive="excluirCliente", responsePrimitive="")
public interface ExcluirCliente extends MessageHandler {
    
    public void excluirCliente(ExcluirClienteInput payload);
    
}
