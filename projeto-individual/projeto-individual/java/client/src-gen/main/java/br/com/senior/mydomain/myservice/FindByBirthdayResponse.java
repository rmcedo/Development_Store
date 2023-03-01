/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;	

import br.com.senior.messaging.ErrorPayload;
import br.com.senior.messaging.model.CommandDescription;
import br.com.senior.messaging.model.CommandKind;
import br.com.senior.messaging.model.MessageHandler;

/**
 * Response method for findByBirthday
 */
@CommandDescription(name="findByBirthdayResponse", kind=CommandKind.ResponseCommand, requestPrimitive="findByBirthdayResponse")
public interface FindByBirthdayResponse extends MessageHandler {

	void findByBirthdayResponse(FindByBirthdayOutput response);
	
	void findByBirthdayResponseError(ErrorPayload error);

}
