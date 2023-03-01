package br.com.senior.mydomain.myservice;

import java.util.List;

public class CreateBulkPedidoOutputStringSerializer {
    
	public static final CreateBulkPedidoOutputStringSerializer INSTANCE = new CreateBulkPedidoOutputStringSerializer();
    
    public void serialize(CreateBulkPedidoOutput createBulkPedidoOutput, StringBuilder sb, List<Object> appended) {
		sb.append(createBulkPedidoOutput.getClass().getSimpleName()).append(" [");
		if (appended.contains(createBulkPedidoOutput)) {
			sb.append("<Previously appended object>").append(']');
			return;
		}
		appended.add(createBulkPedidoOutput);
		sb.append(']');
	}
	
}
