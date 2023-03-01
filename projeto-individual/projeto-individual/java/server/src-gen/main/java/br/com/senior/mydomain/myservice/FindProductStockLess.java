/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;

import br.com.senior.messaging.model.*;

/**
 * Query destinada para retornar Lista de Produtos com estoque menor que o valor passado no parametro stock
 */
@CommandDescription(name="findProductStockLess", kind=CommandKind.Query, requestPrimitive="findProductStockLess", responsePrimitive="findProductStockLessResponse")
public interface FindProductStockLess extends MessageHandler {
    
    public FindProductStockLessOutput findProductStockLess(FindProductStockLessInput request);
    
}
