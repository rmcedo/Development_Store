package br.com.senior.mydomain.myservice;

import java.util.List;

public class ImportClientInputStringSerializer {
    
	public static final ImportClientInputStringSerializer INSTANCE = new ImportClientInputStringSerializer();
    
    public void serialize(ImportClientInput importClientInput, StringBuilder sb, List<Object> appended) {
		sb.append(importClientInput.getClass().getSimpleName()).append(" [");
		if (appended.contains(importClientInput)) {
			sb.append("<Previously appended object>").append(']');
			return;
		}
		appended.add(importClientInput);
		serializeConfig(importClientInput, sb, appended);
		sb.append(", ");
		sb.append(']');
	}
	
	protected void serializeConfig(ImportClientInput importClientInput, StringBuilder sb, List<Object> appended) {
		sb.append("config=<");
		if (importClientInput.config == null) {
			sb.append("null");
		} else {
			importClientInput.config.toString(sb, appended);
		}
		sb.append('>');
	}
}
