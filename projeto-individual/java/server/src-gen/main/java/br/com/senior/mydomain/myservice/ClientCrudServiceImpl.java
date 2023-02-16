/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.Optional;

import javax.inject.Inject;

import org.apache.commons.collections.CollectionUtils;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.hibernate.Session;
import br.com.senior.custom.session.SessionInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Page;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import br.com.senior.mydomain.myservice.Client.Id;
import br.com.senior.messaging.ErrorCategory;
import br.com.senior.messaging.customspringdata.CustomOrder;
import br.com.senior.messaging.customspringdata.filter.FilterParser;
import br.com.senior.messaging.customspringdata.FilterParameters;
import br.com.senior.messaging.customspringdata.IntrospectorUtil;
import br.com.senior.messaging.customspringdata.Join;
import br.com.senior.messaging.model.ServiceException;
import br.com.senior.platform.translationhub.api.TranslationHubApi;

@Service("my_domain.my_service.ClientCrudServiceImpl")
public class ClientCrudServiceImpl implements ClientCrudService {
	
	private static final Logger logger = LoggerFactory.getLogger(ClientCrudServiceImpl.class);
	
	@Inject
	protected ClientBaseRepository repository;
	
	@Inject
	protected FilterParser filterParser;
	
	@Inject
	private TranslationHubApi translationHubApi;

	@Inject
	private SessionInitializer sessionInitializer;
	
	@PersistenceContext
	private EntityManager em;
	
	@Autowired(required = false)
	private ClientCrudValidator validator;
	
	private boolean hasValidator() {
		return validator != null;
	}
	
	@Override
	@Transactional
	public ClientEntity create(ClientEntity entity) {
		prepareSession();
		try {
			if (hasValidator()) {
				validator.beforeCreate(entity);
			}
			return this.repository.saveAndFlush(entity);
		} catch (DataIntegrityViolationException | org.springframework.dao.InvalidDataAccessApiUsageException ex) {
			if(ex.getCause() instanceof org.hibernate.exception.ConstraintViolationException) {
				org.hibernate.exception.ConstraintViolationException cve = (org.hibernate.exception.ConstraintViolationException) ex.getCause();
				if(!("my_domain.my_service.create_entity_constraint_violation_" + cve.getConstraintName()).equals(translationHubApi.getFormattedMessage("my_domain.my_service.create_entity_constraint_violation_" + cve.getConstraintName()))) {
					throw new ServiceException(ErrorCategory.BAD_REQUEST, translationHubApi.getFormattedMessage("my_domain.my_service.create_entity_constraint_violation_" + cve.getConstraintName()));						
				}
				throw new ServiceException(ErrorCategory.BAD_REQUEST, translationHubApi.getFormattedMessage("my_domain.my_service.create_entity_constraint_violation", cve.getConstraintName()));
			}
			
			if(ex.getCause() instanceof IllegalStateException) {
				throw new ServiceException(ErrorCategory.BAD_REQUEST, translationHubApi.getFormattedMessage("my_domain.my_service.create_entity_transient", ex.getMessage()));
			}
			
			throw new ServiceException(ErrorCategory.CONFLICT, translationHubApi.getMessage("my_domain.my_service.clientEntity_dataIntegrityViolation", "Data integrity violation to Create ClientEntity. Error: " + ex.getMessage()));
		}
	}
	
	@Override
	@Transactional
	public ClientEntity createClient(ClientEntity entity) {
		return create(entity);
	}
	
	@Override
	@Deprecated
	@Transactional
	public ClientEntity createMergeClient(ClientEntity entity) {
		return create(entity);
	}
	
	@Override
	@Transactional
	public ClientEntity updateClient(ClientEntity entity) {
		prepareSession();
		try {
			if (hasValidator()) {
				validator.beforeUpdate(entity);
			}
			return repository.saveAndFlush(entity);
		} catch (DataIntegrityViolationException | org.springframework.dao.InvalidDataAccessApiUsageException ex) {
			if (ex.getCause() instanceof org.hibernate.exception.ConstraintViolationException) {
				org.hibernate.exception.ConstraintViolationException cve = (org.hibernate.exception.ConstraintViolationException) ex.getCause();
				if(!("my_domain.my_service.update_entity_constraint_violation_" + cve.getConstraintName()).equals(translationHubApi.getFormattedMessage("my_domain.my_service.update_entity_constraint_violation_" + cve.getConstraintName()))) {
					throw new ServiceException(ErrorCategory.BAD_REQUEST, translationHubApi.getFormattedMessage("my_domain.my_service.update_entity_constraint_violation_" + cve.getConstraintName()));						
				}
				throw new ServiceException(ErrorCategory.BAD_REQUEST, translationHubApi.getFormattedMessage("my_domain.my_service.update_entity_constraint_violation", cve.getConstraintName()));
			}
			
			if (ex.getCause() instanceof IllegalStateException) {
				throw new ServiceException(ErrorCategory.BAD_REQUEST, translationHubApi.getMessage("my_domain.my_service.update_entity_transient", ex.getMessage()));
			}
			
			throw new ServiceException(ErrorCategory.CONFLICT, translationHubApi.getMessage("my_domain.my_service.clientEntity_dataIntegrityViolation", "Data integrity violation to Update ClientEntity. Error: " + ex.getMessage()));
		}
	}
	
	@Override
	@Deprecated
	@Transactional
	public ClientEntity updateMergeClient(ClientEntity entity) {
		return updateClient(entity);
	}
	
	@Override
	@Transactional
	public void deleteClient(Id id) {
		prepareSession();
		try {
			if (hasValidator()) {
				validator.beforeDelete(id);
			}
			repository.deleteById(java.util.UUID.fromString(id.id));
			repository.flush();
	    } catch  (EmptyResultDataAccessException ex) {
	    	throw new ServiceException(ErrorCategory.OBJECT_NOT_FOUND, translationHubApi.getExternalMessage("my_domain", "my_service", "my_domain.my_service.client_notFound", "Client not found with id " + id.id));
	    } catch (DataIntegrityViolationException ex) {
			if (ex.getCause() instanceof org.hibernate.exception.ConstraintViolationException) {
				org.hibernate.exception.ConstraintViolationException cve = (org.hibernate.exception.ConstraintViolationException) ex.getCause();
				throw new ServiceException(ErrorCategory.BAD_REQUEST, translationHubApi.getFormattedMessage("my_domain.my_service.delete_entity_constraint_violation_" + cve.getConstraintName()));
			}
		}
	}
	
	@Override
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public ClientEntity retrieveClient(Id id) {
		prepareSession();
		Optional<ClientEntity> optionalEntity = this.repository.findById(java.util.UUID.fromString(id.id));
		if (optionalEntity.isEmpty()) {
			throw new ServiceException(ErrorCategory.OBJECT_NOT_FOUND, translationHubApi.getExternalMessage("my_domain", "my_service", "my_domain.my_service.client_notFound", "Client not found with id " + id.id));
		}
		return optionalEntity.get();
	}
	
	@Override
	@Deprecated
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<ClientEntity> listClient(int skip, int top) {
		prepareSession();
		List<ClientEntity> entities = this.repository.findAll(null, null, null, skip, top);
		return entities;
	}
	
	@Override
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public Page<ClientEntity> listClientPageable(int skip, int top) {
		return listClientPageable(skip, top, null, null);
	}
	
	@Override
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public Page<ClientEntity> listClientPageable(int skip, int top, String orderBy) {
		return listClientPageable(skip, top, orderBy, null);
	}
	
	@Override
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public Page<ClientEntity> listClientPageable(int skip, int top, String orderBy, String filter) {
		prepareSession();
		int page = skip * top; //zero-based page index.
		int size = top > 0 ? top : 10; //the size of the page to be returned.
		List<CustomOrder> customOrder = new ArrayList<>();
		if (orderBy != null && !orderBy.trim().isEmpty()) {
			String[] ordersby = orderBy.split(",");
			for (String orderby : ordersby) {
				String[] orderparts = orderby.trim().split("\\s+");
				boolean desc = orderparts.length > 1 && orderparts[1].toUpperCase().equals("DESC");
				CustomOrder co = new CustomOrder(orderparts[0]);
				co.setDesc(desc);
				customOrder.add(co);
			}
		}
		filter = replaceFilterEscapedChars(filter);
		FilterParameters filterParameters = null;
		try {
			filterParameters = filterParser.parseFilter(filter, ClientEntity.class);
			filterParameters.setValues(getFixedValuesToFilter(filterParameters));
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
			throw new ServiceException(ErrorCategory.BAD_REQUEST, translationHubApi.getMessage("my_domain.my_service.clientEntity_invalidFilter", "Invalid filter."));	
		}
		
		// Throws an exception if find a custom field in the filter expression or order by expression.
		Set<String> columns = filterParameters == null ? null : filterParameters.getColumns().stream().filter(f -> f.split("\\.").length == 1).collect(Collectors.toSet());
		if(filterParameters != null){
			validateFilterColumns(columns, filterParameters.getJoins(), null);
		}
		validateCustomOrders(customOrder);
		
		
		Page<ClientEntity> requestedPage = this.repository.findAllPageable(filterParameters, customOrder, page, size, true);
		return requestedPage;
	}
	
	
	protected List<Object> getFixedValuesToFilter(FilterParameters filterParameters){
		return filterParameters.getValues().stream().map(value-> {
			if( value instanceof java.lang.String )
				return ((String) value).replace("''", "'");
			
			return value;
		}).collect(Collectors.toList());
	}
	
	protected String replaceFilterEscapedChars(String filter){
		return filter == null ? null : filter.replace("\\'", "''");
	}
	
	@Override
	public void validateFilterColumns(Set<String> columns, List<Join> joinFields, String lastPath) {
		validateCurrentEntityFields(columns, lastPath);
	}
	
	@Override
	public void validateCustomOrders(List<CustomOrder> customOrders){
		Set<String> entityFieldNames = IntrospectorUtil.getAllEntityFieldNamesByClass(ClientEntity.class);
		for(CustomOrder order : customOrders.stream().filter(c-> !c.getField().contains(".")).collect(Collectors.toList())) {
			// The orderby must not contain custom fields.
			if (!entityFieldNames.contains(order.getField())) {
				throw new ServiceException(ErrorCategory.BAD_REQUEST, "Invalid orderby argument: " + order.getField());
			}
		}
	}
	
	private void validateCurrentEntityFields(Set<String> columns, String lastPath) {
		Set<String> entityFieldNames = IntrospectorUtil.getAllEntityFieldNamesByClass(ClientEntity.class);
		// The filter must not contain custom fields.
		if (!CollectionUtils.isEmpty(columns)) {
			columns.forEach(filterFieldName -> {
				if (!entityFieldNames.contains(filterFieldName)) {
					throw new ServiceException(ErrorCategory.BAD_REQUEST, "Invalid filter argument: " + filterFieldName);
				}
			});
		}
	}
	protected void prepareSession(){
		Session session = em.unwrap(Session.class);
		sessionInitializer.initialize(session, ClientEntity.class);
	}
	
	@Override
	public void createBulk(List<ClientEntity> entities) {
		prepareSession();
		if (entities != null && !entities.isEmpty()) {
			this.repository.saveAll(entities);
		}
	}
	
	@Override
	public void createBulkClient(List<ClientEntity> entities) {
		this.createBulk(entities);
	}
	
	@Override
	public ClientBaseRepository getRepository() {
		return repository;
	}
}
