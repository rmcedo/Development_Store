package br.com.senior.mydomain.myservice;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.validation.constraints.NotNull;


public class FindByNameInput {
    
    /**
     * Parametro que iremos passar no body de nossa requisição
     */
    @NotNull(message = "name is required")
    public String name;
    
    
    public FindByNameInput() {
    }
    
    /** 
     * This constructor allows initialization of all fields, required and optional.
     */
    public FindByNameInput(String name) {
        this.name = name;
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
        if (name != null) {
            ret = 31 * ret + name.hashCode();
        }
        return ret;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FindByNameInput)) {
            return false;
        }
        FindByNameInput other = (FindByNameInput) obj;
        if ((name == null) != (other.name == null)) {
            return false;
        }
        if ((name != null) && !name.equals(other.name)) {
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
    	FindByNameInputStringSerializer.INSTANCE.serialize(this, sb, appended);
    }
    
}
