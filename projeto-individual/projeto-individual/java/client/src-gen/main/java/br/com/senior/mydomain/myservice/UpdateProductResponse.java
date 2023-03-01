/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;	

import br.com.senior.messaging.ErrorPayload;
import br.com.senior.messaging.model.CommandDescription;
import br.com.senior.messaging.model.CommandKind;
import br.com.senior.messaging.model.MessageHandler;

/**
 * Response method for updateProduct
 */
@CommandDescription(name="updateProductResponse", kind=CommandKind.ResponseCommand, requestPrimitive="updateProductResponse")
public interface UpdateProductResponse extends MessageHandler {

	void updateProductResponse(Product response);
	
	void updateProductResponseError(ErrorPayload error);

}
