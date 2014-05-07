drop table AF_MAIL_MESSAGE if exists;
create table AF_MAIL_MESSAGE 
(
   MESSAGE_ID			 VARCHAR2(100) not null,
   SUBJECT	             VARCHAR2(2048)       not null,
   STATUS                VARCHAR2(4)          not null,
   constraint PK_MAIL_MESSAGE primary key (MESSAGE_ID)
);

create index AF_IDX_MAIL_MESSAGE_ID on AF_MAIL_MESSAGE(MESSAGE_ID);

drop table AF_SMS_OP_LOG if exists;
create table AF_SMS_OP_LOG 
(
   MESSAGE_ID			VARCHAR2(100) not null,
   PHONE_NO  			bigint not null,
   STATUS               VARCHAR2(4)          not null,
   CREATE_TIME          TIMESTAMP            not null,
   COMMENTS				VARCHAR2(256),
   constraint PK_SMS_OP_LOG primary key (MESSAGE_ID, PHONE_NO)
);

comment on table AF_SMS_OP_LOG is
'短信发送记录';
comment on column AF_SMS_OP_LOG.MESSAGE_ID is
'邮件id';
comment on column AF_SMS_OP_LOG.PHONE_NO is
'手机号';
comment on column AF_SMS_OP_LOG.STATUS is
'状态{N:新建 S:成功 P:处理中 E:异常}';
comment on column AF_SMS_OP_LOG.CREATE_TIME is
'创建时间';
comment on column AF_SMS_OP_LOG.COMMENTS is
'备注';

drop table AF_PHONE_ITEM if exists;
create table AF_PHONE_ITEM 
(
   ID                   bigint  generated by default as identity         not null,
   PHONE_NO  			bigint,
   constraint PK_PHONE_ITEM  primary key (ID)
);
comment on table AF_PHONE_ITEM is
'待处理手机队列';

comment on column AF_PHONE_ITEM.ID is
'ID';