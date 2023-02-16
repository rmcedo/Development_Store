/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;	

import br.com.senior.messaging.ErrorPayload;
import br.com.senior.messaging.model.CommandDescription;
import br.com.senior.messaging.model.CommandKind;
import br.com.senior.messaging.model.MessageHandler;

/**
 * Response method for listClient
 */
@CommandDescription(name="listClientResponse", kind=CommandKind.ResponseCommand, requestPrimitive="listClientResponse")
public interface ListClientResponse extends MessageHandler {

	void listClientResponse(Client.PagedResults response);
	
	void listClientResponseError(ErrorPayload error);

}
