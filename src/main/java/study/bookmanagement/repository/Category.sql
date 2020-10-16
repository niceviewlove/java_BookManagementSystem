create table categories(
  categoryId int(6) not null auto_increment COMMENT '카테고리 ID',
  categoryName varchar(8) not null COMMENT '카테고리 이름',
  primary key(categoryId)
); 

desc categories;
drop table categories;
select * from categories;