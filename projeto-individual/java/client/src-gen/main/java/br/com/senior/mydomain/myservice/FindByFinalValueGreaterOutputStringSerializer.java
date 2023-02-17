package br.com.senior.mydomain.myservice;

import java.util.List;

public class FindByFinalValueGreaterOutputStringSerializer {
    
	public static final FindByFinalValueGreaterOutputStringSerializer INSTANCE = new FindByFinalValueGreaterOutputStringSerializer();
    
    public void serialize(FindByFinalValueGreaterOutput findByFinalValueGreaterOutput, StringBuilder sb, List<Object> appended) {
		sb.append(findByFinalValueGreaterOutput.getClass().getSimpleName()).append(" [");
		if (appended.contains(findByFinalValueGreaterOutput)) {
			sb.append("<Previously appended object>").append(']');
			return;
		}
		appended.add(findByFinalValueGreaterOutput);
		serializeResponse(findByFinalValueGreaterOutput, sb, appended);
		sb.append(", ");
		sb.append(']');
	}
	
	protected void serializeResponse(FindByFinalValueGreaterOutput findByFinalValueGreaterOutput, StringBuilder sb, List<Object> appended) {
		sb.append("response=<");
		if (findByFinalValueGreaterOutput.response == null) {
			sb.append("null");
		} else {
			sb.append('[');
			int last = findByFinalValueGreaterOutput.response.size() - 1;
			for (int i = 0; i <= last; i++) {
				findByFinalValueGreaterOutput.response.get(i).toString(sb, appended);
				if (i < last) {
					sb.append(", ");
				}
			}
			sb.append(']');
		}
		sb.append('>');
	}
}
