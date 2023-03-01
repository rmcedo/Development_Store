package br.com.senior.mydomain.myservice;

import java.util.List;

public class ProductsWithPriceStringSerializer {
    
	public static final ProductsWithPriceStringSerializer INSTANCE = new ProductsWithPriceStringSerializer();
    
    public void serialize(ProductsWithPrice productsWithPrice, StringBuilder sb, List<Object> appended) {
		sb.append(productsWithPrice.getClass().getSimpleName()).append(" [");
		if (appended.contains(productsWithPrice)) {
			sb.append("<Previously appended object>").append(']');
			return;
		}
		appended.add(productsWithPrice);
		serializeName(productsWithPrice, sb);
		sb.append(", ");
		serializeStock(productsWithPrice, sb);
		sb.append(", ");
		serializePrice(productsWithPrice, sb);
		sb.append(", ");
		sb.append(']');
	}
	
	protected void serializeName(ProductsWithPrice productsWithPrice, StringBuilder sb) {
		sb.append("name=").append(productsWithPrice.name == null ? "null" : productsWithPrice.name);
	}
	
	protected void serializeStock(ProductsWithPrice productsWithPrice, StringBuilder sb) {
		sb.append("stock=").append(productsWithPrice.stock == null ? "null" : productsWithPrice.stock);
	}
	
	protected void serializePrice(ProductsWithPrice productsWithPrice, StringBuilder sb) {
		sb.append("price=").append(productsWithPrice.price == null ? "null" : productsWithPrice.price);
	}
}
