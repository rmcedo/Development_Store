/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;

import java.util.concurrent.CompletableFuture;


/**
* 
*/
public interface MyServiceStub {

	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	HelloWorldOutput helloWorld(HelloWorldInput input, long timeout);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 * Chamada assíncrona
	 */
	void helloWorld(HelloWorldInput input);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<HelloWorldOutput> helloWorldRequest(HelloWorldInput input);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<HelloWorldOutput> helloWorldRequest(HelloWorldInput input, long timeout);
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	FindByNameOutput findByName(FindByNameInput input, long timeout);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 * Chamada assíncrona
	 */
	void findByName(FindByNameInput input);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<FindByNameOutput> findByNameRequest(FindByNameInput input);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<FindByNameOutput> findByNameRequest(FindByNameInput input, long timeout);
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	FindPriceGreaterOutput findPriceGreater(FindPriceGreaterInput input, long timeout);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 * Chamada assíncrona
	 */
	void findPriceGreater(FindPriceGreaterInput input);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<FindPriceGreaterOutput> findPriceGreaterRequest(FindPriceGreaterInput input);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<FindPriceGreaterOutput> findPriceGreaterRequest(FindPriceGreaterInput input, long timeout);
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * Default 'getMetadata' query. Every service must handle this command and return metadata in the format requested.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	GetMetadataOutput getMetadata(GetMetadataInput input, long timeout);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * Default 'getMetadata' query. Every service must handle this command and return metadata in the format requested.
	 * Chamada assíncrona
	 */
	void getMetadata(GetMetadataInput input);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * Default 'getMetadata' query. Every service must handle this command and return metadata in the format requested.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<GetMetadataOutput> getMetadataRequest(GetMetadataInput input);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * Default 'getMetadata' query. Every service must handle this command and return metadata in the format requested.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<GetMetadataOutput> getMetadataRequest(GetMetadataInput input, long timeout);
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	ImportClientOutput importClient(ImportClientInput input, long timeout);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 * Chamada assíncrona
	 */
	void importClient(ImportClientInput input);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<ImportClientOutput> importClientRequest(ImportClientInput input);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<ImportClientOutput> importClientRequest(ImportClientInput input, long timeout);
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	ExportClientOutput exportClient(ExportClientInput input, long timeout);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 * Chamada assíncrona
	 */
	void exportClient(ExportClientInput input);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<ExportClientOutput> exportClientRequest(ExportClientInput input);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<ExportClientOutput> exportClientRequest(ExportClientInput input, long timeout);
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	ImportProductOutput importProduct(ImportProductInput input, long timeout);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 * Chamada assíncrona
	 */
	void importProduct(ImportProductInput input);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<ImportProductOutput> importProductRequest(ImportProductInput input);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<ImportProductOutput> importProductRequest(ImportProductInput input, long timeout);
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	ExportProductOutput exportProduct(ExportProductInput input, long timeout);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 * Chamada assíncrona
	 */
	void exportProduct(ExportProductInput input);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<ExportProductOutput> exportProductRequest(ExportProductInput input);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<ExportProductOutput> exportProductRequest(ExportProductInput input, long timeout);
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	ImportPedidoOutput importPedido(ImportPedidoInput input, long timeout);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 * Chamada assíncrona
	 */
	void importPedido(ImportPedidoInput input);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<ImportPedidoOutput> importPedidoRequest(ImportPedidoInput input);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<ImportPedidoOutput> importPedidoRequest(ImportPedidoInput input, long timeout);
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	ExportPedidoOutput exportPedido(ExportPedidoInput input, long timeout);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 * Chamada assíncrona
	 */
	void exportPedido(ExportPedidoInput input);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<ExportPedidoOutput> exportPedidoRequest(ExportPedidoInput input);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<ExportPedidoOutput> exportPedidoRequest(ExportPedidoInput input, long timeout);
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * Returns a list with all dependencies from this service, along with their respective versions
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	GetDependenciesOutput getDependencies(long timeout);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * Returns a list with all dependencies from this service, along with their respective versions
	 * Chamada assíncrona
	 */
	void getDependencies();
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * Returns a list with all dependencies from this service, along with their respective versions
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<GetDependenciesOutput> getDependenciesRequest();
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * Returns a list with all dependencies from this service, along with their respective versions
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<GetDependenciesOutput> getDependenciesRequest(long timeout);
	/**
	 * This is a public operation
	 * The 'create' request primitive for the Client entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	Client createClient(Client input, long timeout);
	
	/**
	 * This is a public operation
	 * The 'create' request primitive for the Client entity.
	 * Chamada assíncrona
	 */
	void createClient(Client input);
	
	/**
	 * This is a public operation
	 * The 'create' request primitive for the Client entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Client> createClientRequest(Client input);
	
	/**
	 * This is a public operation
	 * The 'create' request primitive for the Client entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Client> createClientRequest(Client input, long timeout);
	/**
	 * This is a public operation
	 * The 'createBulk' request primitive for the Client entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	CreateBulkClientOutput createBulkClient(CreateBulkClientInput input, long timeout);
	
	/**
	 * This is a public operation
	 * The 'createBulk' request primitive for the Client entity.
	 * Chamada assíncrona
	 */
	void createBulkClient(CreateBulkClientInput input);
	
	/**
	 * This is a public operation
	 * The 'createBulk' request primitive for the Client entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<CreateBulkClientOutput> createBulkClientRequest(CreateBulkClientInput input);
	
	/**
	 * This is a public operation
	 * The 'createBulk' request primitive for the Client entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<CreateBulkClientOutput> createBulkClientRequest(CreateBulkClientInput input, long timeout);
	/**
	 * This is a public operation
	 * The 'createMerge' request primitive for the Client entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	Client createMergeClient(Client input, long timeout);
	
	/**
	 * This is a public operation
	 * The 'createMerge' request primitive for the Client entity.
	 * Chamada assíncrona
	 */
	void createMergeClient(Client input);
	
	/**
	 * This is a public operation
	 * The 'createMerge' request primitive for the Client entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Client> createMergeClientRequest(Client input);
	
	/**
	 * This is a public operation
	 * The 'createMerge' request primitive for the Client entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Client> createMergeClientRequest(Client input, long timeout);
	/**
	 * This is a public operation
	 * The 'retrieve' request primitive for the Client entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	Client retrieveClient(Client.GetRequest input, long timeout);
	
	/**
	 * This is a public operation
	 * The 'retrieve' request primitive for the Client entity.
	 * Chamada assíncrona
	 */
	void retrieveClient(Client.GetRequest input);
	
	/**
	 * This is a public operation
	 * The 'retrieve' request primitive for the Client entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Client> retrieveClientRequest(Client.GetRequest input);
	
	/**
	 * This is a public operation
	 * The 'retrieve' request primitive for the Client entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Client> retrieveClientRequest(Client.GetRequest input, long timeout);
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'list' request primitive for the Client entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	Client.PagedResults listClient(Client.PageRequest input, long timeout);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'list' request primitive for the Client entity.
	 * Chamada assíncrona
	 */
	void listClient(Client.PageRequest input);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'list' request primitive for the Client entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Client.PagedResults> listClientRequest(Client.PageRequest input);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'list' request primitive for the Client entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Client.PagedResults> listClientRequest(Client.PageRequest input, long timeout);
	/**
	 * This is a public operation
	 * The 'update' request primitive for the Client entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	Client updateClient(Client input, long timeout);
	
	/**
	 * This is a public operation
	 * The 'update' request primitive for the Client entity.
	 * Chamada assíncrona
	 */
	void updateClient(Client input);
	
	/**
	 * This is a public operation
	 * The 'update' request primitive for the Client entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Client> updateClientRequest(Client input);
	
	/**
	 * This is a public operation
	 * The 'update' request primitive for the Client entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Client> updateClientRequest(Client input, long timeout);
	/**
	 * This is a public operation
	 * The 'updateMerge' request primitive for the Client entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	Client updateMergeClient(Client input, long timeout);
	
	/**
	 * This is a public operation
	 * The 'updateMerge' request primitive for the Client entity.
	 * Chamada assíncrona
	 */
	void updateMergeClient(Client input);
	
	/**
	 * This is a public operation
	 * The 'updateMerge' request primitive for the Client entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Client> updateMergeClientRequest(Client input);
	
	/**
	 * This is a public operation
	 * The 'updateMerge' request primitive for the Client entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Client> updateMergeClientRequest(Client input, long timeout);
	/**
	 * This is a public operation
	 * The 'delete' request primitive for the Client entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	void deleteClient(Client.Id input, long timeout);
	
	/**
	 * This is a public operation
	 * The 'delete' request primitive for the Client entity.
	 * Chamada assíncrona
	 */
	void deleteClient(Client.Id input);
	
	
	/**
	 * This is a public operation
	 * The 'create' request primitive for the Product entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	Product createProduct(Product input, long timeout);
	
	/**
	 * This is a public operation
	 * The 'create' request primitive for the Product entity.
	 * Chamada assíncrona
	 */
	void createProduct(Product input);
	
	/**
	 * This is a public operation
	 * The 'create' request primitive for the Product entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Product> createProductRequest(Product input);
	
	/**
	 * This is a public operation
	 * The 'create' request primitive for the Product entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Product> createProductRequest(Product input, long timeout);
	/**
	 * This is a public operation
	 * The 'createBulk' request primitive for the Product entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	CreateBulkProductOutput createBulkProduct(CreateBulkProductInput input, long timeout);
	
	/**
	 * This is a public operation
	 * The 'createBulk' request primitive for the Product entity.
	 * Chamada assíncrona
	 */
	void createBulkProduct(CreateBulkProductInput input);
	
	/**
	 * This is a public operation
	 * The 'createBulk' request primitive for the Product entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<CreateBulkProductOutput> createBulkProductRequest(CreateBulkProductInput input);
	
	/**
	 * This is a public operation
	 * The 'createBulk' request primitive for the Product entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<CreateBulkProductOutput> createBulkProductRequest(CreateBulkProductInput input, long timeout);
	/**
	 * This is a public operation
	 * The 'createMerge' request primitive for the Product entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	Product createMergeProduct(Product input, long timeout);
	
	/**
	 * This is a public operation
	 * The 'createMerge' request primitive for the Product entity.
	 * Chamada assíncrona
	 */
	void createMergeProduct(Product input);
	
	/**
	 * This is a public operation
	 * The 'createMerge' request primitive for the Product entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Product> createMergeProductRequest(Product input);
	
	/**
	 * This is a public operation
	 * The 'createMerge' request primitive for the Product entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Product> createMergeProductRequest(Product input, long timeout);
	/**
	 * This is a public operation
	 * The 'retrieve' request primitive for the Product entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	Product retrieveProduct(Product.GetRequest input, long timeout);
	
	/**
	 * This is a public operation
	 * The 'retrieve' request primitive for the Product entity.
	 * Chamada assíncrona
	 */
	void retrieveProduct(Product.GetRequest input);
	
	/**
	 * This is a public operation
	 * The 'retrieve' request primitive for the Product entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Product> retrieveProductRequest(Product.GetRequest input);
	
	/**
	 * This is a public operation
	 * The 'retrieve' request primitive for the Product entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Product> retrieveProductRequest(Product.GetRequest input, long timeout);
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'list' request primitive for the Product entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	Product.PagedResults listProduct(Product.PageRequest input, long timeout);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'list' request primitive for the Product entity.
	 * Chamada assíncrona
	 */
	void listProduct(Product.PageRequest input);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'list' request primitive for the Product entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Product.PagedResults> listProductRequest(Product.PageRequest input);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'list' request primitive for the Product entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Product.PagedResults> listProductRequest(Product.PageRequest input, long timeout);
	/**
	 * This is a public operation
	 * The 'update' request primitive for the Product entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	Product updateProduct(Product input, long timeout);
	
	/**
	 * This is a public operation
	 * The 'update' request primitive for the Product entity.
	 * Chamada assíncrona
	 */
	void updateProduct(Product input);
	
	/**
	 * This is a public operation
	 * The 'update' request primitive for the Product entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Product> updateProductRequest(Product input);
	
	/**
	 * This is a public operation
	 * The 'update' request primitive for the Product entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Product> updateProductRequest(Product input, long timeout);
	/**
	 * This is a public operation
	 * The 'updateMerge' request primitive for the Product entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	Product updateMergeProduct(Product input, long timeout);
	
	/**
	 * This is a public operation
	 * The 'updateMerge' request primitive for the Product entity.
	 * Chamada assíncrona
	 */
	void updateMergeProduct(Product input);
	
	/**
	 * This is a public operation
	 * The 'updateMerge' request primitive for the Product entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Product> updateMergeProductRequest(Product input);
	
	/**
	 * This is a public operation
	 * The 'updateMerge' request primitive for the Product entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Product> updateMergeProductRequest(Product input, long timeout);
	/**
	 * This is a public operation
	 * The 'delete' request primitive for the Product entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	void deleteProduct(Product.Id input, long timeout);
	
	/**
	 * This is a public operation
	 * The 'delete' request primitive for the Product entity.
	 * Chamada assíncrona
	 */
	void deleteProduct(Product.Id input);
	
	
	/**
	 * This is a public operation
	 * The 'create' request primitive for the Pedido entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	Pedido createPedido(Pedido input, long timeout);
	
	/**
	 * This is a public operation
	 * The 'create' request primitive for the Pedido entity.
	 * Chamada assíncrona
	 */
	void createPedido(Pedido input);
	
	/**
	 * This is a public operation
	 * The 'create' request primitive for the Pedido entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Pedido> createPedidoRequest(Pedido input);
	
	/**
	 * This is a public operation
	 * The 'create' request primitive for the Pedido entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Pedido> createPedidoRequest(Pedido input, long timeout);
	/**
	 * This is a public operation
	 * The 'createBulk' request primitive for the Pedido entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	CreateBulkPedidoOutput createBulkPedido(CreateBulkPedidoInput input, long timeout);
	
	/**
	 * This is a public operation
	 * The 'createBulk' request primitive for the Pedido entity.
	 * Chamada assíncrona
	 */
	void createBulkPedido(CreateBulkPedidoInput input);
	
	/**
	 * This is a public operation
	 * The 'createBulk' request primitive for the Pedido entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<CreateBulkPedidoOutput> createBulkPedidoRequest(CreateBulkPedidoInput input);
	
	/**
	 * This is a public operation
	 * The 'createBulk' request primitive for the Pedido entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<CreateBulkPedidoOutput> createBulkPedidoRequest(CreateBulkPedidoInput input, long timeout);
	/**
	 * This is a public operation
	 * The 'createMerge' request primitive for the Pedido entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	Pedido createMergePedido(Pedido input, long timeout);
	
	/**
	 * This is a public operation
	 * The 'createMerge' request primitive for the Pedido entity.
	 * Chamada assíncrona
	 */
	void createMergePedido(Pedido input);
	
	/**
	 * This is a public operation
	 * The 'createMerge' request primitive for the Pedido entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Pedido> createMergePedidoRequest(Pedido input);
	
	/**
	 * This is a public operation
	 * The 'createMerge' request primitive for the Pedido entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Pedido> createMergePedidoRequest(Pedido input, long timeout);
	/**
	 * This is a public operation
	 * The 'retrieve' request primitive for the Pedido entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	Pedido retrievePedido(Pedido.GetRequest input, long timeout);
	
	/**
	 * This is a public operation
	 * The 'retrieve' request primitive for the Pedido entity.
	 * Chamada assíncrona
	 */
	void retrievePedido(Pedido.GetRequest input);
	
	/**
	 * This is a public operation
	 * The 'retrieve' request primitive for the Pedido entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Pedido> retrievePedidoRequest(Pedido.GetRequest input);
	
	/**
	 * This is a public operation
	 * The 'retrieve' request primitive for the Pedido entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Pedido> retrievePedidoRequest(Pedido.GetRequest input, long timeout);
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'list' request primitive for the Pedido entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	Pedido.PagedResults listPedido(Pedido.PageRequest input, long timeout);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'list' request primitive for the Pedido entity.
	 * Chamada assíncrona
	 */
	void listPedido(Pedido.PageRequest input);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'list' request primitive for the Pedido entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Pedido.PagedResults> listPedidoRequest(Pedido.PageRequest input);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'list' request primitive for the Pedido entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Pedido.PagedResults> listPedidoRequest(Pedido.PageRequest input, long timeout);
	/**
	 * This is a public operation
	 * The 'update' request primitive for the Pedido entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	Pedido updatePedido(Pedido input, long timeout);
	
	/**
	 * This is a public operation
	 * The 'update' request primitive for the Pedido entity.
	 * Chamada assíncrona
	 */
	void updatePedido(Pedido input);
	
	/**
	 * This is a public operation
	 * The 'update' request primitive for the Pedido entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Pedido> updatePedidoRequest(Pedido input);
	
	/**
	 * This is a public operation
	 * The 'update' request primitive for the Pedido entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Pedido> updatePedidoRequest(Pedido input, long timeout);
	/**
	 * This is a public operation
	 * The 'updateMerge' request primitive for the Pedido entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	Pedido updateMergePedido(Pedido input, long timeout);
	
	/**
	 * This is a public operation
	 * The 'updateMerge' request primitive for the Pedido entity.
	 * Chamada assíncrona
	 */
	void updateMergePedido(Pedido input);
	
	/**
	 * This is a public operation
	 * The 'updateMerge' request primitive for the Pedido entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Pedido> updateMergePedidoRequest(Pedido input);
	
	/**
	 * This is a public operation
	 * The 'updateMerge' request primitive for the Pedido entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Pedido> updateMergePedidoRequest(Pedido input, long timeout);
	/**
	 * This is a public operation
	 * The 'delete' request primitive for the Pedido entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	void deletePedido(Pedido.Id input, long timeout);
	
	/**
	 * This is a public operation
	 * The 'delete' request primitive for the Pedido entity.
	 * Chamada assíncrona
	 */
	void deletePedido(Pedido.Id input);
	
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'create' request primitive for the items attribute of pedido entity.\nThis primitive requires the header 'entity_parent_id' with id of parent pedido entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	Item createPedido_Items(Pedido.Id parentId, Item input, long timeout);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'create' request primitive for the items attribute of pedido entity.\nThis primitive requires the header 'entity_parent_id' with id of parent pedido entity.
	 * Chamada assíncrona
	 */
	void createPedido_Items(Pedido.Id parentId, Item input);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'create' request primitive for the items attribute of pedido entity.\nThis primitive requires the header 'entity_parent_id' with id of parent pedido entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Item> createPedido_ItemsRequest(Pedido.Id parentId, Item input);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'create' request primitive for the items attribute of pedido entity.\nThis primitive requires the header 'entity_parent_id' with id of parent pedido entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Item> createPedido_ItemsRequest(Pedido.Id parentId, Item input, long timeout);
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'createMerge' request primitive for the items attribute of pedido entity.\nThis primitive requires the header 'entity_parent_id' with id of parent pedido entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	Item createMergePedido_Items(Pedido.Id parentId, Item input, long timeout);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'createMerge' request primitive for the items attribute of pedido entity.\nThis primitive requires the header 'entity_parent_id' with id of parent pedido entity.
	 * Chamada assíncrona
	 */
	void createMergePedido_Items(Pedido.Id parentId, Item input);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'createMerge' request primitive for the items attribute of pedido entity.\nThis primitive requires the header 'entity_parent_id' with id of parent pedido entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Item> createMergePedido_ItemsRequest(Pedido.Id parentId, Item input);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'createMerge' request primitive for the items attribute of pedido entity.\nThis primitive requires the header 'entity_parent_id' with id of parent pedido entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Item> createMergePedido_ItemsRequest(Pedido.Id parentId, Item input, long timeout);
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'update' request primitive for the items attribute of pedido entity.\nThis primitive requires the header 'entity_parent_id' with id of parent pedido entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	Item updatePedido_Items(Pedido.Id parentId, Item input, long timeout);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'update' request primitive for the items attribute of pedido entity.\nThis primitive requires the header 'entity_parent_id' with id of parent pedido entity.
	 * Chamada assíncrona
	 */
	void updatePedido_Items(Pedido.Id parentId, Item input);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'update' request primitive for the items attribute of pedido entity.\nThis primitive requires the header 'entity_parent_id' with id of parent pedido entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Item> updatePedido_ItemsRequest(Pedido.Id parentId, Item input);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'update' request primitive for the items attribute of pedido entity.\nThis primitive requires the header 'entity_parent_id' with id of parent pedido entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Item> updatePedido_ItemsRequest(Pedido.Id parentId, Item input, long timeout);
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'updateMerge' request primitive for the items attribute of pedido entity.\nThis primitive requires the header 'entity_parent_id' with id of parent pedido entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	Item updateMergePedido_Items(Pedido.Id parentId, Item input, long timeout);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'updateMerge' request primitive for the items attribute of pedido entity.\nThis primitive requires the header 'entity_parent_id' with id of parent pedido entity.
	 * Chamada assíncrona
	 */
	void updateMergePedido_Items(Pedido.Id parentId, Item input);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'updateMerge' request primitive for the items attribute of pedido entity.\nThis primitive requires the header 'entity_parent_id' with id of parent pedido entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Item> updateMergePedido_ItemsRequest(Pedido.Id parentId, Item input);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'updateMerge' request primitive for the items attribute of pedido entity.\nThis primitive requires the header 'entity_parent_id' with id of parent pedido entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Item> updateMergePedido_ItemsRequest(Pedido.Id parentId, Item input, long timeout);
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'retrieve' request primitive for the items attribute of pedido entity.\nThis primitive requires the header 'entity_parent_id' with id of parent pedido entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	Item retrievePedido_Items(Pedido.Id parentId, Item.GetRequest input, long timeout);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'retrieve' request primitive for the items attribute of pedido entity.\nThis primitive requires the header 'entity_parent_id' with id of parent pedido entity.
	 * Chamada assíncrona
	 */
	void retrievePedido_Items(Pedido.Id parentId, Item.GetRequest input);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'retrieve' request primitive for the items attribute of pedido entity.\nThis primitive requires the header 'entity_parent_id' with id of parent pedido entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Item> retrievePedido_ItemsRequest(Pedido.Id parentId, Item.GetRequest input);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'retrieve' request primitive for the items attribute of pedido entity.\nThis primitive requires the header 'entity_parent_id' with id of parent pedido entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Item> retrievePedido_ItemsRequest(Pedido.Id parentId, Item.GetRequest input, long timeout);
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'delete' request primitive for the items attribute of pedido entity.\nThis primitive requires the header 'entity_parent_id' with id of parent pedido entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	void deletePedido_Items(Pedido.Id parentId, Item.Id input, long timeout);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'delete' request primitive for the items attribute of pedido entity.\nThis primitive requires the header 'entity_parent_id' with id of parent pedido entity.
	 * Chamada assíncrona
	 */
	void deletePedido_Items(Pedido.Id parentId, Item.Id input);
	
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'list' request primitive for the items attribute of pedido entity.\nThis primitive requires the header 'entity_parent_id' with id of parent pedido entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	Item.PagedResults listPedido_Items(Pedido.Id parentId, Item.PageRequest input, long timeout);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'list' request primitive for the items attribute of pedido entity.\nThis primitive requires the header 'entity_parent_id' with id of parent pedido entity.
	 * Chamada assíncrona
	 */
	void listPedido_Items(Pedido.Id parentId, Item.PageRequest input);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'list' request primitive for the items attribute of pedido entity.\nThis primitive requires the header 'entity_parent_id' with id of parent pedido entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Item.PagedResults> listPedido_ItemsRequest(Pedido.Id parentId, Item.PageRequest input);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'list' request primitive for the items attribute of pedido entity.\nThis primitive requires the header 'entity_parent_id' with id of parent pedido entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Item.PagedResults> listPedido_ItemsRequest(Pedido.Id parentId, Item.PageRequest input, long timeout);
	/**
	 * This is a public operation
	 * The 'create' request primitive for the Item entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	Item createItem(Item input, long timeout);
	
	/**
	 * This is a public operation
	 * The 'create' request primitive for the Item entity.
	 * Chamada assíncrona
	 */
	void createItem(Item input);
	
	/**
	 * This is a public operation
	 * The 'create' request primitive for the Item entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Item> createItemRequest(Item input);
	
	/**
	 * This is a public operation
	 * The 'create' request primitive for the Item entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Item> createItemRequest(Item input, long timeout);
	/**
	 * This is a public operation
	 * The 'createBulk' request primitive for the Item entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	CreateBulkItemOutput createBulkItem(CreateBulkItemInput input, long timeout);
	
	/**
	 * This is a public operation
	 * The 'createBulk' request primitive for the Item entity.
	 * Chamada assíncrona
	 */
	void createBulkItem(CreateBulkItemInput input);
	
	/**
	 * This is a public operation
	 * The 'createBulk' request primitive for the Item entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<CreateBulkItemOutput> createBulkItemRequest(CreateBulkItemInput input);
	
	/**
	 * This is a public operation
	 * The 'createBulk' request primitive for the Item entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<CreateBulkItemOutput> createBulkItemRequest(CreateBulkItemInput input, long timeout);
	/**
	 * This is a public operation
	 * The 'createMerge' request primitive for the Item entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	Item createMergeItem(Item input, long timeout);
	
	/**
	 * This is a public operation
	 * The 'createMerge' request primitive for the Item entity.
	 * Chamada assíncrona
	 */
	void createMergeItem(Item input);
	
	/**
	 * This is a public operation
	 * The 'createMerge' request primitive for the Item entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Item> createMergeItemRequest(Item input);
	
	/**
	 * This is a public operation
	 * The 'createMerge' request primitive for the Item entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Item> createMergeItemRequest(Item input, long timeout);
	/**
	 * This is a public operation
	 * The 'retrieve' request primitive for the Item entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	Item retrieveItem(Item.GetRequest input, long timeout);
	
	/**
	 * This is a public operation
	 * The 'retrieve' request primitive for the Item entity.
	 * Chamada assíncrona
	 */
	void retrieveItem(Item.GetRequest input);
	
	/**
	 * This is a public operation
	 * The 'retrieve' request primitive for the Item entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Item> retrieveItemRequest(Item.GetRequest input);
	
	/**
	 * This is a public operation
	 * The 'retrieve' request primitive for the Item entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Item> retrieveItemRequest(Item.GetRequest input, long timeout);
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'list' request primitive for the Item entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	Item.PagedResults listItem(Item.PageRequest input, long timeout);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'list' request primitive for the Item entity.
	 * Chamada assíncrona
	 */
	void listItem(Item.PageRequest input);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'list' request primitive for the Item entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Item.PagedResults> listItemRequest(Item.PageRequest input);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'list' request primitive for the Item entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Item.PagedResults> listItemRequest(Item.PageRequest input, long timeout);
	/**
	 * This is a public operation
	 * The 'update' request primitive for the Item entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	Item updateItem(Item input, long timeout);
	
	/**
	 * This is a public operation
	 * The 'update' request primitive for the Item entity.
	 * Chamada assíncrona
	 */
	void updateItem(Item input);
	
	/**
	 * This is a public operation
	 * The 'update' request primitive for the Item entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Item> updateItemRequest(Item input);
	
	/**
	 * This is a public operation
	 * The 'update' request primitive for the Item entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Item> updateItemRequest(Item input, long timeout);
	/**
	 * This is a public operation
	 * The 'updateMerge' request primitive for the Item entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	Item updateMergeItem(Item input, long timeout);
	
	/**
	 * This is a public operation
	 * The 'updateMerge' request primitive for the Item entity.
	 * Chamada assíncrona
	 */
	void updateMergeItem(Item input);
	
	/**
	 * This is a public operation
	 * The 'updateMerge' request primitive for the Item entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Item> updateMergeItemRequest(Item input);
	
	/**
	 * This is a public operation
	 * The 'updateMerge' request primitive for the Item entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Item> updateMergeItemRequest(Item input, long timeout);
	/**
	 * This is a public operation
	 * The 'delete' request primitive for the Item entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	void deleteItem(Item.Id input, long timeout);
	
	/**
	 * This is a public operation
	 * The 'delete' request primitive for the Item entity.
	 * Chamada assíncrona
	 */
	void deleteItem(Item.Id input);
	
	


	/**
	 * Chamada assíncrona para o método publishServiceStarted 
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 */
	void publishServiceStarted( ServiceStartedPayload input );
			
	
	/**
	 * Chamada assíncrona para o método publishNotifyUserEvent 
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 */
	void publishNotifyUserEvent( NotifyUserEventPayload input );
			
	
	/**
	 * Chamada assíncrona para o método publishImportClientEvent 
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 */
	void publishImportClientEvent( ImportClientEventPayload input );
			
	
	/**
	 * Chamada assíncrona para o método publishExportClientEvent 
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 */
	void publishExportClientEvent( ExportClientEventPayload input );
			
	
	/**
	 * Chamada assíncrona para o método publishImportProductEvent 
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 */
	void publishImportProductEvent( ImportProductEventPayload input );
			
	
	/**
	 * Chamada assíncrona para o método publishExportProductEvent 
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 */
	void publishExportProductEvent( ExportProductEventPayload input );
			
	
	/**
	 * Chamada assíncrona para o método publishImportPedidoEvent 
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 */
	void publishImportPedidoEvent( ImportPedidoEventPayload input );
			
	
	/**
	 * Chamada assíncrona para o método publishExportPedidoEvent 
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 */
	void publishExportPedidoEvent( ExportPedidoEventPayload input );
			
	
	/**
	 * Chamada assíncrona para o método publishImportItemEvent 
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 */
	void publishImportItemEvent( ImportItemEventPayload input );
			
	
	/**
	 * Chamada assíncrona para o método publishExportItemEvent 
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 */
	void publishExportItemEvent( ExportItemEventPayload input );
			
	

}
