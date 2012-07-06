CREATE DATABASE  IF NOT EXISTS `buddhismdb` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `buddhismdb`;
-- MySQL dump 10.13  Distrib 5.5.16, for osx10.5 (i386)
--
-- Host: localhost    Database: buddhismdb
-- ------------------------------------------------------
-- Server version	5.5.24

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `media`
--

DROP TABLE IF EXISTS `media`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `media` (
  `id` mediumint(8) unsigned NOT NULL AUTO_INCREMENT,
  `media_Url` varchar(100) NOT NULL,
  `media_Type` smallint(5) NOT NULL,
  `media_Packet` smallint(5) unsigned NOT NULL,
  `media_Desc` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `media_Packet` (`media_Packet`),
  CONSTRAINT `media_ibfk_2` FOREIGN KEY (`media_Packet`) REFERENCES `packet` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `media`
--

LOCK TABLES `media` WRITE;
/*!40000 ALTER TABLE `media` DISABLE KEYS */;
/*!40000 ALTER TABLE `media` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `administrator`
--

DROP TABLE IF EXISTS `administrator`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `administrator` (
  `id` smallint(5) unsigned NOT NULL AUTO_INCREMENT,
  `ad_Name` varchar(60) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  `ad_Password` varchar(60) NOT NULL,
  `ad_RanNum` varchar(100) NOT NULL,
  `ad_Level` int(4) NOT NULL DEFAULT '1',
  PRIMARY KEY (`id`),
  KEY `userName` (`ad_Name`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `administrator`
--

LOCK TABLES `administrator` WRITE;
/*!40000 ALTER TABLE `administrator` DISABLE KEYS */;
INSERT INTO `administrator` VALUES (1,'admin','9cb3282fbf13b11ea04b7e1371b3128ee02c5111','vXpqxP2o',0),(3,'ghest','9cb2939ff9a2b7953fa01a919392facd8714f54b','1\']=Cx}X',0);
/*!40000 ALTER TABLE `administrator` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `post`
--

DROP TABLE IF EXISTS `post`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `post` (
  `id` mediumint(8) unsigned NOT NULL AUTO_INCREMENT,
  `post_Author` smallint(5) unsigned NOT NULL,
  `post_Date` datetime NOT NULL DEFAULT '0000-00-00 00:00:00',
  `post_Title` varchar(100) NOT NULL,
  `post_Content` longtext NOT NULL,
  `post_ClickTimes` int(8) NOT NULL DEFAULT '0',
  `post_Category` smallint(6) NOT NULL,
  `post_Up` tinyint(1) NOT NULL,
  `post_Top` int(8) NOT NULL DEFAULT '-1',
  PRIMARY KEY (`id`),
  KEY `post_Author` (`post_Author`),
  CONSTRAINT `post_ibfk_1` FOREIGN KEY (`post_Author`) REFERENCES `administrator` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=34 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `post`
--

LOCK TABLES `post` WRITE;
/*!40000 ALTER TABLE `post` DISABLE KEYS */;
INSERT INTO `post` VALUES (19,1,'2012-07-02 21:08:42','1','<b>1</b>',0,1,0,0),(20,1,'2012-07-02 21:08:47','2','<strong>2</strong>',0,5,0,0),(21,1,'2012-07-02 21:08:54','3','<strong>3</strong>',0,2,0,0),(22,1,'2012-07-02 21:08:58','4','<strong>4</strong>',0,4,0,0),(23,1,'2012-07-02 21:09:04','5','<strong>5</strong>',0,3,0,0),(24,1,'2012-07-02 21:09:09','6','<strong>6</strong>',0,7,0,0),(25,1,'2012-07-02 21:09:17','7','<strong>7</strong>',0,8,0,0),(26,1,'2012-07-03 16:29:45','8','<strong>8</strong>',0,6,0,0),(27,1,'2012-07-02 21:09:32','9','<strong>9</strong>',0,6,0,0),(28,1,'2012-07-02 21:09:40','10','<strong>10</strong>',0,9,0,0),(29,1,'2012-07-02 21:09:45','11','<strong>11</strong>',0,10,0,0),(30,1,'2012-07-02 21:09:49','12','<strong>12</strong>',0,11,0,0),(31,1,'2012-07-03 16:29:33','lalalal','fhaljglajgjajgja',0,8,0,0),(32,1,'2012-07-03 16:40:52','Hello','<strong>Hello</strong>',0,1,0,0),(33,1,'2012-07-03 16:41:06','赞助','<b>赞助</b>',0,17,0,0);
/*!40000 ALTER TABLE `post` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `packet`
--

DROP TABLE IF EXISTS `packet`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `packet` (
  `id` smallint(5) unsigned NOT NULL AUTO_INCREMENT,
  `packet_Title` varchar(100) NOT NULL,
  `packet_Date` datetime NOT NULL DEFAULT '0000-00-00 00:00:00',
  `packet_First` varchar(100) NOT NULL,
  `packet_Type` smallint(4) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `packetType` (`packet_Type`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `packet`
--

LOCK TABLES `packet` WRITE;
/*!40000 ALTER TABLE `packet` DISABLE KEYS */;
/*!40000 ALTER TABLE `packet` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2012-07-06  9:13:25
