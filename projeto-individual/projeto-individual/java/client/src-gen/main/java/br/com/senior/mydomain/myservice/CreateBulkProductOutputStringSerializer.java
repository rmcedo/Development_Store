package br.com.senior.mydomain.myservice;

import java.util.List;

public class CreateBulkProductOutputStringSerializer {
    
	public static final CreateBulkProductOutputStringSerializer INSTANCE = new CreateBulkProductOutputStringSerializer();
    
    public void serialize(CreateBulkProductOutput createBulkProductOutput, StringBuilder sb, List<Object> appended) {
		sb.append(createBulkProductOutput.getClass().getSimpleName()).append(" [");
		if (appended.contains(createBulkProductOutput)) {
			sb.append("<Previously appended object>").append(']');
			return;
		}
		appended.add(createBulkProductOutput);
		sb.append(']');
	}
	
}
