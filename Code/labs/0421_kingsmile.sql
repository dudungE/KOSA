--  테이블 복사 / 레코드 복사 ----------------------
/* 형식>
    create table 테이블이름
        as  select  필드명,..... from 테이블명 
*/
select * from emp; -- 14
create table c_empAll
    as select * from emp;  -- 제약조건 복사 안됨
    
select * from c_empAll;
desc emp;
desc c_empAll;

create table c_emp_20
    as select * from emp where deptno=20;

select * from c_emp_30;

create table c_emp_30
 as
    select empno 사번, ename 사원명, job 직책, sal 급여
        from emp where deptno=30;

-- 제약조건 확인 방법  1) 툴이용   2)명령어
select * from all_constraints
    where table_name ='EMP';  -- 데이터 딕셔너리에는 대부분 대문자로 저장됨
    
--문제1] 교수 테이블에서 전임강사만 뽑아서 테이블 생성하기  
create table c_professor_전임
  as select * from professor where position='전임강사';
  
select * from c_professor_전임;

--문제2] emp(직원) 테이블에서 mgr(매니저번호)가 7566번인 사람만 추출해서 새로운 테이블 생성하기    
select * from emp where mgr=7566;    

create table c_emp_7566
    as select * from emp where mgr=7566;
    
select * from c_emp_7566;

-- 형식> 구조물만 복사하길 원할때
create table 테이블이름
    as select 필드명,....from 테이블명 where 1=0;  -- 조건 거짓

create table c_emp_desc
    as select * from emp where 1=0;  

select * from c_emp_desc;

create table c_emp5
    as select empno, ename, job, sal from emp;

select * from c_emp5;

select * from c_empAll;  -- 전체복사
select * from c_emp_20;  -- 조건에 맞게 복사 
select * from c_emp_30;  -- 조건적용, 별칭 
select * from c_emp_desc; -- 구조물만 복사, 레코드 없음
select * from c_emp5;  -- 원하는 필드에 해당하는 레코드 복사, empno, ename, job, sal 

--  Union -------- pk / fk 관계 아닌 상태 테이블 합치기
select * from emp
union   -- 중복행 제거
    select * from c_empAll;

select * from emp
union all   -- 중복 레코드 포함
    select * from c_empAll;

insert into c_empAll values(7788, 'kingsmile', 'manager', 7566, '2025/01/03',5000, 1000, 30);

select * from c_empAll;

-- 필드 개수, data type 일치해야함
select empno, ename, job, sal from emp
union
    select * from c_emp5;
    
select empno, ename, job, comm from emp
union
    select * from c_emp5;
    
select empno, ename, job, HIREDATE from emp  -- data type error
union
    select * from c_emp5;

desc c_emp5;
desc emp;
 -- 검색!!! 쿼리문은 대소문자 구분 안한다.  단, 레코드는 대소문자 구분한다.
select * from c_empall;
SELECT * FROM C_EMPALL;
select * from c_empall where job='MANAGER' or job='manager';
select * from c_empall where job in('MANAGER','manager');
select * from c_empall where job not in('MANAGER','manager');

select empno 사원번호, ename 이름, sal 급여
    from emp
    where ename='FORD'
--    where 이름='FORD'  -- 별칭으로 조건 X
    order by 급여 desc;  -- 별칭으로 정렬 O
    
--문제1] c_emp_20, c_emp_desc union 결과?    
select * from c_emp_20
union
    select * from c_emp_desc;

--문제2] 사원번호, 이름, 급여 그리고 15%인상된 급여를 정수로 표시하되 
-- 컬럼명을 New Salary로 지정하여 출력하라.
select empno, ename, sal, sal*1.15 as "New Salary" from emp;
select empno, ename, sal, round(sal*1.15, 0) as "New Salary" from emp;
select empno, ename, sal, cast(sal*1.15 as int) as "New Salary" from emp; -- cast(필드 as 자료형)

select empno 사원번호, ename 사원이름 , sal 급여,
    case
        when sal > 0 then round((sal * 1.15), 0)
        end as "new salary"
    from emp;

--문제3] 2번 문제와 동일한 데이타에서 급여 인상분(새 급여에서 이전 
-- 급여를 뺀 값)을 추가해서 출력하라.(컬럼명은 Increase로 하라).
select empno, ename, sal, (sal*1.15)-sal as Increase from emp;
select empno, ename, sal, round(sal*1.15, 0) - sal Increase from emp;

select empno 사원번호, ename 사원이름 , sal 급여,
    case
        when sal > 0 then round((sal * 1.15), 0) - sal
        end as "increase(인상분)"
    from emp;

--문제4] 각 사원의 이름을 표시하고 근무 달 수를 계산하여 컬럼명을 
-- Months_Works로 지정하고, 근무 달수를 기준으로 오래된 
-- 사람부터 정렬하여 출력하라. 
select * from emp;
select ename 이름, hiredate as Months_Works
    from emp
    order by hiredate desc;

-- 근무 개월수    
select ename 이름, hiredate 입사일, round( (sysdate-hiredate) / 30, 0) as "근무일 수"
    from emp
    order by hiredate desc;
    
select ename 이름, hiredate, floor(months_between(sysdate, hiredate)) as Months_Works  -- ceil, floor
    from emp
    order by hiredate desc;

-- 년수로도 확인가능    
select ename 이름, hiredate, trunc(months_between(sysdate, hiredate)/12, 0) as Months_Works  -- ceil, floor
    from emp
    order by hiredate desc;

select ename 이름, hiredate 입사일, 
    trunc(months_between(sysdate, hiredate)/12 ) as "근속년수" -- ceil, floor
    from emp
    order by hiredate desc;
    
--cf) c_empAll
select * from c_empall;

select ename 이름, hiredate 입사일, 
    trunc(months_between(sysdate, hiredate)/12 ) as "근속년수" -- ceil, floor
    from c_empall
    order by hiredate desc;
    
--문제5] 사원의 이름과 커미션을 출력하되, 커미션이 책정되지 않은 
-- 사원의 커미션은 'no commission'으로 출력하라.
select ename, comm from emp;
desc emp;

select ename,  nvl( to_char(comm), 'no commission') as comm  -- convert(자료형, 필드명) 
--select ename,  nvl( cast(comm as varchar(20)) , 'no commission') as comm
--select ename,  nvl( convert( varchar(20), comm) , 'no commission') as comm
    from emp;








