package br.com.senior.mydomain.myservice;

import java.util.List;

public class FindProductStockLessOutputStringSerializer {
    
	public static final FindProductStockLessOutputStringSerializer INSTANCE = new FindProductStockLessOutputStringSerializer();
    
    public void serialize(FindProductStockLessOutput findProductStockLessOutput, StringBuilder sb, List<Object> appended) {
		sb.append(findProductStockLessOutput.getClass().getSimpleName()).append(" [");
		if (appended.contains(findProductStockLessOutput)) {
			sb.append("<Previously appended object>").append(']');
			return;
		}
		appended.add(findProductStockLessOutput);
		serializeResponse(findProductStockLessOutput, sb, appended);
		sb.append(", ");
		sb.append(']');
	}
	
	protected void serializeResponse(FindProductStockLessOutput findProductStockLessOutput, StringBuilder sb, List<Object> appended) {
		sb.append("response=<");
		if (findProductStockLessOutput.response == null) {
			sb.append("null");
		} else {
			sb.append('[');
			int last = findProductStockLessOutput.response.size() - 1;
			for (int i = 0; i <= last; i++) {
				findProductStockLessOutput.response.get(i).toString(sb, appended);
				if (i < last) {
					sb.append(", ");
				}
			}
			sb.append(']');
		}
		sb.append('>');
	}
}
