package br.com.senior.mydomain.myservice;

import java.util.List;

public class FindByCategoriaDSLOutputStringSerializer {
    
	public static final FindByCategoriaDSLOutputStringSerializer INSTANCE = new FindByCategoriaDSLOutputStringSerializer();
    
    public void serialize(FindByCategoriaDSLOutput findByCategoriaDSLOutput, StringBuilder sb, List<Object> appended) {
		sb.append(findByCategoriaDSLOutput.getClass().getSimpleName()).append(" [");
		if (appended.contains(findByCategoriaDSLOutput)) {
			sb.append("<Previously appended object>").append(']');
			return;
		}
		appended.add(findByCategoriaDSLOutput);
		serializeResponse(findByCategoriaDSLOutput, sb, appended);
		sb.append(", ");
		sb.append(']');
	}
	
	protected void serializeResponse(FindByCategoriaDSLOutput findByCategoriaDSLOutput, StringBuilder sb, List<Object> appended) {
		sb.append("response=<");
		if (findByCategoriaDSLOutput.response == null) {
			sb.append("null");
		} else {
			sb.append('[');
			int last = findByCategoriaDSLOutput.response.size() - 1;
			for (int i = 0; i <= last; i++) {
				findByCategoriaDSLOutput.response.get(i).toString(sb, appended);
				if (i < last) {
					sb.append(", ");
				}
			}
			sb.append(']');
		}
		sb.append('>');
	}
}
