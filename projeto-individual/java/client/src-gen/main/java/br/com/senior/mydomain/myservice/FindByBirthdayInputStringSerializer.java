package br.com.senior.mydomain.myservice;

import java.util.List;

public class FindByBirthdayInputStringSerializer {
    
	public static final FindByBirthdayInputStringSerializer INSTANCE = new FindByBirthdayInputStringSerializer();
    
    public void serialize(FindByBirthdayInput findByBirthdayInput, StringBuilder sb, List<Object> appended) {
		sb.append(findByBirthdayInput.getClass().getSimpleName()).append(" [");
		if (appended.contains(findByBirthdayInput)) {
			sb.append("<Previously appended object>").append(']');
			return;
		}
		appended.add(findByBirthdayInput);
		serializeBirthday(findByBirthdayInput, sb);
		sb.append(", ");
		sb.append(']');
	}
	
	protected void serializeBirthday(FindByBirthdayInput findByBirthdayInput, StringBuilder sb) {
		sb.append("birthday=").append(findByBirthdayInput.birthday == null ? "null" : findByBirthdayInput.birthday);
	}
}
