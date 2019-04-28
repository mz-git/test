==================student=======================
DROP TABLE IF EXISTS `student`;
CREATE TABLE `student` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `name` varchar(255) DEFAULT NULL COMMENT '姓名',
  `sex` varchar(255) DEFAULT NULL COMMENT '性别',
  `age` bigint(20) DEFAULT NULL COMMENT '年龄',
  `birthday` varchar(255) DEFAULT NULL COMMENT '生日',
  `address` varchar(255) DEFAULT NULL COMMENT '地址',
  `phone` varchar(255) DEFAULT NULL COMMENT '电话',
  `createTime` datetime DEFAULT NULL COMMENT '建表日期',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

DROP TABLE IF EXISTS `score`;
CREATE TABLE `score` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `st_id` bigint(20) DEFAULT NULL,
  `co_id` bigint(20) DEFAULT NULL,
  `score` double(10,2) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;

DROP TABLE IF EXISTS `course`;
CREATE TABLE `course` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `course` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

===================order=======================================
CREATE TABLE `order_path` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `order_id` bigint(20) DEFAULT NULL COMMENT '订单id',
  `oper_status` bigint(20) DEFAULT NULL COMMENT '操作状态码',
  `oper_name` varchar(255) DEFAULT NULL COMMENT '操作人姓名',
  `oper_time` datetime DEFAULT NULL COMMENT '操作时间',
  `oper_desc` varchar(255) DEFAULT NULL COMMENT '操作描述信息',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8;

CREATE TABLE `order_oper` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `order_id` bigint(20) DEFAULT NULL COMMENT '订单id',
  `send_time` datetime DEFAULT NULL COMMENT '派件时间',
  `sign_time` datetime DEFAULT NULL COMMENT '签收时间',
  `sign_name` varchar(255) DEFAULT NULL COMMENT '签收人姓名',
  `order_status` bigint(20) DEFAULT NULL COMMENT '订单状态',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

CREATE TABLE `order_path` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `order_id` bigint(20) DEFAULT NULL COMMENT '订单id',
  `oper_status` bigint(20) DEFAULT NULL COMMENT '操作状态码',
  `oper_name` varchar(255) DEFAULT NULL COMMENT '操作人姓名',
  `oper_time` datetime DEFAULT NULL COMMENT '操作时间',
  `oper_desc` varchar(255) DEFAULT NULL COMMENT '操作描述信息',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8;

=============zentao==========================
CREATE TABLE `zt_task` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `title` varchar(255) DEFAULT NULL COMMENT '标题',
  `desc` varchar(255) DEFAULT NULL COMMENT '描述',
  `revi` varchar(255) DEFAULT NULL COMMENT '评审人',
  `crea` varchar(255) DEFAULT NULL COMMENT '创建人',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `zt_oper` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `task_id` bigint(20) DEFAULT NULL COMMENT '任务表id',
  `status` varchar(255) DEFAULT NULL COMMENT '状态码',
  `revi_time` datetime DEFAULT NULL COMMENT '评审时间',
  `clos_time` datetime DEFAULT NULL COMMENT '关闭时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `zt_record` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `task_id` bigint(20) DEFAULT NULL COMMENT '任务表id',
  `oper_time` datetime DEFAULT NULL COMMENT '操作时间',
  `oper_desc` varchar(255) DEFAULT NULL COMMENT '操作描述',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;