/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;

import java.util.concurrent.TimeUnit;
import java.util.function.Supplier;

import br.com.senior.messaging.*;
import br.com.senior.messaging.utils.DtoJsonConverter;
import br.com.senior.sdl.user.UserIdentifier;

import java.util.concurrent.CompletableFuture;


/**
* 
*/
@SuppressWarnings("deprecation") // To prevent warnings in generated code about known deprecated methods.
public class MyServiceStubImpl  implements MyServiceStub {

	protected final Supplier<IMessenger> messengerSupplier;
	protected final UserIdentifier userId;
	protected final Supplier<Message> messageSupplier;

	/**
	 * Use {@link #MyServiceStubImpl(MessengerSupplier, UserIdentifier, MessageSupplier)} instead.
	 */
	@Deprecated
	public MyServiceStubImpl(IMessenger messenger, UserIdentifier userId) {
		this(new br.com.senior.mydomain.myservice.InstanceMessengerSupplier(messenger), userId, null);
	}

	/**
	 * @param messengerSupplier Supplies current service messenger.
	 * @param userId Provides tenant and user name to send or publish messages.
	 * @param messageSupplier Supplies current message being processed by service. Used to send messages by foolowup.
	 */
	public MyServiceStubImpl(Supplier<IMessenger> messengerSupplier, UserIdentifier userId, Supplier<Message> messageSupplier) {
		this.messengerSupplier = messengerSupplier;
		this.userId = userId;
		this.messageSupplier = messageSupplier;
	}

	/**
	 * Chamada síncrona para o método helloWorld
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 * @throws MyServiceMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public HelloWorldOutput helloWorld(HelloWorldInput input, long timeout) {
		br.com.senior.mydomain.myservice.impl.HelloWorldImpl impl = new br.com.senior.mydomain.myservice.impl.HelloWorldImpl(messengerSupplier, userId, messageSupplier);
		return impl.helloWorld(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método helloWorld
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 */
	@Override
	public void helloWorld(HelloWorldInput input) {
		br.com.senior.mydomain.myservice.impl.HelloWorldImpl impl = new br.com.senior.mydomain.myservice.impl.HelloWorldImpl(messengerSupplier, userId, messageSupplier);
		impl.helloWorld(input);
	}
	
	/**
	 * Chamada assíncrona para o método helloWorld
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 */
	@Override
	public CompletableFuture<HelloWorldOutput> helloWorldRequest(HelloWorldInput input) {
		return this.helloWorldRequest(input, 0l);
	}
	
	/**
	 * Chamada assíncrona para o método helloWorld
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	*/
	@Override
	public CompletableFuture<HelloWorldOutput> helloWorldRequest(HelloWorldInput input, long timeout) {
		br.com.senior.mydomain.myservice.impl.HelloWorldImpl impl = new br.com.senior.mydomain.myservice.impl.HelloWorldImpl(messengerSupplier, userId, messageSupplier);
		return impl.helloWorldRequest(input, timeout, TimeUnit.MILLISECONDS);
	}
	/**
	 * Chamada síncrona para o método findByName
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * Query destinada para retornar Lista de Clientes com nome contendo parte do parametro name, passado na nossa requisição
	 * @throws MyServiceMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public FindByNameOutput findByName(FindByNameInput input, long timeout) {
		br.com.senior.mydomain.myservice.impl.FindByNameImpl impl = new br.com.senior.mydomain.myservice.impl.FindByNameImpl(messengerSupplier, userId, messageSupplier);
		return impl.findByName(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método findByName
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * Query destinada para retornar Lista de Clientes com nome contendo parte do parametro name, passado na nossa requisição
	 */
	@Override
	public void findByName(FindByNameInput input) {
		br.com.senior.mydomain.myservice.impl.FindByNameImpl impl = new br.com.senior.mydomain.myservice.impl.FindByNameImpl(messengerSupplier, userId, messageSupplier);
		impl.findByName(input);
	}
	
	/**
	 * Chamada assíncrona para o método findByName
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * Query destinada para retornar Lista de Clientes com nome contendo parte do parametro name, passado na nossa requisição
	 */
	@Override
	public CompletableFuture<FindByNameOutput> findByNameRequest(FindByNameInput input) {
		return this.findByNameRequest(input, 0l);
	}
	
	/**
	 * Chamada assíncrona para o método findByName
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * Query destinada para retornar Lista de Clientes com nome contendo parte do parametro name, passado na nossa requisição
	*/
	@Override
	public CompletableFuture<FindByNameOutput> findByNameRequest(FindByNameInput input, long timeout) {
		br.com.senior.mydomain.myservice.impl.FindByNameImpl impl = new br.com.senior.mydomain.myservice.impl.FindByNameImpl(messengerSupplier, userId, messageSupplier);
		return impl.findByNameRequest(input, timeout, TimeUnit.MILLISECONDS);
	}
	/**
	 * Chamada síncrona para o método findByCpf
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * Query destinada para retornar Cliente com CPF igual ao passado como parametro
	 * @throws MyServiceMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public FindByCpfOutput findByCpf(FindByCpfInput input, long timeout) {
		br.com.senior.mydomain.myservice.impl.FindByCpfImpl impl = new br.com.senior.mydomain.myservice.impl.FindByCpfImpl(messengerSupplier, userId, messageSupplier);
		return impl.findByCpf(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método findByCpf
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * Query destinada para retornar Cliente com CPF igual ao passado como parametro
	 */
	@Override
	public void findByCpf(FindByCpfInput input) {
		br.com.senior.mydomain.myservice.impl.FindByCpfImpl impl = new br.com.senior.mydomain.myservice.impl.FindByCpfImpl(messengerSupplier, userId, messageSupplier);
		impl.findByCpf(input);
	}
	
	/**
	 * Chamada assíncrona para o método findByCpf
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * Query destinada para retornar Cliente com CPF igual ao passado como parametro
	 */
	@Override
	public CompletableFuture<FindByCpfOutput> findByCpfRequest(FindByCpfInput input) {
		return this.findByCpfRequest(input, 0l);
	}
	
	/**
	 * Chamada assíncrona para o método findByCpf
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * Query destinada para retornar Cliente com CPF igual ao passado como parametro
	*/
	@Override
	public CompletableFuture<FindByCpfOutput> findByCpfRequest(FindByCpfInput input, long timeout) {
		br.com.senior.mydomain.myservice.impl.FindByCpfImpl impl = new br.com.senior.mydomain.myservice.impl.FindByCpfImpl(messengerSupplier, userId, messageSupplier);
		return impl.findByCpfRequest(input, timeout, TimeUnit.MILLISECONDS);
	}
	/**
	 * Chamada síncrona para o método findByBirthday
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * Query destinada para encontrar Clientes com nascimento no mesmo dia
	 * @throws MyServiceMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public FindByBirthdayOutput findByBirthday(FindByBirthdayInput input, long timeout) {
		br.com.senior.mydomain.myservice.impl.FindByBirthdayImpl impl = new br.com.senior.mydomain.myservice.impl.FindByBirthdayImpl(messengerSupplier, userId, messageSupplier);
		return impl.findByBirthday(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método findByBirthday
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * Query destinada para encontrar Clientes com nascimento no mesmo dia
	 */
	@Override
	public void findByBirthday(FindByBirthdayInput input) {
		br.com.senior.mydomain.myservice.impl.FindByBirthdayImpl impl = new br.com.senior.mydomain.myservice.impl.FindByBirthdayImpl(messengerSupplier, userId, messageSupplier);
		impl.findByBirthday(input);
	}
	
	/**
	 * Chamada assíncrona para o método findByBirthday
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * Query destinada para encontrar Clientes com nascimento no mesmo dia
	 */
	@Override
	public CompletableFuture<FindByBirthdayOutput> findByBirthdayRequest(FindByBirthdayInput input) {
		return this.findByBirthdayRequest(input, 0l);
	}
	
	/**
	 * Chamada assíncrona para o método findByBirthday
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * Query destinada para encontrar Clientes com nascimento no mesmo dia
	*/
	@Override
	public CompletableFuture<FindByBirthdayOutput> findByBirthdayRequest(FindByBirthdayInput input, long timeout) {
		br.com.senior.mydomain.myservice.impl.FindByBirthdayImpl impl = new br.com.senior.mydomain.myservice.impl.FindByBirthdayImpl(messengerSupplier, userId, messageSupplier);
		return impl.findByBirthdayRequest(input, timeout, TimeUnit.MILLISECONDS);
	}
	/**
	 * Chamada síncrona para o método findByActiveTrue
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * Query destinada para encontrar Clientes que estão ativos ou não dentro do sistema
	 * @throws MyServiceMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public FindByActiveTrueOutput findByActiveTrue(FindByActiveTrueInput input, long timeout) {
		br.com.senior.mydomain.myservice.impl.FindByActiveTrueImpl impl = new br.com.senior.mydomain.myservice.impl.FindByActiveTrueImpl(messengerSupplier, userId, messageSupplier);
		return impl.findByActiveTrue(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método findByActiveTrue
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * Query destinada para encontrar Clientes que estão ativos ou não dentro do sistema
	 */
	@Override
	public void findByActiveTrue(FindByActiveTrueInput input) {
		br.com.senior.mydomain.myservice.impl.FindByActiveTrueImpl impl = new br.com.senior.mydomain.myservice.impl.FindByActiveTrueImpl(messengerSupplier, userId, messageSupplier);
		impl.findByActiveTrue(input);
	}
	
	/**
	 * Chamada assíncrona para o método findByActiveTrue
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * Query destinada para encontrar Clientes que estão ativos ou não dentro do sistema
	 */
	@Override
	public CompletableFuture<FindByActiveTrueOutput> findByActiveTrueRequest(FindByActiveTrueInput input) {
		return this.findByActiveTrueRequest(input, 0l);
	}
	
	/**
	 * Chamada assíncrona para o método findByActiveTrue
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * Query destinada para encontrar Clientes que estão ativos ou não dentro do sistema
	*/
	@Override
	public CompletableFuture<FindByActiveTrueOutput> findByActiveTrueRequest(FindByActiveTrueInput input, long timeout) {
		br.com.senior.mydomain.myservice.impl.FindByActiveTrueImpl impl = new br.com.senior.mydomain.myservice.impl.FindByActiveTrueImpl(messengerSupplier, userId, messageSupplier);
		return impl.findByActiveTrueRequest(input, timeout, TimeUnit.MILLISECONDS);
	}
	/**
	 * Chamada síncrona para o método findPriceGreater
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * Query destinada para retornar Lista de Produtos com preço com maior valor do que o passado no parametro value
	 * @throws MyServiceMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public FindPriceGreaterOutput findPriceGreater(FindPriceGreaterInput input, long timeout) {
		br.com.senior.mydomain.myservice.impl.FindPriceGreaterImpl impl = new br.com.senior.mydomain.myservice.impl.FindPriceGreaterImpl(messengerSupplier, userId, messageSupplier);
		return impl.findPriceGreater(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método findPriceGreater
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * Query destinada para retornar Lista de Produtos com preço com maior valor do que o passado no parametro value
	 */
	@Override
	public void findPriceGreater(FindPriceGreaterInput input) {
		br.com.senior.mydomain.myservice.impl.FindPriceGreaterImpl impl = new br.com.senior.mydomain.myservice.impl.FindPriceGreaterImpl(messengerSupplier, userId, messageSupplier);
		impl.findPriceGreater(input);
	}
	
	/**
	 * Chamada assíncrona para o método findPriceGreater
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * Query destinada para retornar Lista de Produtos com preço com maior valor do que o passado no parametro value
	 */
	@Override
	public CompletableFuture<FindPriceGreaterOutput> findPriceGreaterRequest(FindPriceGreaterInput input) {
		return this.findPriceGreaterRequest(input, 0l);
	}
	
	/**
	 * Chamada assíncrona para o método findPriceGreater
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * Query destinada para retornar Lista de Produtos com preço com maior valor do que o passado no parametro value
	*/
	@Override
	public CompletableFuture<FindPriceGreaterOutput> findPriceGreaterRequest(FindPriceGreaterInput input, long timeout) {
		br.com.senior.mydomain.myservice.impl.FindPriceGreaterImpl impl = new br.com.senior.mydomain.myservice.impl.FindPriceGreaterImpl(messengerSupplier, userId, messageSupplier);
		return impl.findPriceGreaterRequest(input, timeout, TimeUnit.MILLISECONDS);
	}
	/**
	 * Chamada síncrona para o método findProductByName
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * Query destinada para retornar Lista de Produtos com nome igual ou semelhante ao valor passado no parametro nome
	 * @throws MyServiceMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public FindProductByNameOutput findProductByName(FindProductByNameInput input, long timeout) {
		br.com.senior.mydomain.myservice.impl.FindProductByNameImpl impl = new br.com.senior.mydomain.myservice.impl.FindProductByNameImpl(messengerSupplier, userId, messageSupplier);
		return impl.findProductByName(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método findProductByName
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * Query destinada para retornar Lista de Produtos com nome igual ou semelhante ao valor passado no parametro nome
	 */
	@Override
	public void findProductByName(FindProductByNameInput input) {
		br.com.senior.mydomain.myservice.impl.FindProductByNameImpl impl = new br.com.senior.mydomain.myservice.impl.FindProductByNameImpl(messengerSupplier, userId, messageSupplier);
		impl.findProductByName(input);
	}
	
	/**
	 * Chamada assíncrona para o método findProductByName
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * Query destinada para retornar Lista de Produtos com nome igual ou semelhante ao valor passado no parametro nome
	 */
	@Override
	public CompletableFuture<FindProductByNameOutput> findProductByNameRequest(FindProductByNameInput input) {
		return this.findProductByNameRequest(input, 0l);
	}
	
	/**
	 * Chamada assíncrona para o método findProductByName
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * Query destinada para retornar Lista de Produtos com nome igual ou semelhante ao valor passado no parametro nome
	*/
	@Override
	public CompletableFuture<FindProductByNameOutput> findProductByNameRequest(FindProductByNameInput input, long timeout) {
		br.com.senior.mydomain.myservice.impl.FindProductByNameImpl impl = new br.com.senior.mydomain.myservice.impl.FindProductByNameImpl(messengerSupplier, userId, messageSupplier);
		return impl.findProductByNameRequest(input, timeout, TimeUnit.MILLISECONDS);
	}
	/**
	 * Chamada síncrona para o método findProductPriceLess
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * Query destinada para retornar Lista de Produtos com preço menor que o valor passado no parametro price
	 * @throws MyServiceMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public FindProductPriceLessOutput findProductPriceLess(FindProductPriceLessInput input, long timeout) {
		br.com.senior.mydomain.myservice.impl.FindProductPriceLessImpl impl = new br.com.senior.mydomain.myservice.impl.FindProductPriceLessImpl(messengerSupplier, userId, messageSupplier);
		return impl.findProductPriceLess(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método findProductPriceLess
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * Query destinada para retornar Lista de Produtos com preço menor que o valor passado no parametro price
	 */
	@Override
	public void findProductPriceLess(FindProductPriceLessInput input) {
		br.com.senior.mydomain.myservice.impl.FindProductPriceLessImpl impl = new br.com.senior.mydomain.myservice.impl.FindProductPriceLessImpl(messengerSupplier, userId, messageSupplier);
		impl.findProductPriceLess(input);
	}
	
	/**
	 * Chamada assíncrona para o método findProductPriceLess
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * Query destinada para retornar Lista de Produtos com preço menor que o valor passado no parametro price
	 */
	@Override
	public CompletableFuture<FindProductPriceLessOutput> findProductPriceLessRequest(FindProductPriceLessInput input) {
		return this.findProductPriceLessRequest(input, 0l);
	}
	
	/**
	 * Chamada assíncrona para o método findProductPriceLess
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * Query destinada para retornar Lista de Produtos com preço menor que o valor passado no parametro price
	*/
	@Override
	public CompletableFuture<FindProductPriceLessOutput> findProductPriceLessRequest(FindProductPriceLessInput input, long timeout) {
		br.com.senior.mydomain.myservice.impl.FindProductPriceLessImpl impl = new br.com.senior.mydomain.myservice.impl.FindProductPriceLessImpl(messengerSupplier, userId, messageSupplier);
		return impl.findProductPriceLessRequest(input, timeout, TimeUnit.MILLISECONDS);
	}
	/**
	 * Chamada síncrona para o método findProductStockLess
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * Query destinada para retornar Lista de Produtos com estoque menor que o valor passado no parametro stock
	 * @throws MyServiceMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public FindProductStockLessOutput findProductStockLess(FindProductStockLessInput input, long timeout) {
		br.com.senior.mydomain.myservice.impl.FindProductStockLessImpl impl = new br.com.senior.mydomain.myservice.impl.FindProductStockLessImpl(messengerSupplier, userId, messageSupplier);
		return impl.findProductStockLess(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método findProductStockLess
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * Query destinada para retornar Lista de Produtos com estoque menor que o valor passado no parametro stock
	 */
	@Override
	public void findProductStockLess(FindProductStockLessInput input) {
		br.com.senior.mydomain.myservice.impl.FindProductStockLessImpl impl = new br.com.senior.mydomain.myservice.impl.FindProductStockLessImpl(messengerSupplier, userId, messageSupplier);
		impl.findProductStockLess(input);
	}
	
	/**
	 * Chamada assíncrona para o método findProductStockLess
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * Query destinada para retornar Lista de Produtos com estoque menor que o valor passado no parametro stock
	 */
	@Override
	public CompletableFuture<FindProductStockLessOutput> findProductStockLessRequest(FindProductStockLessInput input) {
		return this.findProductStockLessRequest(input, 0l);
	}
	
	/**
	 * Chamada assíncrona para o método findProductStockLess
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * Query destinada para retornar Lista de Produtos com estoque menor que o valor passado no parametro stock
	*/
	@Override
	public CompletableFuture<FindProductStockLessOutput> findProductStockLessRequest(FindProductStockLessInput input, long timeout) {
		br.com.senior.mydomain.myservice.impl.FindProductStockLessImpl impl = new br.com.senior.mydomain.myservice.impl.FindProductStockLessImpl(messengerSupplier, userId, messageSupplier);
		return impl.findProductStockLessRequest(input, timeout, TimeUnit.MILLISECONDS);
	}
	/**
	 * Chamada síncrona para o método findProductStockGreater
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * Query destinada para retornar Lista de Produtos com estoque maior que o valor passado no parametro stock
	 * @throws MyServiceMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public FindProductStockGreaterOutput findProductStockGreater(FindProductStockGreaterInput input, long timeout) {
		br.com.senior.mydomain.myservice.impl.FindProductStockGreaterImpl impl = new br.com.senior.mydomain.myservice.impl.FindProductStockGreaterImpl(messengerSupplier, userId, messageSupplier);
		return impl.findProductStockGreater(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método findProductStockGreater
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * Query destinada para retornar Lista de Produtos com estoque maior que o valor passado no parametro stock
	 */
	@Override
	public void findProductStockGreater(FindProductStockGreaterInput input) {
		br.com.senior.mydomain.myservice.impl.FindProductStockGreaterImpl impl = new br.com.senior.mydomain.myservice.impl.FindProductStockGreaterImpl(messengerSupplier, userId, messageSupplier);
		impl.findProductStockGreater(input);
	}
	
	/**
	 * Chamada assíncrona para o método findProductStockGreater
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * Query destinada para retornar Lista de Produtos com estoque maior que o valor passado no parametro stock
	 */
	@Override
	public CompletableFuture<FindProductStockGreaterOutput> findProductStockGreaterRequest(FindProductStockGreaterInput input) {
		return this.findProductStockGreaterRequest(input, 0l);
	}
	
	/**
	 * Chamada assíncrona para o método findProductStockGreater
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * Query destinada para retornar Lista de Produtos com estoque maior que o valor passado no parametro stock
	*/
	@Override
	public CompletableFuture<FindProductStockGreaterOutput> findProductStockGreaterRequest(FindProductStockGreaterInput input, long timeout) {
		br.com.senior.mydomain.myservice.impl.FindProductStockGreaterImpl impl = new br.com.senior.mydomain.myservice.impl.FindProductStockGreaterImpl(messengerSupplier, userId, messageSupplier);
		return impl.findProductStockGreaterRequest(input, timeout, TimeUnit.MILLISECONDS);
	}
	/**
	 * Chamada síncrona para o método findAllRecord
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * Query destinada para retornar lista de produtos contendo preços, VIA RECORD
	 * @throws MyServiceMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public FindAllRecordOutput findAllRecord(long timeout) {
		br.com.senior.mydomain.myservice.impl.FindAllRecordImpl impl = new br.com.senior.mydomain.myservice.impl.FindAllRecordImpl(messengerSupplier, userId, messageSupplier);
		return impl.findAllRecord(timeout);
	}
	
	/**
	 * Chamada assíncrona para o método findAllRecord
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * Query destinada para retornar lista de produtos contendo preços, VIA RECORD
	 */
	@Override
	public void findAllRecord() {
		br.com.senior.mydomain.myservice.impl.FindAllRecordImpl impl = new br.com.senior.mydomain.myservice.impl.FindAllRecordImpl(messengerSupplier, userId, messageSupplier);
		impl.findAllRecord();
	}
	
	/**
	 * Chamada assíncrona para o método findAllRecord
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * Query destinada para retornar lista de produtos contendo preços, VIA RECORD
	 */
	@Override
	public CompletableFuture<FindAllRecordOutput> findAllRecordRequest() {
		return this.findAllRecordRequest(0l);
	}
	
	/**
	 * Chamada assíncrona para o método findAllRecord
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * Query destinada para retornar lista de produtos contendo preços, VIA RECORD
	*/
	@Override
	public CompletableFuture<FindAllRecordOutput> findAllRecordRequest(long timeout) {
		br.com.senior.mydomain.myservice.impl.FindAllRecordImpl impl = new br.com.senior.mydomain.myservice.impl.FindAllRecordImpl(messengerSupplier, userId, messageSupplier);
		return impl.findAllRecordRequest(timeout, TimeUnit.MILLISECONDS);
	}
	/**
	 * Chamada síncrona para o método findByCategoriaDSL
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * Query destinada para retornar lista de produtos dentro da categoria passada
	 * @throws MyServiceMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public FindByCategoriaDSLOutput findByCategoriaDSL(FindByCategoriaDSLInput input, long timeout) {
		br.com.senior.mydomain.myservice.impl.FindByCategoriaDSLImpl impl = new br.com.senior.mydomain.myservice.impl.FindByCategoriaDSLImpl(messengerSupplier, userId, messageSupplier);
		return impl.findByCategoriaDSL(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método findByCategoriaDSL
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * Query destinada para retornar lista de produtos dentro da categoria passada
	 */
	@Override
	public void findByCategoriaDSL(FindByCategoriaDSLInput input) {
		br.com.senior.mydomain.myservice.impl.FindByCategoriaDSLImpl impl = new br.com.senior.mydomain.myservice.impl.FindByCategoriaDSLImpl(messengerSupplier, userId, messageSupplier);
		impl.findByCategoriaDSL(input);
	}
	
	/**
	 * Chamada assíncrona para o método findByCategoriaDSL
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * Query destinada para retornar lista de produtos dentro da categoria passada
	 */
	@Override
	public CompletableFuture<FindByCategoriaDSLOutput> findByCategoriaDSLRequest(FindByCategoriaDSLInput input) {
		return this.findByCategoriaDSLRequest(input, 0l);
	}
	
	/**
	 * Chamada assíncrona para o método findByCategoriaDSL
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * Query destinada para retornar lista de produtos dentro da categoria passada
	*/
	@Override
	public CompletableFuture<FindByCategoriaDSLOutput> findByCategoriaDSLRequest(FindByCategoriaDSLInput input, long timeout) {
		br.com.senior.mydomain.myservice.impl.FindByCategoriaDSLImpl impl = new br.com.senior.mydomain.myservice.impl.FindByCategoriaDSLImpl(messengerSupplier, userId, messageSupplier);
		return impl.findByCategoriaDSLRequest(input, timeout, TimeUnit.MILLISECONDS);
	}
	/**
	 * Chamada síncrona para o método findDateBetween
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * Query destinada para retornar Lista de Pedidos com data de criação entre as duas datas passadas nos parametros date1 e date2
	 * @throws MyServiceMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public FindDateBetweenOutput findDateBetween(FindDateBetweenInput input, long timeout) {
		br.com.senior.mydomain.myservice.impl.FindDateBetweenImpl impl = new br.com.senior.mydomain.myservice.impl.FindDateBetweenImpl(messengerSupplier, userId, messageSupplier);
		return impl.findDateBetween(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método findDateBetween
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * Query destinada para retornar Lista de Pedidos com data de criação entre as duas datas passadas nos parametros date1 e date2
	 */
	@Override
	public void findDateBetween(FindDateBetweenInput input) {
		br.com.senior.mydomain.myservice.impl.FindDateBetweenImpl impl = new br.com.senior.mydomain.myservice.impl.FindDateBetweenImpl(messengerSupplier, userId, messageSupplier);
		impl.findDateBetween(input);
	}
	
	/**
	 * Chamada assíncrona para o método findDateBetween
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * Query destinada para retornar Lista de Pedidos com data de criação entre as duas datas passadas nos parametros date1 e date2
	 */
	@Override
	public CompletableFuture<FindDateBetweenOutput> findDateBetweenRequest(FindDateBetweenInput input) {
		return this.findDateBetweenRequest(input, 0l);
	}
	
	/**
	 * Chamada assíncrona para o método findDateBetween
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * Query destinada para retornar Lista de Pedidos com data de criação entre as duas datas passadas nos parametros date1 e date2
	*/
	@Override
	public CompletableFuture<FindDateBetweenOutput> findDateBetweenRequest(FindDateBetweenInput input, long timeout) {
		br.com.senior.mydomain.myservice.impl.FindDateBetweenImpl impl = new br.com.senior.mydomain.myservice.impl.FindDateBetweenImpl(messengerSupplier, userId, messageSupplier);
		return impl.findDateBetweenRequest(input, timeout, TimeUnit.MILLISECONDS);
	}
	/**
	 * Chamada síncrona para o método findByFinalValueGreater
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * Query destinada para retornar Lista de Pedidos com valores finais com maior valor do que o parametro passado
	 * @throws MyServiceMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public FindByFinalValueGreaterOutput findByFinalValueGreater(FindByFinalValueGreaterInput input, long timeout) {
		br.com.senior.mydomain.myservice.impl.FindByFinalValueGreaterImpl impl = new br.com.senior.mydomain.myservice.impl.FindByFinalValueGreaterImpl(messengerSupplier, userId, messageSupplier);
		return impl.findByFinalValueGreater(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método findByFinalValueGreater
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * Query destinada para retornar Lista de Pedidos com valores finais com maior valor do que o parametro passado
	 */
	@Override
	public void findByFinalValueGreater(FindByFinalValueGreaterInput input) {
		br.com.senior.mydomain.myservice.impl.FindByFinalValueGreaterImpl impl = new br.com.senior.mydomain.myservice.impl.FindByFinalValueGreaterImpl(messengerSupplier, userId, messageSupplier);
		impl.findByFinalValueGreater(input);
	}
	
	/**
	 * Chamada assíncrona para o método findByFinalValueGreater
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * Query destinada para retornar Lista de Pedidos com valores finais com maior valor do que o parametro passado
	 */
	@Override
	public CompletableFuture<FindByFinalValueGreaterOutput> findByFinalValueGreaterRequest(FindByFinalValueGreaterInput input) {
		return this.findByFinalValueGreaterRequest(input, 0l);
	}
	
	/**
	 * Chamada assíncrona para o método findByFinalValueGreater
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * Query destinada para retornar Lista de Pedidos com valores finais com maior valor do que o parametro passado
	*/
	@Override
	public CompletableFuture<FindByFinalValueGreaterOutput> findByFinalValueGreaterRequest(FindByFinalValueGreaterInput input, long timeout) {
		br.com.senior.mydomain.myservice.impl.FindByFinalValueGreaterImpl impl = new br.com.senior.mydomain.myservice.impl.FindByFinalValueGreaterImpl(messengerSupplier, userId, messageSupplier);
		return impl.findByFinalValueGreaterRequest(input, timeout, TimeUnit.MILLISECONDS);
	}
	/**
	 * Chamada síncrona para o método getMetadata
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * Default 'getMetadata' query. Every service must handle this command and return metadata in the format requested.
	 * @throws MyServiceMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public GetMetadataOutput getMetadata(GetMetadataInput input, long timeout) {
		br.com.senior.mydomain.myservice.impl.GetMetadataImpl impl = new br.com.senior.mydomain.myservice.impl.GetMetadataImpl(messengerSupplier, userId, messageSupplier);
		return impl.getMetadata(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método getMetadata
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * Default 'getMetadata' query. Every service must handle this command and return metadata in the format requested.
	 */
	@Override
	public void getMetadata(GetMetadataInput input) {
		br.com.senior.mydomain.myservice.impl.GetMetadataImpl impl = new br.com.senior.mydomain.myservice.impl.GetMetadataImpl(messengerSupplier, userId, messageSupplier);
		impl.getMetadata(input);
	}
	
	/**
	 * Chamada assíncrona para o método getMetadata
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * Default 'getMetadata' query. Every service must handle this command and return metadata in the format requested.
	 */
	@Override
	public CompletableFuture<GetMetadataOutput> getMetadataRequest(GetMetadataInput input) {
		return this.getMetadataRequest(input, 0l);
	}
	
	/**
	 * Chamada assíncrona para o método getMetadata
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * Default 'getMetadata' query. Every service must handle this command and return metadata in the format requested.
	*/
	@Override
	public CompletableFuture<GetMetadataOutput> getMetadataRequest(GetMetadataInput input, long timeout) {
		br.com.senior.mydomain.myservice.impl.GetMetadataImpl impl = new br.com.senior.mydomain.myservice.impl.GetMetadataImpl(messengerSupplier, userId, messageSupplier);
		return impl.getMetadataRequest(input, timeout, TimeUnit.MILLISECONDS);
	}
	/**
	 * Chamada síncrona para o método importClient
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 * @throws MyServiceMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public ImportClientOutput importClient(ImportClientInput input, long timeout) {
		br.com.senior.mydomain.myservice.impl.ImportClientImpl impl = new br.com.senior.mydomain.myservice.impl.ImportClientImpl(messengerSupplier, userId, messageSupplier);
		return impl.importClient(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método importClient
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 */
	@Override
	public void importClient(ImportClientInput input) {
		br.com.senior.mydomain.myservice.impl.ImportClientImpl impl = new br.com.senior.mydomain.myservice.impl.ImportClientImpl(messengerSupplier, userId, messageSupplier);
		impl.importClient(input);
	}
	
	/**
	 * Chamada assíncrona para o método importClient
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 */
	@Override
	public CompletableFuture<ImportClientOutput> importClientRequest(ImportClientInput input) {
		return this.importClientRequest(input, 0l);
	}
	
	/**
	 * Chamada assíncrona para o método importClient
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	*/
	@Override
	public CompletableFuture<ImportClientOutput> importClientRequest(ImportClientInput input, long timeout) {
		br.com.senior.mydomain.myservice.impl.ImportClientImpl impl = new br.com.senior.mydomain.myservice.impl.ImportClientImpl(messengerSupplier, userId, messageSupplier);
		return impl.importClientRequest(input, timeout, TimeUnit.MILLISECONDS);
	}
	/**
	 * Chamada síncrona para o método exportClient
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 * @throws MyServiceMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public ExportClientOutput exportClient(ExportClientInput input, long timeout) {
		br.com.senior.mydomain.myservice.impl.ExportClientImpl impl = new br.com.senior.mydomain.myservice.impl.ExportClientImpl(messengerSupplier, userId, messageSupplier);
		return impl.exportClient(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método exportClient
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 */
	@Override
	public void exportClient(ExportClientInput input) {
		br.com.senior.mydomain.myservice.impl.ExportClientImpl impl = new br.com.senior.mydomain.myservice.impl.ExportClientImpl(messengerSupplier, userId, messageSupplier);
		impl.exportClient(input);
	}
	
	/**
	 * Chamada assíncrona para o método exportClient
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 */
	@Override
	public CompletableFuture<ExportClientOutput> exportClientRequest(ExportClientInput input) {
		return this.exportClientRequest(input, 0l);
	}
	
	/**
	 * Chamada assíncrona para o método exportClient
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	*/
	@Override
	public CompletableFuture<ExportClientOutput> exportClientRequest(ExportClientInput input, long timeout) {
		br.com.senior.mydomain.myservice.impl.ExportClientImpl impl = new br.com.senior.mydomain.myservice.impl.ExportClientImpl(messengerSupplier, userId, messageSupplier);
		return impl.exportClientRequest(input, timeout, TimeUnit.MILLISECONDS);
	}
	/**
	 * Chamada síncrona para o método importProduct
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 * @throws MyServiceMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public ImportProductOutput importProduct(ImportProductInput input, long timeout) {
		br.com.senior.mydomain.myservice.impl.ImportProductImpl impl = new br.com.senior.mydomain.myservice.impl.ImportProductImpl(messengerSupplier, userId, messageSupplier);
		return impl.importProduct(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método importProduct
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 */
	@Override
	public void importProduct(ImportProductInput input) {
		br.com.senior.mydomain.myservice.impl.ImportProductImpl impl = new br.com.senior.mydomain.myservice.impl.ImportProductImpl(messengerSupplier, userId, messageSupplier);
		impl.importProduct(input);
	}
	
	/**
	 * Chamada assíncrona para o método importProduct
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 */
	@Override
	public CompletableFuture<ImportProductOutput> importProductRequest(ImportProductInput input) {
		return this.importProductRequest(input, 0l);
	}
	
	/**
	 * Chamada assíncrona para o método importProduct
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	*/
	@Override
	public CompletableFuture<ImportProductOutput> importProductRequest(ImportProductInput input, long timeout) {
		br.com.senior.mydomain.myservice.impl.ImportProductImpl impl = new br.com.senior.mydomain.myservice.impl.ImportProductImpl(messengerSupplier, userId, messageSupplier);
		return impl.importProductRequest(input, timeout, TimeUnit.MILLISECONDS);
	}
	/**
	 * Chamada síncrona para o método exportProduct
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 * @throws MyServiceMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public ExportProductOutput exportProduct(ExportProductInput input, long timeout) {
		br.com.senior.mydomain.myservice.impl.ExportProductImpl impl = new br.com.senior.mydomain.myservice.impl.ExportProductImpl(messengerSupplier, userId, messageSupplier);
		return impl.exportProduct(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método exportProduct
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 */
	@Override
	public void exportProduct(ExportProductInput input) {
		br.com.senior.mydomain.myservice.impl.ExportProductImpl impl = new br.com.senior.mydomain.myservice.impl.ExportProductImpl(messengerSupplier, userId, messageSupplier);
		impl.exportProduct(input);
	}
	
	/**
	 * Chamada assíncrona para o método exportProduct
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 */
	@Override
	public CompletableFuture<ExportProductOutput> exportProductRequest(ExportProductInput input) {
		return this.exportProductRequest(input, 0l);
	}
	
	/**
	 * Chamada assíncrona para o método exportProduct
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	*/
	@Override
	public CompletableFuture<ExportProductOutput> exportProductRequest(ExportProductInput input, long timeout) {
		br.com.senior.mydomain.myservice.impl.ExportProductImpl impl = new br.com.senior.mydomain.myservice.impl.ExportProductImpl(messengerSupplier, userId, messageSupplier);
		return impl.exportProductRequest(input, timeout, TimeUnit.MILLISECONDS);
	}
	/**
	 * Chamada síncrona para o método importPedido
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 * @throws MyServiceMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public ImportPedidoOutput importPedido(ImportPedidoInput input, long timeout) {
		br.com.senior.mydomain.myservice.impl.ImportPedidoImpl impl = new br.com.senior.mydomain.myservice.impl.ImportPedidoImpl(messengerSupplier, userId, messageSupplier);
		return impl.importPedido(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método importPedido
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 */
	@Override
	public void importPedido(ImportPedidoInput input) {
		br.com.senior.mydomain.myservice.impl.ImportPedidoImpl impl = new br.com.senior.mydomain.myservice.impl.ImportPedidoImpl(messengerSupplier, userId, messageSupplier);
		impl.importPedido(input);
	}
	
	/**
	 * Chamada assíncrona para o método importPedido
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 */
	@Override
	public CompletableFuture<ImportPedidoOutput> importPedidoRequest(ImportPedidoInput input) {
		return this.importPedidoRequest(input, 0l);
	}
	
	/**
	 * Chamada assíncrona para o método importPedido
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	*/
	@Override
	public CompletableFuture<ImportPedidoOutput> importPedidoRequest(ImportPedidoInput input, long timeout) {
		br.com.senior.mydomain.myservice.impl.ImportPedidoImpl impl = new br.com.senior.mydomain.myservice.impl.ImportPedidoImpl(messengerSupplier, userId, messageSupplier);
		return impl.importPedidoRequest(input, timeout, TimeUnit.MILLISECONDS);
	}
	/**
	 * Chamada síncrona para o método exportPedido
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 * @throws MyServiceMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public ExportPedidoOutput exportPedido(ExportPedidoInput input, long timeout) {
		br.com.senior.mydomain.myservice.impl.ExportPedidoImpl impl = new br.com.senior.mydomain.myservice.impl.ExportPedidoImpl(messengerSupplier, userId, messageSupplier);
		return impl.exportPedido(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método exportPedido
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 */
	@Override
	public void exportPedido(ExportPedidoInput input) {
		br.com.senior.mydomain.myservice.impl.ExportPedidoImpl impl = new br.com.senior.mydomain.myservice.impl.ExportPedidoImpl(messengerSupplier, userId, messageSupplier);
		impl.exportPedido(input);
	}
	
	/**
	 * Chamada assíncrona para o método exportPedido
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 */
	@Override
	public CompletableFuture<ExportPedidoOutput> exportPedidoRequest(ExportPedidoInput input) {
		return this.exportPedidoRequest(input, 0l);
	}
	
	/**
	 * Chamada assíncrona para o método exportPedido
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	*/
	@Override
	public CompletableFuture<ExportPedidoOutput> exportPedidoRequest(ExportPedidoInput input, long timeout) {
		br.com.senior.mydomain.myservice.impl.ExportPedidoImpl impl = new br.com.senior.mydomain.myservice.impl.ExportPedidoImpl(messengerSupplier, userId, messageSupplier);
		return impl.exportPedidoRequest(input, timeout, TimeUnit.MILLISECONDS);
	}
	/**
	 * Chamada síncrona para o método getDependencies
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * Returns a list with all dependencies from this service, along with their respective versions
	 * @throws MyServiceMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public GetDependenciesOutput getDependencies(long timeout) {
		br.com.senior.mydomain.myservice.impl.GetDependenciesImpl impl = new br.com.senior.mydomain.myservice.impl.GetDependenciesImpl(messengerSupplier, userId, messageSupplier);
		return impl.getDependencies(timeout);
	}
	
	/**
	 * Chamada assíncrona para o método getDependencies
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * Returns a list with all dependencies from this service, along with their respective versions
	 */
	@Override
	public void getDependencies() {
		br.com.senior.mydomain.myservice.impl.GetDependenciesImpl impl = new br.com.senior.mydomain.myservice.impl.GetDependenciesImpl(messengerSupplier, userId, messageSupplier);
		impl.getDependencies();
	}
	
	/**
	 * Chamada assíncrona para o método getDependencies
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * Returns a list with all dependencies from this service, along with their respective versions
	 */
	@Override
	public CompletableFuture<GetDependenciesOutput> getDependenciesRequest() {
		return this.getDependenciesRequest(0l);
	}
	
	/**
	 * Chamada assíncrona para o método getDependencies
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * Returns a list with all dependencies from this service, along with their respective versions
	*/
	@Override
	public CompletableFuture<GetDependenciesOutput> getDependenciesRequest(long timeout) {
		br.com.senior.mydomain.myservice.impl.GetDependenciesImpl impl = new br.com.senior.mydomain.myservice.impl.GetDependenciesImpl(messengerSupplier, userId, messageSupplier);
		return impl.getDependenciesRequest(timeout, TimeUnit.MILLISECONDS);
	}
	/**
	 * Chamada síncrona para o método createClient
	 * This is a public operation
	 * The 'create' request primitive for the Client entity.
	 * @throws MyServiceMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public Client createClient(Client input, long timeout) {
		br.com.senior.mydomain.myservice.impl.CreateClientImpl impl = new br.com.senior.mydomain.myservice.impl.CreateClientImpl(messengerSupplier, userId, messageSupplier);
		return impl.createClient(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método createClient
	 * This is a public operation
	 * The 'create' request primitive for the Client entity.
	 */
	@Override
	public void createClient(Client input) {
		br.com.senior.mydomain.myservice.impl.CreateClientImpl impl = new br.com.senior.mydomain.myservice.impl.CreateClientImpl(messengerSupplier, userId, messageSupplier);
		impl.createClient(input);
	}
	
	/**
	 * Chamada assíncrona para o método createClient
	 * This is a public operation
	 * The 'create' request primitive for the Client entity.
	 */
	@Override
	public CompletableFuture<Client> createClientRequest(Client input) {
		return this.createClientRequest(input, 0l);
	}
	
	/**
	 * Chamada assíncrona para o método createClient
	 * This is a public operation
	 * The 'create' request primitive for the Client entity.
	*/
	@Override
	public CompletableFuture<Client> createClientRequest(Client input, long timeout) {
		br.com.senior.mydomain.myservice.impl.CreateClientImpl impl = new br.com.senior.mydomain.myservice.impl.CreateClientImpl(messengerSupplier, userId, messageSupplier);
		return impl.createClientRequest(input, timeout, TimeUnit.MILLISECONDS);
	}
	/**
	 * Chamada síncrona para o método createBulkClient
	 * This is a public operation
	 * The 'createBulk' request primitive for the Client entity.
	 * @throws MyServiceMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public CreateBulkClientOutput createBulkClient(CreateBulkClientInput input, long timeout) {
		br.com.senior.mydomain.myservice.impl.CreateBulkClientImpl impl = new br.com.senior.mydomain.myservice.impl.CreateBulkClientImpl(messengerSupplier, userId, messageSupplier);
		return impl.createBulkClient(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método createBulkClient
	 * This is a public operation
	 * The 'createBulk' request primitive for the Client entity.
	 */
	@Override
	public void createBulkClient(CreateBulkClientInput input) {
		br.com.senior.mydomain.myservice.impl.CreateBulkClientImpl impl = new br.com.senior.mydomain.myservice.impl.CreateBulkClientImpl(messengerSupplier, userId, messageSupplier);
		impl.createBulkClient(input);
	}
	
	/**
	 * Chamada assíncrona para o método createBulkClient
	 * This is a public operation
	 * The 'createBulk' request primitive for the Client entity.
	 */
	@Override
	public CompletableFuture<CreateBulkClientOutput> createBulkClientRequest(CreateBulkClientInput input) {
		return this.createBulkClientRequest(input, 0l);
	}
	
	/**
	 * Chamada assíncrona para o método createBulkClient
	 * This is a public operation
	 * The 'createBulk' request primitive for the Client entity.
	*/
	@Override
	public CompletableFuture<CreateBulkClientOutput> createBulkClientRequest(CreateBulkClientInput input, long timeout) {
		br.com.senior.mydomain.myservice.impl.CreateBulkClientImpl impl = new br.com.senior.mydomain.myservice.impl.CreateBulkClientImpl(messengerSupplier, userId, messageSupplier);
		return impl.createBulkClientRequest(input, timeout, TimeUnit.MILLISECONDS);
	}
	/**
	 * Chamada síncrona para o método createMergeClient
	 * This is a public operation
	 * The 'createMerge' request primitive for the Client entity.
	 * @throws MyServiceMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public Client createMergeClient(Client input, long timeout) {
		br.com.senior.mydomain.myservice.impl.CreateMergeClientImpl impl = new br.com.senior.mydomain.myservice.impl.CreateMergeClientImpl(messengerSupplier, userId, messageSupplier);
		return impl.createMergeClient(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método createMergeClient
	 * This is a public operation
	 * The 'createMerge' request primitive for the Client entity.
	 */
	@Override
	public void createMergeClient(Client input) {
		br.com.senior.mydomain.myservice.impl.CreateMergeClientImpl impl = new br.com.senior.mydomain.myservice.impl.CreateMergeClientImpl(messengerSupplier, userId, messageSupplier);
		impl.createMergeClient(input);
	}
	
	/**
	 * Chamada assíncrona para o método createMergeClient
	 * This is a public operation
	 * The 'createMerge' request primitive for the Client entity.
	 */
	@Override
	public CompletableFuture<Client> createMergeClientRequest(Client input) {
		return this.createMergeClientRequest(input, 0l);
	}
	
	/**
	 * Chamada assíncrona para o método createMergeClient
	 * This is a public operation
	 * The 'createMerge' request primitive for the Client entity.
	*/
	@Override
	public CompletableFuture<Client> createMergeClientRequest(Client input, long timeout) {
		br.com.senior.mydomain.myservice.impl.CreateMergeClientImpl impl = new br.com.senior.mydomain.myservice.impl.CreateMergeClientImpl(messengerSupplier, userId, messageSupplier);
		return impl.createMergeClientRequest(input, timeout, TimeUnit.MILLISECONDS);
	}
	/**
	 * Chamada síncrona para o método retrieveClient
	 * This is a public operation
	 * The 'retrieve' request primitive for the Client entity.
	 * @throws MyServiceMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public Client retrieveClient(Client.GetRequest input, long timeout) {
		br.com.senior.mydomain.myservice.impl.RetrieveClientImpl impl = new br.com.senior.mydomain.myservice.impl.RetrieveClientImpl(messengerSupplier, userId, messageSupplier);
		return impl.retrieveClient(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método retrieveClient
	 * This is a public operation
	 * The 'retrieve' request primitive for the Client entity.
	 */
	@Override
	public void retrieveClient(Client.GetRequest input) {
		br.com.senior.mydomain.myservice.impl.RetrieveClientImpl impl = new br.com.senior.mydomain.myservice.impl.RetrieveClientImpl(messengerSupplier, userId, messageSupplier);
		impl.retrieveClient(input);
	}
	
	/**
	 * Chamada assíncrona para o método retrieveClient
	 * This is a public operation
	 * The 'retrieve' request primitive for the Client entity.
	 */
	@Override
	public CompletableFuture<Client> retrieveClientRequest(Client.GetRequest input) {
		return this.retrieveClientRequest(input, 0l);
	}
	
	/**
	 * Chamada assíncrona para o método retrieveClient
	 * This is a public operation
	 * The 'retrieve' request primitive for the Client entity.
	*/
	@Override
	public CompletableFuture<Client> retrieveClientRequest(Client.GetRequest input, long timeout) {
		br.com.senior.mydomain.myservice.impl.RetrieveClientImpl impl = new br.com.senior.mydomain.myservice.impl.RetrieveClientImpl(messengerSupplier, userId, messageSupplier);
		return impl.retrieveClientRequest(input, timeout, TimeUnit.MILLISECONDS);
	}
	/**
	 * Chamada síncrona para o método listClient
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'list' request primitive for the Client entity.
	 * @throws MyServiceMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public Client.PagedResults listClient(Client.PageRequest input, long timeout) {
		br.com.senior.mydomain.myservice.impl.ListClientImpl impl = new br.com.senior.mydomain.myservice.impl.ListClientImpl(messengerSupplier, userId, messageSupplier);
		return impl.listClient(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método listClient
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'list' request primitive for the Client entity.
	 */
	@Override
	public void listClient(Client.PageRequest input) {
		br.com.senior.mydomain.myservice.impl.ListClientImpl impl = new br.com.senior.mydomain.myservice.impl.ListClientImpl(messengerSupplier, userId, messageSupplier);
		impl.listClient(input);
	}
	
	/**
	 * Chamada assíncrona para o método listClient
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'list' request primitive for the Client entity.
	 */
	@Override
	public CompletableFuture<Client.PagedResults> listClientRequest(Client.PageRequest input) {
		return this.listClientRequest(input, 0l);
	}
	
	/**
	 * Chamada assíncrona para o método listClient
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'list' request primitive for the Client entity.
	*/
	@Override
	public CompletableFuture<Client.PagedResults> listClientRequest(Client.PageRequest input, long timeout) {
		br.com.senior.mydomain.myservice.impl.ListClientImpl impl = new br.com.senior.mydomain.myservice.impl.ListClientImpl(messengerSupplier, userId, messageSupplier);
		return impl.listClientRequest(input, timeout, TimeUnit.MILLISECONDS);
	}
	/**
	 * Chamada síncrona para o método updateClient
	 * This is a public operation
	 * The 'update' request primitive for the Client entity.
	 * @throws MyServiceMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public Client updateClient(Client input, long timeout) {
		br.com.senior.mydomain.myservice.impl.UpdateClientImpl impl = new br.com.senior.mydomain.myservice.impl.UpdateClientImpl(messengerSupplier, userId, messageSupplier);
		return impl.updateClient(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método updateClient
	 * This is a public operation
	 * The 'update' request primitive for the Client entity.
	 */
	@Override
	public void updateClient(Client input) {
		br.com.senior.mydomain.myservice.impl.UpdateClientImpl impl = new br.com.senior.mydomain.myservice.impl.UpdateClientImpl(messengerSupplier, userId, messageSupplier);
		impl.updateClient(input);
	}
	
	/**
	 * Chamada assíncrona para o método updateClient
	 * This is a public operation
	 * The 'update' request primitive for the Client entity.
	 */
	@Override
	public CompletableFuture<Client> updateClientRequest(Client input) {
		return this.updateClientRequest(input, 0l);
	}
	
	/**
	 * Chamada assíncrona para o método updateClient
	 * This is a public operation
	 * The 'update' request primitive for the Client entity.
	*/
	@Override
	public CompletableFuture<Client> updateClientRequest(Client input, long timeout) {
		br.com.senior.mydomain.myservice.impl.UpdateClientImpl impl = new br.com.senior.mydomain.myservice.impl.UpdateClientImpl(messengerSupplier, userId, messageSupplier);
		return impl.updateClientRequest(input, timeout, TimeUnit.MILLISECONDS);
	}
	/**
	 * Chamada síncrona para o método updateMergeClient
	 * This is a public operation
	 * The 'updateMerge' request primitive for the Client entity.
	 * @throws MyServiceMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public Client updateMergeClient(Client input, long timeout) {
		br.com.senior.mydomain.myservice.impl.UpdateMergeClientImpl impl = new br.com.senior.mydomain.myservice.impl.UpdateMergeClientImpl(messengerSupplier, userId, messageSupplier);
		return impl.updateMergeClient(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método updateMergeClient
	 * This is a public operation
	 * The 'updateMerge' request primitive for the Client entity.
	 */
	@Override
	public void updateMergeClient(Client input) {
		br.com.senior.mydomain.myservice.impl.UpdateMergeClientImpl impl = new br.com.senior.mydomain.myservice.impl.UpdateMergeClientImpl(messengerSupplier, userId, messageSupplier);
		impl.updateMergeClient(input);
	}
	
	/**
	 * Chamada assíncrona para o método updateMergeClient
	 * This is a public operation
	 * The 'updateMerge' request primitive for the Client entity.
	 */
	@Override
	public CompletableFuture<Client> updateMergeClientRequest(Client input) {
		return this.updateMergeClientRequest(input, 0l);
	}
	
	/**
	 * Chamada assíncrona para o método updateMergeClient
	 * This is a public operation
	 * The 'updateMerge' request primitive for the Client entity.
	*/
	@Override
	public CompletableFuture<Client> updateMergeClientRequest(Client input, long timeout) {
		br.com.senior.mydomain.myservice.impl.UpdateMergeClientImpl impl = new br.com.senior.mydomain.myservice.impl.UpdateMergeClientImpl(messengerSupplier, userId, messageSupplier);
		return impl.updateMergeClientRequest(input, timeout, TimeUnit.MILLISECONDS);
	}
	/**
	 * Chamada síncrona para o método deleteClient
	 * This is a public operation
	 * The 'delete' request primitive for the Client entity.
	 * @throws MyServiceMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public void deleteClient(Client.Id input, long timeout) {
		br.com.senior.mydomain.myservice.impl.DeleteClientImpl impl = new br.com.senior.mydomain.myservice.impl.DeleteClientImpl(messengerSupplier, userId, messageSupplier);
		impl.deleteClient(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método deleteClient
	 * This is a public operation
	 * The 'delete' request primitive for the Client entity.
	 */
	@Override
	public void deleteClient(Client.Id input) {
		br.com.senior.mydomain.myservice.impl.DeleteClientImpl impl = new br.com.senior.mydomain.myservice.impl.DeleteClientImpl(messengerSupplier, userId, messageSupplier);
		impl.deleteClient(input);
	}
	
	
	/**
	 * Chamada síncrona para o método createProduct
	 * This is a public operation
	 * The 'create' request primitive for the Product entity.
	 * @throws MyServiceMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public Product createProduct(Product input, long timeout) {
		br.com.senior.mydomain.myservice.impl.CreateProductImpl impl = new br.com.senior.mydomain.myservice.impl.CreateProductImpl(messengerSupplier, userId, messageSupplier);
		return impl.createProduct(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método createProduct
	 * This is a public operation
	 * The 'create' request primitive for the Product entity.
	 */
	@Override
	public void createProduct(Product input) {
		br.com.senior.mydomain.myservice.impl.CreateProductImpl impl = new br.com.senior.mydomain.myservice.impl.CreateProductImpl(messengerSupplier, userId, messageSupplier);
		impl.createProduct(input);
	}
	
	/**
	 * Chamada assíncrona para o método createProduct
	 * This is a public operation
	 * The 'create' request primitive for the Product entity.
	 */
	@Override
	public CompletableFuture<Product> createProductRequest(Product input) {
		return this.createProductRequest(input, 0l);
	}
	
	/**
	 * Chamada assíncrona para o método createProduct
	 * This is a public operation
	 * The 'create' request primitive for the Product entity.
	*/
	@Override
	public CompletableFuture<Product> createProductRequest(Product input, long timeout) {
		br.com.senior.mydomain.myservice.impl.CreateProductImpl impl = new br.com.senior.mydomain.myservice.impl.CreateProductImpl(messengerSupplier, userId, messageSupplier);
		return impl.createProductRequest(input, timeout, TimeUnit.MILLISECONDS);
	}
	/**
	 * Chamada síncrona para o método createBulkProduct
	 * This is a public operation
	 * The 'createBulk' request primitive for the Product entity.
	 * @throws MyServiceMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public CreateBulkProductOutput createBulkProduct(CreateBulkProductInput input, long timeout) {
		br.com.senior.mydomain.myservice.impl.CreateBulkProductImpl impl = new br.com.senior.mydomain.myservice.impl.CreateBulkProductImpl(messengerSupplier, userId, messageSupplier);
		return impl.createBulkProduct(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método createBulkProduct
	 * This is a public operation
	 * The 'createBulk' request primitive for the Product entity.
	 */
	@Override
	public void createBulkProduct(CreateBulkProductInput input) {
		br.com.senior.mydomain.myservice.impl.CreateBulkProductImpl impl = new br.com.senior.mydomain.myservice.impl.CreateBulkProductImpl(messengerSupplier, userId, messageSupplier);
		impl.createBulkProduct(input);
	}
	
	/**
	 * Chamada assíncrona para o método createBulkProduct
	 * This is a public operation
	 * The 'createBulk' request primitive for the Product entity.
	 */
	@Override
	public CompletableFuture<CreateBulkProductOutput> createBulkProductRequest(CreateBulkProductInput input) {
		return this.createBulkProductRequest(input, 0l);
	}
	
	/**
	 * Chamada assíncrona para o método createBulkProduct
	 * This is a public operation
	 * The 'createBulk' request primitive for the Product entity.
	*/
	@Override
	public CompletableFuture<CreateBulkProductOutput> createBulkProductRequest(CreateBulkProductInput input, long timeout) {
		br.com.senior.mydomain.myservice.impl.CreateBulkProductImpl impl = new br.com.senior.mydomain.myservice.impl.CreateBulkProductImpl(messengerSupplier, userId, messageSupplier);
		return impl.createBulkProductRequest(input, timeout, TimeUnit.MILLISECONDS);
	}
	/**
	 * Chamada síncrona para o método createMergeProduct
	 * This is a public operation
	 * The 'createMerge' request primitive for the Product entity.
	 * @throws MyServiceMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public Product createMergeProduct(Product input, long timeout) {
		br.com.senior.mydomain.myservice.impl.CreateMergeProductImpl impl = new br.com.senior.mydomain.myservice.impl.CreateMergeProductImpl(messengerSupplier, userId, messageSupplier);
		return impl.createMergeProduct(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método createMergeProduct
	 * This is a public operation
	 * The 'createMerge' request primitive for the Product entity.
	 */
	@Override
	public void createMergeProduct(Product input) {
		br.com.senior.mydomain.myservice.impl.CreateMergeProductImpl impl = new br.com.senior.mydomain.myservice.impl.CreateMergeProductImpl(messengerSupplier, userId, messageSupplier);
		impl.createMergeProduct(input);
	}
	
	/**
	 * Chamada assíncrona para o método createMergeProduct
	 * This is a public operation
	 * The 'createMerge' request primitive for the Product entity.
	 */
	@Override
	public CompletableFuture<Product> createMergeProductRequest(Product input) {
		return this.createMergeProductRequest(input, 0l);
	}
	
	/**
	 * Chamada assíncrona para o método createMergeProduct
	 * This is a public operation
	 * The 'createMerge' request primitive for the Product entity.
	*/
	@Override
	public CompletableFuture<Product> createMergeProductRequest(Product input, long timeout) {
		br.com.senior.mydomain.myservice.impl.CreateMergeProductImpl impl = new br.com.senior.mydomain.myservice.impl.CreateMergeProductImpl(messengerSupplier, userId, messageSupplier);
		return impl.createMergeProductRequest(input, timeout, TimeUnit.MILLISECONDS);
	}
	/**
	 * Chamada síncrona para o método retrieveProduct
	 * This is a public operation
	 * The 'retrieve' request primitive for the Product entity.
	 * @throws MyServiceMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public Product retrieveProduct(Product.GetRequest input, long timeout) {
		br.com.senior.mydomain.myservice.impl.RetrieveProductImpl impl = new br.com.senior.mydomain.myservice.impl.RetrieveProductImpl(messengerSupplier, userId, messageSupplier);
		return impl.retrieveProduct(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método retrieveProduct
	 * This is a public operation
	 * The 'retrieve' request primitive for the Product entity.
	 */
	@Override
	public void retrieveProduct(Product.GetRequest input) {
		br.com.senior.mydomain.myservice.impl.RetrieveProductImpl impl = new br.com.senior.mydomain.myservice.impl.RetrieveProductImpl(messengerSupplier, userId, messageSupplier);
		impl.retrieveProduct(input);
	}
	
	/**
	 * Chamada assíncrona para o método retrieveProduct
	 * This is a public operation
	 * The 'retrieve' request primitive for the Product entity.
	 */
	@Override
	public CompletableFuture<Product> retrieveProductRequest(Product.GetRequest input) {
		return this.retrieveProductRequest(input, 0l);
	}
	
	/**
	 * Chamada assíncrona para o método retrieveProduct
	 * This is a public operation
	 * The 'retrieve' request primitive for the Product entity.
	*/
	@Override
	public CompletableFuture<Product> retrieveProductRequest(Product.GetRequest input, long timeout) {
		br.com.senior.mydomain.myservice.impl.RetrieveProductImpl impl = new br.com.senior.mydomain.myservice.impl.RetrieveProductImpl(messengerSupplier, userId, messageSupplier);
		return impl.retrieveProductRequest(input, timeout, TimeUnit.MILLISECONDS);
	}
	/**
	 * Chamada síncrona para o método listProduct
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'list' request primitive for the Product entity.
	 * @throws MyServiceMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public Product.PagedResults listProduct(Product.PageRequest input, long timeout) {
		br.com.senior.mydomain.myservice.impl.ListProductImpl impl = new br.com.senior.mydomain.myservice.impl.ListProductImpl(messengerSupplier, userId, messageSupplier);
		return impl.listProduct(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método listProduct
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'list' request primitive for the Product entity.
	 */
	@Override
	public void listProduct(Product.PageRequest input) {
		br.com.senior.mydomain.myservice.impl.ListProductImpl impl = new br.com.senior.mydomain.myservice.impl.ListProductImpl(messengerSupplier, userId, messageSupplier);
		impl.listProduct(input);
	}
	
	/**
	 * Chamada assíncrona para o método listProduct
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'list' request primitive for the Product entity.
	 */
	@Override
	public CompletableFuture<Product.PagedResults> listProductRequest(Product.PageRequest input) {
		return this.listProductRequest(input, 0l);
	}
	
	/**
	 * Chamada assíncrona para o método listProduct
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'list' request primitive for the Product entity.
	*/
	@Override
	public CompletableFuture<Product.PagedResults> listProductRequest(Product.PageRequest input, long timeout) {
		br.com.senior.mydomain.myservice.impl.ListProductImpl impl = new br.com.senior.mydomain.myservice.impl.ListProductImpl(messengerSupplier, userId, messageSupplier);
		return impl.listProductRequest(input, timeout, TimeUnit.MILLISECONDS);
	}
	/**
	 * Chamada síncrona para o método updateProduct
	 * This is a public operation
	 * The 'update' request primitive for the Product entity.
	 * @throws MyServiceMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public Product updateProduct(Product input, long timeout) {
		br.com.senior.mydomain.myservice.impl.UpdateProductImpl impl = new br.com.senior.mydomain.myservice.impl.UpdateProductImpl(messengerSupplier, userId, messageSupplier);
		return impl.updateProduct(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método updateProduct
	 * This is a public operation
	 * The 'update' request primitive for the Product entity.
	 */
	@Override
	public void updateProduct(Product input) {
		br.com.senior.mydomain.myservice.impl.UpdateProductImpl impl = new br.com.senior.mydomain.myservice.impl.UpdateProductImpl(messengerSupplier, userId, messageSupplier);
		impl.updateProduct(input);
	}
	
	/**
	 * Chamada assíncrona para o método updateProduct
	 * This is a public operation
	 * The 'update' request primitive for the Product entity.
	 */
	@Override
	public CompletableFuture<Product> updateProductRequest(Product input) {
		return this.updateProductRequest(input, 0l);
	}
	
	/**
	 * Chamada assíncrona para o método updateProduct
	 * This is a public operation
	 * The 'update' request primitive for the Product entity.
	*/
	@Override
	public CompletableFuture<Product> updateProductRequest(Product input, long timeout) {
		br.com.senior.mydomain.myservice.impl.UpdateProductImpl impl = new br.com.senior.mydomain.myservice.impl.UpdateProductImpl(messengerSupplier, userId, messageSupplier);
		return impl.updateProductRequest(input, timeout, TimeUnit.MILLISECONDS);
	}
	/**
	 * Chamada síncrona para o método updateMergeProduct
	 * This is a public operation
	 * The 'updateMerge' request primitive for the Product entity.
	 * @throws MyServiceMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public Product updateMergeProduct(Product input, long timeout) {
		br.com.senior.mydomain.myservice.impl.UpdateMergeProductImpl impl = new br.com.senior.mydomain.myservice.impl.UpdateMergeProductImpl(messengerSupplier, userId, messageSupplier);
		return impl.updateMergeProduct(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método updateMergeProduct
	 * This is a public operation
	 * The 'updateMerge' request primitive for the Product entity.
	 */
	@Override
	public void updateMergeProduct(Product input) {
		br.com.senior.mydomain.myservice.impl.UpdateMergeProductImpl impl = new br.com.senior.mydomain.myservice.impl.UpdateMergeProductImpl(messengerSupplier, userId, messageSupplier);
		impl.updateMergeProduct(input);
	}
	
	/**
	 * Chamada assíncrona para o método updateMergeProduct
	 * This is a public operation
	 * The 'updateMerge' request primitive for the Product entity.
	 */
	@Override
	public CompletableFuture<Product> updateMergeProductRequest(Product input) {
		return this.updateMergeProductRequest(input, 0l);
	}
	
	/**
	 * Chamada assíncrona para o método updateMergeProduct
	 * This is a public operation
	 * The 'updateMerge' request primitive for the Product entity.
	*/
	@Override
	public CompletableFuture<Product> updateMergeProductRequest(Product input, long timeout) {
		br.com.senior.mydomain.myservice.impl.UpdateMergeProductImpl impl = new br.com.senior.mydomain.myservice.impl.UpdateMergeProductImpl(messengerSupplier, userId, messageSupplier);
		return impl.updateMergeProductRequest(input, timeout, TimeUnit.MILLISECONDS);
	}
	/**
	 * Chamada síncrona para o método deleteProduct
	 * This is a public operation
	 * The 'delete' request primitive for the Product entity.
	 * @throws MyServiceMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public void deleteProduct(Product.Id input, long timeout) {
		br.com.senior.mydomain.myservice.impl.DeleteProductImpl impl = new br.com.senior.mydomain.myservice.impl.DeleteProductImpl(messengerSupplier, userId, messageSupplier);
		impl.deleteProduct(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método deleteProduct
	 * This is a public operation
	 * The 'delete' request primitive for the Product entity.
	 */
	@Override
	public void deleteProduct(Product.Id input) {
		br.com.senior.mydomain.myservice.impl.DeleteProductImpl impl = new br.com.senior.mydomain.myservice.impl.DeleteProductImpl(messengerSupplier, userId, messageSupplier);
		impl.deleteProduct(input);
	}
	
	
	/**
	 * Chamada síncrona para o método createPedido
	 * This is a public operation
	 * The 'create' request primitive for the Pedido entity.
	 * @throws MyServiceMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public Pedido createPedido(Pedido input, long timeout) {
		br.com.senior.mydomain.myservice.impl.CreatePedidoImpl impl = new br.com.senior.mydomain.myservice.impl.CreatePedidoImpl(messengerSupplier, userId, messageSupplier);
		return impl.createPedido(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método createPedido
	 * This is a public operation
	 * The 'create' request primitive for the Pedido entity.
	 */
	@Override
	public void createPedido(Pedido input) {
		br.com.senior.mydomain.myservice.impl.CreatePedidoImpl impl = new br.com.senior.mydomain.myservice.impl.CreatePedidoImpl(messengerSupplier, userId, messageSupplier);
		impl.createPedido(input);
	}
	
	/**
	 * Chamada assíncrona para o método createPedido
	 * This is a public operation
	 * The 'create' request primitive for the Pedido entity.
	 */
	@Override
	public CompletableFuture<Pedido> createPedidoRequest(Pedido input) {
		return this.createPedidoRequest(input, 0l);
	}
	
	/**
	 * Chamada assíncrona para o método createPedido
	 * This is a public operation
	 * The 'create' request primitive for the Pedido entity.
	*/
	@Override
	public CompletableFuture<Pedido> createPedidoRequest(Pedido input, long timeout) {
		br.com.senior.mydomain.myservice.impl.CreatePedidoImpl impl = new br.com.senior.mydomain.myservice.impl.CreatePedidoImpl(messengerSupplier, userId, messageSupplier);
		return impl.createPedidoRequest(input, timeout, TimeUnit.MILLISECONDS);
	}
	/**
	 * Chamada síncrona para o método createBulkPedido
	 * This is a public operation
	 * The 'createBulk' request primitive for the Pedido entity.
	 * @throws MyServiceMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public CreateBulkPedidoOutput createBulkPedido(CreateBulkPedidoInput input, long timeout) {
		br.com.senior.mydomain.myservice.impl.CreateBulkPedidoImpl impl = new br.com.senior.mydomain.myservice.impl.CreateBulkPedidoImpl(messengerSupplier, userId, messageSupplier);
		return impl.createBulkPedido(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método createBulkPedido
	 * This is a public operation
	 * The 'createBulk' request primitive for the Pedido entity.
	 */
	@Override
	public void createBulkPedido(CreateBulkPedidoInput input) {
		br.com.senior.mydomain.myservice.impl.CreateBulkPedidoImpl impl = new br.com.senior.mydomain.myservice.impl.CreateBulkPedidoImpl(messengerSupplier, userId, messageSupplier);
		impl.createBulkPedido(input);
	}
	
	/**
	 * Chamada assíncrona para o método createBulkPedido
	 * This is a public operation
	 * The 'createBulk' request primitive for the Pedido entity.
	 */
	@Override
	public CompletableFuture<CreateBulkPedidoOutput> createBulkPedidoRequest(CreateBulkPedidoInput input) {
		return this.createBulkPedidoRequest(input, 0l);
	}
	
	/**
	 * Chamada assíncrona para o método createBulkPedido
	 * This is a public operation
	 * The 'createBulk' request primitive for the Pedido entity.
	*/
	@Override
	public CompletableFuture<CreateBulkPedidoOutput> createBulkPedidoRequest(CreateBulkPedidoInput input, long timeout) {
		br.com.senior.mydomain.myservice.impl.CreateBulkPedidoImpl impl = new br.com.senior.mydomain.myservice.impl.CreateBulkPedidoImpl(messengerSupplier, userId, messageSupplier);
		return impl.createBulkPedidoRequest(input, timeout, TimeUnit.MILLISECONDS);
	}
	/**
	 * Chamada síncrona para o método createMergePedido
	 * This is a public operation
	 * The 'createMerge' request primitive for the Pedido entity.
	 * @throws MyServiceMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public Pedido createMergePedido(Pedido input, long timeout) {
		br.com.senior.mydomain.myservice.impl.CreateMergePedidoImpl impl = new br.com.senior.mydomain.myservice.impl.CreateMergePedidoImpl(messengerSupplier, userId, messageSupplier);
		return impl.createMergePedido(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método createMergePedido
	 * This is a public operation
	 * The 'createMerge' request primitive for the Pedido entity.
	 */
	@Override
	public void createMergePedido(Pedido input) {
		br.com.senior.mydomain.myservice.impl.CreateMergePedidoImpl impl = new br.com.senior.mydomain.myservice.impl.CreateMergePedidoImpl(messengerSupplier, userId, messageSupplier);
		impl.createMergePedido(input);
	}
	
	/**
	 * Chamada assíncrona para o método createMergePedido
	 * This is a public operation
	 * The 'createMerge' request primitive for the Pedido entity.
	 */
	@Override
	public CompletableFuture<Pedido> createMergePedidoRequest(Pedido input) {
		return this.createMergePedidoRequest(input, 0l);
	}
	
	/**
	 * Chamada assíncrona para o método createMergePedido
	 * This is a public operation
	 * The 'createMerge' request primitive for the Pedido entity.
	*/
	@Override
	public CompletableFuture<Pedido> createMergePedidoRequest(Pedido input, long timeout) {
		br.com.senior.mydomain.myservice.impl.CreateMergePedidoImpl impl = new br.com.senior.mydomain.myservice.impl.CreateMergePedidoImpl(messengerSupplier, userId, messageSupplier);
		return impl.createMergePedidoRequest(input, timeout, TimeUnit.MILLISECONDS);
	}
	/**
	 * Chamada síncrona para o método retrievePedido
	 * This is a public operation
	 * The 'retrieve' request primitive for the Pedido entity.
	 * @throws MyServiceMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public Pedido retrievePedido(Pedido.GetRequest input, long timeout) {
		br.com.senior.mydomain.myservice.impl.RetrievePedidoImpl impl = new br.com.senior.mydomain.myservice.impl.RetrievePedidoImpl(messengerSupplier, userId, messageSupplier);
		return impl.retrievePedido(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método retrievePedido
	 * This is a public operation
	 * The 'retrieve' request primitive for the Pedido entity.
	 */
	@Override
	public void retrievePedido(Pedido.GetRequest input) {
		br.com.senior.mydomain.myservice.impl.RetrievePedidoImpl impl = new br.com.senior.mydomain.myservice.impl.RetrievePedidoImpl(messengerSupplier, userId, messageSupplier);
		impl.retrievePedido(input);
	}
	
	/**
	 * Chamada assíncrona para o método retrievePedido
	 * This is a public operation
	 * The 'retrieve' request primitive for the Pedido entity.
	 */
	@Override
	public CompletableFuture<Pedido> retrievePedidoRequest(Pedido.GetRequest input) {
		return this.retrievePedidoRequest(input, 0l);
	}
	
	/**
	 * Chamada assíncrona para o método retrievePedido
	 * This is a public operation
	 * The 'retrieve' request primitive for the Pedido entity.
	*/
	@Override
	public CompletableFuture<Pedido> retrievePedidoRequest(Pedido.GetRequest input, long timeout) {
		br.com.senior.mydomain.myservice.impl.RetrievePedidoImpl impl = new br.com.senior.mydomain.myservice.impl.RetrievePedidoImpl(messengerSupplier, userId, messageSupplier);
		return impl.retrievePedidoRequest(input, timeout, TimeUnit.MILLISECONDS);
	}
	/**
	 * Chamada síncrona para o método listPedido
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'list' request primitive for the Pedido entity.
	 * @throws MyServiceMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public Pedido.PagedResults listPedido(Pedido.PageRequest input, long timeout) {
		br.com.senior.mydomain.myservice.impl.ListPedidoImpl impl = new br.com.senior.mydomain.myservice.impl.ListPedidoImpl(messengerSupplier, userId, messageSupplier);
		return impl.listPedido(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método listPedido
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'list' request primitive for the Pedido entity.
	 */
	@Override
	public void listPedido(Pedido.PageRequest input) {
		br.com.senior.mydomain.myservice.impl.ListPedidoImpl impl = new br.com.senior.mydomain.myservice.impl.ListPedidoImpl(messengerSupplier, userId, messageSupplier);
		impl.listPedido(input);
	}
	
	/**
	 * Chamada assíncrona para o método listPedido
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'list' request primitive for the Pedido entity.
	 */
	@Override
	public CompletableFuture<Pedido.PagedResults> listPedidoRequest(Pedido.PageRequest input) {
		return this.listPedidoRequest(input, 0l);
	}
	
	/**
	 * Chamada assíncrona para o método listPedido
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'list' request primitive for the Pedido entity.
	*/
	@Override
	public CompletableFuture<Pedido.PagedResults> listPedidoRequest(Pedido.PageRequest input, long timeout) {
		br.com.senior.mydomain.myservice.impl.ListPedidoImpl impl = new br.com.senior.mydomain.myservice.impl.ListPedidoImpl(messengerSupplier, userId, messageSupplier);
		return impl.listPedidoRequest(input, timeout, TimeUnit.MILLISECONDS);
	}
	/**
	 * Chamada síncrona para o método updatePedido
	 * This is a public operation
	 * The 'update' request primitive for the Pedido entity.
	 * @throws MyServiceMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public Pedido updatePedido(Pedido input, long timeout) {
		br.com.senior.mydomain.myservice.impl.UpdatePedidoImpl impl = new br.com.senior.mydomain.myservice.impl.UpdatePedidoImpl(messengerSupplier, userId, messageSupplier);
		return impl.updatePedido(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método updatePedido
	 * This is a public operation
	 * The 'update' request primitive for the Pedido entity.
	 */
	@Override
	public void updatePedido(Pedido input) {
		br.com.senior.mydomain.myservice.impl.UpdatePedidoImpl impl = new br.com.senior.mydomain.myservice.impl.UpdatePedidoImpl(messengerSupplier, userId, messageSupplier);
		impl.updatePedido(input);
	}
	
	/**
	 * Chamada assíncrona para o método updatePedido
	 * This is a public operation
	 * The 'update' request primitive for the Pedido entity.
	 */
	@Override
	public CompletableFuture<Pedido> updatePedidoRequest(Pedido input) {
		return this.updatePedidoRequest(input, 0l);
	}
	
	/**
	 * Chamada assíncrona para o método updatePedido
	 * This is a public operation
	 * The 'update' request primitive for the Pedido entity.
	*/
	@Override
	public CompletableFuture<Pedido> updatePedidoRequest(Pedido input, long timeout) {
		br.com.senior.mydomain.myservice.impl.UpdatePedidoImpl impl = new br.com.senior.mydomain.myservice.impl.UpdatePedidoImpl(messengerSupplier, userId, messageSupplier);
		return impl.updatePedidoRequest(input, timeout, TimeUnit.MILLISECONDS);
	}
	/**
	 * Chamada síncrona para o método updateMergePedido
	 * This is a public operation
	 * The 'updateMerge' request primitive for the Pedido entity.
	 * @throws MyServiceMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public Pedido updateMergePedido(Pedido input, long timeout) {
		br.com.senior.mydomain.myservice.impl.UpdateMergePedidoImpl impl = new br.com.senior.mydomain.myservice.impl.UpdateMergePedidoImpl(messengerSupplier, userId, messageSupplier);
		return impl.updateMergePedido(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método updateMergePedido
	 * This is a public operation
	 * The 'updateMerge' request primitive for the Pedido entity.
	 */
	@Override
	public void updateMergePedido(Pedido input) {
		br.com.senior.mydomain.myservice.impl.UpdateMergePedidoImpl impl = new br.com.senior.mydomain.myservice.impl.UpdateMergePedidoImpl(messengerSupplier, userId, messageSupplier);
		impl.updateMergePedido(input);
	}
	
	/**
	 * Chamada assíncrona para o método updateMergePedido
	 * This is a public operation
	 * The 'updateMerge' request primitive for the Pedido entity.
	 */
	@Override
	public CompletableFuture<Pedido> updateMergePedidoRequest(Pedido input) {
		return this.updateMergePedidoRequest(input, 0l);
	}
	
	/**
	 * Chamada assíncrona para o método updateMergePedido
	 * This is a public operation
	 * The 'updateMerge' request primitive for the Pedido entity.
	*/
	@Override
	public CompletableFuture<Pedido> updateMergePedidoRequest(Pedido input, long timeout) {
		br.com.senior.mydomain.myservice.impl.UpdateMergePedidoImpl impl = new br.com.senior.mydomain.myservice.impl.UpdateMergePedidoImpl(messengerSupplier, userId, messageSupplier);
		return impl.updateMergePedidoRequest(input, timeout, TimeUnit.MILLISECONDS);
	}
	/**
	 * Chamada síncrona para o método deletePedido
	 * This is a public operation
	 * The 'delete' request primitive for the Pedido entity.
	 * @throws MyServiceMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public void deletePedido(Pedido.Id input, long timeout) {
		br.com.senior.mydomain.myservice.impl.DeletePedidoImpl impl = new br.com.senior.mydomain.myservice.impl.DeletePedidoImpl(messengerSupplier, userId, messageSupplier);
		impl.deletePedido(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método deletePedido
	 * This is a public operation
	 * The 'delete' request primitive for the Pedido entity.
	 */
	@Override
	public void deletePedido(Pedido.Id input) {
		br.com.senior.mydomain.myservice.impl.DeletePedidoImpl impl = new br.com.senior.mydomain.myservice.impl.DeletePedidoImpl(messengerSupplier, userId, messageSupplier);
		impl.deletePedido(input);
	}
	
	
	/**
	 * Chamada síncrona para o método createPedido_Items
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'create' request primitive for the items attribute of pedido entity.\nThis primitive requires the header 'entity_parent_id' with id of parent pedido entity.
	 * @throws MyServiceMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public Item createPedido_Items(Pedido.Id parentId, Item input, long timeout) {
		br.com.senior.mydomain.myservice.impl.CreatePedido_ItemsImpl impl = new br.com.senior.mydomain.myservice.impl.CreatePedido_ItemsImpl(messengerSupplier, userId, messageSupplier);
		return impl.createPedido_Items(parentId, input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método createPedido_Items
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'create' request primitive for the items attribute of pedido entity.\nThis primitive requires the header 'entity_parent_id' with id of parent pedido entity.
	 */
	@Override
	public void createPedido_Items(Pedido.Id parentId, Item input) {
		br.com.senior.mydomain.myservice.impl.CreatePedido_ItemsImpl impl = new br.com.senior.mydomain.myservice.impl.CreatePedido_ItemsImpl(messengerSupplier, userId, messageSupplier);
		impl.createPedido_Items(parentId, input);
	}
	
	/**
	 * Chamada assíncrona para o método createPedido_Items
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'create' request primitive for the items attribute of pedido entity.\nThis primitive requires the header 'entity_parent_id' with id of parent pedido entity.
	 */
	@Override
	public CompletableFuture<Item> createPedido_ItemsRequest(Pedido.Id parentId, Item input) {
		return this.createPedido_ItemsRequest(parentId, input, 0l);
	}
	
	/**
	 * Chamada assíncrona para o método createPedido_Items
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'create' request primitive for the items attribute of pedido entity.\nThis primitive requires the header 'entity_parent_id' with id of parent pedido entity.
	*/
	@Override
	public CompletableFuture<Item> createPedido_ItemsRequest(Pedido.Id parentId, Item input, long timeout) {
		br.com.senior.mydomain.myservice.impl.CreatePedido_ItemsImpl impl = new br.com.senior.mydomain.myservice.impl.CreatePedido_ItemsImpl(messengerSupplier, userId, messageSupplier);
		return impl.createPedido_ItemsRequest(parentId, input, timeout, TimeUnit.MILLISECONDS);
	}
	/**
	 * Chamada síncrona para o método createMergePedido_Items
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'createMerge' request primitive for the items attribute of pedido entity.\nThis primitive requires the header 'entity_parent_id' with id of parent pedido entity.
	 * @throws MyServiceMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public Item createMergePedido_Items(Pedido.Id parentId, Item input, long timeout) {
		br.com.senior.mydomain.myservice.impl.CreateMergePedido_ItemsImpl impl = new br.com.senior.mydomain.myservice.impl.CreateMergePedido_ItemsImpl(messengerSupplier, userId, messageSupplier);
		return impl.createMergePedido_Items(parentId, input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método createMergePedido_Items
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'createMerge' request primitive for the items attribute of pedido entity.\nThis primitive requires the header 'entity_parent_id' with id of parent pedido entity.
	 */
	@Override
	public void createMergePedido_Items(Pedido.Id parentId, Item input) {
		br.com.senior.mydomain.myservice.impl.CreateMergePedido_ItemsImpl impl = new br.com.senior.mydomain.myservice.impl.CreateMergePedido_ItemsImpl(messengerSupplier, userId, messageSupplier);
		impl.createMergePedido_Items(parentId, input);
	}
	
	/**
	 * Chamada assíncrona para o método createMergePedido_Items
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'createMerge' request primitive for the items attribute of pedido entity.\nThis primitive requires the header 'entity_parent_id' with id of parent pedido entity.
	 */
	@Override
	public CompletableFuture<Item> createMergePedido_ItemsRequest(Pedido.Id parentId, Item input) {
		return this.createMergePedido_ItemsRequest(parentId, input, 0l);
	}
	
	/**
	 * Chamada assíncrona para o método createMergePedido_Items
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'createMerge' request primitive for the items attribute of pedido entity.\nThis primitive requires the header 'entity_parent_id' with id of parent pedido entity.
	*/
	@Override
	public CompletableFuture<Item> createMergePedido_ItemsRequest(Pedido.Id parentId, Item input, long timeout) {
		br.com.senior.mydomain.myservice.impl.CreateMergePedido_ItemsImpl impl = new br.com.senior.mydomain.myservice.impl.CreateMergePedido_ItemsImpl(messengerSupplier, userId, messageSupplier);
		return impl.createMergePedido_ItemsRequest(parentId, input, timeout, TimeUnit.MILLISECONDS);
	}
	/**
	 * Chamada síncrona para o método updatePedido_Items
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'update' request primitive for the items attribute of pedido entity.\nThis primitive requires the header 'entity_parent_id' with id of parent pedido entity.
	 * @throws MyServiceMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public Item updatePedido_Items(Pedido.Id parentId, Item input, long timeout) {
		br.com.senior.mydomain.myservice.impl.UpdatePedido_ItemsImpl impl = new br.com.senior.mydomain.myservice.impl.UpdatePedido_ItemsImpl(messengerSupplier, userId, messageSupplier);
		return impl.updatePedido_Items(parentId, input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método updatePedido_Items
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'update' request primitive for the items attribute of pedido entity.\nThis primitive requires the header 'entity_parent_id' with id of parent pedido entity.
	 */
	@Override
	public void updatePedido_Items(Pedido.Id parentId, Item input) {
		br.com.senior.mydomain.myservice.impl.UpdatePedido_ItemsImpl impl = new br.com.senior.mydomain.myservice.impl.UpdatePedido_ItemsImpl(messengerSupplier, userId, messageSupplier);
		impl.updatePedido_Items(parentId, input);
	}
	
	/**
	 * Chamada assíncrona para o método updatePedido_Items
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'update' request primitive for the items attribute of pedido entity.\nThis primitive requires the header 'entity_parent_id' with id of parent pedido entity.
	 */
	@Override
	public CompletableFuture<Item> updatePedido_ItemsRequest(Pedido.Id parentId, Item input) {
		return this.updatePedido_ItemsRequest(parentId, input, 0l);
	}
	
	/**
	 * Chamada assíncrona para o método updatePedido_Items
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'update' request primitive for the items attribute of pedido entity.\nThis primitive requires the header 'entity_parent_id' with id of parent pedido entity.
	*/
	@Override
	public CompletableFuture<Item> updatePedido_ItemsRequest(Pedido.Id parentId, Item input, long timeout) {
		br.com.senior.mydomain.myservice.impl.UpdatePedido_ItemsImpl impl = new br.com.senior.mydomain.myservice.impl.UpdatePedido_ItemsImpl(messengerSupplier, userId, messageSupplier);
		return impl.updatePedido_ItemsRequest(parentId, input, timeout, TimeUnit.MILLISECONDS);
	}
	/**
	 * Chamada síncrona para o método updateMergePedido_Items
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'updateMerge' request primitive for the items attribute of pedido entity.\nThis primitive requires the header 'entity_parent_id' with id of parent pedido entity.
	 * @throws MyServiceMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public Item updateMergePedido_Items(Pedido.Id parentId, Item input, long timeout) {
		br.com.senior.mydomain.myservice.impl.UpdateMergePedido_ItemsImpl impl = new br.com.senior.mydomain.myservice.impl.UpdateMergePedido_ItemsImpl(messengerSupplier, userId, messageSupplier);
		return impl.updateMergePedido_Items(parentId, input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método updateMergePedido_Items
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'updateMerge' request primitive for the items attribute of pedido entity.\nThis primitive requires the header 'entity_parent_id' with id of parent pedido entity.
	 */
	@Override
	public void updateMergePedido_Items(Pedido.Id parentId, Item input) {
		br.com.senior.mydomain.myservice.impl.UpdateMergePedido_ItemsImpl impl = new br.com.senior.mydomain.myservice.impl.UpdateMergePedido_ItemsImpl(messengerSupplier, userId, messageSupplier);
		impl.updateMergePedido_Items(parentId, input);
	}
	
	/**
	 * Chamada assíncrona para o método updateMergePedido_Items
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'updateMerge' request primitive for the items attribute of pedido entity.\nThis primitive requires the header 'entity_parent_id' with id of parent pedido entity.
	 */
	@Override
	public CompletableFuture<Item> updateMergePedido_ItemsRequest(Pedido.Id parentId, Item input) {
		return this.updateMergePedido_ItemsRequest(parentId, input, 0l);
	}
	
	/**
	 * Chamada assíncrona para o método updateMergePedido_Items
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'updateMerge' request primitive for the items attribute of pedido entity.\nThis primitive requires the header 'entity_parent_id' with id of parent pedido entity.
	*/
	@Override
	public CompletableFuture<Item> updateMergePedido_ItemsRequest(Pedido.Id parentId, Item input, long timeout) {
		br.com.senior.mydomain.myservice.impl.UpdateMergePedido_ItemsImpl impl = new br.com.senior.mydomain.myservice.impl.UpdateMergePedido_ItemsImpl(messengerSupplier, userId, messageSupplier);
		return impl.updateMergePedido_ItemsRequest(parentId, input, timeout, TimeUnit.MILLISECONDS);
	}
	/**
	 * Chamada síncrona para o método retrievePedido_Items
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'retrieve' request primitive for the items attribute of pedido entity.\nThis primitive requires the header 'entity_parent_id' with id of parent pedido entity.
	 * @throws MyServiceMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public Item retrievePedido_Items(Pedido.Id parentId, Item.GetRequest input, long timeout) {
		br.com.senior.mydomain.myservice.impl.RetrievePedido_ItemsImpl impl = new br.com.senior.mydomain.myservice.impl.RetrievePedido_ItemsImpl(messengerSupplier, userId, messageSupplier);
		return impl.retrievePedido_Items(parentId, input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método retrievePedido_Items
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'retrieve' request primitive for the items attribute of pedido entity.\nThis primitive requires the header 'entity_parent_id' with id of parent pedido entity.
	 */
	@Override
	public void retrievePedido_Items(Pedido.Id parentId, Item.GetRequest input) {
		br.com.senior.mydomain.myservice.impl.RetrievePedido_ItemsImpl impl = new br.com.senior.mydomain.myservice.impl.RetrievePedido_ItemsImpl(messengerSupplier, userId, messageSupplier);
		impl.retrievePedido_Items(parentId, input);
	}
	
	/**
	 * Chamada assíncrona para o método retrievePedido_Items
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'retrieve' request primitive for the items attribute of pedido entity.\nThis primitive requires the header 'entity_parent_id' with id of parent pedido entity.
	 */
	@Override
	public CompletableFuture<Item> retrievePedido_ItemsRequest(Pedido.Id parentId, Item.GetRequest input) {
		return this.retrievePedido_ItemsRequest(parentId, input, 0l);
	}
	
	/**
	 * Chamada assíncrona para o método retrievePedido_Items
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'retrieve' request primitive for the items attribute of pedido entity.\nThis primitive requires the header 'entity_parent_id' with id of parent pedido entity.
	*/
	@Override
	public CompletableFuture<Item> retrievePedido_ItemsRequest(Pedido.Id parentId, Item.GetRequest input, long timeout) {
		br.com.senior.mydomain.myservice.impl.RetrievePedido_ItemsImpl impl = new br.com.senior.mydomain.myservice.impl.RetrievePedido_ItemsImpl(messengerSupplier, userId, messageSupplier);
		return impl.retrievePedido_ItemsRequest(parentId, input, timeout, TimeUnit.MILLISECONDS);
	}
	/**
	 * Chamada síncrona para o método deletePedido_Items
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'delete' request primitive for the items attribute of pedido entity.\nThis primitive requires the header 'entity_parent_id' with id of parent pedido entity.
	 * @throws MyServiceMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public void deletePedido_Items(Pedido.Id parentId, Item.Id input, long timeout) {
		br.com.senior.mydomain.myservice.impl.DeletePedido_ItemsImpl impl = new br.com.senior.mydomain.myservice.impl.DeletePedido_ItemsImpl(messengerSupplier, userId, messageSupplier);
		impl.deletePedido_Items(parentId, input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método deletePedido_Items
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'delete' request primitive for the items attribute of pedido entity.\nThis primitive requires the header 'entity_parent_id' with id of parent pedido entity.
	 */
	@Override
	public void deletePedido_Items(Pedido.Id parentId, Item.Id input) {
		br.com.senior.mydomain.myservice.impl.DeletePedido_ItemsImpl impl = new br.com.senior.mydomain.myservice.impl.DeletePedido_ItemsImpl(messengerSupplier, userId, messageSupplier);
		impl.deletePedido_Items(parentId, input);
	}
	
	
	/**
	 * Chamada síncrona para o método listPedido_Items
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'list' request primitive for the items attribute of pedido entity.\nThis primitive requires the header 'entity_parent_id' with id of parent pedido entity.
	 * @throws MyServiceMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public Item.PagedResults listPedido_Items(Pedido.Id parentId, Item.PageRequest input, long timeout) {
		br.com.senior.mydomain.myservice.impl.ListPedido_ItemsImpl impl = new br.com.senior.mydomain.myservice.impl.ListPedido_ItemsImpl(messengerSupplier, userId, messageSupplier);
		return impl.listPedido_Items(parentId, input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método listPedido_Items
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'list' request primitive for the items attribute of pedido entity.\nThis primitive requires the header 'entity_parent_id' with id of parent pedido entity.
	 */
	@Override
	public void listPedido_Items(Pedido.Id parentId, Item.PageRequest input) {
		br.com.senior.mydomain.myservice.impl.ListPedido_ItemsImpl impl = new br.com.senior.mydomain.myservice.impl.ListPedido_ItemsImpl(messengerSupplier, userId, messageSupplier);
		impl.listPedido_Items(parentId, input);
	}
	
	/**
	 * Chamada assíncrona para o método listPedido_Items
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'list' request primitive for the items attribute of pedido entity.\nThis primitive requires the header 'entity_parent_id' with id of parent pedido entity.
	 */
	@Override
	public CompletableFuture<Item.PagedResults> listPedido_ItemsRequest(Pedido.Id parentId, Item.PageRequest input) {
		return this.listPedido_ItemsRequest(parentId, input, 0l);
	}
	
	/**
	 * Chamada assíncrona para o método listPedido_Items
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'list' request primitive for the items attribute of pedido entity.\nThis primitive requires the header 'entity_parent_id' with id of parent pedido entity.
	*/
	@Override
	public CompletableFuture<Item.PagedResults> listPedido_ItemsRequest(Pedido.Id parentId, Item.PageRequest input, long timeout) {
		br.com.senior.mydomain.myservice.impl.ListPedido_ItemsImpl impl = new br.com.senior.mydomain.myservice.impl.ListPedido_ItemsImpl(messengerSupplier, userId, messageSupplier);
		return impl.listPedido_ItemsRequest(parentId, input, timeout, TimeUnit.MILLISECONDS);
	}
	/**
	 * Chamada síncrona para o método createItem
	 * This is a public operation
	 * The 'create' request primitive for the Item entity.
	 * @throws MyServiceMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public Item createItem(Item input, long timeout) {
		br.com.senior.mydomain.myservice.impl.CreateItemImpl impl = new br.com.senior.mydomain.myservice.impl.CreateItemImpl(messengerSupplier, userId, messageSupplier);
		return impl.createItem(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método createItem
	 * This is a public operation
	 * The 'create' request primitive for the Item entity.
	 */
	@Override
	public void createItem(Item input) {
		br.com.senior.mydomain.myservice.impl.CreateItemImpl impl = new br.com.senior.mydomain.myservice.impl.CreateItemImpl(messengerSupplier, userId, messageSupplier);
		impl.createItem(input);
	}
	
	/**
	 * Chamada assíncrona para o método createItem
	 * This is a public operation
	 * The 'create' request primitive for the Item entity.
	 */
	@Override
	public CompletableFuture<Item> createItemRequest(Item input) {
		return this.createItemRequest(input, 0l);
	}
	
	/**
	 * Chamada assíncrona para o método createItem
	 * This is a public operation
	 * The 'create' request primitive for the Item entity.
	*/
	@Override
	public CompletableFuture<Item> createItemRequest(Item input, long timeout) {
		br.com.senior.mydomain.myservice.impl.CreateItemImpl impl = new br.com.senior.mydomain.myservice.impl.CreateItemImpl(messengerSupplier, userId, messageSupplier);
		return impl.createItemRequest(input, timeout, TimeUnit.MILLISECONDS);
	}
	/**
	 * Chamada síncrona para o método createBulkItem
	 * This is a public operation
	 * The 'createBulk' request primitive for the Item entity.
	 * @throws MyServiceMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public CreateBulkItemOutput createBulkItem(CreateBulkItemInput input, long timeout) {
		br.com.senior.mydomain.myservice.impl.CreateBulkItemImpl impl = new br.com.senior.mydomain.myservice.impl.CreateBulkItemImpl(messengerSupplier, userId, messageSupplier);
		return impl.createBulkItem(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método createBulkItem
	 * This is a public operation
	 * The 'createBulk' request primitive for the Item entity.
	 */
	@Override
	public void createBulkItem(CreateBulkItemInput input) {
		br.com.senior.mydomain.myservice.impl.CreateBulkItemImpl impl = new br.com.senior.mydomain.myservice.impl.CreateBulkItemImpl(messengerSupplier, userId, messageSupplier);
		impl.createBulkItem(input);
	}
	
	/**
	 * Chamada assíncrona para o método createBulkItem
	 * This is a public operation
	 * The 'createBulk' request primitive for the Item entity.
	 */
	@Override
	public CompletableFuture<CreateBulkItemOutput> createBulkItemRequest(CreateBulkItemInput input) {
		return this.createBulkItemRequest(input, 0l);
	}
	
	/**
	 * Chamada assíncrona para o método createBulkItem
	 * This is a public operation
	 * The 'createBulk' request primitive for the Item entity.
	*/
	@Override
	public CompletableFuture<CreateBulkItemOutput> createBulkItemRequest(CreateBulkItemInput input, long timeout) {
		br.com.senior.mydomain.myservice.impl.CreateBulkItemImpl impl = new br.com.senior.mydomain.myservice.impl.CreateBulkItemImpl(messengerSupplier, userId, messageSupplier);
		return impl.createBulkItemRequest(input, timeout, TimeUnit.MILLISECONDS);
	}
	/**
	 * Chamada síncrona para o método createMergeItem
	 * This is a public operation
	 * The 'createMerge' request primitive for the Item entity.
	 * @throws MyServiceMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public Item createMergeItem(Item input, long timeout) {
		br.com.senior.mydomain.myservice.impl.CreateMergeItemImpl impl = new br.com.senior.mydomain.myservice.impl.CreateMergeItemImpl(messengerSupplier, userId, messageSupplier);
		return impl.createMergeItem(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método createMergeItem
	 * This is a public operation
	 * The 'createMerge' request primitive for the Item entity.
	 */
	@Override
	public void createMergeItem(Item input) {
		br.com.senior.mydomain.myservice.impl.CreateMergeItemImpl impl = new br.com.senior.mydomain.myservice.impl.CreateMergeItemImpl(messengerSupplier, userId, messageSupplier);
		impl.createMergeItem(input);
	}
	
	/**
	 * Chamada assíncrona para o método createMergeItem
	 * This is a public operation
	 * The 'createMerge' request primitive for the Item entity.
	 */
	@Override
	public CompletableFuture<Item> createMergeItemRequest(Item input) {
		return this.createMergeItemRequest(input, 0l);
	}
	
	/**
	 * Chamada assíncrona para o método createMergeItem
	 * This is a public operation
	 * The 'createMerge' request primitive for the Item entity.
	*/
	@Override
	public CompletableFuture<Item> createMergeItemRequest(Item input, long timeout) {
		br.com.senior.mydomain.myservice.impl.CreateMergeItemImpl impl = new br.com.senior.mydomain.myservice.impl.CreateMergeItemImpl(messengerSupplier, userId, messageSupplier);
		return impl.createMergeItemRequest(input, timeout, TimeUnit.MILLISECONDS);
	}
	/**
	 * Chamada síncrona para o método retrieveItem
	 * This is a public operation
	 * The 'retrieve' request primitive for the Item entity.
	 * @throws MyServiceMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public Item retrieveItem(Item.GetRequest input, long timeout) {
		br.com.senior.mydomain.myservice.impl.RetrieveItemImpl impl = new br.com.senior.mydomain.myservice.impl.RetrieveItemImpl(messengerSupplier, userId, messageSupplier);
		return impl.retrieveItem(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método retrieveItem
	 * This is a public operation
	 * The 'retrieve' request primitive for the Item entity.
	 */
	@Override
	public void retrieveItem(Item.GetRequest input) {
		br.com.senior.mydomain.myservice.impl.RetrieveItemImpl impl = new br.com.senior.mydomain.myservice.impl.RetrieveItemImpl(messengerSupplier, userId, messageSupplier);
		impl.retrieveItem(input);
	}
	
	/**
	 * Chamada assíncrona para o método retrieveItem
	 * This is a public operation
	 * The 'retrieve' request primitive for the Item entity.
	 */
	@Override
	public CompletableFuture<Item> retrieveItemRequest(Item.GetRequest input) {
		return this.retrieveItemRequest(input, 0l);
	}
	
	/**
	 * Chamada assíncrona para o método retrieveItem
	 * This is a public operation
	 * The 'retrieve' request primitive for the Item entity.
	*/
	@Override
	public CompletableFuture<Item> retrieveItemRequest(Item.GetRequest input, long timeout) {
		br.com.senior.mydomain.myservice.impl.RetrieveItemImpl impl = new br.com.senior.mydomain.myservice.impl.RetrieveItemImpl(messengerSupplier, userId, messageSupplier);
		return impl.retrieveItemRequest(input, timeout, TimeUnit.MILLISECONDS);
	}
	/**
	 * Chamada síncrona para o método listItem
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'list' request primitive for the Item entity.
	 * @throws MyServiceMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public Item.PagedResults listItem(Item.PageRequest input, long timeout) {
		br.com.senior.mydomain.myservice.impl.ListItemImpl impl = new br.com.senior.mydomain.myservice.impl.ListItemImpl(messengerSupplier, userId, messageSupplier);
		return impl.listItem(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método listItem
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'list' request primitive for the Item entity.
	 */
	@Override
	public void listItem(Item.PageRequest input) {
		br.com.senior.mydomain.myservice.impl.ListItemImpl impl = new br.com.senior.mydomain.myservice.impl.ListItemImpl(messengerSupplier, userId, messageSupplier);
		impl.listItem(input);
	}
	
	/**
	 * Chamada assíncrona para o método listItem
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'list' request primitive for the Item entity.
	 */
	@Override
	public CompletableFuture<Item.PagedResults> listItemRequest(Item.PageRequest input) {
		return this.listItemRequest(input, 0l);
	}
	
	/**
	 * Chamada assíncrona para o método listItem
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'list' request primitive for the Item entity.
	*/
	@Override
	public CompletableFuture<Item.PagedResults> listItemRequest(Item.PageRequest input, long timeout) {
		br.com.senior.mydomain.myservice.impl.ListItemImpl impl = new br.com.senior.mydomain.myservice.impl.ListItemImpl(messengerSupplier, userId, messageSupplier);
		return impl.listItemRequest(input, timeout, TimeUnit.MILLISECONDS);
	}
	/**
	 * Chamada síncrona para o método updateItem
	 * This is a public operation
	 * The 'update' request primitive for the Item entity.
	 * @throws MyServiceMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public Item updateItem(Item input, long timeout) {
		br.com.senior.mydomain.myservice.impl.UpdateItemImpl impl = new br.com.senior.mydomain.myservice.impl.UpdateItemImpl(messengerSupplier, userId, messageSupplier);
		return impl.updateItem(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método updateItem
	 * This is a public operation
	 * The 'update' request primitive for the Item entity.
	 */
	@Override
	public void updateItem(Item input) {
		br.com.senior.mydomain.myservice.impl.UpdateItemImpl impl = new br.com.senior.mydomain.myservice.impl.UpdateItemImpl(messengerSupplier, userId, messageSupplier);
		impl.updateItem(input);
	}
	
	/**
	 * Chamada assíncrona para o método updateItem
	 * This is a public operation
	 * The 'update' request primitive for the Item entity.
	 */
	@Override
	public CompletableFuture<Item> updateItemRequest(Item input) {
		return this.updateItemRequest(input, 0l);
	}
	
	/**
	 * Chamada assíncrona para o método updateItem
	 * This is a public operation
	 * The 'update' request primitive for the Item entity.
	*/
	@Override
	public CompletableFuture<Item> updateItemRequest(Item input, long timeout) {
		br.com.senior.mydomain.myservice.impl.UpdateItemImpl impl = new br.com.senior.mydomain.myservice.impl.UpdateItemImpl(messengerSupplier, userId, messageSupplier);
		return impl.updateItemRequest(input, timeout, TimeUnit.MILLISECONDS);
	}
	/**
	 * Chamada síncrona para o método updateMergeItem
	 * This is a public operation
	 * The 'updateMerge' request primitive for the Item entity.
	 * @throws MyServiceMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public Item updateMergeItem(Item input, long timeout) {
		br.com.senior.mydomain.myservice.impl.UpdateMergeItemImpl impl = new br.com.senior.mydomain.myservice.impl.UpdateMergeItemImpl(messengerSupplier, userId, messageSupplier);
		return impl.updateMergeItem(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método updateMergeItem
	 * This is a public operation
	 * The 'updateMerge' request primitive for the Item entity.
	 */
	@Override
	public void updateMergeItem(Item input) {
		br.com.senior.mydomain.myservice.impl.UpdateMergeItemImpl impl = new br.com.senior.mydomain.myservice.impl.UpdateMergeItemImpl(messengerSupplier, userId, messageSupplier);
		impl.updateMergeItem(input);
	}
	
	/**
	 * Chamada assíncrona para o método updateMergeItem
	 * This is a public operation
	 * The 'updateMerge' request primitive for the Item entity.
	 */
	@Override
	public CompletableFuture<Item> updateMergeItemRequest(Item input) {
		return this.updateMergeItemRequest(input, 0l);
	}
	
	/**
	 * Chamada assíncrona para o método updateMergeItem
	 * This is a public operation
	 * The 'updateMerge' request primitive for the Item entity.
	*/
	@Override
	public CompletableFuture<Item> updateMergeItemRequest(Item input, long timeout) {
		br.com.senior.mydomain.myservice.impl.UpdateMergeItemImpl impl = new br.com.senior.mydomain.myservice.impl.UpdateMergeItemImpl(messengerSupplier, userId, messageSupplier);
		return impl.updateMergeItemRequest(input, timeout, TimeUnit.MILLISECONDS);
	}
	/**
	 * Chamada síncrona para o método deleteItem
	 * This is a public operation
	 * The 'delete' request primitive for the Item entity.
	 * @throws MyServiceMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public void deleteItem(Item.Id input, long timeout) {
		br.com.senior.mydomain.myservice.impl.DeleteItemImpl impl = new br.com.senior.mydomain.myservice.impl.DeleteItemImpl(messengerSupplier, userId, messageSupplier);
		impl.deleteItem(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método deleteItem
	 * This is a public operation
	 * The 'delete' request primitive for the Item entity.
	 */
	@Override
	public void deleteItem(Item.Id input) {
		br.com.senior.mydomain.myservice.impl.DeleteItemImpl impl = new br.com.senior.mydomain.myservice.impl.DeleteItemImpl(messengerSupplier, userId, messageSupplier);
		impl.deleteItem(input);
	}
	
	

	/**
	 * Chamada assíncrona para o método ativarCliente
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 */
	@Override
	public void ativarCliente( AtivarClienteInput input ) {
	
		MyServiceValidator.validate(input);
	
		Message message = null;
		if (messageSupplier != null && messageSupplier.get() != null) {
			message = messageSupplier.get().followUp( //
				userId.getTenant(), //
				MyServiceConstants.DOMAIN, //
				MyServiceConstants.SERVICE, //
				MyServiceConstants.Signals.ATIVAR_CLIENTE, 
				DtoJsonConverter.toJSON(input));
		}
		else {
			message = new Message(userId.getTenant(), // 
				MyServiceConstants.DOMAIN, // 
				MyServiceConstants.SERVICE, //
				MyServiceConstants.Signals.ATIVAR_CLIENTE,
				DtoJsonConverter.toJSON(input));
		}
			
		try {
			addMessageHeaders(message);
			messengerSupplier.get().send(message);
		} catch (Exception e) {
			throw new MyServiceException("Erro ao enviar a mensagem", e);
		}
	}
	
	/**
	 * Chamada assíncrona para o método ativarProduct
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 */
	@Override
	public void ativarProduct( AtivarProductInput input ) {
	
		MyServiceValidator.validate(input);
	
		Message message = null;
		if (messageSupplier != null && messageSupplier.get() != null) {
			message = messageSupplier.get().followUp( //
				userId.getTenant(), //
				MyServiceConstants.DOMAIN, //
				MyServiceConstants.SERVICE, //
				MyServiceConstants.Signals.ATIVAR_PRODUCT, 
				DtoJsonConverter.toJSON(input));
		}
		else {
			message = new Message(userId.getTenant(), // 
				MyServiceConstants.DOMAIN, // 
				MyServiceConstants.SERVICE, //
				MyServiceConstants.Signals.ATIVAR_PRODUCT,
				DtoJsonConverter.toJSON(input));
		}
			
		try {
			addMessageHeaders(message);
			messengerSupplier.get().send(message);
		} catch (Exception e) {
			throw new MyServiceException("Erro ao enviar a mensagem", e);
		}
	}
	
	
	private Message createMessage(ExportProductEventPayload input, String requestName) {
		if (messageSupplier != null && messageSupplier.get() != null) {
			return messageSupplier.get().followUp( //
				userId.getTenant(), //
				MyServiceConstants.DOMAIN, //
				MyServiceConstants.SERVICE, //
				requestName, //
				DtoJsonConverter.toJSON(input));
		}
		return  new Message(userId.getTenant(), // 
			MyServiceConstants.DOMAIN, // 
			MyServiceConstants.SERVICE, //
			requestName, // 
			DtoJsonConverter.toJSON(input));
	}
	
	private Message createMessage(StockProductPayload input, String requestName) {
		if (messageSupplier != null && messageSupplier.get() != null) {
			return messageSupplier.get().followUp( //
				userId.getTenant(), //
				MyServiceConstants.DOMAIN, //
				MyServiceConstants.SERVICE, //
				requestName, //
				DtoJsonConverter.toJSON(input));
		}
		return  new Message(userId.getTenant(), // 
			MyServiceConstants.DOMAIN, // 
			MyServiceConstants.SERVICE, //
			requestName, // 
			DtoJsonConverter.toJSON(input));
	}
	
	private Message createMessage(ImportProductEventPayload input, String requestName) {
		if (messageSupplier != null && messageSupplier.get() != null) {
			return messageSupplier.get().followUp( //
				userId.getTenant(), //
				MyServiceConstants.DOMAIN, //
				MyServiceConstants.SERVICE, //
				requestName, //
				DtoJsonConverter.toJSON(input));
		}
		return  new Message(userId.getTenant(), // 
			MyServiceConstants.DOMAIN, // 
			MyServiceConstants.SERVICE, //
			requestName, // 
			DtoJsonConverter.toJSON(input));
	}
	
	private Message createMessage(ExportClientEventPayload input, String requestName) {
		if (messageSupplier != null && messageSupplier.get() != null) {
			return messageSupplier.get().followUp( //
				userId.getTenant(), //
				MyServiceConstants.DOMAIN, //
				MyServiceConstants.SERVICE, //
				requestName, //
				DtoJsonConverter.toJSON(input));
		}
		return  new Message(userId.getTenant(), // 
			MyServiceConstants.DOMAIN, // 
			MyServiceConstants.SERVICE, //
			requestName, // 
			DtoJsonConverter.toJSON(input));
	}
	
	private Message createMessage(ImportPedidoEventPayload input, String requestName) {
		if (messageSupplier != null && messageSupplier.get() != null) {
			return messageSupplier.get().followUp( //
				userId.getTenant(), //
				MyServiceConstants.DOMAIN, //
				MyServiceConstants.SERVICE, //
				requestName, //
				DtoJsonConverter.toJSON(input));
		}
		return  new Message(userId.getTenant(), // 
			MyServiceConstants.DOMAIN, // 
			MyServiceConstants.SERVICE, //
			requestName, // 
			DtoJsonConverter.toJSON(input));
	}
	
	private Message createMessage(ImportItemEventPayload input, String requestName) {
		if (messageSupplier != null && messageSupplier.get() != null) {
			return messageSupplier.get().followUp( //
				userId.getTenant(), //
				MyServiceConstants.DOMAIN, //
				MyServiceConstants.SERVICE, //
				requestName, //
				DtoJsonConverter.toJSON(input));
		}
		return  new Message(userId.getTenant(), // 
			MyServiceConstants.DOMAIN, // 
			MyServiceConstants.SERVICE, //
			requestName, // 
			DtoJsonConverter.toJSON(input));
	}
	
	private Message createMessage(ServiceStartedPayload input, String requestName) {
		if (messageSupplier != null && messageSupplier.get() != null) {
			return messageSupplier.get().followUp( //
				userId.getTenant(), //
				MyServiceConstants.DOMAIN, //
				MyServiceConstants.SERVICE, //
				requestName, //
				DtoJsonConverter.toJSON(input));
		}
		return  new Message(userId.getTenant(), // 
			MyServiceConstants.DOMAIN, // 
			MyServiceConstants.SERVICE, //
			requestName, // 
			DtoJsonConverter.toJSON(input));
	}
	
	private Message createMessage(ProductActivatedPayload input, String requestName) {
		if (messageSupplier != null && messageSupplier.get() != null) {
			return messageSupplier.get().followUp( //
				userId.getTenant(), //
				MyServiceConstants.DOMAIN, //
				MyServiceConstants.SERVICE, //
				requestName, //
				DtoJsonConverter.toJSON(input));
		}
		return  new Message(userId.getTenant(), // 
			MyServiceConstants.DOMAIN, // 
			MyServiceConstants.SERVICE, //
			requestName, // 
			DtoJsonConverter.toJSON(input));
	}
	
	private Message createMessage(ImportClientEventPayload input, String requestName) {
		if (messageSupplier != null && messageSupplier.get() != null) {
			return messageSupplier.get().followUp( //
				userId.getTenant(), //
				MyServiceConstants.DOMAIN, //
				MyServiceConstants.SERVICE, //
				requestName, //
				DtoJsonConverter.toJSON(input));
		}
		return  new Message(userId.getTenant(), // 
			MyServiceConstants.DOMAIN, // 
			MyServiceConstants.SERVICE, //
			requestName, // 
			DtoJsonConverter.toJSON(input));
	}
	
	private Message createMessage(ExportPedidoEventPayload input, String requestName) {
		if (messageSupplier != null && messageSupplier.get() != null) {
			return messageSupplier.get().followUp( //
				userId.getTenant(), //
				MyServiceConstants.DOMAIN, //
				MyServiceConstants.SERVICE, //
				requestName, //
				DtoJsonConverter.toJSON(input));
		}
		return  new Message(userId.getTenant(), // 
			MyServiceConstants.DOMAIN, // 
			MyServiceConstants.SERVICE, //
			requestName, // 
			DtoJsonConverter.toJSON(input));
	}
	
	private Message createMessage(NotifyUserEventPayload input, String requestName) {
		if (messageSupplier != null && messageSupplier.get() != null) {
			return messageSupplier.get().followUp( //
				userId.getTenant(), //
				MyServiceConstants.DOMAIN, //
				MyServiceConstants.SERVICE, //
				requestName, //
				DtoJsonConverter.toJSON(input));
		}
		return  new Message(userId.getTenant(), // 
			MyServiceConstants.DOMAIN, // 
			MyServiceConstants.SERVICE, //
			requestName, // 
			DtoJsonConverter.toJSON(input));
	}
	
	private Message createMessage(ExportItemEventPayload input, String requestName) {
		if (messageSupplier != null && messageSupplier.get() != null) {
			return messageSupplier.get().followUp( //
				userId.getTenant(), //
				MyServiceConstants.DOMAIN, //
				MyServiceConstants.SERVICE, //
				requestName, //
				DtoJsonConverter.toJSON(input));
		}
		return  new Message(userId.getTenant(), // 
			MyServiceConstants.DOMAIN, // 
			MyServiceConstants.SERVICE, //
			requestName, // 
			DtoJsonConverter.toJSON(input));
	}
	

	/**
	 * Chamada assíncrona para o método publishProductActivated
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 */
	public void publishProductActivated( ProductActivatedPayload input ) {
		Message message = createMessage(input, MyServiceConstants.Events.PRODUCT_ACTIVATED);
		try {
			addMessageHeaders(message);
			messengerSupplier.get().publish(message);
		} catch (Exception e) {
			throw new MyServiceException("Erro ao enviar a mensagem", e);
		}
	}
	
	/**
	 * Chamada assíncrona para o método publishStockProduct
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 */
	public void publishStockProduct( StockProductPayload input ) {
		Message message = createMessage(input, MyServiceConstants.Events.STOCK_PRODUCT);
		try {
			addMessageHeaders(message);
			messengerSupplier.get().publish(message);
		} catch (Exception e) {
			throw new MyServiceException("Erro ao enviar a mensagem", e);
		}
	}
	
	/**
	 * Chamada assíncrona para o método publishServiceStarted
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 */
	public void publishServiceStarted( ServiceStartedPayload input ) {
		Message message = createMessage(input, MyServiceConstants.Events.SERVICE_STARTED);
		try {
			addMessageHeaders(message);
			messengerSupplier.get().publish(message);
		} catch (Exception e) {
			throw new MyServiceException("Erro ao enviar a mensagem", e);
		}
	}
	
	/**
	 * Chamada assíncrona para o método publishNotifyUserEvent
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 */
	public void publishNotifyUserEvent( NotifyUserEventPayload input ) {
		Message message = createMessage(input, MyServiceConstants.Events.NOTIFY_USER_EVENT);
		try {
			addMessageHeaders(message);
			messengerSupplier.get().publish(message);
		} catch (Exception e) {
			throw new MyServiceException("Erro ao enviar a mensagem", e);
		}
	}
	
	/**
	 * Chamada assíncrona para o método publishImportClientEvent
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 */
	public void publishImportClientEvent( ImportClientEventPayload input ) {
		Message message = createMessage(input, MyServiceConstants.Events.IMPORT_CLIENT_EVENT);
		try {
			addMessageHeaders(message);
			messengerSupplier.get().publish(message);
		} catch (Exception e) {
			throw new MyServiceException("Erro ao enviar a mensagem", e);
		}
	}
	
	/**
	 * Chamada assíncrona para o método publishExportClientEvent
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 */
	public void publishExportClientEvent( ExportClientEventPayload input ) {
		Message message = createMessage(input, MyServiceConstants.Events.EXPORT_CLIENT_EVENT);
		try {
			addMessageHeaders(message);
			messengerSupplier.get().publish(message);
		} catch (Exception e) {
			throw new MyServiceException("Erro ao enviar a mensagem", e);
		}
	}
	
	/**
	 * Chamada assíncrona para o método publishImportProductEvent
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 */
	public void publishImportProductEvent( ImportProductEventPayload input ) {
		Message message = createMessage(input, MyServiceConstants.Events.IMPORT_PRODUCT_EVENT);
		try {
			addMessageHeaders(message);
			messengerSupplier.get().publish(message);
		} catch (Exception e) {
			throw new MyServiceException("Erro ao enviar a mensagem", e);
		}
	}
	
	/**
	 * Chamada assíncrona para o método publishExportProductEvent
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 */
	public void publishExportProductEvent( ExportProductEventPayload input ) {
		Message message = createMessage(input, MyServiceConstants.Events.EXPORT_PRODUCT_EVENT);
		try {
			addMessageHeaders(message);
			messengerSupplier.get().publish(message);
		} catch (Exception e) {
			throw new MyServiceException("Erro ao enviar a mensagem", e);
		}
	}
	
	/**
	 * Chamada assíncrona para o método publishImportPedidoEvent
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 */
	public void publishImportPedidoEvent( ImportPedidoEventPayload input ) {
		Message message = createMessage(input, MyServiceConstants.Events.IMPORT_PEDIDO_EVENT);
		try {
			addMessageHeaders(message);
			messengerSupplier.get().publish(message);
		} catch (Exception e) {
			throw new MyServiceException("Erro ao enviar a mensagem", e);
		}
	}
	
	/**
	 * Chamada assíncrona para o método publishExportPedidoEvent
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 */
	public void publishExportPedidoEvent( ExportPedidoEventPayload input ) {
		Message message = createMessage(input, MyServiceConstants.Events.EXPORT_PEDIDO_EVENT);
		try {
			addMessageHeaders(message);
			messengerSupplier.get().publish(message);
		} catch (Exception e) {
			throw new MyServiceException("Erro ao enviar a mensagem", e);
		}
	}
	
	/**
	 * Chamada assíncrona para o método publishImportItemEvent
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 */
	public void publishImportItemEvent( ImportItemEventPayload input ) {
		Message message = createMessage(input, MyServiceConstants.Events.IMPORT_ITEM_EVENT);
		try {
			addMessageHeaders(message);
			messengerSupplier.get().publish(message);
		} catch (Exception e) {
			throw new MyServiceException("Erro ao enviar a mensagem", e);
		}
	}
	
	/**
	 * Chamada assíncrona para o método publishExportItemEvent
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 */
	public void publishExportItemEvent( ExportItemEventPayload input ) {
		Message message = createMessage(input, MyServiceConstants.Events.EXPORT_ITEM_EVENT);
		try {
			addMessageHeaders(message);
			messengerSupplier.get().publish(message);
		} catch (Exception e) {
			throw new MyServiceException("Erro ao enviar a mensagem", e);
		}
	}
	
	private void addMessageHeaders(Message message) {
		message.setUsername(userId.getUsername());
		if (userId.isTrusted()) {
			message.addHeader("trusted", true);
		}
	}
}
