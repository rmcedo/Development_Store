package br.com.senior.mydomain.myservice;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.validation.constraints.NotNull;


public class FindDateBetweenInput {
    
    /**
     * Parametro de entrada que iremos passar no body de nossa requisição FORMATO: 'YYYY-MM-DD'
     */
    @NotNull(message = "date1 is required")
    public java.time.LocalDate date1;
    
    /**
     * Segundo parametro de entrada que iremos passar no body de nossa requisição FORMATO: 'YYYY-MM-DD'
     */
    @NotNull(message = "date2 is required")
    public java.time.LocalDate date2;
    
    
    public FindDateBetweenInput() {
    }
    
    /** 
     * This constructor allows initialization of all fields, required and optional.
     */
    public FindDateBetweenInput(java.time.LocalDate date1, java.time.LocalDate date2) {
        this.date1 = date1;
        this.date2 = date2;
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
        if (date1 != null) {
            ret = 31 * ret + date1.hashCode();
        }
        if (date2 != null) {
            ret = 31 * ret + date2.hashCode();
        }
        return ret;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FindDateBetweenInput)) {
            return false;
        }
        FindDateBetweenInput other = (FindDateBetweenInput) obj;
        if ((date1 == null) != (other.date1 == null)) {
            return false;
        }
        if ((date1 != null) && !date1.equals(other.date1)) {
            return false;
        }
        if ((date2 == null) != (other.date2 == null)) {
            return false;
        }
        if ((date2 != null) && !date2.equals(other.date2)) {
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
    	FindDateBetweenInputStringSerializer.INSTANCE.serialize(this, sb, appended);
    }
    
}
