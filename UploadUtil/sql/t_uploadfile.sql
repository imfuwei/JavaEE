drop table if exists `t_uploadfile`;
create table `t_uploadfile` (
  `id` int(11) not null auto_increment,
  `filename` varchar(255) not null,
  `uploadtime` datetime not null,
  `type` varchar(255) not null,
  `leght` mediumtext not null,
  primary key (`id`)
) engine=innodb default charset=utf8;
