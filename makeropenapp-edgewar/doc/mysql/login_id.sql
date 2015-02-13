-- phpMyAdmin SQL Dump
-- version 4.2.4
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: 2015-02-13 21:59:13
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
-- 表的结构 `login_id`
--

CREATE TABLE IF NOT EXISTS `login_id` (
`id` bigint(20) NOT NULL,
  `ownerId` bigint(20) NOT NULL,
  `loginId` varchar(20) NOT NULL,
  `status` smallint(6) NOT NULL,
  `flagBit` bigint(20) NOT NULL,
  `features` varchar(1000) NOT NULL,
  `createTime` timestamp NULL DEFAULT NULL,
  `updateTime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 AUTO_INCREMENT=1 ;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `login_id`
--
ALTER TABLE `login_id`
 ADD PRIMARY KEY (`id`), ADD UNIQUE KEY `loginId_2` (`loginId`), ADD KEY `ownerId` (`ownerId`), ADD KEY `loginId` (`loginId`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `login_id`
--
ALTER TABLE `login_id`
MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
