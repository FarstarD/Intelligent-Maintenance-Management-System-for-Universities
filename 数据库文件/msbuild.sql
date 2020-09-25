/*
SQLyog Professional v12.14 (64 bit)
MySQL - 5.7.23 : Database - msbuild
*********************************************************************
*/


/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`msbuild` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `msbuild`;

CREATE TABLE `books` (
  `bookID` INT(10) NOT NULL AUTO_INCREMENT,
  `inputName` VARCHAR(10) NOT NULL,
  `phone` CHAR(15) NOT NULL,
  `maintainThing` VARCHAR(20) NOT NULL,
  `finishName` VARCHAR(10) NOT NULL,
  `sayProblem` VARCHAR(30) DEFAULT NULL,
  `maintainNum` INT(10) NOT NULL,
  `bookAddress` VARCHAR(30) NOT NULL,
  `inputTime` DATE NOT NULL,
  `finishTime` DATE DEFAULT NULL,
  `bookState` CHAR(10) DEFAULT NULL,
  `end` VARCHAR(30) DEFAULT NULL,
  PRIMARY KEY (`bookID`)
) ENGINE=INNODB AUTO_INCREMENT=23 DEFAULT CHARSET=utf8;

/*Data for the table `books` */

INSERT  INTO `books`(`bookID`,`inputName`,`phone`,`maintainThing`,`finishName`,`sayProblem`,`maintainNum`,`bookAddress`,`inputTime`,`finishTime`,`bookState`,`end`)VALUES 
(1,'杜悦','18819457596','无线网络','杨洋','用户无法正常上网',1,'18-201','2020-09-21','2020-09-23','已完成','问题已解决'),
(2,'杜悦','18819457596','一卡通设备','杨洋','设备无法识别',2,'18-201','2020-09-17','2020-09-19','已完成','问题已解决'),
(3,'黄滴','13644775811','无线网络','魏超','无法有效打开网页',3,'9-506','2020-09-15','2020-09-17','已完成','问题已解决'),
(4,'林飞','18819245781','有线网络','杨洋 ','电脑无法识别网线',1,'15-609','2020-09-11','2020-09-16','已完成','问题已解决'),
(5,'黄滴','13644775811','有线网络','魏超','无法连接网络',5,'9-506','2020-09-10','2020-09-13','已完成','问题已解决'),
(6,'杜悦','18819457596','有线网络','杨洋','无法连接网络',3,'18-201','2020-09-20','2020-09-23','已完成','问题已解决'),
(7,'林飞','18819245781','无线网络','杨洋','用户无法正常上网',7,'15-609','2020-09-11','2020-09-13','已完成','问题已解决'),
(8,'林飞','18819245781','一卡通设备','杨洋','设备无法识别',5,'15-609','2020-09-09','2020-09-15','已完成','问题已解决'),
(9,'梁胖','15919674752','有线网络','陈标','电脑无法识别网线',2,'15-609','2020-09-11','2020-09-16','已完成','问题已解决'),
(10,'梁胖','15919674752','一卡通设备','陈标','无法正常进入设备',20,'21-101','2020-09-23',NULL,'正在处理',NULL),
(11,'梁胖','15919674752','无线网络','陈标','电脑无法识别网线',1,'18-309','2020-09-22',NULL,'正在处理',NULL),
(12,'梁胖','15919674752','有线网络','','电脑无法连接校园网',1,'15-311','2020-09-25',NULL,'未处理',NULL),
(13,'龙肥','15919671478','有线网络','','电脑无法识别网线',1,'15-509','2020-09-11',NULL,'未处理',NULL),
(14,'龙肥','15919671478','无线网络','欧凯','电脑无法正常上网',1,'15-509','2020-09-05','2020-09-11','已完成','问题已解决'),
(15,'龙肥','15919671478','无线网络','欧凯','网速无法达到正常速度',1,'15-509','2020-09-09','2020-09-16','正在处理','问题已解决'),
(16,'杜笃','17845594172','有线网络','陈标','电脑无法识别网线',1,'21-519','2020-09-12','2020-09-16','已完成','问题已解决'),
(17,'杜笃','17845594172','有线网络','陈标','无法正常连接网络',1,'21-519','2020-09-12','2020-09-16','已完成','问题已解决'),
(18,'杜笃','17845594172','一卡通设备','','无法识别设备',20,'21-101','2020-09-14',NULL,'待处理',NULL),
(19,'神瑟','17854781521','无线网络','欧凯','网速无法达到正常速度',1,'15-709','2020-09-15','2020-09-16','已完成','问题已解决'),
(20,'神瑟','17854781521','无线网络','欧凯','电脑无法正常上网',10,'15-709','2020-09-09','2020-09-17','已完成'.'问题已解决'),
(21,'神瑟','17854781521','有线网络','','电脑无法链接',1,'15-709','2020-09-09',NULL,'未处理',NULL);

/*Table structure for table `users` */



CREATE TABLE `users` (
  `userID` INT(10) NOT NULL AUTO_INCREMENT,
  `userName` VARCHAR(10) NOT NULL,
  `userLogin` VARCHAR(20) NOT NULL,
  `userPwd` VARCHAR(20) NOT NULL,
  `userSex` CHAR(2) DEFAULT NULL,
  `userJob` CHAR(10) DEFAULT NULL,
  `userPhone` CHAR(15) NOT NULL,
  PRIMARY KEY (`userID`)
) ENGINE=INNODB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;

/*Data for the table `users` */

INSERT  INTO `users`(`userID`,`userName`,`userLogin`,`userPwd`,`userSex`,`userJob`,`userPhone`)VALUES  
(1,'杜悦','shadow','123456','女','学生','18819457596'),
(2,'陈标','fakern','123456','男','用户管理员','19845612311'),
(3,'杨洋','giaogiao','456789','男','维修员','13678914561'),
(4,'黄滴','nalala','147852','女','学生','13644775811'),
(5,'魏超','tututu','12458','男','维修员','13625476541'),
(6,'林飞','shuaib','11000','男','学生','18819245781'),
(7,'梁胖','katrina','52012','女','老师','15919674752'),
(8,'龙肥','fffsse','15571','男','学生','15919671478'),
(9,'欧凯','sedew','87451','男','维修员','15919672583'),
(10,'杜笃','eswqe','11147','女','老师','17845594172'),
(11,'神瑟','sdesf','25141','男','老师','17854781521');



/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
