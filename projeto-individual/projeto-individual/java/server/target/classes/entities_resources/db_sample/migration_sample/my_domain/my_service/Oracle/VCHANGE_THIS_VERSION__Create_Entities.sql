/* Database: Oracle. Generation date: 2023-03-01 15:56:03:949 */
/* Entity Client */
create table client (
	id RAW(16) NOT NULL,
	name VARCHAR(255) NOT NULL,
	cpf VARCHAR(255) NOT NULL,
	birthday DATE NOT NULL,
	active NUMBER(1),
	ext CLOB,
	CONSTRAINT client_JSON_ext CHECK (ext IS JSON)
);


/* Creating index for customization column */
CREATE INDEX client_ext ON client (ext) INDEXTYPE IS CTXSYS.CONTEXT PARAMETERS ('section group CTXSYS.JSON_SECTION_GROUP SYNC (ON COMMIT)');

/* Entity Product */
create table product (
	id RAW(16) NOT NULL,
	name VARCHAR(255) NOT NULL,
	description VARCHAR(255) NOT NULL,
	price DECIMAL NOT NULL,
	stock NUMBER(19) NOT NULL,
	active NUMBER(1),
	categoria VARCHAR(255),
	ext CLOB,
	CONSTRAINT product_JSON_ext CHECK (ext IS JSON)
);


/* Creating index for customization column */
CREATE INDEX product_ext ON product (ext) INDEXTYPE IS CTXSYS.CONTEXT PARAMETERS ('section group CTXSYS.JSON_SECTION_GROUP SYNC (ON COMMIT)');

/* Entity Pedido */
create table pedido (
	id RAW(16) NOT NULL,
	client RAW(16) NOT NULL,
	order_date DATE /* orderDate */,
	final_value DECIMAL /* finalValue */,
	ext CLOB,
	CONSTRAINT pedido_JSON_ext CHECK (ext IS JSON)
);


/* Creating index for customization column */
CREATE INDEX pedido_ext ON pedido (ext) INDEXTYPE IS CTXSYS.CONTEXT PARAMETERS ('section group CTXSYS.JSON_SECTION_GROUP SYNC (ON COMMIT)');

/* Entity Item */
create table item (
	id RAW(16) NOT NULL,
	pedido RAW(16) NOT NULL,
	product RAW(16) NOT NULL,
	quantity NUMBER(19) NOT NULL,
	unitary_value DECIMAL /* unitaryValue */,
	total_value DECIMAL /* totalValue */,
	ext CLOB,
	CONSTRAINT item_JSON_ext CHECK (ext IS JSON)
);


/* Creating index for customization column */
CREATE INDEX item_ext ON item (ext) INDEXTYPE IS CTXSYS.CONTEXT PARAMETERS ('section group CTXSYS.JSON_SECTION_GROUP SYNC (ON COMMIT)');

/* Join Tables */

/* Primary Key Constraints */
alter table client add constraint pk_client_id primary key(id);
alter table product add constraint pk_product_id primary key(id);
alter table pedido add constraint pk_pedido_id primary key(id);
alter table item add constraint pk_item_id primary key(id);

/* Foreign Key Constraints */
alter table pedido add constraint fkacjk6f9sujmf7sgenumfwfl9efd6 foreign key (client) references client (id);
alter table item add constraint fkekjd1ps6cgfcv4fbrp0uzxt66jsr foreign key (pedido) references pedido (id);
alter table item add constraint fkbe6w2kqaqug3iaocho0fmqrlrl2g foreign key (product) references product (id);

/* Unique Key Constraints */
alter table product add constraint uk_name unique (name);

/* Sequences for auto increment entity ids */
