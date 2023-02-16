/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;	

import br.com.senior.messaging.ErrorPayload;
import br.com.senior.messaging.model.CommandDescription;
import br.com.senior.messaging.model.CommandKind;
import br.com.senior.messaging.model.MessageHandler;

/**
 * Response method for findByName
 */
@CommandDescription(name="findByNameResponse", kind=CommandKind.ResponseCommand, requestPrimitive="findByNameResponse")
public interface FindByNameResponse extends MessageHandler {

	void findByNameResponse(FindByNameOutput response);
	
	void findByNameResponseError(ErrorPayload error);

}
