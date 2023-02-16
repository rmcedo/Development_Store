/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;	

import br.com.senior.messaging.ErrorPayload;
import br.com.senior.messaging.model.CommandDescription;
import br.com.senior.messaging.model.CommandKind;
import br.com.senior.messaging.model.MessageHandler;

/**
 * Response method for createPedido_Items
 */
@CommandDescription(name="createPedido_ItemsResponse", kind=CommandKind.ResponseCommand, requestPrimitive="createPedido_ItemsResponse")
public interface CreatePedido_ItemsResponse extends MessageHandler {

	void createPedido_ItemsResponse(Item response);
	
	void createPedido_ItemsResponseError(ErrorPayload error);

}
