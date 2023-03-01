package br.com.senior.mydomain.myservice;

import java.util.List;

public class ExportPedidoInputStringSerializer {
    
	public static final ExportPedidoInputStringSerializer INSTANCE = new ExportPedidoInputStringSerializer();
    
    public void serialize(ExportPedidoInput exportPedidoInput, StringBuilder sb, List<Object> appended) {
		sb.append(exportPedidoInput.getClass().getSimpleName()).append(" [");
		if (appended.contains(exportPedidoInput)) {
			sb.append("<Previously appended object>").append(']');
			return;
		}
		appended.add(exportPedidoInput);
		serializeConfig(exportPedidoInput, sb, appended);
		sb.append(", ");
		sb.append(']');
	}
	
	protected void serializeConfig(ExportPedidoInput exportPedidoInput, StringBuilder sb, List<Object> appended) {
		sb.append("config=<");
		if (exportPedidoInput.config == null) {
			sb.append("null");
		} else {
			exportPedidoInput.config.toString(sb, appended);
		}
		sb.append('>');
	}
}
