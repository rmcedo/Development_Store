/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;

import br.com.senior.messaging.model.*;

/**
 * The 'createMerge' request primitive for the items attribute of pedido entity.\nThis primitive requires the header 'entity_parent_id' with id of parent pedido entity.
 */
@CommandDescription(name="createMergePedido_Items", kind=CommandKind.CreateMerge, requestPrimitive="createMergePedido_Items", responsePrimitive="createMergePedido_ItemsResponse")
public interface CreateMergePedido_Items extends MessageHandler {
    
    public Item createMergePedido_Items(Item toCreateMerge);
    
}
