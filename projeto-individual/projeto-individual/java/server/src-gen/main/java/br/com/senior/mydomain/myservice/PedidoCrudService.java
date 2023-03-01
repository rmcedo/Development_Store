/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;

import java.util.List;
import br.com.senior.mydomain.myservice.Pedido.Id;
import br.com.senior.springbatchintegration.importer.CrudService;
import br.com.senior.messaging.customspringdata.CustomOrder;
import java.util.Set;
import br.com.senior.messaging.customspringdata.Join;
import org.springframework.data.domain.Page;

public interface PedidoCrudService extends CrudService<PedidoEntity> {
	
	public PedidoEntity createPedido(PedidoEntity toCreate);
	
	@Deprecated
	public PedidoEntity createMergePedido(PedidoEntity toCreateMerge);
	
	public PedidoEntity updatePedido(PedidoEntity toUpdate);
	
	@Deprecated
	public PedidoEntity updateMergePedido(PedidoEntity toUpdateMerge);
	
	public void deletePedido(Id id);
	
	public PedidoEntity retrievePedido(Id id);
	
	@Deprecated
	public List<PedidoEntity> listPedido(int skip, int top);
	
	public Page<PedidoEntity> listPedidoPageable(int skip, int top);
	
	public Page<PedidoEntity> listPedidoPageable(int skip, int top, String orderBy);
	
	public Page<PedidoEntity> listPedidoPageable(int skip, int top, String orderBy, String filter);
	
	public void createBulkPedido(List<PedidoEntity> entities);

	public PedidoBaseRepository getRepository();
	
	public void validateFilterColumns(Set<String> columns, List<Join> joinFields, String lastPath);
	
	public void validateCustomOrders(List<CustomOrder> customOrders);
	
}
