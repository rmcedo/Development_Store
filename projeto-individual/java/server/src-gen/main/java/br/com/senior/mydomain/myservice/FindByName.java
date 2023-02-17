/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;

import br.com.senior.messaging.model.*;

/**
 * Query destinada para retornar Lista de Clientes com nome contendo parte do parametro name, passado na nossa requisição
 */
@CommandDescription(name="findByName", kind=CommandKind.Query, requestPrimitive="findByName", responsePrimitive="findByNameResponse")
public interface FindByName extends MessageHandler {
    
    public FindByNameOutput findByName(FindByNameInput request);
    
}
