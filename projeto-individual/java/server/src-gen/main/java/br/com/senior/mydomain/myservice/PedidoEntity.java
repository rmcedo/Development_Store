/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import org.hibernate.annotations.GenericGenerator;

import br.com.senior.custom.CustomEntity;
import br.com.senior.custom.odata.entity.ODataEntity;

import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.CascadeType;
import java.util.Optional;
import javax.persistence.Transient;
import org.springframework.data.domain.Persistable;

@Entity(name="my_domain.my_service.PedidoEntity")
@ODataEntity(id = "pedido")
@Table(name="pedido")
public class PedidoEntity extends CustomEntity implements Persistable<java.util.UUID> {
	
	public static final String SECURITY_RESOURCE = "res://senior.com.br/my_domain/my_service/entities/pedido";

	/**
	 * ID do Pedido, gerado automaticamente
	 */
	@Id
	@GeneratedValue(generator = "uuid2")
	@GenericGenerator(name = "uuid2", strategy = "uuid2")
	@Column(name = "id", updatable = false)
	private java.util.UUID id;
	
	/**
	 * ID do Cliente que está realizando o Pedido
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "client")
	private ClientEntity client;
	
	/**
	 * Lista de Itens de Produtos que contém no Pedido
	 */
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "pedido", cascade = CascadeType.ALL, orphanRemoval = true)
	private java.util.List<ItemEntity> items = new ArrayList<>();
	
	/**
	 * Data de realização do Pedido
	 */
	@Column(name = "order_date")
	private java.time.LocalDate orderDate;
	
	/**
	 * Valor Final do Pedido, somando os valor totais dos itens do Pedido
	 */
	@Column(name = "final_value")
	private java.math.BigDecimal finalValue;
	
	@Transient
	private boolean _newEntity;
	
	@Override
	public java.util.UUID getPk() {
		return this.id;
	}
	
	@Override
	public String getServiceEntityName() {
		return "pedido";
	}
	
	public java.util.UUID getId() {
		return id;
	}
	
	public ClientEntity getClient() {
		return client;
	}
	
	public java.util.List<ItemEntity> getItems() {
		return items;
	}
	
	public java.time.LocalDate getOrderDate() {
		return orderDate;
	}
	
	public java.math.BigDecimal getFinalValue() {
		return finalValue;
	}
	
	public void setId(java.util.UUID id) {
		this.id = id;
	}
	
	public void setClient(ClientEntity client) {
		this.client = client;
	}
	
	public void setItems(List<ItemEntity> items) {
		if (items != null) {
			items.forEach(this::addToItems);
		} else {
			final List<ItemEntity> current = new ArrayList<ItemEntity>();
			current.addAll(this.items);
			current.forEach(this::removeFromItems);
		}
	}
	
	public void addToItems(ItemEntity itemEntity) {
		if (itemEntity.getId() == null || !items.contains(itemEntity)) {
			items.add(itemEntity);
			itemEntity.setPedido(this);
		} else {
			//required for merge operations
			items.remove(items.indexOf(itemEntity));
			items.add(itemEntity);
			itemEntity.setPedido(this);
		}
	}
	
	public ItemEntity getFromItems(java.util.UUID itemEntityId) {
		Optional<ItemEntity> entity = items.stream().filter(e -> e.getId().equals(itemEntityId)).findFirst();
		if (entity.isPresent()) {
			return entity.get();
		}
		return null;
	}
	
	public void removeFromItems(ItemEntity itemEntity) {
		items.remove(itemEntity);
		itemEntity.setPedido(null);
	}
	
	public void setOrderDate(java.time.LocalDate orderDate) {
		this.orderDate = orderDate;
	}
	
	public void setFinalValue(java.math.BigDecimal finalValue) {
		this.finalValue = finalValue;
	}
	
	@Override
	public boolean isNew() {
		return _newEntity;
	}
	
	public void defineAsNewEntity() {
		this._newEntity = true;
	}
	
	@Override
	public int hashCode() {
	    int ret = 1;
	    if (id != null) {
	        ret = 31 * ret + id.hashCode();
	    }
	    return ret;
	}
	
	@Override
	public boolean equals(Object obj) {
	    if (this == obj) {
	        return true;
	    }
	    if (!(obj instanceof PedidoEntity)) {
	        return false;
	    }
	    PedidoEntity other = (PedidoEntity) obj;
	    if (id == null) {
	        return false;
	    }
	    if ((id != null) && !id.equals(other.id)) {
	        return false;
	    }
	    return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		toString(sb, new ArrayList<>());
		return sb.toString();
	}
	
	void toString(StringBuilder sb, List<Object> appended) {
		PedidoEntityStringSerializer.INSTANCE.serialize(this, sb, appended);
	}
	
}
