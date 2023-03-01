package br.com.senior.mydomain.myservice;

import java.util.List;

public class ProductActivatedPayloadStringSerializer {
    
	public static final ProductActivatedPayloadStringSerializer INSTANCE = new ProductActivatedPayloadStringSerializer();
    
    public void serialize(ProductActivatedPayload productActivatedPayload, StringBuilder sb, List<Object> appended) {
		sb.append(productActivatedPayload.getClass().getSimpleName()).append(" [");
		if (appended.contains(productActivatedPayload)) {
			sb.append("<Previously appended object>").append(']');
			return;
		}
		appended.add(productActivatedPayload);
		serializeId(productActivatedPayload, sb);
		sb.append(", ");
		sb.append(']');
	}
	
	protected void serializeId(ProductActivatedPayload productActivatedPayload, StringBuilder sb) {
		sb.append("id=").append(productActivatedPayload.id == null ? "null" : productActivatedPayload.id);
	}
}
