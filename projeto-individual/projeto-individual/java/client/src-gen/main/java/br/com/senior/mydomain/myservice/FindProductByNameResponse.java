/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;	

import br.com.senior.messaging.ErrorPayload;
import br.com.senior.messaging.model.CommandDescription;
import br.com.senior.messaging.model.CommandKind;
import br.com.senior.messaging.model.MessageHandler;

/**
 * Response method for findProductByName
 */
@CommandDescription(name="findProductByNameResponse", kind=CommandKind.ResponseCommand, requestPrimitive="findProductByNameResponse")
public interface FindProductByNameResponse extends MessageHandler {

	void findProductByNameResponse(FindProductByNameOutput response);
	
	void findProductByNameResponseError(ErrorPayload error);

}
