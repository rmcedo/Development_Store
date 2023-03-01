/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;

import org.springframework.data.jpa.repository.Query;
import br.com.senior.messaging.customspringdata.CustomRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface PedidoBaseRepository extends CustomRepository<PedidoEntity, java.util.UUID> {
	
	@Query("select d from my_domain.my_service.PedidoEntity p left join p.items d where p.id = ?1 and d.id = ?2")
	ItemEntity findItemsByPedidoIdAndItemId(java.util.UUID PedidoId, java.util.UUID ItemId);
	
}
