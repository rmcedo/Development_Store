/* Database: PostgreSql. Generation date: 2023-02-08 11:42:41:394 */
/* Entity Client */
create table client (
	id UUID NOT NULL,
	name VARCHAR(255) NOT NULL,
	cpf VARCHAR(255) NOT NULL,
	birthday DATE NOT NULL,
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
	ext JSONB
);


/* Creating index for customization column */
create index product_ext on product using gin (ext);

/* Entity Pedido */
create table pedido (
	id UUID NOT NULL,
	client UUID NOT NULL,
	order_date DATE NOT NULL /* orderDate */,
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
	unitary_value DECIMAL NOT NULL /* unitaryValue */,
	total_value DECIMAL NOT NULL /* totalValue */,
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
alter table pedido add constraint fkk4rbz4rzx4grgnrpan4dmcz1wuwp foreign key (client) references client (id);
alter table item add constraint fkgxqnb5kbevk4eszl5dqc1tkucnr3 foreign key (pedido) references pedido (id);
alter table item add constraint fkud5bhs0ch4dkg4qyyksv0bu2oy8q foreign key (product) references product (id);

/* Unique Key Constraints */

/* Sequences for auto increment entity ids */
