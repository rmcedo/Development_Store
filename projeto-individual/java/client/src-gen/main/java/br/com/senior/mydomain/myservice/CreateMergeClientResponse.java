/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;	

import br.com.senior.messaging.ErrorPayload;
import br.com.senior.messaging.model.CommandDescription;
import br.com.senior.messaging.model.CommandKind;
import br.com.senior.messaging.model.MessageHandler;

/**
 * Response method for createMergeClient
 */
@CommandDescription(name="createMergeClientResponse", kind=CommandKind.ResponseCommand, requestPrimitive="createMergeClientResponse")
public interface CreateMergeClientResponse extends MessageHandler {

	void createMergeClientResponse(Client response);
	
	void createMergeClientResponseError(ErrorPayload error);

}
