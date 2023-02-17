package br.com.senior.mydomain.myservice;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.validation.constraints.NotNull;


public class FindByFinalValueGreaterInput {
    
    @NotNull(message = "finalValue is required")
    public java.math.BigDecimal finalValue;
    
    
    public FindByFinalValueGreaterInput() {
    }
    
    /** 
     * This constructor allows initialization of all fields, required and optional.
     */
    public FindByFinalValueGreaterInput(java.math.BigDecimal finalValue) {
        this.finalValue = finalValue;
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
        if (finalValue != null) {
            ret = 31 * ret + finalValue.hashCode();
        }
        return ret;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FindByFinalValueGreaterInput)) {
            return false;
        }
        FindByFinalValueGreaterInput other = (FindByFinalValueGreaterInput) obj;
        if ((finalValue == null) != (other.finalValue == null)) {
            return false;
        }
        if ((finalValue != null) && !finalValue.equals(other.finalValue)) {
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
    	FindByFinalValueGreaterInputStringSerializer.INSTANCE.serialize(this, sb, appended);
    }
    
}
