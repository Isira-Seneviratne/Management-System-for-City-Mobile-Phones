-- phpMyAdmin SQL Dump
-- version 4.1.14
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Sep 24, 2017 at 11:39 AM
-- Server version: 5.6.17
-- PHP Version: 5.5.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `dbcitymobile`
--

-- --------------------------------------------------------

--
-- Table structure for table `availablestock`
--

CREATE TABLE IF NOT EXISTS `availablestock` (
  `modelCode` varchar(20) NOT NULL,
  `qtyInHand` int(11) NOT NULL,
  `reOrderLevel` int(11) NOT NULL DEFAULT '10',
  PRIMARY KEY (`modelCode`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `availablestock`
--

INSERT INTO `availablestock` (`modelCode`, `qtyInHand`, `reOrderLevel`) VALUES
('Ap8Xf', 1, 10),
('F0xA1', 2, 10),
('L0xAf', 3, 10);

-- --------------------------------------------------------

--
-- Table structure for table `bill`
--

CREATE TABLE IF NOT EXISTS `bill` (
  `bill_number` varchar(10) NOT NULL,
  `customer_id` varchar(10) NOT NULL,
  `num_of_items` int(11) NOT NULL,
  `time` time NOT NULL,
  `date` date NOT NULL,
  PRIMARY KEY (`bill_number`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `currentemployee`
--

CREATE TABLE IF NOT EXISTS `currentemployee` (
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

-- --------------------------------------------------------

--
-- Table structure for table `customer`
--

CREATE TABLE IF NOT EXISTS `customer` (
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

--
-- Dumping data for table `customer`
--

INSERT INTO `customer` (`customer_id`, `fname`, `lname`, `phone_num`, `gender`, `address`, `city`, `tot_spent_money`, `loyalty_level`, `loyalty_discount`) VALUES
('123', 'tg', 'gt', 123, 'male', '1b', 'pil', 1000, 0, 0),
('hr', 'hg', 'hf', 546, 'male', 'hh', 'thdg', NULL, 0, 0),
('CI00000001', 'tg', 'tg', 12123, 'male', 'jk', 'fg', NULL, 0, 0);

-- --------------------------------------------------------

--
-- Table structure for table `dailyattendance`
--

CREATE TABLE IF NOT EXISTS `dailyattendance` (
  `EmpID` int(11) NOT NULL,
  `Date` date NOT NULL,
  `Shift_sTime` time NOT NULL,
  `Shift_eTime` time NOT NULL,
  `EntryTime` time NOT NULL,
  `ExitTime` timestamp NOT NULL,
  PRIMARY KEY (`EmpID`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `daily_finances`
--

CREATE TABLE IF NOT EXISTS `daily_finances` (
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

--
-- Dumping data for table `daily_finances`
--

INSERT INTO `daily_finances` (`Day`, `Month`, `Year`, `Rep_inc`, `Rep_cost`, `Rep_prof`, `Sales_inc`, `Sales_cost`, `Sales_prof`, `Dis_inc`, `Dis_cost`, `Dis_prof`, `HR_cost`, `Tot_inc`, `Tot_cost`, `Tot_prof`, `Other_cost`) VALUES
(18, 'September', 2017, 1000, 550, 450, 3000, 2000, 1000, 2750, 1000, 1750, 200, 6750, 3750, 3000, 0),
(19, 'September', 2017, 300, 300, 0, 300, 300, 0, 0, 0, 0, 300, 600, 950, -350, 50),
(20, 'September', 2017, 1000, 250, 750, 3000, 2000, 1000, 2750, 1000, 1750, 200, 6750, 3450, 3300, 0),
(21, 'September', 2017, 2000, 250, 1750, 3000, 2000, 1000, 2750, 1000, 1750, 200, 7750, 3450, 4300, 0),
(22, 'September', 2017, 500, 300, 200, 0, 0, 0, 0, 0, 0, 300, 500, 650, -150, 50),
(23, 'September', 2017, 600, 350, 0, 0, 0, 0, 0, 0, 0, 0, 600, 450, 150, 100),
(24, 'September', 2017, 300, 300, 0, 0, 350, 350, 0, 0, 0, 0, 3300, 800, -500, 150);

-- --------------------------------------------------------

--
-- Table structure for table `distribution_item`
--

CREATE TABLE IF NOT EXISTS `distribution_item` (
  `Vendor_ID` varchar(10) NOT NULL DEFAULT '',
  `Item_ID` varchar(10) NOT NULL DEFAULT '',
  `Qty` int(11) DEFAULT NULL,
  `Item_Costs` int(11) DEFAULT NULL,
  PRIMARY KEY (`Vendor_ID`,`Item_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `financial_reports`
--

CREATE TABLE IF NOT EXISTS `financial_reports` (
  `Month_issued` char(10) NOT NULL DEFAULT '',
  `Year_issued` int(11) NOT NULL DEFAULT '0',
  `Total_revenue` float DEFAULT NULL,
  `Total_costs` float DEFAULT NULL,
  `Total_profit` float DEFAULT NULL,
  PRIMARY KEY (`Month_issued`,`Year_issued`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `financial_reports`
--

INSERT INTO `financial_reports` (`Month_issued`, `Year_issued`, `Total_revenue`, `Total_costs`, `Total_profit`) VALUES
('August', 2017, 400, 60, 340),
('September', 2017, 23250, 18750, 4500);

-- --------------------------------------------------------

--
-- Table structure for table `item`
--

CREATE TABLE IF NOT EXISTS `item` (
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

--
-- Dumping data for table `item`
--

INSERT INTO `item` (`shippingID`, `itemID`, `itemName`, `brand`, `modelCode`, `sellingPrice`, `manufactureDate`, `warrantyPeriod`, `discount`, `status`) VALUES
('SH0001', 'IT10000001', 'J7 Prime', 'Samsung', 'F0xA1', 37000, 'Sep 1, 2015', 365, '0.0%', 'not sold'),
('SH0001', 'IT10000002', 'iPhone 7 Plus', 'Apple', 'Ap8Xf', 139000, 'Sep 1, 2017', 365, '5.0%', 'not sold'),
('SH0001', 'IT10000003', 'J7 Prime', 'Samsung', 'F0xA1', 37000, 'Sep 1, 2015', 0, '0.0%', 'not sold');

--
-- Triggers `item`
--
DROP TRIGGER IF EXISTS `ffs`;
DELIMITER //
CREATE TRIGGER `ffs` AFTER DELETE ON `item`
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
END
//
DELIMITER ;

-- --------------------------------------------------------

--
-- Table structure for table `job`
--

CREATE TABLE IF NOT EXISTS `job` (
  `JobID` char(5) NOT NULL,
  `JobName` varchar(20) NOT NULL,
  PRIMARY KEY (`JobID`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `monthlyatttendance`
--

CREATE TABLE IF NOT EXISTS `monthlyatttendance` (
  `EmpID` int(11) NOT NULL,
  `Month` varchar(10) NOT NULL,
  `WorkingHours` int(11) NOT NULL,
  `OtHours` int(11) NOT NULL,
  PRIMARY KEY (`EmpID`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `monthlysal`
--

CREATE TABLE IF NOT EXISTS `monthlysal` (
  `EmpID` int(11) NOT NULL,
  `Month` varchar(10) NOT NULL,
  `Salary` double NOT NULL,
  PRIMARY KEY (`EmpID`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `pastemployee`
--

CREATE TABLE IF NOT EXISTS `pastemployee` (
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

-- --------------------------------------------------------

--
-- Table structure for table `payment`
--

CREATE TABLE IF NOT EXISTS `payment` (
  `bill_number` varchar(10) NOT NULL,
  `payment_type` tinyint(1) NOT NULL,
  `extra_charges` int(11) NOT NULL DEFAULT '0',
  `loyalty_discount` int(11) NOT NULL DEFAULT '0',
  `special_discount` double NOT NULL DEFAULT '0',
  `net_amount` double NOT NULL,
  `amount_paid` double NOT NULL,
  `balance` double NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `phonerepair`
--

CREATE TABLE IF NOT EXISTS `phonerepair` (
  `repairID` int(100) NOT NULL AUTO_INCREMENT,
  `itemName` varchar(20) NOT NULL,
  `modelCode` varchar(50) NOT NULL,
  `problem` varchar(200) NOT NULL,
  `EmpID` int(11) NOT NULL,
  `repairDueDate` varchar(10) NOT NULL,
  `EstimatedCost` double NOT NULL,
  `RequestDate` varchar(10) NOT NULL,
  PRIMARY KEY (`repairID`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=7 ;

--
-- Dumping data for table `phonerepair`
--

INSERT INTO `phonerepair` (`repairID`, `itemName`, `modelCode`, `problem`, `EmpID`, `repairDueDate`, `EstimatedCost`, `RequestDate`) VALUES
(2, 'kdfkd', '', 'dcdcd', 0, '2/3/2', 12, ''),
(3, 'kdfkd', '', 'dcdcd', 0, '2/3/2', 12, ''),
(4, 'kdfkd', '', 'dcdcd', 0, '2/3/2', 12, ''),
(5, 'kdfkd', '', 'dcdcd', 0, '2/3/2', 12, ''),
(6, 'kdfkd', '', 'dcdcd', 0, '2/3/2', 12, '');

-- --------------------------------------------------------

--
-- Table structure for table `reorder`
--

CREATE TABLE IF NOT EXISTS `reorder` (
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

--
-- Dumping data for table `reorder`
--

INSERT INTO `reorder` (`reOrderID`, `vendorID`, `brand`, `modelCode`, `qty`, `totalCost`, `RequestDate`, `RequestTime`) VALUES
('RE10000001', 'VENDOR01', 'Samsung', 'F0xA1', 10, 350, '23 September 2017', '7:20 PM');

-- --------------------------------------------------------

--
-- Table structure for table `repaircheckout`
--

CREATE TABLE IF NOT EXISTS `repaircheckout` (
  `repairID` int(100) NOT NULL,
  `Service_Charges` int(11) NOT NULL,
  `repair_Cost` int(11) NOT NULL,
  `status` varchar(50) NOT NULL,
  `checkout_ID` int(11) NOT NULL,
  PRIMARY KEY (`checkout_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `repair_customer`
--

CREATE TABLE IF NOT EXISTS `repair_customer` (
  `cust_id` int(100) NOT NULL AUTO_INCREMENT,
  `name` varchar(40) NOT NULL,
  `email` varchar(50) NOT NULL,
  `phone` int(10) NOT NULL,
  `address` varchar(50) NOT NULL,
  PRIMARY KEY (`cust_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Table structure for table `replace _item`
--

CREATE TABLE IF NOT EXISTS `replace _item` (
  `previous_item_code` varchar(10) NOT NULL,
  `new_Item_code` varchar(10) NOT NULL,
  `bill_number` varchar(10) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `salaryrate`
--

CREATE TABLE IF NOT EXISTS `salaryrate` (
  `JobID` char(5) NOT NULL,
  `dailyRate` double NOT NULL,
  `otRate` double NOT NULL,
  PRIMARY KEY (`JobID`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `shipping_rec`
--

CREATE TABLE IF NOT EXISTS `shipping_rec` (
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

-- --------------------------------------------------------

--
-- Table structure for table `sold_item`
--

CREATE TABLE IF NOT EXISTS `sold_item` (
  `item_code` varchar(10) NOT NULL,
  `bill_number` varchar(10) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `useraccount`
--

CREATE TABLE IF NOT EXISTS `useraccount` (
  `EmpID` int(11) NOT NULL,
  `Name` varchar(50) NOT NULL,
  `UserName` varchar(10) NOT NULL,
  `Password` varchar(10) NOT NULL,
  `Email` varchar(50) NOT NULL,
  PRIMARY KEY (`EmpID`),
  UNIQUE KEY `UserName` (`UserName`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `vendor`
--

CREATE TABLE IF NOT EXISTS `vendor` (
  `Vendor_ID` varchar(10) NOT NULL DEFAULT '',
  `Vendor_name` varchar(10) DEFAULT NULL,
  `Address` varchar(10) DEFAULT NULL,
  `Email` varchar(10) DEFAULT NULL,
  `Telephone` int(11) DEFAULT NULL,
  `Shipping_Cost_ph` float DEFAULT NULL,
  PRIMARY KEY (`Vendor_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `vendor`
--

INSERT INTO `vendor` (`Vendor_ID`, `Vendor_name`, `Address`, `Email`, `Telephone`, `Shipping_Cost_ph`) VALUES
('V0001', 'Amazin', '12, Galle ', 'amazin@gma', 112594028, 300),
('V0002', 'Appule', '142, Chakk', 'appule@gma', 112839204, 400),
('V0003', 'Macrosoft', '7, 5th lan', 'macrosoft@', 112483927, 250);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
