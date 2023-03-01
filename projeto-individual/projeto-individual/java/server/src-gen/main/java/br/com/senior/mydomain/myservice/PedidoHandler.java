/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;

import static br.com.senior.SecurityConstants.*;
import static br.com.senior.mydomain.myservice.PedidoEntity.SECURITY_RESOURCE;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import javax.inject.Inject;

import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Page;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.scheduling.annotation.Async;
import org.springframework.transaction.annotation.Transactional;

import br.com.senior.messaging.ErrorCategory;
import br.com.senior.messaging.model.HandlerImpl;
import br.com.senior.messaging.model.ServiceException;
import br.com.senior.messaging.security.SecureResource;
import br.com.senior.custom.metadata.EntityDefProviderImpl;
import br.com.senior.custom.validator.CustomDTOValidatorImpl;
import br.com.senior.springbatchintegration.control.BatchIntegrationController;
import br.com.senior.springbatchintegration.importer.Importer;
import br.com.senior.springbatchintegration.importer.ImporterException;
import br.com.senior.springbatchintegration.model.Layout;
import br.com.senior.mydomain.myservice.Pedido.Id;
import br.com.senior.mydomain.myservice.Pedido.PageRequest;
import br.com.senior.mydomain.myservice.Pedido.PagedResults;
import org.springframework.stereotype.Component;
import br.com.senior.platform.translationhub.api.TranslationHubApi;

@HandlerImpl(serviceClass = MyServiceConstants.class)
@Component("my_domain.my_service.PedidoHandler")
public class PedidoHandler implements CreatePedido, CreateMergePedido, UpdatePedido, DeletePedido, 
		 UpdateMergePedido, CreateBulkPedido, RetrievePedido, ListPedido, 
		 ImportPedido, ExportPedido {
	static final Logger logger = LoggerFactory.getLogger(PedidoHandler.class);
	
	private static final String ID_FIELD_NAME = Arrays.stream(PedidoEntity.class.getDeclaredFields())
            .filter(field -> field.isAnnotationPresent(javax.persistence.Id.class))
            .map(Field::getName)
            .findFirst()
            .orElseGet(() -> "id");

	@Inject
	PedidoCrudService service;
	
	@Inject
	PedidoDTOConverter dtoConverter;
	
	@Inject
	CustomDTOValidatorImpl customValidator;
	
	@Inject
	EntityDefProviderImpl entityDefProvider;
	
	@Inject
	protected TranslationHubApi translationHubApi;
	
	@SecureResource(name=SECURITY_RESOURCE, action=ENTITY_SECURITY_ACTION_CREATE)
	@Transactional
	@Override
	public Pedido createPedido(Pedido toCreate) {
		try {
			customValidator.validate(toCreate, entityDefProvider.getEntityDef("pedido"));
			PedidoEntity entity = service.createPedido(dtoConverter.toEntity(toCreate, true));
			return dtoConverter.toDTO(entity);
			
		} catch (br.com.senior.messaging.model.ServiceException e) {
			logger.error(e.getMessage(), e);
			throw e;
		} catch (IllegalArgumentException e) {
			logger.error(e.getMessage(), e);
			throw new br.com.senior.messaging.model.ServiceException(br.com.senior.messaging.ErrorCategory.INTERNAL_ERROR, translationHubApi.getMessage("my_domain.my_service.pedido_illegalArgument", "An internal error occurred: "
				+ e.getClass().getSimpleName() + ". Please check the request parameters and try again."), e);
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
			throw new br.com.senior.messaging.model.ServiceException(br.com.senior.messaging.ErrorCategory.INTERNAL_ERROR, translationHubApi.getMessage("my_domain.my_service.pedido_internalError", "An internal error occurred: "
				+ e.getClass().getSimpleName() + ". Please check the request parameters and try again."), e);
		}
	}
	
	@SecureResource(name=SECURITY_RESOURCE, action=ENTITY_SECURITY_ACTION_CREATE)
	@Transactional
	@Override
	public Pedido createMergePedido(Pedido toCreate) {
		try {
			PedidoEntity entity = service.createPedido(dtoConverter.toEntity(toCreate, false));
			return dtoConverter.toDTO(entity);
			
		} catch (br.com.senior.messaging.model.ServiceException e) {
			logger.error(e.getMessage(), e);
			throw e;
		} catch (IllegalArgumentException e) {
			logger.error(e.getMessage(), e);
			throw new br.com.senior.messaging.model.ServiceException(br.com.senior.messaging.ErrorCategory.INTERNAL_ERROR, translationHubApi.getMessage("my_domain.my_service.pedido_illegalArgument", "An internal error occurred: "
				+ e.getClass().getSimpleName() + ". Please check the request parameters and try again."), e);
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
			throw new br.com.senior.messaging.model.ServiceException(br.com.senior.messaging.ErrorCategory.INTERNAL_ERROR, translationHubApi.getMessage("my_domain.my_service.pedido_internalError", "An internal error occurred: "
				+ e.getClass().getSimpleName() + ". Please check the request parameters and try again."), e);
		}
	}
	
	@SecureResource(name=SECURITY_RESOURCE, action=ENTITY_SECURITY_ACTION_UPDATE)
	@Transactional
	@Override
	public Pedido updatePedido(Pedido toUpdate) {
		try {
			customValidator.validate(toUpdate, entityDefProvider.getEntityDef("pedido"));
			PedidoEntity modified = doUpdate(toUpdate);
			return dtoConverter.toDTO(modified);
			
		} catch (br.com.senior.messaging.model.ServiceException e) {
			logger.error(e.getMessage(), e);
			throw e;
		} catch (IllegalArgumentException e) {
			logger.error(e.getMessage(), e);
			throw new br.com.senior.messaging.model.ServiceException(br.com.senior.messaging.ErrorCategory.INTERNAL_ERROR, translationHubApi.getMessage("my_domain.my_service.pedido_illegalArgument", "An internal error occurred: "
				+ e.getClass().getSimpleName() + ". Please check the request parameters and try again."), e);
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
			throw new br.com.senior.messaging.model.ServiceException(br.com.senior.messaging.ErrorCategory.INTERNAL_ERROR, translationHubApi.getMessage("my_domain.my_service.pedido_internalError", "An internal error occurred: "
				+ e.getClass().getSimpleName() + ". Please check the request parameters and try again."), e);
		}
	}
	
	@SecureResource(name=SECURITY_RESOURCE, action=ENTITY_SECURITY_ACTION_UPDATE)
	@Transactional
	@Override
	public Pedido updateMergePedido(Pedido toUpdate) {
		try {
			customValidator.validate(toUpdate, entityDefProvider.getEntityDef("pedido"));
			PedidoEntity entity = service.retrievePedido(new Pedido.Id(toUpdate.id));
			dtoConverter.mergeEntity(entity, toUpdate);
			entity = service.updatePedido(entity);
			return dtoConverter.toDTO(entity);
			
		} catch (br.com.senior.messaging.model.ServiceException e) {
			logger.error(e.getMessage(), e);
			throw e;
		} catch (IllegalArgumentException e) {
			logger.error(e.getMessage(), e);
			throw new br.com.senior.messaging.model.ServiceException(br.com.senior.messaging.ErrorCategory.INTERNAL_ERROR, translationHubApi.getMessage("my_domain.my_service.pedido_illegalArgument", "An internal error occurred: "
				+ e.getClass().getSimpleName() + ". Please check the request parameters and try again."), e);
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
			throw new br.com.senior.messaging.model.ServiceException(br.com.senior.messaging.ErrorCategory.INTERNAL_ERROR, translationHubApi.getMessage("my_domain.my_service.pedido_internalError", "An internal error occurred: "
				+ e.getClass().getSimpleName() + ". Please check the request parameters and try again."), e);
		}
	}
	
	private PedidoEntity doUpdate(Pedido toUpdate) {
		java.util.Optional<PedidoEntity> optionalEntity = service.getRepository().findById(java.util.UUID.fromString(toUpdate.id));
		
		if(optionalEntity.isEmpty())
			throw new br.com.senior.messaging.model.ServiceException(br.com.senior.messaging.ErrorCategory.OBJECT_NOT_FOUND, translationHubApi.getExternalMessage("my_domain", "my_service", "my_domain.my_service.pedido_notFound", "Pedido not found with id " + toUpdate.id));
		
		PedidoEntity entity = optionalEntity.get();
		
		if(toUpdate.items != null)
			entity.getItems().clear();
		
		dtoConverter.updateEntity(entity, toUpdate);
		return doUpdate(entity);
	}
	
	private PedidoEntity doUpdate(PedidoEntity entity) {
		return service.updatePedido(entity);
	}
	
	@SecureResource(name=SECURITY_RESOURCE, action=ENTITY_SECURITY_ACTION_DELETE)
	@Transactional
	@Override
	public void deletePedido(Id id) {
		try {
			this.service.deletePedido(id);
		} catch(DataIntegrityViolationException ex) {
			logger.warn(ex.getMessage(), ex);
			if(ex.getCause() instanceof org.hibernate.exception.ConstraintViolationException) {
				org.hibernate.exception.ConstraintViolationException cve = (org.hibernate.exception.ConstraintViolationException) ex.getCause();
				throw new ServiceException(ErrorCategory.BAD_REQUEST, translationHubApi.getFormattedMessage("my_domain.my_service.delete_constraint_violation", cve.getConstraintName()));
			}
			
			throw new ServiceException(ErrorCategory.CONFLICT, translationHubApi.getMessage("my_domain.my_service.pedido_dataIntegrityViolation", "Data integrity violation to Delete Pedido. Error: " + ex.getMessage()), ex);
		}
	}
	
	@SecureResource(name=SECURITY_RESOURCE, action=ENTITY_SECURITY_ACTION_VIEW)
	@Transactional(readOnly = true)
	@Override
	public Pedido retrievePedido(Pedido.GetRequest request) {
		PedidoEntity entity = service.retrievePedido(new Pedido.Id(request.id));
		List<String> displayFields = request.displayFields == null ? getDefaultDisplayFields() : request.displayFields;
		return dtoConverter.toDTO(entity, displayFields);
	}
	
	@SecureResource(name=SECURITY_RESOURCE, action=ENTITY_SECURITY_ACTION_VIEW)
	@Transactional(readOnly = true)
	@Override
	public PagedResults listPedido(PageRequest pageRequest) {
		int skip = pageRequest.offset != null ? pageRequest.offset.intValue() : 0;
		int top = pageRequest.size != null ? pageRequest.size.intValue() : 0;
		String orderBy = pageRequest.orderBy == null ? ID_FIELD_NAME + " asc" : pageRequest.orderBy;
		String filter = pageRequest.filter;
		Page<PedidoEntity> pages = this.service.listPedidoPageable(skip, top, orderBy, filter);
		List<PedidoEntity> entities = pages.getContent();
		List<Pedido> dtos = null;
		List<String> displayFields = pageRequest.displayFields == null ? getDefaultDisplayFields() : pageRequest.displayFields;
		
		dtos = entities != null ? entities.stream().map(e -> dtoConverter.toDTO(e, displayFields)).collect(Collectors.toList()) : null;
		return new PagedResults(dtos, Long.valueOf(pages.getTotalPages()), Long.valueOf(pages.getTotalElements()));
	}
	
	public static List<String> getDefaultDisplayFields(){
		List<String> displayFields = new ArrayList<String>();
		displayFields.add("*");
		return displayFields;
	}
	
	@SecureResource(name=SECURITY_RESOURCE, action=ENTITY_SECURITY_ACTION_CREATE)
	@Transactional
	@Override
	public CreateBulkPedidoOutput createBulkPedido(CreateBulkPedidoInput toCreate) {
		if (toCreate != null) {
			List<Pedido> entitiesToCreate = toCreate.entities;
			if (entitiesToCreate != null && !entitiesToCreate.isEmpty()) {
				entitiesToCreate.forEach(bean -> {
					customValidator.validate(bean, entityDefProvider.getEntityDef("pedido"));
					bean.validate();
				});
				
				List<PedidoEntity> entities = entitiesToCreate.stream().map(bean -> dtoConverter.toEntity(bean))
						.collect(Collectors.toList());
				this.service.createBulk(entities);
			}
		}
		return new CreateBulkPedidoOutput();
	}
	
	@SecureResource(name=SECURITY_RESOURCE, action=ENTITY_SECURITY_ACTION_CREATE)
	@Transactional
	@Override
	public ImportPedidoOutput importPedido(ImportPedidoInput request) {
		Importer importer = BatchIntegrationController.getInstance().newImporter();
		StartImportProcess startImportProcess = new StartImportProcess(importer, request.config);
		startImportProcess.start();
		ImportPedidoOutput output = new ImportPedidoOutput(importer.getId());
		return output;
	}
	
	@SecureResource(name=SECURITY_RESOURCE, action=ENTITY_SECURITY_ACTION_VIEW)
	@Transactional(readOnly = true)
	@Override
	public ExportPedidoOutput exportPedido(ExportPedidoInput request) {
		/*
		 * **** Not implemented yet **** ExporterControl control =
		 * ExporterControl.getInstance(); Exporter exporter =
		 * control.newExporter(); StartExportProcess startExportProcess = new
		 * StartExportProcess(exporter, request.config);
		 * startExportProcess.start();
		 */
		ExportPedidoOutput output = new ExportPedidoOutput(
				null /* exporter.getId() */);
		return output;
	}
	
	class StartImportProcess extends Thread {
	
		private Importer importer;
		private ImportConfig config;
		
		StartImportProcess(Importer importer, ImportConfig config) {
			this.importer = importer;
			this.importer.addListener(new PedidoImporterListener());
			this.config = config;
			this.importer.logUri(this.config.uri);
		}
		
		@Async
		@Override
		public void run() {
			File blob = getBlobFile();
			try {
				Layout layout = LayoutDTOConverter.dtoToLayout(config.layout);
				try (FileReader reader = new FileReader(blob)) {
					importer.setReader(reader);
					importer.setLayout(layout);
					importer.setBeanClass(Pedido.class.getName());
					importer.setCrudService(PedidoHandler.this.service, (config.batchSize > 0));
					importer.setBatchSize(config.batchSize);
					if (config.async) {
						importer.startAsync();
					} else {
						try {
							importer.start();
						} catch (ImporterException e) {
							logger.error(e.getMessage(), e);
						}
					}
				}
			} catch (IOException e) {
				// isto nao deveria ocorrer
				logger.error(e.getMessage(), e);
			}
		}
		
		private File getBlobFile() {
			URI uri = null;
			try {
				uri = new URI(config.uri);
			} catch (URISyntaxException e1) {
				logger.error(e1.getMessage(), e1);
			}
			String scheme = uri.getScheme();
			if (scheme.equals("file")) {
				return new File(uri);
			} else if (scheme.startsWith("http")) {
				return getHttpBlobFile(uri);
			}
			return null;
		}
		
		private File getHttpBlobFile(URI uri) {
			importer.notifyDownload();
			HttpGet get = new HttpGet(uri);
			try (CloseableHttpClient httpClient = HttpClients.createDefault();
					CloseableHttpResponse httpResponse = httpClient.execute(get);
					InputStream is = httpResponse.getEntity().getContent()) {
				File blob = File.createTempFile("pedido", "blob");
				try (FileOutputStream fos = new FileOutputStream(blob);
						BufferedOutputStream bos = new BufferedOutputStream(fos);
						BufferedInputStream bis = new BufferedInputStream(is)) {
					byte[] bytes = new byte[8192];
					int tam = 0;
					while ((tam = bis.read(bytes)) > 0) {
						bos.write(bytes, 0, tam);
					}
					bos.flush();
					fos.flush();
				}
				return blob;
			} catch (IOException e) {
				logger.error(e.getMessage(), e);
			}
			return null;
		}
	}
}
