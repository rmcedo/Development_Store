package br.com.senior.mydomain.myservice;

import java.util.List;

public class FindPriceGreaterInputStringSerializer {
    
	public static final FindPriceGreaterInputStringSerializer INSTANCE = new FindPriceGreaterInputStringSerializer();
    
    public void serialize(FindPriceGreaterInput findPriceGreaterInput, StringBuilder sb, List<Object> appended) {
		sb.append(findPriceGreaterInput.getClass().getSimpleName()).append(" [");
		if (appended.contains(findPriceGreaterInput)) {
			sb.append("<Previously appended object>").append(']');
			return;
		}
		appended.add(findPriceGreaterInput);
		serializeValue(findPriceGreaterInput, sb);
		sb.append(", ");
		sb.append(']');
	}
	
	protected void serializeValue(FindPriceGreaterInput findPriceGreaterInput, StringBuilder sb) {
		sb.append("value=").append(findPriceGreaterInput.value == null ? "null" : findPriceGreaterInput.value);
	}
}
