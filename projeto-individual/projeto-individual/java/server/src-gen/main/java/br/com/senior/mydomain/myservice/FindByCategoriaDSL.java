/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;

import br.com.senior.messaging.model.*;

/**
 * Query destinada para retornar lista de produtos dentro da categoria passada
 */
@CommandDescription(name="findByCategoriaDSL", kind=CommandKind.Query, requestPrimitive="findByCategoriaDSL", responsePrimitive="findByCategoriaDSLResponse")
public interface FindByCategoriaDSL extends MessageHandler {
    
    public FindByCategoriaDSLOutput findByCategoriaDSL(FindByCategoriaDSLInput request);
    
}
