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
		serializeFinalValue(findByFinalValueGreaterInput, sb);
		sb.append(", ");
		sb.append(']');
	}
	
	protected void serializeFinalValue(FindByFinalValueGreaterInput findByFinalValueGreaterInput, StringBuilder sb) {
		sb.append("finalValue=").append(findByFinalValueGreaterInput.finalValue == null ? "null" : findByFinalValueGreaterInput.finalValue);
	}
}
