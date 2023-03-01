package br.com.senior.mydomain.myservice;

import java.util.List;

public class ItemStringSerializer {
    
	public static final ItemStringSerializer INSTANCE = new ItemStringSerializer();
    
    public void serialize(Item item, StringBuilder sb, List<Object> appended) {
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
		sb.append(", ");
		sb.append(']');
	}
	
	protected void serializeId(Item item, StringBuilder sb) {
		sb.append("id=").append(item.id == null ? "null" : item.id);
	}
	
	protected void serializePedido(Item item, StringBuilder sb, List<Object> appended) {
		sb.append("pedido=<");
		if (item.pedido == null) {
			sb.append("null");
		} else {
			item.pedido.toString(sb, appended);
		}
		sb.append('>');
	}
	
	protected void serializeProduct(Item item, StringBuilder sb, List<Object> appended) {
		sb.append("product=<");
		if (item.product == null) {
			sb.append("null");
		} else {
			item.product.toString(sb, appended);
		}
		sb.append('>');
	}
	
	protected void serializeQuantity(Item item, StringBuilder sb) {
		sb.append("quantity=").append(item.quantity == null ? "null" : item.quantity);
	}
	
	protected void serializeUnitaryValue(Item item, StringBuilder sb) {
		sb.append("unitaryValue=").append(item.unitaryValue == null ? "null" : item.unitaryValue);
	}
	
	protected void serializeTotalValue(Item item, StringBuilder sb) {
		sb.append("totalValue=").append(item.totalValue == null ? "null" : item.totalValue);
	}
}
