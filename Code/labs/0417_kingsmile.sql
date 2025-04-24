-- 함수 -------------------------------
-- ① 집계(그룹)함수
select * from gift;
select sum(g_start), sum(g_end) from gift;
select sum(g_start) "최저가합계", sum(g_end)"상품 최고가의 총합" from gift;
select count(*) from gift;
select count(gname) from gift;

select sum(g_start), avg(g_start), max(g_start), min(g_start), avg(g_end) from gift; -- 평균(null값은 제외하고 나눔)

select * from professor;
select sum(bonus), avg(bonus), max(bonus), min(bonus), avg(pay) from professor;
select count(*) from professor; -- count(*) : null 포함 
select count(hpage) from professor; -- count(필드명) : null 미포함
select count(bonus) from professor;

/*
rank(expr) whithin group(order by 컬럼명 asc | desc )
    => 전체 값을 대상으로 각 값의 순위를 구함.
    ex) --급여가 3000의 등수 구하기
    SELECT RANK(3000) within GROUP(ORDER BY sal desc)  FROM EMP;
*/
select * from gift;
-- Oracle은 null 값이 우선순위 높음.  MySQL은 null 값이 우선순위 낮음
select rank(600000) within group(order by g_end desc)
    from gift
--    where g_end is not null; -- null 값을 제외한다.
    where g_end is not null or g_end = ' ' ;
    
desc gift;
insert into gift(gname, g_start) values('사탕세트', 1000);
insert into gift(gname, gno) values('사탕세트2', 12 );
insert into gift(gno, gname, g_start) values(99, '999', 9);
update gift set gname = ' ' where gname='사탕세트2';

select height, weight from student;
--문제] 키가 168인 사람은 몇 번째로 큰지 확인?
select rank(168) within group(order by height desc)
    from student;
    
--문제] 몸무게가 58인 사람은 몇번째인지 등수 구하기
select rank(58) within group(order by weight desc)
    from student;
    
--문제] g_end가 200000, 600000 보다 작은 값 출력 ( any 이용 ) 
select * from gift where g_end < 600000;
select * from gift where g_end < any( 200000, 600000 );

-- 집계함수 사용시 Group by : 소계(부분합)
select * from student;
select grade, sum(height), avg(height), max(height), min(weight)
    from student
    group by grade; -- 그룹(집합) 함수는 일반필드와 같이 쓸 수 없다.
    
-- emp_type별로 pay 합, 평균, 최고급여, 최하급여 구하기 ( emp2 )
select emp_type, sum(pay), avg(pay), max(pay), min(pay) 
    from emp2
    group by emp_type;

-- 조건 : where, having 절 이용한다.
select grade, sum(height), avg(height), max(height), min(weight)
    from student
    group by grade
    having avg(height) > 172;
    
select emp_type, sum(pay), avg(pay), max(pay), min(pay) 
    from emp2
    group by emp_type
    having avg(pay) >= 30000000;
    
-- ② 숫자함수 --------------------------------------
select round(12.3456789, 0), round(12.7456789, 0), round(12.3456789, 2), round(12.3426789, 2) from dual;
select ceil(12.34), ceil(-12.34) from dual; -- 올림 한 후 정수 반환
select floor(12.34), floor(-12.34) from dual; -- 내림 한 후 정수 반환

select ceil(12.34), ceil(-12.34), floor(12.34), floor(-12.34) from dual; 
select trunc(12.3456789, 2), trunc(12.5456789, 2), trunc(12.5456789, 0) from dual; -- 반올림 안되고 버림

select * from dept2;
select * from dept2, emp2;

--교수테이블에서 월급에 인상률 2%를 한 결과를 출력하시요. (소숫점 0으로 처리)
select name, pay from professor;
select name, pay, pay + pay *0.2, sum(pay), sum(pay + pay *0.2)
    from professor
    group by name, pay;
    
update professor set pay = pay + pay * 0.2;
rollback;
    
--교수테이블에서 모든 교수들에게 보너스를 1000원씩 추가 지급하기 (널처리 할것)
select name, bonus from professor;
select bonus, nvl(bonus, 0) + 1000 from professor;

update professor set bonus = nvl(bonus, 0) + 1000 ;
rollback;

-- ③ 문자열 함수 --------------------------------------------
select * from professor;
select upper('abcd'), lower('ABC') from dual;
select id, upper(id), lower(id) from professor;
select id, initcap(id), length(id), length('abcd') from professor;

select * from dept2;
select dname, length(dname), lengthb(dname) from dept2;
select length('사장실') from dual; -- 한글도 한글 1바이트
select lengthb('사장실') from dual; -- 9바이트 (오라클에서 한글 한글자는 3바이트로 저장된다)

select * from gogak;
select jumin, substr(jumin, 7, 1) from gogak;
select instr('abcd', 'b') from dual; -- index number : start 1 ~
select id, instr(id, 'b') from professor;
select instr('abcdefwkrjwbwrjiwb', 'b', -1) from dual; --  -1이면 뒤에서부터 찾는다
--select instr('abcdefwkrjwbwrjiwb', 'b', -3) from dual;  -- 뒤의 음수값 -1이외는 의미 없음
--select instr('abcdefwkrjwbwrjiwb', 'b', -15) from dual; 

select lpad('abcd', 20, '#') from dual;
select rpad('abcd', 20, '@') from dual;
select rpad('한글', 10, '&') from dual; --

select rpad(length('한글'), 10, '&') from dual; 
select rpad(lengthb('한글'), 10, '&') from dual; 

select dname, length(dname), lengthb(dname) from dept2;
select dname, substr(dname, 3) from dept2;
select dname, substr(dname, 2, 3) from dept2; -- substr(문자열, 시작위치, 뽑을갯수);

select rpad(dname, 10, substr('1234567890', length(dname)+1) ) "RPAD 연습" from dept2;
select ltrim('  abcde fg  ') from dual;
select rtrim('  abcde fg  ') from dual;

select length('    abcde fg  '), length(ltrim('    abcde fg  ')) from dual;
select length('    abcde fg    '), length(rtrim('    abcde fg    ')) from dual;

select concat(name, position) || '님'
    from professor;
--    where deptno=101;

select name || position || '씨'
    from professor;

-- C:\MSA_th2\2_Oracle\문서자료\Oracle SQL_PLSQL_PPT
-- ppt 2장, 3장 실습





