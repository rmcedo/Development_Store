/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;

import java.util.List;

public class ItemEntityStringSerializer {
	
	public static final ItemEntityStringSerializer INSTANCE = new ItemEntityStringSerializer();
    
    public void serialize(ItemEntity item, StringBuilder sb, List<Object> appended) {
		sb.append(item.getClass().getSimpleName()).append(" [");
		if (appended.contains(item)) {
			sb.append("<Previously appended object>").append(']');
			return;
		}
		appended.add(item);
		serializeId(item, sb);
		sb.append(", ");
		serializePedido(item, sb, appended);
		sb.append(", ");
		serializeProduct(item, sb, appended);
		sb.append(", ");
		serializeQuantity(item, sb);
		sb.append(", ");
		serializeUnitaryValue(item, sb);
		sb.append(", ");
		serializeTotalValue(item, sb);
		sb.append(", ").append(", ");
		sb.append(']');
	}
	
	protected void serializeId(ItemEntity item, StringBuilder sb) {
		sb.append("id=").append(item.getId() == null ? "null" : item.getId());
	}
	
	protected void serializePedido(ItemEntity item, StringBuilder sb, List<Object> appended) {
		sb.append("pedido=<");
		if (item.getPedido() == null) {
			sb.append("null");
		} else {
			item.getPedido().toString(sb, appended);
		}
		sb.append('>');
	}
	
	protected void serializeProduct(ItemEntity item, StringBuilder sb, List<Object> appended) {
		sb.append("product=<");
		if (item.getProduct() == null) {
			sb.append("null");
		} else {
			item.getProduct().toString(sb, appended);
		}
		sb.append('>');
	}
	
	protected void serializeQuantity(ItemEntity item, StringBuilder sb) {
		sb.append("quantity=").append(item.getQuantity() == null ? "null" : item.getQuantity());
	}
	
	protected void serializeUnitaryValue(ItemEntity item, StringBuilder sb) {
		sb.append("unitaryValue=").append(item.getUnitaryValue() == null ? "null" : item.getUnitaryValue());
	}
	
	protected void serializeTotalValue(ItemEntity item, StringBuilder sb) {
		sb.append("totalValue=").append(item.getTotalValue() == null ? "null" : item.getTotalValue());
	}
}
