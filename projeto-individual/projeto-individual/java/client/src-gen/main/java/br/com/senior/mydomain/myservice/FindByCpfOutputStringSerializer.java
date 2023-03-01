package br.com.senior.mydomain.myservice;

import java.util.List;

public class FindByCpfOutputStringSerializer {
    
	public static final FindByCpfOutputStringSerializer INSTANCE = new FindByCpfOutputStringSerializer();
    
    public void serialize(FindByCpfOutput findByCpfOutput, StringBuilder sb, List<Object> appended) {
		sb.append(findByCpfOutput.getClass().getSimpleName()).append(" [");
		if (appended.contains(findByCpfOutput)) {
			sb.append("<Previously appended object>").append(']');
			return;
		}
		appended.add(findByCpfOutput);
		serializeResponse(findByCpfOutput, sb, appended);
		sb.append(", ");
		sb.append(']');
	}
	
	protected void serializeResponse(FindByCpfOutput findByCpfOutput, StringBuilder sb, List<Object> appended) {
		sb.append("response=<");
		if (findByCpfOutput.response == null) {
			sb.append("null");
		} else {
			sb.append('[');
			int last = findByCpfOutput.response.size() - 1;
			for (int i = 0; i <= last; i++) {
				findByCpfOutput.response.get(i).toString(sb, appended);
				if (i < last) {
					sb.append(", ");
				}
			}
			sb.append(']');
		}
		sb.append('>');
	}
}
