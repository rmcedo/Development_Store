/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;

import br.com.senior.messaging.model.*;

/**
 * Query destinada para retornar Lista de Pedidos com data de criação entre as duas datas passadas nos parametros date1 e date2
 */
@CommandDescription(name="findDateBetween", kind=CommandKind.Query, requestPrimitive="findDateBetween", responsePrimitive="findDateBetweenResponse")
public interface FindDateBetween extends MessageHandler {
    
    public FindDateBetweenOutput findDateBetween(FindDateBetweenInput request);
    
}
