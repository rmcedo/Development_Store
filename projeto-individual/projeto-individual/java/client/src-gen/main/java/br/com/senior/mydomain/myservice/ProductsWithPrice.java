package br.com.senior.mydomain.myservice;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.validation.constraints.NotNull;


/**
 * Record para retorno de Query
 */
public class ProductsWithPrice {
    
    @NotNull(message = "name is required")
    public String name;
    
    @NotNull(message = "stock is required")
    public Long stock;
    
    @NotNull(message = "price is required")
    public java.math.BigDecimal price;
    
    
    public ProductsWithPrice() {
    }
    
    /** 
     * This constructor allows initialization of all fields, required and optional.
     */
    public ProductsWithPrice(String name, Long stock, java.math.BigDecimal price) {
        this.name = name;
        this.stock = stock;
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
        if (name != null) {
            ret = 31 * ret + name.hashCode();
        }
        if (stock != null) {
            ret = 31 * ret + stock.hashCode();
        }
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
        if (!(obj instanceof ProductsWithPrice)) {
            return false;
        }
        ProductsWithPrice other = (ProductsWithPrice) obj;
        if ((name == null) != (other.name == null)) {
            return false;
        }
        if ((name != null) && !name.equals(other.name)) {
            return false;
        }
        if ((stock == null) != (other.stock == null)) {
            return false;
        }
        if ((stock != null) && !stock.equals(other.stock)) {
            return false;
        }
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
    	ProductsWithPriceStringSerializer.INSTANCE.serialize(this, sb, appended);
    }
    
}
