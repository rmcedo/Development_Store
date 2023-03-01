package br.com.senior.mydomain.myservice;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.validation.constraints.NotNull;


public class FindByCategoriaDSLInput {
    
    /**
     * Categoria passada, via ENUM
     */
    @NotNull(message = "categoria is required")
    public Categoria categoria;
    
    
    public FindByCategoriaDSLInput() {
    }
    
    /** 
     * This constructor allows initialization of all fields, required and optional.
     */
    public FindByCategoriaDSLInput(Categoria categoria) {
        this.categoria = categoria;
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
        if (categoria != null) {
            ret = 31 * ret + categoria.hashCode();
        }
        return ret;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FindByCategoriaDSLInput)) {
            return false;
        }
        FindByCategoriaDSLInput other = (FindByCategoriaDSLInput) obj;
        if ((categoria == null) != (other.categoria == null)) {
            return false;
        }
        if ((categoria != null) && !categoria.equals(other.categoria)) {
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
    	FindByCategoriaDSLInputStringSerializer.INSTANCE.serialize(this, sb, appended);
    }
    
}
