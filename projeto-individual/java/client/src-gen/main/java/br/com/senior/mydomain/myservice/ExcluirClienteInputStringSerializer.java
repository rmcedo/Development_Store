package br.com.senior.mydomain.myservice;

import java.util.List;

public class ExcluirClienteInputStringSerializer {
    
	public static final ExcluirClienteInputStringSerializer INSTANCE = new ExcluirClienteInputStringSerializer();
    
    public void serialize(ExcluirClienteInput excluirClienteInput, StringBuilder sb, List<Object> appended) {
		sb.append(excluirClienteInput.getClass().getSimpleName()).append(" [");
		if (appended.contains(excluirClienteInput)) {
			sb.append("<Previously appended object>").append(']');
			return;
		}
		appended.add(excluirClienteInput);
		serializeId(excluirClienteInput, sb);
		sb.append(", ");
		sb.append(']');
	}
	
	protected void serializeId(ExcluirClienteInput excluirClienteInput, StringBuilder sb) {
		sb.append("id=").append(excluirClienteInput.id == null ? "null" : excluirClienteInput.id);
	}
}
