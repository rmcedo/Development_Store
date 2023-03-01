package br.com.senior.mydomain.myservice;

import java.util.List;

public class PedidoStringSerializer {
    
	public static final PedidoStringSerializer INSTANCE = new PedidoStringSerializer();
    
    public void serialize(Pedido pedido, StringBuilder sb, List<Object> appended) {
		sb.append(pedido.getClass().getSimpleName()).append(" [");
		if (appended.contains(pedido)) {
			sb.append("<Previously appended object>").append(']');
			return;
		}
		appended.add(pedido);
		serializeId(pedido, sb);
		sb.append(", ");
		serializeClient(pedido, sb, appended);
		sb.append(", ");
		serializeItems(pedido, sb, appended);
		sb.append(", ");
		serializeOrderDate(pedido, sb);
		sb.append(", ");
		serializeFinalValue(pedido, sb);
		sb.append(", ");
		sb.append(']');
	}
	
	protected void serializeId(Pedido pedido, StringBuilder sb) {
		sb.append("id=").append(pedido.id == null ? "null" : pedido.id);
	}
	
	protected void serializeClient(Pedido pedido, StringBuilder sb, List<Object> appended) {
		sb.append("client=<");
		if (pedido.client == null) {
			sb.append("null");
		} else {
			pedido.client.toString(sb, appended);
		}
		sb.append('>');
	}
	
	protected void serializeItems(Pedido pedido, StringBuilder sb, List<Object> appended) {
		sb.append("items=<");
		if (pedido.items == null) {
			sb.append("null");
		} else {
			sb.append('[');
			int last = pedido.items.size() - 1;
			for (int i = 0; i <= last; i++) {
				pedido.items.get(i).toString(sb, appended);
				if (i < last) {
					sb.append(", ");
				}
			}
			sb.append(']');
		}
		sb.append('>');
	}
	
	protected void serializeOrderDate(Pedido pedido, StringBuilder sb) {
		sb.append("orderDate=").append(pedido.orderDate == null ? "null" : pedido.orderDate);
	}
	
	protected void serializeFinalValue(Pedido pedido, StringBuilder sb) {
		sb.append("finalValue=").append(pedido.finalValue == null ? "null" : pedido.finalValue);
	}
}
