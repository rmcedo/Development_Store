package br.com.senior.mydomain.myservice;

import java.util.List;

public class ExportPedidoOutputStringSerializer {
    
	public static final ExportPedidoOutputStringSerializer INSTANCE = new ExportPedidoOutputStringSerializer();
    
    public void serialize(ExportPedidoOutput exportPedidoOutput, StringBuilder sb, List<Object> appended) {
		sb.append(exportPedidoOutput.getClass().getSimpleName()).append(" [");
		if (appended.contains(exportPedidoOutput)) {
			sb.append("<Previously appended object>").append(']');
			return;
		}
		appended.add(exportPedidoOutput);
		serializeExportJobId(exportPedidoOutput, sb);
		sb.append(", ");
		sb.append(']');
	}
	
	protected void serializeExportJobId(ExportPedidoOutput exportPedidoOutput, StringBuilder sb) {
		sb.append("exportJobId=").append(exportPedidoOutput.exportJobId == null ? "null" : exportPedidoOutput.exportJobId);
	}
}
