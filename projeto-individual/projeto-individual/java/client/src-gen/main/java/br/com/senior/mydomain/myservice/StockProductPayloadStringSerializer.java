package br.com.senior.mydomain.myservice;

import java.util.List;

public class StockProductPayloadStringSerializer {
    
	public static final StockProductPayloadStringSerializer INSTANCE = new StockProductPayloadStringSerializer();
    
    public void serialize(StockProductPayload stockProductPayload, StringBuilder sb, List<Object> appended) {
		sb.append(stockProductPayload.getClass().getSimpleName()).append(" [");
		if (appended.contains(stockProductPayload)) {
			sb.append("<Previously appended object>").append(']');
			return;
		}
		appended.add(stockProductPayload);
		serializeId(stockProductPayload, sb);
		sb.append(", ");
		sb.append(']');
	}
	
	protected void serializeId(StockProductPayload stockProductPayload, StringBuilder sb) {
		sb.append("id=").append(stockProductPayload.id == null ? "null" : stockProductPayload.id);
	}
}
