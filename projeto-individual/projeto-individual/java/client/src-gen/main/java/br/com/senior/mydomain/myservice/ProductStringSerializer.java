package br.com.senior.mydomain.myservice;

import java.util.List;

public class ProductStringSerializer {
    
	public static final ProductStringSerializer INSTANCE = new ProductStringSerializer();
    
    public void serialize(Product product, StringBuilder sb, List<Object> appended) {
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
		sb.append(", ");
		serializeCategoria(product, sb);
		sb.append(", ");
		sb.append(']');
	}
	
	protected void serializeId(Product product, StringBuilder sb) {
		sb.append("id=").append(product.id == null ? "null" : product.id);
	}
	
	protected void serializeName(Product product, StringBuilder sb) {
		sb.append("name=").append(product.name == null ? "null" : product.name);
	}
	
	protected void serializeDescription(Product product, StringBuilder sb) {
		sb.append("description=").append(product.description == null ? "null" : product.description);
	}
	
	protected void serializePrice(Product product, StringBuilder sb) {
		sb.append("price=").append(product.price == null ? "null" : product.price);
	}
	
	protected void serializeStock(Product product, StringBuilder sb) {
		sb.append("stock=").append(product.stock == null ? "null" : product.stock);
	}
	
	protected void serializeActive(Product product, StringBuilder sb) {
		sb.append("active=").append(product.active == null ? "null" : product.active);
	}
	
	protected void serializeCategoria(Product product, StringBuilder sb) {
		sb.append("categoria=").append(product.categoria == null ? "null" : product.categoria);
	}
}
