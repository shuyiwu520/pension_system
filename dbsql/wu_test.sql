/*
Navicat MySQL Data Transfer

Source Server         : wu
Source Server Version : 50727
Source Host           : 127.0.0.1:3306
Source Database       : wu_test

Target Server Type    : MYSQL
Target Server Version : 50727
File Encoding         : 65001

Date: 2020-11-27 10:58:45
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for admin
-- ----------------------------
DROP TABLE IF EXISTS `admin`;
CREATE TABLE `admin` (
  `id` int(4) NOT NULL AUTO_INCREMENT,
  `name` varchar(10) DEFAULT NULL,
  `password` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of admin
-- ----------------------------
INSERT INTO `admin` VALUES ('1', 'aa', '1111111');

-- ----------------------------
-- Table structure for medicine
-- ----------------------------
DROP TABLE IF EXISTS `medicine`;
CREATE TABLE `medicine` (
  `id` int(6) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `shuLiang` int(4) DEFAULT NULL,
  `weiZhi` varchar(255) DEFAULT NULL,
  `guiGe` varchar(20) DEFAULT NULL,
  `baoZhuang` varchar(255) DEFAULT NULL,
  `changShang` varchar(20) DEFAULT NULL,
  `shengChanRiQi` date DEFAULT NULL,
  `youXiaoQi` date DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of medicine
-- ----------------------------
INSERT INTO `medicine` VALUES ('1', '酒精', '2', '1号仓库', '1瓶', '无', '结晶药业集团', '2019-09-01', '2020-12-31');

-- ----------------------------
-- Table structure for person
-- ----------------------------
DROP TABLE IF EXISTS `person`;
CREATE TABLE `person` (
  `id` int(11) NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  `age` int(11) DEFAULT NULL,
  `card` int(12) DEFAULT NULL,
  `room` int(11) DEFAULT NULL,
  `genrel` varchar(4) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of person
-- ----------------------------
INSERT INTO `person` VALUES ('1', 'ww', '11', '1243554311', '4001', 'nan');
INSERT INTO `person` VALUES ('2', 'zhao', '2', '1243554312', '4001', 'nan');
INSERT INTO `person` VALUES ('3', 'qian', '3', '1243554314', '4001', 'nan');
INSERT INTO `person` VALUES ('4', 'sun', '4', '1243554331', '4001', 'nan');
INSERT INTO `person` VALUES ('5', 'li', '5', '1243533311', '4001', 'nan');
INSERT INTO `person` VALUES ('6', 'zhou', '6', '1243534311', '4001', 'nan');
INSERT INTO `person` VALUES ('7', 'wu', '7', '1243554311', '4001', 'nan');
INSERT INTO `person` VALUES ('8', 'zheng', '8', '1243554311', '4001', 'nan');
INSERT INTO `person` VALUES ('10', 'wang', '10', '1243554311', '4001', 'nan');
INSERT INTO `person` VALUES ('11', 'ouyang', '11', '1243554311', '4001', 'nan');

-- ----------------------------
-- Table structure for personlocation
-- ----------------------------
DROP TABLE IF EXISTS `personlocation`;
CREATE TABLE `personlocation` (
  `id` int(6) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) DEFAULT NULL,
  `xlocation` decimal(10,7) DEFAULT NULL,
  `ylocation` decimal(10,7) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of personlocation
-- ----------------------------
INSERT INTO `personlocation` VALUES ('1', 'ww', '117.0355080', '36.2245710');
