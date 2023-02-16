package br.com.senior.mydomain.myservice;

import java.util.List;

public class ExportClientEventPayloadStringSerializer {
    
	public static final ExportClientEventPayloadStringSerializer INSTANCE = new ExportClientEventPayloadStringSerializer();
    
    public void serialize(ExportClientEventPayload exportClientEventPayload, StringBuilder sb, List<Object> appended) {
		sb.append(exportClientEventPayload.getClass().getSimpleName()).append(" [");
		if (appended.contains(exportClientEventPayload)) {
			sb.append("<Previously appended object>").append(']');
			return;
		}
		appended.add(exportClientEventPayload);
		serializeEventpl(exportClientEventPayload, sb, appended);
		sb.append(", ");
		sb.append(']');
	}
	
	protected void serializeEventpl(ExportClientEventPayload exportClientEventPayload, StringBuilder sb, List<Object> appended) {
		sb.append("eventpl=<");
		if (exportClientEventPayload.eventpl == null) {
			sb.append("null");
		} else {
			exportClientEventPayload.eventpl.toString(sb, appended);
		}
		sb.append('>');
	}
}
