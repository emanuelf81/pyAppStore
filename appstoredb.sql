-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 21-11-2022 a las 13:28:03
-- Versión del servidor: 10.4.22-MariaDB
-- Versión de PHP: 8.1.2

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `appstoredb`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `aplicaciones`
--

CREATE TABLE `aplicaciones` (
  `Id_Aplicacion` int(11) NOT NULL,
  `Nombre` varchar(40) COLLATE utf8_bin NOT NULL,
  `Descrip` varchar(250) COLLATE utf8_bin NOT NULL,
  `Precio` double NOT NULL,
  `Puntaje` int(10) NOT NULL,
  `Coment` varchar(255) COLLATE utf8_bin NOT NULL,
  `Id_Usuario` int(11) NOT NULL,
  `Imagen` varchar(255) COLLATE utf8_bin NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- Volcado de datos para la tabla `aplicaciones`
--

INSERT INTO `aplicaciones` (`Id_Aplicacion`, `Nombre`, `Descrip`, `Precio`, `Puntaje`, `Coment`, `Id_Usuario`, `Imagen`) VALUES
(1, 'Mercado Pago', 'Es una plataforma de pagos que te permite cobrar por las ventas de tu tienda online y de tu local físico.', 10, 0, '', 2, 'C:/Users/emanu/Documents/GitHub/pyAppStore/./Archivos/ImgAplic/img131Mercado Pago2.png'),
(2, 'Slack', 'Slack es una aplicación de mensajería para empresas que conecta a las personas con la información que necesitan.', 55.5, 4, '', 2, 'C:/Users/emanu/Documents/GitHub/pyAppStore/./Archivos/ImgAplic/img664Slack2.png'),
(3, 'Investing', 'Investing.com es una plataforma financiera y un sitio web de noticias.', 30, 0, '', 2, 'C:/Users/emanu/Documents/GitHub/pyAppStore/./Archivos/ImgAplic/img781Investing2.png'),
(4, 'GitHub', 'GitHub es una forja para alojar proyectos utilizando el sistema de control de versiones Git. Se utiliza principalmente para la creación de código fuente de programas de ordenador.', 147, 5, '', 3, 'C:/Users/emanu/Documents/GitHub/pyAppStore/./Archivos/ImgAplic/img799GitHub3.png'),
(5, 'Facebook', 'Facebook es un servicio de redes y medios sociales en línea estadounidense con sede en Menlo Park, California.', 58, 0, '', 3, 'C:/Users/emanu/Documents/GitHub/pyAppStore/./Archivos/ImgAplic/img237Facebook3.png'),
(6, 'Netflix', 'Netflix, Inc. es una empresa de entretenimiento y una plataforma de streaming estadounidense.', 247, 5, '', 4, 'C:/Users/emanu/Documents/GitHub/pyAppStore/./Archivos/ImgAplic/img410Netflix4.png'),
(7, 'Instagram', 'Instagram ​ es una aplicación y red social de origen estadounidense, propiedad de Meta.', 258, 0, '', 4, 'C:/Users/emanu/Documents/GitHub/pyAppStore/./Archivos/ImgAplic/img80Instagram4.png'),
(8, 'Telegram', 'Telegram es una plataforma de mensajería y VOIP de origen ruso', 100, 0, '', 4, 'C:/Users/emanu/Documents/GitHub/pyAppStore/./Archivos/ImgAplic/img459Telegram4.png'),
(9, 'Snapchat', 'Snapchat es una aplicación de mensajería estadounidense diseñada para teléfonos inteligentes con soporte multimedia de imagen, vídeo y filtros para fotos de realidad aumentada.', 90, 0, '', 4, 'C:/Users/emanu/Documents/GitHub/pyAppStore/./Archivos/ImgAplic/img43Snapchat4.png');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `aplicaciones_compradas`
--

CREATE TABLE `aplicaciones_compradas` (
  `Id_Compra` int(11) NOT NULL,
  `Id_Aplicacion` int(11) NOT NULL,
  `Id_Usuario` int(11) NOT NULL,
  `Calif` int(10) NOT NULL,
  `Coment` varchar(250) COLLATE utf8_bin NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- Volcado de datos para la tabla `aplicaciones_compradas`
--

INSERT INTO `aplicaciones_compradas` (`Id_Compra`, `Id_Aplicacion`, `Id_Usuario`, `Calif`, `Coment`) VALUES
(1, 2, 4, 4, ''),
(2, 4, 4, 5, ''),
(3, 6, 2, 5, '');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuarios`
--

CREATE TABLE `usuarios` (
  `Id_Usuario` int(11) NOT NULL,
  `Nombre` varchar(40) COLLATE utf8_bin NOT NULL,
  `Apellido` varchar(40) COLLATE utf8_bin NOT NULL,
  `DNI` bigint(12) NOT NULL,
  `Email` varchar(40) COLLATE utf8_bin NOT NULL,
  `Nickname` varchar(40) COLLATE utf8_bin NOT NULL,
  `Pw` varchar(40) COLLATE utf8_bin NOT NULL,
  `Imagen` varchar(255) COLLATE utf8_bin NOT NULL,
  `IsDev` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- Volcado de datos para la tabla `usuarios`
--

INSERT INTO `usuarios` (`Id_Usuario`, `Nombre`, `Apellido`, `DNI`, `Email`, `Nickname`, `Pw`, `Imagen`, `IsDev`) VALUES
(1, 'Juan', 'Gonzalez', 32323232, 'jgonzalez@gmail.com', 'jgonza', '1234', '', 1),
(2, 'Juan', 'Perez', 40212121, 'jperez@gmail.com', 'jperez', '1234', 'C:/Users/emanu/Documents/GitHub/pyAppStore/./Archivos/ImgUsuario/img58JuanPerez.png', 0),
(3, 'Alan', 'Brito', 15852951, 'abrito@zaraza.com', 'abrito', '1234', 'C:/Users/emanu/Documents/GitHub/pyAppStore/./Archivos/ImgUsuario/img446AlanBrito.png', 0),
(4, 'Elsa', 'Capunta', 56858574, 'ecapu@hotmail.com', 'Elsa1234', '1234', 'C:/Users/emanu/Documents/GitHub/pyAppStore/./Archivos/ImgUsuario/img775ElsaCapunta.png', 0);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `aplicaciones`
--
ALTER TABLE `aplicaciones`
  ADD PRIMARY KEY (`Id_Aplicacion`);

--
-- Indices de la tabla `aplicaciones_compradas`
--
ALTER TABLE `aplicaciones_compradas`
  ADD PRIMARY KEY (`Id_Compra`);

--
-- Indices de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  ADD PRIMARY KEY (`Id_Usuario`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `aplicaciones`
--
ALTER TABLE `aplicaciones`
  MODIFY `Id_Aplicacion` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;

--
-- AUTO_INCREMENT de la tabla `aplicaciones_compradas`
--
ALTER TABLE `aplicaciones_compradas`
  MODIFY `Id_Compra` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  MODIFY `Id_Usuario` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
