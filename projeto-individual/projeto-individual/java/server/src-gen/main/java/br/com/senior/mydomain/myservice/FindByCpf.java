/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;

import br.com.senior.messaging.model.*;

/**
 * Query destinada para retornar Cliente com CPF igual ao passado como parametro
 */
@CommandDescription(name="findByCpf", kind=CommandKind.Query, requestPrimitive="findByCpf", responsePrimitive="findByCpfResponse")
public interface FindByCpf extends MessageHandler {
    
    public FindByCpfOutput findByCpf(FindByCpfInput request);
    
}
