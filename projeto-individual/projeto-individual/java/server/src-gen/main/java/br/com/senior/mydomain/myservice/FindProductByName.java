/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;

import br.com.senior.messaging.model.*;

/**
 * Query destinada para retornar Lista de Produtos com nome igual ou semelhante ao valor passado no parametro nome
 */
@CommandDescription(name="findProductByName", kind=CommandKind.Query, requestPrimitive="findProductByName", responsePrimitive="findProductByNameResponse")
public interface FindProductByName extends MessageHandler {
    
    public FindProductByNameOutput findProductByName(FindProductByNameInput request);
    
}
