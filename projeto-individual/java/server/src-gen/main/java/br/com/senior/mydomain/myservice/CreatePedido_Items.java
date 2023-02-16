/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;

import br.com.senior.messaging.model.*;

/**
 * The 'create' request primitive for the items attribute of pedido entity.\nThis primitive requires the header 'entity_parent_id' with id of parent pedido entity.
 */
@CommandDescription(name="createPedido_Items", kind=CommandKind.Create, requestPrimitive="createPedido_Items", responsePrimitive="createPedido_ItemsResponse")
public interface CreatePedido_Items extends MessageHandler {
    
    public Item createPedido_Items(Item toCreate);
    
}
