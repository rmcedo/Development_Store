/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;

import br.com.senior.messaging.model.*;

/**
 * The 'updateMerge' request primitive for the items attribute of pedido entity.\nThis primitive requires the header 'entity_parent_id' with id of parent pedido entity.
 */
@CommandDescription(name="updateMergePedido_Items", kind=CommandKind.UpdateMerge, requestPrimitive="updateMergePedido_Items", responsePrimitive="updateMergePedido_ItemsResponse")
public interface UpdateMergePedido_Items extends MessageHandler {
    
    public Item updateMergePedido_Items(Item toUpdateMerge);
    
}
