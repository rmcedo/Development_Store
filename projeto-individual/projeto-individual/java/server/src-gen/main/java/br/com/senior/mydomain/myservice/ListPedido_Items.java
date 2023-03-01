/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;

import br.com.senior.messaging.model.*;

/**
 * The 'list' request primitive for the items attribute of pedido entity.\nThis primitive requires the header 'entity_parent_id' with id of parent pedido entity.
 */
@CommandDescription(name="listPedido_Items", kind=CommandKind.List, requestPrimitive="listPedido_Items", responsePrimitive="listPedido_ItemsResponse")
public interface ListPedido_Items extends MessageHandler {
    
    public Item.PagedResults listPedido_Items(Item.PageRequest pageRequest);
    
}
