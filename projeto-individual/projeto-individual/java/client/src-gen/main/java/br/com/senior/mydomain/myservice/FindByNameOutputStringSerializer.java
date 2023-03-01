package br.com.senior.mydomain.myservice;

import java.util.List;

public class FindByNameOutputStringSerializer {
    
	public static final FindByNameOutputStringSerializer INSTANCE = new FindByNameOutputStringSerializer();
    
    public void serialize(FindByNameOutput findByNameOutput, StringBuilder sb, List<Object> appended) {
		sb.append(findByNameOutput.getClass().getSimpleName()).append(" [");
		if (appended.contains(findByNameOutput)) {
			sb.append("<Previously appended object>").append(']');
			return;
		}
		appended.add(findByNameOutput);
		serializeResponse(findByNameOutput, sb, appended);
		sb.append(", ");
		sb.append(']');
	}
	
	protected void serializeResponse(FindByNameOutput findByNameOutput, StringBuilder sb, List<Object> appended) {
		sb.append("response=<");
		if (findByNameOutput.response == null) {
			sb.append("null");
		} else {
			sb.append('[');
			int last = findByNameOutput.response.size() - 1;
			for (int i = 0; i <= last; i++) {
				findByNameOutput.response.get(i).toString(sb, appended);
				if (i < last) {
					sb.append(", ");
				}
			}
			sb.append(']');
		}
		sb.append('>');
	}
}
