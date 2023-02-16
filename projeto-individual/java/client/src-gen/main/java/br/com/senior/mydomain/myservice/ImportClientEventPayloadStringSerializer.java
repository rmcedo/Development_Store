package br.com.senior.mydomain.myservice;

import java.util.List;

public class ImportClientEventPayloadStringSerializer {
    
	public static final ImportClientEventPayloadStringSerializer INSTANCE = new ImportClientEventPayloadStringSerializer();
    
    public void serialize(ImportClientEventPayload importClientEventPayload, StringBuilder sb, List<Object> appended) {
		sb.append(importClientEventPayload.getClass().getSimpleName()).append(" [");
		if (appended.contains(importClientEventPayload)) {
			sb.append("<Previously appended object>").append(']');
			return;
		}
		appended.add(importClientEventPayload);
		serializeEventpl(importClientEventPayload, sb, appended);
		sb.append(", ");
		sb.append(']');
	}
	
	protected void serializeEventpl(ImportClientEventPayload importClientEventPayload, StringBuilder sb, List<Object> appended) {
		sb.append("eventpl=<");
		if (importClientEventPayload.eventpl == null) {
			sb.append("null");
		} else {
			importClientEventPayload.eventpl.toString(sb, appended);
		}
		sb.append('>');
	}
}
