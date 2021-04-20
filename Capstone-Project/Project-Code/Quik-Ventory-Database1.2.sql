use quikvory_Quik_Ventory;

create table users(
    email varchar(35) UNIQUE NOT NULL,
    username varchar(35) NOT NULL,
    user_ID integer AUTO_INCREMENT NOT NULL,
    password varchar(30) NOT NUll,
    primary key (user_ID)
);

create table inventory(
    user_ID integer NOT NULL,
    item_ID varchar(15) NOT NULL, /*barcode: UPC standard is 12 digits*/
    item_name varchar(30) NOT NULL,
    qty integer NOT NULL,
    price decimal(7,2),
    dept varchar(30),
    primary key (user_ID, item_ID),
    foreign key (user_ID) references users (user_ID)
);