/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;	

import br.com.senior.messaging.ErrorPayload;
import br.com.senior.messaging.model.CommandDescription;
import br.com.senior.messaging.model.CommandKind;
import br.com.senior.messaging.model.MessageHandler;

/**
 * Response method for createBulkPedido
 */
@CommandDescription(name="createBulkPedidoResponse", kind=CommandKind.ResponseCommand, requestPrimitive="createBulkPedidoResponse")
public interface CreateBulkPedidoResponse extends MessageHandler {

	void createBulkPedidoResponse(CreateBulkPedidoOutput response);
	
	void createBulkPedidoResponseError(ErrorPayload error);

}
