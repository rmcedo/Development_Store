/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;

import br.com.senior.messaging.model.*;

/**
 * Query destinada para encontrar Clientes que estão ativos ou não dentro do sistema
 */
@CommandDescription(name="findByActiveTrue", kind=CommandKind.Query, requestPrimitive="findByActiveTrue", responsePrimitive="findByActiveTrueResponse")
public interface FindByActiveTrue extends MessageHandler {
    
    public FindByActiveTrueOutput findByActiveTrue(FindByActiveTrueInput request);
    
}
