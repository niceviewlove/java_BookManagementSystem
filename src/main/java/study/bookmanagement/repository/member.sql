create table members(
  member_id int(11) not null auto_increment,
  name varchar(20) not null,
  gender varchar(1) not null,
  email varchar(40) not null,
  age int(3) not null,
  phone varchar(12) not null, 
  primary key(member_id)
);

desc members;
select * from members;

drop table members;