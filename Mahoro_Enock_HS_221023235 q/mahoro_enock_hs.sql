-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Feb 19, 2024 at 12:06 PM
-- Server version: 10.4.25-MariaDB
-- PHP Version: 7.4.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `mahoro_enock_hs`
--

-- --------------------------------------------------------

--
-- Table structure for table `customers`
--

CREATE TABLE `customers` (
  `id` int(20) NOT NULL,
  `first_name` varchar(220) NOT NULL,
  `last_name` varchar(220) NOT NULL,
  `email` varchar(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `customers`
--

INSERT INTO `customers` (`id`, `first_name`, `last_name`, `email`) VALUES
(2, 'asdf', 'wersr', 'werst'),
(20, 'sdfghj', 'vbnm,', 'hjkl'),
(10, 'tyuio', 'xcvbnm', 'ghjkl'),
(21, 'sdfgh', 'cvbnm', 'kjhgfd'),
(65, 'semugisha', 'jay-p', 'semugisha@gmail.com'),
(20, 'lkjhg', 'qwer', 'mnbvc');

-- --------------------------------------------------------

--
-- Table structure for table `governments`
--

CREATE TABLE `governments` (
  `id` int(20) NOT NULL,
  `name` varchar(220) NOT NULL,
  `email` varchar(220) NOT NULL,
  `contact` varchar(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `governments`
--

INSERT INTO `governments` (`id`, `name`, `email`, `contact`) VALUES
(28, 'sdfgh', 'lkjhgf', 'zxcvb'),
(12, 'asdfgh', 'cvbnm', '12345'),
(43, 'zxcvbn', 'cvbnm,', '234567'),
(13, 'fghj', 'mnbv', 'poiuyt');

-- --------------------------------------------------------

--
-- Table structure for table `manager`
--

CREATE TABLE `manager` (
  `id` int(20) NOT NULL,
  `first_name` varchar(220) NOT NULL,
  `last_name` varchar(220) NOT NULL,
  `email` varchar(200) NOT NULL,
  `telephone` varchar(200) NOT NULL,
  `gender` varchar(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `manager`
--

INSERT INTO `manager` (`id`, `first_name`, `last_name`, `email`, `telephone`, `gender`) VALUES
(5, 'fghjk', 'bnm', 'asdfg', 'ghjkl', 'szxdcfvb'),
(12, 'zxcvbn', 'zxcvbn', 'wertyui', 'sdfghjk', 'xcvbnm'),
(20, 'wsdrfghujik', 'sdfghj', 'xdcfghjk', 'wertyui', 'sdfghuji'),
(21, 'wervcx', 'kjhg', 'sdf', 'poiu', 'mnbv'),
(23, 'mnbvcx', 'qwerty', 'mnbvcx', 'lkjhgf', 'm'),
(30, 'Mahoro', 'Enock', 'enockmahoro04@gmail.com', '0723828461male', ''),
(32, 'mnbvcx', 'zxcvbn', 'kjhgf', 'asdfgh', 'oiuytr'),
(43, 'murazayesu', 'Jackson', 'muraza@gmail.com', '0784563217', 'male'),
(90, 'mugisha', 'bonheur', 'kwezera@gmail.com', '0786554342', 'male'),
(23456, 'cgfgvhbjnkm', 'dxfcgvhjbkn', 'ccygvhjbknm', 'gc gvjhbj', 'cg vhbn');

-- --------------------------------------------------------

--
-- Table structure for table `workers`
--

CREATE TABLE `workers` (
  `id` int(20) NOT NULL,
  `fname` varchar(220) NOT NULL,
  `lname` varchar(220) NOT NULL,
  `contact` varchar(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `workers`
--

INSERT INTO `workers` (`id`, `fname`, `lname`, `contact`) VALUES
(23, 'asdfg', 'dfgh', 'zxcvb'),
(23, 'asdfg', 'dfgh', 'zxcvb'),
(12, 'dfghjk', 'cvbnm', 'qwerty'),
(21, 'xcvbnm', 'lkjhgfd', 'qwerty'),
(21, 'qwerty', 'asdfgh', 'zxcvbn'),
(32, 'vbnm,jkl;', 'hjkl;', 'hjkl;'),
(12, 'wertyui', 'sdfghj', 'xcvbhnjm'),
(21, 'kjhgfc', 'zxcvb', 'ertyhj'),
(19, 'zxcvbn', 'mnbvc', '765432'),
(87, 'asdfg', 'oiuyt', 'zxcvbn'),
(32, 'mahoro', 'pio', '0789654763'),
(32, 'mahoro', 'pio', '0789654763');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `manager`
--
ALTER TABLE `manager`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `manager`
--
ALTER TABLE `manager`
  MODIFY `id` int(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=23457;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
