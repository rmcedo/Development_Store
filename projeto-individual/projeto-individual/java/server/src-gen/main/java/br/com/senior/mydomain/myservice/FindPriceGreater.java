/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;

import br.com.senior.messaging.model.*;

/**
 * Query destinada para retornar Lista de Produtos com preço com maior valor do que o passado no parametro value
 */
@CommandDescription(name="findPriceGreater", kind=CommandKind.Query, requestPrimitive="findPriceGreater", responsePrimitive="findPriceGreaterResponse")
public interface FindPriceGreater extends MessageHandler {
    
    public FindPriceGreaterOutput findPriceGreater(FindPriceGreaterInput request);
    
}
