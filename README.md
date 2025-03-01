# sbb7_todo
To develop TODO application:
---------------------------------
1) create tables in MySQL/Oracle Database
for MySQL:
-------------
create table register (
	regid integer,    fname varchar(20),    lname varchar(20),
    email varchar(20),    pass varchar(20),    mobile bigint,    address varchar(50),
    constraint register_regid_pk primary key(regid)
);

create table tasks (
	taskid integer,    taskname varchar(50),    taskdate varchar(10),   taskstatus integer check (taskstatus in (1,2,3)),    regid integer,
    constraint tasks_regid_fk foreign key(regid) references register(regid), constraint tasks_cpk primary key(regid, taskid)
);

create table taskid_pks (
	regid integer,  taskid integer,  constraint taskid_pks_regid_fk foreign key(regid) references register(regid));

for oracle:
-----------
create table register (
	regid number,    fname varchar2(20),    lname varchar2(20),
    email varchar2(20),    pass varchar2(20),    mobile number,    address varchar2(50),
    constraint register_regid_pk primary key(regid)
);

create table tasks (
	taskid number,    taskname varchar2(50),    taskdate varchar2(10),   taskstatus number check (taskstatus in (1,2,3)),    regid number,
    constraint tasks_regid_fk foreign key(regid) references register(regid), constraint tasks_cpk primary key(regid, taskid)
);

create table taskid_pks (
	regid number,  taskid number,  constraint taskid_pks_regid_fk foreign key(regid) references register(regid));

