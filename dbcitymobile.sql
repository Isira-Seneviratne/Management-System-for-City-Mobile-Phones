-- MySQL dump 10.13  Distrib 5.7.19, for Linux (x86_64)
--
-- Host: localhost    Database: dbcitymobile
-- ------------------------------------------------------
-- Server version	5.5.5-10.1.28-MariaDB

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
-- Table structure for table `adminuser`
--

DROP TABLE IF EXISTS `adminuser`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `adminuser` (
  `id` int(11) NOT NULL,
  `username` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `adminuser`
--

LOCK TABLES `adminuser` WRITE;
/*!40000 ALTER TABLE `adminuser` DISABLE KEYS */;
INSERT INTO `adminuser` VALUES (1,'admin','admin');
/*!40000 ALTER TABLE `adminuser` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `availablestock`
--

DROP TABLE IF EXISTS `availablestock`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `availablestock` (
  `modelCode` varchar(20) NOT NULL,
  `qtyInHand` int(11) NOT NULL,
  `reOrderLevel` int(11) NOT NULL DEFAULT '10',
  PRIMARY KEY (`modelCode`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `availablestock`
--

LOCK TABLES `availablestock` WRITE;
/*!40000 ALTER TABLE `availablestock` DISABLE KEYS */;
INSERT INTO `availablestock` VALUES ('F0xA1',10,5),('JxDba',3,9),('mm01G',33,20),('Nokx1',11,15),('s5Xz3',6,12),('Sd098',1,10),('xxD02',1,3);
/*!40000 ALTER TABLE `availablestock` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `bill`
--

DROP TABLE IF EXISTS `bill`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `bill` (
  `bill_number` varchar(10) NOT NULL,
  `customer_id` varchar(10) NOT NULL,
  `num_of_items` int(11) NOT NULL,
  `time` time NOT NULL,
  `date` date NOT NULL,
  `payment_type` varchar(10) NOT NULL,
  `extra_charges` double NOT NULL DEFAULT '0',
  `loyalty_discount` double NOT NULL DEFAULT '0',
  `special_discount` double NOT NULL DEFAULT '0',
  `net_amount` double NOT NULL,
  `amount_paid` double NOT NULL,
  `balance` double NOT NULL,
  PRIMARY KEY (`bill_number`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `bill`
--

LOCK TABLES `bill` WRITE;
/*!40000 ALTER TABLE `bill` DISABLE KEYS */;
INSERT INTO `bill` VALUES ('BN10000001','CU10000001',1,'15:38:03','2017-09-26','cash',0,0,0,35150,40000,4850),('BN10000002','CU10000001',2,'15:40:20','2017-09-26','cash',0,500,0,112100,200000,87900),('BN10000003','CU10000001',1,'15:41:49','2017-09-26','cash',0,3,0,21060,50000,28940),('BN10000004','CU10000001',1,'15:43:40','2017-09-26','cash',0,3,0,108225,120000,11775),('BN10000005','CU10000002',2,'15:45:38','2017-09-26','cash',0,0,0,45000,50000,5000),('BN10000006','CU10000003',3,'15:48:45','2017-09-26','cash',0,0,0,63000,70000,7000),('BN10000007','CU10000005',1,'21:27:57','2017-11-10','cash',0,0,0,21000,30000,9000),('BN10000008','CU10000006',2,'21:50:26','2017-11-10','cash',50,0,0,42050,50000,7950);
/*!40000 ALTER TABLE `bill` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `currentemployee`
--

DROP TABLE IF EXISTS `currentemployee`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `currentemployee` (
  `EmpID` varchar(10) NOT NULL,
  `EmpName` varchar(50) NOT NULL,
  `Availability` varchar(10) NOT NULL DEFAULT 'available',
  `dob` date NOT NULL,
  `EmpAddress` varchar(50) NOT NULL,
  `EmpEmail` varchar(50) NOT NULL,
  `EmpPhone` int(10) NOT NULL,
  `JobID` varchar(10) NOT NULL,
  `JobDate` date NOT NULL,
  `Basic_Sal` double NOT NULL,
  `otRate` double NOT NULL,
  PRIMARY KEY (`EmpID`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `currentemployee`
--

LOCK TABLES `currentemployee` WRITE;
/*!40000 ALTER TABLE `currentemployee` DISABLE KEYS */;
INSERT INTO `currentemployee` VALUES ('EM01','Nimal','available','1980-09-26','Nawala','nimal@gmail.com',712245897,'MG01','2013-10-02',40000,500),('EM02','Kamala','available','1989-02-12','Kandy','kamal@gmail.com',774567839,'RP02','2017-08-06',20000,450),('EM03','Amal','available','1990-03-26','Kotte','amal@gmail.com',778907812,'RP02','2016-05-26',20000,450),('EM04','Wimal','available','1984-11-13','Galle','wimal@gmail.com',714567895,'ST01','2015-07-11',18000,400),('EM05','Namal','available','1987-09-06','Malabe','namal@gmail.com',716785643,'ST01','2017-07-02',18000,350),('EM06','Yoshitha','available','1990-06-26','Hambanthota','yoshitha@gmail.com',771234567,'CE01','2011-08-26',60000,800),('EM07','Rohitha','available','1991-08-26','Nugegoda','rohitha@gmail.com',754675324,'CL01','2017-09-19',8000,250),('EM08','Ravi','available','1987-09-04','Bibila','ravi@gamil.com',752378655,'CL01','2017-06-05',8000,250),('EM09','Sumudu','available','1986-04-04','Kottawa','sumudu@gmail.com',777756432,'CL02','2016-08-26',10000,350),('EM10','Kasun','available','1986-09-04','Kohuwala','kasun@gmail.com',713275721,'CL02','2015-09-04',10000,350);
/*!40000 ALTER TABLE `currentemployee` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `customer`
--

DROP TABLE IF EXISTS `customer`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `customer` (
  `customer_id` varchar(10) NOT NULL,
  `fname` varchar(50) DEFAULT NULL,
  `lname` varchar(50) DEFAULT NULL,
  `phone_num` int(10) DEFAULT NULL,
  `gender` varchar(10) DEFAULT NULL,
  `address` varchar(100) DEFAULT NULL,
  `city` varchar(50) DEFAULT NULL,
  `tot_spent_money` double DEFAULT '0',
  `loyalty_level` int(11) NOT NULL DEFAULT '0',
  `loyalty_discount` double NOT NULL DEFAULT '0',
  PRIMARY KEY (`customer_id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `customer`
--

LOCK TABLES `customer` WRITE;
/*!40000 ALTER TABLE `customer` DISABLE KEYS */;
INSERT INTO `customer` VALUES ('CU10000001','tharindu','gunasekara',713284568,'male','tgh','col',276535,2,5),('CU10000002','bhannu','janith',715486656,'male','acd','col2',45000,0,0),('CU10000003','sanka','karu',715684565,'male','fgf','dehi',63000,0,0),('CU10000004','pqrs','zzz',1234547575,'male','sfahdvga','dasdv',0,0,0),('CU10000005','abc','cd',1252525225,'male','ds','sf',21000,0,0),('CU10000006','gh','fg',1234567890,'male','sds545','col',42050,0,0);
/*!40000 ALTER TABLE `customer` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `daily_finances`
--

DROP TABLE IF EXISTS `daily_finances`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `daily_finances` (
  `Day` int(11) NOT NULL DEFAULT '0',
  `Month` char(10) NOT NULL DEFAULT '',
  `Year` int(11) NOT NULL DEFAULT '0',
  `Rep_inc` float DEFAULT NULL,
  `Rep_cost` float DEFAULT NULL,
  `Rep_prof` float DEFAULT NULL,
  `Sales_inc` float DEFAULT NULL,
  `Sales_cost` float DEFAULT NULL,
  `Sales_prof` float DEFAULT NULL,
  `Dis_inc` float DEFAULT NULL,
  `Dis_cost` float DEFAULT NULL,
  `Dis_prof` float DEFAULT NULL,
  `HR_cost` float DEFAULT NULL,
  `Tot_inc` float DEFAULT NULL,
  `Tot_cost` float DEFAULT NULL,
  `Tot_prof` float DEFAULT NULL,
  `Other_cost` float NOT NULL,
  PRIMARY KEY (`Day`,`Month`,`Year`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `daily_finances`
--

LOCK TABLES `daily_finances` WRITE;
/*!40000 ALTER TABLE `daily_finances` DISABLE KEYS */;
INSERT INTO `daily_finances` VALUES (18,'November',2017,300,300,0,0,202,-202,1000,200,800,0,1300,702,598,0),(18,'September',2017,1000,550,450,3000,2000,1000,2750,1000,1750,200,6750,3750,3000,0),(19,'November',2017,500,100,400,1000,100,900,950,150,800,100,2450,450,2000,0),(19,'September',2017,300,300,0,300,300,0,0,0,0,300,600,950,-350,50),(20,'November',2017,1000,200,800,1000,200,800,1000,200,800,100,3000,800,2200,100),(20,'September',2017,1000,250,750,3000,2000,1000,2750,1000,1750,200,6750,3450,3300,0),(21,'November',2017,2000,500,1500,3000,1000,2000,4000,1500,2500,1000,9000,4500,4500,500),(21,'September',2017,2000,250,1750,3000,2000,1000,2750,1000,1750,200,7750,3450,4300,0),(22,'November',2017,3000,1200,1800,3000,1800,1200,5000,1500,3500,200,11000,5000,6000,300),(22,'September',2017,500,300,200,0,0,0,0,0,0,300,500,650,-150,50),(23,'September',2017,600,350,0,0,0,0,0,0,0,0,600,450,150,100),(24,'September',2017,300,300,0,0,350,350,0,0,0,0,3300,800,-500,150),(26,'September',2017,300,300,0,384535,280410,104125,0,0,0,100,384835,280810,104025,100);
/*!40000 ALTER TABLE `daily_finances` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `dailyattendance`
--

DROP TABLE IF EXISTS `dailyattendance`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `dailyattendance` (
  `EmpID` varchar(10) NOT NULL,
  `Date` date NOT NULL,
  `EntryTime` time NOT NULL,
  `ExitTime` time NOT NULL,
  `Shift_eTime` time DEFAULT NULL,
  PRIMARY KEY (`EmpID`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `dailyattendance`
--

LOCK TABLES `dailyattendance` WRITE;
/*!40000 ALTER TABLE `dailyattendance` DISABLE KEYS */;
INSERT INTO `dailyattendance` VALUES ('EM01','2017-09-25','08:00:00','21:00:00',NULL),('EM02','2017-09-25','08:00:00','16:00:00',NULL),('EM03','2017-09-25','08:00:00','18:00:00',NULL),('EM04','2017-09-25','08:00:00','16:00:00',NULL),('EM05','2017-09-25','08:00:00','20:00:00',NULL),('EM06','2017-09-25','08:00:00','18:00:00',NULL),('EM07','2017-09-25','08:00:00','23:00:00',NULL),('EM08','2017-09-25','08:00:00','20:00:00',NULL),('EM09','2017-09-25','08:00:00','19:00:00',NULL),('EM10','2017-09-25','08:00:00','21:00:00',NULL);
/*!40000 ALTER TABLE `dailyattendance` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `distribution_item`
--

DROP TABLE IF EXISTS `distribution_item`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `distribution_item` (
  `Vendor_ID` varchar(10) NOT NULL DEFAULT '',
  `Item_ID` varchar(10) NOT NULL DEFAULT '',
  `Qty` int(11) DEFAULT NULL,
  `Item_Costs` int(11) DEFAULT NULL,
  PRIMARY KEY (`Vendor_ID`,`Item_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `distribution_item`
--

LOCK TABLES `distribution_item` WRITE;
/*!40000 ALTER TABLE `distribution_item` DISABLE KEYS */;
/*!40000 ALTER TABLE `distribution_item` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `financial_reports`
--

DROP TABLE IF EXISTS `financial_reports`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `financial_reports` (
  `Month_issued` char(10) NOT NULL DEFAULT '',
  `Year_issued` int(11) NOT NULL DEFAULT '0',
  `Total_revenue` float DEFAULT NULL,
  `Total_costs` float DEFAULT NULL,
  `Total_profit` float DEFAULT NULL,
  PRIMARY KEY (`Month_issued`,`Year_issued`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `financial_reports`
--

LOCK TABLES `financial_reports` WRITE;
/*!40000 ALTER TABLE `financial_reports` DISABLE KEYS */;
INSERT INTO `financial_reports` VALUES ('August',2017,400,60,340),('November',2017,300,300,0),('September',2014,23250,18750,4500),('September',2017,408085,403585,4500);
/*!40000 ALTER TABLE `financial_reports` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `item`
--

DROP TABLE IF EXISTS `item`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `item` (
  `shippingID` varchar(10) NOT NULL,
  `itemID` varchar(10) NOT NULL,
  `itemName` varchar(50) NOT NULL,
  `brand` varchar(50) NOT NULL,
  `modelCode` varchar(20) NOT NULL,
  `sellingPrice` double NOT NULL,
  `manufactureDate` varchar(20) NOT NULL,
  `warrantyPeriod` int(11) NOT NULL,
  `discount` varchar(10) NOT NULL,
  `status` varchar(20) NOT NULL DEFAULT 'not sold',
  PRIMARY KEY (`itemID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `item`
--

LOCK TABLES `item` WRITE;
/*!40000 ALTER TABLE `item` DISABLE KEYS */;
INSERT INTO `item` VALUES ('SH0001','IT10000001','J7 Prime','Samsung','F0xA1',37000,'Sep 2, 2015',365,'5.0%','not sold'),('SH0002','IT10000007','Lumia 406','Nokia','Nokx1',21000,'Sep 30, 2013',183,'0.0%','not sold'),('SH0002','IT10000008','Lumia 406','Nokia','Nokx1',21000,'Sep 30, 2013',183,'0.0%','not sold'),('SH0002','IT10000009','Lumia 406','Nokia','Nokx1',21000,'Sep 30, 2013',183,'0.0%','not sold'),('SH0002','IT10000010','Lumia 406','Nokia','Nokx1',21000,'Sep 30, 2013',183,'0.0%','not sold'),('SH0002','IT10000011','Lumia 406','Nokia','Nokx1',21000,'Sep 30, 2013',183,'0.0%','not sold'),('SH0002','IT10000012','Lumia 406','Nokia','Nokx1',21000,'Sep 30, 2013',183,'0.0%','not sold'),('SH0002','IT10000013','Lumia 406','Nokia','Nokx1',21000,'Sep 30, 2013',183,'0.0%','not sold'),('SH0002','IT10000014','Lumia 406','Nokia','Nokx1',21000,'Sep 30, 2013',183,'0.0%','not sold'),('SH0002','IT10000015','Lumia 406','Nokia','Nokx1',21000,'Sep 30, 2013',183,'0.0%','not sold'),('SH0002','IT10000016','Lumia 406','Nokia','Nokx1',21000,'Sep 30, 2013',183,'0.0%','not sold'),('SH0002','IT10000017','Lumia 406','Nokia','Nokx1',21000,'Sep 30, 2013',183,'0.0%','not sold'),('SH0003','IT10000018','s5','Samsung','s5Xz3',51000,'Sep 26, 2014',183,'5.0%','not sold'),('SH0003','IT10000019','s5','Samsung','s5Xz3',51000,'Sep 26, 2014',183,'5.0%','not sold'),('SH0003','IT10000020','s5','Samsung','s5Xz3',51000,'Sep 26, 2014',183,'0.0%','not sold'),('SH0003','IT10000021','s5','Samsung','s5Xz3',51000,'Sep 26, 2014',183,'0.0%','not sold'),('SH0003','IT10000022','s5','Samsung','s5Xz3',51000,'Sep 26, 2014',183,'0.0%','not sold'),('SH0003','IT10000023','s5','Samsung','s5Xz3',51000,'Sep 26, 2014',183,'0.0%','not sold'),('SH0003','IT10000024','S8 Plus','Samsung','mm01G',111000,'Aug 21, 2017',730,'0.0%','not sold'),('SH0003','IT10000025','S8 Plus','Samsung','mm01G',111000,'Aug 21, 2017',730,'0.0%','not sold'),('SH0003','IT10000026','S8 Plus','Samsung','mm01G',111000,'Aug 21, 2017',730,'0.0%','not sold'),('SH0003','IT10000027','S8 Plus','Samsung','mm01G',111000,'Aug 21, 2017',730,'0.0%','not sold'),('SH0003','IT10000028','S8 Plus','Samsung','mm01G',111000,'Aug 21, 2017',730,'0.0%','not sold'),('SH0003','IT10000029','S8 Plus','Samsung','mm01G',111000,'Aug 21, 2017',730,'0.0%','not sold'),('SH0003','IT10000030','S8 Plus','Samsung','mm01G',111000,'Aug 21, 2017',730,'0.0%','not sold'),('SH0003','IT10000031','S8 Plus','Samsung','mm01G',111000,'Aug 21, 2017',730,'0.0%','not sold'),('SH0003','IT10000032','S8 Plus','Samsung','mm01G',111000,'Aug 21, 2017',730,'0.0%','not sold'),('SH0003','IT10000033','S8 Plus','Samsung','mm01G',111000,'Aug 21, 2017',730,'0.0%','not sold'),('SH0003','IT10000034','S8 Plus','Samsung','mm01G',111000,'Aug 21, 2017',730,'0.0%','not sold'),('SH0003','IT10000035','S8 Plus','Samsung','mm01G',111000,'Aug 21, 2017',730,'0.0%','not sold'),('SH0003','IT10000036','S8 Plus','Samsung','mm01G',111000,'Aug 21, 2017',730,'0.0%','not sold'),('SH0003','IT10000037','S8 Plus','Samsung','mm01G',111000,'Aug 21, 2017',730,'0.0%','not sold'),('SH0003','IT10000038','S8 Plus','Samsung','mm01G',111000,'Aug 21, 2017',730,'0.0%','not sold'),('SH0003','IT10000039','S8 Plus','Samsung','mm01G',111000,'Aug 21, 2017',730,'0.0%','not sold'),('SH0003','IT10000040','S8 Plus','Samsung','mm01G',111000,'Aug 21, 2017',730,'0.0%','not sold'),('SH0003','IT10000041','S8 Plus','Samsung','mm01G',111000,'Aug 21, 2017',730,'0.0%','not sold'),('SH0003','IT10000042','S8 Plus','Samsung','mm01G',111000,'Aug 21, 2017',730,'0.0%','not sold'),('SH0003','IT10000043','S8 Plus','Samsung','mm01G',111000,'Aug 21, 2017',730,'0.0%','not sold'),('SH0003','IT10000044','S8 Plus','Samsung','mm01G',111000,'Aug 21, 2017',730,'0.0%','not sold'),('SH0003','IT10000045','S8 Plus','Samsung','mm01G',111000,'Aug 21, 2017',730,'0.0%','not sold'),('SH0003','IT10000046','S8 Plus','Samsung','mm01G',111000,'Aug 21, 2017',730,'0.0%','not sold'),('SH0003','IT10000047','S8 Plus','Samsung','mm01G',111000,'Aug 21, 2017',730,'0.0%','not sold'),('SH0003','IT10000048','S8 Plus','Samsung','mm01G',111000,'Aug 21, 2017',730,'0.0%','not sold'),('SH0003','IT10000049','S8 Plus','Samsung','mm01G',111000,'Aug 21, 2017',730,'0.0%','not sold'),('SH0003','IT10000050','S8 Plus','Samsung','mm01G',111000,'Aug 21, 2017',730,'0.0%','not sold'),('SH0003','IT10000051','S8 Plus','Samsung','mm01G',111000,'Aug 21, 2017',730,'0.0%','not sold'),('SH0003','IT10000052','S8 Plus','Samsung','mm01G',111000,'Aug 21, 2017',730,'0.0%','not sold'),('SH0003','IT10000053','S8 Plus','Samsung','mm01G',111000,'Aug 21, 2017',730,'0.0%','not sold'),('SH0003','IT10000054','S8 Plus','Samsung','mm01G',111000,'Aug 21, 2017',730,'0.0%','not sold'),('SH0003','IT10000055','S8 Plus','Samsung','mm01G',111000,'Aug 21, 2017',730,'0.0%','not sold'),('SH0003','IT10000056','S8 Plus','Samsung','mm01G',111000,'Aug 21, 2017',730,'0.0%','not sold'),('SH0003','IT10000057','J7 Prime','Samsung','F0xA1',111000,'Aug 21, 2017',730,'0.0%','not sold'),('SH0003','IT10000058','J7 Prime','Samsung','F0xA1',111000,'Aug 21, 2017',730,'0.0%','not sold'),('SH0003','IT10000059','J7 Prime','Samsung','F0xA1',111000,'Aug 21, 2017',730,'0.0%','not sold'),('SH0003','IT10000060','J7 Prime','Samsung','F0xA1',111000,'Aug 21, 2017',730,'0.0%','not sold'),('SH0003','IT10000061','J7 Prime','Samsung','F0xA1',111000,'Aug 21, 2017',730,'0.0%','not sold'),('SH0003','IT10000062','J7 Prime','Samsung','F0xA1',111000,'Aug 21, 2017',730,'0.0%','not sold'),('SH0003','IT10000063','J7 Prime','Samsung','F0xA1',111000,'Aug 21, 2017',730,'0.0%','not sold'),('SH0003','IT10000064','J7 Prime','Samsung','F0xA1',111000,'Aug 21, 2017',730,'0.0%','not sold'),('SH0003','IT10000065','J7 Prime','Samsung','F0xA1',111000,'Aug 21, 2017',730,'0.0%','not sold'),('SH0003','IT10000066','J7 Prime','Samsung','F0xA1',111000,'Aug 21, 2017',730,'0.0%','not sold'),('SH0001','IT10000068','P9','Huawei','vv2c',23000,'Nov 5, 2017',365,'0.0%','not sold'),('SH0001','IT10000069','iPhone 6s','Appule','ccv',112000,'Nov 1, 2017',365,'0.0%','not sold'),('SH0001','IT10000070','iPhone 7Plus','Appule','ccvd',139000,'Nov 1, 2017',365,'0.0%','not sold'),('SH0004','IT10000071','iPhone 5S','Appule','fdfd',1234,'Nov 5, 2017',0,'0.0%','not sold'),('SH0001','IT10000072','iPhone 5S','Appule','fdfd',12343,'Nov 5, 2017',0,'0.0%','not sold'),('SH0001','IT10000073','Note 8','Samsung','gGcs5',120000,'Nov 5, 2017',365,'0.0%','not sold'),('SH0007','IT10000074','Tab 8.0','Huawei','bbc',60000,'Nov 12, 2017',365,'0.0%','not sold'),('SH0001','IT10000075','Galaxy','Samsung','Sams1',100,'Nov 14, 2017',100,'10.0%','not sold');
/*!40000 ALTER TABLE `item` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `job`
--

DROP TABLE IF EXISTS `job`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `job` (
  `JobID` char(5) NOT NULL,
  `JobName` varchar(20) NOT NULL,
  PRIMARY KEY (`JobID`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `job`
--

LOCK TABLES `job` WRITE;
/*!40000 ALTER TABLE `job` DISABLE KEYS */;
/*!40000 ALTER TABLE `job` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `monthlyatttendance`
--

DROP TABLE IF EXISTS `monthlyatttendance`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `monthlyatttendance` (
  `EmpID` varchar(10) NOT NULL,
  `Month` varchar(10) NOT NULL,
  `WorkingHours` int(11) NOT NULL,
  `OtHours` int(11) NOT NULL,
  PRIMARY KEY (`EmpID`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `monthlyatttendance`
--

LOCK TABLES `monthlyatttendance` WRITE;
/*!40000 ALTER TABLE `monthlyatttendance` DISABLE KEYS */;
INSERT INTO `monthlyatttendance` VALUES ('EM01','January',160,10),('EM02','February',100,20),('EM03','March',130,15),('EM04','April',115,15),('EM05','May',100,5),('EM06','June',157,25),('EM07','July',147,40),('EM08','August',126,43),('EM09','September',114,25),('EM10','December',116,12);
/*!40000 ALTER TABLE `monthlyatttendance` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `monthlysal`
--

DROP TABLE IF EXISTS `monthlysal`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `monthlysal` (
  `EmpID` varchar(10) NOT NULL,
  `Month` varchar(10) NOT NULL,
  `GrossSalary` double NOT NULL,
  `EPF8` double NOT NULL,
  `ETF12` double NOT NULL,
  `ETF3` double NOT NULL,
  `NetSalary` double NOT NULL,
  `wrhr` double NOT NULL,
  `othr` double NOT NULL,
  PRIMARY KEY (`EmpID`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `monthlysal`
--

LOCK TABLES `monthlysal` WRITE;
/*!40000 ALTER TABLE `monthlysal` DISABLE KEYS */;
INSERT INTO `monthlysal` VALUES ('EM01      ','1',45000,3200,4800,1200,41800,160,10),('EM02   ','2',29000,1600,2400,600,27400,100,20),('EM03','3',26750,1600,2400,600,25150,130,15),('EM04','4',24000,1440,2160,540,22560,115,15),('EM05','5',19750,1440,2160,540,18310,100,5),('EM06','6',80000,4800,7200,1800,75200,157,25),('EM07','7',18000,640,960,240,17360,147,40),('EM08','8',18750,640,960,240,18110,126,43),('EM09','9',18750,800,1200,300,17950,114,25),('EM10','12',14200,800,1200,300,13400,116,12);
/*!40000 ALTER TABLE `monthlysal` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `orders`
--

DROP TABLE IF EXISTS `orders`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `orders` (
  `id` int(11) NOT NULL,
  `productId` varchar(11) NOT NULL,
  `product` varchar(50) NOT NULL,
  `price` int(11) NOT NULL,
  `quantity` int(11) NOT NULL,
  `discount` int(11) NOT NULL,
  `total` int(11) NOT NULL,
  `user` varchar(50) NOT NULL,
  `buyDate` datetime NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `orders`
--

LOCK TABLES `orders` WRITE;
/*!40000 ALTER TABLE `orders` DISABLE KEYS */;
INSERT INTO `orders` VALUES (29,'10010','SAMSUNG J2',20000,1,10,18000,'aaa','2017-09-23 11:39:30'),(30,'10010','Iphone 6s',82000,1,10,73800,'aaa','2017-09-23 12:44:10'),(31,'10010','SAMSUNG J2',20000,2,10,36000,'pesh','2017-09-24 01:31:28'),(32,'10011','Iphone 6s',82000,1,10,73800,'sonal','2017-09-24 02:51:47'),(33,'10010','SAMSUNG J2',20000,2,10,36000,'sonal','2017-09-24 03:01:01'),(34,'10011','Iphone 6s',82000,1,10,73800,'mala','2017-09-24 08:02:42'),(35,'10011','Iphone 6s',82000,1,10,73800,'mala','2017-09-24 08:08:19'),(36,'10011','Iphone 6s',82000,1,10,73800,'mala','2017-09-24 08:08:28'),(37,'10011','Iphone 6s',82000,1,10,73800,'mala','2017-09-24 23:51:35'),(38,'10013','SAMSUNG J2',94900,1,10,85410,'mala','2017-09-25 01:02:46'),(39,'10010','Nokia 8',50000,1,10,45000,'mala','2017-09-25 01:21:44'),(40,'10010','Nokia 8',50000,1,10,45000,'mala','2017-09-25 01:22:56'),(41,'10010','Nokia 8',50000,1,10,45000,'mala','2017-09-25 01:23:04'),(42,'10018','OPPO F3',35900,1,10,32310,'mala','2017-09-26 08:09:04'),(43,'10018','OPPO F3',35900,1,10,32310,'mala','2017-09-26 08:09:37'),(44,'10018','OPPO F3',35900,1,10,32310,'mala','2017-09-26 08:10:03'),(45,'10019','LG V20',79900,1,10,71910,'mala','2017-09-26 08:10:47'),(46,'10011','Iphone 6s',82000,1,10,73800,'mala','2017-09-26 08:11:07'),(47,'10018','OPPO F3',35900,1,10,32310,'mala','2017-09-26 08:19:15'),(48,'10018','OPPO F3',35900,1,10,32310,'sanka','2017-09-26 08:40:14'),(49,'10011','Iphone 6s',82000,1,10,73800,'aa','0000-00-00 00:00:00'),(50,'10011','Iphone 6s',82000,1,10,73800,'pesha','0000-00-00 00:00:00'),(51,'10011','Iphone 6s',82000,1,10,73800,'sana','0000-00-00 00:00:00'),(52,'10011','Iphone 6s',82000,1,10,73800,'mala','0000-00-00 00:00:00'),(53,'10011','Iphone 6s',82000,1,10,73800,'mala','0000-00-00 00:00:00');
/*!40000 ALTER TABLE `orders` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pastemployee`
--

DROP TABLE IF EXISTS `pastemployee`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `pastemployee` (
  `EmpID` varchar(10) NOT NULL,
  `EmpName` varchar(50) NOT NULL,
  `DOB` date NOT NULL,
  `EmpAddress` varchar(50) NOT NULL,
  `EmpEmail` varchar(50) NOT NULL,
  `EmpPhone` int(10) NOT NULL,
  `JobID` char(5) NOT NULL,
  `JobS_date` date NOT NULL,
  `JobE_date` date NOT NULL,
  PRIMARY KEY (`EmpID`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pastemployee`
--

LOCK TABLES `pastemployee` WRITE;
/*!40000 ALTER TABLE `pastemployee` DISABLE KEYS */;
/*!40000 ALTER TABLE `pastemployee` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `phonerepair`
--

DROP TABLE IF EXISTS `phonerepair`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `phonerepair` (
  `repairID` int(100) NOT NULL AUTO_INCREMENT,
  `Brand` varchar(20) NOT NULL,
  `itemName` varchar(50) NOT NULL,
  `problem` varchar(200) NOT NULL,
  `EmpID` int(11) NOT NULL,
  `repairDueDate` varchar(10) NOT NULL,
  `EstimatedCost` double NOT NULL,
  `RequestDate` varchar(10) NOT NULL,
  PRIMARY KEY (`repairID`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `phonerepair`
--

LOCK TABLES `phonerepair` WRITE;
/*!40000 ALTER TABLE `phonerepair` DISABLE KEYS */;
INSERT INTO `phonerepair` VALUES (2,'kdfkd','','dcdcd',0,'2/3/2',12,''),(6,'kdfkd','askhdjh','dcdcd',0,'2/3/2',12,'1316'),(7,'Hel','juju','he',12,'12/7/17',4587,'27/8/17'),(8,'asdb','asjd','askjdh',1,'dasdjhk',2121,'5154');
/*!40000 ALTER TABLE `phonerepair` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `rating`
--

DROP TABLE IF EXISTS `rating`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `rating` (
  `id` int(11) NOT NULL,
  `name` varchar(40) NOT NULL,
  `rating` varchar(50) NOT NULL,
  `rating_1` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `rating`
--

LOCK TABLES `rating` WRITE;
/*!40000 ALTER TABLE `rating` DISABLE KEYS */;
INSERT INTO `rating` VALUES (4,'sepali','VERY SATISFIED','DEFINETLY'),(5,'sepali','VERY SATISFIED','DEFINETLY'),(6,'sanka','SATISFIED','PROBABLY');
/*!40000 ALTER TABLE `rating` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `reorder`
--

DROP TABLE IF EXISTS `reorder`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `reorder` (
  `reOrderID` varchar(10) NOT NULL,
  `vendorID` varchar(10) NOT NULL,
  `brand` varchar(20) NOT NULL,
  `itemName` varchar(20) NOT NULL,
  `qty` int(11) NOT NULL,
  `totalCost` double NOT NULL,
  `RequestDate` varchar(20) NOT NULL,
  `RequestTime` varchar(20) NOT NULL,
  PRIMARY KEY (`reOrderID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `reorder`
--

LOCK TABLES `reorder` WRITE;
/*!40000 ALTER TABLE `reorder` DISABLE KEYS */;
INSERT INTO `reorder` VALUES ('RE10000001','V0001','Samsung','A5',2,2,'16 October 2017','3:38 PM'),('RE10000002','V0002','Appule','iPhone 6s',2,200,'17 November 2017','1:36 AM');
/*!40000 ALTER TABLE `reorder` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `repair_customer`
--

DROP TABLE IF EXISTS `repair_customer`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `repair_customer` (
  `cust_id` int(100) NOT NULL AUTO_INCREMENT,
  `name` varchar(40) NOT NULL,
  `email` varchar(50) NOT NULL,
  `phone` int(10) NOT NULL,
  `address` varchar(50) NOT NULL,
  PRIMARY KEY (`cust_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `repair_customer`
--

LOCK TABLES `repair_customer` WRITE;
/*!40000 ALTER TABLE `repair_customer` DISABLE KEYS */;
INSERT INTO `repair_customer` VALUES (2,'hehjkh','daksjlaskdj@gmail.com',1354,'dasjdhkajsd'),(3,'hkj','adslkd',646,'asdnlasd');
/*!40000 ALTER TABLE `repair_customer` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `repaircheckout`
--

DROP TABLE IF EXISTS `repaircheckout`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `repaircheckout` (
  `repairID` int(100) NOT NULL,
  `Service_Charges` int(11) NOT NULL,
  `repair_Cost` int(11) NOT NULL,
  `finalCost` double NOT NULL,
  `status` varchar(50) NOT NULL,
  `checkout_ID` int(11) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`checkout_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `repaircheckout`
--

LOCK TABLES `repaircheckout` WRITE;
/*!40000 ALTER TABLE `repaircheckout` DISABLE KEYS */;
INSERT INTO `repaircheckout` VALUES (4,16154,13216,13214,'Pending',2),(2,464,8979,1797,'sakj',3);
/*!40000 ALTER TABLE `repaircheckout` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `replace_item`
--

DROP TABLE IF EXISTS `replace_item`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `replace_item` (
  `previous_item_code` varchar(10) NOT NULL,
  `new_Item_code` varchar(10) NOT NULL,
  `bill_number` varchar(10) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `replace_item`
--

LOCK TABLES `replace_item` WRITE;
/*!40000 ALTER TABLE `replace_item` DISABLE KEYS */;
INSERT INTO `replace_item` VALUES ('IT10000007','IT10000008','BN10000005'),('IT10000010','IT10000011','BN10000006'),('IT10000008','IT10000018','BN10000006');
/*!40000 ALTER TABLE `replace_item` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `salaryrate`
--

DROP TABLE IF EXISTS `salaryrate`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `salaryrate` (
  `JobID` char(5) NOT NULL,
  `dailyRate` double NOT NULL,
  `otRate` double NOT NULL,
  PRIMARY KEY (`JobID`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `salaryrate`
--

LOCK TABLES `salaryrate` WRITE;
/*!40000 ALTER TABLE `salaryrate` DISABLE KEYS */;
/*!40000 ALTER TABLE `salaryrate` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `shipping_rec`
--

DROP TABLE IF EXISTS `shipping_rec`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `shipping_rec` (
  `Shipping_ID` varchar(10) NOT NULL DEFAULT '',
  `Vendor_ID` varchar(10) NOT NULL DEFAULT '',
  `modelCode` varchar(20) NOT NULL DEFAULT '',
  `ship_type` varchar(10) DEFAULT NULL,
  `qty` int(11) NOT NULL,
  `item_cost` float DEFAULT NULL,
  `Shipping_Cost` float DEFAULT NULL,
  `Day` int(11) DEFAULT NULL,
  `Month` varchar(10) DEFAULT NULL,
  `Year` int(11) DEFAULT NULL,
  PRIMARY KEY (`Shipping_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `shipping_rec`
--

LOCK TABLES `shipping_rec` WRITE;
/*!40000 ALTER TABLE `shipping_rec` DISABLE KEYS */;
INSERT INTO `shipping_rec` VALUES ('default','V0002','xss','country',0,4000,100,19,'March',2016),('SH0001','V0003','x309ks','country',0,2000,400,19,'January',2016),('SH0002','V0001','FAb01','abroad',0,3000,20000,12,'January',2017),('SH0003','V0001','FAx01','abroad',0,9000,10000,12,'January',2017),('SH0004','V0001','GAx01','abroad',0,5000,1000,12,'January',2017);
/*!40000 ALTER TABLE `shipping_rec` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sold_item`
--

DROP TABLE IF EXISTS `sold_item`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `sold_item` (
  `item_code` varchar(10) NOT NULL,
  `bill_number` varchar(10) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sold_item`
--

LOCK TABLES `sold_item` WRITE;
/*!40000 ALTER TABLE `sold_item` DISABLE KEYS */;
INSERT INTO `sold_item` VALUES ('IT10000001','BN10000001'),('IT10000002','BN10000002'),('IT10000004','BN10000002'),('IT10000005','BN10000003'),('IT10000026','BN10000004'),('IT10000006','BN10000005'),('IT10000007','BN10000005'),('IT10000008','BN10000006'),('IT10000009','BN10000006'),('IT10000010','BN10000006'),('IT10000015','BN10000007'),('IT10000016','BN10000008'),('IT10000017','BN10000008');
/*!40000 ALTER TABLE `sold_item` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `user` (
  `id` int(11) NOT NULL,
  `firstName` varchar(50) NOT NULL,
  `lastName` varchar(50) NOT NULL,
  `email` varchar(50) NOT NULL,
  `hashedPassword` varchar(50) NOT NULL,
  `lastLogin` datetime NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` VALUES (1,'Chamara','Siriwardena','chamara@gmail.com','7110eda4d09e062aa5e4a390b0a572ac0d2c0220','0000-00-00 00:00:00'),(2,'mala','perera','mala@gmail.com','6216f8a75fd5bb3d5f22b6f9958cdede3fc086c2','2017-09-29 00:42:34'),(3,'sanka','karu','sanka@gmail.com','6216f8a75fd5bb3d5f22b6f9958cdede3fc086c2','2017-09-26 08:33:19'),(4,'aaa','bbb','aaa@gmail.com','6216f8a75fd5bb3d5f22b6f9958cdede3fc086c2','0000-00-00 00:00:00'),(5,'pesh','herath','pesh@gmail.com','6216f8a75fd5bb3d5f22b6f9958cdede3fc086c2','0000-00-00 00:00:00'),(6,'sonal','rathnayaka','sonal@gmail.com','6216f8a75fd5bb3d5f22b6f9958cdede3fc086c2','0000-00-00 00:00:00'),(7,'sonali_00','rathnayaka','sonali@gmail.com','6216f8a75fd5bb3d5f22b6f9958cdede3fc086c2','0000-00-00 00:00:00'),(8,'sonali','rathnayaka','sonalika@gmail.com','1c6637a8f2e1f75e06ff9984894d6bd16a3a36a9','0000-00-00 00:00:00'),(9,'aa','bb','ab@gmail.com','6216f8a75fd5bb3d5f22b6f9958cdede3fc086c2','2017-09-26 08:59:15'),(10,'bunty','perera','bunty@gmail.com','33f552949e2755ac09ff7ee60ebd4fda5c809673','2017-09-26 08:44:17'),(11,'pesha','njali','pesha@gmail.com','0570f07980c2dc99002c78e6948c2fa025323bdb','2017-09-27 00:23:58'),(12,'sana','karu','sana@gmai.com','2d02423239ebd21ca00d5ef5accfec26910609e9','2017-09-27 01:57:25');
/*!40000 ALTER TABLE `user` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `useraccount`
--

DROP TABLE IF EXISTS `useraccount`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `useraccount` (
  `EmpID` varchar(10) NOT NULL,
  `Name` varchar(50) NOT NULL,
  `UserName` varchar(10) NOT NULL,
  `Password` varchar(10) NOT NULL,
  `Email` varchar(50) NOT NULL,
  PRIMARY KEY (`EmpID`),
  UNIQUE KEY `UserName` (`UserName`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `useraccount`
--

LOCK TABLES `useraccount` WRITE;
/*!40000 ALTER TABLE `useraccount` DISABLE KEYS */;
/*!40000 ALTER TABLE `useraccount` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `vendor`
--

DROP TABLE IF EXISTS `vendor`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `vendor` (
  `Vendor_ID` varchar(10) NOT NULL DEFAULT '',
  `Vendor_name` varchar(10) DEFAULT NULL,
  `Address` varchar(10) DEFAULT NULL,
  `Email` varchar(50) DEFAULT NULL,
  `Telephone` int(11) DEFAULT NULL,
  `Shipping_Cost_ph` float DEFAULT NULL,
  PRIMARY KEY (`Vendor_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `vendor`
--

LOCK TABLES `vendor` WRITE;
/*!40000 ALTER TABLE `vendor` DISABLE KEYS */;
INSERT INTO `vendor` VALUES ('V0001','Amazin','12, Galle ','sonalrathnayake6@gmail.com',112594028,300),('V0002','Appule','142, Chakk','appule@gmail.com',112839204,400),('V0003','Macrosoft','7, 5th lan','buddhimith@gmail.com',112483927,250),('V555','xyz','galle road','xyz@gmail.com',2500701,200);
/*!40000 ALTER TABLE `vendor` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-11-22 13:49:01
