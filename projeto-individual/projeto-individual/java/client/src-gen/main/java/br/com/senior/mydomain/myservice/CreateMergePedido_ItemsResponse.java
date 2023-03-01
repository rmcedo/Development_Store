/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;	

import br.com.senior.messaging.ErrorPayload;
import br.com.senior.messaging.model.CommandDescription;
import br.com.senior.messaging.model.CommandKind;
import br.com.senior.messaging.model.MessageHandler;

/**
 * Response method for createMergePedido_Items
 */
@CommandDescription(name="createMergePedido_ItemsResponse", kind=CommandKind.ResponseCommand, requestPrimitive="createMergePedido_ItemsResponse")
public interface CreateMergePedido_ItemsResponse extends MessageHandler {

	void createMergePedido_ItemsResponse(Item response);
	
	void createMergePedido_ItemsResponseError(ErrorPayload error);

}
