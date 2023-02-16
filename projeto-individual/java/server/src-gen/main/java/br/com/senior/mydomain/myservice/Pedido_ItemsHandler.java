/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;

import static br.com.senior.SecurityConstants.ENTITY_SECURITY_ACTION_CREATE;
import static br.com.senior.SecurityConstants.ENTITY_SECURITY_ACTION_DELETE;
import static br.com.senior.SecurityConstants.ENTITY_SECURITY_ACTION_UPDATE;
import static br.com.senior.SecurityConstants.ENTITY_SECURITY_ACTION_VIEW;
import static br.com.senior.mydomain.myservice.ItemEntity.SECURITY_RESOURCE;

import java.lang.reflect.Field;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.stream.Collectors;

import org.springframework.data.domain.Page;

import br.com.senior.messaging.customspringdata.EntityInfo;

import javax.inject.Inject;
import org.springframework.dao.DataIntegrityViolationException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.transaction.annotation.Transactional;
import br.com.senior.platform.translationhub.api.TranslationHubApi;

import br.com.senior.messaging.ErrorCategory;
import br.com.senior.messaging.Message;
import br.com.senior.messaging.model.HandlerImpl;
import br.com.senior.messaging.model.ServiceException;
import br.com.senior.messaging.security.SecureResource;
import br.com.senior.mydomain.myservice.Item.PagedResults;

@HandlerImpl(serviceClass = MyServiceConstants.class)
public class Pedido_ItemsHandler implements CreatePedido_Items, CreateMergePedido_Items, UpdatePedido_Items,
		UpdateMergePedido_Items, DeletePedido_Items, RetrievePedido_Items, ListPedido_Items {
	
	static final Logger logger = LoggerFactory.getLogger(Pedido_ItemsHandler.class);
	
	private static final String ID_FIELD_NAME = Arrays.stream(ItemEntity.class.getDeclaredFields())
            .filter(field -> field.isAnnotationPresent(javax.persistence.Id.class))
            .map(Field::getName)
            .findFirst()
            .orElseGet(() -> "id");
	
	@Inject
	ItemCrudService service;
	
	@Inject
	PedidoCrudService masterService;
	
	
	@Inject
	ItemDTOConverter dtoConverter;
	
	@Inject
	TranslationHubApi translationHubApi;
	
	@SecureResource(name=SECURITY_RESOURCE, action=ENTITY_SECURITY_ACTION_CREATE)
	@Transactional
	@Override
	public Item createPedido_Items(Item toCreate) {
		try {
			ItemEntity entity = dtoConverter.toEntity(toCreate);
			entity.setPedido(getParentEntity());
			return dtoConverter.toDTO(service.createItem(entity));
		} catch (ServiceException e) {
			logger.error(e.getMessage(), e);
			throw e;
		}catch (IllegalArgumentException e) {
			logger.error(e.getMessage(), e);
			throw new ServiceException(ErrorCategory.INTERNAL_ERROR, translationHubApi.getMessage("my_domain.my_service.item_illegalArgument", "An internal error occurred: "
				+ e.getClass().getSimpleName() + ". Please check the request parameters and try again."), e);
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
			throw new ServiceException(ErrorCategory.INTERNAL_ERROR, translationHubApi.getMessage("my_domain.my_service.item_internalError", "An internal error occurred: "
				+ e.getClass().getSimpleName() + ". Please check the request parameters and try again."), e);
		}
	}
	
	@SecureResource(name=SECURITY_RESOURCE, action=ENTITY_SECURITY_ACTION_CREATE)
	@Transactional
	@Override
	public Item createMergePedido_Items(Item toCreateMerge) {
		try {
			ItemEntity entity = dtoConverter.toEntity(toCreateMerge);
			entity.setPedido(getParentEntity());
			return dtoConverter.toDTO(service.createItem(entity));
		} catch (ServiceException e) {
			logger.error(e.getMessage(), e);
			throw e;
		}catch (IllegalArgumentException e) {
			logger.error(e.getMessage(), e);
			throw new ServiceException(ErrorCategory.INTERNAL_ERROR, translationHubApi.getMessage("my_domain.my_service.item_illegalArgument", "An internal error occurred: "
				+ e.getClass().getSimpleName() + ". Please check the request parameters and try again."), e);
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
			throw new ServiceException(ErrorCategory.INTERNAL_ERROR, translationHubApi.getMessage("my_domain.my_service.item_internalError", "An internal error occurred: "
				+ e.getClass().getSimpleName() + ". Please check the request parameters and try again."), e);
		}
	}
	
	@SecureResource(name=SECURITY_RESOURCE, action=ENTITY_SECURITY_ACTION_UPDATE)
	@Transactional
	@Override
	public Item updatePedido_Items(Item toUpdate) {
		try {
			ItemEntity entity = service.retrieveItem(new Item.Id(toUpdate.id));
			PedidoEntity masterEntity = getParentEntity();
			if (entity == null || entity.getPedido() == null || !entity.getPedido().getId().equals(masterEntity.getId())) {
				throw new ServiceException(ErrorCategory.OBJECT_NOT_FOUND, translationHubApi.getMessage("my_domain.my_service.item_notFound", "Pedido.items not found with id " + toUpdate.id));
			}
			dtoConverter.updateEntity(entity, toUpdate);
			entity.setPedido(masterEntity);
			return dtoConverter.toDTO(service.updateItem(entity));
		} catch (ServiceException e) {
			logger.error(e.getMessage(), e);
			throw e;
		}catch (IllegalArgumentException e) {
			logger.error(e.getMessage(), e);
			throw new ServiceException(ErrorCategory.INTERNAL_ERROR, translationHubApi.getMessage("my_domain.my_service.item_illegalArgument", "An internal error occurred: "
				+ e.getClass().getSimpleName() + ". Please check the request parameters and try again."), e);
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
			throw new ServiceException(ErrorCategory.INTERNAL_ERROR, translationHubApi.getMessage("my_domain.my_service.item_internalError", "An internal error occurred: "
				+ e.getClass().getSimpleName() + ". Please check the request parameters and try again."), e);
		}
	}
	
	@SecureResource(name=SECURITY_RESOURCE, action=ENTITY_SECURITY_ACTION_UPDATE)
	@Transactional
	@Override
	public Item updateMergePedido_Items(Item toUpdateMerge) {
		try {
			//The entity id is required and need to be validated accordly.
			if (toUpdateMerge.id == null) {
				throw new IllegalArgumentException("Items.id is required");
			}
			
			ItemEntity entity = service.retrieveItem(new Item.Id(toUpdateMerge.id));
			PedidoEntity masterEntity = getParentEntity();
			if (entity == null || entity.getPedido() == null || !entity.getPedido().getId().equals(masterEntity.getId())) {
				throw new ServiceException(ErrorCategory.OBJECT_NOT_FOUND, translationHubApi.getMessage("my_domain.my_service.item_notFound", "Pedido.items not found with id " + toUpdateMerge.id));
			}
			dtoConverter.mergeEntity(entity, toUpdateMerge);
			return dtoConverter.toDTO(service.updateItem(entity));
		} catch (ServiceException e) {
			logger.error(e.getMessage(), e);
			throw e;
		}catch (IllegalArgumentException e) {
			logger.error(e.getMessage(), e);
			throw new ServiceException(ErrorCategory.INTERNAL_ERROR, translationHubApi.getMessage("my_domain.my_service.item_illegalArgument", "An internal error occurred: "
				+ e.getClass().getSimpleName() + ". Please check the request parameters and try again."), e);
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
			throw new ServiceException(ErrorCategory.INTERNAL_ERROR, translationHubApi.getMessage("my_domain.my_service.item_internalError", "An internal error occurred: "
				+ e.getClass().getSimpleName() + ". Please check the request parameters and try again."), e);
		}
	}
	
	@SecureResource(name=SECURITY_RESOURCE, action=ENTITY_SECURITY_ACTION_DELETE)
	@Transactional
	@Override
	public void deletePedido_Items(Item.Id id) {
		try {
			ItemEntity entity = service.retrieveItem(id);
			PedidoEntity masterEntity = getParentEntity();
			if (entity == null || entity.getPedido() == null || !entity.getPedido().getId().equals(masterEntity.getId())) {
				throw new ServiceException(ErrorCategory.OBJECT_NOT_FOUND, translationHubApi.getMessage("my_domain.my_service.item_notFound", "Pedido.items not found with id " + id));
			}
			service.deleteItem(id);
		} catch (org.hibernate.exception.ConstraintViolationException ex) {
			throw new ServiceException(ErrorCategory.CONFLICT, translationHubApi.getMessage("my_domain.my_service.item_constraintViolation", "Constraint Violation " + ex.getClass().getSimpleName()), ex);
		} catch(DataIntegrityViolationException ex) {
			throw new ServiceException(ErrorCategory.CONFLICT, translationHubApi.getMessage("my_domain.my_service.item_dataIntegrityViolation", "Data integrity violation to Update Item. Error: "
				+ ex.getMessage()), ex);
		} catch (ServiceException e) {
			logger.error(e.getMessage(), e);
			throw e;
		} catch (IllegalArgumentException e) {
			logger.error(e.getMessage(), e);
			throw new ServiceException(ErrorCategory.INTERNAL_ERROR, translationHubApi.getMessage("my_domain.my_service.item_illegalArgument", "An internal error occurred: "
				+ e.getClass().getSimpleName() + ". Please check the request parameters and try again."), e);
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
			throw new ServiceException(ErrorCategory.INTERNAL_ERROR, translationHubApi.getMessage("my_domain.my_service.item_internalError", "An internal error occurred: "
				+ e.getClass().getSimpleName() + ". Please check the request parameters and try again."), e);
		}
	}
	
	@SecureResource(name=SECURITY_RESOURCE, action=ENTITY_SECURITY_ACTION_VIEW)
	@Transactional(readOnly = true)
	@Override
	public Item retrievePedido_Items(Item.GetRequest request) {
		try {
			ItemEntity entity = service.retrieveItem(new Item.Id(request.id));
			PedidoEntity masterEntity = getParentEntity();
			if (entity.getPedido() == null || !entity.getPedido().getId().equals(masterEntity.getId())) {
				entity = null;
			}
			List<String> displayFields = request.displayFields == null ? getDefaultDisplayFields() : request.displayFields;
			return dtoConverter.toDTO(entity, displayFields);
		} catch (ServiceException e) {
			logger.error(e.getMessage(), e);
			throw e;
		}catch (IllegalArgumentException e) {
			logger.error(e.getMessage(), e);
			throw new ServiceException(ErrorCategory.INTERNAL_ERROR, translationHubApi.getMessage("my_domain.my_service.item_illegalArgument", "An internal error occurred: "
				+ e.getClass().getSimpleName() + ". Please check the request parameters and try again."), e);
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
			throw new ServiceException(ErrorCategory.INTERNAL_ERROR, translationHubApi.getMessage("my_domain.my_service.item_internalError", "An internal error occurred: "
				+ e.getClass().getSimpleName() + ". Please check the request parameters and try again."), e);
		}
	}
	@SecureResource(name=SECURITY_RESOURCE, action=ENTITY_SECURITY_ACTION_VIEW)
	@Transactional(readOnly = true)
	@Override
	public PagedResults listPedido_Items(Item.PageRequest pageRequest) {
		try {
			int skip = pageRequest.offset != null ? pageRequest.offset.intValue() : 0;
			int top = pageRequest.size != null ? pageRequest.size.intValue() : 0;
			String orderBy = pageRequest.orderBy == null ? ID_FIELD_NAME + " asc" : pageRequest.orderBy;
			String filter = pageRequest.filter != null ? String.format("(%s)", pageRequest.filter) : null;
			EntityInfo parentEntityInfo = new EntityInfo(PedidoEntity.class, java.util.UUID.fromString(getParentId().id), "items");
			Page<ItemEntity> pages = service.listItemPageable(skip, top, orderBy, filter, parentEntityInfo);
			List<ItemEntity> entities = pages.getContent();
			List<String> displayFields = pageRequest.displayFields == null ? getDefaultDisplayFields() : pageRequest.displayFields;
			List<Item> dtos = entities != null ? entities.stream().map(e -> dtoConverter.toDTO(e, displayFields)).collect(Collectors.toList()) : null;
			return new PagedResults(dtos, Long.valueOf(pages.getTotalPages()), Long.valueOf(pages.getTotalElements()));
		} catch (ServiceException e) {
			logger.error(e.getMessage(), e);
			throw e;
		}catch (IllegalArgumentException e) {
			logger.error(e.getMessage(), e);
			throw new ServiceException(ErrorCategory.INTERNAL_ERROR, translationHubApi.getMessage("my_domain.my_service.item_illegalArgument", "An internal error occurred: "
				+ e.getClass().getSimpleName() + ". Please check the request parameters and try again."), e);
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
			throw new ServiceException(ErrorCategory.INTERNAL_ERROR, translationHubApi.getMessage("my_domain.my_service.item_internalError", "An internal error occurred: "
				+ e.getClass().getSimpleName() + ". Please check the request parameters and try again."), e);
		}
	}
	
	
	public static List<String> getDefaultDisplayFields(){
		List<String> displayFields = new ArrayList<String>();
		displayFields.add("*");
		return displayFields;
	}
	
	private String getParentIdHeader() {
		Message message = getMessage();
		return message.containsHeader(Message.ENTITY_PARENT_ID_HEADER) ? message.getHeader(Message.ENTITY_PARENT_ID_HEADER).toString() : null;
	}
	
	private Pedido.Id getParentId() {
		String parentId = getParentIdHeader();
		if (parentId == null) {
			throw new IllegalArgumentException("Header '" + Message.ENTITY_PARENT_ID_HEADER + "' is required");
		}
		return new Pedido.Id(java.util.UUID.fromString(parentId).toString());
	}
	
	private PedidoEntity getParentEntity() {
		Pedido.Id parentId = getParentId();
		PedidoEntity entity = masterService.retrievePedido(parentId);
		if (entity == null) {
			throw new ServiceException(ErrorCategory.OBJECT_NOT_FOUND, translationHubApi.getMessage("my_domain.my_service.pedido_notFound", "Pedido not found with id " + parentId.id));
		}
		return entity;
	}
}
