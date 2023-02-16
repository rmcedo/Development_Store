/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;	

import br.com.senior.messaging.ErrorPayload;
import br.com.senior.messaging.model.CommandDescription;
import br.com.senior.messaging.model.CommandKind;
import br.com.senior.messaging.model.MessageHandler;

/**
 * Response method for updateMergeItem
 */
@CommandDescription(name="updateMergeItemResponse", kind=CommandKind.ResponseCommand, requestPrimitive="updateMergeItemResponse")
public interface UpdateMergeItemResponse extends MessageHandler {

	void updateMergeItemResponse(Item response);
	
	void updateMergeItemResponseError(ErrorPayload error);

}
