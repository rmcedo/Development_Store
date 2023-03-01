/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;	

import br.com.senior.messaging.ErrorPayload;
import br.com.senior.messaging.model.CommandDescription;
import br.com.senior.messaging.model.CommandKind;
import br.com.senior.messaging.model.MessageHandler;

/**
 * Response method for findByCategoriaDSL
 */
@CommandDescription(name="findByCategoriaDSLResponse", kind=CommandKind.ResponseCommand, requestPrimitive="findByCategoriaDSLResponse")
public interface FindByCategoriaDSLResponse extends MessageHandler {

	void findByCategoriaDSLResponse(FindByCategoriaDSLOutput response);
	
	void findByCategoriaDSLResponseError(ErrorPayload error);

}
