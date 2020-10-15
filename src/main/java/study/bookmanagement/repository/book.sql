create table books(
  bookId int(11) not null auto_increment,
  categoryId int(6) not null,
  title varchar(100) not null,
  author varchar(15) not null,
  stock int(10) not null,
  year int(4) not null, 
  price int(8) not null,
  primary key(bookId)
); 

desc books;
drop table books;
select * from books;

select count(*) from books where book_id=2;
