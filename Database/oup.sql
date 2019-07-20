-- phpMyAdmin SQL Dump
-- version 4.7.9
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jul 20, 2019 at 10:08 AM
-- Server version: 10.1.31-MariaDB
-- PHP Version: 7.2.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `oup`
--

-- --------------------------------------------------------

--
-- Table structure for table `member`
--

CREATE TABLE `member` (
  `id` int(11) NOT NULL,
  `version` bigint(20) NOT NULL,
  `is_active` bit(1) NOT NULL,
  `date_created` datetime NOT NULL,
  `first_name` varchar(255) NOT NULL,
  `identity_hash` varchar(255) DEFAULT NULL,
  `last_updated` datetime NOT NULL,
  `password` varchar(255) NOT NULL,
  `identity_hash_last_update` bigint(20) DEFAULT NULL,
  `last_name` varchar(255) DEFAULT NULL,
  `member_type` varchar(255) NOT NULL,
  `email` varchar(255) NOT NULL,
  `phone` varchar(255) DEFAULT NULL,
  `address` varchar(255) DEFAULT NULL,
  `bdate` datetime DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `member`
--

INSERT INTO `member` (`id`, `version`, `is_active`, `date_created`, `first_name`, `identity_hash`, `last_updated`, `password`, `identity_hash_last_update`, `last_name`, `member_type`, `email`, `phone`, `address`, `bdate`) VALUES
(1, 0, b'1', '2019-07-17 13:21:42', 'Administrator', NULL, '2019-07-17 13:21:42', '21232f297a57a5a743894a0e4a801fc3', NULL, '', 'ADMINISTRATOR', 'admin@localhost.local', NULL, NULL, NULL),
(3, 0, b'1', '2019-07-17 17:23:42', 'Shakib', NULL, '2019-07-17 17:23:42', '827ccb0eea8a706c4c34a16891f84e7b', NULL, 'Hasan', 'REGULAR_MEMBER', 'sah75@gmail.com', '123456', 'Dhaka', '2019-07-17 17:22:00'),
(4, 1, b'1', '2019-07-17 17:24:48', 'Salman', NULL, '2019-07-20 07:41:27', '1f32aa4c9a1d2ea010adcf2348166a04', NULL, 'Arefin', 'REGULAR_MEMBER', 'salman@gmail.com', '45678', 'Dhaka', '2019-07-16 18:00:00'),
(5, 0, b'1', '2019-07-17 17:50:40', 'Rahinul', NULL, '2019-07-17 17:50:40', 'e10adc3949ba59abbe56e057f20f883e', NULL, 'Islam', 'REGULAR_MEMBER', 'mrid@gmail.com', '0124568', 'Dhaka', '2019-07-16 18:00:00'),
(6, 1, b'1', '2019-07-18 06:53:58', 'Mashrafe', NULL, '2019-07-18 08:14:05', '1f32aa4c9a1d2ea010adcf2348166a04', NULL, 'Mortoza', 'REGULAR_MEMBER', 'mash@gmail.com', '12345', 'Norail', '1989-12-17 18:00:00');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `member`
--
ALTER TABLE `member`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `UK_mbmcqelty0fbrvxp1q58dn57t` (`email`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `member`
--
ALTER TABLE `member`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
