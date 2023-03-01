/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;

public interface MyServiceConstants {
    String DOMAIN = "my_domain";
    String SERVICE = "my_service";
    
    interface Commands {
    	/**
    	 * @see HelloWorldInput the request payload
    	 */
    	String HELLO_WORLD = "helloWorld";
    	/**
    	 * The success response primitive for helloWorld.
    	 *
    	 * @see #HELLO_WORLD the request primitive
    	 * @see HelloWorldOutput the response payload
    	 */
    	String HELLO_WORLD_RESPONSE = "helloWorldResponse";
    	/**
    	 * An error response primitive for helloWorld.
    	 *
    	 * @see #HELLO_WORLD the request primitive
    	 */
    	String HELLO_WORLD_ERROR = "helloWorldError";
    	/**
    	 * Query destinada para retornar Lista de Clientes com nome contendo parte do parametro name, passado na nossa requisição
    	 * @see FindByNameInput the request payload
    	 */
    	String FIND_BY_NAME = "findByName";
    	/**
    	 * The success response primitive for findByName.
    	 *
    	 * @see #FIND_BY_NAME the request primitive
    	 * @see FindByNameOutput the response payload
    	 */
    	String FIND_BY_NAME_RESPONSE = "findByNameResponse";
    	/**
    	 * An error response primitive for findByName.
    	 *
    	 * @see #FIND_BY_NAME the request primitive
    	 */
    	String FIND_BY_NAME_ERROR = "findByNameError";
    	/**
    	 * Query destinada para retornar Cliente com CPF igual ao passado como parametro
    	 * @see FindByCpfInput the request payload
    	 */
    	String FIND_BY_CPF = "findByCpf";
    	/**
    	 * The success response primitive for findByCpf.
    	 *
    	 * @see #FIND_BY_CPF the request primitive
    	 * @see FindByCpfOutput the response payload
    	 */
    	String FIND_BY_CPF_RESPONSE = "findByCpfResponse";
    	/**
    	 * An error response primitive for findByCpf.
    	 *
    	 * @see #FIND_BY_CPF the request primitive
    	 */
    	String FIND_BY_CPF_ERROR = "findByCpfError";
    	/**
    	 * Query destinada para encontrar Clientes com nascimento no mesmo dia
    	 * @see FindByBirthdayInput the request payload
    	 */
    	String FIND_BY_BIRTHDAY = "findByBirthday";
    	/**
    	 * The success response primitive for findByBirthday.
    	 *
    	 * @see #FIND_BY_BIRTHDAY the request primitive
    	 * @see FindByBirthdayOutput the response payload
    	 */
    	String FIND_BY_BIRTHDAY_RESPONSE = "findByBirthdayResponse";
    	/**
    	 * An error response primitive for findByBirthday.
    	 *
    	 * @see #FIND_BY_BIRTHDAY the request primitive
    	 */
    	String FIND_BY_BIRTHDAY_ERROR = "findByBirthdayError";
    	/**
    	 * Query destinada para encontrar Clientes que estão ativos ou não dentro do sistema
    	 * @see FindByActiveTrueInput the request payload
    	 */
    	String FIND_BY_ACTIVE_TRUE = "findByActiveTrue";
    	/**
    	 * The success response primitive for findByActiveTrue.
    	 *
    	 * @see #FIND_BY_ACTIVE_TRUE the request primitive
    	 * @see FindByActiveTrueOutput the response payload
    	 */
    	String FIND_BY_ACTIVE_TRUE_RESPONSE = "findByActiveTrueResponse";
    	/**
    	 * An error response primitive for findByActiveTrue.
    	 *
    	 * @see #FIND_BY_ACTIVE_TRUE the request primitive
    	 */
    	String FIND_BY_ACTIVE_TRUE_ERROR = "findByActiveTrueError";
    	/**
    	 * Query destinada para retornar Lista de Produtos com preço com maior valor do que o passado no parametro value
    	 * @see FindPriceGreaterInput the request payload
    	 */
    	String FIND_PRICE_GREATER = "findPriceGreater";
    	/**
    	 * The success response primitive for findPriceGreater.
    	 *
    	 * @see #FIND_PRICE_GREATER the request primitive
    	 * @see FindPriceGreaterOutput the response payload
    	 */
    	String FIND_PRICE_GREATER_RESPONSE = "findPriceGreaterResponse";
    	/**
    	 * An error response primitive for findPriceGreater.
    	 *
    	 * @see #FIND_PRICE_GREATER the request primitive
    	 */
    	String FIND_PRICE_GREATER_ERROR = "findPriceGreaterError";
    	/**
    	 * Query destinada para retornar Lista de Produtos com nome igual ou semelhante ao valor passado no parametro nome
    	 * @see FindProductByNameInput the request payload
    	 */
    	String FIND_PRODUCT_BY_NAME = "findProductByName";
    	/**
    	 * The success response primitive for findProductByName.
    	 *
    	 * @see #FIND_PRODUCT_BY_NAME the request primitive
    	 * @see FindProductByNameOutput the response payload
    	 */
    	String FIND_PRODUCT_BY_NAME_RESPONSE = "findProductByNameResponse";
    	/**
    	 * An error response primitive for findProductByName.
    	 *
    	 * @see #FIND_PRODUCT_BY_NAME the request primitive
    	 */
    	String FIND_PRODUCT_BY_NAME_ERROR = "findProductByNameError";
    	/**
    	 * Query destinada para retornar Lista de Produtos com preço menor que o valor passado no parametro price
    	 * @see FindProductPriceLessInput the request payload
    	 */
    	String FIND_PRODUCT_PRICE_LESS = "findProductPriceLess";
    	/**
    	 * The success response primitive for findProductPriceLess.
    	 *
    	 * @see #FIND_PRODUCT_PRICE_LESS the request primitive
    	 * @see FindProductPriceLessOutput the response payload
    	 */
    	String FIND_PRODUCT_PRICE_LESS_RESPONSE = "findProductPriceLessResponse";
    	/**
    	 * An error response primitive for findProductPriceLess.
    	 *
    	 * @see #FIND_PRODUCT_PRICE_LESS the request primitive
    	 */
    	String FIND_PRODUCT_PRICE_LESS_ERROR = "findProductPriceLessError";
    	/**
    	 * Query destinada para retornar Lista de Produtos com estoque menor que o valor passado no parametro stock
    	 * @see FindProductStockLessInput the request payload
    	 */
    	String FIND_PRODUCT_STOCK_LESS = "findProductStockLess";
    	/**
    	 * The success response primitive for findProductStockLess.
    	 *
    	 * @see #FIND_PRODUCT_STOCK_LESS the request primitive
    	 * @see FindProductStockLessOutput the response payload
    	 */
    	String FIND_PRODUCT_STOCK_LESS_RESPONSE = "findProductStockLessResponse";
    	/**
    	 * An error response primitive for findProductStockLess.
    	 *
    	 * @see #FIND_PRODUCT_STOCK_LESS the request primitive
    	 */
    	String FIND_PRODUCT_STOCK_LESS_ERROR = "findProductStockLessError";
    	/**
    	 * Query destinada para retornar Lista de Produtos com estoque maior que o valor passado no parametro stock
    	 * @see FindProductStockGreaterInput the request payload
    	 */
    	String FIND_PRODUCT_STOCK_GREATER = "findProductStockGreater";
    	/**
    	 * The success response primitive for findProductStockGreater.
    	 *
    	 * @see #FIND_PRODUCT_STOCK_GREATER the request primitive
    	 * @see FindProductStockGreaterOutput the response payload
    	 */
    	String FIND_PRODUCT_STOCK_GREATER_RESPONSE = "findProductStockGreaterResponse";
    	/**
    	 * An error response primitive for findProductStockGreater.
    	 *
    	 * @see #FIND_PRODUCT_STOCK_GREATER the request primitive
    	 */
    	String FIND_PRODUCT_STOCK_GREATER_ERROR = "findProductStockGreaterError";
    	/**
    	 * Query destinada para retornar lista de produtos contendo preços, VIA RECORD
    	 */
    	String FIND_ALL_RECORD = "findAllRecord";
    	/**
    	 * The success response primitive for findAllRecord.
    	 *
    	 * @see #FIND_ALL_RECORD the request primitive
    	 * @see FindAllRecordOutput the response payload
    	 */
    	String FIND_ALL_RECORD_RESPONSE = "findAllRecordResponse";
    	/**
    	 * An error response primitive for findAllRecord.
    	 *
    	 * @see #FIND_ALL_RECORD the request primitive
    	 */
    	String FIND_ALL_RECORD_ERROR = "findAllRecordError";
    	/**
    	 * Query destinada para retornar lista de produtos dentro da categoria passada
    	 * @see FindByCategoriaDSLInput the request payload
    	 */
    	String FIND_BY_CATEGORIA_DSL = "findByCategoriaDSL";
    	/**
    	 * The success response primitive for findByCategoriaDSL.
    	 *
    	 * @see #FIND_BY_CATEGORIA_DSL the request primitive
    	 * @see FindByCategoriaDSLOutput the response payload
    	 */
    	String FIND_BY_CATEGORIA_DSL_RESPONSE = "findByCategoriaDSLResponse";
    	/**
    	 * An error response primitive for findByCategoriaDSL.
    	 *
    	 * @see #FIND_BY_CATEGORIA_DSL the request primitive
    	 */
    	String FIND_BY_CATEGORIA_DSL_ERROR = "findByCategoriaDSLError";
    	/**
    	 * Query destinada para retornar Lista de Pedidos com data de criação entre as duas datas passadas nos parametros date1 e date2
    	 * @see FindDateBetweenInput the request payload
    	 */
    	String FIND_DATE_BETWEEN = "findDateBetween";
    	/**
    	 * The success response primitive for findDateBetween.
    	 *
    	 * @see #FIND_DATE_BETWEEN the request primitive
    	 * @see FindDateBetweenOutput the response payload
    	 */
    	String FIND_DATE_BETWEEN_RESPONSE = "findDateBetweenResponse";
    	/**
    	 * An error response primitive for findDateBetween.
    	 *
    	 * @see #FIND_DATE_BETWEEN the request primitive
    	 */
    	String FIND_DATE_BETWEEN_ERROR = "findDateBetweenError";
    	/**
    	 * Query destinada para retornar Lista de Pedidos com valores finais com maior valor do que o parametro passado
    	 * @see FindByFinalValueGreaterInput the request payload
    	 */
    	String FIND_BY_FINAL_VALUE_GREATER = "findByFinalValueGreater";
    	/**
    	 * The success response primitive for findByFinalValueGreater.
    	 *
    	 * @see #FIND_BY_FINAL_VALUE_GREATER the request primitive
    	 * @see FindByFinalValueGreaterOutput the response payload
    	 */
    	String FIND_BY_FINAL_VALUE_GREATER_RESPONSE = "findByFinalValueGreaterResponse";
    	/**
    	 * An error response primitive for findByFinalValueGreater.
    	 *
    	 * @see #FIND_BY_FINAL_VALUE_GREATER the request primitive
    	 */
    	String FIND_BY_FINAL_VALUE_GREATER_ERROR = "findByFinalValueGreaterError";
    	/**
    	 * Default 'getMetadata' query. Every service must handle this command and return metadata in the format requested.
    	 * @see GetMetadataInput the request payload
    	 */
    	String GET_METADATA = "getMetadata";
    	/**
    	 * The success response primitive for getMetadata.
    	 *
    	 * @see #GET_METADATA the request primitive
    	 * @see GetMetadataOutput the response payload
    	 */
    	String GET_METADATA_RESPONSE = "getMetadataResponse";
    	/**
    	 * An error response primitive for getMetadata.
    	 *
    	 * @see #GET_METADATA the request primitive
    	 */
    	String GET_METADATA_ERROR = "getMetadataError";
    	String ODATA = "odata";
    	/**
    	 * The success response primitive for odata.
    	 *
    	 * @see #ODATA the request primitive
    	 */
    	String ODATA_RESPONSE = "odataResponse";
    	/**
    	 * An error response primitive for odata.
    	 *
    	 * @see #ODATA the request primitive
    	 */
    	String ODATA_ERROR = "odataError";
    	/**
    	 * @see ImportClientInput the request payload
    	 */
    	String IMPORT_CLIENT = "importClient";
    	/**
    	 * The success response primitive for importClient.
    	 *
    	 * @see #IMPORT_CLIENT the request primitive
    	 * @see ImportClientOutput the response payload
    	 */
    	String IMPORT_CLIENT_RESPONSE = "importClientResponse";
    	/**
    	 * An error response primitive for importClient.
    	 *
    	 * @see #IMPORT_CLIENT the request primitive
    	 */
    	String IMPORT_CLIENT_ERROR = "importClientError";
    	/**
    	 * @see ExportClientInput the request payload
    	 */
    	String EXPORT_CLIENT = "exportClient";
    	/**
    	 * The success response primitive for exportClient.
    	 *
    	 * @see #EXPORT_CLIENT the request primitive
    	 * @see ExportClientOutput the response payload
    	 */
    	String EXPORT_CLIENT_RESPONSE = "exportClientResponse";
    	/**
    	 * An error response primitive for exportClient.
    	 *
    	 * @see #EXPORT_CLIENT the request primitive
    	 */
    	String EXPORT_CLIENT_ERROR = "exportClientError";
    	/**
    	 * @see ImportProductInput the request payload
    	 */
    	String IMPORT_PRODUCT = "importProduct";
    	/**
    	 * The success response primitive for importProduct.
    	 *
    	 * @see #IMPORT_PRODUCT the request primitive
    	 * @see ImportProductOutput the response payload
    	 */
    	String IMPORT_PRODUCT_RESPONSE = "importProductResponse";
    	/**
    	 * An error response primitive for importProduct.
    	 *
    	 * @see #IMPORT_PRODUCT the request primitive
    	 */
    	String IMPORT_PRODUCT_ERROR = "importProductError";
    	/**
    	 * @see ExportProductInput the request payload
    	 */
    	String EXPORT_PRODUCT = "exportProduct";
    	/**
    	 * The success response primitive for exportProduct.
    	 *
    	 * @see #EXPORT_PRODUCT the request primitive
    	 * @see ExportProductOutput the response payload
    	 */
    	String EXPORT_PRODUCT_RESPONSE = "exportProductResponse";
    	/**
    	 * An error response primitive for exportProduct.
    	 *
    	 * @see #EXPORT_PRODUCT the request primitive
    	 */
    	String EXPORT_PRODUCT_ERROR = "exportProductError";
    	/**
    	 * @see ImportPedidoInput the request payload
    	 */
    	String IMPORT_PEDIDO = "importPedido";
    	/**
    	 * The success response primitive for importPedido.
    	 *
    	 * @see #IMPORT_PEDIDO the request primitive
    	 * @see ImportPedidoOutput the response payload
    	 */
    	String IMPORT_PEDIDO_RESPONSE = "importPedidoResponse";
    	/**
    	 * An error response primitive for importPedido.
    	 *
    	 * @see #IMPORT_PEDIDO the request primitive
    	 */
    	String IMPORT_PEDIDO_ERROR = "importPedidoError";
    	/**
    	 * @see ExportPedidoInput the request payload
    	 */
    	String EXPORT_PEDIDO = "exportPedido";
    	/**
    	 * The success response primitive for exportPedido.
    	 *
    	 * @see #EXPORT_PEDIDO the request primitive
    	 * @see ExportPedidoOutput the response payload
    	 */
    	String EXPORT_PEDIDO_RESPONSE = "exportPedidoResponse";
    	/**
    	 * An error response primitive for exportPedido.
    	 *
    	 * @see #EXPORT_PEDIDO the request primitive
    	 */
    	String EXPORT_PEDIDO_ERROR = "exportPedidoError";
    	/**
    	 * Returns a list with all dependencies from this service, along with their respective versions
    	 */
    	String GET_DEPENDENCIES = "getDependencies";
    	/**
    	 * The success response primitive for getDependencies.
    	 *
    	 * @see #GET_DEPENDENCIES the request primitive
    	 * @see GetDependenciesOutput the response payload
    	 */
    	String GET_DEPENDENCIES_RESPONSE = "getDependenciesResponse";
    	/**
    	 * An error response primitive for getDependencies.
    	 *
    	 * @see #GET_DEPENDENCIES the request primitive
    	 */
    	String GET_DEPENDENCIES_ERROR = "getDependenciesError";
    	/**
    	 * The 'create' request primitive for the Client entity.
    	 * @see Client the request payload
    	 */
    	String CREATE_CLIENT = "createClient";
    	/**
    	 * The success response primitive for createClient.
    	 *
    	 * @see #CREATE_CLIENT the request primitive
    	 */
    	String CREATE_CLIENT_RESPONSE = "createClientResponse";
    	/**
    	 * An error response primitive for createClient.
    	 *
    	 * @see #CREATE_CLIENT the request primitive
    	 */
    	String CREATE_CLIENT_ERROR = "createClientError";
    	/**
    	 * The 'createBulk' request primitive for the Client entity.
    	 * @see CreateBulkClientInput the request payload
    	 */
    	String CREATE_BULK_CLIENT = "createBulkClient";
    	/**
    	 * The success response primitive for createBulkClient.
    	 *
    	 * @see #CREATE_BULK_CLIENT the request primitive
    	 * @see CreateBulkClientOutput the response payload
    	 */
    	String CREATE_BULK_CLIENT_RESPONSE = "createBulkClientResponse";
    	/**
    	 * An error response primitive for createBulkClient.
    	 *
    	 * @see #CREATE_BULK_CLIENT the request primitive
    	 */
    	String CREATE_BULK_CLIENT_ERROR = "createBulkClientError";
    	/**
    	 * The 'createMerge' request primitive for the Client entity.
    	 * @see Client the request payload
    	 */
    	String CREATE_MERGE_CLIENT = "createMergeClient";
    	/**
    	 * The success response primitive for createMergeClient.
    	 *
    	 * @see #CREATE_MERGE_CLIENT the request primitive
    	 */
    	String CREATE_MERGE_CLIENT_RESPONSE = "createMergeClientResponse";
    	/**
    	 * An error response primitive for createMergeClient.
    	 *
    	 * @see #CREATE_MERGE_CLIENT the request primitive
    	 */
    	String CREATE_MERGE_CLIENT_ERROR = "createMergeClientError";
    	/**
    	 * The 'retrieve' request primitive for the Client entity.
    	 * @see Client.GetRequest the request payload
    	 */
    	String RETRIEVE_CLIENT = "retrieveClient";
    	/**
    	 * The success response primitive for retrieveClient.
    	 *
    	 * @see #RETRIEVE_CLIENT the request primitive
    	 */
    	String RETRIEVE_CLIENT_RESPONSE = "retrieveClientResponse";
    	/**
    	 * An error response primitive for retrieveClient.
    	 *
    	 * @see #RETRIEVE_CLIENT the request primitive
    	 */
    	String RETRIEVE_CLIENT_ERROR = "retrieveClientError";
    	/**
    	 * The 'list' request primitive for the Client entity.
    	 * @see client.pageRequest the request payload
    	 */
    	String LIST_CLIENT = "listClient";
    	/**
    	 * The success response primitive for listClient.
    	 *
    	 * @see #LIST_CLIENT the request primitive
    	 * @see Client.PagedResults the response payload
    	 */
    	String LIST_CLIENT_RESPONSE = "listClientResponse";
    	/**
    	 * An error response primitive for listClient.
    	 *
    	 * @see #LIST_CLIENT the request primitive
    	 */
    	String LIST_CLIENT_ERROR = "listClientError";
    	/**
    	 * The 'update' request primitive for the Client entity.
    	 * @see Client the request payload
    	 */
    	String UPDATE_CLIENT = "updateClient";
    	/**
    	 * The success response primitive for updateClient.
    	 *
    	 * @see #UPDATE_CLIENT the request primitive
    	 */
    	String UPDATE_CLIENT_RESPONSE = "updateClientResponse";
    	/**
    	 * An error response primitive for updateClient.
    	 *
    	 * @see #UPDATE_CLIENT the request primitive
    	 */
    	String UPDATE_CLIENT_ERROR = "updateClientError";
    	/**
    	 * The 'updateMerge' request primitive for the Client entity.
    	 * @see Client the request payload
    	 */
    	String UPDATE_MERGE_CLIENT = "updateMergeClient";
    	/**
    	 * The success response primitive for updateMergeClient.
    	 *
    	 * @see #UPDATE_MERGE_CLIENT the request primitive
    	 */
    	String UPDATE_MERGE_CLIENT_RESPONSE = "updateMergeClientResponse";
    	/**
    	 * An error response primitive for updateMergeClient.
    	 *
    	 * @see #UPDATE_MERGE_CLIENT the request primitive
    	 */
    	String UPDATE_MERGE_CLIENT_ERROR = "updateMergeClientError";
    	/**
    	 * The 'delete' request primitive for the Client entity.
    	 * @see Client.Id the request payload
    	 */
    	String DELETE_CLIENT = "deleteClient";
    	/**
    	 * The success response primitive for deleteClient.
    	 *
    	 * @see #DELETE_CLIENT the request primitive
    	 */
    	String DELETE_CLIENT_RESPONSE = "deleteClientResponse";
    	/**
    	 * An error response primitive for deleteClient.
    	 *
    	 * @see #DELETE_CLIENT the request primitive
    	 */
    	String DELETE_CLIENT_ERROR = "deleteClientError";
    	/**
    	 * The 'create' request primitive for the Product entity.
    	 * @see Product the request payload
    	 */
    	String CREATE_PRODUCT = "createProduct";
    	/**
    	 * The success response primitive for createProduct.
    	 *
    	 * @see #CREATE_PRODUCT the request primitive
    	 */
    	String CREATE_PRODUCT_RESPONSE = "createProductResponse";
    	/**
    	 * An error response primitive for createProduct.
    	 *
    	 * @see #CREATE_PRODUCT the request primitive
    	 */
    	String CREATE_PRODUCT_ERROR = "createProductError";
    	/**
    	 * The 'createBulk' request primitive for the Product entity.
    	 * @see CreateBulkProductInput the request payload
    	 */
    	String CREATE_BULK_PRODUCT = "createBulkProduct";
    	/**
    	 * The success response primitive for createBulkProduct.
    	 *
    	 * @see #CREATE_BULK_PRODUCT the request primitive
    	 * @see CreateBulkProductOutput the response payload
    	 */
    	String CREATE_BULK_PRODUCT_RESPONSE = "createBulkProductResponse";
    	/**
    	 * An error response primitive for createBulkProduct.
    	 *
    	 * @see #CREATE_BULK_PRODUCT the request primitive
    	 */
    	String CREATE_BULK_PRODUCT_ERROR = "createBulkProductError";
    	/**
    	 * The 'createMerge' request primitive for the Product entity.
    	 * @see Product the request payload
    	 */
    	String CREATE_MERGE_PRODUCT = "createMergeProduct";
    	/**
    	 * The success response primitive for createMergeProduct.
    	 *
    	 * @see #CREATE_MERGE_PRODUCT the request primitive
    	 */
    	String CREATE_MERGE_PRODUCT_RESPONSE = "createMergeProductResponse";
    	/**
    	 * An error response primitive for createMergeProduct.
    	 *
    	 * @see #CREATE_MERGE_PRODUCT the request primitive
    	 */
    	String CREATE_MERGE_PRODUCT_ERROR = "createMergeProductError";
    	/**
    	 * The 'retrieve' request primitive for the Product entity.
    	 * @see Product.GetRequest the request payload
    	 */
    	String RETRIEVE_PRODUCT = "retrieveProduct";
    	/**
    	 * The success response primitive for retrieveProduct.
    	 *
    	 * @see #RETRIEVE_PRODUCT the request primitive
    	 */
    	String RETRIEVE_PRODUCT_RESPONSE = "retrieveProductResponse";
    	/**
    	 * An error response primitive for retrieveProduct.
    	 *
    	 * @see #RETRIEVE_PRODUCT the request primitive
    	 */
    	String RETRIEVE_PRODUCT_ERROR = "retrieveProductError";
    	/**
    	 * The 'list' request primitive for the Product entity.
    	 * @see product.pageRequest the request payload
    	 */
    	String LIST_PRODUCT = "listProduct";
    	/**
    	 * The success response primitive for listProduct.
    	 *
    	 * @see #LIST_PRODUCT the request primitive
    	 * @see Product.PagedResults the response payload
    	 */
    	String LIST_PRODUCT_RESPONSE = "listProductResponse";
    	/**
    	 * An error response primitive for listProduct.
    	 *
    	 * @see #LIST_PRODUCT the request primitive
    	 */
    	String LIST_PRODUCT_ERROR = "listProductError";
    	/**
    	 * The 'update' request primitive for the Product entity.
    	 * @see Product the request payload
    	 */
    	String UPDATE_PRODUCT = "updateProduct";
    	/**
    	 * The success response primitive for updateProduct.
    	 *
    	 * @see #UPDATE_PRODUCT the request primitive
    	 */
    	String UPDATE_PRODUCT_RESPONSE = "updateProductResponse";
    	/**
    	 * An error response primitive for updateProduct.
    	 *
    	 * @see #UPDATE_PRODUCT the request primitive
    	 */
    	String UPDATE_PRODUCT_ERROR = "updateProductError";
    	/**
    	 * The 'updateMerge' request primitive for the Product entity.
    	 * @see Product the request payload
    	 */
    	String UPDATE_MERGE_PRODUCT = "updateMergeProduct";
    	/**
    	 * The success response primitive for updateMergeProduct.
    	 *
    	 * @see #UPDATE_MERGE_PRODUCT the request primitive
    	 */
    	String UPDATE_MERGE_PRODUCT_RESPONSE = "updateMergeProductResponse";
    	/**
    	 * An error response primitive for updateMergeProduct.
    	 *
    	 * @see #UPDATE_MERGE_PRODUCT the request primitive
    	 */
    	String UPDATE_MERGE_PRODUCT_ERROR = "updateMergeProductError";
    	/**
    	 * The 'delete' request primitive for the Product entity.
    	 * @see Product.Id the request payload
    	 */
    	String DELETE_PRODUCT = "deleteProduct";
    	/**
    	 * The success response primitive for deleteProduct.
    	 *
    	 * @see #DELETE_PRODUCT the request primitive
    	 */
    	String DELETE_PRODUCT_RESPONSE = "deleteProductResponse";
    	/**
    	 * An error response primitive for deleteProduct.
    	 *
    	 * @see #DELETE_PRODUCT the request primitive
    	 */
    	String DELETE_PRODUCT_ERROR = "deleteProductError";
    	/**
    	 * The 'create' request primitive for the Pedido entity.
    	 * @see Pedido the request payload
    	 */
    	String CREATE_PEDIDO = "createPedido";
    	/**
    	 * The success response primitive for createPedido.
    	 *
    	 * @see #CREATE_PEDIDO the request primitive
    	 */
    	String CREATE_PEDIDO_RESPONSE = "createPedidoResponse";
    	/**
    	 * An error response primitive for createPedido.
    	 *
    	 * @see #CREATE_PEDIDO the request primitive
    	 */
    	String CREATE_PEDIDO_ERROR = "createPedidoError";
    	/**
    	 * The 'createBulk' request primitive for the Pedido entity.
    	 * @see CreateBulkPedidoInput the request payload
    	 */
    	String CREATE_BULK_PEDIDO = "createBulkPedido";
    	/**
    	 * The success response primitive for createBulkPedido.
    	 *
    	 * @see #CREATE_BULK_PEDIDO the request primitive
    	 * @see CreateBulkPedidoOutput the response payload
    	 */
    	String CREATE_BULK_PEDIDO_RESPONSE = "createBulkPedidoResponse";
    	/**
    	 * An error response primitive for createBulkPedido.
    	 *
    	 * @see #CREATE_BULK_PEDIDO the request primitive
    	 */
    	String CREATE_BULK_PEDIDO_ERROR = "createBulkPedidoError";
    	/**
    	 * The 'createMerge' request primitive for the Pedido entity.
    	 * @see Pedido the request payload
    	 */
    	String CREATE_MERGE_PEDIDO = "createMergePedido";
    	/**
    	 * The success response primitive for createMergePedido.
    	 *
    	 * @see #CREATE_MERGE_PEDIDO the request primitive
    	 */
    	String CREATE_MERGE_PEDIDO_RESPONSE = "createMergePedidoResponse";
    	/**
    	 * An error response primitive for createMergePedido.
    	 *
    	 * @see #CREATE_MERGE_PEDIDO the request primitive
    	 */
    	String CREATE_MERGE_PEDIDO_ERROR = "createMergePedidoError";
    	/**
    	 * The 'retrieve' request primitive for the Pedido entity.
    	 * @see Pedido.GetRequest the request payload
    	 */
    	String RETRIEVE_PEDIDO = "retrievePedido";
    	/**
    	 * The success response primitive for retrievePedido.
    	 *
    	 * @see #RETRIEVE_PEDIDO the request primitive
    	 */
    	String RETRIEVE_PEDIDO_RESPONSE = "retrievePedidoResponse";
    	/**
    	 * An error response primitive for retrievePedido.
    	 *
    	 * @see #RETRIEVE_PEDIDO the request primitive
    	 */
    	String RETRIEVE_PEDIDO_ERROR = "retrievePedidoError";
    	/**
    	 * The 'list' request primitive for the Pedido entity.
    	 * @see pedido.pageRequest the request payload
    	 */
    	String LIST_PEDIDO = "listPedido";
    	/**
    	 * The success response primitive for listPedido.
    	 *
    	 * @see #LIST_PEDIDO the request primitive
    	 * @see Pedido.PagedResults the response payload
    	 */
    	String LIST_PEDIDO_RESPONSE = "listPedidoResponse";
    	/**
    	 * An error response primitive for listPedido.
    	 *
    	 * @see #LIST_PEDIDO the request primitive
    	 */
    	String LIST_PEDIDO_ERROR = "listPedidoError";
    	/**
    	 * The 'update' request primitive for the Pedido entity.
    	 * @see Pedido the request payload
    	 */
    	String UPDATE_PEDIDO = "updatePedido";
    	/**
    	 * The success response primitive for updatePedido.
    	 *
    	 * @see #UPDATE_PEDIDO the request primitive
    	 */
    	String UPDATE_PEDIDO_RESPONSE = "updatePedidoResponse";
    	/**
    	 * An error response primitive for updatePedido.
    	 *
    	 * @see #UPDATE_PEDIDO the request primitive
    	 */
    	String UPDATE_PEDIDO_ERROR = "updatePedidoError";
    	/**
    	 * The 'updateMerge' request primitive for the Pedido entity.
    	 * @see Pedido the request payload
    	 */
    	String UPDATE_MERGE_PEDIDO = "updateMergePedido";
    	/**
    	 * The success response primitive for updateMergePedido.
    	 *
    	 * @see #UPDATE_MERGE_PEDIDO the request primitive
    	 */
    	String UPDATE_MERGE_PEDIDO_RESPONSE = "updateMergePedidoResponse";
    	/**
    	 * An error response primitive for updateMergePedido.
    	 *
    	 * @see #UPDATE_MERGE_PEDIDO the request primitive
    	 */
    	String UPDATE_MERGE_PEDIDO_ERROR = "updateMergePedidoError";
    	/**
    	 * The 'delete' request primitive for the Pedido entity.
    	 * @see Pedido.Id the request payload
    	 */
    	String DELETE_PEDIDO = "deletePedido";
    	/**
    	 * The success response primitive for deletePedido.
    	 *
    	 * @see #DELETE_PEDIDO the request primitive
    	 */
    	String DELETE_PEDIDO_RESPONSE = "deletePedidoResponse";
    	/**
    	 * An error response primitive for deletePedido.
    	 *
    	 * @see #DELETE_PEDIDO the request primitive
    	 */
    	String DELETE_PEDIDO_ERROR = "deletePedidoError";
    	/**
    	 * The 'create' request primitive for the items attribute of pedido entity.\nThis primitive requires the header 'entity_parent_id' with id of parent pedido entity.
    	 * @see Item the request payload
    	 */
    	String CREATE_PEDIDO_ITEMS = "createPedido_Items";
    	/**
    	 * The success response primitive for createPedido_Items.
    	 *
    	 * @see #CREATE_PEDIDO_ITEMS the request primitive
    	 */
    	String CREATE_PEDIDO_ITEMS_RESPONSE = "createPedido_ItemsResponse";
    	/**
    	 * An error response primitive for createPedido_Items.
    	 *
    	 * @see #CREATE_PEDIDO_ITEMS the request primitive
    	 */
    	String CREATE_PEDIDO_ITEMS_ERROR = "createPedido_ItemsError";
    	/**
    	 * The 'createMerge' request primitive for the items attribute of pedido entity.\nThis primitive requires the header 'entity_parent_id' with id of parent pedido entity.
    	 * @see Item the request payload
    	 */
    	String CREATE_MERGE_PEDIDO_ITEMS = "createMergePedido_Items";
    	/**
    	 * The success response primitive for createMergePedido_Items.
    	 *
    	 * @see #CREATE_MERGE_PEDIDO_ITEMS the request primitive
    	 */
    	String CREATE_MERGE_PEDIDO_ITEMS_RESPONSE = "createMergePedido_ItemsResponse";
    	/**
    	 * An error response primitive for createMergePedido_Items.
    	 *
    	 * @see #CREATE_MERGE_PEDIDO_ITEMS the request primitive
    	 */
    	String CREATE_MERGE_PEDIDO_ITEMS_ERROR = "createMergePedido_ItemsError";
    	/**
    	 * The 'update' request primitive for the items attribute of pedido entity.\nThis primitive requires the header 'entity_parent_id' with id of parent pedido entity.
    	 * @see Item the request payload
    	 */
    	String UPDATE_PEDIDO_ITEMS = "updatePedido_Items";
    	/**
    	 * The success response primitive for updatePedido_Items.
    	 *
    	 * @see #UPDATE_PEDIDO_ITEMS the request primitive
    	 */
    	String UPDATE_PEDIDO_ITEMS_RESPONSE = "updatePedido_ItemsResponse";
    	/**
    	 * An error response primitive for updatePedido_Items.
    	 *
    	 * @see #UPDATE_PEDIDO_ITEMS the request primitive
    	 */
    	String UPDATE_PEDIDO_ITEMS_ERROR = "updatePedido_ItemsError";
    	/**
    	 * The 'updateMerge' request primitive for the items attribute of pedido entity.\nThis primitive requires the header 'entity_parent_id' with id of parent pedido entity.
    	 * @see Item the request payload
    	 */
    	String UPDATE_MERGE_PEDIDO_ITEMS = "updateMergePedido_Items";
    	/**
    	 * The success response primitive for updateMergePedido_Items.
    	 *
    	 * @see #UPDATE_MERGE_PEDIDO_ITEMS the request primitive
    	 */
    	String UPDATE_MERGE_PEDIDO_ITEMS_RESPONSE = "updateMergePedido_ItemsResponse";
    	/**
    	 * An error response primitive for updateMergePedido_Items.
    	 *
    	 * @see #UPDATE_MERGE_PEDIDO_ITEMS the request primitive
    	 */
    	String UPDATE_MERGE_PEDIDO_ITEMS_ERROR = "updateMergePedido_ItemsError";
    	/**
    	 * The 'retrieve' request primitive for the items attribute of pedido entity.\nThis primitive requires the header 'entity_parent_id' with id of parent pedido entity.
    	 * @see Item.GetRequest the request payload
    	 */
    	String RETRIEVE_PEDIDO_ITEMS = "retrievePedido_Items";
    	/**
    	 * The success response primitive for retrievePedido_Items.
    	 *
    	 * @see #RETRIEVE_PEDIDO_ITEMS the request primitive
    	 */
    	String RETRIEVE_PEDIDO_ITEMS_RESPONSE = "retrievePedido_ItemsResponse";
    	/**
    	 * An error response primitive for retrievePedido_Items.
    	 *
    	 * @see #RETRIEVE_PEDIDO_ITEMS the request primitive
    	 */
    	String RETRIEVE_PEDIDO_ITEMS_ERROR = "retrievePedido_ItemsError";
    	/**
    	 * The 'delete' request primitive for the items attribute of pedido entity.\nThis primitive requires the header 'entity_parent_id' with id of parent pedido entity.
    	 * @see Item.Id the request payload
    	 */
    	String DELETE_PEDIDO_ITEMS = "deletePedido_Items";
    	/**
    	 * The success response primitive for deletePedido_Items.
    	 *
    	 * @see #DELETE_PEDIDO_ITEMS the request primitive
    	 */
    	String DELETE_PEDIDO_ITEMS_RESPONSE = "deletePedido_ItemsResponse";
    	/**
    	 * An error response primitive for deletePedido_Items.
    	 *
    	 * @see #DELETE_PEDIDO_ITEMS the request primitive
    	 */
    	String DELETE_PEDIDO_ITEMS_ERROR = "deletePedido_ItemsError";
    	/**
    	 * The 'list' request primitive for the items attribute of pedido entity.\nThis primitive requires the header 'entity_parent_id' with id of parent pedido entity.
    	 * @see item.pageRequest the request payload
    	 */
    	String LIST_PEDIDO_ITEMS = "listPedido_Items";
    	/**
    	 * The success response primitive for listPedido_Items.
    	 *
    	 * @see #LIST_PEDIDO_ITEMS the request primitive
    	 * @see Item.PagedResults the response payload
    	 */
    	String LIST_PEDIDO_ITEMS_RESPONSE = "listPedido_ItemsResponse";
    	/**
    	 * An error response primitive for listPedido_Items.
    	 *
    	 * @see #LIST_PEDIDO_ITEMS the request primitive
    	 */
    	String LIST_PEDIDO_ITEMS_ERROR = "listPedido_ItemsError";
    	/**
    	 * The 'create' request primitive for the Item entity.
    	 * @see Item the request payload
    	 */
    	String CREATE_ITEM = "createItem";
    	/**
    	 * The success response primitive for createItem.
    	 *
    	 * @see #CREATE_ITEM the request primitive
    	 */
    	String CREATE_ITEM_RESPONSE = "createItemResponse";
    	/**
    	 * An error response primitive for createItem.
    	 *
    	 * @see #CREATE_ITEM the request primitive
    	 */
    	String CREATE_ITEM_ERROR = "createItemError";
    	/**
    	 * The 'createBulk' request primitive for the Item entity.
    	 * @see CreateBulkItemInput the request payload
    	 */
    	String CREATE_BULK_ITEM = "createBulkItem";
    	/**
    	 * The success response primitive for createBulkItem.
    	 *
    	 * @see #CREATE_BULK_ITEM the request primitive
    	 * @see CreateBulkItemOutput the response payload
    	 */
    	String CREATE_BULK_ITEM_RESPONSE = "createBulkItemResponse";
    	/**
    	 * An error response primitive for createBulkItem.
    	 *
    	 * @see #CREATE_BULK_ITEM the request primitive
    	 */
    	String CREATE_BULK_ITEM_ERROR = "createBulkItemError";
    	/**
    	 * The 'createMerge' request primitive for the Item entity.
    	 * @see Item the request payload
    	 */
    	String CREATE_MERGE_ITEM = "createMergeItem";
    	/**
    	 * The success response primitive for createMergeItem.
    	 *
    	 * @see #CREATE_MERGE_ITEM the request primitive
    	 */
    	String CREATE_MERGE_ITEM_RESPONSE = "createMergeItemResponse";
    	/**
    	 * An error response primitive for createMergeItem.
    	 *
    	 * @see #CREATE_MERGE_ITEM the request primitive
    	 */
    	String CREATE_MERGE_ITEM_ERROR = "createMergeItemError";
    	/**
    	 * The 'retrieve' request primitive for the Item entity.
    	 * @see Item.GetRequest the request payload
    	 */
    	String RETRIEVE_ITEM = "retrieveItem";
    	/**
    	 * The success response primitive for retrieveItem.
    	 *
    	 * @see #RETRIEVE_ITEM the request primitive
    	 */
    	String RETRIEVE_ITEM_RESPONSE = "retrieveItemResponse";
    	/**
    	 * An error response primitive for retrieveItem.
    	 *
    	 * @see #RETRIEVE_ITEM the request primitive
    	 */
    	String RETRIEVE_ITEM_ERROR = "retrieveItemError";
    	/**
    	 * The 'list' request primitive for the Item entity.
    	 * @see item.pageRequest the request payload
    	 */
    	String LIST_ITEM = "listItem";
    	/**
    	 * The success response primitive for listItem.
    	 *
    	 * @see #LIST_ITEM the request primitive
    	 * @see Item.PagedResults the response payload
    	 */
    	String LIST_ITEM_RESPONSE = "listItemResponse";
    	/**
    	 * An error response primitive for listItem.
    	 *
    	 * @see #LIST_ITEM the request primitive
    	 */
    	String LIST_ITEM_ERROR = "listItemError";
    	/**
    	 * The 'update' request primitive for the Item entity.
    	 * @see Item the request payload
    	 */
    	String UPDATE_ITEM = "updateItem";
    	/**
    	 * The success response primitive for updateItem.
    	 *
    	 * @see #UPDATE_ITEM the request primitive
    	 */
    	String UPDATE_ITEM_RESPONSE = "updateItemResponse";
    	/**
    	 * An error response primitive for updateItem.
    	 *
    	 * @see #UPDATE_ITEM the request primitive
    	 */
    	String UPDATE_ITEM_ERROR = "updateItemError";
    	/**
    	 * The 'updateMerge' request primitive for the Item entity.
    	 * @see Item the request payload
    	 */
    	String UPDATE_MERGE_ITEM = "updateMergeItem";
    	/**
    	 * The success response primitive for updateMergeItem.
    	 *
    	 * @see #UPDATE_MERGE_ITEM the request primitive
    	 */
    	String UPDATE_MERGE_ITEM_RESPONSE = "updateMergeItemResponse";
    	/**
    	 * An error response primitive for updateMergeItem.
    	 *
    	 * @see #UPDATE_MERGE_ITEM the request primitive
    	 */
    	String UPDATE_MERGE_ITEM_ERROR = "updateMergeItemError";
    	/**
    	 * The 'delete' request primitive for the Item entity.
    	 * @see Item.Id the request payload
    	 */
    	String DELETE_ITEM = "deleteItem";
    	/**
    	 * The success response primitive for deleteItem.
    	 *
    	 * @see #DELETE_ITEM the request primitive
    	 */
    	String DELETE_ITEM_RESPONSE = "deleteItemResponse";
    	/**
    	 * An error response primitive for deleteItem.
    	 *
    	 * @see #DELETE_ITEM the request primitive
    	 */
    	String DELETE_ITEM_ERROR = "deleteItemError";
    }
    
    interface Signals {
    	/**
    	 * Primitiva para ativar cliente
    	 */
    	String ATIVAR_CLIENTE = "ativarCliente";
    	/**
    	 * Primitava para ativar Produto
    	 */
    	String ATIVAR_PRODUCT = "ativarProduct";
    }
    
    interface Events {
    	/**
    	 * Event para retornar mensagem quando ativarmos um Produto
    	 */
    	String PRODUCT_ACTIVATED = "productActivated";
    	/**
    	 * Event para retornar mensagem quando o estoque do Produto zerar
    	 */
    	String STOCK_PRODUCT = "stockProduct";
    	/**
    	 * Default 'serviceStarted' event.
    	 */
    	String SERVICE_STARTED = "serviceStarted";
    	/**
    	 * Default 'notifyUser' event.
    	 */
    	String NOTIFY_USER_EVENT = "notifyUserEvent";
    	String IMPORT_CLIENT_EVENT = "importClientEvent";
    	String EXPORT_CLIENT_EVENT = "exportClientEvent";
    	String IMPORT_PRODUCT_EVENT = "importProductEvent";
    	String EXPORT_PRODUCT_EVENT = "exportProductEvent";
    	String IMPORT_PEDIDO_EVENT = "importPedidoEvent";
    	String EXPORT_PEDIDO_EVENT = "exportPedidoEvent";
    	String IMPORT_ITEM_EVENT = "importItemEvent";
    	String EXPORT_ITEM_EVENT = "exportItemEvent";
    }
    
}
