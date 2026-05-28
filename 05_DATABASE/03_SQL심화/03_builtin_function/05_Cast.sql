-- 형변환 내장 함수

use employees;

/*
CAST(value AS type)
- value를 지정한 type으로 변경
- CHAR, SIGNED(정수), UNSIGNED(양의정수), DECIMAL, DATE, DATETIME
*/
select
    emp_no,
    # 문자열의 크기를 명시하지 않으면 필요한 크기만큼 자동 생성
    CONCAT('사번: ', CAST(emp_no AS CHAR(30))) as 사번_문자
from employees
limit 5, 10;

/*
CONVERT(value, type)
- CAST와 동일한 역할을 수행한다.
- 문자셋 변환에도 사용 할 수 있다. CONVERT(str USING utf8mb4)
*/
select
    emp_no,
    hire_date,
    CONVERT(YEAR(hire_date), CHAR) as 입사연도_문자,
    CONVERT(YEAR(hire_date), SIGNED ) as 입사연도_정수
from
    employees
limit 5,10;