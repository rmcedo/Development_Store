/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;	

import br.com.senior.messaging.ErrorPayload;
import br.com.senior.messaging.model.CommandDescription;
import br.com.senior.messaging.model.CommandKind;
import br.com.senior.messaging.model.MessageHandler;

/**
 * Response method for createItem
 */
@CommandDescription(name="createItemResponse", kind=CommandKind.ResponseCommand, requestPrimitive="createItemResponse")
public interface CreateItemResponse extends MessageHandler {

	void createItemResponse(Item response);
	
	void createItemResponseError(ErrorPayload error);

}
