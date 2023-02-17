/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;

import br.com.senior.messaging.model.*;

/**
 * Query destinada para retornar Lista de Produtos com estoque maior que o valor passado no parametro stock
 */
@CommandDescription(name="findProductStockGreater", kind=CommandKind.Query, requestPrimitive="findProductStockGreater", responsePrimitive="findProductStockGreaterResponse")
public interface FindProductStockGreater extends MessageHandler {
    
    public FindProductStockGreaterOutput findProductStockGreater(FindProductStockGreaterInput request);
    
}
