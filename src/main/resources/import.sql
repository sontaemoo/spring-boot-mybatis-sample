drop table if exists city;
drop table if exists hotel;

create table city (id int primary key auto_increment, name varchar, state varchar, country varchar);
create table hotel (city int, name varchar, address varchar, zip varchar);

insert into city (name, state, country) values ('San Francisco', 'CA', 'US');
insert into hotel(city, name, address, zip) values (1, 'Conrad Treasury Place1', 'William & George Streets1', '4001');
insert into hotel(city, name, address, zip) values (2, 'Conrad Treasury Place2', 'William & George Streets2', '4001');
insert into hotel(city, name, address, zip) values (3, 'Conrad Treasury Place3', 'William & George Streets3', '4001');
insert into hotel(city, name, address, zip) values (4, 'Conrad Treasury Place4', 'William & George Streets4', '4001');
insert into hotel(city, name, address, zip) values (5, 'Conrad Treasury Place5', 'William & George Streets5', '4001');
