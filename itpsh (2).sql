-- phpMyAdmin SQL Dump
-- version 4.5.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Sep 11, 2017 at 06:24 PM
-- Server version: 5.7.11
-- PHP Version: 5.6.19

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `itpsh`
--

-- --------------------------------------------------------

--
-- Table structure for table `bill`
--

CREATE TABLE `bill` (
  `bill_number` varchar(10) NOT NULL,
  `customer_id` varchar(10) NOT NULL,
  `num_of_items` int(11) NOT NULL,
  `time` time NOT NULL,
  `date` date NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `customer`
--

CREATE TABLE `customer` (
  `customer_id` varchar(10) DEFAULT NULL,
  `fname` varchar(50) DEFAULT NULL,
  `lname` varchar(50) DEFAULT NULL,
  `phone_num1` int(10) DEFAULT NULL,
  `phone_num2` int(10) DEFAULT NULL,
  `gender` varchar(10) DEFAULT NULL,
  `address` varchar(100) DEFAULT NULL,
  `city` varchar(50) DEFAULT NULL,
  `tot_spent_money` double DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `customer`
--

INSERT INTO `customer` (`customer_id`, `fname`, `lname`, `phone_num1`, `phone_num2`, `gender`, `address`, `city`, `tot_spent_money`) VALUES
('123', 'tg', 'gt', 123, 321, 'male', '1b', 'pil', 1000),
('hr', 'hg', 'hf', 546, 21, 'male', 'hh', 'thdg', NULL),
('CI00000001', 'tg', 'tg', 123, 123, 'male', 'jk', 'fg', NULL),
('CI00000001', 'tg', 'tg', 123, 123, 'male', 'ma', 'gt', NULL),
('CI00000001', 'tg', 'gbtg', 1234, 1456, 'male', 'as', 'fd', NULL),
('CI00000001', 'fdfg', 'dd', 55, 53, 'male', 'jt', 'jt', NULL),
('CI00000001', 'thbr', 'thr', 55, 5335, 'male', 'hrt', 'thfr', NULL);

-- --------------------------------------------------------

--
-- Table structure for table `item`
--

CREATE TABLE `item` (
  `item_code` varchar(10) NOT NULL,
  `item_name` varchar(50) NOT NULL,
  `brand` varchar(50) NOT NULL,
  `manufacture_date` date NOT NULL,
  `warranty_period` int(11) NOT NULL,
  `discount` double DEFAULT NULL,
  `selling_price` double NOT NULL,
  `status` varchar(20) NOT NULL DEFAULT 'not sold'
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `item`
--

INSERT INTO `item` (`item_code`, `item_name`, `brand`, `manufacture_date`, `warranty_period`, `discount`, `selling_price`, `status`) VALUES
('ic123', 's8', 'samsung', '2017-04-18', 365, 0, 1000000, 'not sold'),
('ic456', 's7', 'samsung', '2016-05-25', 365, 5000, 100000, 'not sold');

-- --------------------------------------------------------

--
-- Table structure for table `loyalty customer`
--

CREATE TABLE `loyalty customer` (
  `customer_Id` varchar(10) NOT NULL,
  `loyalty_level` varchar(20) NOT NULL,
  `loyalty_discount` double(10,0) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `payment`
--

CREATE TABLE `payment` (
  `bill_number` varchar(10) NOT NULL,
  `payment_type` tinyint(1) NOT NULL,
  `extra_charges` int(11) DEFAULT NULL,
  `loyalty_discount` int(11) DEFAULT NULL,
  `special_discount` double DEFAULT NULL,
  `net_amount` double NOT NULL,
  `amount_paid` double NOT NULL,
  `balance` double NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `replace item`
--

CREATE TABLE `replace item` (
  `previous_item_code` varchar(10) NOT NULL,
  `new_Item_code` varchar(10) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `sold item`
--

CREATE TABLE `sold item` (
  `item_code` varchar(10) NOT NULL,
  `bill_number` varchar(10) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
