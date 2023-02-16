/* Database: SqlServer. Generation date: 2023-02-15 14:21:31:595 */
/* Entity Client */
create table client (
	id UNIQUEIDENTIFIER NOT NULL,
	name VARCHAR(255) NOT NULL,
	cpf VARCHAR(255) NOT NULL,
	birthday DATE NOT NULL,
	active BIT,
	ext VARCHAR(4000)
);


/* Creating index for customization column */
/* column type JSON not supported */

/* Entity Product */
create table product (
	id UNIQUEIDENTIFIER NOT NULL,
	name VARCHAR(255) NOT NULL,
	description VARCHAR(255) NOT NULL,
	price MONEY NOT NULL,
	stock NUMERIC(19) NOT NULL,
	active BIT,
	ext VARCHAR(4000)
);


/* Creating index for customization column */
/* column type JSON not supported */

/* Entity Pedido */
create table pedido (
	id UNIQUEIDENTIFIER NOT NULL,
	client UNIQUEIDENTIFIER NOT NULL,
	order_date DATE NOT NULL /* orderDate */,
	final_value MONEY /* finalValue */,
	ext VARCHAR(4000)
);


/* Creating index for customization column */
/* column type JSON not supported */

/* Entity Item */
create table item (
	id UNIQUEIDENTIFIER NOT NULL,
	pedido UNIQUEIDENTIFIER NOT NULL,
	product UNIQUEIDENTIFIER NOT NULL,
	quantity NUMERIC(19) NOT NULL,
	unitary_value MONEY /* unitaryValue */,
	total_value MONEY /* totalValue */,
	ext VARCHAR(4000)
);


/* Creating index for customization column */
/* column type JSON not supported */

/* Join Tables */

/* Primary Key Constraints */
alter table client add constraint pk_client_id primary key(id);
alter table product add constraint pk_product_id primary key(id);
alter table pedido add constraint pk_pedido_id primary key(id);
alter table item add constraint pk_item_id primary key(id);

/* Foreign Key Constraints */
alter table pedido add constraint fkox1y2vje26ik2qkq4etqzoiaiifl foreign key (client) references client (id);
alter table item add constraint fksgoymnvymxbb5gzo9nse3wtygngk foreign key (pedido) references pedido (id);
alter table item add constraint fk1hvt3ywi4krw6he0vywjxygkr33i foreign key (product) references product (id);

/* Unique Key Constraints */
alter table product add constraint uk_name unique (name);

/* Sequences for auto increment entity ids */
