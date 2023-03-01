package br.com.senior.mydomain.myservice;

import java.util.List;

public class AtivarProductInputStringSerializer {
    
	public static final AtivarProductInputStringSerializer INSTANCE = new AtivarProductInputStringSerializer();
    
    public void serialize(AtivarProductInput ativarProductInput, StringBuilder sb, List<Object> appended) {
		sb.append(ativarProductInput.getClass().getSimpleName()).append(" [");
		if (appended.contains(ativarProductInput)) {
			sb.append("<Previously appended object>").append(']');
			return;
		}
		appended.add(ativarProductInput);
		serializeId(ativarProductInput, sb);
		sb.append(", ");
		sb.append(']');
	}
	
	protected void serializeId(AtivarProductInput ativarProductInput, StringBuilder sb) {
		sb.append("id=").append(ativarProductInput.id == null ? "null" : ativarProductInput.id);
	}
}
