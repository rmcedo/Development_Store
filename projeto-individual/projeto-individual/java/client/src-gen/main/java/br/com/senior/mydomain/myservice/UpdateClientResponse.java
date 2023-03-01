/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;	

import br.com.senior.messaging.ErrorPayload;
import br.com.senior.messaging.model.CommandDescription;
import br.com.senior.messaging.model.CommandKind;
import br.com.senior.messaging.model.MessageHandler;

/**
 * Response method for updateClient
 */
@CommandDescription(name="updateClientResponse", kind=CommandKind.ResponseCommand, requestPrimitive="updateClientResponse")
public interface UpdateClientResponse extends MessageHandler {

	void updateClientResponse(Client response);
	
	void updateClientResponseError(ErrorPayload error);

}
