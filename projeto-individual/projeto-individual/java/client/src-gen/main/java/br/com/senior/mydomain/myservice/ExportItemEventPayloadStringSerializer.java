package br.com.senior.mydomain.myservice;

import java.util.List;

public class ExportItemEventPayloadStringSerializer {
    
	public static final ExportItemEventPayloadStringSerializer INSTANCE = new ExportItemEventPayloadStringSerializer();
    
    public void serialize(ExportItemEventPayload exportItemEventPayload, StringBuilder sb, List<Object> appended) {
		sb.append(exportItemEventPayload.getClass().getSimpleName()).append(" [");
		if (appended.contains(exportItemEventPayload)) {
			sb.append("<Previously appended object>").append(']');
			return;
		}
		appended.add(exportItemEventPayload);
		serializeEventpl(exportItemEventPayload, sb, appended);
		sb.append(", ");
		sb.append(']');
	}
	
	protected void serializeEventpl(ExportItemEventPayload exportItemEventPayload, StringBuilder sb, List<Object> appended) {
		sb.append("eventpl=<");
		if (exportItemEventPayload.eventpl == null) {
			sb.append("null");
		} else {
			exportItemEventPayload.eventpl.toString(sb, appended);
		}
		sb.append('>');
	}
}
