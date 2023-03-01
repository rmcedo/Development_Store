/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;	

import br.com.senior.messaging.ErrorPayload;
import br.com.senior.messaging.model.CommandDescription;
import br.com.senior.messaging.model.CommandKind;
import br.com.senior.messaging.model.MessageHandler;

/**
 * Response method for updatePedido_Items
 */
@CommandDescription(name="updatePedido_ItemsResponse", kind=CommandKind.ResponseCommand, requestPrimitive="updatePedido_ItemsResponse")
public interface UpdatePedido_ItemsResponse extends MessageHandler {

	void updatePedido_ItemsResponse(Item response);
	
	void updatePedido_ItemsResponseError(ErrorPayload error);

}
