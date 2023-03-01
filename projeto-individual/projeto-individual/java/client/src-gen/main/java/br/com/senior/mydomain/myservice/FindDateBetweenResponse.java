/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;	

import br.com.senior.messaging.ErrorPayload;
import br.com.senior.messaging.model.CommandDescription;
import br.com.senior.messaging.model.CommandKind;
import br.com.senior.messaging.model.MessageHandler;

/**
 * Response method for findDateBetween
 */
@CommandDescription(name="findDateBetweenResponse", kind=CommandKind.ResponseCommand, requestPrimitive="findDateBetweenResponse")
public interface FindDateBetweenResponse extends MessageHandler {

	void findDateBetweenResponse(FindDateBetweenOutput response);
	
	void findDateBetweenResponseError(ErrorPayload error);

}
