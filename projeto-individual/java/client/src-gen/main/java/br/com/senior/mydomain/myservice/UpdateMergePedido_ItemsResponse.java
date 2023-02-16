/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;	

import br.com.senior.messaging.ErrorPayload;
import br.com.senior.messaging.model.CommandDescription;
import br.com.senior.messaging.model.CommandKind;
import br.com.senior.messaging.model.MessageHandler;

/**
 * Response method for updateMergePedido_Items
 */
@CommandDescription(name="updateMergePedido_ItemsResponse", kind=CommandKind.ResponseCommand, requestPrimitive="updateMergePedido_ItemsResponse")
public interface UpdateMergePedido_ItemsResponse extends MessageHandler {

	void updateMergePedido_ItemsResponse(Item response);
	
	void updateMergePedido_ItemsResponseError(ErrorPayload error);

}
