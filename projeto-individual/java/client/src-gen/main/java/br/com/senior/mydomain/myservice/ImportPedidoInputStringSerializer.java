package br.com.senior.mydomain.myservice;

import java.util.List;

public class ImportPedidoInputStringSerializer {
    
	public static final ImportPedidoInputStringSerializer INSTANCE = new ImportPedidoInputStringSerializer();
    
    public void serialize(ImportPedidoInput importPedidoInput, StringBuilder sb, List<Object> appended) {
		sb.append(importPedidoInput.getClass().getSimpleName()).append(" [");
		if (appended.contains(importPedidoInput)) {
			sb.append("<Previously appended object>").append(']');
			return;
		}
		appended.add(importPedidoInput);
		serializeConfig(importPedidoInput, sb, appended);
		sb.append(", ");
		sb.append(']');
	}
	
	protected void serializeConfig(ImportPedidoInput importPedidoInput, StringBuilder sb, List<Object> appended) {
		sb.append("config=<");
		if (importPedidoInput.config == null) {
			sb.append("null");
		} else {
			importPedidoInput.config.toString(sb, appended);
		}
		sb.append('>');
	}
}
