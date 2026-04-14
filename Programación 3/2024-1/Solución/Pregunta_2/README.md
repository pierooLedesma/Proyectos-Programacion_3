# MedicalSoft - Gu赤a de Compilaci車n y Ejecuci車n de la Pregunta 2

## Descripci車n General

Se explica paso a paso c車mo compilar y ejecutar el proyecto
"MedicalSoft" utilizando comandos en Java desde la consola.

------------------------------------------------------------------------

## 1. Compilaci車n del paquete de Recursos Humanos (Modelo)

### Comando

``` bash
javac -cp . com/medicalsoft/rrhh/model/*.java
```

### Descripci車n

Este comando compila todas las clases Java ubicadas en el paquete model
del paquete de recursos humanos.

-   javac: compilador de Java\
-   -cp .: indica que se use el directorio actual como classpath\
-   \*.java: compila todos los archivos Java del paquete

------------------------------------------------------------------------

## 2. Compilaci車n del paquete de Infraestructura

### Comando

``` bash
javac -cp . com/medicalsoft/infraestructura/model/*.java
```

### Descripci車n

Compila las clases relacionadas con la infraestructura del sistema, como
acceso a datos, archivos o conexiones externas.

-   javac: compilador de Java\
-   -cp .: Usar el directorio actual\
-   \*.java: compila todos los archivos ".java" de este paquete

------------------------------------------------------------------------

## 3. Compilaci車n del paquete de Servicios

### Comando

``` bash
javac -cp . com/medicalsoft/servicios/model/*.java
```

### Descripci車n

Este comando compila la l車gica de negocio del sistema.

-   javac: el compilador de Java\
-   -cp .: indica que se use el directorio actual\
-   \*.java: compila todos los archivos Java del paquete

------------------------------------------------------------------------

## 4. Compilaci車n del paquete Principal

### Comando

``` bash
javac -cp . com/medicalsoft/program/main/*.java
```

### Descripci車n

Compila las clase "Principal.class" que incluye la clase que
contiene el m谷todo main.

------------------------------------------------------------------------

## 5. Ejecuci車n del programa

### Comando

``` bash
java -cp . com/medicalsoft/program/main/Principal
```

### Descripci車n

Ejecuta la aplicaci車n llamando a la clase principal llamada "Principal".

-   java: ejecuta el programa\
-   -cp .: usa el classpath actual\
-   Principal: clase donde est芍 el m谷todo main

Aqu赤 es donde inicia todo el sistema.

------------------------------------------------------------------------
