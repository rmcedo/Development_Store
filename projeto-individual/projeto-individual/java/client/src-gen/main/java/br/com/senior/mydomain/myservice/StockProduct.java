/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;

import br.com.senior.messaging.model.*;

/**
 * Event para retornar mensagem quando o estoque do Produto zerar
 */
@SubscriptionDescription(domain="my_domain", service="my_service", event="stockProduct")
public interface StockProduct extends MessageHandler {
    public void stockProduct(StockProductPayload payload);
    
}
