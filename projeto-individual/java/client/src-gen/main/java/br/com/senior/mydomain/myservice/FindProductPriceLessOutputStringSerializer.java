package br.com.senior.mydomain.myservice;

import java.util.List;

public class FindProductPriceLessOutputStringSerializer {
    
	public static final FindProductPriceLessOutputStringSerializer INSTANCE = new FindProductPriceLessOutputStringSerializer();
    
    public void serialize(FindProductPriceLessOutput findProductPriceLessOutput, StringBuilder sb, List<Object> appended) {
		sb.append(findProductPriceLessOutput.getClass().getSimpleName()).append(" [");
		if (appended.contains(findProductPriceLessOutput)) {
			sb.append("<Previously appended object>").append(']');
			return;
		}
		appended.add(findProductPriceLessOutput);
		serializeResponse(findProductPriceLessOutput, sb, appended);
		sb.append(", ");
		sb.append(']');
	}
	
	protected void serializeResponse(FindProductPriceLessOutput findProductPriceLessOutput, StringBuilder sb, List<Object> appended) {
		sb.append("response=<");
		if (findProductPriceLessOutput.response == null) {
			sb.append("null");
		} else {
			sb.append('[');
			int last = findProductPriceLessOutput.response.size() - 1;
			for (int i = 0; i <= last; i++) {
				findProductPriceLessOutput.response.get(i).toString(sb, appended);
				if (i < last) {
					sb.append(", ");
				}
			}
			sb.append(']');
		}
		sb.append('>');
	}
}
