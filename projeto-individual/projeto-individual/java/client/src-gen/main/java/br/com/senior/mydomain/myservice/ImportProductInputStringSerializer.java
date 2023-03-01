package br.com.senior.mydomain.myservice;

import java.util.List;

public class ImportProductInputStringSerializer {
    
	public static final ImportProductInputStringSerializer INSTANCE = new ImportProductInputStringSerializer();
    
    public void serialize(ImportProductInput importProductInput, StringBuilder sb, List<Object> appended) {
		sb.append(importProductInput.getClass().getSimpleName()).append(" [");
		if (appended.contains(importProductInput)) {
			sb.append("<Previously appended object>").append(']');
			return;
		}
		appended.add(importProductInput);
		serializeConfig(importProductInput, sb, appended);
		sb.append(", ");
		sb.append(']');
	}
	
	protected void serializeConfig(ImportProductInput importProductInput, StringBuilder sb, List<Object> appended) {
		sb.append("config=<");
		if (importProductInput.config == null) {
			sb.append("null");
		} else {
			importProductInput.config.toString(sb, appended);
		}
		sb.append('>');
	}
}
