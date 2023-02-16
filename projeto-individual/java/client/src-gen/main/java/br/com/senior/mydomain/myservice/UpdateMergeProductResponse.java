/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;	

import br.com.senior.messaging.ErrorPayload;
import br.com.senior.messaging.model.CommandDescription;
import br.com.senior.messaging.model.CommandKind;
import br.com.senior.messaging.model.MessageHandler;

/**
 * Response method for updateMergeProduct
 */
@CommandDescription(name="updateMergeProductResponse", kind=CommandKind.ResponseCommand, requestPrimitive="updateMergeProductResponse")
public interface UpdateMergeProductResponse extends MessageHandler {

	void updateMergeProductResponse(Product response);
	
	void updateMergeProductResponseError(ErrorPayload error);

}
