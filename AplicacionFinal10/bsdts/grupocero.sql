-- phpMyAdmin SQL Dump
-- version 4.7.0
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 02-08-2018 a las 08:06:39
-- Versión del servidor: 10.1.26-MariaDB
-- Versión de PHP: 7.1.8

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `grupocero`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `administrativo`
--

CREATE TABLE `administrativo` (
  `CodAdmin` int(100) NOT NULL,
  `NomAdmin` varchar(100) NOT NULL,
  `ApelliAdmin` varchar(100) NOT NULL,
  `DniAdmin` int(10) NOT NULL,
  `TelefAdmin` int(10) NOT NULL,
  `DirecAdmin` varchar(100) NOT NULL,
  `CorreoAdmin` varchar(100) NOT NULL,
  `EdadAdmin` int(11) NOT NULL,
  `PswAdmin` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `alumno`
--

CREATE TABLE `alumno` (
  `CodAlum` int(100) NOT NULL,
  `NomAlum` varchar(50) NOT NULL,
  `ApelliAlum` varchar(50) NOT NULL,
  `DniAlum` int(20) NOT NULL,
  `TelefAlum` int(11) NOT NULL,
  `DirecAlum` varchar(100) NOT NULL,
  `CorreoAlum` varchar(100) NOT NULL,
  `EdadAlum` int(11) NOT NULL,
  `PswAlum` varchar(100) NOT NULL,
  `CodApod` int(100) NOT NULL,
  `CodMod` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `apoderado`
--

CREATE TABLE `apoderado` (
  `CodApod` int(100) NOT NULL,
  `NomApod` varchar(100) NOT NULL,
  `ApelliApod` varchar(100) NOT NULL,
  `DniApod` int(10) NOT NULL,
  `TelefApod` int(10) NOT NULL,
  `DirecApod` varchar(100) NOT NULL,
  `CorreoApod` varchar(50) NOT NULL,
  `EdadApod` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `curso`
--

CREATE TABLE `curso` (
  `CodCur` int(11) NOT NULL,
  `NomCur` varchar(50) NOT NULL,
  `CodProf` int(100) NOT NULL,
  `CodMod` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `detallescurso`
--

CREATE TABLE `detallescurso` (
  `CodAlum` int(100) NOT NULL,
  `CodCur` int(100) NOT NULL,
  `Nota1` int(10) NOT NULL,
  `Nota2` int(10) NOT NULL,
  `Nota3` int(10) NOT NULL,
  `Promedio` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `modulo`
--

CREATE TABLE `modulo` (
  `CodMod` int(10) NOT NULL,
  `DuracionMod` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `profesor`
--

CREATE TABLE `profesor` (
  `CodProf` int(100) NOT NULL,
  `NomProf` varchar(100) NOT NULL,
  `ApelliProf` varchar(100) NOT NULL,
  `DniProf` int(10) NOT NULL,
  `TelefProf` int(10) NOT NULL,
  `DirecProf` varchar(100) NOT NULL,
  `CorreoProf` varchar(100) NOT NULL,
  `EdadProf` int(10) NOT NULL,
  `PswProf` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `administrativo`
--
ALTER TABLE `administrativo`
  ADD PRIMARY KEY (`CodAdmin`);

--
-- Indices de la tabla `alumno`
--
ALTER TABLE `alumno`
  ADD PRIMARY KEY (`CodAlum`),
  ADD KEY `CodApod` (`CodApod`),
  ADD KEY `CodMod` (`CodMod`);

--
-- Indices de la tabla `apoderado`
--
ALTER TABLE `apoderado`
  ADD PRIMARY KEY (`CodApod`);

--
-- Indices de la tabla `curso`
--
ALTER TABLE `curso`
  ADD PRIMARY KEY (`CodCur`),
  ADD KEY `CodProf` (`CodProf`,`CodMod`),
  ADD KEY `CodMod` (`CodMod`);

--
-- Indices de la tabla `detallescurso`
--
ALTER TABLE `detallescurso`
  ADD KEY `CodAlum` (`CodAlum`,`CodCur`),
  ADD KEY `CodCur` (`CodCur`);

--
-- Indices de la tabla `modulo`
--
ALTER TABLE `modulo`
  ADD PRIMARY KEY (`CodMod`);

--
-- Indices de la tabla `profesor`
--
ALTER TABLE `profesor`
  ADD PRIMARY KEY (`CodProf`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `alumno`
--
ALTER TABLE `alumno`
  MODIFY `CodAlum` int(100) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT de la tabla `apoderado`
--
ALTER TABLE `apoderado`
  MODIFY `CodApod` int(100) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT de la tabla `curso`
--
ALTER TABLE `curso`
  MODIFY `CodCur` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT de la tabla `modulo`
--
ALTER TABLE `modulo`
  MODIFY `CodMod` int(10) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT de la tabla `profesor`
--
ALTER TABLE `profesor`
  MODIFY `CodProf` int(100) NOT NULL AUTO_INCREMENT;
--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `alumno`
--
ALTER TABLE `alumno`
  ADD CONSTRAINT `alumno_ibfk_1` FOREIGN KEY (`CodMod`) REFERENCES `modulo` (`CodMod`),
  ADD CONSTRAINT `alumno_ibfk_2` FOREIGN KEY (`CodApod`) REFERENCES `apoderado` (`CodApod`);

--
-- Filtros para la tabla `curso`
--
ALTER TABLE `curso`
  ADD CONSTRAINT `curso_ibfk_1` FOREIGN KEY (`CodMod`) REFERENCES `modulo` (`CodMod`),
  ADD CONSTRAINT `curso_ibfk_2` FOREIGN KEY (`CodProf`) REFERENCES `profesor` (`CodProf`);

--
-- Filtros para la tabla `detallescurso`
--
ALTER TABLE `detallescurso`
  ADD CONSTRAINT `detallescurso_ibfk_1` FOREIGN KEY (`CodCur`) REFERENCES `curso` (`CodCur`),
  ADD CONSTRAINT `detallescurso_ibfk_2` FOREIGN KEY (`CodAlum`) REFERENCES `alumno` (`CodAlum`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
