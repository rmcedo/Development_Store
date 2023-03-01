package br.com.senior.mydomain.myservice;

import java.util.List;

public class CreateBulkItemInputStringSerializer {
    
	public static final CreateBulkItemInputStringSerializer INSTANCE = new CreateBulkItemInputStringSerializer();
    
    public void serialize(CreateBulkItemInput createBulkItemInput, StringBuilder sb, List<Object> appended) {
		sb.append(createBulkItemInput.getClass().getSimpleName()).append(" [");
		if (appended.contains(createBulkItemInput)) {
			sb.append("<Previously appended object>").append(']');
			return;
		}
		appended.add(createBulkItemInput);
		serializeEntities(createBulkItemInput, sb);
		sb.append(", ");
		sb.append(']');
	}
	
	protected void serializeEntities(CreateBulkItemInput createBulkItemInput, StringBuilder sb) {
		sb.append("entities=").append(createBulkItemInput.entities == null ? "null" : createBulkItemInput.entities);
	}
}
