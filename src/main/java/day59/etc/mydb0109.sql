# 1. 데이터 베이스 준비
drop database if exists mydb0109;		# 만일 'mydb0109' 데이터베이스가 존재하면 삭제
create database mydb0109;				# 'mydb0109' 데이터베이스 생성
use mydb0109;							# 'mydb0109' 사용 활성화

# 2. 테이블 생성
create table member(
	mno int auto_increment,				# 회원번호
    mid varchar(30),					# 회원아이디
    mpwd varchar(30),					# 회원비밀번호
    mname varchar(30),					# 회원닉네임
    mphone varchar(13),					# 회원전화번호
    primary key(mno)					# 회원번호 PK 설정
);
