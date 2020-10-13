create table categories(
  category_id int(6) not null auto_increment,
  category_number int(6) unique not null,
  category_name varchar(8) not null,
  primary key(category_id)
); 

desc categories;
drop table categories;
select * from categories;