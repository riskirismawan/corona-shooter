-- phpMyAdmin SQL Dump
-- version 5.0.3
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Nov 25, 2020 at 04:33 PM
-- Server version: 10.4.14-MariaDB
-- PHP Version: 7.4.11

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `coronashooter`
--

-- --------------------------------------------------------

--
-- Table structure for table `player`
--

CREATE TABLE `player` (
  `id_player` int(11) NOT NULL,
  `username` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `player`
--

INSERT INTO `player` (`id_player`, `username`, `password`) VALUES
(1, 'admin', 'admin123'),
(2, 'a', '1'),
(3, 'nunik', 'nunik1'),
(4, 'aku', '123'),
(5, 'agel', 'agil'),
(6, 'agel', 'agel'),
(7, 'unik', 'unik'),
(8, 'wahyu', 'wahyu'),
(9, 'b', 'b'),
(10, 'c', 'c'),
(11, 'c', 'c'),
(12, 'e', 'e'),
(13, 'e', 'e'),
(14, 'q', 'q'),
(15, 'z', 'z'),
(16, 'g', 'g'),
(17, 'j', 'j'),
(18, 'k', 'k'),
(19, 'l', 'l'),
(20, 'p', 'p'),
(21, 'r', 'r'),
(22, 'o', 'o'),
(23, 't', 't'),
(24, 'apa', 'apa'),
(25, 'yy', 'yy'),
(26, 'p', 'p'),
(27, 'l', 'l'),
(28, 'uu', 'u'),
(29, 'p', 'p'),
(30, 'q', 'q'),
(31, 'a', 'a'),
(32, 'a', 'a'),
(33, 'h', 'h'),
(34, '', ''),
(35, '', ''),
(36, '', ''),
(37, '', ''),
(38, '', ''),
(39, '', ''),
(40, '', ''),
(41, '', ''),
(42, '', ''),
(43, '', ''),
(44, '', ''),
(45, 'akk', 'akk'),
(46, 'agiljelek', 'agiljelek'),
(47, 'alo', 'alo'),
(48, 'g', 'g'),
(49, '', ''),
(50, '', ''),
(51, '', ''),
(52, '', ''),
(53, '', ''),
(54, '', ''),
(55, '', ''),
(56, '', ''),
(57, '', ''),
(58, '', ''),
(59, '', ''),
(60, 'alo', 'alo'),
(61, 'b', 'b'),
(62, 'l', 'l'),
(63, 'p', 'p'),
(64, 'l', 'l'),
(65, 'p', 'p'),
(66, 'm', 'm'),
(67, 'q', 'q'),
(68, 'q', 'q'),
(69, '1', '1'),
(70, 'm', 'm'),
(71, 'c', 'c'),
(72, 'g', 'g'),
(73, 'hedar', 'hedar'),
(74, 'nunik', '123');

-- --------------------------------------------------------

--
-- Table structure for table `score`
--

CREATE TABLE `score` (
  `id_score` int(11) NOT NULL,
  `nilai` int(11) NOT NULL,
  `corona` int(11) NOT NULL,
  `id_player` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `score`
--

INSERT INTO `score` (`id_score`, `nilai`, `corona`, `id_player`) VALUES
(1, 2000, 500, 4),
(2, 1500, 450, 4),
(3, 1750, 466, 1),
(4, 2100, 550, 4);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `player`
--
ALTER TABLE `player`
  ADD PRIMARY KEY (`id_player`);

--
-- Indexes for table `score`
--
ALTER TABLE `score`
  ADD PRIMARY KEY (`id_score`),
  ADD KEY `player_score` (`id_player`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `player`
--
ALTER TABLE `player`
  MODIFY `id_player` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=75;

--
-- AUTO_INCREMENT for table `score`
--
ALTER TABLE `score`
  MODIFY `id_score` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `score`
--
ALTER TABLE `score`
  ADD CONSTRAINT `player_score` FOREIGN KEY (`id_player`) REFERENCES `player` (`id_player`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
