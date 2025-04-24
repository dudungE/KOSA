--  Join ----------- pk / fk 관계
--두 개 이상의 테이블을 하나의 테이블로 만들어 한번의 검색으로 여러 컬럼의 정보를 확인할 때 사용함.
select * from emp;  -- 14
select * from dept; -- 4
select * from emp, dept;

--select 컬럼명 , .....
--    from 테이블이름 별칭 [Inner] join  테이블이름 별칭
--    on  별칭.컬럼명 = 별칭.컬럼명

select ename, job, sal, emp.deptno, dname  -- 테이블명.필드명   예)dept.deptno
    from emp, dept
    where emp.deptno = dept.deptno;  -- inner join

select ename, job, sal, e.deptno, dname  -- 테이블명.필드명   예)dept.deptno
    from emp e join dept d
    on e.deptno = d.deptno;  -- inner join : 양쪽 테이블에서 일치하는것 출력
    
select ename, job, sal, e.deptno, dname  
--     from dept d left outer join emp e
    from emp e left outer join dept d  -- left outer join : 왼쪽에 있는 데이터 모두, 오른쪽 일치하는 데이터만,..
    on d.deptno = e.deptno; 
--    on e.deptno = d.deptno; 

select ename, job, sal, e.deptno, dname  
--     from dept d right outer join emp e
    from emp e right outer join dept d  -- right outer join : 오른쪽에 있는 데이터 모두, 왼쪽 일치하는 데이터만,..
    on d.deptno = e.deptno; 
--    on e.deptno = d.deptno; 

desc dept;
insert into dept(deptno, loc) values(50, 'SEOUL');
select * from dept;

--문제] professor / student table 이용
--inner join
--outer join  - left / right

select * from professor;
select * from student;

--교수이름, 직위, 학과코드, 교수코드, 학생이름, 학번, 학년 주전공학과
select p.name "교수이름", p.position "직위",p.deptno "학과코드", p.profno "교수코드", 
                s.name "학생이름", s.studno "학번", s.grade "학년", s.deptno1 "주전공학과"
    from professor p join student s
    on p.profno = s.profno;
--    on p.deptno = s.deptno1;
--------------------------------------------------------
select p.name "교수이름", p.position "직위",p.deptno "학과코드", p.profno "교수코드", 
                s.name "학생이름", s.studno "학번", s.grade "학년", s.deptno1 "주전공학과"
    from professor p left outer join student s
    on p.profno = s.profno;
--------------------------------------------------------
select p.name "교수이름", p.position "직위",p.deptno "학과코드", p.profno "교수코드", 
                s.name "학생이름", s.studno "학번", s.grade "학년", s.deptno1 "주전공학과"
    from professor p right outer join student s
    on p.profno = s.profno;

--여러개의 테이블 조인
--select 컬럼명 , .....
--    from 테이블이름 별칭 [Inner] join  테이블이름 별칭
--    on 별칭.컬럼명 = 별칭.컬럼명 [Inner] join 테이블이름 별칭
--    on 별칭.컬럼명 = 별칭.컬럼명 ...

select * from department;

select p.profno, p.name, 
         s.studno, s.name, s.grade, d.dname  --, p.deptno
    from professor p  join  student s
    on  p.profno = s.profno    join  department  d
    on  s.deptno1 = d.deptno ;

select p.profno, p.name, 
         s.studno, s.name, s.grade, d.dname  --, p.deptno
    from professor p left join  student s
    on  p.profno = s.profno  right  join  department  d
    on  s.deptno1 = d.deptno ;

-- 사원이름, 부서이름, 직책, 매니저번호 출력 emp/dept 테이블 이용
select * from emp;
select * from dept;
--select * from salgrade;
select ename 사원이름, d.dname  부서이름, job 직책, mgr 매니저번호
    from emp e join dept d
    on e.deptno = d.deptno;

-- self   join
select  e.empno,  e.ename, e.job, em.mgr, em.ename
    from emp e join emp em
    on e.mgr = em.empno;








