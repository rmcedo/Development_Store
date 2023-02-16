/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;	

import br.com.senior.messaging.ErrorPayload;
import br.com.senior.messaging.model.CommandDescription;
import br.com.senior.messaging.model.CommandKind;
import br.com.senior.messaging.model.MessageHandler;

/**
 * Response method for retrieveProduct
 */
@CommandDescription(name="retrieveProductResponse", kind=CommandKind.ResponseCommand, requestPrimitive="retrieveProductResponse")
public interface RetrieveProductResponse extends MessageHandler {

	void retrieveProductResponse(Product response);
	
	void retrieveProductResponseError(ErrorPayload error);

}
