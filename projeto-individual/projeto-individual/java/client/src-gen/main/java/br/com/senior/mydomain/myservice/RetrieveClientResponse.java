/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;	

import br.com.senior.messaging.ErrorPayload;
import br.com.senior.messaging.model.CommandDescription;
import br.com.senior.messaging.model.CommandKind;
import br.com.senior.messaging.model.MessageHandler;

/**
 * Response method for retrieveClient
 */
@CommandDescription(name="retrieveClientResponse", kind=CommandKind.ResponseCommand, requestPrimitive="retrieveClientResponse")
public interface RetrieveClientResponse extends MessageHandler {

	void retrieveClientResponse(Client response);
	
	void retrieveClientResponseError(ErrorPayload error);

}
