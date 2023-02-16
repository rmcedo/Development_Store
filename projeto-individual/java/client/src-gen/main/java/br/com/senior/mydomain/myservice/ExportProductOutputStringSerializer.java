package br.com.senior.mydomain.myservice;

import java.util.List;

public class ExportProductOutputStringSerializer {
    
	public static final ExportProductOutputStringSerializer INSTANCE = new ExportProductOutputStringSerializer();
    
    public void serialize(ExportProductOutput exportProductOutput, StringBuilder sb, List<Object> appended) {
		sb.append(exportProductOutput.getClass().getSimpleName()).append(" [");
		if (appended.contains(exportProductOutput)) {
			sb.append("<Previously appended object>").append(']');
			return;
		}
		appended.add(exportProductOutput);
		serializeExportJobId(exportProductOutput, sb);
		sb.append(", ");
		sb.append(']');
	}
	
	protected void serializeExportJobId(ExportProductOutput exportProductOutput, StringBuilder sb) {
		sb.append("exportJobId=").append(exportProductOutput.exportJobId == null ? "null" : exportProductOutput.exportJobId);
	}
}
