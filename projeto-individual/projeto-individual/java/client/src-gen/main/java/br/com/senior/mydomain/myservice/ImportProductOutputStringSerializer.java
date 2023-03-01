package br.com.senior.mydomain.myservice;

import java.util.List;

public class ImportProductOutputStringSerializer {
    
	public static final ImportProductOutputStringSerializer INSTANCE = new ImportProductOutputStringSerializer();
    
    public void serialize(ImportProductOutput importProductOutput, StringBuilder sb, List<Object> appended) {
		sb.append(importProductOutput.getClass().getSimpleName()).append(" [");
		if (appended.contains(importProductOutput)) {
			sb.append("<Previously appended object>").append(']');
			return;
		}
		appended.add(importProductOutput);
		serializeImportJobId(importProductOutput, sb);
		sb.append(", ");
		sb.append(']');
	}
	
	protected void serializeImportJobId(ImportProductOutput importProductOutput, StringBuilder sb) {
		sb.append("importJobId=").append(importProductOutput.importJobId == null ? "null" : importProductOutput.importJobId);
	}
}
