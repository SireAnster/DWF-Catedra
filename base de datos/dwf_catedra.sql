-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1:3306
-- Tiempo de generación: 25-03-2024 a las 21:24:20
-- Versión del servidor: 5.7.36
-- Versión de PHP: 7.4.26

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `dwf_catedra`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `info_facturacion`
--

DROP TABLE IF EXISTS `info_facturacion`;
CREATE TABLE IF NOT EXISTS `info_facturacion` (
  `#N de tarjeta` int(16) NOT NULL,
  `Marca de la tarjeta` varchar(50) NOT NULL,
  `Nombre` varchar(30) NOT NULL,
  `Apellido` varchar(30) NOT NULL,
  `Fecha de caducidad` date NOT NULL,
  `CVV` int(3) NOT NULL,
  `Telefono` varchar(15) NOT NULL,
  `Correo Electronico` varchar(200) NOT NULL,
  `Direccion` varchar(500) NOT NULL,
  `Segunda direccion` varchar(500) DEFAULT NULL,
  `Departamento` varchar(25) NOT NULL,
  PRIMARY KEY (`#N de tarjeta`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `mesas`
--

DROP TABLE IF EXISTS `mesas`;
CREATE TABLE IF NOT EXISTS `mesas` (
  `Codigo de mesa` varchar(6) NOT NULL,
  `Disponibilidad` varchar(15) NOT NULL,
  PRIMARY KEY (`Codigo de mesa`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `reservas`
--

DROP TABLE IF EXISTS `reservas`;
CREATE TABLE IF NOT EXISTS `reservas` (
  `ID` int(6) NOT NULL AUTO_INCREMENT,
  `Nombre usuario` varchar(300) NOT NULL,
  `Apellido usuario` varchar(300) NOT NULL,
  `Mesa ID` varchar(6) NOT NULL,
  `Fecha de reserva` date NOT NULL,
  `Cantidad de horas` time NOT NULL,
  `Telefono` varchar(15) DEFAULT NULL,
  `Correo Electronico` varchar(200) NOT NULL,
  PRIMARY KEY (`ID`),
  KEY `Nombre usuario` (`Nombre usuario`),
  KEY `Apellido usuario` (`Apellido usuario`),
  KEY `Telefono` (`Telefono`),
  KEY `Correo Electronico` (`Correo Electronico`),
  KEY `Mesa ID` (`Mesa ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tipo_usuarios`
--

DROP TABLE IF EXISTS `tipo_usuarios`;
CREATE TABLE IF NOT EXISTS `tipo_usuarios` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `Tipo de usuario` varchar(30) NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuarios`
--

DROP TABLE IF EXISTS `usuarios`;
CREATE TABLE IF NOT EXISTS `usuarios` (
  `DUI` varchar(10) NOT NULL,
  `Nombres` varchar(300) NOT NULL,
  `Apellidos` varchar(300) NOT NULL,
  `Contraseña` varchar(50) NOT NULL,
  `Correo Electronico` varchar(200) NOT NULL,
  `Telefono` varchar(15) DEFAULT NULL,
  `Tipo de usuario` int(11) NOT NULL,
  `#n de tarjeta` int(16) NOT NULL,
  PRIMARY KEY (`DUI`),
  KEY `Tipo de usuario_2` (`Tipo de usuario`),
  KEY `#n de tarjeta` (`#n de tarjeta`),
  KEY `Nombres` (`Nombres`),
  KEY `Apellidos` (`Apellidos`),
  KEY `Telefono` (`Telefono`),
  KEY `Correo Electronico` (`Correo Electronico`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `reservas`
--
ALTER TABLE `reservas`
  ADD CONSTRAINT `reservas_ibfk_1` FOREIGN KEY (`Nombre usuario`) REFERENCES `usuarios` (`Nombres`),
  ADD CONSTRAINT `reservas_ibfk_2` FOREIGN KEY (`Apellido usuario`) REFERENCES `usuarios` (`Apellidos`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `reservas_ibfk_3` FOREIGN KEY (`Mesa ID`) REFERENCES `mesas` (`Codigo de mesa`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `reservas_ibfk_4` FOREIGN KEY (`Telefono`) REFERENCES `usuarios` (`Telefono`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `reservas_ibfk_5` FOREIGN KEY (`Correo Electronico`) REFERENCES `usuarios` (`Correo Electronico`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `usuarios`
--
ALTER TABLE `usuarios`
  ADD CONSTRAINT `usuarios_ibfk_1` FOREIGN KEY (`Tipo de usuario`) REFERENCES `tipo_usuarios` (`ID`),
  ADD CONSTRAINT `usuarios_ibfk_2` FOREIGN KEY (`#n de tarjeta`) REFERENCES `info_facturacion` (`#N de tarjeta`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
