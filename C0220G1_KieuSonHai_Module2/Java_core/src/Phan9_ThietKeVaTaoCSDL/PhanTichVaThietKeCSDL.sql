create database bank;
use bank;
CREATE TABLE customers  (
   customerNumber int not null primary key,
   customerName varchar(50) not null,
   contactLastName varchar(50) not null,
   contactFirstName varchar(50) not null,
   phone varchar(50) not null,
   addressLine1 varchar(50) not null,
   addressLine2  varchar(50),
   city varchar(50) not null,
   state varchar(50) not null,
   postalCode varchar(15) not null,
   country varchar(50) not null,
   creditLimit double
   -- salesRepEmployeeNumber int(11) default null,
   -- constraint cus_emp foreign key(salesRepEmployeeNumber) references employees(employeeNumber),
   -- officeCode varchar(10) not null,
   -- constraint off_cus_key foreign key (officeCode) references offices(officeCode)
);
alter table customers 
add salesRepEmployeeNumber int(11) default null
after creditlimit,
add officeCode varchar(10) not null
after creditLimit;

INSERT INTO `bank`.`customers` (`customerNumber`, `customerName`, `contactLastName`, `contactFirstName`, `phone`, `addressLine1`, `addressLine2`, `city`, `state`, `postalCode`, `country`, `creditLimit`, `officeCode`, `salesRepEmployeeNumber`) VALUES ('01', 'son hai', 'son', 'hai', '0934613289', 'nguyen thi thap', 'ton dan', 'da nang', 'trung', '0808', 'Vie', '10000000', '123', '3');

alter table customers add foreign key  (officeCode) references offices(officeCode);
alter table customers add foreign key (salesRepEmployeeNumber) references employees(employeeNumber);

create table orders(
orderNumber int not null primary key,
orderDate date not null,
requiredDate date not null,
shippedDate date not null,
status varchar(15) not null,
comments text,
quantityOrdered int not null,
priceEach  double not null,
customerNumber int not null,
foreign key (customerNumber) references customers(customerNumber)
);

create table payments(
customerNumber int not null primary key,
checkNumber varchar(50) not null,
paymentDate date not null,
amount double not null,
 
 foreign key( customerNumber) references customers ( customerNumber)
);
create table products(
productCode varchar(15) not null primary key,
productName varchar(70) not null,
productScale varchar(10) not null,
productVendor varchar(50) not null,
productDescription text not null,
quantityInStock int not null,
buyPrice double not null,
MSRP double not null,
productLine varchar(50) not null,
foreign key(productLine) references productlines(productLine)
);

create table productLines(
productLine varchar(50) not null primary key,
textDescription varchar(500) default null,
image varchar(1000)
);

create table employess(
employeeNumber int not null primary key,
lastName varchar(50) not null,
firstName varchar(50) not null,
email varchar(100) not null,
jobTitle varchar(50) not null,
reportTo int(11) default null,
constraint emp_self foreign key(reportTo) references employess(employeeNumber)
);
create table offices(
officeCode varchar(10) not null primary key,
city varchar(50) not null,
phone varchar(50) not null,
adressLine1 varchar(50) not null,
adressLine2	 varchar(50) not null,
state varchar(50) not null,
country varchar(50) not null,
postalCode varchar(15) not null
);
create table OrderDetails(
orderNumber int not null,
productCode varchar(15) not null,
constraint order_details_products foreign key (productCode) references products(productCode),
constraint order_details_order foreign key (orderNumber) references orders(orderNumber),
constraint order_details_unique unique(productCode,orderNumber)
);