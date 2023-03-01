package br.com.senior.mydomain.myservice;

import java.util.List;

public class FindByNameInputStringSerializer {
    
	public static final FindByNameInputStringSerializer INSTANCE = new FindByNameInputStringSerializer();
    
    public void serialize(FindByNameInput findByNameInput, StringBuilder sb, List<Object> appended) {
		sb.append(findByNameInput.getClass().getSimpleName()).append(" [");
		if (appended.contains(findByNameInput)) {
			sb.append("<Previously appended object>").append(']');
			return;
		}
		appended.add(findByNameInput);
		serializeName(findByNameInput, sb);
		sb.append(", ");
		sb.append(']');
	}
	
	protected void serializeName(FindByNameInput findByNameInput, StringBuilder sb) {
		sb.append("name=").append(findByNameInput.name == null ? "null" : findByNameInput.name);
	}
}
