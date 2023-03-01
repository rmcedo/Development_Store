package br.com.senior.mydomain.myservice;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.validation.constraints.NotNull;


public class FindPriceGreaterInput {
    
    /**
     * Parametro que iremos passar no body de nossa requisição
     */
    @NotNull(message = "value is required")
    public java.math.BigDecimal value;
    
    
    public FindPriceGreaterInput() {
    }
    
    /** 
     * This constructor allows initialization of all fields, required and optional.
     */
    public FindPriceGreaterInput(java.math.BigDecimal value) {
        this.value = value;
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
        if (value != null) {
            ret = 31 * ret + value.hashCode();
        }
        return ret;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FindPriceGreaterInput)) {
            return false;
        }
        FindPriceGreaterInput other = (FindPriceGreaterInput) obj;
        if ((value == null) != (other.value == null)) {
            return false;
        }
        if ((value != null) && !value.equals(other.value)) {
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
    	FindPriceGreaterInputStringSerializer.INSTANCE.serialize(this, sb, appended);
    }
    
}
