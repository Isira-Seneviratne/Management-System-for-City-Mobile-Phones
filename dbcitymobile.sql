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
INSERT INTO `availablestock` VALUES ('Ap8Xf',1,10),('F0xA1',2,10),('L0xAf',3,10);
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
  PRIMARY KEY (`bill_number`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `bill`
--

LOCK TABLES `bill` WRITE;
/*!40000 ALTER TABLE `bill` DISABLE KEYS */;
/*!40000 ALTER TABLE `bill` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `currentemployee`
--

DROP TABLE IF EXISTS `currentemployee`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `currentemployee` (
  `EmpID` int(11) NOT NULL,
  `EmpName` varchar(50) NOT NULL,
  `Availability` varchar(10) NOT NULL DEFAULT 'available',
  `DOB` date NOT NULL,
  `EmpAddress` varchar(50) NOT NULL,
  `EmpEmail` varchar(50) NOT NULL,
  `EmpPhone` int(10) NOT NULL,
  `JobID` char(5) NOT NULL,
  `JobS_date` date NOT NULL,
  PRIMARY KEY (`EmpID`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `currentemployee`
--

LOCK TABLES `currentemployee` WRITE;
/*!40000 ALTER TABLE `currentemployee` DISABLE KEYS */;
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
INSERT INTO `customer` VALUES ('123','tg','gt',123,'male','1b','pil',1000,0,0),('hr','hg','hf',546,'male','hh','thdg',NULL,0,0),('CI00000001','tg','tg',12123,'male','jk','fg',NULL,0,0);
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
INSERT INTO `daily_finances` VALUES (18,'September',2017,1000,550,450,3000,2000,1000,2750,1000,1750,200,6750,3750,3000,0),(19,'September',2017,300,300,0,300,300,0,0,0,0,300,600,950,-350,50),(20,'September',2017,1000,250,750,3000,2000,1000,2750,1000,1750,200,6750,3450,3300,0),(21,'September',2017,2000,250,1750,3000,2000,1000,2750,1000,1750,200,7750,3450,4300,0),(22,'September',2017,500,300,200,0,0,0,0,0,0,300,500,650,-150,50),(23,'September',2017,600,350,0,0,0,0,0,0,0,0,600,450,150,100),(24,'September',2017,300,300,0,0,350,350,0,0,0,0,3300,800,-500,150);
/*!40000 ALTER TABLE `daily_finances` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `dailyattendance`
--

DROP TABLE IF EXISTS `dailyattendance`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `dailyattendance` (
  `EmpID` int(11) NOT NULL,
  `Date` date NOT NULL,
  `Shift_sTime` time NOT NULL,
  `Shift_eTime` time NOT NULL,
  `EntryTime` time NOT NULL,
  `ExitTime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`EmpID`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `dailyattendance`
--

LOCK TABLES `dailyattendance` WRITE;
/*!40000 ALTER TABLE `dailyattendance` DISABLE KEYS */;
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
INSERT INTO `financial_reports` VALUES ('August',2017,400,60,340),('September',2017,23250,18750,4500);
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
  `status` varchar(10) NOT NULL DEFAULT 'not sold',
  PRIMARY KEY (`itemID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `item`
--

LOCK TABLES `item` WRITE;
/*!40000 ALTER TABLE `item` DISABLE KEYS */;
INSERT INTO `item` VALUES ('SH0001','IT10000001','J7 Prime','Samsung','F0xA1',37000,'Sep 1, 2015',365,'0.0%','not sold'),('SH0001','IT10000002','iPhone 7 Plus','Apple','Ap8Xf',139000,'Sep 1, 2017',365,'5.0%','not sold'),('SH0001','IT10000003','J7 Prime','Samsung','F0xA1',37000,'Sep 1, 2015',0,'0.0%','not sold');
/*!40000 ALTER TABLE `item` ENABLE KEYS */;
UNLOCK TABLES;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'NO_AUTO_VALUE_ON_ZERO' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 DEFINER=`root`@`localhost`*/ /*!50003 TRIGGER `ffs` AFTER DELETE ON `item`
 FOR EACH ROW BEGIN
  declare codez integer;
  declare qty integer;
  select OLD.modelCode INTO @codez;
  
  
  select qtyInHand INTO @qty from availablestock WHERE availablestock.modelCode = @codez;
  IF (@qty > 1) THEN
    UPDATE availablestock
    SET qtyInHand = qtyInHand - 1
    WHERE availablestock.modelCode = @codez;
    
  ELSE  
    DELETE FROM availablestock WHERE availablestock.modelCode = @codez; 
  END IF;
END */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;

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
  `EmpID` int(11) NOT NULL,
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
/*!40000 ALTER TABLE `monthlyatttendance` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `monthlysal`
--

DROP TABLE IF EXISTS `monthlysal`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `monthlysal` (
  `EmpID` int(11) NOT NULL,
  `Month` varchar(10) NOT NULL,
  `Salary` double NOT NULL,
  PRIMARY KEY (`EmpID`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `monthlysal`
--

LOCK TABLES `monthlysal` WRITE;
/*!40000 ALTER TABLE `monthlysal` DISABLE KEYS */;
/*!40000 ALTER TABLE `monthlysal` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pastemployee`
--

DROP TABLE IF EXISTS `pastemployee`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `pastemployee` (
  `EmpID` int(11) NOT NULL,
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
-- Table structure for table `payment`
--

DROP TABLE IF EXISTS `payment`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `payment` (
  `bill_number` varchar(10) NOT NULL,
  `payment_type` tinyint(1) NOT NULL,
  `extra_charges` int(11) NOT NULL DEFAULT '0',
  `loyalty_discount` int(11) NOT NULL DEFAULT '0',
  `special_discount` double NOT NULL DEFAULT '0',
  `net_amount` double NOT NULL,
  `amount_paid` double NOT NULL,
  `balance` double NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `payment`
--

LOCK TABLES `payment` WRITE;
/*!40000 ALTER TABLE `payment` DISABLE KEYS */;
/*!40000 ALTER TABLE `payment` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `phonerepair`
--

DROP TABLE IF EXISTS `phonerepair`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `phonerepair` (
  `repairID` int(100) NOT NULL AUTO_INCREMENT,
  `itemName` varchar(20) NOT NULL,
  `modelCode` varchar(50) NOT NULL,
  `problem` varchar(200) NOT NULL,
  `EmpID` int(11) NOT NULL,
  `repairDueDate` varchar(10) NOT NULL,
  `EstimatedCost` double NOT NULL,
  `RequestDate` varchar(10) NOT NULL,
  PRIMARY KEY (`repairID`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `phonerepair`
--

LOCK TABLES `phonerepair` WRITE;
/*!40000 ALTER TABLE `phonerepair` DISABLE KEYS */;
INSERT INTO `phonerepair` VALUES (2,'Galaxy J7 Prime','Afx01','Broken screen',1,'4/7/2017',12,'3/7/2017'),(3,'iPhone 6','Afx02','Not booting',2,'5/10/2017',12,'1/10/2017'),(4,'G5','Afx03','Broken camera lens',1,'1/1/2018',12,'31/12/2017'),(5,'iPad Mini','Afx04','Cracked back',3,'3/11/2017',12,'1/11/2017'),(6,'Pixel C','Afx05','Water inside phone',3,'5/11/2017',12,'2/11/2017');
/*!40000 ALTER TABLE `phonerepair` ENABLE KEYS */;
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
  `modelCode` varchar(20) NOT NULL,
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
INSERT INTO `reorder` VALUES ('RE10000001','VENDOR01','Samsung','F0xA1',10,350,'23 September 2017','7:20 PM');
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
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `repair_customer`
--

LOCK TABLES `repair_customer` WRITE;
/*!40000 ALTER TABLE `repair_customer` DISABLE KEYS */;
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
  `status` varchar(50) NOT NULL,
  `checkout_ID` int(11) NOT NULL,
  PRIMARY KEY (`checkout_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `repaircheckout`
--

LOCK TABLES `repaircheckout` WRITE;
/*!40000 ALTER TABLE `repaircheckout` DISABLE KEYS */;
/*!40000 ALTER TABLE `repaircheckout` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `replace _item`
--

DROP TABLE IF EXISTS `replace _item`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `replace _item` (
  `previous_item_code` varchar(10) NOT NULL,
  `new_Item_code` varchar(10) NOT NULL,
  `bill_number` varchar(10) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `replace _item`
--

LOCK TABLES `replace _item` WRITE;
/*!40000 ALTER TABLE `replace _item` DISABLE KEYS */;
/*!40000 ALTER TABLE `replace _item` ENABLE KEYS */;
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
  `Shipping_ID` varchar(10) DEFAULT NULL,
  `Vendor_ID` varchar(10) NOT NULL DEFAULT '',
  `Item_ID` varchar(10) NOT NULL DEFAULT '',
  `ship_type` varchar(10) DEFAULT NULL,
  `item_cost` float DEFAULT NULL,
  `Shipping_Cost` float DEFAULT NULL,
  `Day` int(11) DEFAULT NULL,
  `Month` varchar(10) DEFAULT NULL,
  `Year` int(11) DEFAULT NULL,
  PRIMARY KEY (`Vendor_ID`,`Item_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `shipping_rec`
--

LOCK TABLES `shipping_rec` WRITE;
/*!40000 ALTER TABLE `shipping_rec` DISABLE KEYS */;
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
/*!40000 ALTER TABLE `sold_item` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `useraccount`
--

DROP TABLE IF EXISTS `useraccount`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `useraccount` (
  `EmpID` int(11) NOT NULL,
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
  `Email` varchar(10) DEFAULT NULL,
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
INSERT INTO `vendor` VALUES ('V0001','Amazin','12, Galle ','amazin@gma',112594028,300),('V0002','Appule','142, Chakk','appule@gma',112839204,400),('V0003','Macrosoft','7, 5th lan','macrosoft@',112483927,250);
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

-- Dump completed on 2017-10-14 12:25:14
