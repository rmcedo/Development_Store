package br.com.senior.mydomain.myservice;

import java.util.List;

public class ImportClientOutputStringSerializer {
    
	public static final ImportClientOutputStringSerializer INSTANCE = new ImportClientOutputStringSerializer();
    
    public void serialize(ImportClientOutput importClientOutput, StringBuilder sb, List<Object> appended) {
		sb.append(importClientOutput.getClass().getSimpleName()).append(" [");
		if (appended.contains(importClientOutput)) {
			sb.append("<Previously appended object>").append(']');
			return;
		}
		appended.add(importClientOutput);
		serializeImportJobId(importClientOutput, sb);
		sb.append(", ");
		sb.append(']');
	}
	
	protected void serializeImportJobId(ImportClientOutput importClientOutput, StringBuilder sb) {
		sb.append("importJobId=").append(importClientOutput.importJobId == null ? "null" : importClientOutput.importJobId);
	}
}
