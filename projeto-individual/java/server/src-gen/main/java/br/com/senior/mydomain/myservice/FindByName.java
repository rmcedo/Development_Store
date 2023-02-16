/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;

import br.com.senior.messaging.model.*;

@CommandDescription(name="findByName", kind=CommandKind.Query, requestPrimitive="findByName", responsePrimitive="findByNameResponse")
public interface FindByName extends MessageHandler {
    
    public FindByNameOutput findByName(FindByNameInput request);
    
}
