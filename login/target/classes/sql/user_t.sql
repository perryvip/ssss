/*
Navicat MySQL Data Transfer

Source Server         : perry
Source Server Version : 50635
Source Host           : localhost:3306
Source Database       : test

Target Server Type    : MYSQL
Target Server Version : 50635
File Encoding         : 65001

Date: 2017-04-10 17:07:40
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `user_t`
-- ----------------------------
DROP TABLE IF EXISTS `user_t`;
CREATE TABLE `user_t` (
  `id` varchar(100) NOT NULL COMMENT '用户ID',
  `name` varchar(100) DEFAULT NULL COMMENT '用户名',
  `password` varchar(100) DEFAULT NULL COMMENT '密码',
  `token` varchar(100) DEFAULT NULL COMMENT '令牌',
  `nick` varchar(100) DEFAULT NULL COMMENT '昵称',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user_t
-- ----------------------------
INSERT INTO `user_t` VALUES ('03590914-a934-4da9-ba4d-b41799f917d1', 'zhouj', '123456', null, null);
INSERT INTO `user_t` VALUES ('111111', 'Jack', '123456', '', 'JJ');
INSERT INTO `user_t` VALUES ('2273f742-61ec-4440-b88a-42cf48db19ff', 'zhoujia123', '123456', null, null);
INSERT INTO `user_t` VALUES ('333c6d0b-e4a2-4596-9902-a5d98c2f665a', 'test1', '123456', null, null);
INSERT INTO `user_t` VALUES ('39295a3d-cc9b-42b4-b206-a2e7fab7e77c', 'zhoujia', '123456', null, null);
INSERT INTO `user_t` VALUES ('48595f52-b22c-4485-9244-f4004255b972', 'demo', '123456', null, null);
INSERT INTO `user_t` VALUES ('4a63ac863ca645e89cb274d2cccdfe5e', 'aaaaaa11', '123456', '', '1');
INSERT INTO `user_t` VALUES ('524f7440-7283-4b2d-8af5-4a67570e892e', 'pc', '123456', null, null);
INSERT INTO `user_t` VALUES ('52f9b276-38ee-447f-a3aa-0d54e7a736e4', 'wsf', '123456', null, null);
INSERT INTO `user_t` VALUES ('5a3e3f2762fd4736b0d51d0fd99b5451', 'aqwer', '123456', '', 'aqwer');
INSERT INTO `user_t` VALUES ('6f339f0a-2068-4db1-8fef-8e68f444c72c', 'saipi', '123456', null, null);
INSERT INTO `user_t` VALUES ('83597d51-f831-4055-99f2-a01ffdacac26', 'wq123qwe', '111111', '', '');
INSERT INTO `user_t` VALUES ('95f5edcb-a480-44a5-832f-449833062602', 'qqqqqq', '123456', '', 'q');
INSERT INTO `user_t` VALUES ('974375a8-8557-4308-bd36-9455c7863239', 'zhoujia1231', '123456', null, null);
INSERT INTO `user_t` VALUES ('99be79cd35494ec0be7bf5037f6bccc6', '问问', '123456', '', '问问');
INSERT INTO `user_t` VALUES ('b8704438ae73409d948dd3858a2d9b9a', '你好', '123456', '', '123');
INSERT INTO `user_t` VALUES ('bf4ed64e67634bf3af1a14149a3ac50c', 'aaaaaa', '123456', '', 'aaaaaa');
INSERT INTO `user_t` VALUES ('bf9d2885-f34e-4c78-9ae5-2723f62aa2b5', 'saipi', '123456', null, null);
INSERT INTO `user_t` VALUES ('c3753422-6f27-4251-962b-b29305478cc4', 'wwwwwwq', '111111', '', '');
INSERT INTO `user_t` VALUES ('cc325b30cb5147c1a40680eb720f7652', 'jfdijf', '123456', '', 'jfdijf');
INSERT INTO `user_t` VALUES ('e3ed2d183b7c4bf7afc07db7cef5d7d3', 'lllll', '123456', '', 'l');
INSERT INTO `user_t` VALUES ('ea09d9b1-ede7-4bd8-b43d-a546680df00b', 'yht', '123456', null, null);
INSERT INTO `user_t` VALUES ('f6bb5ddfd9ca41289472fbed4ffbeaa4', 'aaaaaa111', '123456', '', '1');
