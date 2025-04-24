-- rownum : 검색할때 자동 행 번호 추가 / rowid ------------------------------
select rownum, ename, job, rowid from emp;

delete from emp where rownum=8; -- rownum은 select에만 적용, 삭제/수정에는 사용 안됨

--dual : 테이블
--rownum : 번호 부여 - 오라클 데이터베이스 이용한 게시판 만들 경우 페이징처리에 사용. cf) 1 limit 7 : MySQL
--rowid :
select rownum, ename, job from emp;
select rownum, ename, job from emp where sal > 3000;

select rownum, ename, sal
    from ( select * from emp order by sal desc ); 

-- Sequence : 자동 증가 번호 ----------------------------------------------
/*
create sequence 시퀀스이름 -- 1부터 시작, 1씩 증가
    [start with 시작값 ]
    [increment by 증가치 ]
    [maxvalue 최대값 ]
    [minvalue 최소값 ]
    [cycle | nocycle ]
    [cache |  nocache ]
*/

drop SEQUENCE autonum;
create sequence autonum;

select autonum.nextval from dual;  -- 시퀀스값 증가
select autonum.currval from dual;  -- 현재 시퀀스값 가져오기

create table kosa_T (
    no number,
    name varchar2(20)
);

insert into kosa_T values(autonum.nextval, 'aa');
insert into kosa_T values(autonum.nextval, 'bb');
insert into kosa_T values(autonum.nextval, 'cc');
insert into kosa_T values(autonum.nextval, 'dd');

select * from kosa_t;

create sequence seq_kosa;

create table kosa (
    num number,
    id varchar2(20),
    name varchar2(20)
);

insert into kosa values(seq_kosa.nextval, 'dd', 'name');
insert into kosa values(seq_kosa.nextval, 'ff', 'name');
insert into kosa values(seq_kosa.nextval, 'gg', 'name');

select * from kosa;

drop sequence seq_kosa;

create sequence seq_kosa
    increment by 100;
    
--create sequence seq_board
alter sequence seq_board 
--    maxvalue 1000
--    increment by 100
    cycle
    cache 2;
    
create table kosa2 (
    num number,
    id varchar2(20),
    name varchar2(20)
);

insert into kosa2 values(seq_board.nextval, 'dd', 'name');
insert into kosa2 values(seq_board.nextval, 'ff', 'name');
insert into kosa2 values(seq_board.nextval, 'gg', 'name');

select * from kosa2;

create sequence seq_jumin_no
    increment by 10
    start with 10
    maxvalue 150
    minvalue 9
    cycle
    cache 2;

create table jumin_T (
    seq number,
    name varchar2(20),
    phone varchar2(15)
);

insert into jumin_T values(seq_jumin_no.nextval, 'aa', '1111');
insert into jumin_T values(seq_jumin_no.nextval, 'bb', '2222');
insert into jumin_T values(seq_jumin_no.nextval, 'cc', '3333');
insert into jumin_T values(seq_jumin_no.nextval, 'dd', '4444');
insert into jumin_T values(seq_jumin_no.nextval, 'ee', '5555');

select * from jumin_t;

-- 문제] 시퀀스 만들기 - seq_freeboard  임의적으로 만들어서 테스트 테이블에 실행시켜 보세요.

-- Transaction --------------------------------------
/*
- insert ,update ,delete를 수행한 결과를 저장(commit), 취소(rollback) 할 수 있다.
- 특정 영역을 나누어서 저장, 취소를 선택적으로 할 수 있다
    savepoint 이름; =>SQL실행 전에 영역을 분할함.
    rollback to 이름;  => 특정 영역에 해당하는 부분까지 취소됨.
- Commit - 전체저장완료
- rollback - 전체취소
*/

create table c_emp100
as
    select * from emp where 1=2;  --조건에 맞지 않은 상태
    
select * from c_emp100;
-----------------------------------------
begin
    for i in 1..10000 loop
        insert into c_emp100
            select * from emp;
    end loop;
end;
--------------------------------------------------
select * from c_emp100;
rollback;  -- 취소 
commit;  -- 완료

update c_emp100 set sal = 1000;
delete from c_emp100 where deptno=20;
rollback;
--------------------------------------------------
update c_emp100 set sal = 888 where deptno=20;
savepoint update_sal;   -- savepoint  식별자;

update c_emp100 set sal = 99 where deptno=30;
savepoint update_sal_30;

update c_emp100 set sal= 1 where deptno = 30;

select * from c_emp100;
select sum(sal) from c_emp100;  -- 131960000

rollback to savepoint update_sal;   -- rollback to savepoint 식별자;
commit;

select sum(sal) from c_emp100;  -- 225900000

rollback to savepoint update_sal;
rollback to savepoint update_sal_30;

---권한부여 방법 !!! -------------------------------------------------
savepoint create_tt;
create table tt ( id number );
insert into tt values(1);
insert into tt values(2);

insert into tt values(3);
insert into tt values(4);

select * from tt;
rollback to savepoint create_tt;

commit / rollback;  -- DML 명령에만 적용됨
-------------------------------------------------------------
drop table tt;
show user;
select * from kingsmile.emp2;  -- 소유자명.테이블명

select * from smile.tt;

grant select on kingsmile.emp2 to smile;

insert into smile.tt values(7);
commit;
-- smile에게 emp2 테이블의 레코드 삭제/수정 권한주기
grant delete, update on kingsmile.emp2 to smile;

select * from emp2;
revoke all on 계정명.테이블명 from 계정명;

revoke all on kingsmile.emp2 from smile;

delete from smile.tt where id in(1,3,7);
commit;

grant all on 계정명.테이블이름 to  계정명;
grant all on kingsmile.test_t to smile;  -- create 명령어는 권한 전파가 안된다.

-- smile 사용자 (일반) -----------------------------
create table tt ( id number );
insert into tt values(1);
insert into tt values(2);

insert into tt values(3);
insert into tt values(4);
commit;
select * from tt;
select * from kingsmile.emp2;
-- kingsmile 한테 tt table에 insert권한 부여하기
grant insert, select, delete on smile.tt to kingsmile;

update kingsmile.emp2 set position='사원' where name='나사장';
commit;
delete from kingsmile.emp2 where deptno=1001;

-- admin(system) 권한 ---------------------------------
select * from smile.tt;
select * from kingsmile.emp2 where hobby='등산';

drop table emp2;