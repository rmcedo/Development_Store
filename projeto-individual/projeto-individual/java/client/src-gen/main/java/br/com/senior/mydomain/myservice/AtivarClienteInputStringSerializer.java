package br.com.senior.mydomain.myservice;

import java.util.List;

public class AtivarClienteInputStringSerializer {
    
	public static final AtivarClienteInputStringSerializer INSTANCE = new AtivarClienteInputStringSerializer();
    
    public void serialize(AtivarClienteInput ativarClienteInput, StringBuilder sb, List<Object> appended) {
		sb.append(ativarClienteInput.getClass().getSimpleName()).append(" [");
		if (appended.contains(ativarClienteInput)) {
			sb.append("<Previously appended object>").append(']');
			return;
		}
		appended.add(ativarClienteInput);
		serializeId(ativarClienteInput, sb);
		sb.append(", ");
		sb.append(']');
	}
	
	protected void serializeId(AtivarClienteInput ativarClienteInput, StringBuilder sb) {
		sb.append("id=").append(ativarClienteInput.id == null ? "null" : ativarClienteInput.id);
	}
}
