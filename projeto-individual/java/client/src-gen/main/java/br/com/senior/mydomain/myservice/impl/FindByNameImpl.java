/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice.impl;

import java.util.function.Supplier;

import br.com.senior.messaging.*;
import br.com.senior.messaging.utils.DtoJsonConverter;
import br.com.senior.sdl.user.UserIdentifier;			

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;

import br.com.senior.messaging.model.ServiceContext;
import br.com.senior.messaging.model.ServiceException;
import br.com.senior.messaging.model.ServiceRunner;

import br.com.senior.mydomain.myservice.FindByNameInput;
import br.com.senior.mydomain.myservice.FindByNameOutput;
import br.com.senior.mydomain.myservice.MyServiceConstants;
import br.com.senior.mydomain.myservice.MyServiceValidator;
import br.com.senior.mydomain.myservice.MyServiceException;
import br.com.senior.mydomain.myservice.MyServiceMessageException;

/**
 * 
 */
public class FindByNameImpl {

	private final Supplier<IMessenger> messengerSupplier;

	private final UserIdentifier userId;

	private final Supplier<Message> messageSupplier;

	public FindByNameImpl(Supplier<IMessenger> messengerSupplier, UserIdentifier userId, Supplier<Message> messageSupplier) {
		this.messengerSupplier = messengerSupplier;
		this.userId = userId;
		this.messageSupplier = messageSupplier;
	}

	private Message createMessage(FindByNameInput input) {
		if (messageSupplier != null && messageSupplier.get() != null) {
			return messageSupplier.get().followUp( //
				userId.getTenant(), //
				MyServiceConstants.DOMAIN, //
				MyServiceConstants.SERVICE, //
				MyServiceConstants.Commands.FIND_BY_NAME, //
				DtoJsonConverter.toJSON(input));
		}
		return new Message(userId.getTenant(), //
			MyServiceConstants.DOMAIN, //
			MyServiceConstants.SERVICE, //
			MyServiceConstants.Commands.FIND_BY_NAME, //
			DtoJsonConverter.toJSON(input));
	}
	
	/**
	* Chamada síncrona para o método findByName
	* Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	* Query destinada para retornar Lista de Clientes com nome contendo parte do parametro name, passado na nossa requisição 
	* @throws MyServiceMessageException quando um erro com payload for retornado pela mensageria
	*/
	public FindByNameOutput findByName(FindByNameInput input, long timeout) {
		MyServiceValidator.validate(input);
		
		Message message = createMessage(input);
		Message resultMessage; 
		try {
			addMessageHeaders(message);
			resultMessage = messengerSupplier.get().requestSync(message, timeout);
			messengerSupplier.get().ack(resultMessage);
		} catch (Exception e) {
			throw new MyServiceException("Erro ao enviar a mensagem", e);
		}
		
		if (resultMessage == null) {
			throw new MyServiceException("Retorno inválido");
		}
		
		if (resultMessage.isError()) {
			ErrorPayload error = DtoJsonConverter.toDTO(resultMessage.getContent(), ErrorPayload.class);
			throw new MyServiceMessageException(resultMessage.getErrorCategory(), error.getMessage(), error.getErrorCode());
		}
		FindByNameOutput output = DtoJsonConverter.toDTO(resultMessage.getContent(), FindByNameOutput.class);
		if (output == null) {
			throw new MyServiceException("Contéudo do retorno inválido");
		}
		return output;
	}
	
	/**
	* Chamada assíncrona para o método findByName
	* Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	* Query destinada para retornar Lista de Clientes com nome contendo parte do parametro name, passado na nossa requisição
	*/
	public void findByName(FindByNameInput input) {
		MyServiceValidator.validate(input);
		
		Message message = createMessage(input);
		try {
			addMessageHeaders(message);
			messengerSupplier.get().send(message);
		} catch (Exception e) {
			throw new MyServiceException("Erro ao enviar a mensagem", e);
		}
	}
	
	/**
	* Chamada assíncrona para o método findByName
	* Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	* Query destinada para retornar Lista de Clientes com nome contendo parte do parametro name, passado na nossa requisição
	*/
	@Deprecated
	public CompletableFuture<FindByNameOutput> findByNameRequest(FindByNameInput input) {
		MyServiceValidator.validate(input);
	
		if (ServiceContext.get() == null) {
			throw new ServiceException(ErrorCategory.INTERNAL_ERROR, "Service Context não iniciado. Erro ao efetuar request da mensagem");
		}
		ServiceRunner serviceRunner = ServiceContext.get().getCurrentServiceRunner();
		Message message = createMessage(input);
		addMessageHeaders(message);
		return serviceRunner.request(message, FindByNameOutput.class);
	}
	
	/**
	* Chamada assíncrona para o método findByName
	* Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	* Query destinada para retornar Lista de Clientes com nome contendo parte do parametro name, passado na nossa requisição
	*/
	public CompletableFuture<FindByNameOutput> findByNameRequest(FindByNameInput input, long timeout, TimeUnit unit) {
		MyServiceValidator.validate(input);
	
		if (ServiceContext.get() == null) {
			throw new ServiceException(ErrorCategory.INTERNAL_ERROR, "Service Context não iniciado. Erro ao efetuar request da mensagem");
		}
		ServiceRunner serviceRunner = ServiceContext.get().getCurrentServiceRunner();
		Message message = createMessage(input);
		addMessageHeaders(message);
		return serviceRunner.request(message, FindByNameOutput.class, TimeUnit.MILLISECONDS.convert(timeout, unit));
	}
	
	private void addMessageHeaders(Message message) {
		message.setUsername(userId.getUsername());
		if (userId.isTrusted()) {
			message.addHeader("trusted", true);
		}
	}
}
