package br.com.senior.mydomain.myservice;

import java.util.List;

public class FindDateBetweenInputStringSerializer {
    
	public static final FindDateBetweenInputStringSerializer INSTANCE = new FindDateBetweenInputStringSerializer();
    
    public void serialize(FindDateBetweenInput findDateBetweenInput, StringBuilder sb, List<Object> appended) {
		sb.append(findDateBetweenInput.getClass().getSimpleName()).append(" [");
		if (appended.contains(findDateBetweenInput)) {
			sb.append("<Previously appended object>").append(']');
			return;
		}
		appended.add(findDateBetweenInput);
		serializeDate1(findDateBetweenInput, sb);
		sb.append(", ");
		serializeDate2(findDateBetweenInput, sb);
		sb.append(", ");
		sb.append(']');
	}
	
	protected void serializeDate1(FindDateBetweenInput findDateBetweenInput, StringBuilder sb) {
		sb.append("date1=").append(findDateBetweenInput.date1 == null ? "null" : findDateBetweenInput.date1);
	}
	
	protected void serializeDate2(FindDateBetweenInput findDateBetweenInput, StringBuilder sb) {
		sb.append("date2=").append(findDateBetweenInput.date2 == null ? "null" : findDateBetweenInput.date2);
	}
}
