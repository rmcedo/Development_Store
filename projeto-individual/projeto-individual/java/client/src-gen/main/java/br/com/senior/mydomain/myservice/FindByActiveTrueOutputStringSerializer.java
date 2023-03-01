package br.com.senior.mydomain.myservice;

import java.util.List;

public class FindByActiveTrueOutputStringSerializer {
    
	public static final FindByActiveTrueOutputStringSerializer INSTANCE = new FindByActiveTrueOutputStringSerializer();
    
    public void serialize(FindByActiveTrueOutput findByActiveTrueOutput, StringBuilder sb, List<Object> appended) {
		sb.append(findByActiveTrueOutput.getClass().getSimpleName()).append(" [");
		if (appended.contains(findByActiveTrueOutput)) {
			sb.append("<Previously appended object>").append(']');
			return;
		}
		appended.add(findByActiveTrueOutput);
		serializeResponse(findByActiveTrueOutput, sb, appended);
		sb.append(", ");
		sb.append(']');
	}
	
	protected void serializeResponse(FindByActiveTrueOutput findByActiveTrueOutput, StringBuilder sb, List<Object> appended) {
		sb.append("response=<");
		if (findByActiveTrueOutput.response == null) {
			sb.append("null");
		} else {
			sb.append('[');
			int last = findByActiveTrueOutput.response.size() - 1;
			for (int i = 0; i <= last; i++) {
				findByActiveTrueOutput.response.get(i).toString(sb, appended);
				if (i < last) {
					sb.append(", ");
				}
			}
			sb.append(']');
		}
		sb.append('>');
	}
}
