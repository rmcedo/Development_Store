/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;	

import br.com.senior.messaging.ErrorPayload;
import br.com.senior.messaging.model.CommandDescription;
import br.com.senior.messaging.model.CommandKind;
import br.com.senior.messaging.model.MessageHandler;

/**
 * Response method for findByFinalValueGreater
 */
@CommandDescription(name="findByFinalValueGreaterResponse", kind=CommandKind.ResponseCommand, requestPrimitive="findByFinalValueGreaterResponse")
public interface FindByFinalValueGreaterResponse extends MessageHandler {

	void findByFinalValueGreaterResponse(FindByFinalValueGreaterOutput response);
	
	void findByFinalValueGreaterResponseError(ErrorPayload error);

}
