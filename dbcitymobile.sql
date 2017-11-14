-- phpMyAdmin SQL Dump
-- version 4.5.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Nov 10, 2017 at 04:23 PM
-- Server version: 5.7.11
-- PHP Version: 5.6.19

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `dbcitymobile`
--

-- --------------------------------------------------------

--
-- Table structure for table `availablestock`
--

CREATE TABLE `availablestock` (
  `modelCode` varchar(20) NOT NULL,
  `qtyInHand` int(11) NOT NULL,
  `reOrderLevel` int(11) NOT NULL DEFAULT '10'
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `availablestock`
--

INSERT INTO `availablestock` (`modelCode`, `qtyInHand`, `reOrderLevel`) VALUES
('F0xA1', 10, 5),
('JxDba', 3, 9),
('mm01G', 33, 20),
('Nokx1', 11, 15),
('s5Xz3', 6, 12),
('Sd098', 1, 10),
('xxD02', 1, 3);

-- --------------------------------------------------------

--
-- Table structure for table `bill`
--

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
  `balance` double NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `bill`
--

INSERT INTO `bill` (`bill_number`, `customer_id`, `num_of_items`, `time`, `date`, `payment_type`, `extra_charges`, `loyalty_discount`, `special_discount`, `net_amount`, `amount_paid`, `balance`) VALUES
('BN10000001', 'CU10000001', 1, '15:38:03', '2017-09-26', 'cash', 0, 0, 0, 35150, 40000, 4850),
('BN10000002', 'CU10000001', 2, '15:40:20', '2017-09-26', 'cash', 0, 500, 0, 112100, 200000, 87900),
('BN10000003', 'CU10000001', 1, '15:41:49', '2017-09-26', 'cash', 0, 3, 0, 21060, 50000, 28940),
('BN10000004', 'CU10000001', 1, '15:43:40', '2017-09-26', 'cash', 0, 3, 0, 108225, 120000, 11775),
('BN10000005', 'CU10000002', 2, '15:45:38', '2017-09-26', 'cash', 0, 0, 0, 45000, 50000, 5000),
('BN10000006', 'CU10000003', 3, '15:48:45', '2017-09-26', 'cash', 0, 0, 0, 63000, 70000, 7000),
('BN10000007', 'CU10000005', 1, '21:27:57', '2017-11-10', 'cash', 0, 0, 0, 21000, 30000, 9000),
('BN10000008', 'CU10000006', 2, '21:50:26', '2017-11-10', 'cash', 50, 0, 0, 42050, 50000, 7950);

-- --------------------------------------------------------

--
-- Table structure for table `currentemployee`
--

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
  `otRate` double NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `currentemployee`
--

INSERT INTO `currentemployee` (`EmpID`, `EmpName`, `Availability`, `dob`, `EmpAddress`, `EmpEmail`, `EmpPhone`, `JobID`, `JobDate`, `Basic_Sal`, `otRate`) VALUES
('EM01', 'Nimal', 'available', '1980-09-26', 'Nawala', 'nimal@gmail.com', 712245897, 'MG01', '2013-10-02', 40000, 500),
('EM02', 'Kamala', 'available', '1989-02-12', 'Kandy', 'kamal@gmail.com', 774567839, 'RP02', '2017-08-06', 20000, 450),
('EM03', 'Amal', 'available', '1990-03-26', 'Kotte', 'amal@gmail.com', 778907812, 'RP02', '2016-05-26', 20000, 450),
('EM04', 'Wimal', 'available', '1984-11-13', 'Galle', 'wimal@gmail.com', 714567895, 'ST01', '2015-07-11', 18000, 400),
('EM05', 'Namal', 'available', '1987-09-06', 'Malabe', 'namal@gmail.com', 716785643, 'ST01', '2017-07-02', 18000, 350),
('EM06', 'Yoshitha', 'available', '1990-06-26', 'Hambanthota', 'yoshitha@gmail.com', 771234567, 'CE01', '2011-08-26', 60000, 800),
('EM07', 'Rohitha', 'available', '1991-08-26', 'Nugegoda', 'rohitha@gmail.com', 754675324, 'CL01', '2017-09-19', 8000, 250),
('EM08', 'Ravi', 'available', '1987-09-04', 'Bibila', 'ravi@gamil.com', 752378655, 'CL01', '2017-06-05', 8000, 250),
('EM09', 'Sumudu', 'available', '1986-04-04', 'Kottawa', 'sumudu@gmail.com', 777756432, 'CL02', '2016-08-26', 10000, 350),
('EM10', 'Kasun', 'available', '1986-09-04', 'Kohuwala', 'kasun@gmail.com', 713275721, 'CL02', '2015-09-04', 10000, 350);

-- --------------------------------------------------------

--
-- Table structure for table `customer`
--

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
  `loyalty_discount` double NOT NULL DEFAULT '0'
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `customer`
--

INSERT INTO `customer` (`customer_id`, `fname`, `lname`, `phone_num`, `gender`, `address`, `city`, `tot_spent_money`, `loyalty_level`, `loyalty_discount`) VALUES
('CU10000001', 'tharindu', 'gunasekara', 713284568, 'male', 'tgh', 'col', 276535, 2, 5),
('CU10000002', 'bhannu', 'janith', 715486656, 'male', 'acd', 'col2', 45000, 0, 0),
('CU10000003', 'sanka', 'karu', 715684565, 'male', 'fgf', 'dehi', 63000, 0, 0),
('CU10000004', 'pqrs', 'zzz', 1234547575, 'male', 'sfahdvga', 'dasdv', 0, 0, 0),
('CU10000005', 'abc', 'cd', 1252525225, 'male', 'ds', 'sf', 21000, 0, 0),
('CU10000006', 'gh', 'fg', 1234567890, 'male', 'sds545', 'col', 42050, 0, 0);

-- --------------------------------------------------------

--
-- Table structure for table `dailyattendance`
--

CREATE TABLE `dailyattendance` (
  `EmpID` varchar(10) NOT NULL,
  `Date` date NOT NULL,
  `EntryTime` time NOT NULL,
  `ExitTime` time NOT NULL,
  `Shift_eTime` time DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `dailyattendance`
--

INSERT INTO `dailyattendance` (`EmpID`, `Date`, `EntryTime`, `ExitTime`, `Shift_eTime`) VALUES
('EM01', '2017-09-25', '08:00:00', '21:00:00', NULL),
('EM02', '2017-09-25', '08:00:00', '16:00:00', NULL),
('EM03', '2017-09-25', '08:00:00', '18:00:00', NULL),
('EM04', '2017-09-25', '08:00:00', '16:00:00', NULL),
('EM05', '2017-09-25', '08:00:00', '20:00:00', NULL),
('EM06', '2017-09-25', '08:00:00', '18:00:00', NULL),
('EM07', '2017-09-25', '08:00:00', '23:00:00', NULL),
('EM08', '2017-09-25', '08:00:00', '20:00:00', NULL),
('EM09', '2017-09-25', '08:00:00', '19:00:00', NULL),
('EM10', '2017-09-25', '08:00:00', '21:00:00', NULL);

-- --------------------------------------------------------

--
-- Table structure for table `daily_finances`
--

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
  `Other_cost` float NOT NULL
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
(24, 'September', 2017, 300, 300, 0, 0, 350, 350, 0, 0, 0, 0, 3300, 800, -500, 150),
(26, 'September', 2017, 300, 300, 0, 384535, 280410, 104125, 0, 0, 0, 0, 100, 384835, 280810, 104025);

-- --------------------------------------------------------

--
-- Table structure for table `distribution_item`
--

CREATE TABLE `distribution_item` (
  `Vendor_ID` varchar(10) NOT NULL DEFAULT '',
  `Item_ID` varchar(10) NOT NULL DEFAULT '',
  `Qty` int(11) DEFAULT NULL,
  `Item_Costs` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `financial_reports`
--

CREATE TABLE `financial_reports` (
  `Month_issued` char(10) NOT NULL DEFAULT '',
  `Year_issued` int(11) NOT NULL DEFAULT '0',
  `Total_revenue` float DEFAULT NULL,
  `Total_costs` float DEFAULT NULL,
  `Total_profit` float DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `financial_reports`
--

INSERT INTO `financial_reports` (`Month_issued`, `Year_issued`, `Total_revenue`, `Total_costs`, `Total_profit`) VALUES
('August', 2017, 400, 60, 340),
('September', 2014, 23250, 18750, 4500),
('September', 2017, 408085, 403585, 4500);

-- --------------------------------------------------------

--
-- Table structure for table `item`
--

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
  `status` varchar(20) NOT NULL DEFAULT 'not sold'
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `item`
--

INSERT INTO `item` (`shippingID`, `itemID`, `itemName`, `brand`, `modelCode`, `sellingPrice`, `manufactureDate`, `warrantyPeriod`, `discount`, `status`) VALUES
('SH0001', 'IT10000001', 'J7 Prime', 'Samsung', 'F0xA1', 37000, 'Sep 2, 2015', 365, '5.0%', 'sold'),
('default', 'IT10000002', 'iPhone 6S', 'Apple', 'xxD02', 90000, 'Sep 1, 2017', 365, '0.0%', 'sold'),
('default', 'IT10000004', 'm8', 'Huawei', 'JxDba', 24000, 'Sep 11, 2014', 365, '10.0%', 'sold'),
('SH0002', 'IT10000005', 'm8', 'Huawei', 'JxDba', 24000, 'Sep 11, 2014', 365, '10.0%', 'sold'),
('SH0002', 'IT10000006', 'm8', 'Huawei', 'JxDba', 24000, 'Sep 4, 2015', 0, '0.0%', 'sold'),
('SH0002', 'IT10000007', 'Lumia 406', 'Nokia', 'Nokx1', 21000, 'Sep 30, 2013', 183, '0.0%', 'replace'),
('SH0002', 'IT10000008', 'Lumia 406', 'Nokia', 'Nokx1', 21000, 'Sep 30, 2013', 183, '0.0%', 'replace'),
('SH0002', 'IT10000009', 'Lumia 406', 'Nokia', 'Nokx1', 21000, 'Sep 30, 2013', 183, '0.0%', 'sold'),
('SH0002', 'IT10000010', 'Lumia 406', 'Nokia', 'Nokx1', 21000, 'Sep 30, 2013', 183, '0.0%', 'replace'),
('SH0002', 'IT10000011', 'Lumia 406', 'Nokia', 'Nokx1', 21000, 'Sep 30, 2013', 183, '0.0%', 'not sold'),
('SH0002', 'IT10000012', 'Lumia 406', 'Nokia', 'Nokx1', 21000, 'Sep 30, 2013', 183, '0.0%', 'not sold'),
('SH0002', 'IT10000013', 'Lumia 406', 'Nokia', 'Nokx1', 21000, 'Sep 30, 2013', 183, '0.0%', 'not sold'),
('SH0002', 'IT10000014', 'Lumia 406', 'Nokia', 'Nokx1', 21000, 'Sep 30, 2013', 183, '0.0%', 'not sold'),
('SH0002', 'IT10000015', 'Lumia 406', 'Nokia', 'Nokx1', 21000, 'Sep 30, 2013', 183, '0.0%', 'sold'),
('SH0002', 'IT10000016', 'Lumia 406', 'Nokia', 'Nokx1', 21000, 'Sep 30, 2013', 183, '0.0%', 'sold'),
('SH0002', 'IT10000017', 'Lumia 406', 'Nokia', 'Nokx1', 21000, 'Sep 30, 2013', 183, '0.0%', 'sold'),
('SH0003', 'IT10000018', 's5', 'Samsung', 's5Xz3', 51000, 'Sep 26, 2014', 183, '5.0%', 'not sold'),
('SH0003', 'IT10000019', 's5', 'Samsung', 's5Xz3', 51000, 'Sep 26, 2014', 183, '5.0%', 'not sold'),
('SH0003', 'IT10000020', 's5', 'Samsung', 's5Xz3', 51000, 'Sep 26, 2014', 183, '0.0%', 'not sold'),
('SH0003', 'IT10000021', 's5', 'Samsung', 's5Xz3', 51000, 'Sep 26, 2014', 183, '0.0%', 'not sold'),
('SH0003', 'IT10000022', 's5', 'Samsung', 's5Xz3', 51000, 'Sep 26, 2014', 183, '0.0%', 'not sold'),
('SH0003', 'IT10000023', 's5', 'Samsung', 's5Xz3', 51000, 'Sep 26, 2014', 183, '0.0%', 'not sold'),
('SH0003', 'IT10000024', 'S8 Plus', 'Samsung', 'mm01G', 111000, 'Aug 21, 2017', 730, '0.0%', 'not sold'),
('SH0003', 'IT10000025', 'S8 Plus', 'Samsung', 'mm01G', 111000, 'Aug 21, 2017', 730, '0.0%', 'not sold'),
('SH0003', 'IT10000026', 'S8 Plus', 'Samsung', 'mm01G', 111000, 'Aug 21, 2017', 730, '0.0%', 'sold'),
('SH0003', 'IT10000027', 'S8 Plus', 'Samsung', 'mm01G', 111000, 'Aug 21, 2017', 730, '0.0%', 'not sold'),
('SH0003', 'IT10000028', 'S8 Plus', 'Samsung', 'mm01G', 111000, 'Aug 21, 2017', 730, '0.0%', 'not sold'),
('SH0003', 'IT10000029', 'S8 Plus', 'Samsung', 'mm01G', 111000, 'Aug 21, 2017', 730, '0.0%', 'not sold'),
('SH0003', 'IT10000030', 'S8 Plus', 'Samsung', 'mm01G', 111000, 'Aug 21, 2017', 730, '0.0%', 'not sold'),
('SH0003', 'IT10000031', 'S8 Plus', 'Samsung', 'mm01G', 111000, 'Aug 21, 2017', 730, '0.0%', 'not sold'),
('SH0003', 'IT10000032', 'S8 Plus', 'Samsung', 'mm01G', 111000, 'Aug 21, 2017', 730, '0.0%', 'not sold'),
('SH0003', 'IT10000033', 'S8 Plus', 'Samsung', 'mm01G', 111000, 'Aug 21, 2017', 730, '0.0%', 'not sold'),
('SH0003', 'IT10000034', 'S8 Plus', 'Samsung', 'mm01G', 111000, 'Aug 21, 2017', 730, '0.0%', 'not sold'),
('SH0003', 'IT10000035', 'S8 Plus', 'Samsung', 'mm01G', 111000, 'Aug 21, 2017', 730, '0.0%', 'not sold'),
('SH0003', 'IT10000036', 'S8 Plus', 'Samsung', 'mm01G', 111000, 'Aug 21, 2017', 730, '0.0%', 'not sold'),
('SH0003', 'IT10000037', 'S8 Plus', 'Samsung', 'mm01G', 111000, 'Aug 21, 2017', 730, '0.0%', 'not sold'),
('SH0003', 'IT10000038', 'S8 Plus', 'Samsung', 'mm01G', 111000, 'Aug 21, 2017', 730, '0.0%', 'not sold'),
('SH0003', 'IT10000039', 'S8 Plus', 'Samsung', 'mm01G', 111000, 'Aug 21, 2017', 730, '0.0%', 'not sold'),
('SH0003', 'IT10000040', 'S8 Plus', 'Samsung', 'mm01G', 111000, 'Aug 21, 2017', 730, '0.0%', 'not sold'),
('SH0003', 'IT10000041', 'S8 Plus', 'Samsung', 'mm01G', 111000, 'Aug 21, 2017', 730, '0.0%', 'not sold'),
('SH0003', 'IT10000042', 'S8 Plus', 'Samsung', 'mm01G', 111000, 'Aug 21, 2017', 730, '0.0%', 'not sold'),
('SH0003', 'IT10000043', 'S8 Plus', 'Samsung', 'mm01G', 111000, 'Aug 21, 2017', 730, '0.0%', 'not sold'),
('SH0003', 'IT10000044', 'S8 Plus', 'Samsung', 'mm01G', 111000, 'Aug 21, 2017', 730, '0.0%', 'not sold'),
('SH0003', 'IT10000045', 'S8 Plus', 'Samsung', 'mm01G', 111000, 'Aug 21, 2017', 730, '0.0%', 'not sold'),
('SH0003', 'IT10000046', 'S8 Plus', 'Samsung', 'mm01G', 111000, 'Aug 21, 2017', 730, '0.0%', 'not sold'),
('SH0003', 'IT10000047', 'S8 Plus', 'Samsung', 'mm01G', 111000, 'Aug 21, 2017', 730, '0.0%', 'not sold'),
('SH0003', 'IT10000048', 'S8 Plus', 'Samsung', 'mm01G', 111000, 'Aug 21, 2017', 730, '0.0%', 'not sold'),
('SH0003', 'IT10000049', 'S8 Plus', 'Samsung', 'mm01G', 111000, 'Aug 21, 2017', 730, '0.0%', 'not sold'),
('SH0003', 'IT10000050', 'S8 Plus', 'Samsung', 'mm01G', 111000, 'Aug 21, 2017', 730, '0.0%', 'not sold'),
('SH0003', 'IT10000051', 'S8 Plus', 'Samsung', 'mm01G', 111000, 'Aug 21, 2017', 730, '0.0%', 'not sold'),
('SH0003', 'IT10000052', 'S8 Plus', 'Samsung', 'mm01G', 111000, 'Aug 21, 2017', 730, '0.0%', 'not sold'),
('SH0003', 'IT10000053', 'S8 Plus', 'Samsung', 'mm01G', 111000, 'Aug 21, 2017', 730, '0.0%', 'not sold'),
('SH0003', 'IT10000054', 'S8 Plus', 'Samsung', 'mm01G', 111000, 'Aug 21, 2017', 730, '0.0%', 'not sold'),
('SH0003', 'IT10000055', 'S8 Plus', 'Samsung', 'mm01G', 111000, 'Aug 21, 2017', 730, '0.0%', 'not sold'),
('SH0003', 'IT10000056', 'S8 Plus', 'Samsung', 'mm01G', 111000, 'Aug 21, 2017', 730, '0.0%', 'not sold'),
('SH0003', 'IT10000057', 'J7 Prime', 'Samsung', 'F0xA1', 111000, 'Aug 21, 2017', 730, '0.0%', 'not sold'),
('SH0003', 'IT10000058', 'J7 Prime', 'Samsung', 'F0xA1', 111000, 'Aug 21, 2017', 730, '0.0%', 'not sold'),
('SH0003', 'IT10000059', 'J7 Prime', 'Samsung', 'F0xA1', 111000, 'Aug 21, 2017', 730, '0.0%', 'not sold'),
('SH0003', 'IT10000060', 'J7 Prime', 'Samsung', 'F0xA1', 111000, 'Aug 21, 2017', 730, '0.0%', 'not sold'),
('SH0003', 'IT10000061', 'J7 Prime', 'Samsung', 'F0xA1', 111000, 'Aug 21, 2017', 730, '0.0%', 'not sold'),
('SH0003', 'IT10000062', 'J7 Prime', 'Samsung', 'F0xA1', 111000, 'Aug 21, 2017', 730, '0.0%', 'not sold'),
('SH0003', 'IT10000063', 'J7 Prime', 'Samsung', 'F0xA1', 111000, 'Aug 21, 2017', 730, '0.0%', 'not sold'),
('SH0003', 'IT10000064', 'J7 Prime', 'Samsung', 'F0xA1', 111000, 'Aug 21, 2017', 730, '0.0%', 'not sold'),
('SH0003', 'IT10000066', 'J7 Prime', 'Samsung', 'F0xA1', 111000, 'Aug 21, 2017', 730, '0.0%', 'not sold'),
('default', 'IT10000067', 'J7 ', 'Samsung', 'Sd098', 50000, 'Sep 1, 2017', 365, '5.0%', 'not sold');

--
-- Triggers `item`
--
DELIMITER $$
CREATE TRIGGER `ffs` AFTER DELETE ON `item` FOR EACH ROW BEGIN
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
$$
DELIMITER ;

-- --------------------------------------------------------

--
-- Table structure for table `job`
--

CREATE TABLE `job` (
  `JobID` char(5) NOT NULL,
  `JobName` varchar(20) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `monthlyatttendance`
--

CREATE TABLE `monthlyatttendance` (
  `EmpID` varchar(10) NOT NULL,
  `Month` varchar(10) NOT NULL,
  `WorkingHours` int(11) NOT NULL,
  `OtHours` int(11) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `monthlyatttendance`
--

INSERT INTO `monthlyatttendance` (`EmpID`, `Month`, `WorkingHours`, `OtHours`) VALUES
('EM01', 'January', 160, 10),
('EM02', 'February', 100, 20),
('EM03', 'March', 130, 15),
('EM04', 'April', 115, 15),
('EM05', 'May', 100, 5),
('EM06', 'June', 157, 25),
('EM07', 'July', 147, 40),
('EM08', 'August', 126, 43),
('EM09', 'September', 114, 25),
('EM10', 'December', 116, 12);

-- --------------------------------------------------------

--
-- Table structure for table `monthlysal`
--

CREATE TABLE `monthlysal` (
  `EmpID` varchar(10) NOT NULL,
  `Month` varchar(10) NOT NULL,
  `GrossSalary` double NOT NULL,
  `EPF8` double NOT NULL,
  `ETF12` double NOT NULL,
  `ETF3` double NOT NULL,
  `NetSalary` double NOT NULL,
  `wrhr` double NOT NULL,
  `othr` double NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `monthlysal`
--

INSERT INTO `monthlysal` (`EmpID`, `Month`, `GrossSalary`, `EPF8`, `ETF12`, `ETF3`, `NetSalary`, `wrhr`, `othr`) VALUES
('EM01      ', '1', 45000, 3200, 4800, 1200, 41800, 160, 10),
('EM02   ', '2', 29000, 1600, 2400, 600, 27400, 100, 20),
('EM03', '3', 26750, 1600, 2400, 600, 25150, 130, 15),
('EM04', '4', 24000, 1440, 2160, 540, 22560, 115, 15),
('EM05', '5', 19750, 1440, 2160, 540, 18310, 100, 5),
('EM06', '6', 80000, 4800, 7200, 1800, 75200, 157, 25),
('EM07', '7', 18000, 640, 960, 240, 17360, 147, 40),
('EM08', '8', 18750, 640, 960, 240, 18110, 126, 43),
('EM09', '9', 18750, 800, 1200, 300, 17950, 114, 25),
('EM10', '12', 14200, 800, 1200, 300, 13400, 116, 12);

-- --------------------------------------------------------

--
-- Table structure for table `pastemployee`
--

CREATE TABLE `pastemployee` (
  `EmpID` varchar(10) NOT NULL,
  `EmpName` varchar(50) NOT NULL,
  `DOB` date NOT NULL,
  `EmpAddress` varchar(50) NOT NULL,
  `EmpEmail` varchar(50) NOT NULL,
  `EmpPhone` int(10) NOT NULL,
  `JobID` char(5) NOT NULL,
  `JobS_date` date NOT NULL,
  `JobE_date` date NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `phonerepair`
--

CREATE TABLE `phonerepair` (
  `repairID` int(100) NOT NULL,
  `Brand` varchar(20) NOT NULL,
  `itemName` varchar(50) NOT NULL,
  `problem` varchar(200) NOT NULL,
  `EmpID` int(11) NOT NULL,
  `repairDueDate` varchar(10) NOT NULL,
  `EstimatedCost` double NOT NULL,
  `RequestDate` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `phonerepair`
--

INSERT INTO `phonerepair` (`repairID`, `Brand`, `itemName`, `problem`, `EmpID`, `repairDueDate`, `EstimatedCost`, `RequestDate`) VALUES
(2, 'kdfkd', '', 'dcdcd', 0, '2/3/2', 12, ''),
(6, 'kdfkd', 'askhdjh', 'dcdcd', 0, '2/3/2', 12, '1316'),
(7, 'Hel', 'juju', 'he', 12, '12/7/17', 4587, '27/8/17'),
(8, 'asdb', 'asjd', 'askjdh', 1, 'dasdjhk', 2121, '5154');

-- --------------------------------------------------------

--
-- Table structure for table `reorder`
--

CREATE TABLE `reorder` (
  `reOrderID` varchar(10) NOT NULL,
  `vendorID` varchar(10) NOT NULL,
  `brand` varchar(20) NOT NULL,
  `modelCode` varchar(20) NOT NULL,
  `qty` int(11) NOT NULL,
  `totalCost` double NOT NULL,
  `RequestDate` varchar(20) NOT NULL,
  `RequestTime` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `reorder`
--

INSERT INTO `reorder` (`reOrderID`, `vendorID`, `brand`, `modelCode`, `qty`, `totalCost`, `RequestDate`, `RequestTime`) VALUES
('RE10000001', 'VENDOR01', 'Samsung', 'F0xA1', 10, 350, '23 September 2017', '7:20 PM'),
('RE10000002', 'V0001', 'asds', 'sdsdsd', 1, 2, '25 September 2017', '3:50 PM'),
('RE10000003', 'V0001', 'asds', 'sdsdsd', 1, 2, '25 September 2017', '3:50 PM'),
('RE10000004', 'V0001', 's', 's', 2, 4, '25 September 2017', '3:52 PM'),
('RE10000005', 'V0001', 'sdsd', 'jk', 1, 1, '25 September 2017', '4:12 PM'),
('RE10000006', 'V0001', 'msms', 'sd', 2, 4, '25 September 2017', '4:20 PM'),
('RE10000007', 'V0001', 'sad', 'sad', 1, 1, '25 September 2017', '4:36 PM'),
('RE10000008', 'V0003', 'asd', 'sadasd', 2, 40, '25 September 2017', '4:42 PM'),
('RE10000009', 'V0001', 'Samsung', 'asdasd', 2, 2, '25 September 2017', '7:37 PM'),
('RE10000010', 'V0001', 'Samsung', 'A0xF1', 2, 40000, '25 September 2017', '9:49 PM'),
('RE10000011', 'V0001', 'Samsung', 'FF0xa', 2, 180000, '26 September 2017', '11:57 AM'),
('RE10000012', 'V0001', 'sss', 'sss', 2, 4, '26 September 2017', '3:52 PM'),
('RE10000013', 'V0001', 'aaa', 'Sdf0A', 2, 60000, '26 September 2017', '4:42 PM');

-- --------------------------------------------------------

--
-- Table structure for table `repaircheckout`
--

CREATE TABLE `repaircheckout` (
  `repairID` int(100) NOT NULL,
  `Service_Charges` int(11) NOT NULL,
  `repair_Cost` int(11) NOT NULL,
  `finalCost` double NOT NULL,
  `status` varchar(50) NOT NULL,
  `checkout_ID` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `repaircheckout`
--

INSERT INTO `repaircheckout` (`repairID`, `Service_Charges`, `repair_Cost`, `finalCost`, `status`, `checkout_ID`) VALUES
(4, 16154, 13216, 13214, 'Pending', 2),
(2, 464, 8979, 1797, 'sakj', 3);

-- --------------------------------------------------------

--
-- Table structure for table `repair_customer`
--

CREATE TABLE `repair_customer` (
  `cust_id` int(100) NOT NULL,
  `name` varchar(40) NOT NULL,
  `email` varchar(50) NOT NULL,
  `phone` int(10) NOT NULL,
  `address` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `repair_customer`
--

INSERT INTO `repair_customer` (`cust_id`, `name`, `email`, `phone`, `address`) VALUES
(2, 'hehjkh', 'daksjlaskdj@gmail.com', 1354, 'dasjdhkajsd'),
(3, 'hkj', 'adslkd', 646, 'asdnlasd');

-- --------------------------------------------------------

--
-- Table structure for table `replace_item`
--

CREATE TABLE `replace_item` (
  `previous_item_code` varchar(10) NOT NULL,
  `new_Item_code` varchar(10) NOT NULL,
  `bill_number` varchar(10) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `replace_item`
--

INSERT INTO `replace_item` (`previous_item_code`, `new_Item_code`, `bill_number`) VALUES
('IT10000007', 'IT10000008', 'BN10000005'),
('IT10000010', 'IT10000011', 'BN10000006'),
('IT10000008', 'IT10000018', 'BN10000006');

-- --------------------------------------------------------

--
-- Table structure for table `salaryrate`
--

CREATE TABLE `salaryrate` (
  `JobID` char(5) NOT NULL,
  `dailyRate` double NOT NULL,
  `otRate` double NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `shipping_rec`
--

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
  `Year` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `shipping_rec`
--

INSERT INTO `shipping_rec` (`Shipping_ID`, `Vendor_ID`, `modelCode`, `ship_type`, `qty`, `item_cost`, `Shipping_Cost`, `Day`, `Month`, `Year`) VALUES
('default', 'V0002', 'xss', 'country', 0, 4000, 100, 19, 'March', 2016),
('SH0001', 'V0003', 'x309ks', 'country', 0, 2000, 400, 19, 'January', 2016),
('SH0002', 'V0001', 'FAb01', 'abroad', 0, 3000, 20000, 12, 'January', 2017),
('SH0003', 'V0001', 'FAx01', 'abroad', 0, 9000, 10000, 12, 'January', 2017),
('SH0004', 'V0001', 'GAx01', 'abroad', 0, 5000, 1000, 12, 'January', 2017);

-- --------------------------------------------------------

--
-- Table structure for table `sold_item`
--

CREATE TABLE `sold_item` (
  `item_code` varchar(10) NOT NULL,
  `bill_number` varchar(10) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `sold_item`
--

INSERT INTO `sold_item` (`item_code`, `bill_number`) VALUES
('IT10000001', 'BN10000001'),
('IT10000002', 'BN10000002'),
('IT10000004', 'BN10000002'),
('IT10000005', 'BN10000003'),
('IT10000026', 'BN10000004'),
('IT10000006', 'BN10000005'),
('IT10000007', 'BN10000005'),
('IT10000008', 'BN10000006'),
('IT10000009', 'BN10000006'),
('IT10000010', 'BN10000006'),
('IT10000015', 'BN10000007'),
('IT10000016', 'BN10000008'),
('IT10000017', 'BN10000008');

-- --------------------------------------------------------

--
-- Table structure for table `useraccount`
--

CREATE TABLE `useraccount` (
  `EmpID` varchar(10) NOT NULL,
  `Name` varchar(50) NOT NULL,
  `UserName` varchar(10) NOT NULL,
  `Password` varchar(10) NOT NULL,
  `Email` varchar(50) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `vendor`
--

CREATE TABLE `vendor` (
  `Vendor_ID` varchar(10) NOT NULL DEFAULT '',
  `Vendor_name` varchar(10) DEFAULT NULL,
  `Address` varchar(10) DEFAULT NULL,
  `Email` varchar(50) DEFAULT NULL,
  `Telephone` int(11) DEFAULT NULL,
  `Shipping_Cost_ph` float DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `vendor`
--

INSERT INTO `vendor` (`Vendor_ID`, `Vendor_name`, `Address`, `Email`, `Telephone`, `Shipping_Cost_ph`) VALUES
('V0001', 'Amazin', '12, Galle ', 'sonalrathnayake6@gmail.com', 112594028, 300),
('V0002', 'Appule', '142, Chakk', 'appule@gmail.com', 112839204, 400),
('V0003', 'Macrosoft', '7, 5th lan', 'buddhimith@gmail.com', 112483927, 250),
('V555', 'xyz', 'galle road', 'xyz@gmail.com', 2500701, 200);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `availablestock`
--
ALTER TABLE `availablestock`
  ADD PRIMARY KEY (`modelCode`);

--
-- Indexes for table `bill`
--
ALTER TABLE `bill`
  ADD PRIMARY KEY (`bill_number`);

--
-- Indexes for table `currentemployee`
--
ALTER TABLE `currentemployee`
  ADD PRIMARY KEY (`EmpID`);

--
-- Indexes for table `customer`
--
ALTER TABLE `customer`
  ADD PRIMARY KEY (`customer_id`);

--
-- Indexes for table `dailyattendance`
--
ALTER TABLE `dailyattendance`
  ADD PRIMARY KEY (`EmpID`);

--
-- Indexes for table `daily_finances`
--
ALTER TABLE `daily_finances`
  ADD PRIMARY KEY (`Day`,`Month`,`Year`);

--
-- Indexes for table `distribution_item`
--
ALTER TABLE `distribution_item`
  ADD PRIMARY KEY (`Vendor_ID`,`Item_ID`);

--
-- Indexes for table `financial_reports`
--
ALTER TABLE `financial_reports`
  ADD PRIMARY KEY (`Month_issued`,`Year_issued`);

--
-- Indexes for table `item`
--
ALTER TABLE `item`
  ADD PRIMARY KEY (`itemID`);

--
-- Indexes for table `job`
--
ALTER TABLE `job`
  ADD PRIMARY KEY (`JobID`);

--
-- Indexes for table `monthlyatttendance`
--
ALTER TABLE `monthlyatttendance`
  ADD PRIMARY KEY (`EmpID`);

--
-- Indexes for table `monthlysal`
--
ALTER TABLE `monthlysal`
  ADD PRIMARY KEY (`EmpID`);

--
-- Indexes for table `pastemployee`
--
ALTER TABLE `pastemployee`
  ADD PRIMARY KEY (`EmpID`);

--
-- Indexes for table `phonerepair`
--
ALTER TABLE `phonerepair`
  ADD PRIMARY KEY (`repairID`);

--
-- Indexes for table `reorder`
--
ALTER TABLE `reorder`
  ADD PRIMARY KEY (`reOrderID`);

--
-- Indexes for table `repaircheckout`
--
ALTER TABLE `repaircheckout`
  ADD PRIMARY KEY (`checkout_ID`);

--
-- Indexes for table `repair_customer`
--
ALTER TABLE `repair_customer`
  ADD PRIMARY KEY (`cust_id`);

--
-- Indexes for table `salaryrate`
--
ALTER TABLE `salaryrate`
  ADD PRIMARY KEY (`JobID`);

--
-- Indexes for table `shipping_rec`
--
ALTER TABLE `shipping_rec`
  ADD PRIMARY KEY (`Shipping_ID`);

--
-- Indexes for table `useraccount`
--
ALTER TABLE `useraccount`
  ADD PRIMARY KEY (`EmpID`),
  ADD UNIQUE KEY `UserName` (`UserName`);

--
-- Indexes for table `vendor`
--
ALTER TABLE `vendor`
  ADD PRIMARY KEY (`Vendor_ID`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `phonerepair`
--
ALTER TABLE `phonerepair`
  MODIFY `repairID` int(100) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;
--
-- AUTO_INCREMENT for table `repaircheckout`
--
ALTER TABLE `repaircheckout`
  MODIFY `checkout_ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
--
-- AUTO_INCREMENT for table `repair_customer`
--
ALTER TABLE `repair_customer`
  MODIFY `cust_id` int(100) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

CREATE TABLE `adminuser` (
  `id` int(11) NOT NULL,
  `username` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `adminuser`
--

INSERT INTO `adminuser` (`id`, `username`, `password`) VALUES
(1, 'admin', 'admin');

--
-- Table structure for table `orders`
--

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

--
-- Dumping data for table `orders`
--

INSERT INTO `orders` (`id`, `productId`, `product`, `price`, `quantity`, `discount`, `total`, `user`, `buyDate`) VALUES
(29, '10010', 'SAMSUNG J2', 20000, 1, 10, 18000, 'aaa', '2017-09-23 11:39:30'),
(30, '10010', 'Iphone 6s', 82000, 1, 10, 73800, 'aaa', '2017-09-23 12:44:10'),
(31, '10010', 'SAMSUNG J2', 20000, 2, 10, 36000, 'pesh', '2017-09-24 01:31:28'),
(32, '10011', 'Iphone 6s', 82000, 1, 10, 73800, 'sonal', '2017-09-24 02:51:47'),
(33, '10010', 'SAMSUNG J2', 20000, 2, 10, 36000, 'sonal', '2017-09-24 03:01:01'),
(34, '10011', 'Iphone 6s', 82000, 1, 10, 73800, 'mala', '2017-09-24 08:02:42'),
(35, '10011', 'Iphone 6s', 82000, 1, 10, 73800, 'mala', '2017-09-24 08:08:19'),
(36, '10011', 'Iphone 6s', 82000, 1, 10, 73800, 'mala', '2017-09-24 08:08:28'),
(37, '10011', 'Iphone 6s', 82000, 1, 10, 73800, 'mala', '2017-09-24 23:51:35'),
(38, '10013', 'SAMSUNG J2', 94900, 1, 10, 85410, 'mala', '2017-09-25 01:02:46'),
(39, '10010', 'Nokia 8', 50000, 1, 10, 45000, 'mala', '2017-09-25 01:21:44'),
(40, '10010', 'Nokia 8', 50000, 1, 10, 45000, 'mala', '2017-09-25 01:22:56'),
(41, '10010', 'Nokia 8', 50000, 1, 10, 45000, 'mala', '2017-09-25 01:23:04'),
(42, '10018', 'OPPO F3', 35900, 1, 10, 32310, 'mala', '2017-09-26 08:09:04'),
(43, '10018', 'OPPO F3', 35900, 1, 10, 32310, 'mala', '2017-09-26 08:09:37'),
(44, '10018', 'OPPO F3', 35900, 1, 10, 32310, 'mala', '2017-09-26 08:10:03'),
(45, '10019', 'LG V20', 79900, 1, 10, 71910, 'mala', '2017-09-26 08:10:47'),
(46, '10011', 'Iphone 6s', 82000, 1, 10, 73800, 'mala', '2017-09-26 08:11:07'),
(47, '10018', 'OPPO F3', 35900, 1, 10, 32310, 'mala', '2017-09-26 08:19:15'),
(48, '10018', 'OPPO F3', 35900, 1, 10, 32310, 'sanka', '2017-09-26 08:40:14'),
(49, '10011', 'Iphone 6s', 82000, 1, 10, 73800, 'aa', '0000-00-00 00:00:00'),
(50, '10011', 'Iphone 6s', 82000, 1, 10, 73800, 'pesha', '0000-00-00 00:00:00'),
(51, '10011', 'Iphone 6s', 82000, 1, 10, 73800, 'sana', '0000-00-00 00:00:00'),
(52, '10011', 'Iphone 6s', 82000, 1, 10, 73800, 'mala', '0000-00-00 00:00:00'),
(53, '10011', 'Iphone 6s', 82000, 1, 10, 73800, 'mala', '0000-00-00 00:00:00');

-- --------------------------------------------------------

--
-- Table structure for table `rating`
--

CREATE TABLE `rating` (
  `id` int(11) NOT NULL,
  `name` varchar(40) NOT NULL,
  `rating` varchar(50) NOT NULL,
  `rating_1` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `rating`
--

INSERT INTO `rating` (`id`, `name`, `rating`, `rating_1`) VALUES
(4, 'sepali', 'VERY SATISFIED', 'DEFINETLY'),
(5, 'sepali', 'VERY SATISFIED', 'DEFINETLY'),
(6, 'sanka', 'SATISFIED', 'PROBABLY');

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `id` int(11) NOT NULL,
  `firstName` varchar(50) NOT NULL,
  `lastName` varchar(50) NOT NULL,
  `email` varchar(50) NOT NULL,
  `hashedPassword` varchar(50) NOT NULL,
  `lastLogin` datetime NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`id`, `firstName`, `lastName`, `email`, `hashedPassword`, `lastLogin`) VALUES
(1, 'Chamara', 'Siriwardena', 'chamara@gmail.com', '7110eda4d09e062aa5e4a390b0a572ac0d2c0220', '0000-00-00 00:00:00'),
(2, 'mala', 'perera', 'mala@gmail.com', '6216f8a75fd5bb3d5f22b6f9958cdede3fc086c2', '2017-09-29 00:42:34'),
(3, 'sanka', 'karu', 'sanka@gmail.com', '6216f8a75fd5bb3d5f22b6f9958cdede3fc086c2', '2017-09-26 08:33:19'),
(4, 'aaa', 'bbb', 'aaa@gmail.com', '6216f8a75fd5bb3d5f22b6f9958cdede3fc086c2', '0000-00-00 00:00:00'),
(5, 'pesh', 'herath', 'pesh@gmail.com', '6216f8a75fd5bb3d5f22b6f9958cdede3fc086c2', '0000-00-00 00:00:00'),
(6, 'sonal', 'rathnayaka', 'sonal@gmail.com', '6216f8a75fd5bb3d5f22b6f9958cdede3fc086c2', '0000-00-00 00:00:00'),
(7, 'sonali_00', 'rathnayaka', 'sonali@gmail.com', '6216f8a75fd5bb3d5f22b6f9958cdede3fc086c2', '0000-00-00 00:00:00'),
(8, 'sonali', 'rathnayaka', 'sonalika@gmail.com', '1c6637a8f2e1f75e06ff9984894d6bd16a3a36a9', '0000-00-00 00:00:00'),
(9, 'aa', 'bb', 'ab@gmail.com', '6216f8a75fd5bb3d5f22b6f9958cdede3fc086c2', '2017-09-26 08:59:15'),
(10, 'bunty', 'perera', 'bunty@gmail.com', '33f552949e2755ac09ff7ee60ebd4fda5c809673', '2017-09-26 08:44:17'),
(11, 'pesha', 'njali', 'pesha@gmail.com', '0570f07980c2dc99002c78e6948c2fa025323bdb', '2017-09-27 00:23:58'),
(12, 'sana', 'karu', 'sana@gmai.com', '2d02423239ebd21ca00d5ef5accfec26910609e9', '2017-09-27 01:57:25');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `adminuser`
--
ALTER TABLE `adminuser`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `devices`
--
ALTER TABLE `devices`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `orders`
--
ALTER TABLE `orders`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `rating`
--
ALTER TABLE `rating`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `adminuser`
--
ALTER TABLE `adminuser`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT for table `devices`
--
ALTER TABLE `devices`
  MODIFY `id` int(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;
--
-- AUTO_INCREMENT for table `orders`
--
ALTER TABLE `orders`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=54;
--
-- AUTO_INCREMENT for table `rating`
--
ALTER TABLE `rating`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;
--
-- AUTO_INCREMENT for table `user`
--
ALTER TABLE `user`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
