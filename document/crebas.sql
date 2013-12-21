/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     2013/12/21 13:35:07                          */
/*==============================================================*/


drop table if exists user;

/*==============================================================*/
/* Table: user                                                  */
/*==============================================================*/
create table user
(
   userid               bigint not null auto_increment,
   username             varchar(30),
   password             varchar(30),
   email                varchar(200),
   usertype             int,
   phone                varchar(20),
   insert_time          datetime,
   update_time          datetime,
   primary key (userid)
);

alter table user comment '”√ªß';

