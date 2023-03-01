package br.com.senior.mydomain.myservice;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.validation.constraints.NotNull;


public class FindByActiveTrueInput {
    
    /**
     * Parametro que iremos passar no body de nossa requisição: true ou false)
     */
    @NotNull(message = "active is required")
    public Boolean active;
    
    
    public FindByActiveTrueInput() {
    }
    
    /** 
     * This constructor allows initialization of all fields, required and optional.
     */
    public FindByActiveTrueInput(Boolean active) {
        this.active = active;
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
        if (active != null) {
            ret = 31 * ret + active.hashCode();
        }
        return ret;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FindByActiveTrueInput)) {
            return false;
        }
        FindByActiveTrueInput other = (FindByActiveTrueInput) obj;
        if ((active == null) != (other.active == null)) {
            return false;
        }
        if ((active != null) && !active.equals(other.active)) {
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
    	FindByActiveTrueInputStringSerializer.INSTANCE.serialize(this, sb, appended);
    }
    
}
