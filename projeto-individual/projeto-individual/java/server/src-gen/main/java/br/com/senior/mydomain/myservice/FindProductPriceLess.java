/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;

import br.com.senior.messaging.model.*;

/**
 * Query destinada para retornar Lista de Produtos com preço menor que o valor passado no parametro price
 */
@CommandDescription(name="findProductPriceLess", kind=CommandKind.Query, requestPrimitive="findProductPriceLess", responsePrimitive="findProductPriceLessResponse")
public interface FindProductPriceLess extends MessageHandler {
    
    public FindProductPriceLessOutput findProductPriceLess(FindProductPriceLessInput request);
    
}
