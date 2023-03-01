package br.com.senior.mydomain.myservice;

import java.util.List;

public class FindByBirthdayOutputStringSerializer {
    
	public static final FindByBirthdayOutputStringSerializer INSTANCE = new FindByBirthdayOutputStringSerializer();
    
    public void serialize(FindByBirthdayOutput findByBirthdayOutput, StringBuilder sb, List<Object> appended) {
		sb.append(findByBirthdayOutput.getClass().getSimpleName()).append(" [");
		if (appended.contains(findByBirthdayOutput)) {
			sb.append("<Previously appended object>").append(']');
			return;
		}
		appended.add(findByBirthdayOutput);
		serializeResponse(findByBirthdayOutput, sb, appended);
		sb.append(", ");
		sb.append(']');
	}
	
	protected void serializeResponse(FindByBirthdayOutput findByBirthdayOutput, StringBuilder sb, List<Object> appended) {
		sb.append("response=<");
		if (findByBirthdayOutput.response == null) {
			sb.append("null");
		} else {
			sb.append('[');
			int last = findByBirthdayOutput.response.size() - 1;
			for (int i = 0; i <= last; i++) {
				findByBirthdayOutput.response.get(i).toString(sb, appended);
				if (i < last) {
					sb.append(", ");
				}
			}
			sb.append(']');
		}
		sb.append('>');
	}
}
