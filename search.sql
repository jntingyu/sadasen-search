create table if not exists sys_user (
	id bigint(20) not null primary key auto_increment comment 'ID',
	user_name varchar(30) not null comment '用户名',
	create_time timestamp default current_timestamp comment '注册时间'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

create table if not exists t_post (
	id bigint(20) not null primary key auto_increment comment 'ID',
	user_id bigint(20) not null default 0 comment '用户ID',
	title varchar(200) not null comment '主题',
	content text not null comment '内容',
	create_time timestamp default current_timestamp comment '创建时间'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

create table if not exists t_comment (
	id bigint(20) not null primary key auto_increment comment 'ID',
	user_id bigint(20) not null default 0 comment '用户ID',
	post_id bigint(20) not null comment '主题ID',
	content text not null comment '评论内容',
	create_time timestamp default current_timestamp comment '创建时间'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;