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
import javax.persistence.Transient;
import org.springframework.data.domain.Persistable;

@Entity(name="my_domain.my_service.ItemEntity")
@ODataEntity(id = "item")
@Table(name="item")
public class ItemEntity extends CustomEntity implements Persistable<java.util.UUID> {
	
	public static final String SECURITY_RESOURCE = "res://senior.com.br/my_domain/my_service/entities/item";

	/**
	 * ID do Item, gerado automaticamente
	 */
	@Id
	@GeneratedValue(generator = "uuid2")
	@GenericGenerator(name = "uuid2", strategy = "uuid2")
	@Column(name = "id", updatable = false)
	private java.util.UUID id;
	
	/**
	 * ID do Pedido do qual este item pertence
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "pedido")
	private PedidoEntity pedido;
	
	/**
	 * ID do Produto do qual este item consiste
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "product")
	private ProductEntity product;
	
	/**
	 * Quantidade de produtos dentro do Item
	 */
	@Column(name = "quantity")
	private Long quantity;
	
	/**
	 * Valor unitário do Item, referente ao preço do Produto
	 */
	@Column(name = "unitary_value")
	private java.math.BigDecimal unitaryValue;
	
	/**
	 * Valor Total referente a quantidade de itens multiplicando com seu valor unitário
	 */
	@Column(name = "total_value")
	private java.math.BigDecimal totalValue;
	
	@Transient
	private boolean _newEntity;
	
	@Override
	public java.util.UUID getPk() {
		return this.id;
	}
	
	@Override
	public String getServiceEntityName() {
		return "item";
	}
	
	public java.util.UUID getId() {
		return id;
	}
	
	public PedidoEntity getPedido() {
		return pedido;
	}
	
	public ProductEntity getProduct() {
		return product;
	}
	
	public Long getQuantity() {
		return quantity;
	}
	
	public java.math.BigDecimal getUnitaryValue() {
		return unitaryValue;
	}
	
	public java.math.BigDecimal getTotalValue() {
		return totalValue;
	}
	
	public void setId(java.util.UUID id) {
		this.id = id;
	}
	
	public void setPedido(PedidoEntity pedido) {
		this.pedido = pedido;
	}
	
	public void setProduct(ProductEntity product) {
		this.product = product;
	}
	
	public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}
	
	public void setUnitaryValue(java.math.BigDecimal unitaryValue) {
		this.unitaryValue = unitaryValue;
	}
	
	public void setTotalValue(java.math.BigDecimal totalValue) {
		this.totalValue = totalValue;
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
	    if (!(obj instanceof ItemEntity)) {
	        return false;
	    }
	    ItemEntity other = (ItemEntity) obj;
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
		ItemEntityStringSerializer.INSTANCE.serialize(this, sb, appended);
	}
	
}
