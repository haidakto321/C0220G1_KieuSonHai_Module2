CREATE TABLE customers(
   customer_number int auto_increment primary key,
   fullname varchar(55) not null,
   adress varchar(100),
   email varchar(55),
   phone int not null
);
create table accounts(
account_number int not null primary key,
account_type varchar(55),
date date ,
balance int,
customer_number int,
foreign key (customer_number) references customers(customer_number) 
);

create table transactions(
 tran_number varchar(55) primary key,
 account_number int(55) not null,
 date date,
 amounts int not null,
 descriptions varchar(55),
 foreign key (account_number) references accounts(account_number)
 );