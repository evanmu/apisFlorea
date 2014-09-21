IF not EXISTS (SELECT name FROM master.dbo.sysdatabases WHERE name = 'apis')
CREATE DATABASE apis

GO 
use apis
GO
if not exists (select * from sysobjects where id = object_id('af_mail_message') and sysstat & 0xf = 3)

CREATE TABLE af_mail_message (
	message_id varchar (100) COLLATE Chinese_PRC_CI_AS NOT NULL ,
	subject varchar (2048) COLLATE Chinese_PRC_CI_AS NOT NULL ,
	status varchar (4) COLLATE Chinese_PRC_CI_AS NOT NULL ,
	total_count bigint NULL DEFAULT (0),
	sucd_count bigint NULL DEFAULT (0),
	sucd_items varchar(1000),
	create_time datetime NOT NULL,
	event_time  datetime NOT NULL,
	finish_time datetime NULL,
	CONSTRAINT pk_mail_message PRIMARY KEY  CLUSTERED 
	(
		message_id
	)  
) 
GO

if not exists (select * from sysobjects where id = object_id('af_phone_item') and sysstat & 0xf = 3)
CREATE TABLE af_phone_item (
	id bigint IDENTITY (1, 1) NOT NULL ,
	phone_no bigint NULL ,
	CONSTRAINT pk_phone_item PRIMARY KEY  CLUSTERED 
	(
		id
	)  
) 
GO

if not exists (select * from sysobjects where id = object_id('af_sms_op_log') and sysstat & 0xf = 3)
CREATE TABLE af_sms_op_log (
	message_id varchar (100) COLLATE Chinese_PRC_CI_AS NOT NULL ,
	phone_no bigint NOT NULL ,
	status varchar (4) COLLATE Chinese_PRC_CI_AS NOT NULL ,
	create_time datetime NOT NULL ,
	sms_serail_no varchar (10) COLLATE Chinese_PRC_CI_AS NULL ,
	comments varchar (256) COLLATE Chinese_PRC_CI_AS NULL ,
	CONSTRAINT pk_sms_op_log PRIMARY KEY  CLUSTERED 
	(
		message_id,
		phone_no
	)  
) 
GO
