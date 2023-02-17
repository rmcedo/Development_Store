package br.com.senior.mydomain.myservice;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.validation.constraints.NotNull;

import br.com.senior.messaging.model.EntityDescription;
import br.com.senior.messaging.model.EntityId;
import br.com.senior.custom.CustomDTO;

/**
 * Entidade Cliente
 */
@EntityDescription
public class Client extends CustomDTO {
    
    public static class Id {
    	
        public String id;
        
        public Id() {
        }
        
        public Id(String clientId) {
            this.id = clientId;
        }
        
        public String getClientId() {
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
    	
        public List<Client> contents;
        
        public PagedResults() {
        }
        
        public PagedResults(List<Client> contents) {
            this.contents = contents;
        }
        
        public PagedResults(List<Client> contents, Long totalPages, Long totalElements) {
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
     * ID gerado automaticamente
     */
    public String id;
    
    /**
     * Nome do Cliente
     */
    @NotNull(message = "name is required")
    public String name;
    
    /**
     * CPF do Cliente
     */
    @NotNull(message = "cpf is required")
    public String cpf;
    
    /**
     * Data de nascimento do Cliente
     */
    @NotNull(message = "birthday is required")
    public java.time.LocalDate birthday;
    
    /**
     * ACTIVE: verifica se o cliente está ativo ou não, para que haja apenas exclusão lógica do Cliente
     */
    public Boolean active = true;
    
    
	private List<JsonPatch> jsonPatches;
	
    public Client() {
    }
    
    /** 
     * This constructor allows initialization of all fields, required and optional.
     */
    public Client(String id, String name, String cpf, java.time.LocalDate birthday, Boolean active, List<JsonPatch> jsonPatches) {
        this.id = id;
        this.name = name;
        this.cpf = cpf;
        this.birthday = birthday;
        this.active = active != null ? active : true;
        this.jsonPatches = jsonPatches;
    }
    /** 
     * This convenience constructor allows initialization of all required fields.
     */
    public Client(String name, String cpf, java.time.LocalDate birthday) {
        this.name = name;
        this.cpf = cpf;
        this.birthday = birthday;
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
        if (!(obj instanceof Client)) {
            return false;
        }
        Client other = (Client) obj;
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
    	ClientStringSerializer.INSTANCE.serialize(this, sb, appended);
    }
    
	
    public List<JsonPatch> getJsonPatches(){
    	return jsonPatches == null ? java.util.Collections.emptyList() : jsonPatches;
    }
}
