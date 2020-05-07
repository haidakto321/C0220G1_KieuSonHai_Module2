-- create database libarary;
create table student(
student_number varchar(15)  primary key,
studen_name varchar(50) ,
adress varchar(500) ,
email varchar(50),
image blob
);

create table book(
book_id int(10) not null primary key,
book_name varchar(50),
publisher varchar(50),
author varchar(50),
publish_year date,
amount double,
image blob,
category_id int(10),
status int(10) default null
);
alter table book add foreign key (category_id) references category(category_id);

create table borrow_order(
student_number varchar(15) not null,
book_id int(10) not null,
start_borrow_date date not null,
end_borrow_date date not null,
borrow_status int not null,
primary key(student_number,book_id)
);
alter table borrow_order add foreign key (book_id) references book(book_id);

create table category(
category_id int(10) not null primary key,
category_name varchar(50)
);