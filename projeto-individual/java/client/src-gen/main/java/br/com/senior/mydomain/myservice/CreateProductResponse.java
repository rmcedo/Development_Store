/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;	

import br.com.senior.messaging.ErrorPayload;
import br.com.senior.messaging.model.CommandDescription;
import br.com.senior.messaging.model.CommandKind;
import br.com.senior.messaging.model.MessageHandler;

/**
 * Response method for createProduct
 */
@CommandDescription(name="createProductResponse", kind=CommandKind.ResponseCommand, requestPrimitive="createProductResponse")
public interface CreateProductResponse extends MessageHandler {

	void createProductResponse(Product response);
	
	void createProductResponseError(ErrorPayload error);

}
