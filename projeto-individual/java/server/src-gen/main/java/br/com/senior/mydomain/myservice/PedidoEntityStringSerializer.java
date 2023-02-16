/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;

import java.util.List;

public class PedidoEntityStringSerializer {
	
	public static final PedidoEntityStringSerializer INSTANCE = new PedidoEntityStringSerializer();
    
    public void serialize(PedidoEntity pedido, StringBuilder sb, List<Object> appended) {
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
		sb.append(", ").append(", ");
		sb.append(']');
	}
	
	protected void serializeId(PedidoEntity pedido, StringBuilder sb) {
		sb.append("id=").append(pedido.getId() == null ? "null" : pedido.getId());
	}
	
	protected void serializeClient(PedidoEntity pedido, StringBuilder sb, List<Object> appended) {
		sb.append("client=<");
		if (pedido.getClient() == null) {
			sb.append("null");
		} else {
			pedido.getClient().toString(sb, appended);
		}
		sb.append('>');
	}
	
	protected void serializeItems(PedidoEntity pedido, StringBuilder sb, List<Object> appended) {
		sb.append("items=<");
		if (pedido.getItems() == null) {
			sb.append("null");
		} else {
			sb.append('[');
			int last = pedido.getItems().size() - 1;
			int i = 0;
			for (ItemEntity item : pedido.getItems()) {
				item.toString(sb, appended);
				if (i < last) {
					sb.append(", ");
				}
				i++;
			}
			sb.append(']');
		}
		sb.append('>');
	}
	
	protected void serializeOrderDate(PedidoEntity pedido, StringBuilder sb) {
		sb.append("orderDate=").append(pedido.getOrderDate() == null ? "null" : pedido.getOrderDate());
	}
	
	protected void serializeFinalValue(PedidoEntity pedido, StringBuilder sb) {
		sb.append("finalValue=").append(pedido.getFinalValue() == null ? "null" : pedido.getFinalValue());
	}
}
