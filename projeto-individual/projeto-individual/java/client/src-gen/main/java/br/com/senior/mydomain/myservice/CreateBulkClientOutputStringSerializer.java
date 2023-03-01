package br.com.senior.mydomain.myservice;

import java.util.List;

public class CreateBulkClientOutputStringSerializer {
    
	public static final CreateBulkClientOutputStringSerializer INSTANCE = new CreateBulkClientOutputStringSerializer();
    
    public void serialize(CreateBulkClientOutput createBulkClientOutput, StringBuilder sb, List<Object> appended) {
		sb.append(createBulkClientOutput.getClass().getSimpleName()).append(" [");
		if (appended.contains(createBulkClientOutput)) {
			sb.append("<Previously appended object>").append(']');
			return;
		}
		appended.add(createBulkClientOutput);
		sb.append(']');
	}
	
}
