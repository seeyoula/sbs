--Drop tables
drop table T_USER;
drop table T_ROLE;
drop table T_MENU;
drop table T_GROUP;
drop table T_PRIVILEGE;
drop table T_USER_ROLE;
drop table T_USER_GROUP;
drop table T_ROLE_GROUP;
drop table T_ROLE_PRIVILEGE;

-- Create table
create table T_USER
(
  id       VARCHAR2(9) not null,
  name     VARCHAR2(128),
  password VARCHAR2(1024)
);

-- Create table
create table T_ROLE
(
  id   VARCHAR2(1) not null,
  name VARCHAR2(128) not null
);

-- Create table
create table T_MENU
(
  id           VARCHAR2(1) not null,
  privilege_id VARCHAR2(1) not null,
  name         VARCHAR2(256) not null,
  url          VARCHAR2(256) not null,
  parent_id    VARCHAR2(1) not null
);

-- Create table
create table T_GROUP
(
  id   VARCHAR2(1) not null,
  name VARCHAR2(256) not null
);

-- Create table
create table T_PRIVILEGE
(
  id   VARCHAR2(1) not null,
  type VARCHAR2(1) not null
);

-- Create table
create table T_USER_ROLE
(
  user_id VARCHAR2(1) not null,
  role_id VARCHAR2(1) not null
);

-- Create table
create table T_USER_GROUP
(
  group_id VARCHAR2(1) not null,
  user_id  VARCHAR2(1) not null
);

-- Create table
create table T_ROLE_GROUP
(
  group_id VARCHAR2(1) not null,
  role_id  VARCHAR2(1) not null
);

-- Create table
create table T_ROLE_PRIVILEGE
(
  privilege_id VARCHAR2(1) not null,
  role_id      VARCHAR2(1) not null
);