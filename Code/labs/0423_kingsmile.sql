-- PL/SQL ( Procedural Language ) --------------------------------------------
-- 참고 : https://iii.ad/20d4d8
/*형식>
Declare 
    선언(선택)
Begin
    실행(필수)
End;
*/

Begin
    dbms_output.put_line('이도연');  -- 출력
end;
--------------------------------------
--create table test ( id number, name varchar2(20) default 'noName' )

declare 
    name varchar2(10) := '김연아';
Begin
    dbms_output.put_line('이름은 ' || name);  -- 화면출력
end;
--------------------------------------------------
desc emp;  -- VARCHAR2(10) 
-- 테이블이름.필드명%TYPE  => 필드명과 같은 타입 선언
--ex) DECLARE NAME emp.ename%TYPE ;   -- Declare name VARCHAR2(10);
--------------------------------------------
declare 
    e_name emp.ename%type;
    e_sal emp.sal%type;
Begin
    select sal, ename into e_sal, e_name from emp where empno='7788';
    dbms_output.put_line('778님의 이름은 ' || e_name || ' 급여는 ' || e_sal);  -- 화면출력
end;
------------------------------------
select sal, ename from emp;
/*
IF 조건식 THEN 실행문장;
ELSIF 조건식 THEN 실행문장;
ELSIF 조건식 THEN 실행문장;
....
ELSE 실행문장;
END IF;
*/

declare 
    num1 number := 3;
    num2 number :=5;
Begin
    if num1 >= num2 then
        dbms_output.put_line(num1 || '이 큽니다');  
    else dbms_output.put_line(num2 || '이 큽니다');  
    end if;     
end;
---------------------------------------------------
create or replace procedure p_sa
is
    v_salary number := 0;
    v_dept_id number := 0;
begin
    v_dept_id := round(dbms_random.value(10, 40), -1);
    dbms_output.put_line('v_dept_id = '|| v_dept_id );
    
    select sal into v_salary from emp where deptno = v_dept_id and rownum = 1;
    dbms_output.put_line( v_salary );
    
    if v_salary between 1 and 3000 then
       dbms_output.put_line('보수 적음' );
    elsif v_salary between 3001 and 6000 then
        dbms_output.put_line('시세에 맞춰줌' );
     elsif v_salary between 6001 and 9000 then
        dbms_output.put_line('보수 좋음' );
    else
         dbms_output.put_line('완전 좋음' );
    end if;
end;
---------------------------------------------------
DECLARE
  n_sales NUMBER ; --:= 300000;
  n_commission NUMBER( 10, 2 ) := 0;
BEGIN
    n_sales := &n_sales;  -- 입력받기
    
  IF n_sales > 200000 THEN
    n_commission := n_sales * 0.1;
  ELSIF n_sales <= 200000 AND n_sales > 100000 THEN 
    n_commission := n_sales * 0.05;
  ELSIF n_sales <= 100000 AND n_sales > 50000 THEN 
    n_commission := n_sales * 0.03;
  ELSE
    n_commission := n_sales * 0.02;
  END IF;
  
   DBMS_OUTPUT.PUT_LINE(n_sales || ',  '|| n_commission );
END;
--------------------------------------------------------------
begin
    DBMS_OUTPUT.PUT_LINE('SQLD 시험 잘보세요.;' );
    DBMS_OUTPUT.PUT_LINE('이휘');
    DBMS_OUTPUT.PUT_LINE('333' );
end;
-----------------------------------------
/*
FOR 변수이름 IN 시작 .. 끝 loop
    실행문장;
END LOOP;
*/
--사용자 입력(단수)를 받아서 구구단 출력-------------------------------------
declare
    dan number(1) := &inputDan;
begin
    for i in 1..9 loop
        DBMS_OUTPUT.PUT_LINE(dan ||'*'||i||'='|| i*dan );
    end loop;
end;
---------------------------------------------------
/*
CREATE PROCEDURE 프로시져이름
IS
    [
        변수이름 데이터타입; --프로시져내에서 사용할 변수선언
        변수이름 데이터타입;
        ....
    ]
BEGIN
    기능 구현;
END;
----------------------------------
실행형식>
execute 프로시저명;
exec 프로시저명(값, 값,...);
*/
------------------------------------
--create procedure p_msg
create or replace procedure p_msg
is
begin
    dbms_output.put_line('오늘 뭐 먹지?');
end;

execute p_msg;
-----------------------------------------------
create or replace procedure p_msg (name in varchar2)
is
begin
    dbms_output.put_line(name ||'아(야) 오늘 뭐 먹지?');
end;

execute p_msg('도연');
exec p_msg('김연아');
exec p_msg('이순신');
---------------------------------------------
create or replace procedure p_test   -- 프로시저 생성
(
    name in varchar2,
    su in number
)
is
begin
    dbms_output.put_line(name ||'님의 점수는 : ' || su);
end;

exec p_test('김연아', 99);
exec p_test('park', 72);
-----------------------------------------------------------------------
select * from userlist;
create table userlist (
    id varchar2(10),
    name varchar2(20),
    age number,
    addr varchar2(50)
);
desc userlist;

create or replace procedure p_userlist (
    id in userlist.id%type := 'kingsmile',
    name in userlist.name%type default '도연이',
    age in userlist.age%type := 10,
    addr in userlist.addr%type := null
)
is
begin
    insert into userlist values(id, name, age, addr);
    dbms_output.put_line('insert 정보는 : ' ||id||' ' ||name||' '|| age ||' ' || addr );
end;

exec p_userlist('yuna', '김연아', 30, '군포'); -- 전체필드
exec p_userlist;  -- default value input
exec p_userlist( name=>'박보검', age=>33 ); -- 원하는 필드값만 추가 가능
exec p_userlist( id=>'gildong2', addr=>'busan', age=> 22); 
------------------------------------------
select * from userlist;
----------------------------------------------------------
select sal,rownum from emp where rownum = 1;

select *
    from (select * from emp order by sal desc) -- 인라인뷰
    where rownum = 1;
    
--cf)
-- select top 1 sal from emp;  -- mySQL에서는 가능함
----------------------------------------------------------
select d.* -- e.*
    from emp e, dept d;

--------------------------------------------
create or replace procedure p_empMaxSal   -- 문제원인???
(
     p_empno out emp.empno%type,
     p_ename out emp.ename%type,
     p_sal  out  emp.sal%type
)
is
    begin
        select p_empno, p_ename, p_sal
            from (select * from emp order by sal desc) 
            where rownum <= 5;
    end;
       
-------------------------------------------------
create or replace procedure p_empMaxSal
(
     p_empno  emp.empno%type,
     p_ename  emp.ename%type,
     p_sal    emp.sal%type,
     p_laststatementbalance out float
)
is
    begin
        select empno, ename, sal, p_laststatementbalance
            from (select * from emp order by sal desc) 
            where rownum <= 5;
    end;
    
exec p_empMaxSal;
-----------------------------------------------------
drop procedure p_empMaxSal;

create or replace procedure p_empMaxSal
is
    p_emprow  emp%rowtype;
    begin
        for i in 1..5 loop
            select * into p_emprow from
                ( select *
                    from (select * from emp order by sal desc)
                    where rownum <= i ) where rownum <= 5;
            dbms_output.put_line(p_emprow.empno ||' '||p_emprow.ename||' '||p_emprow.sal);
        end loop;
    end;
    
exec p_empMaxSal;
--------------------------------------------------------------
--create or replace procedure p_empMaxSal
create or replace procedure emp_top3
is
    p_emprow  emp%rowtype;
    begin
        for i in 1..3 loop
            select * into p_emprow from
                ( select *
                    from (select * from emp order by sal desc)
                    where rownum <= i order by sal, ename ) where rownum =1 order by sal asc;
                    
            dbms_output.put_line(p_emprow.empno ||' '||p_emprow.ename||' '||p_emprow.sal);
        end loop;
    end;
    
exec emp_top3;
------------------------------------------
select * from emp;

/*
 LOOP END 문
LOOP
    실행문장;
    증감식;
    EXIT [ WHEN 조건식] ; --조건식이 만족할 때 loop을 빠져나간다.
END loop;
*/

DECLARE I INT := 1;
    BEGIN
        LOOP
            DBMS_OUTPUT.PUT_Line(I);
            I := I+1;
        EXIT WHEN (I > 10);
        END LOOP;
    END;
    
--while loop
  DECLARE i INT :=1;

  BEGIN
     WHILE (i<=10) loop
         DBMS_OUTPUT.put_line(i);
         i:= i+1;
     END LOOP;
  END;
------------------------------
-- 1~10사이의 짝수 출력
Begin
  for i in 1..10 loop
     --dbms_output.put_line( mod(i, 2) );
     if( mod( i, 2 ) = 0 ) then DBMS_OUTPUT.put_line(i);
     end if;
  end loop;
End;
-------------------------------------
-- 2단 출력하기
-- BASIC LOOP로 구구단(2단 출력하기)
DECLARE   -- 선언(선택)
    dan NUMBER :=2;
    i NUMBER :=1;
BEGIN  -- 필수 
    loop
    dbms_output.put_line(dan || '*' ||i|| '=' || (dan*i));
    -- 2 * i = 2
    i:=i+1;
    IF i > 9 THEN exit;  
    END IF;
  END loop;
END;  -- 필수
-------------------------------------------------------------------
-- FOR LOOP로 구구단(2단) 출력하기
DECLARE
    dan NUMBER := 2;
    i NUMBER :=1;
BEGIN
    FOR i IN 1..9 loop
      dbms_output.put_line(dan||'*'||i||'='||(dan*i));
    END loop;
END;
---------------------------------------------------------------------
-- WHILE LOOP로 구구단 (2단) 출력하기
DECLARE 
    dan NUMBER := 2;
    i NUMBER :=1;
BEGIN
    While i <= 9 loop
       dbms_output.put_line(dan||'*'||i||'='||(dan*i));
       i:=i+1;
    END loop;
END;
--------------------------------------------------------
-- 사용자 입력(단수)를 받아 구구단 출력
-- &는 사용자입력값을 받을때 상요하는 키워드 . &공간이름
DECLARE vdan NUMBER(1) :=&dan;
    BEGIN
        FOR i IN 1.. 9 loop
            DBMS_output.put_line(vdan || ' * ' || i ||'='|| (vdan * i) );
        END LOOP;
     END;
-----------------------------------------------------------
--구구단 전체 출력 ( 2중 반복문 )
    BEGIN
        FOR i IN 1 .. 9 LOOP
            FOR j IN 2 .. 9 LOOP
                dbms_output.put( j || ' * ' || i ||'='|| ( i * j ) ||'    ');
            END LOOP;
                dbms_output.put_line(' ');
        END LOOP;
    END;
------------------------------------------------
create or replace procedure p_wantDan( p_dan in number )
is
begin
    for i in 1..9 loop
        dbms_output.put_line(p_dan || '*'||i||'='|| i*p_dan);
    end loop;
end;

exec p_wantDan(&p_dan); -- 실행부터 입력 받으면서~
exec p_wantDan(7);
------------------------------------------
create or replace procedure p_outTest (
    name out varchar2, 
    age out varchar2
)
is
begin
    name := '이나영';
    age := 33;
    dbms_output.put_line('out을 이용한 프로시저 완료');
end;
--------------------------------------------------
variable v_name varchar2(20);
variable v_age varchar2(3);

exec p_outTest(:v_name, :v_age);
print v_name;
print v_age;
-----------------------------------------------------------
create or replace procedure p_out( x in out number )
as
begin
    dbms_output.put_line( 'x = ' || x );
    x := &x;
end;
------------------------------------------------
VARIABLE x number(25);
exec p_out(:&x);
print x;

exec p_out(:x);

VARIABLE y varchar2(25);
exec p_out(:y);
print y;
-------------------------------------------
create or replace procedure p_out
(
    x in out number   -- in : 호출시 값을 전달 받음, out : 프로시저 실행 후 값을 다시 돌려준다
)
is
begin
    dbms_output.put_line('x = ' || x);  -- x 값 출력
    x := &new_val; -- x 변수에 값 할당함(입력 받는 변수 사용)
end;

variable x varchar2(25);
exec :x := 10;
exec p_out(:x);

---------------------------
VARIABLE x number(25);
exec p_out(:&x);
exec p_out(:x);
--print x;

-- 프로시져 cusor 활용 -------------------------------
select * from emp where job ='SALESMAN';

create or replace PROCEDURE  p_job_emp( e_job  in  emp.job%type )
is
    name  emp.ename%type;
begin
    select  ename into  name from emp where job = e_job;
    dbms_output.put_line( name || '님 담당업무는 ' || e_job );
end;
---------------------------------------------
exec p_job_emp('MANAGER');
exec p_job_emp('PRESIDENT'); -- 1명
exec p_job_emp('CLERK');  -- 1명 이상의 데이터가 있을 경우 에러 발생

select * from emp where job ='SALESMAN';
drop procedure p_job_emp;

---------------------------------------------
create or replace PROCEDURE  p_job_emp( v_job  in  emp.job%type )
is
    name  emp.ename%type;
    empno emp.empno%type;
    sal  emp.sal%type;
--    cursor c_name is select empno, ename, sal from emp where job=upper(v_job) or job=lower(v_job);
    cursor c_name is select empno, ename, sal from emp where job in( upper(v_job), lower(v_job) );  --1.커서선언  
begin
    open c_name;  -- 2.커서열기
    dbms_output.put_line('----------------------------');
    loop
        fetch c_name into empno, name, sal ; -- 3. 커서로부터 데이터 읽기
        exit when c_name%notfound;  -- 찾을 데이터가 없으면 반복문 탈출한다.
        dbms_output.put_line( name||' '||empno||' '||sal||' ' || v_job );
    end loop;
    dbms_output.put_line('result recode count ===> ' || c_name%rowcount );
--    dbms_output.put_line( c_name%isopen );
    close c_name;  -- 4.커서닫기
--    dbms_output.put_line( c_name%isopen );
end;
--------------------------------------------
exec p_job_emp('MANAGER');
exec p_job_emp('PRESIDENT'); 
exec p_job_emp('CLERK');

exec p_job_emp('manager'); -- 레코드 대소문자 구분함
exec p_job_emp(upper('manager'));
exec p_job_emp(lower('analyst'));
--------------------------------------------------
-- 학생 테이블에서 키가 제일 큰 순서로 3명 출력하는 프로시저 만들기
select max(height) from student;
select * from student order by height desc;

create or replace procedure p_stdMaxHeight
is
    v_stdrow    student%rowtype;
    begin
        for i in 1..3 loop
            select * into v_stdrow 
            from ( select * 
                    from (select * from student order by height desc )
                     where rownum <= i  order by height, name desc ) where rownum = 1 order by height desc; 
--             DBMS_OUTPUT.PUT_LINE(v_stdrow.studno||' '||v_stdrow.name||' '||v_stdrow.height);   
                DBMS_OUTPUT.PUT_LINE(v_stdrow.name||' '||v_stdrow.height);  
        end loop;
    end;
    
exec p_stdMaxHeight;

노정호 184
박동호 182
일지매 182


create view v_join
as
    select p.profno, p.name 교수이름,
           studno, s.name 학생이름, grade, dname 학과명 --, p.deptno
        from professor p join student s
        on p.profno = s.profno join department d
        on s.deptno1 = d.deptno;

select * from v_join;

-- 조인으로 되어 있는 구문은 뷰로 새로 만들어서 저장 프로시저로 생성함. (조인, 프로시저, 커서 이용함)
create or replace procedure p_join
is
    hapName v_join%rowtype;
    cursor cur_name is select * from v_join;   -- 1.커서 선언
begin
    open cur_name;  -- 2. 커서 열기
    loop
        fetch cur_name into hapName;  -- 3. 커서로부터 데이터 읽기
        exit when cur_name%notfound;  -- 찾을 데이터가 없다면,...반복문 탈출
--        dbms_output.put_line(hapName.name||', '||hapName.name||', '||hapName.dname );
        dbms_output.put_line(hapName.교수이름||', '||hapName.학생이름||', '||hapName.학과명 );
    end loop;
    close cur_name;  -- 4. 커서 닫기 
end;

exec p_join;
-----------------------------------------
desc v_join;






