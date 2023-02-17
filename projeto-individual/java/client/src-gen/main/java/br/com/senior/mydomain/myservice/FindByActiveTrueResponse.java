/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;	

import br.com.senior.messaging.ErrorPayload;
import br.com.senior.messaging.model.CommandDescription;
import br.com.senior.messaging.model.CommandKind;
import br.com.senior.messaging.model.MessageHandler;

/**
 * Response method for findByActiveTrue
 */
@CommandDescription(name="findByActiveTrueResponse", kind=CommandKind.ResponseCommand, requestPrimitive="findByActiveTrueResponse")
public interface FindByActiveTrueResponse extends MessageHandler {

	void findByActiveTrueResponse(FindByActiveTrueOutput response);
	
	void findByActiveTrueResponseError(ErrorPayload error);

}
