package br.com.senior.mydomain.myservice;

import java.util.List;

public class FindProductPriceLessInputStringSerializer {
    
	public static final FindProductPriceLessInputStringSerializer INSTANCE = new FindProductPriceLessInputStringSerializer();
    
    public void serialize(FindProductPriceLessInput findProductPriceLessInput, StringBuilder sb, List<Object> appended) {
		sb.append(findProductPriceLessInput.getClass().getSimpleName()).append(" [");
		if (appended.contains(findProductPriceLessInput)) {
			sb.append("<Previously appended object>").append(']');
			return;
		}
		appended.add(findProductPriceLessInput);
		serializePrice(findProductPriceLessInput, sb);
		sb.append(", ");
		sb.append(']');
	}
	
	protected void serializePrice(FindProductPriceLessInput findProductPriceLessInput, StringBuilder sb) {
		sb.append("price=").append(findProductPriceLessInput.price == null ? "null" : findProductPriceLessInput.price);
	}
}
