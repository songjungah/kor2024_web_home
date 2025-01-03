# [1] 데이터 베이스 생성
drop database if exists mydb0102;	# 1. 만약에 생성할 db명이 존재하면 삭제
create database mydb0102;			# 2. db 생성
use mydb0102;						# 3. db 활성화

# [2] 테이블 생성
create table board(
	bno int unsigned auto_increment,	# 게시물 번호, int(정수타입), unsigned(부호없음), auto_increment(자동번호부여)
    btitle varchar(100) not null,		# 게시물 제목, varchar(100) : 최대 100글자 까지, not null : null 대입 불가능
    bcontent longtext,					# 게시물 내용, longtext : 최대 4G까지 
    bdate datetime default now(),		# 게시물 날짜, datetime : 현재 날짜시간 타입, defalut 기본값, now() : 시스템 날짜/시간
    bwriter varchar(30) not null,		# 게시물 작성자
    bpwd varchar(30) not null,			# 게시물 패스워드
    primary key(bno)					# 게시물 번호 PK로 선정.
);

# [3] 샘플 코드
insert into board(btitle, bcontent, bwriter, bpwd) value ('안녕제목1', '안녕내용1', '유재석', '1234');
insert into board(btitle, bcontent, bwriter, bpwd) value ('안녕제목2', '안녕내용2', '강호동', '4567');
insert into board(btitle, bcontent, bwriter, bpwd) value ('안녕제목3', '안녕내용3', '신동엽', '7890');

# [JDBC] 게시물 쓰기
# insert into board(btitle, bcontent, bwriter, bpwd) values(?, ?, ?, ?);

# [JDBC] 게시물 출력
select * from board;