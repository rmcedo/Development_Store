/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;	

import br.com.senior.messaging.ErrorPayload;
import br.com.senior.messaging.model.CommandDescription;
import br.com.senior.messaging.model.CommandKind;
import br.com.senior.messaging.model.MessageHandler;

/**
 * Response method for importProduct
 */
@CommandDescription(name="importProductResponse", kind=CommandKind.ResponseCommand, requestPrimitive="importProductResponse")
public interface ImportProductResponse extends MessageHandler {

	void importProductResponse(ImportProductOutput response);
	
	void importProductResponseError(ErrorPayload error);

}
