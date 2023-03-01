package br.com.senior.mydomain.myservice;

import java.util.List;

public class ImportItemEventPayloadStringSerializer {
    
	public static final ImportItemEventPayloadStringSerializer INSTANCE = new ImportItemEventPayloadStringSerializer();
    
    public void serialize(ImportItemEventPayload importItemEventPayload, StringBuilder sb, List<Object> appended) {
		sb.append(importItemEventPayload.getClass().getSimpleName()).append(" [");
		if (appended.contains(importItemEventPayload)) {
			sb.append("<Previously appended object>").append(']');
			return;
		}
		appended.add(importItemEventPayload);
		serializeEventpl(importItemEventPayload, sb, appended);
		sb.append(", ");
		sb.append(']');
	}
	
	protected void serializeEventpl(ImportItemEventPayload importItemEventPayload, StringBuilder sb, List<Object> appended) {
		sb.append("eventpl=<");
		if (importItemEventPayload.eventpl == null) {
			sb.append("null");
		} else {
			importItemEventPayload.eventpl.toString(sb, appended);
		}
		sb.append('>');
	}
}
