package br.com.senior.mydomain.myservice;

import java.util.List;

public class ExportClientOutputStringSerializer {
    
	public static final ExportClientOutputStringSerializer INSTANCE = new ExportClientOutputStringSerializer();
    
    public void serialize(ExportClientOutput exportClientOutput, StringBuilder sb, List<Object> appended) {
		sb.append(exportClientOutput.getClass().getSimpleName()).append(" [");
		if (appended.contains(exportClientOutput)) {
			sb.append("<Previously appended object>").append(']');
			return;
		}
		appended.add(exportClientOutput);
		serializeExportJobId(exportClientOutput, sb);
		sb.append(", ");
		sb.append(']');
	}
	
	protected void serializeExportJobId(ExportClientOutput exportClientOutput, StringBuilder sb) {
		sb.append("exportJobId=").append(exportClientOutput.exportJobId == null ? "null" : exportClientOutput.exportJobId);
	}
}
