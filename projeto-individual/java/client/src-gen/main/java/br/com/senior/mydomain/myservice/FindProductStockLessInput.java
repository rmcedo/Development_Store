package br.com.senior.mydomain.myservice;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.validation.constraints.NotNull;


public class FindProductStockLessInput {
    
    /**
     * Parametro de entrada qque iremos passar no body de nossa requisição
     */
    @NotNull(message = "stock is required")
    public Long stock;
    
    
    public FindProductStockLessInput() {
    }
    
    /** 
     * This constructor allows initialization of all fields, required and optional.
     */
    public FindProductStockLessInput(Long stock) {
        this.stock = stock;
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
        if (stock != null) {
            ret = 31 * ret + stock.hashCode();
        }
        return ret;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FindProductStockLessInput)) {
            return false;
        }
        FindProductStockLessInput other = (FindProductStockLessInput) obj;
        if ((stock == null) != (other.stock == null)) {
            return false;
        }
        if ((stock != null) && !stock.equals(other.stock)) {
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
    	FindProductStockLessInputStringSerializer.INSTANCE.serialize(this, sb, appended);
    }
    
}
