package br.com.senior.mydomain.myservice;

import java.util.List;

public class CreateBulkItemOutputStringSerializer {
    
	public static final CreateBulkItemOutputStringSerializer INSTANCE = new CreateBulkItemOutputStringSerializer();
    
    public void serialize(CreateBulkItemOutput createBulkItemOutput, StringBuilder sb, List<Object> appended) {
		sb.append(createBulkItemOutput.getClass().getSimpleName()).append(" [");
		if (appended.contains(createBulkItemOutput)) {
			sb.append("<Previously appended object>").append(']');
			return;
		}
		appended.add(createBulkItemOutput);
		sb.append(']');
	}
	
}
