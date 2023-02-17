package br.com.senior.mydomain.myservice;

import java.util.List;

public class FindProductStockGreaterInputStringSerializer {
    
	public static final FindProductStockGreaterInputStringSerializer INSTANCE = new FindProductStockGreaterInputStringSerializer();
    
    public void serialize(FindProductStockGreaterInput findProductStockGreaterInput, StringBuilder sb, List<Object> appended) {
		sb.append(findProductStockGreaterInput.getClass().getSimpleName()).append(" [");
		if (appended.contains(findProductStockGreaterInput)) {
			sb.append("<Previously appended object>").append(']');
			return;
		}
		appended.add(findProductStockGreaterInput);
		serializeStock(findProductStockGreaterInput, sb);
		sb.append(", ");
		sb.append(']');
	}
	
	protected void serializeStock(FindProductStockGreaterInput findProductStockGreaterInput, StringBuilder sb) {
		sb.append("stock=").append(findProductStockGreaterInput.stock == null ? "null" : findProductStockGreaterInput.stock);
	}
}
