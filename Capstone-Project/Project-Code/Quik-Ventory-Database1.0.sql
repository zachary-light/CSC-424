create database Quik_Ventory;
use Quik_Ventory;

create table users(
    email varchar(35) UNIQUE,
    username varchar(35) NOT NULL,
    user_ID integer AUTO_INCREMENT,
    password varchar(30) NOT NUll,
    primary key (user_ID)
);

create table inventory(
    user_ID integer,
    item_ID varchar(15), /*barcode: UPC standard is 12 digits*/
    item_name varchar(30) NOT NULL,
    qty integer NOT NULL,
    price decimal(7,2),
    dept varchar(30),
    primary key (user_ID, item_ID),
    foreign key (user_ID) references users (user_ID)
);
