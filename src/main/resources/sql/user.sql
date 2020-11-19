/*
Navicat MySQL Data Transfer

Source Server         : mysql
Source Server Version : 50528
Source Host           : localhost:3306
Source Database       : testmysql

Target Server Type    : MYSQL
Target Server Version : 50528
File Encoding         : 65001

Date: 2020-11-18 15:51:16
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `ID` int(32) NOT NULL COMMENT 'ID',
  `NAME` varchar(32) DEFAULT NULL COMMENT '姓名',
  `IDNUMBER` varchar(32) DEFAULT NULL COMMENT '身份证号',
  `BRITHDAY` date DEFAULT NULL COMMENT '出生年月',
  `REVISION` int(11) DEFAULT NULL COMMENT '乐观锁',
  `CREATED_BY` varchar(32) DEFAULT NULL COMMENT '创建人',
  `CREATED_TIME` datetime DEFAULT NULL COMMENT '创建时间',
  `UPDATED_BY` varchar(32) DEFAULT NULL COMMENT '更新人',
  `UPDATED_TIME` datetime DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户表 ';
