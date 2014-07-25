if exists (select * from sysobjects where id = object_id('dbo.af_mail_message') and sysstat & 0xf = 3)
	drop table dbo.af_mail_message;
	
create table dbo.af_mail_message 
(
   message_id			 varchar(100) not null,
   subject	             varchar(2048)       not null,
   status                varchar(4)          not null,
   total_count			 bigint      default 0,
   sucd_count            bigint      default 0,
   constraint pk_mail_message primary key (message_id)
) ;

create index af_idx_mail_message_id on af_mail_message(message_id);

if exists (select * from sysobjects where id = object_id('dbo.af_sms_op_log') and sysstat & 0xf = 3)
	drop table dbo.af_sms_op_log;

create table dbo.af_sms_op_log 
(
   message_id			varchar(100) not null,
   phone_no  			bigint not null,
   status               varchar(4)          not null,
   create_time          datetime            not null,
   sms_serail_no		varchar(10),
   comments				varchar(256),
   constraint pk_sms_op_log primary key (message_id, phone_no)
);

create index af_idx_sms_op_log_ss on af_sms_op_log(sms_serail_no);

if exists (select * from sysobjects where id = object_id('dbo.af_phone_item') and sysstat & 0xf = 3)
	drop table dbo.af_phone_item;
create table dbo.af_phone_item 
(
   id                   bigint identity(1,1)     not null,
   phone_no  			bigint,
   constraint pk_phone_item  primary key (id)
);
