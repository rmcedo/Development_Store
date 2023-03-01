package br.com.senior.mydomain.myservice;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.validation.constraints.NotNull;

import br.com.senior.messaging.model.EntityDescription;
import br.com.senior.messaging.model.EntityId;
import br.com.senior.custom.CustomDTO;

@EntityDescription
public class Item extends CustomDTO {
    
    public static class Id {
    	
        public String id;
        
        public Id() {
        }
        
        public Id(String itemId) {
            this.id = itemId;
        }
        
        public String getItemId() {
            return id;
        }
        
        public String getId() {
            return id;
        }
        
    	public void normalize(Map<String, Object> headers) {
    		MyServiceNormalizer.normalize(this, headers);
    	}
    	
    }
    
    public static class PagedResults {
    	public Long totalPages;
    	public Long totalElements;
    	
        public List<Item> contents;
        
        public PagedResults() {
        }
        
        public PagedResults(List<Item> contents) {
            this.contents = contents;
        }
        
        public PagedResults(List<Item> contents, Long totalPages, Long totalElements) {
            this.contents = contents;
            this.totalPages = totalPages;
            this.totalElements = totalElements;
        }
    }
    
    public static class PageRequest {
        public Long offset;
        public Long size;
        public boolean translations;
        public String orderBy;
        public String filter;
        public List<String> displayFields;
        
        public PageRequest() {
        }
        
        public PageRequest(Long offset, Long size) {
            this(offset, size, null, null);
        }
        
        public PageRequest(Long offset, Long size, String orderBy) {
            this(offset, size, orderBy, null);
        }
        
        public PageRequest(Long offset, Long size, String orderBy, String filter) {
            this(offset, size, orderBy, filter, null);
       	}
        
        public PageRequest(Long offset, Long size, String orderBy, String filter, List<String> displayFields) {
            this.offset = offset;
        	this.size = size;
        	this.orderBy = orderBy;
        	this.filter = filter;
        	this.displayFields = displayFields;
        }
    }
    			    
    public static class GetRequest {
        public String id;
        public List<String> displayFields;
        public boolean translations;
        
        public GetRequest() {
        }
        
        public GetRequest(String id) {
            this(id, null);
        }
        
        public GetRequest(String id, List<String> displayFields) {
            this.id = id;
            this.displayFields = displayFields;
        }
    }

    @EntityId
    /**
     * ID do Item, gerado automaticamente
     */
    public String id;
    
    /**
     * ID do Pedido do qual este item pertence
     */
    @ValidEntity(message = "pedido.id is required")
    public Pedido pedido;
    
    /**
     * ID do Produto do qual este item consiste
     */
    @NotNull(message = "product is required")
    @ValidEntity(message = "product.id is required")
    public Product product;
    
    /**
     * Quantidade de produtos dentro do Item
     */
    @NotNull(message = "quantity is required")
    public Long quantity;
    
    /**
     * Valor unitário do Item, referente ao preço do Produto
     */
    public java.math.BigDecimal unitaryValue;
    
    /**
     * Valor Total referente a quantidade de itens multiplicando com seu valor unitário
     */
    public java.math.BigDecimal totalValue;
    
    
	private List<JsonPatch> jsonPatches;
	
    public Item() {
    }
    
    /** 
     * This constructor allows initialization of all fields, required and optional.
     */
    public Item(String id, Pedido pedido, Product product, Long quantity, java.math.BigDecimal unitaryValue, java.math.BigDecimal totalValue, List<JsonPatch> jsonPatches) {
        this.id = id;
        this.pedido = pedido;
        this.product = product;
        this.quantity = quantity;
        this.unitaryValue = unitaryValue;
        this.totalValue = totalValue;
        this.jsonPatches = jsonPatches;
    }
    /** 
     * This convenience constructor allows initialization of all required fields.
     */
    public Item(Product product, Long quantity) {
        this.product = product;
        this.quantity = quantity;
    }
    
    public void normalize(Map<String, Object> headers) {
    	MyServiceNormalizer.normalize(this, headers);
    }
    
    public void validate() {
    	validate(true);
    }
    
    public void validate(boolean required) {
    	validate(null, true);
    }
    
    public void validate(Map<String, Object> headers, boolean required) {
    	validate(headers, required, new ArrayList<>());
    }
    
    void validate(Map<String, Object> headers, boolean required, List<Object> validated) {
    	MyServiceValidator.validate(this, headers, required, validated);
    }
    @Override
    public int hashCode() {
        int ret = 1;
        if (id != null) {
            ret = 31 * ret + id.hashCode();
        }
        return ret;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Item)) {
            return false;
        }
        Item other = (Item) obj;
        if (id == null || !id.equals(other.id)) {
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
    	ItemStringSerializer.INSTANCE.serialize(this, sb, appended);
    }
    
	
    public List<JsonPatch> getJsonPatches(){
    	return jsonPatches == null ? java.util.Collections.emptyList() : jsonPatches;
    }
}
