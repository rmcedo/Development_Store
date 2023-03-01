package br.com.senior.mydomain.myservice;

import java.util.List;

public class FindProductByNameInputStringSerializer {
    
	public static final FindProductByNameInputStringSerializer INSTANCE = new FindProductByNameInputStringSerializer();
    
    public void serialize(FindProductByNameInput findProductByNameInput, StringBuilder sb, List<Object> appended) {
		sb.append(findProductByNameInput.getClass().getSimpleName()).append(" [");
		if (appended.contains(findProductByNameInput)) {
			sb.append("<Previously appended object>").append(']');
			return;
		}
		appended.add(findProductByNameInput);
		serializeName(findProductByNameInput, sb);
		sb.append(", ");
		sb.append(']');
	}
	
	protected void serializeName(FindProductByNameInput findProductByNameInput, StringBuilder sb) {
		sb.append("name=").append(findProductByNameInput.name == null ? "null" : findProductByNameInput.name);
	}
}
