/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;	

import br.com.senior.messaging.ErrorPayload;
import br.com.senior.messaging.model.CommandDescription;
import br.com.senior.messaging.model.CommandKind;
import br.com.senior.messaging.model.MessageHandler;

/**
 * Response method for importClient
 */
@CommandDescription(name="importClientResponse", kind=CommandKind.ResponseCommand, requestPrimitive="importClientResponse")
public interface ImportClientResponse extends MessageHandler {

	void importClientResponse(ImportClientOutput response);
	
	void importClientResponseError(ErrorPayload error);

}
