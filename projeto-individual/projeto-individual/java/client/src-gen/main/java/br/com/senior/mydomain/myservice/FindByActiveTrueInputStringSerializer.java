package br.com.senior.mydomain.myservice;

import java.util.List;

public class FindByActiveTrueInputStringSerializer {
    
	public static final FindByActiveTrueInputStringSerializer INSTANCE = new FindByActiveTrueInputStringSerializer();
    
    public void serialize(FindByActiveTrueInput findByActiveTrueInput, StringBuilder sb, List<Object> appended) {
		sb.append(findByActiveTrueInput.getClass().getSimpleName()).append(" [");
		if (appended.contains(findByActiveTrueInput)) {
			sb.append("<Previously appended object>").append(']');
			return;
		}
		appended.add(findByActiveTrueInput);
		serializeActive(findByActiveTrueInput, sb);
		sb.append(", ");
		sb.append(']');
	}
	
	protected void serializeActive(FindByActiveTrueInput findByActiveTrueInput, StringBuilder sb) {
		sb.append("active=").append(findByActiveTrueInput.active == null ? "null" : findByActiveTrueInput.active);
	}
}
