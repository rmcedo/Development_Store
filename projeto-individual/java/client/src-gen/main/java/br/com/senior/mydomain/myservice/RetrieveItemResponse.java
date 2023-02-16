/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;	

import br.com.senior.messaging.ErrorPayload;
import br.com.senior.messaging.model.CommandDescription;
import br.com.senior.messaging.model.CommandKind;
import br.com.senior.messaging.model.MessageHandler;

/**
 * Response method for retrieveItem
 */
@CommandDescription(name="retrieveItemResponse", kind=CommandKind.ResponseCommand, requestPrimitive="retrieveItemResponse")
public interface RetrieveItemResponse extends MessageHandler {

	void retrieveItemResponse(Item response);
	
	void retrieveItemResponseError(ErrorPayload error);

}
