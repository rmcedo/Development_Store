package br.com.senior.mydomain.myservice;

import java.util.List;

public class FindPriceGreaterOutputStringSerializer {
    
	public static final FindPriceGreaterOutputStringSerializer INSTANCE = new FindPriceGreaterOutputStringSerializer();
    
    public void serialize(FindPriceGreaterOutput findPriceGreaterOutput, StringBuilder sb, List<Object> appended) {
		sb.append(findPriceGreaterOutput.getClass().getSimpleName()).append(" [");
		if (appended.contains(findPriceGreaterOutput)) {
			sb.append("<Previously appended object>").append(']');
			return;
		}
		appended.add(findPriceGreaterOutput);
		serializeResponse(findPriceGreaterOutput, sb, appended);
		sb.append(", ");
		sb.append(']');
	}
	
	protected void serializeResponse(FindPriceGreaterOutput findPriceGreaterOutput, StringBuilder sb, List<Object> appended) {
		sb.append("response=<");
		if (findPriceGreaterOutput.response == null) {
			sb.append("null");
		} else {
			sb.append('[');
			int last = findPriceGreaterOutput.response.size() - 1;
			for (int i = 0; i <= last; i++) {
				findPriceGreaterOutput.response.get(i).toString(sb, appended);
				if (i < last) {
					sb.append(", ");
				}
			}
			sb.append(']');
		}
		sb.append('>');
	}
}
