package br.com.senior.mydomain.myservice;

import java.util.List;

public class ExportPedidoEventPayloadStringSerializer {
    
	public static final ExportPedidoEventPayloadStringSerializer INSTANCE = new ExportPedidoEventPayloadStringSerializer();
    
    public void serialize(ExportPedidoEventPayload exportPedidoEventPayload, StringBuilder sb, List<Object> appended) {
		sb.append(exportPedidoEventPayload.getClass().getSimpleName()).append(" [");
		if (appended.contains(exportPedidoEventPayload)) {
			sb.append("<Previously appended object>").append(']');
			return;
		}
		appended.add(exportPedidoEventPayload);
		serializeEventpl(exportPedidoEventPayload, sb, appended);
		sb.append(", ");
		sb.append(']');
	}
	
	protected void serializeEventpl(ExportPedidoEventPayload exportPedidoEventPayload, StringBuilder sb, List<Object> appended) {
		sb.append("eventpl=<");
		if (exportPedidoEventPayload.eventpl == null) {
			sb.append("null");
		} else {
			exportPedidoEventPayload.eventpl.toString(sb, appended);
		}
		sb.append('>');
	}
}
