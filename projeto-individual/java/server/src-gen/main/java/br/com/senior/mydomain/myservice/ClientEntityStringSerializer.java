/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;

import java.util.List;

public class ClientEntityStringSerializer {
	
	public static final ClientEntityStringSerializer INSTANCE = new ClientEntityStringSerializer();
    
    public void serialize(ClientEntity client, StringBuilder sb, List<Object> appended) {
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
		sb.append(", ").append(", ");
		sb.append(']');
	}
	
	protected void serializeId(ClientEntity client, StringBuilder sb) {
		sb.append("id=").append(client.getId() == null ? "null" : client.getId());
	}
	
	protected void serializeName(ClientEntity client, StringBuilder sb) {
		sb.append("name=").append(client.getName() == null ? "null" : client.getName());
	}
	
	protected void serializeCpf(ClientEntity client, StringBuilder sb) {
		sb.append("cpf=").append(client.getCpf() == null ? "null" : client.getCpf());
	}
	
	protected void serializeBirthday(ClientEntity client, StringBuilder sb) {
		sb.append("birthday=").append(client.getBirthday() == null ? "null" : client.getBirthday());
	}
	
	protected void serializeActive(ClientEntity client, StringBuilder sb) {
		sb.append("active=").append(client.getActive() == null ? "null" : client.getActive());
	}
}
