package br.com.senior.mydomain.myservice;

import java.util.List;

public class ClientStringSerializer {
    
	public static final ClientStringSerializer INSTANCE = new ClientStringSerializer();
    
    public void serialize(Client client, StringBuilder sb, List<Object> appended) {
		sb.append(client.getClass().getSimpleName()).append(" [");
		if (appended.contains(client)) {
			sb.append("<Previously appended object>").append(']');
			return;
		}
		appended.add(client);
		serializeId(client, sb);
		sb.append(", ");
		serializeName(client, sb);
		sb.append(", ");
		serializeCpf(client, sb);
		sb.append(", ");
		serializeBirthday(client, sb);
		sb.append(", ");
		serializeActive(client, sb);
		sb.append(", ");
		sb.append(']');
	}
	
	protected void serializeId(Client client, StringBuilder sb) {
		sb.append("id=").append(client.id == null ? "null" : client.id);
	}
	
	protected void serializeName(Client client, StringBuilder sb) {
		sb.append("name=").append(client.name == null ? "null" : client.name);
	}
	
	protected void serializeCpf(Client client, StringBuilder sb) {
		sb.append("cpf=").append(client.cpf == null ? "null" : client.cpf);
	}
	
	protected void serializeBirthday(Client client, StringBuilder sb) {
		sb.append("birthday=").append(client.birthday == null ? "null" : client.birthday);
	}
	
	protected void serializeActive(Client client, StringBuilder sb) {
		sb.append("active=").append(client.active == null ? "null" : client.active);
	}
}
