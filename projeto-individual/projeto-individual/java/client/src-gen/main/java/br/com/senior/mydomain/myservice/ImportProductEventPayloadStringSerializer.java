package br.com.senior.mydomain.myservice;

import java.util.List;

public class ImportProductEventPayloadStringSerializer {
    
	public static final ImportProductEventPayloadStringSerializer INSTANCE = new ImportProductEventPayloadStringSerializer();
    
    public void serialize(ImportProductEventPayload importProductEventPayload, StringBuilder sb, List<Object> appended) {
		sb.append(importProductEventPayload.getClass().getSimpleName()).append(" [");
		if (appended.contains(importProductEventPayload)) {
			sb.append("<Previously appended object>").append(']');
			return;
		}
		appended.add(importProductEventPayload);
		serializeEventpl(importProductEventPayload, sb, appended);
		sb.append(", ");
		sb.append(']');
	}
	
	protected void serializeEventpl(ImportProductEventPayload importProductEventPayload, StringBuilder sb, List<Object> appended) {
		sb.append("eventpl=<");
		if (importProductEventPayload.eventpl == null) {
			sb.append("null");
		} else {
			importProductEventPayload.eventpl.toString(sb, appended);
		}
		sb.append('>');
	}
}
