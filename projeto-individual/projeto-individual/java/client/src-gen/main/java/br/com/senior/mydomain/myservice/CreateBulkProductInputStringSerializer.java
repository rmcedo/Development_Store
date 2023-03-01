package br.com.senior.mydomain.myservice;

import java.util.List;

public class CreateBulkProductInputStringSerializer {
    
	public static final CreateBulkProductInputStringSerializer INSTANCE = new CreateBulkProductInputStringSerializer();
    
    public void serialize(CreateBulkProductInput createBulkProductInput, StringBuilder sb, List<Object> appended) {
		sb.append(createBulkProductInput.getClass().getSimpleName()).append(" [");
		if (appended.contains(createBulkProductInput)) {
			sb.append("<Previously appended object>").append(']');
			return;
		}
		appended.add(createBulkProductInput);
		serializeEntities(createBulkProductInput, sb);
		sb.append(", ");
		sb.append(']');
	}
	
	protected void serializeEntities(CreateBulkProductInput createBulkProductInput, StringBuilder sb) {
		sb.append("entities=").append(createBulkProductInput.entities == null ? "null" : createBulkProductInput.entities);
	}
}
