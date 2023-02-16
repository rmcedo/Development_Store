/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;

import br.com.senior.messaging.model.*;

/**
 * The 'delete' request primitive for the items attribute of pedido entity.\nThis primitive requires the header 'entity_parent_id' with id of parent pedido entity.
 */
@CommandDescription(name="deletePedido_Items", kind=CommandKind.Delete, requestPrimitive="deletePedido_Items", responsePrimitive="deletePedido_ItemsResponse")
public interface DeletePedido_Items extends MessageHandler {
    
    public void deletePedido_Items(Item.Id id);
    
}
