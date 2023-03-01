package br.com.senior.mydomain.myservice;

import java.util.List;

public class FindByCategoriaDSLInputStringSerializer {
    
	public static final FindByCategoriaDSLInputStringSerializer INSTANCE = new FindByCategoriaDSLInputStringSerializer();
    
    public void serialize(FindByCategoriaDSLInput findByCategoriaDSLInput, StringBuilder sb, List<Object> appended) {
		sb.append(findByCategoriaDSLInput.getClass().getSimpleName()).append(" [");
		if (appended.contains(findByCategoriaDSLInput)) {
			sb.append("<Previously appended object>").append(']');
			return;
		}
		appended.add(findByCategoriaDSLInput);
		serializeCategoria(findByCategoriaDSLInput, sb);
		sb.append(", ");
		sb.append(']');
	}
	
	protected void serializeCategoria(FindByCategoriaDSLInput findByCategoriaDSLInput, StringBuilder sb) {
		sb.append("categoria=").append(findByCategoriaDSLInput.categoria == null ? "null" : findByCategoriaDSLInput.categoria);
	}
}
