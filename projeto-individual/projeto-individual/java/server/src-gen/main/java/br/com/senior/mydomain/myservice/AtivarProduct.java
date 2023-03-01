/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;

import br.com.senior.messaging.model.*;

/**
 * Primitava para ativar Produto
 */
@CommandDescription(name="ativarProduct", kind=CommandKind.InboundSignal, requestPrimitive="ativarProduct", responsePrimitive="")
public interface AtivarProduct extends MessageHandler {
    
    public void ativarProduct(AtivarProductInput payload);
    
}
