/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;	

import br.com.senior.messaging.ErrorPayload;
import br.com.senior.messaging.model.CommandDescription;
import br.com.senior.messaging.model.CommandKind;
import br.com.senior.messaging.model.MessageHandler;

/**
 * Response method for findProductStockGreater
 */
@CommandDescription(name="findProductStockGreaterResponse", kind=CommandKind.ResponseCommand, requestPrimitive="findProductStockGreaterResponse")
public interface FindProductStockGreaterResponse extends MessageHandler {

	void findProductStockGreaterResponse(FindProductStockGreaterOutput response);
	
	void findProductStockGreaterResponseError(ErrorPayload error);

}
