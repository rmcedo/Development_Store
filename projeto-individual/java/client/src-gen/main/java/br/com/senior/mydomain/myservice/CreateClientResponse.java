/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;	

import br.com.senior.messaging.ErrorPayload;
import br.com.senior.messaging.model.CommandDescription;
import br.com.senior.messaging.model.CommandKind;
import br.com.senior.messaging.model.MessageHandler;

/**
 * Response method for createClient
 */
@CommandDescription(name="createClientResponse", kind=CommandKind.ResponseCommand, requestPrimitive="createClientResponse")
public interface CreateClientResponse extends MessageHandler {

	void createClientResponse(Client response);
	
	void createClientResponseError(ErrorPayload error);

}
