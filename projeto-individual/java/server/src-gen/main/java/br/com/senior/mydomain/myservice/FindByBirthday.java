/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;

import br.com.senior.messaging.model.*;

/**
 * Query destinada para encontrar Clientes com nascimento no mesmo dia
 */
@CommandDescription(name="findByBirthday", kind=CommandKind.Query, requestPrimitive="findByBirthday", responsePrimitive="findByBirthdayResponse")
public interface FindByBirthday extends MessageHandler {
    
    public FindByBirthdayOutput findByBirthday(FindByBirthdayInput request);
    
}
