package br.com.senior.mydomain.myservice;

import java.util.List;

public class CreateBulkClientInputStringSerializer {
    
	public static final CreateBulkClientInputStringSerializer INSTANCE = new CreateBulkClientInputStringSerializer();
    
    public void serialize(CreateBulkClientInput createBulkClientInput, StringBuilder sb, List<Object> appended) {
		sb.append(createBulkClientInput.getClass().getSimpleName()).append(" [");
		if (appended.contains(createBulkClientInput)) {
			sb.append("<Previously appended object>").append(']');
			return;
		}
		appended.add(createBulkClientInput);
		serializeEntities(createBulkClientInput, sb);
		sb.append(", ");
		sb.append(']');
	}
	
	protected void serializeEntities(CreateBulkClientInput createBulkClientInput, StringBuilder sb) {
		sb.append("entities=").append(createBulkClientInput.entities == null ? "null" : createBulkClientInput.entities);
	}
}
