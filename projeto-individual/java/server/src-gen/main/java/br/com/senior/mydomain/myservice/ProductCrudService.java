/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;

import java.util.List;
import br.com.senior.mydomain.myservice.Product.Id;
import br.com.senior.springbatchintegration.importer.CrudService;
import br.com.senior.messaging.customspringdata.CustomOrder;
import java.util.Set;
import br.com.senior.messaging.customspringdata.Join;
import org.springframework.data.domain.Page;

public interface ProductCrudService extends CrudService<ProductEntity> {
	
	public ProductEntity createProduct(ProductEntity toCreate);
	
	@Deprecated
	public ProductEntity createMergeProduct(ProductEntity toCreateMerge);
	
	public ProductEntity updateProduct(ProductEntity toUpdate);
	
	@Deprecated
	public ProductEntity updateMergeProduct(ProductEntity toUpdateMerge);
	
	public void deleteProduct(Id id);
	
	public ProductEntity retrieveProduct(Id id);
	
	@Deprecated
	public List<ProductEntity> listProduct(int skip, int top);
	
	public Page<ProductEntity> listProductPageable(int skip, int top);
	
	public Page<ProductEntity> listProductPageable(int skip, int top, String orderBy);
	
	public Page<ProductEntity> listProductPageable(int skip, int top, String orderBy, String filter);
	
	public void createBulkProduct(List<ProductEntity> entities);

	public ProductBaseRepository getRepository();
	
	public void validateFilterColumns(Set<String> columns, List<Join> joinFields, String lastPath);
	
	public void validateCustomOrders(List<CustomOrder> customOrders);
	
}
