/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;	

import br.com.senior.messaging.ErrorPayload;
import br.com.senior.messaging.model.CommandDescription;
import br.com.senior.messaging.model.CommandKind;
import br.com.senior.messaging.model.MessageHandler;

/**
 * Response method for createPedido
 */
@CommandDescription(name="createPedidoResponse", kind=CommandKind.ResponseCommand, requestPrimitive="createPedidoResponse")
public interface CreatePedidoResponse extends MessageHandler {

	void createPedidoResponse(Pedido response);
	
	void createPedidoResponseError(ErrorPayload error);

}
