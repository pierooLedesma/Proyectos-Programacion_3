# MedicalSoft - Guía de Compilación y Ejecución de la Pregunta 2

## Descripción General

Se explica paso a paso cómo compilar y ejecutar el proyecto
"MedicalSoft" utilizando comandos en Java desde la consola.

------------------------------------------------------------------------

## 1. Compilación del paquete de Recursos Humanos

### Comando

``` bash
javac -cp . com/medicalsoft/rrhh/model/*.java
```

### Descripción

Este comando compila todas las clases Java ubicadas en el paquete model
del paquete de recursos humanos.

-   javac: compilador de Java
-   -cp .: indica que se use el directorio actual como classpath
-   \*.java: compila todos los archivos Java del paquete

------------------------------------------------------------------------

## 2. Compilación del paquete de Infraestructura

### Comando

``` bash
javac -cp . com/medicalsoft/infraestructura/model/*.java
```

### Descripción

Compila las clases relacionadas con la infraestructura del sistema, como
acceso a datos, archivos o conexiones externas.

-   javac: compilador de Java
-   -cp .: Usar el directorio actual
-   \*.java: compila todos los archivos ".java" de este paquete

------------------------------------------------------------------------

## 3. Compilación del paquete de Servicios

### Comando

``` bash
javac -cp . com/medicalsoft/servicios/model/*.java
```

### Descripción

Este comando compila la lógica de negocio del sistema.

-   javac: el compilador de Java
-   -cp .: indica que se use el directorio actual
-   \*.java: compila todos los archivos Java del paquete

------------------------------------------------------------------------

## 4. Compilación del paquete Principal

### Comando

``` bash
javac -cp . com/medicalsoft/program/main/*.java
```

### Descripción

Compila las clase "Principal.class" que contiene el método main.

------------------------------------------------------------------------

## 5. Ejecución del programa

### Comando

``` bash
java -cp . com/medicalsoft/program/main/Principal
```

### Descripción

Ejecuta la aplicación llamando a la clase principal llamada "Principal".

-   java: ejecuta el programa
-   -cp .: usa el classpath actual
-   Principal: clase donde está el método main

Aquí es donde inicia todo el sistema.

------------------------------------------------------------------------
