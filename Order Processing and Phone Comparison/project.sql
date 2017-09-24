-- phpMyAdmin SQL Dump
-- version 4.7.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Sep 17, 2017 at 05:30 PM
-- Server version: 10.1.25-MariaDB
-- PHP Version: 7.1.7

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `project`
--

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `id` int(11) NOT NULL,
  `firstName` varchar(50) NOT NULL,
  `lastName` varchar(100) NOT NULL,
  `email` varchar(100) NOT NULL,
  `hashedPassword` varchar(40) NOT NULL,
  `lastLogin` datetime NOT NULL,
  `isDeleted` varchar(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`id`, `firstName`, `lastName`, `email`, `hashedPassword`, `lastLogin`, `isDeleted`) VALUES
(2, 'Dinusha', 'Ranatunga', 'dinusha.roshan@gmail.com', '9d4e1e23bd5b727046a9e3b4b7db57bd8d6ee684', '0000-00-00 00:00:00', '0'),
(3, 'Chaminda', 'Perera', 'chaminda@gmail.com', 'aaf4c61ddcc5e8a2dabede0f3b482cd9aea9434d', '0000-00-00 00:00:00', '0'),
(4, 'Chaminda', 'Perera', 'chaminda@gmail.com', 'aaf4c61ddcc5e8a2dabede0f3b482cd9aea9434d', '0000-00-00 00:00:00', '0'),
(5, 'Chaminda', 'Perera', 'chaminda@gmail.com', 'aaf4c61ddcc5e8a2dabede0f3b482cd9aea9434d', '0000-00-00 00:00:00', '0'),
(7, 'Chaminda', 'Perera', 'chaminda@gmail.com', 'aaf4c61ddcc5e8a2dabede0f3b482cd9aea9434d', '0000-00-00 00:00:00', '0'),
(10, 'Chaminda', 'Perera', 'chaminda@gmail.com', 'aaf4c61ddcc5e8a2dabede0f3b482cd9aea9434d', '0000-00-00 00:00:00', '0'),
(20, 'Saman', 'Silva', 'saman@gmail.com', '7110eda4d09e062aa5e4a390b0a572ac0d2c0220', '0000-00-00 00:00:00', ''),
(22, 'Saman', 'Silva', 'saman@gmail.com', '7110eda4d09e062aa5e4a390b0a572ac0d2c0220', '0000-00-00 00:00:00', ''),
(37, 'Chaminda', 'Perera', 'chaminda@gmail.com', 'aaf4c61ddcc5e8a2dabede0f3b482cd9aea9434d', '0000-00-00 00:00:00', '0');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `user`
--
ALTER TABLE `user`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=42;COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
