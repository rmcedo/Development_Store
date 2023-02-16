/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;

import java.util.List;
import br.com.senior.mydomain.myservice.Client.Id;
import br.com.senior.springbatchintegration.importer.CrudService;
import br.com.senior.messaging.customspringdata.CustomOrder;
import java.util.Set;
import br.com.senior.messaging.customspringdata.Join;
import org.springframework.data.domain.Page;

public interface ClientCrudService extends CrudService<ClientEntity> {
	
	public ClientEntity createClient(ClientEntity toCreate);
	
	@Deprecated
	public ClientEntity createMergeClient(ClientEntity toCreateMerge);
	
	public ClientEntity updateClient(ClientEntity toUpdate);
	
	@Deprecated
	public ClientEntity updateMergeClient(ClientEntity toUpdateMerge);
	
	public void deleteClient(Id id);
	
	public ClientEntity retrieveClient(Id id);
	
	@Deprecated
	public List<ClientEntity> listClient(int skip, int top);
	
	public Page<ClientEntity> listClientPageable(int skip, int top);
	
	public Page<ClientEntity> listClientPageable(int skip, int top, String orderBy);
	
	public Page<ClientEntity> listClientPageable(int skip, int top, String orderBy, String filter);
	
	public void createBulkClient(List<ClientEntity> entities);

	public ClientBaseRepository getRepository();
	
	public void validateFilterColumns(Set<String> columns, List<Join> joinFields, String lastPath);
	
	public void validateCustomOrders(List<CustomOrder> customOrders);
	
}
