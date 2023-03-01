/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;

import br.com.senior.messaging.model.*;

/**
 * Query destinada para retornar lista de produtos contendo preços, VIA RECORD
 */
@CommandDescription(name="findAllRecord", kind=CommandKind.Query, requestPrimitive="findAllRecord", responsePrimitive="findAllRecordResponse")
public interface FindAllRecord extends MessageHandler {
    
    public FindAllRecordOutput findAllRecord();
    
}
