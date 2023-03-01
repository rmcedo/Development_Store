/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;	

import br.com.senior.messaging.ErrorPayload;
import br.com.senior.messaging.model.CommandDescription;
import br.com.senior.messaging.model.CommandKind;
import br.com.senior.messaging.model.MessageHandler;

/**
 * Response method for findProductPriceLess
 */
@CommandDescription(name="findProductPriceLessResponse", kind=CommandKind.ResponseCommand, requestPrimitive="findProductPriceLessResponse")
public interface FindProductPriceLessResponse extends MessageHandler {

	void findProductPriceLessResponse(FindProductPriceLessOutput response);
	
	void findProductPriceLessResponseError(ErrorPayload error);

}
