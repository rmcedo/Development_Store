/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;	

import br.com.senior.messaging.ErrorPayload;
import br.com.senior.messaging.model.CommandDescription;
import br.com.senior.messaging.model.CommandKind;
import br.com.senior.messaging.model.MessageHandler;

/**
 * Response method for retrievePedido_Items
 */
@CommandDescription(name="retrievePedido_ItemsResponse", kind=CommandKind.ResponseCommand, requestPrimitive="retrievePedido_ItemsResponse")
public interface RetrievePedido_ItemsResponse extends MessageHandler {

	void retrievePedido_ItemsResponse(Item response);
	
	void retrievePedido_ItemsResponseError(ErrorPayload error);

}
