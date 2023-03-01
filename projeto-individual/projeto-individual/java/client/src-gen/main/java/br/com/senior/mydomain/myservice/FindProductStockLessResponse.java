/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;	

import br.com.senior.messaging.ErrorPayload;
import br.com.senior.messaging.model.CommandDescription;
import br.com.senior.messaging.model.CommandKind;
import br.com.senior.messaging.model.MessageHandler;

/**
 * Response method for findProductStockLess
 */
@CommandDescription(name="findProductStockLessResponse", kind=CommandKind.ResponseCommand, requestPrimitive="findProductStockLessResponse")
public interface FindProductStockLessResponse extends MessageHandler {

	void findProductStockLessResponse(FindProductStockLessOutput response);
	
	void findProductStockLessResponseError(ErrorPayload error);

}
