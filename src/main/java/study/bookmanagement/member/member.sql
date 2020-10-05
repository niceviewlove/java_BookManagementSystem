create table members(
  member_id int(11) not null auto_increment,
  name varchar(20) not null,
  gender varchar(3) not null,
  email varchar(40) not null,
  age int(4) not null,
  phone varchar(13) not null, 
  primary key(member_id)
);

desc members;
select * from members;
drop table members;