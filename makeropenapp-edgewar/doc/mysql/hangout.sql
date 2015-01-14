-- phpMyAdmin SQL Dump
-- version 4.2.4
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: 2015-01-15 01:09:43
-- 服务器版本： 5.5.40-0ubuntu1
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
-- 表的结构 `hangout`
--

CREATE TABLE IF NOT EXISTS `hangout` (
`id` int(11) NOT NULL,
  `name` varchar(256) NOT NULL,
  `desc` varchar(256) NOT NULL,
  `addr` varchar(256) NOT NULL,
  `phone` varchar(50) NOT NULL,
  `geoPoint` varchar(100) NOT NULL,
  `createTime` timestamp NULL DEFAULT NULL,
  `updateTime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
) ENGINE=InnoDB  DEFAULT CHARSET=utf8mb4 AUTO_INCREMENT=2 ;

--
-- 转存表中的数据 `hangout`
--

INSERT INTO `hangout` (`id`, `name`, `desc`, `addr`, `phone`, `geoPoint`, `createTime`, `updateTime`) VALUES
(1, '南山创客岛', '南山创客岛', '南山区科技园', '88888888', '', '2015-01-14 16:46:54', '2015-01-14 16:46:54');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `hangout`
--
ALTER TABLE `hangout`
 ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `hangout`
--
ALTER TABLE `hangout`
MODIFY `id` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=2;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
