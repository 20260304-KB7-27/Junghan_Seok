-- 계정 만들기
create user 'bear'@'%' identified by "bear";

show tables;

select user, user.host from user;

-- 권한 부여
-- employees 데이터베이스에 대한 모든 권한 부여
grant all privileges on employees.* to 'bear'@'%';

-- 'bear'@'%'가 가진 모든 권한 조회
show grants for 'bear'@'%'