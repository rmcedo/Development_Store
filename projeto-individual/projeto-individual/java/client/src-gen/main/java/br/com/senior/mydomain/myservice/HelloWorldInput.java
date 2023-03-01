package br.com.senior.mydomain.myservice;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.validation.constraints.NotNull;


public class HelloWorldInput {
    
    @NotNull(message = "who is required")
    public String who;
    
    
    public HelloWorldInput() {
    }
    
    /** 
     * This constructor allows initialization of all fields, required and optional.
     */
    public HelloWorldInput(String who) {
        this.who = who;
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
        if (who != null) {
            ret = 31 * ret + who.hashCode();
        }
        return ret;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HelloWorldInput)) {
            return false;
        }
        HelloWorldInput other = (HelloWorldInput) obj;
        if ((who == null) != (other.who == null)) {
            return false;
        }
        if ((who != null) && !who.equals(other.who)) {
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
    	HelloWorldInputStringSerializer.INSTANCE.serialize(this, sb, appended);
    }
    
}
