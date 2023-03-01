package br.com.senior.mydomain.myservice;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.validation.constraints.NotNull;


public class FindProductPriceLessInput {
    
    /**
     * Parametro de entrada que iremos passar no body de nossa requisição
     */
    @NotNull(message = "price is required")
    public java.math.BigDecimal price;
    
    
    public FindProductPriceLessInput() {
    }
    
    /** 
     * This constructor allows initialization of all fields, required and optional.
     */
    public FindProductPriceLessInput(java.math.BigDecimal price) {
        this.price = price;
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
        if (price != null) {
            ret = 31 * ret + price.hashCode();
        }
        return ret;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FindProductPriceLessInput)) {
            return false;
        }
        FindProductPriceLessInput other = (FindProductPriceLessInput) obj;
        if ((price == null) != (other.price == null)) {
            return false;
        }
        if ((price != null) && !price.equals(other.price)) {
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
    	FindProductPriceLessInputStringSerializer.INSTANCE.serialize(this, sb, appended);
    }
    
}
