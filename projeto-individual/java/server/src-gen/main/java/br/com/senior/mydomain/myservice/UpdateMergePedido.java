/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;

import br.com.senior.messaging.model.*;

/**
 * The 'updateMerge' request primitive for the Pedido entity.
 */
@CommandDescription(name="updateMergePedido", kind=CommandKind.UpdateMerge, requestPrimitive="updateMergePedido", responsePrimitive="updateMergePedidoResponse")
public interface UpdateMergePedido extends MessageHandler {
    
    public Pedido updateMergePedido(Pedido toUpdateMerge);
    
}
