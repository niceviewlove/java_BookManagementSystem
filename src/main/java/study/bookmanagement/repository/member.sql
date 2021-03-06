create table members(
  member_id int(11) not null auto_increment COMMENT '회원 ID',
  name varchar(20) not null COMMENT '이름',
  gender varchar(1) not null COMMENT '성별',
  email varchar(40) not null COMMENT '이메일',
  age int(3) not null COMMENT '나이',
  phone varchar(12) not null COMMENT '휴대폰 번호', 
  primary key(member_id)
);

desc members;
select * from members;

drop table members;