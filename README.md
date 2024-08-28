# miProyectoAlmacen

Este es un proyecto desarrollado como trabajo final del curso universitario "SOLUCIONES WEB Y APLICACIONES DISTRIBUIDAS". El proyecto consiste en una aplicación web con arquitectura de separación por capas bajo el patrón MVC, implementada en Java utilizando el framework Spring Boot.

Video Demo [Video](https://www.youtube.com/watch?v=YSCmj8ZlF4E)

## Descripción del Proyecto

**miProyectoAlmacen** es una aplicación web diseñada para gestionar el inventario de un almacén, proporcionando funcionalidades de registro de proveedores. La aplicación sigue una arquitectura orientada a servicios y está diseñada para ser desplegada en un entorno distribuido.

## Características Técnicas

- **Arquitectura de software**: Implementación del patrón de diseño MVC (Modelo-Vista-Controlador) para una separación clara de responsabilidades.
- **Programación Orientada a Objetos (POO)**: Uso de principios de POO para crear un código modular, reutilizable y fácil de mantener.
- **Spring Boot**: Uso de Spring Boot para la configuración simplificada de la aplicación y la integración con múltiples módulos como Spring Data JPA, Spring Security, y Thymeleaf.
- **Persistencia de Datos**: Integración con bases de datos  MySQL para entornos de producción, utilizando Spring Data JPA.
- **Seguridad**: Implementación de seguridad mediante Spring Security para autenticación y autorización de usuarios.
- **Despliegue en Entornos Distribuidos**: Preparado para ser desplegado en servidores locales o en la nube, siguiendo buenas prácticas de arquitectura orientada a servicios.

## Dependencias Principales

- **Spring Boot Starter Web**: Para el desarrollo de la capa de presentación y controladores.
- **Spring Boot Starter Data JPA**: Para la capa de persistencia y la interacción con bases de datos relacionales.
- **Spring Boot Starter Thymeleaf**: Para la generación de vistas dinámicas con el motor de plantillas Thymeleaf.
- **Spring Boot Starter Security**: Para la gestión de la seguridad, incluyendo la autenticación y autorización.
- **H2 Database**: Base de datos en memoria para pruebas y desarrollo local.
- **MySQL Connector**: Driver JDBC para conectar con bases de datos MySQL en entornos de producción.

## Requisitos del Sistema

- **Java**: JDK 1.8 o superior
- **Maven**: 3.6.0 o superior
- **Base de Datos**: H2 (para desarrollo) o MySQL (para producción)

## Scripts MySql

```
CREATE TABLE IF NOT EXISTS usuarios (
 `id` INT(11) NOT NULL AUTO_INCREMENT,
 `username` VARCHAR(45) NOT NULL,
 `password` VARCHAR(100) NOT NULL,
 `enabled` TINYINT(1) NOT NULL,
 PRIMARY KEY (`id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

CREATE TABLE IF NOT EXISTS roles (
 `id` INT(11) NOT NULL AUTO_INCREMENT,
 `user_id` INT(11) NOT NULL,
 `authority` VARCHAR(50) NOT NULL,
 PRIMARY KEY (`id`),
 INDEX `fk_roles_usuarios_idx` (`user_id` ASC) VISIBLE,
 CONSTRAINT `fk_roles_usuarios`
  FOREIGN KEY (`user_id`)
  REFERENCES usuarios (`id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

CREATE TABLE `proveedores` (
  `prov_id` int NOT NULL AUTO_INCREMENT,
  `prov_raz_social` varchar(100) NOT NULL,
  `prov_ruc` varchar(11) NOT NULL,
  `prov_direccion` varchar(100) NOT NULL,
  `prov_telf` varchar(9) NOT NULL,
  `prov_contacto` varchar(45) NOT NULL,
  PRIMARY KEY (`prov_id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci

INSERT INTO usuarios VALUES (NULL, 'Berny', '$2a$10$SVUWI2qZ6vLA8QaWaprbH.JOWIVf5IxahL5hAo1GXbf9p3Abie9Jy', 1);
INSERT INTO usuarios VALUES (NULL, 'Pepe', '$2a$10$JwjRPX0rwf2UTsjEeTuEFOEx3zREaTVYRFJ8XNqvzFIV5AV34QaoG', 1);
INSERT INTO usuarios VALUES (NULL, 'Juan', '$2a$10$YenOUKEtlCY/gNJnWkA8Quib3H4d5zTzs3iefIFh.ioM/8XnMPTSS', 1);

INSERT INTO roles VALUES (NULL, 1, 'ROLE ADMIN');
INSERT INTO roles VALUES (NULL, 1, 'ROLE USER');
INSERT INTO roles VALUES (NULL, 2, 'ROLE USER');
INSERT INTO roles VALUES (NULL, 3, 'ROLE USER');
INSERT INTO roles VALUES (NULL, 4, 'ROLE ADMIN');

passwords = almacenSPRING2021
user = Berny

```

