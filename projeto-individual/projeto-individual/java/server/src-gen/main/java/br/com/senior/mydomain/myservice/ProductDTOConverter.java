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
import javax.persistence.Id;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.context.annotation.Lazy;

@Component("my_domain.my_service.ProductDTOConverter")
@Lazy
public class ProductDTOConverter {
	
	static final Logger logger = LoggerFactory.getLogger(ProductDTOConverter.class);
	
	
	public ProductEntity toEntity(Product dto, boolean createMethod) {
		ProductEntity ret = toEntity(dto, new HashMap<>());
		if(createMethod){
			ret.defineAsNewEntity();
		}
		return ret;
	}

	public ProductEntity toEntity(Product dto) {
		return toEntity(dto, new HashMap<>());
	}
	
	ProductEntity toEntity(Product dto, java.util.Map<Object, Object> converted) {
		if (dto == null) {
			return null;
		}
		ProductEntity entity = (ProductEntity) converted.get(dto);
		if (entity != null) {
			return entity;
		}
		entity = new ProductEntity();
		converted.put(dto, entity);
		return mergeEntity(entity, dto, converted);
	}
	
	public ProductEntity mergeEntity(ProductEntity entity, Product dto) {
		return mergeEntity(entity, dto, new HashMap<>());
	}
	
	ProductEntity mergeEntity(ProductEntity entity, Product dto, java.util.Map<Object, Object> converted) {
		if (dto.id != null) {
			entity.setId(java.util.UUID.fromString(dto.id));
		}
		if (dto.name != null) {
			entity.setName(dto.name);
		}
		if (dto.description != null) {
			entity.setDescription(dto.description);
		}
		if (dto.price != null) {
			entity.setPrice(dto.price);
		}
		if (dto.stock != null) {
			entity.setStock(dto.stock);
		}
		if (dto.active != null) {
			entity.setActive(dto.active);
		}
		if (dto.categoria != null) {
			entity.setCategoria(dto.categoria);
		}
		for (Map.Entry<String, Object> entry : dto.getCustom().entrySet()) {
			entity.setCustom(entry.getKey(), entry.getValue());
		}
		
        for (JsonPatch jsonPatch : dto.getJsonPatches()) {
            treatJsonPath(entity, jsonPatch);
        }
		
		return entity;
	}
	
	public ProductEntity updateEntity(ProductEntity entity, Product dto) {
		return updateEntity(entity, dto, new HashMap<>());
	}

	ProductEntity updateEntity(ProductEntity entity, Product dto, java.util.Map<Object, Object> converted) {
		if (dto.id != null) {
			entity.setId(java.util.UUID.fromString(dto.id));
		}
		entity.setName(dto.name);
		entity.setDescription(dto.description);
		entity.setPrice(dto.price);
		entity.setStock(dto.stock);
		entity.setActive(dto.active);
		entity.setCategoria(dto.categoria);
		for (Map.Entry<String, Object> entry : dto.getCustom().entrySet()) {
			entity.setCustom(entry.getKey(), entry.getValue());
		}
		return entity;
	}
	
	public java.util.List<ProductEntity> toEntityList(java.util.List<Product> dtos) {
		return toEntityList(dtos, new HashMap<>());
	}
	
	java.util.List<ProductEntity> toEntityList(java.util.List<Product> dtos, java.util.Map<Object, Object> converted) {
		java.util.List<ProductEntity> entities = null;
		if (dtos != null) {
			entities = dtos.stream().map(dto -> toEntity(dto, converted)).collect(Collectors.toList());
		}	
		return entities;
	}
	
	public Product toDTO(ProductEntity entity) {
		return toDTO(entity, new HashMap<>());
	}
	
	Product toDTO(ProductEntity entity, java.util.Map<Object, Object> converted) {
		if (entity == null) {
			return null;
		}
		Product dto = (Product) converted.get(entity);
		if (dto != null) {
			return dto;
		}
        dto = new Product();
        converted.put(entity, dto);

		dto.id = entity.getId() != null ? entity.getId().toString() : null;
		dto.name = entity.getName();
		dto.description = entity.getDescription();
		dto.price = entity.getPrice();
		dto.stock = entity.getStock();
		dto.active = entity.getActive();
		dto.categoria = entity.getCategoria();
		for(String customField : entity.getCustomFields()) {
			dto.setCustom(customField, entity.getCustom(customField));
		}
        return dto;
    }
	
	public Product toDTO(ProductEntity entity, List<String> displayFields) {
		return toDTO(entity, displayFields, new HashMap<>());
	}
	
	Product toDTO(ProductEntity entity, List<String> displayFields, java.util.Map<Object, Object> converted) {
		if (entity == null) {
			return null;
		}
		if (displayFields == null) {
			return toDTO(entity, converted);
		}
		
		Set<Field> ids = findFields(entity.getClass(), Id.class);
		displayFields.addAll(ids.stream().map(field -> field.getName()).collect(Collectors.toList()));
		
        Product dto = new Product();
		if (displayFields.stream().anyMatch(displayField -> "id".equals(displayField) || "*".equals(displayField))) {
			dto.id = entity.getId() != null ? entity.getId().toString() : null;
		}
		
		if (displayFields.stream().anyMatch(displayField -> "name".equals(displayField) || "*".equals(displayField))) {
			dto.name = entity.getName();
		}
		
		if (displayFields.stream().anyMatch(displayField -> "description".equals(displayField) || "*".equals(displayField))) {
			dto.description = entity.getDescription();
		}
		
		if (displayFields.stream().anyMatch(displayField -> "price".equals(displayField) || "*".equals(displayField))) {
			dto.price = entity.getPrice();
		}
		
		if (displayFields.stream().anyMatch(displayField -> "stock".equals(displayField) || "*".equals(displayField))) {
			dto.stock = entity.getStock();
		}
		
		if (displayFields.stream().anyMatch(displayField -> "active".equals(displayField) || "*".equals(displayField))) {
			dto.active = entity.getActive();
		}
		
		if (displayFields.stream().anyMatch(displayField -> "categoria".equals(displayField) || "*".equals(displayField))) {
			dto.categoria = entity.getCategoria();
		}
		for(String customField : entity.getCustomFields()) {
			dto.setCustom(customField, entity.getCustom(customField));
		}
        return dto;
    }
    
    Product toDTOforRelation(ProductEntity entity, List<String> displayFields, java.util.Map<Object, Object> converted) {
		if (entity == null) {
			return null;
		}
		if (displayFields == null) {
			return toDTO(entity, converted);
		}

		Set<Field> ids = findFields(entity.getClass(), Id.class);
		displayFields.addAll(ids.stream().map(field -> field.getName()).collect(Collectors.toList()));

        Product dto = new Product();
		if (displayFields.stream().anyMatch(displayField -> "id".equals(displayField) || "*".equals(displayField))) {
			dto.id = entity.getId() != null ? entity.getId().toString() : null;
		}
		
		if (displayFields.stream().anyMatch(displayField -> "name".equals(displayField) || "*".equals(displayField))) {
			dto.name = entity.getName();
		}
		
		if (displayFields.stream().anyMatch(displayField -> "description".equals(displayField) || "*".equals(displayField))) {
			dto.description = entity.getDescription();
		}
		
		if (displayFields.stream().anyMatch(displayField -> "price".equals(displayField) || "*".equals(displayField))) {
			dto.price = entity.getPrice();
		}
		
		if (displayFields.stream().anyMatch(displayField -> "stock".equals(displayField) || "*".equals(displayField))) {
			dto.stock = entity.getStock();
		}
		
		if (displayFields.stream().anyMatch(displayField -> "active".equals(displayField) || "*".equals(displayField))) {
			dto.active = entity.getActive();
		}
		
		if (displayFields.stream().anyMatch(displayField -> "categoria".equals(displayField) || "*".equals(displayField))) {
			dto.categoria = entity.getCategoria();
		}
        return dto;
    }
    
    public java.util.List<Product> toDTOList(java.util.List<ProductEntity> entities) {
    	return toDTOList(entities, new HashMap<>());
    }
    
    java.util.List<Product> toDTOList(java.util.List<ProductEntity> entities, java.util.Map<Object, Object> converted) {
    	java.util.List<Product> dtos = null;
    	if (entities != null) {
    		dtos = entities.stream().map(entity -> toDTO(entity, converted)).collect(Collectors.toList());
    	}
    	return dtos;
    }
    
    public java.util.List<Product> toDTOList(java.util.Set<ProductEntity> entities) {
    	return toDTOList(entities, new HashMap<>());
    }
    
    java.util.List<Product> toDTOList(java.util.Set<ProductEntity> entities, java.util.Map<Object, Object> converted) {
    	java.util.List<Product> dtos = null;
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
	
	private void treatJsonPath(ProductEntity entity, JsonPatch jsonPatch) {
		if (!JsonPatch.REMOVE_OPERATION.equals(jsonPatch.getOp())){
			return;
		}
		
		if("id".equals(jsonPatch.getPath().replace("/", ""))) {
			entity.setId(null);
		}
		if("name".equals(jsonPatch.getPath().replace("/", ""))) {
			entity.setName(null);
		}
		if("description".equals(jsonPatch.getPath().replace("/", ""))) {
			entity.setDescription(null);
		}
		if("price".equals(jsonPatch.getPath().replace("/", ""))) {
			entity.setPrice(null);
		}
		if("stock".equals(jsonPatch.getPath().replace("/", ""))) {
			entity.setStock(null);
		}
		if("active".equals(jsonPatch.getPath().replace("/", ""))) {
			entity.setActive(null);
		}
		if("categoria".equals(jsonPatch.getPath().replace("/", ""))) {
			entity.setCategoria(null);
		}
	}
}
