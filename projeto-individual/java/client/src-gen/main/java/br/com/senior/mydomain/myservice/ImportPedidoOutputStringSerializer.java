package br.com.senior.mydomain.myservice;

import java.util.List;

public class ImportPedidoOutputStringSerializer {
    
	public static final ImportPedidoOutputStringSerializer INSTANCE = new ImportPedidoOutputStringSerializer();
    
    public void serialize(ImportPedidoOutput importPedidoOutput, StringBuilder sb, List<Object> appended) {
		sb.append(importPedidoOutput.getClass().getSimpleName()).append(" [");
		if (appended.contains(importPedidoOutput)) {
			sb.append("<Previously appended object>").append(']');
			return;
		}
		appended.add(importPedidoOutput);
		serializeImportJobId(importPedidoOutput, sb);
		sb.append(", ");
		sb.append(']');
	}
	
	protected void serializeImportJobId(ImportPedidoOutput importPedidoOutput, StringBuilder sb) {
		sb.append("importJobId=").append(importPedidoOutput.importJobId == null ? "null" : importPedidoOutput.importJobId);
	}
}
