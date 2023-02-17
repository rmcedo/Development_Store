package br.com.senior.mydomain.myservice;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.validation.constraints.NotNull;


public class FindByBirthdayInput {
    
    /**
     * Parametro que iremos passar no body de nossa requisição (FORMATO: 'YYY-MM-DD')
     */
    @NotNull(message = "birthday is required")
    public java.time.LocalDate birthday;
    
    
    public FindByBirthdayInput() {
    }
    
    /** 
     * This constructor allows initialization of all fields, required and optional.
     */
    public FindByBirthdayInput(java.time.LocalDate birthday) {
        this.birthday = birthday;
    }
    
    public void validate() {
        validate(true);
    }
    
    public void validate(boolean required) {
        validate(null, required);
    }
    
    public void validate(Map<String, Object> headers, boolean required) {
    	validate(headers, required, new ArrayList<>());
    }
    
    public void validate(Map<String, Object> headers, boolean required, List<Object> validated) {
    	MyServiceValidator.validate(this, headers, required, validated);
    }
    @Override
    public int hashCode() {
        int ret = 1;
        if (birthday != null) {
            ret = 31 * ret + birthday.hashCode();
        }
        return ret;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FindByBirthdayInput)) {
            return false;
        }
        FindByBirthdayInput other = (FindByBirthdayInput) obj;
        if ((birthday == null) != (other.birthday == null)) {
            return false;
        }
        if ((birthday != null) && !birthday.equals(other.birthday)) {
            return false;
        }
        return true;
    }
    
    @Override
    public String toString() {
    	StringBuilder sb = new StringBuilder();
    	toString(sb, new ArrayList<>());
    	return sb.toString();
    }
    
    public void toString(StringBuilder sb, List<Object> appended) {
    	FindByBirthdayInputStringSerializer.INSTANCE.serialize(this, sb, appended);
    }
    
}
