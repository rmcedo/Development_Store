package br.com.senior.mydomain.myservice;

import java.util.List;

public class ExportClientInputStringSerializer {
    
	public static final ExportClientInputStringSerializer INSTANCE = new ExportClientInputStringSerializer();
    
    public void serialize(ExportClientInput exportClientInput, StringBuilder sb, List<Object> appended) {
		sb.append(exportClientInput.getClass().getSimpleName()).append(" [");
		if (appended.contains(exportClientInput)) {
			sb.append("<Previously appended object>").append(']');
			return;
		}
		appended.add(exportClientInput);
		serializeConfig(exportClientInput, sb, appended);
		sb.append(", ");
		sb.append(']');
	}
	
	protected void serializeConfig(ExportClientInput exportClientInput, StringBuilder sb, List<Object> appended) {
		sb.append("config=<");
		if (exportClientInput.config == null) {
			sb.append("null");
		} else {
			exportClientInput.config.toString(sb, appended);
		}
		sb.append('>');
	}
}
