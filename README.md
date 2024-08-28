# miProyectoAlmacen

Este es un proyecto desarrollado como trabajo final del curso universitario "SOLUCIONES WEB Y APLICACIONES DISTRIBUIDAS". El proyecto consiste en una aplicación web con arquitectura de separación por capas bajo el patrón MVC, implementada en Java utilizando el framework Spring Boot.

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

