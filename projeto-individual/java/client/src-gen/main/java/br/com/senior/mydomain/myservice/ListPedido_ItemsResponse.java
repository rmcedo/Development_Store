/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;	

import br.com.senior.messaging.ErrorPayload;
import br.com.senior.messaging.model.CommandDescription;
import br.com.senior.messaging.model.CommandKind;
import br.com.senior.messaging.model.MessageHandler;

/**
 * Response method for listPedido_Items
 */
@CommandDescription(name="listPedido_ItemsResponse", kind=CommandKind.ResponseCommand, requestPrimitive="listPedido_ItemsResponse")
public interface ListPedido_ItemsResponse extends MessageHandler {

	void listPedido_ItemsResponse(Item.PagedResults response);
	
	void listPedido_ItemsResponseError(ErrorPayload error);

}
