-- phpMyAdmin SQL Dump
-- version 3.3.9
-- http://www.phpmyadmin.net
--
-- Servidor: localhost
-- Tempo de Geração: Mar 12, 2014 as 12:41 AM
-- Versão do Servidor: 5.5.8
-- Versão do PHP: 5.3.5

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Banco de Dados: `cadaluno`
--
CREATE DATABASE `cadaluno` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci;
USE `cadaluno`;

-- --------------------------------------------------------

--
-- Estrutura da tabela `tabaluno`
--

CREATE TABLE IF NOT EXISTS `tabaluno` (
  `nomeAluno` varchar(60) DEFAULT NULL,
  `emailAluno` varchar(60) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `tabaluno`
--

