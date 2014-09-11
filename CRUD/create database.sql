create database if not exists auto_show;

use auto_show;

create table if not exists cars (
	id_car int(4) auto_increment primary key,
	name varchar(100) not null,
	model varchar(100) not null,
	modification varchar(100) not null,
	unique key mark_unique_key (name,model,modification)
);

create table if not exists merchants(
	id_merchant int(3) auto_increment primary key,
	name varchar(100),
	surname varchar(100),
	patronic varchar(100)
);

create table if not exists customers(
	id_customer int(7) auto_increment primary key,
	name varchar(100),
	surname varchar(100),
	patronic varchar(100),
	passport_series char(4),
	passport_number char(6),
	birthdate date,
	unique unique_passport(passport_series,passport_number),
	key customer_surname_key (surname)
);

create table if not exists sales(
	id_sale int(11) auto_increment primary key,
	id_car int(11),
	id_customer int(7),
	id_merchant int(3),
	price decimal(11,2) ,
	sale_date timestamp not null default current_timestamp(),
	foreign key fk_car(id_car) references cars(id_car)
	on delete set NULL,
	foreign key fk_customer(id_customer) references customers(id_customer)
	on delete set NULL,
	foreign key fk_merchant(id_merchant) references merchants(id_merchant)
	on delete set NULL
);

create table if not exists store(
	id_store int(11) auto_increment primary key,
	id_car int(11) not null,
	count int(3) unsigned,
	price decimal(11,2),
	testdrive_avaible bit default 0,
	unique unique_id_car(id_car),
	foreign key fk_car(id_car) references cars(id_car)
	on update cascade
	on delete cascade
);

GRANT ALL PRIVILEGES ON *.* TO 'root'@'localhost' IDENTIFIED BY 'root' WITH GRANT OPTION;