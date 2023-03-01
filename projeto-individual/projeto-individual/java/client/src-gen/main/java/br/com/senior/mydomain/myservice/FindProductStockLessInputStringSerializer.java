package br.com.senior.mydomain.myservice;

import java.util.List;

public class FindProductStockLessInputStringSerializer {
    
	public static final FindProductStockLessInputStringSerializer INSTANCE = new FindProductStockLessInputStringSerializer();
    
    public void serialize(FindProductStockLessInput findProductStockLessInput, StringBuilder sb, List<Object> appended) {
		sb.append(findProductStockLessInput.getClass().getSimpleName()).append(" [");
		if (appended.contains(findProductStockLessInput)) {
			sb.append("<Previously appended object>").append(']');
			return;
		}
		appended.add(findProductStockLessInput);
		serializeStock(findProductStockLessInput, sb);
		sb.append(", ");
		sb.append(']');
	}
	
	protected void serializeStock(FindProductStockLessInput findProductStockLessInput, StringBuilder sb) {
		sb.append("stock=").append(findProductStockLessInput.stock == null ? "null" : findProductStockLessInput.stock);
	}
}
