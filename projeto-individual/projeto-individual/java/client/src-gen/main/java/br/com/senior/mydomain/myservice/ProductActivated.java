/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;

import br.com.senior.messaging.model.*;

/**
 * Event para retornar mensagem quando ativarmos um Produto
 */
@SubscriptionDescription(domain="my_domain", service="my_service", event="productActivated")
public interface ProductActivated extends MessageHandler {
    public void productActivated(ProductActivatedPayload payload);
    
}
