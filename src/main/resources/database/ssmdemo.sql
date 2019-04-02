/*
Navicat MySQL Data Transfer

Source Server         : example
Source Server Version : 50637
Source Host           : localhost:3306
Source Database       : ssmdemo

Target Server Type    : MYSQL
Target Server Version : 50637
File Encoding         : 65001

Date: 2019-03-14 23:00:48
*/
-- 测试时用的数据库
SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `t_user`
-- ----------------------------
DROP TABLE IF EXISTS `t_user`;
CREATE TABLE `t_user` (
  `　　id` int(11) NOT NULL AUTO_INCREMENT,
  `　　uname` varchar(16) DEFAULT NULL,
  `　　sex` varchar(2) DEFAULT NULL,
  `　　mobile` varchar(11) DEFAULT NULL,
  `　　address` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`　　id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_user
-- ----------------------------
INSERT INTO `t_user` VALUES ('1', '小一', '男', '18983886043', '成都');
INSERT INTO `t_user` VALUES ('2', '小二', '男', '18983886044', '重庆');
INSERT INTO `t_user` VALUES ('3', '小三', '女', '18983886045', '阿富汗');
