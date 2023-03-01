/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;

import br.com.senior.messaging.model.*;

/**
 * The 'update' request primitive for the items attribute of pedido entity.\nThis primitive requires the header 'entity_parent_id' with id of parent pedido entity.
 */
@CommandDescription(name="updatePedido_Items", kind=CommandKind.Update, requestPrimitive="updatePedido_Items", responsePrimitive="updatePedido_ItemsResponse")
public interface UpdatePedido_Items extends MessageHandler {
    
    public Item updatePedido_Items(Item toUpdate);
    
}
