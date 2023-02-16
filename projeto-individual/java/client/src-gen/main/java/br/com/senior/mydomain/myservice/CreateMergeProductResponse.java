/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;	

import br.com.senior.messaging.ErrorPayload;
import br.com.senior.messaging.model.CommandDescription;
import br.com.senior.messaging.model.CommandKind;
import br.com.senior.messaging.model.MessageHandler;

/**
 * Response method for createMergeProduct
 */
@CommandDescription(name="createMergeProductResponse", kind=CommandKind.ResponseCommand, requestPrimitive="createMergeProductResponse")
public interface CreateMergeProductResponse extends MessageHandler {

	void createMergeProductResponse(Product response);
	
	void createMergeProductResponseError(ErrorPayload error);

}
