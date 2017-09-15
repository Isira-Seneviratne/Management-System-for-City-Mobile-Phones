-- phpMyAdmin SQL Dump
-- version 4.5.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Sep 10, 2017 at 07:52 AM
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
  `Bill Number` varchar(10) NOT NULL,
  `Customer ID` varchar(10) NOT NULL,
  `Time` time NOT NULL,
  `Date` date NOT NULL
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
('CI00000001', 'tg', 'gbtg', 1234, 1456, 'male', 'as', 'fd', NULL);

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
  `selling_price` double NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `item`
--

INSERT INTO `item` (`item_code`, `item_name`, `brand`, `manufacture_date`, `warranty_period`, `discount`, `selling_price`) VALUES
('ic123', 's8', 'samsung', '2017-04-18', 365, 0, 1000000),
('ic456', 's7', 'samsung', '2016-05-25', 365, 5000, 100000);

-- --------------------------------------------------------

--
-- Table structure for table `loyalty customer`
--

CREATE TABLE `loyalty customer` (
  `Customer Id` varchar(10) NOT NULL,
  `Loyalty level` varchar(20) NOT NULL,
  `Loyalty discount` double(10,0) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `payment`
--

CREATE TABLE `payment` (
  `Bill Number` varchar(10) NOT NULL,
  `Payment Type` tinyint(1) NOT NULL,
  `Special discount` double NOT NULL,
  `Net Amount` double NOT NULL,
  `Amount paid` double NOT NULL,
  `Balance` double NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `replace item`
--

CREATE TABLE `replace item` (
  `Previous Item code` varchar(10) NOT NULL,
  `New Item code` varchar(10) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `sold item`
--

CREATE TABLE `sold item` (
  `Item code` varchar(10) NOT NULL,
  `Bill Id` varchar(10) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
