package br.com.senior.mydomain.myservice;

import java.util.List;

public class FindProductByNameOutputStringSerializer {
    
	public static final FindProductByNameOutputStringSerializer INSTANCE = new FindProductByNameOutputStringSerializer();
    
    public void serialize(FindProductByNameOutput findProductByNameOutput, StringBuilder sb, List<Object> appended) {
		sb.append(findProductByNameOutput.getClass().getSimpleName()).append(" [");
		if (appended.contains(findProductByNameOutput)) {
			sb.append("<Previously appended object>").append(']');
			return;
		}
		appended.add(findProductByNameOutput);
		serializeResponse(findProductByNameOutput, sb, appended);
		sb.append(", ");
		sb.append(']');
	}
	
	protected void serializeResponse(FindProductByNameOutput findProductByNameOutput, StringBuilder sb, List<Object> appended) {
		sb.append("response=<");
		if (findProductByNameOutput.response == null) {
			sb.append("null");
		} else {
			sb.append('[');
			int last = findProductByNameOutput.response.size() - 1;
			for (int i = 0; i <= last; i++) {
				findProductByNameOutput.response.get(i).toString(sb, appended);
				if (i < last) {
					sb.append(", ");
				}
			}
			sb.append(']');
		}
		sb.append('>');
	}
}
