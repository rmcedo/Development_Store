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

@Component("my_domain.my_service.ClientDTOConverter")
@Lazy
public class ClientDTOConverter {
	
	static final Logger logger = LoggerFactory.getLogger(ClientDTOConverter.class);
	
	
	public ClientEntity toEntity(Client dto, boolean createMethod) {
		ClientEntity ret = toEntity(dto, new HashMap<>());
		if(createMethod){
			ret.defineAsNewEntity();
		}
		return ret;
	}

	public ClientEntity toEntity(Client dto) {
		return toEntity(dto, new HashMap<>());
	}
	
	ClientEntity toEntity(Client dto, java.util.Map<Object, Object> converted) {
		if (dto == null) {
			return null;
		}
		ClientEntity entity = (ClientEntity) converted.get(dto);
		if (entity != null) {
			return entity;
		}
		entity = new ClientEntity();
		converted.put(dto, entity);
		return mergeEntity(entity, dto, converted);
	}
	
	public ClientEntity mergeEntity(ClientEntity entity, Client dto) {
		return mergeEntity(entity, dto, new HashMap<>());
	}
	
	ClientEntity mergeEntity(ClientEntity entity, Client dto, java.util.Map<Object, Object> converted) {
		if (dto.id != null) {
			entity.setId(java.util.UUID.fromString(dto.id));
		}
		if (dto.name != null) {
			entity.setName(dto.name);
		}
		if (dto.cpf != null) {
			entity.setCpf(dto.cpf);
		}
		if (dto.birthday != null) {
			entity.setBirthday(dto.birthday);
		}
		if (dto.active != null) {
			entity.setActive(dto.active);
		}
		for (Map.Entry<String, Object> entry : dto.getCustom().entrySet()) {
			entity.setCustom(entry.getKey(), entry.getValue());
		}
		
        for (JsonPatch jsonPatch : dto.getJsonPatches()) {
            treatJsonPath(entity, jsonPatch);
        }
		
		return entity;
	}
	
	public ClientEntity updateEntity(ClientEntity entity, Client dto) {
		return updateEntity(entity, dto, new HashMap<>());
	}

	ClientEntity updateEntity(ClientEntity entity, Client dto, java.util.Map<Object, Object> converted) {
		if (dto.id != null) {
			entity.setId(java.util.UUID.fromString(dto.id));
		}
		entity.setName(dto.name);
		entity.setCpf(dto.cpf);
		entity.setBirthday(dto.birthday);
		entity.setActive(dto.active);
		for (Map.Entry<String, Object> entry : dto.getCustom().entrySet()) {
			entity.setCustom(entry.getKey(), entry.getValue());
		}
		return entity;
	}
	
	public java.util.List<ClientEntity> toEntityList(java.util.List<Client> dtos) {
		return toEntityList(dtos, new HashMap<>());
	}
	
	java.util.List<ClientEntity> toEntityList(java.util.List<Client> dtos, java.util.Map<Object, Object> converted) {
		java.util.List<ClientEntity> entities = null;
		if (dtos != null) {
			entities = dtos.stream().map(dto -> toEntity(dto, converted)).collect(Collectors.toList());
		}	
		return entities;
	}
	
	public Client toDTO(ClientEntity entity) {
		return toDTO(entity, new HashMap<>());
	}
	
	Client toDTO(ClientEntity entity, java.util.Map<Object, Object> converted) {
		if (entity == null) {
			return null;
		}
		Client dto = (Client) converted.get(entity);
		if (dto != null) {
			return dto;
		}
        dto = new Client();
        converted.put(entity, dto);

		dto.id = entity.getId() != null ? entity.getId().toString() : null;
		dto.name = entity.getName();
		dto.cpf = entity.getCpf();
		dto.birthday = entity.getBirthday();
		dto.active = entity.getActive();
		for(String customField : entity.getCustomFields()) {
			dto.setCustom(customField, entity.getCustom(customField));
		}
        return dto;
    }
	
	public Client toDTO(ClientEntity entity, List<String> displayFields) {
		return toDTO(entity, displayFields, new HashMap<>());
	}
	
	Client toDTO(ClientEntity entity, List<String> displayFields, java.util.Map<Object, Object> converted) {
		if (entity == null) {
			return null;
		}
		if (displayFields == null) {
			return toDTO(entity, converted);
		}
		
		Set<Field> ids = findFields(entity.getClass(), Id.class);
		displayFields.addAll(ids.stream().map(field -> field.getName()).collect(Collectors.toList()));
		
        Client dto = new Client();
		if (displayFields.stream().anyMatch(displayField -> "id".equals(displayField) || "*".equals(displayField))) {
			dto.id = entity.getId() != null ? entity.getId().toString() : null;
		}
		
		if (displayFields.stream().anyMatch(displayField -> "name".equals(displayField) || "*".equals(displayField))) {
			dto.name = entity.getName();
		}
		
		if (displayFields.stream().anyMatch(displayField -> "cpf".equals(displayField) || "*".equals(displayField))) {
			dto.cpf = entity.getCpf();
		}
		
		if (displayFields.stream().anyMatch(displayField -> "birthday".equals(displayField) || "*".equals(displayField))) {
			dto.birthday = entity.getBirthday();
		}
		
		if (displayFields.stream().anyMatch(displayField -> "active".equals(displayField) || "*".equals(displayField))) {
			dto.active = entity.getActive();
		}
		for(String customField : entity.getCustomFields()) {
			dto.setCustom(customField, entity.getCustom(customField));
		}
        return dto;
    }
    
    Client toDTOforRelation(ClientEntity entity, List<String> displayFields, java.util.Map<Object, Object> converted) {
		if (entity == null) {
			return null;
		}
		if (displayFields == null) {
			return toDTO(entity, converted);
		}

		Set<Field> ids = findFields(entity.getClass(), Id.class);
		displayFields.addAll(ids.stream().map(field -> field.getName()).collect(Collectors.toList()));

        Client dto = new Client();
		if (displayFields.stream().anyMatch(displayField -> "id".equals(displayField) || "*".equals(displayField))) {
			dto.id = entity.getId() != null ? entity.getId().toString() : null;
		}
		
		if (displayFields.stream().anyMatch(displayField -> "name".equals(displayField) || "*".equals(displayField))) {
			dto.name = entity.getName();
		}
		
		if (displayFields.stream().anyMatch(displayField -> "cpf".equals(displayField) || "*".equals(displayField))) {
			dto.cpf = entity.getCpf();
		}
		
		if (displayFields.stream().anyMatch(displayField -> "birthday".equals(displayField) || "*".equals(displayField))) {
			dto.birthday = entity.getBirthday();
		}
		
		if (displayFields.stream().anyMatch(displayField -> "active".equals(displayField) || "*".equals(displayField))) {
			dto.active = entity.getActive();
		}
        return dto;
    }
    
    public java.util.List<Client> toDTOList(java.util.List<ClientEntity> entities) {
    	return toDTOList(entities, new HashMap<>());
    }
    
    java.util.List<Client> toDTOList(java.util.List<ClientEntity> entities, java.util.Map<Object, Object> converted) {
    	java.util.List<Client> dtos = null;
    	if (entities != null) {
    		dtos = entities.stream().map(entity -> toDTO(entity, converted)).collect(Collectors.toList());
    	}
    	return dtos;
    }
    
    public java.util.List<Client> toDTOList(java.util.Set<ClientEntity> entities) {
    	return toDTOList(entities, new HashMap<>());
    }
    
    java.util.List<Client> toDTOList(java.util.Set<ClientEntity> entities, java.util.Map<Object, Object> converted) {
    	java.util.List<Client> dtos = null;
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
	
	private void treatJsonPath(ClientEntity entity, JsonPatch jsonPatch) {
		if (!JsonPatch.REMOVE_OPERATION.equals(jsonPatch.getOp())){
			return;
		}
		
		if("id".equals(jsonPatch.getPath().replace("/", ""))) {
			entity.setId(null);
		}
		if("name".equals(jsonPatch.getPath().replace("/", ""))) {
			entity.setName(null);
		}
		if("cpf".equals(jsonPatch.getPath().replace("/", ""))) {
			entity.setCpf(null);
		}
		if("birthday".equals(jsonPatch.getPath().replace("/", ""))) {
			entity.setBirthday(null);
		}
		if("active".equals(jsonPatch.getPath().replace("/", ""))) {
			entity.setActive(null);
		}
	}
}
