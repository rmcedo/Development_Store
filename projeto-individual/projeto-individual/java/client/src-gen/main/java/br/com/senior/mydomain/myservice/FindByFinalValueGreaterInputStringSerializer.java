package br.com.senior.mydomain.myservice;

import java.util.List;

public class FindByFinalValueGreaterInputStringSerializer {
    
	public static final FindByFinalValueGreaterInputStringSerializer INSTANCE = new FindByFinalValueGreaterInputStringSerializer();
    
    public void serialize(FindByFinalValueGreaterInput findByFinalValueGreaterInput, StringBuilder sb, List<Object> appended) {
		sb.append(findByFinalValueGreaterInput.getClass().getSimpleName()).append(" [");
		if (appended.contains(findByFinalValueGreaterInput)) {
			sb.append("<Previously appended object>").append(']');
			return;
		}
		appended.add(findByFinalValueGreaterInput);
		serializeValue(findByFinalValueGreaterInput, sb);
		sb.append(", ");
		sb.append(']');
	}
	
	protected void serializeValue(FindByFinalValueGreaterInput findByFinalValueGreaterInput, StringBuilder sb) {
		sb.append("value=").append(findByFinalValueGreaterInput.value == null ? "null" : findByFinalValueGreaterInput.value);
	}
}
