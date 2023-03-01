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

@Component("my_domain.my_service.ItemDTOConverter")
@Lazy
public class ItemDTOConverter {
	
	static final Logger logger = LoggerFactory.getLogger(ItemDTOConverter.class);
	
	private PedidoDTOConverter pedidoDTOConverter;
	private ProductDTOConverter productDTOConverter;
	
	@Inject
	public void setPedidoDTOConverter(PedidoDTOConverter pedidoDTOConverter) {
		this.pedidoDTOConverter = pedidoDTOConverter;
	}
	
	@Inject
	public void setProductDTOConverter(ProductDTOConverter productDTOConverter) {
		this.productDTOConverter = productDTOConverter;
	}
	
	public ItemEntity toEntity(Item dto, boolean createMethod) {
		ItemEntity ret = toEntity(dto, new HashMap<>());
		if(createMethod){
			ret.defineAsNewEntity();
		}
		return ret;
	}

	public ItemEntity toEntity(Item dto) {
		return toEntity(dto, new HashMap<>());
	}
	
	ItemEntity toEntity(Item dto, java.util.Map<Object, Object> converted) {
		if (dto == null) {
			return null;
		}
		ItemEntity entity = (ItemEntity) converted.get(dto);
		if (entity != null) {
			return entity;
		}
		entity = new ItemEntity();
		converted.put(dto, entity);
		return mergeEntity(entity, dto, converted);
	}
	
	public ItemEntity mergeEntity(ItemEntity entity, Item dto) {
		return mergeEntity(entity, dto, new HashMap<>());
	}
	
	ItemEntity mergeEntity(ItemEntity entity, Item dto, java.util.Map<Object, Object> converted) {
		if (dto.id != null) {
			entity.setId(java.util.UUID.fromString(dto.id));
		}
		if (dto.pedido != null) {
			entity.setPedido(pedidoDTOConverter.toEntity(dto.pedido, converted));
		}
		
		if (dto.product != null) {
			entity.setProduct(productDTOConverter.toEntity(dto.product, converted));
		}
		
		if (dto.quantity != null) {
			entity.setQuantity(dto.quantity);
		}
		if (dto.unitaryValue != null) {
			entity.setUnitaryValue(dto.unitaryValue);
		}
		if (dto.totalValue != null) {
			entity.setTotalValue(dto.totalValue);
		}
		for (Map.Entry<String, Object> entry : dto.getCustom().entrySet()) {
			entity.setCustom(entry.getKey(), entry.getValue());
		}
		
        for (JsonPatch jsonPatch : dto.getJsonPatches()) {
            treatJsonPath(entity, jsonPatch);
        }
		
		return entity;
	}
	
	public ItemEntity updateEntity(ItemEntity entity, Item dto) {
		return updateEntity(entity, dto, new HashMap<>());
	}

	ItemEntity updateEntity(ItemEntity entity, Item dto, java.util.Map<Object, Object> converted) {
		if (dto.id != null) {
			entity.setId(java.util.UUID.fromString(dto.id));
		}
		entity.setPedido(pedidoDTOConverter.toEntity(dto.pedido, converted));
		
		entity.setProduct(productDTOConverter.toEntity(dto.product, converted));
		
		entity.setQuantity(dto.quantity);
		entity.setUnitaryValue(dto.unitaryValue);
		entity.setTotalValue(dto.totalValue);
		for (Map.Entry<String, Object> entry : dto.getCustom().entrySet()) {
			entity.setCustom(entry.getKey(), entry.getValue());
		}
		return entity;
	}
	
	public java.util.List<ItemEntity> toEntityList(java.util.List<Item> dtos) {
		return toEntityList(dtos, new HashMap<>());
	}
	
	java.util.List<ItemEntity> toEntityList(java.util.List<Item> dtos, java.util.Map<Object, Object> converted) {
		java.util.List<ItemEntity> entities = null;
		if (dtos != null) {
			entities = dtos.stream().map(dto -> toEntity(dto, converted)).collect(Collectors.toList());
		}	
		return entities;
	}
	
	public Item toDTO(ItemEntity entity) {
		return toDTO(entity, new HashMap<>());
	}
	
	Item toDTO(ItemEntity entity, java.util.Map<Object, Object> converted) {
		if (entity == null) {
			return null;
		}
		Item dto = (Item) converted.get(entity);
		if (dto != null) {
			return dto;
		}
        dto = new Item();
        converted.put(entity, dto);

		dto.id = entity.getId() != null ? entity.getId().toString() : null;
		dto.pedido = pedidoDTOConverter.toDTO(entity.getPedido(), converted);
		dto.product = productDTOConverter.toDTO(entity.getProduct(), converted);
		dto.quantity = entity.getQuantity();
		dto.unitaryValue = entity.getUnitaryValue();
		dto.totalValue = entity.getTotalValue();
		for(String customField : entity.getCustomFields()) {
			dto.setCustom(customField, entity.getCustom(customField));
		}
        return dto;
    }
	
	public Item toDTO(ItemEntity entity, List<String> displayFields) {
		return toDTO(entity, displayFields, new HashMap<>());
	}
	
	Item toDTO(ItemEntity entity, List<String> displayFields, java.util.Map<Object, Object> converted) {
		if (entity == null) {
			return null;
		}
		if (displayFields == null) {
			return toDTO(entity, converted);
		}
		
		Set<Field> ids = findFields(entity.getClass(), Id.class);
		displayFields.addAll(ids.stream().map(field -> field.getName()).collect(Collectors.toList()));
		
        Item dto = new Item();
		if (displayFields.stream().anyMatch(displayField -> "id".equals(displayField) || "*".equals(displayField))) {
			dto.id = entity.getId() != null ? entity.getId().toString() : null;
		}
		
		List<String> pedidoDisplayFields = displayFields.stream()
						.filter(displayField -> displayField.trim().startsWith("pedido.")).map(f -> f.substring("pedido.".length() + f.indexOf("pedido.")).trim()).collect(Collectors.toList());
		if (!pedidoDisplayFields.isEmpty()) {
			dto.pedido = pedidoDTOConverter.toDTO(entity.getPedido(), pedidoDisplayFields, new java.util.HashMap<Object, Object>());
		}
		
		List<String> productDisplayFields = displayFields.stream()
						.filter(displayField -> displayField.trim().startsWith("product.")).map(f -> f.substring("product.".length() + f.indexOf("product.")).trim()).collect(Collectors.toList());
		if (!productDisplayFields.isEmpty()) {
			dto.product = productDTOConverter.toDTO(entity.getProduct(), productDisplayFields, new java.util.HashMap<Object, Object>());
		}
		
		if (displayFields.stream().anyMatch(displayField -> "quantity".equals(displayField) || "*".equals(displayField))) {
			dto.quantity = entity.getQuantity();
		}
		
		if (displayFields.stream().anyMatch(displayField -> "unitaryValue".equals(displayField) || "*".equals(displayField))) {
			dto.unitaryValue = entity.getUnitaryValue();
		}
		
		if (displayFields.stream().anyMatch(displayField -> "totalValue".equals(displayField) || "*".equals(displayField))) {
			dto.totalValue = entity.getTotalValue();
		}
		for(String customField : entity.getCustomFields()) {
			dto.setCustom(customField, entity.getCustom(customField));
		}
        return dto;
    }
    
    Item toDTOforRelation(ItemEntity entity, List<String> displayFields, java.util.Map<Object, Object> converted) {
		if (entity == null) {
			return null;
		}
		if (displayFields == null) {
			return toDTO(entity, converted);
		}

		Set<Field> ids = findFields(entity.getClass(), Id.class);
		displayFields.addAll(ids.stream().map(field -> field.getName()).collect(Collectors.toList()));

        Item dto = new Item();
		if (displayFields.stream().anyMatch(displayField -> "id".equals(displayField) || "*".equals(displayField))) {
			dto.id = entity.getId() != null ? entity.getId().toString() : null;
		}
		
		
		
		if (displayFields.stream().anyMatch(displayField -> "quantity".equals(displayField) || "*".equals(displayField))) {
			dto.quantity = entity.getQuantity();
		}
		
		if (displayFields.stream().anyMatch(displayField -> "unitaryValue".equals(displayField) || "*".equals(displayField))) {
			dto.unitaryValue = entity.getUnitaryValue();
		}
		
		if (displayFields.stream().anyMatch(displayField -> "totalValue".equals(displayField) || "*".equals(displayField))) {
			dto.totalValue = entity.getTotalValue();
		}
        return dto;
    }
    
    public java.util.List<Item> toDTOList(java.util.List<ItemEntity> entities) {
    	return toDTOList(entities, new HashMap<>());
    }
    
    java.util.List<Item> toDTOList(java.util.List<ItemEntity> entities, java.util.Map<Object, Object> converted) {
    	java.util.List<Item> dtos = null;
    	if (entities != null) {
    		dtos = entities.stream().map(entity -> toDTO(entity, converted)).collect(Collectors.toList());
    	}
    	return dtos;
    }
    
    public java.util.List<Item> toDTOList(java.util.Set<ItemEntity> entities) {
    	return toDTOList(entities, new HashMap<>());
    }
    
    java.util.List<Item> toDTOList(java.util.Set<ItemEntity> entities, java.util.Map<Object, Object> converted) {
    	java.util.List<Item> dtos = null;
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
	
	private void treatJsonPath(ItemEntity entity, JsonPatch jsonPatch) {
		if (!JsonPatch.REMOVE_OPERATION.equals(jsonPatch.getOp())){
			return;
		}
		
		if("id".equals(jsonPatch.getPath().replace("/", ""))) {
			entity.setId(null);
		}
		if("pedido".equals(jsonPatch.getPath().replace("/", ""))) {
			entity.setPedido(null);
		}
		if("product".equals(jsonPatch.getPath().replace("/", ""))) {
			entity.setProduct(null);
		}
		if("quantity".equals(jsonPatch.getPath().replace("/", ""))) {
			entity.setQuantity(null);
		}
		if("unitaryValue".equals(jsonPatch.getPath().replace("/", ""))) {
			entity.setUnitaryValue(null);
		}
		if("totalValue".equals(jsonPatch.getPath().replace("/", ""))) {
			entity.setTotalValue(null);
		}
	}
}
