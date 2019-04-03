CREATE DATABASE jpatest WITH OWNER = postgres;

drop table person;
drop table address;

create table person (
	person_id serial PRIMARY KEY,
	name varchar (255) not null,
	city varchar (255) null
);

create table address (
	address_id serial PRIMARY KEY,
	countryname varchar (255) not null,
	cityname varchar (255) not null unique,
	streetname varchar (255) not null
);

insert into address (countryname, cityname, streetname) values ('Polska', 'Poznan', 'Sw. Marcin');
insert into person (name, city) values ('Maciej', 'Poznan');
