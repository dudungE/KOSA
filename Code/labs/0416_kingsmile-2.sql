--DML
--select distinct | * | 컬럼명 as 별칭, 컬럼명 별칭,....
--  from 테이블이름
--  [where 조건식 ]
--  [order by 컬럼명 desc | asc , ..  ]
select * from emp2;
select name, empno, emp_type  from emp2;
select name, empno --, emp_type  
    from emp2
    where emp_type='정규직';
    
select name, empno --, emp_type  
    from emp2
    where emp_type='정규직'
    order by name desc ;  -- asc : 생략가능
    
desc emp2;
select name, empno, deptno --, emp_type  
    from emp2
    --where emp_type='정규직'
    order by name desc , deptno asc  ; 
    
select name, empno, deptno --, emp_type  
    from emp2
    order by 1 desc , 3   ; 

select *  
    from emp2
    order by 2 desc , 4 asc  ; 
    
select DISTINCT emp_type  -- 중복 제거 상태로 출력
    from emp2;
    
select DISTINCT deptno
    from emp2;

select DISTINCT deptno
    from emp2
    where emp_type='정규직';
    
select name, empno, deptno, emp_type, position
    from emp2
    where position='부장';
    
select distinct position from emp2 where position is not null;
    
select name as "성  명", empno 사원번호, deptno "부  서", emp_type as 근무타입, position "직  급"
    from emp2
    where position='부장';
    
select name as "성  명", empno 사원번호, deptno "부  서", emp_type as 근무타입, position "직  급"
    from emp2
    where position='과장' and name='유관순';

select name as "성  명", empno 사원번호, deptno "부  서", emp_type as 근무타입, position "직  급"
    from emp2
--    where position='부장' or name='유관순';
    where position=부장 or name='유관순';
    
-- delete/update 하기 전에 반드시 select부터 해본다.
desc emp2;
select * 
    from emp2
    where deptno=1000;

-- 문제1] emp_type이 수습직, 계약직 직원만 검색
SELECT * FROM emp2 where emp_type = '수습직' or emp_type = '계약직';
select * from emp2 where emp_type in ('수습직', '계약직');

-- 문제2] 취미가 등산이거나 골프인 사람
SELECT * FROM emp2 where hobby = '등산' or hobby = '골프';
SELECT * FROM emp2 where hobby in('등산', '골프');

-- 문제3] 직책(position)이 null인 사람
SELECT * FROM emp2 where position is null;
SELECT * FROM emp2 where position is not null;
SELECT * FROM emp2 where position = null; -- 

--문제4] 사번, 이름, 취미, 월급 필드만 보여주시고, 별칭 이름으로 적용해서 검색하기
select empno as "사번", name as "이름", hobby as "취미", pay as "월급" 
    from emp2;
    
--  연산자 -------------------------------------
select mod(7, 3) from dual;
select mod(7, 3) 나머지구하기 from dual;
select 7/3 from dual;  --몫

select * from professor;
select name, bonus, position  from professor;

select name, bonus, position  
    from professor
    where bonus is not null;  -- is null

-- null 연산은 무조건 null
select name, pay,bonus from professor;
select name, pay, nvl(bonus, 0) from professor;

update professor set bonus = bonus+100 ;
update professor set bonus = nvl(bonus, 0)  + 100 ;
ROLLBACK;

select name, bonus+100, position  from professor;  -- null에 연산은 무조건 null  
select name, bonus, nvl(bonus, 0)+100, position  
        from professor;  -- bonus+100    
--        where bonus is null;

select * from professor;    
select *
    from professor
--    where position='정교수' or position='조교수';
    where position in('정교수', '조교수');  -- 권장
    
select * 
    from student
    where grade in(3,2,1); -- where grade=3 or grade=2 or grade=1;

select * 
    from student
    where grade not in(3,2,1); -- not in(value1, value2,...)
    
select *
    from professor
    where deptno between 103 and 201;
--    where deptno between 201 and 103;  -- Between 작은값 and 큰값
select * from gift where gno between 6 and 9;  -- 앞 < 뒤
select * from gift where gno between 9 and 6;  -- 안됨
select * from gift where g_end between 600000 and 800000;

select *
    from emp2
    where name like '김%';  -- % : 모든,  _ : 한글자
    
select *
    from emp2
    where name like '%나'; 
    
select *
    from emp2
    where name like '%윤%'; 
    
select *
    from professor
    where name like '__'; 

select *
    from professor
--    where name like '허_';     
--     where name like '_은';       
    where name like '__';       
    
select *
    from professor    
--    where name like '나__';    -- '나_%';  
    where name like '%원_';
    
-- 숫자 --
select *
    from professor  
--    where pay > 500;
--    where pay <= 300;
--    where pay >= 250 and pay < 500;    
    where pay >= 250 or pay < 500; 
    
/*
> ANY : 최소값 보다 크면
 필드명(pay) >= ANY : 최소값보다 크거나 같으면   any( 300, 550, 400 )
  < ANY : 최대값보다 작으면
  <= ANY : 최대값보다 작거나 같으면
   = ANY : IN과 같은 효과
  != ANY : NOT IN과 같은 효과
*/    
select * from professor where pay >= any( 300, 550, 400 );    
select * from student where weight > any(70, 80);
select * from student where weight < any(60, 70);

/*
ANY와는 반대되는 개념입니다.

  필드명(pay) > ALL : 최대값 보다 크면  all( 300, 550, 400 )
>= ALL : 최대값보다 크거나 같으면
< ALL : 최소값보다 작으면
<= ALL : 최소값보다 작거나 같으면
= ALL : SUBSELECT의 결과가 1건이면 상관없지만 여러 건이면 오류가 발생합니다.
!= ALL : 위와 마찬가지로 SUBSELECT의 결과가 여러 건이면 오류가 발생합니다
*/
select * from professor where pay >= all( 300, 550, 400 );    
select * from student where weight > all(70, 80);
select * from student where weight < all(60, 70);
    
    
--------------------------------------------

--문제1] 급여가 500이상이고, 보너스가 60이상 받는 교수는? (professor table)
select * from professor
    where pay >= 500 and bonus >=60;

--문제2] 이름이 '나한라'을 '너한라'으로 변경 (emp2)
select * from emp2 where name='너한라';
update emp2 set name = '너한라' where name = '나한라';

--문제3] 취미가 등산인 사람들만 찾아서 '수영'으로 변경
select * from emp2 where hobby ='등산';
update emp2 set hobby ='수영' where hobby ='등산';
select * from emp2 where hobby ='수영';

--문제4] 계약직 직원 찾아서 삭제하기
select * from emp2 where emp_type = '계약직';
delete from emp2 where emp_type = '계약직'; 

--문제5] pay(or bonus)가 50이상인 사람만 출력 (professor )
select * from professor
--    where pay >= 50 ; --or bonus >= 50;
    where  bonus >= 50 and bonus is not null
    order by bonus desc;
    
select * from professor order by bonus desc; -- oracle은 null 값 높은 순위 

--문제6] ~세트가 아닌 상품들만 출력 ( gift table)
select * from gift;
select * from gift
    where gname not like '%세트';

--문제7] gno가 10인 상품의 이름을 널처리(null) 하세요.
select * from gift where gno = 10;
update gift set gname = null where gno = 10;

--문제8] gname 이름이 없고, g_start가 999인 값을 갖는 데이터 입력하세요.
insert into gift (gno, g_start) values (11, 999);
insert into gift (gname, g_start) values (' ', 999);

--문제9] gname이 null이거나 ' ' 인 데이터를 제외하고 출력하시오.
select * from gift where gname is null or gname=' ';
select * from gift where gname is not null and gname != ' ';  -- != 
select * from gift where gname not in('null', ' ') order by gno desc;
    
--delete from gift where g_start=999;


--정규직 이면서 '백원만' 찾기
select * from emp2 
    where emp_type = '정규직' and name = '백원만';

--정규직 이거나 '유도봉' 찾기
select * from emp2
    where emp_type = '정규직' or name = '유도봉';

--수습직 이거나 김씨성을 가진 사람 찾기
select * from emp2 
    where emp_type = '수습직' or name like '김%';

--김씨가 아닌 수습직원 찾기
select * from emp2
    where name not like '김%' and emp_type = '수습직';
    
--문제1] 이름에서 '김주현' 사람들을 보여주세요.
--문제2] 이름에서 '김'씨 성을 가진 사람들을 보여주세요.  - 모든 : % , 한글자 : _    
--문제3] 이름이 두 글자인 사람 보여주세요.
--문제4] id에 s or a 글자가 들어가는 사람 찾기
--문제5] 전임강사 찾아주세요
--문제6] 학년이 3학년(grade)이고 키(height)가 165이상인 학과코드(deptno1)가 201인 학생 찾기  
select * 
    from student
    where grade=3 and height >= 165 and deptno1=201 ;
    
--문제7] 생일이 77년 이전인 학생들 찾기 -- 이전이면 선배들임, 이후 라고 되어 있으면 후배들임
select * from student;
desc student;
SELECT *
    FROM student
    WHERE birthday < TO_DATE('1977-01-01', 'YYYY-MM-DD');
-----------------------------------    
SELECT *
    FROM student
    WHERE to_date(birthday, 'YY/MM/DD') < TO_DATE('77-01-01', 'YY-MM-DD');
-------------------------------------
SELECT *
    FROM student
    WHERE extract(year from birthday) < 1977; -- EXTRACT(YEAR FROM 날짜필드) 연도만 뽑는 함수
------------------------------------    
select * 
    from student
    where substr(birthday, 0, 2) < 77;
-----------------------------------------------
select * from student
    where birthday < '1977-01-01';

--문제8] 부전공(deptno2)을 가진 학생들만 찾기
--문제9] 담당교수(profno)가 1000 ~ 2001 번 사이 학생들 찾기 




