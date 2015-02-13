-- phpMyAdmin SQL Dump
-- version 4.2.4
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: 2015-02-13 21:59:47
-- 服务器版本： 5.5.41-0ubuntu0.14.10.1
-- PHP Version: 5.5.12-2ubuntu4.1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `makeropen`
--

-- --------------------------------------------------------

--
-- 表的结构 `login_token`
--

CREATE TABLE IF NOT EXISTS `login_token` (
  `id` bigint(20) NOT NULL,
  `ownerId` bigint(20) NOT NULL,
  `machineId` varchar(80) NOT NULL,
  `token` varchar(80) NOT NULL,
  `flagBit` bigint(20) NOT NULL,
  `features` varchar(1000) NOT NULL,
  `createTime` timestamp NULL DEFAULT NULL,
  `updateTime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `login_token`
--
ALTER TABLE `login_token`
 ADD KEY `ownerId` (`ownerId`,`token`,`flagBit`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
