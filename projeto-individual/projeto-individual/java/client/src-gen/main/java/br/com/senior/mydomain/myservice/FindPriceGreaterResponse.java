/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;	

import br.com.senior.messaging.ErrorPayload;
import br.com.senior.messaging.model.CommandDescription;
import br.com.senior.messaging.model.CommandKind;
import br.com.senior.messaging.model.MessageHandler;

/**
 * Response method for findPriceGreater
 */
@CommandDescription(name="findPriceGreaterResponse", kind=CommandKind.ResponseCommand, requestPrimitive="findPriceGreaterResponse")
public interface FindPriceGreaterResponse extends MessageHandler {

	void findPriceGreaterResponse(FindPriceGreaterOutput response);
	
	void findPriceGreaterResponseError(ErrorPayload error);

}
