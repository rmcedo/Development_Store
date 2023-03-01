package br.com.senior.mydomain.myservice;

import java.util.List;

public class CreateBulkPedidoInputStringSerializer {
    
	public static final CreateBulkPedidoInputStringSerializer INSTANCE = new CreateBulkPedidoInputStringSerializer();
    
    public void serialize(CreateBulkPedidoInput createBulkPedidoInput, StringBuilder sb, List<Object> appended) {
		sb.append(createBulkPedidoInput.getClass().getSimpleName()).append(" [");
		if (appended.contains(createBulkPedidoInput)) {
			sb.append("<Previously appended object>").append(']');
			return;
		}
		appended.add(createBulkPedidoInput);
		serializeEntities(createBulkPedidoInput, sb);
		sb.append(", ");
		sb.append(']');
	}
	
	protected void serializeEntities(CreateBulkPedidoInput createBulkPedidoInput, StringBuilder sb) {
		sb.append("entities=").append(createBulkPedidoInput.entities == null ? "null" : createBulkPedidoInput.entities);
	}
}
