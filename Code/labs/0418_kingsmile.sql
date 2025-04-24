-- ④ 날짜함수 ------------------------------------------
select sysdate from dual;

select  MONTH_BETWEEN(sysdate, '2018/12/20') from dual;
select NEXT_DAY(DATE '2025-04-18', '화') from dual;
select NEXT_DAY(DATE '2025-04-18', 6) from dual;  -- 일요일 : 1, 월 : 2,.....
select NEXT_DAY(DATE '2025-04-18', 7) from dual; 
select next_day(Date '2025-04-18', '토') from dual; 

select add_months(DATE '2025-04-18', 1) from dual; 
select add_months(DATE '2025-02-01', 3) from dual; 
select add_months(DATE '2025-04-18', 10) from dual; 

select last_day(DATE '2025-04-18') from dual;  -- '년/월/일'  또는 '년-월-일'
select last_day(DATE '1988-02-18') from dual; 
select last_day(DATE '2022-12-18') from dual; 

select to_date('20220102', 'YYYYMMDD') from dual;
--select to_date('abcd', 'YYYYMMDD') from dual;  -- error
SELECT TO_DATE('20050102123456', 'YYYYMMDD HH24MISS') from dual;

SELECT TO_char(sysdate, 'YYYY-MM-DD HH:MI:SS') from dual;
SELECT TO_char(sysdate, 'YY-MM-DD HH:MI') from dual;
SELECT TO_char(sysdate, 'YY-MM-DD') from dual;
SELECT TO_char(sysdate, 'YYYY-MM-DD HH24:MI:SS') from dual;

select '1234'+200, to_number('1234'), to_number('1234') + 100 from dual;

select * from emp2;
desc emp2;

select to_char(2000, '999,999') from dual;
select to_char(23242384723, '999,999,999,999,999') from dual;
--select to_char(23242384723, '###,###,###,999') from dual;  -- error
select  to_char(2000, 'L999,999') from dual;
select  to_char(2000, '$999,999') from dual;

--참고 : http://www.gurubee.net/lecture/1028
select * from dept;

SELECT deptno, DECODE(deptno, 
                              10 , 'ACCOUNTING' ,
                              20 , 'RESEARCH' ,
                              30 , 'SALES', 'OPERATIONS') name
     FROM dept
     order BY DEPtNO;
     
SELECT deptno, dname, DECODE(deptno, 
                              10 , '판교점' ,
                              20 , '혜화점' ,
                              30 , '야탑점', 
                              40 , '서울본사') name
     FROM dept
     order BY DEPtNO;

select * from emp;
SELECT deptno,DECODE(deptno, 
                              10 , sum(sal) ,
                              20 , max(sal) ,
                              30 , min(sal), 
                              40 , avg(sal)) sal
     FROM emp
     group by deptno;

select * from department;
select * from professor;

select deptno, 
        nvl(sum(decode(deptno, 101, pay)), 0) deptno101,
        nvl(sum(decode(deptno, 102, pay)), 0) deptno102,
        nvl(sum(decode(deptno, 103, pay)), 0) deptno103,
        nvl(sum(decode(deptno, 201, pay)), 0) deptno201,
        nvl(sum(decode(deptno, 202, pay)), 0) deptno202,
        nvl(sum(decode(deptno, 203, pay)), 0) deptno203,
        nvl(sum(decode(deptno, 301, pay)), 0) deptno301
  from professor
  group by deptno
  order by deptno;

select ename,sal,
        case
            when sal < 1000 then sal+(sal*0.8)
            when sal between 1000 and 2000 then sal+(sal*0.5)
            when sal between 2001 and 3000 then sal+(sal*0.3)
            else sal+(sal*0.1)
        end "인상된급여"
    from emp;

--문제] pdept에 따라서 지사명을 출력하세요. (dcode, case 이용)
select * from dept2;
desc dept2;

SELECT pdept,
	CASE PDEPT 
		WHEN '1000' THEN AREA
		WHEN '0001' THEN AREA
		WHEN '1003' THEN AREA
		WHEN '1002' THEN AREA
		WHEN '1006' THEN AREA
		WHEN '1007' THEN AREA  
	END 
FROM DEPT2 
where area is not null and pdept is not null;









