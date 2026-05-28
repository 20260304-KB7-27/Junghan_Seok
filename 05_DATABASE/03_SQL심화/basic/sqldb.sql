use sqldb;

-- 사용자별로 구매 이력을 출력함
-- 모든 컬럼을 출력함
-- 구매 이력이 없는 정보는 출력하지 않음
select *
from buytbl
inner join usertbl on buytbl.userID = usertbl.userID;

-- 앞의 결과에서 userID가 'JYP'인 데이터만 출력
select *
from buytbl
inner join usertbl on buytbl.userID = usertbl.userID
where buytbl.userID = 'JYP';

-- 각 사용자별로 구매 이력을 출력
-- 연결 컬럼은 userID로 함
-- 결과를 userID를 기준으로 오름차순으로 정렬함
-- 구매이력이 없는 사용자도 출력
-- userID, name, prodName, addr, 연락처를 다음과 같이 출력함
select U.userID, U.name, B.prodName, U.addr,
       concat(U.mobile1, U.mobile2) as '연락처'
from usertbl U
left outer join buytbl B on U.userID = B.userID
order by U.userID;

-- sqldb의 사용자를 모두 조회하되 전화가 없는 사람은 제외하고 출력
select
    name,
    concat(mobile1, mobile2) as '전화번호'
from usertbl
where name not in (select  name from usertbl where mobile1 IS NULL);

-- sqldb의 사용자를 모두 조회하되 전화가 없는 사람만 출력
select
    name,
    concat(mobile1, mobile2) as '전화번호'
from usertbl
where name in (select  name from usertbl where mobile1 IS NULL);