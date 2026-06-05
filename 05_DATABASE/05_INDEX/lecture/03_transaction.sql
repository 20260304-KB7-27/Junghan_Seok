/*
트랜젝션(Transaction)
- 데이터베이스 작업을 하나의 논리적인 작업 단위로 묶은 것
*/

select @@autocommit; -- 현재 세션의 자동커밋상태

set autocommit = false; -- autocommit 비활성화

-- 트렌젝션 시작
start transaction;

-- 이후에 동작하는 query들은 하나의 작업 단위로 묶임
use sqldb;

delete from buytbl where num = 3;
delete from buytbl where num = 4;

select * from buytbl;
    -- 현재 트랜젝션 세션안에서는 삭제된 것으로 보이나 실제 데이터베이스에는 반영안됨.

rollback; -- transaction 시작 이전 가장 최근의 commit시점으로 되돌림

commit; -- commit 을 했을때 데이터베이스에 반영이 된다.

set autocommit = true; -- autocommit 비활성화

-- autocommit 모드 원래대로 돌려놓기!
select @@autocommit; -- 현재 세션의 자동커밋상태
