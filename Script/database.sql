create database webcrawl;
use webcrawl;
drop table category;
drop table post;
create table category (
 ID int AUTO_INCREMENT,
 category_name text not null,
 link text not null,
 sum_post int,
 parent_category int,
 CONSTRAINT pk_ID PRIMARY KEY (ID)
);
create table post (
 ID int AUTO_INCREMENT,
 post_name text not null,
 link text not null,
 sum_post int,
 parent_category int,
 post_order int,
 post_avarta text,
 parent_id int,
 post_content text,
 CONSTRAINT pk_ID PRIMARY KEY (ID),
 CONSTRAINT fk_category_parent_id foreign key (parent_id) references category(ID)

)


