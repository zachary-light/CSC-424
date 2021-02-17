create database Quik_Ventory;
use Quik_Ventory;

create table users(
	email varchar(35),
    username varchar(35) NOT NULL,
	password varchar(30) NOT NUll,
    primary key (email)
);

create table inventory(
	email varchar(35),
	item_ID varchar(15), /*barcode: UPC standard is 12 digits*/
    item_name varchar(30) NOT NULL,
    qty integer NOT NULL,
    price decimal(7,2),
    dept varchar(30),
    primary key (email, item_ID),
    foreign key (email) references users (email)
);