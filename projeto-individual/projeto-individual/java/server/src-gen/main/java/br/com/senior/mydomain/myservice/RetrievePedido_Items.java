/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;

import br.com.senior.messaging.model.*;

/**
 * The 'retrieve' request primitive for the items attribute of pedido entity.\nThis primitive requires the header 'entity_parent_id' with id of parent pedido entity.
 */
@CommandDescription(name="retrievePedido_Items", kind=CommandKind.Retrieve, requestPrimitive="retrievePedido_Items", responsePrimitive="retrievePedido_ItemsResponse")
public interface RetrievePedido_Items extends MessageHandler {
    
    public Item retrievePedido_Items(Item.GetRequest id);
    
}
