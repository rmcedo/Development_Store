/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;

import java.util.List;

public class ProductEntityStringSerializer {
	
	public static final ProductEntityStringSerializer INSTANCE = new ProductEntityStringSerializer();
    
    public void serialize(ProductEntity product, StringBuilder sb, List<Object> appended) {
		sb.append(product.getClass().getSimpleName()).append(" [");
		if (appended.contains(product)) {
			sb.append("<Previously appended object>").append(']');
			return;
		}
		appended.add(product);
		serializeId(product, sb);
		sb.append(", ");
		serializeName(product, sb);
		sb.append(", ");
		serializeDescription(product, sb);
		sb.append(", ");
		serializePrice(product, sb);
		sb.append(", ");
		serializeStock(product, sb);
		sb.append(", ");
		serializeActive(product, sb);
		sb.append(", ").append(", ");
		sb.append(']');
	}
	
	protected void serializeId(ProductEntity product, StringBuilder sb) {
		sb.append("id=").append(product.getId() == null ? "null" : product.getId());
	}
	
	protected void serializeName(ProductEntity product, StringBuilder sb) {
		sb.append("name=").append(product.getName() == null ? "null" : product.getName());
	}
	
	protected void serializeDescription(ProductEntity product, StringBuilder sb) {
		sb.append("description=").append(product.getDescription() == null ? "null" : product.getDescription());
	}
	
	protected void serializePrice(ProductEntity product, StringBuilder sb) {
		sb.append("price=").append(product.getPrice() == null ? "null" : product.getPrice());
	}
	
	protected void serializeStock(ProductEntity product, StringBuilder sb) {
		sb.append("stock=").append(product.getStock() == null ? "null" : product.getStock());
	}
	
	protected void serializeActive(ProductEntity product, StringBuilder sb) {
		sb.append("active=").append(product.getActive() == null ? "null" : product.getActive());
	}
}
