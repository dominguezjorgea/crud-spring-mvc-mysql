create database friends;

use friends;

Create table friend(
	id int(11) auto_increment,
	first_name varchar(255),
	last_name varchar (255),
	Primary Key(id)
);

show tables;

describe friend;

insert into friend values(null, 'Jorge', 'Dominguez');
insert into friend values(null, 'Nidia', 'Morales');