/* Database: PostgreSql. Generation date: 2023-02-17 15:48:55:500 */
/* Entity Client */
create table client (
	id UUID NOT NULL,
	name VARCHAR(255) NOT NULL,
	cpf VARCHAR(255) NOT NULL,
	birthday DATE NOT NULL,
	active BOOLEAN,
	ext JSONB
);


/* Creating index for customization column */
create index client_ext on client using gin (ext);

/* Entity Product */
create table product (
	id UUID NOT NULL,
	name VARCHAR(255) NOT NULL,
	description VARCHAR(255) NOT NULL,
	price DECIMAL NOT NULL,
	stock NUMERIC(19) NOT NULL,
	active BOOLEAN,
	ext JSONB
);


/* Creating index for customization column */
create index product_ext on product using gin (ext);

/* Entity Pedido */
create table pedido (
	id UUID NOT NULL,
	client UUID NOT NULL,
	order_date DATE NOT NULL /* orderDate */,
	final_value DECIMAL /* finalValue */,
	ext JSONB
);


/* Creating index for customization column */
create index pedido_ext on pedido using gin (ext);

/* Entity Item */
create table item (
	id UUID NOT NULL,
	pedido UUID NOT NULL,
	product UUID NOT NULL,
	quantity NUMERIC(19) NOT NULL,
	unitary_value DECIMAL /* unitaryValue */,
	total_value DECIMAL /* totalValue */,
	ext JSONB
);


/* Creating index for customization column */
create index item_ext on item using gin (ext);

/* Join Tables */

/* Primary Key Constraints */
alter table client add constraint pk_client_id primary key(id);
alter table product add constraint pk_product_id primary key(id);
alter table pedido add constraint pk_pedido_id primary key(id);
alter table item add constraint pk_item_id primary key(id);

/* Foreign Key Constraints */
alter table pedido add constraint fk73pxtmen8gi6f9mo5inlrfygzifh foreign key (client) references client (id);
alter table item add constraint fkdrlksdm3tcej27hie286scvce5tl foreign key (pedido) references pedido (id);
alter table item add constraint fk12c6gt1mpxzhpdugpl3enf1migfb foreign key (product) references product (id);

/* Unique Key Constraints */
alter table product add constraint uk_name unique (name);

/* Sequences for auto increment entity ids */
