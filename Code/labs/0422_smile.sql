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






