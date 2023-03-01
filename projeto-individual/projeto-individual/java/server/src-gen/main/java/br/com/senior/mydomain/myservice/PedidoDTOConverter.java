/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Map;
import java.util.stream.Collectors;
import javax.inject.Inject;
import javax.persistence.Id;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.context.annotation.Lazy;

@Component("my_domain.my_service.PedidoDTOConverter")
@Lazy
public class PedidoDTOConverter {
	
	static final Logger logger = LoggerFactory.getLogger(PedidoDTOConverter.class);
	
	private ClientDTOConverter clientDTOConverter;
	private ItemDTOConverter itemDTOConverter;
	
	@Inject
	public void setClientDTOConverter(ClientDTOConverter clientDTOConverter) {
		this.clientDTOConverter = clientDTOConverter;
	}
	
	@Inject
	public void setItemDTOConverter(ItemDTOConverter itemDTOConverter) {
		this.itemDTOConverter = itemDTOConverter;
	}
	
	public PedidoEntity toEntity(Pedido dto, boolean createMethod) {
		PedidoEntity ret = toEntity(dto, new HashMap<>());
		if(createMethod){
			ret.defineAsNewEntity();
		}
		return ret;
	}

	public PedidoEntity toEntity(Pedido dto) {
		return toEntity(dto, new HashMap<>());
	}
	
	PedidoEntity toEntity(Pedido dto, java.util.Map<Object, Object> converted) {
		if (dto == null) {
			return null;
		}
		PedidoEntity entity = (PedidoEntity) converted.get(dto);
		if (entity != null) {
			return entity;
		}
		entity = new PedidoEntity();
		converted.put(dto, entity);
		return mergeEntity(entity, dto, converted);
	}
	
	public PedidoEntity mergeEntity(PedidoEntity entity, Pedido dto) {
		return mergeEntity(entity, dto, new HashMap<>());
	}
	
	PedidoEntity mergeEntity(PedidoEntity entity, Pedido dto, java.util.Map<Object, Object> converted) {
		if (dto.id != null) {
			entity.setId(java.util.UUID.fromString(dto.id));
		}
		if (dto.client != null) {
			entity.setClient(clientDTOConverter.toEntity(dto.client, converted));
		}
		
		// For composition attributes only not null attributes will be set to parent. You should use PUT/PATCH parent/{id}/child/{id} instead.
		if (dto.items != null) {
			if (dto.items.isEmpty()) {
				final java.util.List<ItemEntity> listItems = new java.util.ArrayList<>();
				listItems.addAll(entity.getItems());
				for (ItemEntity detail : listItems) {
					entity.removeFromItems(detail);
				}
			} else {
				for (ItemEntity detail : itemDTOConverter.toEntityList(dto.items, converted)) {
					entity.addToItems(detail);
				}
			}
		}
		
		if (dto.orderDate != null) {
			entity.setOrderDate(dto.orderDate);
		}
		if (dto.finalValue != null) {
			entity.setFinalValue(dto.finalValue);
		}
		for (Map.Entry<String, Object> entry : dto.getCustom().entrySet()) {
			entity.setCustom(entry.getKey(), entry.getValue());
		}
		
        for (JsonPatch jsonPatch : dto.getJsonPatches()) {
            treatJsonPath(entity, jsonPatch);
        }
		
		return entity;
	}
	
	public PedidoEntity updateEntity(PedidoEntity entity, Pedido dto) {
		return updateEntity(entity, dto, new HashMap<>());
	}

	PedidoEntity updateEntity(PedidoEntity entity, Pedido dto, java.util.Map<Object, Object> converted) {
		if (dto.id != null) {
			entity.setId(java.util.UUID.fromString(dto.id));
		}
		entity.setClient(clientDTOConverter.toEntity(dto.client, converted));
		
		// For composition attributes only not null attributes will be set to parent. You should use PUT/PATCH parent/{id}/child/{id} instead.
		if (dto.items != null) {
			if (dto.items.isEmpty()) {
				final java.util.List<ItemEntity> listItems = new java.util.ArrayList<>();
				listItems.addAll(entity.getItems());
				for (ItemEntity detail : listItems) {
					entity.removeFromItems(detail);
				}
			} else {
				for (ItemEntity detail : itemDTOConverter.toEntityList(dto.items, converted)) {
					entity.addToItems(detail);
				}
			}
		}
		
		entity.setOrderDate(dto.orderDate);
		entity.setFinalValue(dto.finalValue);
		for (Map.Entry<String, Object> entry : dto.getCustom().entrySet()) {
			entity.setCustom(entry.getKey(), entry.getValue());
		}
		return entity;
	}
	
	public java.util.List<PedidoEntity> toEntityList(java.util.List<Pedido> dtos) {
		return toEntityList(dtos, new HashMap<>());
	}
	
	java.util.List<PedidoEntity> toEntityList(java.util.List<Pedido> dtos, java.util.Map<Object, Object> converted) {
		java.util.List<PedidoEntity> entities = null;
		if (dtos != null) {
			entities = dtos.stream().map(dto -> toEntity(dto, converted)).collect(Collectors.toList());
		}	
		return entities;
	}
	
	public Pedido toDTO(PedidoEntity entity) {
		return toDTO(entity, new HashMap<>());
	}
	
	Pedido toDTO(PedidoEntity entity, java.util.Map<Object, Object> converted) {
		if (entity == null) {
			return null;
		}
		Pedido dto = (Pedido) converted.get(entity);
		if (dto != null) {
			return dto;
		}
        dto = new Pedido();
        converted.put(entity, dto);

		dto.id = entity.getId() != null ? entity.getId().toString() : null;
		dto.client = clientDTOConverter.toDTO(entity.getClient(), converted);
		dto.items = itemDTOConverter.toDTOList(entity.getItems(), converted);
		dto.orderDate = entity.getOrderDate();
		dto.finalValue = entity.getFinalValue();
		for(String customField : entity.getCustomFields()) {
			dto.setCustom(customField, entity.getCustom(customField));
		}
        return dto;
    }
	
	public Pedido toDTO(PedidoEntity entity, List<String> displayFields) {
		return toDTO(entity, displayFields, new HashMap<>());
	}
	
	Pedido toDTO(PedidoEntity entity, List<String> displayFields, java.util.Map<Object, Object> converted) {
		if (entity == null) {
			return null;
		}
		if (displayFields == null) {
			return toDTO(entity, converted);
		}
		
		Set<Field> ids = findFields(entity.getClass(), Id.class);
		displayFields.addAll(ids.stream().map(field -> field.getName()).collect(Collectors.toList()));
		
        Pedido dto = new Pedido();
		if (displayFields.stream().anyMatch(displayField -> "id".equals(displayField) || "*".equals(displayField))) {
			dto.id = entity.getId() != null ? entity.getId().toString() : null;
		}
		
		List<String> clientDisplayFields = displayFields.stream()
						.filter(displayField -> displayField.trim().startsWith("client.")).map(f -> f.substring("client.".length() + f.indexOf("client.")).trim()).collect(Collectors.toList());
		if (!clientDisplayFields.isEmpty()) {
			dto.client = clientDTOConverter.toDTO(entity.getClient(), clientDisplayFields, new java.util.HashMap<Object, Object>());
		}
		
		List<String> itemsDisplayFields = displayFields.stream()
			.filter(displayField -> displayField.trim().startsWith("items.")).map(f -> f.substring("items.".length() + f.indexOf("items.")).trim()).collect(Collectors.toList());
		if (!itemsDisplayFields.isEmpty()) {
			dto.items = new java.util.ArrayList<>();
			for (ItemEntity itemEntity : entity.getItems()) {
				dto.items.add(itemDTOConverter.toDTO(itemEntity, itemsDisplayFields, converted));
			}
		}
		
		if (displayFields.stream().anyMatch(displayField -> "orderDate".equals(displayField) || "*".equals(displayField))) {
			dto.orderDate = entity.getOrderDate();
		}
		
		if (displayFields.stream().anyMatch(displayField -> "finalValue".equals(displayField) || "*".equals(displayField))) {
			dto.finalValue = entity.getFinalValue();
		}
		for(String customField : entity.getCustomFields()) {
			dto.setCustom(customField, entity.getCustom(customField));
		}
        return dto;
    }
    
    Pedido toDTOforRelation(PedidoEntity entity, List<String> displayFields, java.util.Map<Object, Object> converted) {
		if (entity == null) {
			return null;
		}
		if (displayFields == null) {
			return toDTO(entity, converted);
		}

		Set<Field> ids = findFields(entity.getClass(), Id.class);
		displayFields.addAll(ids.stream().map(field -> field.getName()).collect(Collectors.toList()));

        Pedido dto = new Pedido();
		if (displayFields.stream().anyMatch(displayField -> "id".equals(displayField) || "*".equals(displayField))) {
			dto.id = entity.getId() != null ? entity.getId().toString() : null;
		}
		
		
		
		if (displayFields.stream().anyMatch(displayField -> "orderDate".equals(displayField) || "*".equals(displayField))) {
			dto.orderDate = entity.getOrderDate();
		}
		
		if (displayFields.stream().anyMatch(displayField -> "finalValue".equals(displayField) || "*".equals(displayField))) {
			dto.finalValue = entity.getFinalValue();
		}
        return dto;
    }
    
    public java.util.List<Pedido> toDTOList(java.util.List<PedidoEntity> entities) {
    	return toDTOList(entities, new HashMap<>());
    }
    
    java.util.List<Pedido> toDTOList(java.util.List<PedidoEntity> entities, java.util.Map<Object, Object> converted) {
    	java.util.List<Pedido> dtos = null;
    	if (entities != null) {
    		dtos = entities.stream().map(entity -> toDTO(entity, converted)).collect(Collectors.toList());
    	}
    	return dtos;
    }
    
    public java.util.List<Pedido> toDTOList(java.util.Set<PedidoEntity> entities) {
    	return toDTOList(entities, new HashMap<>());
    }
    
    java.util.List<Pedido> toDTOList(java.util.Set<PedidoEntity> entities, java.util.Map<Object, Object> converted) {
    	java.util.List<Pedido> dtos = null;
    	if (entities != null) {
    		dtos = entities.stream().map(entity -> toDTO(entity, converted)).collect(Collectors.toList());
    	}
    	return dtos;
    }
    
        
	private static Set<Field> findFields(Class<?> clazz, Class<? extends Annotation> ann) {
		Set<Field> set = new HashSet<>();
		Class<?> c = clazz;
		while (c != null) {
			for (Field field : c.getDeclaredFields()) {
				if (field.isAnnotationPresent(ann)) {
					set.add(field);
				}
			}
			c = c.getSuperclass();
		}
		return set;
	}
	
	private void treatJsonPath(PedidoEntity entity, JsonPatch jsonPatch) {
		if (!JsonPatch.REMOVE_OPERATION.equals(jsonPatch.getOp())){
			return;
		}
		
		if("id".equals(jsonPatch.getPath().replace("/", ""))) {
			entity.setId(null);
		}
		if("client".equals(jsonPatch.getPath().replace("/", ""))) {
			entity.setClient(null);
		}
		if("items".equals(jsonPatch.getPath().replace("/", ""))) {
			for (ItemEntity e : new java.util.ArrayList<>(entity.getItems())) {
				entity.removeFromItems(e);
			}
		}
		if("orderDate".equals(jsonPatch.getPath().replace("/", ""))) {
			entity.setOrderDate(null);
		}
		if("finalValue".equals(jsonPatch.getPath().replace("/", ""))) {
			entity.setFinalValue(null);
		}
	}
}
