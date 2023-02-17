package br.com.senior.mydomain.myservice;

import java.util.List;

public class FindProductStockGreaterOutputStringSerializer {
    
	public static final FindProductStockGreaterOutputStringSerializer INSTANCE = new FindProductStockGreaterOutputStringSerializer();
    
    public void serialize(FindProductStockGreaterOutput findProductStockGreaterOutput, StringBuilder sb, List<Object> appended) {
		sb.append(findProductStockGreaterOutput.getClass().getSimpleName()).append(" [");
		if (appended.contains(findProductStockGreaterOutput)) {
			sb.append("<Previously appended object>").append(']');
			return;
		}
		appended.add(findProductStockGreaterOutput);
		serializeResponse(findProductStockGreaterOutput, sb, appended);
		sb.append(", ");
		sb.append(']');
	}
	
	protected void serializeResponse(FindProductStockGreaterOutput findProductStockGreaterOutput, StringBuilder sb, List<Object> appended) {
		sb.append("response=<");
		if (findProductStockGreaterOutput.response == null) {
			sb.append("null");
		} else {
			sb.append('[');
			int last = findProductStockGreaterOutput.response.size() - 1;
			for (int i = 0; i <= last; i++) {
				findProductStockGreaterOutput.response.get(i).toString(sb, appended);
				if (i < last) {
					sb.append(", ");
				}
			}
			sb.append(']');
		}
		sb.append('>');
	}
}
