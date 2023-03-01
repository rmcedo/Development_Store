package br.com.senior.mydomain.myservice;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.validation.constraints.NotEmpty;
import javax.validation.Valid;


public class FindProductByNameOutput {
    
    /**
     * Lista de Produtos que obteremos como resposta
     */
    @NotEmpty(message = "response is required, at least one value must be present")
    @Valid
    public java.util.List<Product> response;
    
    
    public FindProductByNameOutput() {
    }
    
    /** 
     * This constructor allows initialization of all fields, required and optional.
     */
    public FindProductByNameOutput(java.util.List<Product> response) {
        this.response = response;
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
        if (response != null) {
            ret = 31 * ret + response.hashCode();
        }
        return ret;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FindProductByNameOutput)) {
            return false;
        }
        FindProductByNameOutput other = (FindProductByNameOutput) obj;
        if ((response == null) != (other.response == null)) {
            return false;
        }
        if ((response != null) && !response.equals(other.response)) {
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
    	FindProductByNameOutputStringSerializer.INSTANCE.serialize(this, sb, appended);
    }
    
}
