--  View ------------------------------------
/*
create or replace view 뷰이름
    as  뷰의 내용;
    
drop view 뷰이름;    
*/

select * from professor;
select * from emp;

create or replace view v_emp
    as select empno,ename, deptno from emp; -- where deptno=20;

select * from v_emp;
drop view v_emp;

--emp 테이블 제거하면 v_emp ?  제거 O
--v_emp 테이블 제거하면 emp ?  제거 X


create view v_student_join
as 
 select p.profno, p.name 교수이름,
       studno, s.name 학생이름, grade, dname 학과명 --, p.deptno
    from professor p join student s
    on p.profno = s.profno join department d
    on s.deptno1 = d.deptno;

select * from v_student_join;
drop view v_student_join;

--문제10] 30번 부서 사원들의 직위, 이름, 월급을 담은 view 테이블 만들기 (emp)
create view v_emp_30
as
    select job, ename, sal
        from emp
        where deptno=30;
        
select * from v_emp_30;

--문제11] 30번 부서 사원들의 직위, 이름, 월급을 담은 view 테이블 만드는데,
--    컬럼명을 직위, 사원이름, 급여로 Alias를 주고 월급이 2000보다 많은 사원들만 추출한다
create view v_emp30
as  select job 직위 , ename 사원이름, sal 급여 , deptno
        from emp
        where sal > 2000 and deptno=30;
        
select * from v_emp30;

--문제12] 부서별 최대급여, 최소급여,  평균급여를 갖는 view 만드시오
select avg(sal) from emp;

create or replace view v_emp_deptno
as 
    select deptno "부서", max(sal) 최대급여, min(sal) 최소급여, round( avg(sal), 3 ) 평균급여
        from emp
        group by deptno
        order by deptno;
        
select * from v_emp_deptno;

--문제13] 부서별 평균급여를 갖는 view 만드는데, 평균급여가 2000이상인 부서만 출력하세요.
create or replace view v_emp_2000
as   select deptno, round(avg(sal),2) "부서평균"
        from emp
        group by deptno
        having avg(sal) > 2000; --조건
        
select * from v_emp_2000;

select * from emp;
desc emp;
insert into emp(empno, ename, job, sal, deptno) values(8000, 'doyeon', 'manager', 4500, 40);
update emp set deptno = 50 where empno=8000; -- error
select * from dept;
        
--문제14]직위별 총급여를 구하는 view 테이블 만드는데, 직위(job)가 manager인 사원들은 제외하고
--    총급여가 3000 이상인 직원들만 저장한 테이블 만들기
create view v_emp_job as
    select * from emp
        where job <> 'MANAGER' and sal >= 3000;   -- != , <>
------------------------------------------------
create view v_emp_job as
    select job , sum(sal) 총급여
        from emp
        group by job                        -- job != 'MANAGER' and job != 'manager'
        having job not in('MANAGER','manager')  -- job <> 'MANAGER' and job <> 'manager'
        and sum(sal) >= 3000;
    
select * from v_emp_job;

--문제15]학생 테이블에서 학년별 평균 키와 몸무게가 키는 165 이상이고,
--    몸무게는 60이상인 사람들만 출력하는 뷰 테이블 만들기

create view v_studnet_학년별평균키
as
    select name 이름, grade 학년, round(avg(height), 1) 평균키, round(avg(weight), 1) 평균몸무게
        from student
        group by grade, name
        having avg(height) >= 165 and avg(weight) >= 60;
    

select * from v_studnet_학년별평균키; 

--문제16]교수테이블에서 전임강사 들만 있는 가상 테이블 만들기    
create view v_professor_전임
as
    select * from professor where position='전임강사';

select * from v_professor_전임;

select * from emp;
drop table emp;
drop table dept;
----------------------------------------
-- 제약조건 확인(테이블 & 컬럼) 및 제약조건
SELECT * 
    FROM all_constraints 
    WHERE TABLE_NAME = '테이블명'; -- 데이터 딕셔너리는 대문자
    
SELECT * 
    FROM all_constraints 
--    WHERE TABLE_NAME = 'DEPT';  
--    WHERE TABLE_NAME = 'EMP'; 
--    WHERE TABLE_NAME = 'C_EMPALL';   -- 제약조건 복사되지 않는다.
     where table_name ='CAL';
    
-- 제약조건 제거
alter table 테이블명 drop constraint 제약조건명 cascade; 
-- ex) alter table Board drop constraint board_no_pk cascade; 

alter table dept drop constraint pk_dept;  -- ORA-02273 : 고유/기본 키가 외부 키에 의해 참조되었습니다.
alter table dept drop constraint pk_dept cascade;

select * from dept;
-- PK 생성
alter table 테이블명 add ( constraint 제약조건명 primary key (컬럼명1, 컬럼명2,...) );
alter table dept add( constraint pk_dept_deptno primary key (deptno));

select * from c_empall;
desc c_empall;

alter table c_empall add( constraint empall_empno_pk primary key (empno));
alter table c_empall add constraint pk_empall primary key (empno);

delete from c_empall where ename='kingsmile';

select * from cal;
desc cal;

-- num_day 필드에 pk 제약조건 생성하기
alter table cal add constraint cal_num_pk primary key(num_day); 

select *
    from all_constraints
    where table_name='CAL';

-- 레코드 복사 ----------------------------------------
-- 형식>
insert into 테이블이름
    select 컬럼명, ...  from 테이블이름;

select * from c_emp_desc; 

create table c_emp6
    as select ename, empno, hiredate from emp where 1=2;

select * from c_emp6;
select * from emp2;

insert into c_emp6
    select emp_type, pay, birthday from emp2; -- 레코드 갯수, 데이터타입, 데이터크기 맞추면 됨
    
desc c_emp6;
ENAME       VARCHAR2(10) 
EMPNO       NUMBER(4)    
HIREDATE    DATE 

desc emp2;
EMP_TYPE          VARCHAR2(16)
PAY               NUMBER
BIRTHDAY          DATE

alter table c_emp6 modify ename varchar(16);
alter table c_emp6 modify empno number;

------------------------------------------------------------
실습 문서 Oracle SQL_PLSQL_PPT > ppt 4, 5, 10장 



