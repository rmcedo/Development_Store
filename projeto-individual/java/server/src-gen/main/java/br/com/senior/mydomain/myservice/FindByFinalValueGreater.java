/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;

import br.com.senior.messaging.model.*;

@CommandDescription(name="findByFinalValueGreater", kind=CommandKind.Query, requestPrimitive="findByFinalValueGreater", responsePrimitive="findByFinalValueGreaterResponse")
public interface FindByFinalValueGreater extends MessageHandler {
    
    public FindByFinalValueGreaterOutput findByFinalValueGreater(FindByFinalValueGreaterInput request);
    
}
