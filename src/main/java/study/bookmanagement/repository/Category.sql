create table categories(
  categoryId int(6) not null auto_increment,
  categoryName varchar(8) not null,
  primary key(categoryId)
); 

desc categories;
drop table categories;
select * from categories;