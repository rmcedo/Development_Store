/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;	

import br.com.senior.messaging.ErrorPayload;
import br.com.senior.messaging.model.CommandDescription;
import br.com.senior.messaging.model.CommandKind;
import br.com.senior.messaging.model.MessageHandler;

/**
 * Response method for findByCpf
 */
@CommandDescription(name="findByCpfResponse", kind=CommandKind.ResponseCommand, requestPrimitive="findByCpfResponse")
public interface FindByCpfResponse extends MessageHandler {

	void findByCpfResponse(FindByCpfOutput response);
	
	void findByCpfResponseError(ErrorPayload error);

}
