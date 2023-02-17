package br.com.senior.mydomain.myservice;

import java.util.List;

public class FindByCpfInputStringSerializer {
    
	public static final FindByCpfInputStringSerializer INSTANCE = new FindByCpfInputStringSerializer();
    
    public void serialize(FindByCpfInput findByCpfInput, StringBuilder sb, List<Object> appended) {
		sb.append(findByCpfInput.getClass().getSimpleName()).append(" [");
		if (appended.contains(findByCpfInput)) {
			sb.append("<Previously appended object>").append(']');
			return;
		}
		appended.add(findByCpfInput);
		serializeCpf(findByCpfInput, sb);
		sb.append(", ");
		sb.append(']');
	}
	
	protected void serializeCpf(FindByCpfInput findByCpfInput, StringBuilder sb) {
		sb.append("cpf=").append(findByCpfInput.cpf == null ? "null" : findByCpfInput.cpf);
	}
}
