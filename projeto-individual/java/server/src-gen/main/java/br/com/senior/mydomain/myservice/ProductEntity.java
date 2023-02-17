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
import javax.persistence.UniqueConstraint;

import br.com.senior.custom.CustomEntity;
import br.com.senior.custom.odata.entity.ODataEntity;
import javax.persistence.Transient;
import org.springframework.data.domain.Persistable;

@Entity(name="my_domain.my_service.ProductEntity")
@ODataEntity(id = "product")
@Table(name="product", uniqueConstraints={
				@UniqueConstraint(columnNames={"name"})})
public class ProductEntity extends CustomEntity implements Persistable<java.util.UUID> {
	
	public static final String SECURITY_RESOURCE = "res://senior.com.br/my_domain/my_service/entities/product";

	/**
	 * ID do produto gerado automaticamente
	 */
	@Id
	@GeneratedValue(generator = "uuid2")
	@GenericGenerator(name = "uuid2", strategy = "uuid2")
	@Column(name = "id", updatable = false)
	private java.util.UUID id;
	
	/**
	 * Nome do Produto
	 */
	@Column(name = "name")
	private String name;
	
	/**
	 * Descrição/Características do Produto
	 */
	@Column(name = "description")
	private String description;
	
	/**
	 * Preço do Produto
	 */
	@Column(name = "price")
	private java.math.BigDecimal price;
	
	/**
	 * Quantidade de Estoque do Produto
	 */
	@Column(name = "stock")
	private Long stock;
	
	/**
	 * Mesma lógica de active de CLIENTE, LER ACIMA
	 */
	@Column(name = "active")
	private Boolean active;
	
	@Transient
	private boolean _newEntity;
	
	@Override
	public java.util.UUID getPk() {
		return this.id;
	}
	
	@Override
	public String getServiceEntityName() {
		return "product";
	}
	
	public java.util.UUID getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public String getDescription() {
		return description;
	}
	
	public java.math.BigDecimal getPrice() {
		return price;
	}
	
	public Long getStock() {
		return stock;
	}
	
	public Boolean getActive() {
		return active;
	}
	
	public void setId(java.util.UUID id) {
		this.id = id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public void setPrice(java.math.BigDecimal price) {
		this.price = price;
	}
	
	public void setStock(Long stock) {
		this.stock = stock;
	}
	
	public void setActive(Boolean active) {
		this.active = active;
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
	    if (!(obj instanceof ProductEntity)) {
	        return false;
	    }
	    ProductEntity other = (ProductEntity) obj;
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
		ProductEntityStringSerializer.INSTANCE.serialize(this, sb, appended);
	}
	
}
