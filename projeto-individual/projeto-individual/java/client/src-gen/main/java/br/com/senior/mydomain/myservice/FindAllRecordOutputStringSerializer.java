package br.com.senior.mydomain.myservice;

import java.util.List;

public class FindAllRecordOutputStringSerializer {
    
	public static final FindAllRecordOutputStringSerializer INSTANCE = new FindAllRecordOutputStringSerializer();
    
    public void serialize(FindAllRecordOutput findAllRecordOutput, StringBuilder sb, List<Object> appended) {
		sb.append(findAllRecordOutput.getClass().getSimpleName()).append(" [");
		if (appended.contains(findAllRecordOutput)) {
			sb.append("<Previously appended object>").append(']');
			return;
		}
		appended.add(findAllRecordOutput);
		serializeResponse(findAllRecordOutput, sb, appended);
		sb.append(", ");
		sb.append(']');
	}
	
	protected void serializeResponse(FindAllRecordOutput findAllRecordOutput, StringBuilder sb, List<Object> appended) {
		sb.append("response=<");
		if (findAllRecordOutput.response == null) {
			sb.append("null");
		} else {
			sb.append('[');
			int last = findAllRecordOutput.response.size() - 1;
			for (int i = 0; i <= last; i++) {
				findAllRecordOutput.response.get(i).toString(sb, appended);
				if (i < last) {
					sb.append(", ");
				}
			}
			sb.append(']');
		}
		sb.append('>');
	}
}
