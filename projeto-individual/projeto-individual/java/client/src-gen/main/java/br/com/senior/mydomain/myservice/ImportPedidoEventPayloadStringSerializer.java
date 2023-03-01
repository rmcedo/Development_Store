package br.com.senior.mydomain.myservice;

import java.util.List;

public class ImportPedidoEventPayloadStringSerializer {
    
	public static final ImportPedidoEventPayloadStringSerializer INSTANCE = new ImportPedidoEventPayloadStringSerializer();
    
    public void serialize(ImportPedidoEventPayload importPedidoEventPayload, StringBuilder sb, List<Object> appended) {
		sb.append(importPedidoEventPayload.getClass().getSimpleName()).append(" [");
		if (appended.contains(importPedidoEventPayload)) {
			sb.append("<Previously appended object>").append(']');
			return;
		}
		appended.add(importPedidoEventPayload);
		serializeEventpl(importPedidoEventPayload, sb, appended);
		sb.append(", ");
		sb.append(']');
	}
	
	protected void serializeEventpl(ImportPedidoEventPayload importPedidoEventPayload, StringBuilder sb, List<Object> appended) {
		sb.append("eventpl=<");
		if (importPedidoEventPayload.eventpl == null) {
			sb.append("null");
		} else {
			importPedidoEventPayload.eventpl.toString(sb, appended);
		}
		sb.append('>');
	}
}
