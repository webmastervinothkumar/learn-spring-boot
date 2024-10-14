create table course
(
    id          bigint auto_increment
        primary key,
    name        varchar(255) not null,
    description varchar(255) null,
    author      varchar(255) not null
);