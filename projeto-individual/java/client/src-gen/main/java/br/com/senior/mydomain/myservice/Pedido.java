package br.com.senior.mydomain.myservice;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.validation.constraints.NotNull;
import javax.validation.Valid;

import br.com.senior.messaging.model.EntityDescription;
import br.com.senior.messaging.model.EntityId;
import br.com.senior.custom.CustomDTO;

/**
 * Entidade Pedido
 */
@EntityDescription
public class Pedido extends CustomDTO {
    
    public static class Id {
    	
        public String id;
        
        public Id() {
        }
        
        public Id(String pedidoId) {
            this.id = pedidoId;
        }
        
        public String getPedidoId() {
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
    	
        public List<Pedido> contents;
        
        public PagedResults() {
        }
        
        public PagedResults(List<Pedido> contents) {
            this.contents = contents;
        }
        
        public PagedResults(List<Pedido> contents, Long totalPages, Long totalElements) {
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
     * ID do Pedido, gerado automaticamente
     */
    public String id;
    
    /**
     * ID do Cliente que está realizando o Pedido
     */
    @NotNull(message = "client is required")
    @ValidEntity(message = "client.id is required")
    public Client client;
    
    /**
     * Lista de Itens de Produtos que contém no Pedido
     */
    @Valid
    public java.util.List<Item> items;
    
    /**
     * Data de realização do Pedido
     */
    @NotNull(message = "orderDate is required")
    public java.time.LocalDate orderDate;
    
    /**
     * Valor Final do Pedido, somando os valor totais dos itens do Pedido
     */
    public java.math.BigDecimal finalValue;
    
    
	private List<JsonPatch> jsonPatches;
	
    public Pedido() {
    }
    
    /** 
     * This constructor allows initialization of all fields, required and optional.
     */
    public Pedido(String id, Client client, java.util.List<Item> items, java.time.LocalDate orderDate, java.math.BigDecimal finalValue, List<JsonPatch> jsonPatches) {
        this.id = id;
        this.client = client;
        this.items = items;
        this.orderDate = orderDate;
        this.finalValue = finalValue;
        this.jsonPatches = jsonPatches;
    }
    /** 
     * This convenience constructor allows initialization of all required fields.
     */
    public Pedido(Client client, java.time.LocalDate orderDate) {
        this.client = client;
        this.orderDate = orderDate;
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
        if (!(obj instanceof Pedido)) {
            return false;
        }
        Pedido other = (Pedido) obj;
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
    	PedidoStringSerializer.INSTANCE.serialize(this, sb, appended);
    }
    
	
    public List<JsonPatch> getJsonPatches(){
    	return jsonPatches == null ? java.util.Collections.emptyList() : jsonPatches;
    }
}
