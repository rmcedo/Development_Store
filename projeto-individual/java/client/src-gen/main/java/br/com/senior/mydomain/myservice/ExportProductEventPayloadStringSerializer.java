package br.com.senior.mydomain.myservice;

import java.util.List;

public class ExportProductEventPayloadStringSerializer {
    
	public static final ExportProductEventPayloadStringSerializer INSTANCE = new ExportProductEventPayloadStringSerializer();
    
    public void serialize(ExportProductEventPayload exportProductEventPayload, StringBuilder sb, List<Object> appended) {
		sb.append(exportProductEventPayload.getClass().getSimpleName()).append(" [");
		if (appended.contains(exportProductEventPayload)) {
			sb.append("<Previously appended object>").append(']');
			return;
		}
		appended.add(exportProductEventPayload);
		serializeEventpl(exportProductEventPayload, sb, appended);
		sb.append(", ");
		sb.append(']');
	}
	
	protected void serializeEventpl(ExportProductEventPayload exportProductEventPayload, StringBuilder sb, List<Object> appended) {
		sb.append("eventpl=<");
		if (exportProductEventPayload.eventpl == null) {
			sb.append("null");
		} else {
			exportProductEventPayload.eventpl.toString(sb, appended);
		}
		sb.append('>');
	}
}
