package br.com.senior.mydomain.myservice;

import java.util.List;

public class FindDateBetweenOutputStringSerializer {
    
	public static final FindDateBetweenOutputStringSerializer INSTANCE = new FindDateBetweenOutputStringSerializer();
    
    public void serialize(FindDateBetweenOutput findDateBetweenOutput, StringBuilder sb, List<Object> appended) {
		sb.append(findDateBetweenOutput.getClass().getSimpleName()).append(" [");
		if (appended.contains(findDateBetweenOutput)) {
			sb.append("<Previously appended object>").append(']');
			return;
		}
		appended.add(findDateBetweenOutput);
		serializeResponse(findDateBetweenOutput, sb, appended);
		sb.append(", ");
		sb.append(']');
	}
	
	protected void serializeResponse(FindDateBetweenOutput findDateBetweenOutput, StringBuilder sb, List<Object> appended) {
		sb.append("response=<");
		if (findDateBetweenOutput.response == null) {
			sb.append("null");
		} else {
			sb.append('[');
			int last = findDateBetweenOutput.response.size() - 1;
			for (int i = 0; i <= last; i++) {
				findDateBetweenOutput.response.get(i).toString(sb, appended);
				if (i < last) {
					sb.append(", ");
				}
			}
			sb.append(']');
		}
		sb.append('>');
	}
}
