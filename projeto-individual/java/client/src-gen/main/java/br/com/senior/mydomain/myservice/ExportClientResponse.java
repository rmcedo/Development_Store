/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;	

import br.com.senior.messaging.ErrorPayload;
import br.com.senior.messaging.model.CommandDescription;
import br.com.senior.messaging.model.CommandKind;
import br.com.senior.messaging.model.MessageHandler;

/**
 * Response method for exportClient
 */
@CommandDescription(name="exportClientResponse", kind=CommandKind.ResponseCommand, requestPrimitive="exportClientResponse")
public interface ExportClientResponse extends MessageHandler {

	void exportClientResponse(ExportClientOutput response);
	
	void exportClientResponseError(ErrorPayload error);

}
