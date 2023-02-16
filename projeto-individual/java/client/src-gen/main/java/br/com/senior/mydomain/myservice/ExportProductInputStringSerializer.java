package br.com.senior.mydomain.myservice;

import java.util.List;

public class ExportProductInputStringSerializer {
    
	public static final ExportProductInputStringSerializer INSTANCE = new ExportProductInputStringSerializer();
    
    public void serialize(ExportProductInput exportProductInput, StringBuilder sb, List<Object> appended) {
		sb.append(exportProductInput.getClass().getSimpleName()).append(" [");
		if (appended.contains(exportProductInput)) {
			sb.append("<Previously appended object>").append(']');
			return;
		}
		appended.add(exportProductInput);
		serializeConfig(exportProductInput, sb, appended);
		sb.append(", ");
		sb.append(']');
	}
	
	protected void serializeConfig(ExportProductInput exportProductInput, StringBuilder sb, List<Object> appended) {
		sb.append("config=<");
		if (exportProductInput.config == null) {
			sb.append("null");
		} else {
			exportProductInput.config.toString(sb, appended);
		}
		sb.append('>');
	}
}
