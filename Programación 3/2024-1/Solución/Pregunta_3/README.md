# MedicalSoft - Construcción del proyecto de la Pregunta 3

## Descripción General

Describir el proceso completo para compilar, empaquetar y
ejecutar el sistema "MedicalSoft", así como la configuración necesaria del
archivo "MANIFEST.MF".

------------------------------------------------------------------------

# INSTRUCCIONES EJECUTADAS

## 1. Compilar módulo RRHH

``` bash
javac -cp . com/medicalsoft/rrhh/model/*.java
```

Compila las clases base del sistema.

------------------------------------------------------------------------

## 2. Generar librería "medicalsoftRRHHModel.jar"

``` bash
jar cvf medicalsoftRRHHModel.jar com/medicalsoft/rrhh/model/*.class
```

Empaqueta las clases compiladas en el archivo "medicalsoftRRHHModel.jar".

------------------------------------------------------------------------

## 3. Compilar módulo Infraestructura

``` bash
javac -cp medicalsoftRRHHModel;. com/medicalsoft/infraestructura/model/*.java
```

Compila el módulo de infraestructura usando la librería de RRHH como
dependencia (medicalsoftRRHHModel.jar).

------------------------------------------------------------------------

## 4. Generar librería "medicalsoftInfraModel.jar"

``` bash
jar cvf medicalsoftInfraModel.jar com/medicalsoft/infraestructura/model/*.class
```

Crea el componente de infraestructura denominado "medicalsoftInfraModel.jar".

------------------------------------------------------------------------

## 5. Compilar módulo Servicios

``` bash
javac -cp medicalsoftRRHHModel.jar;medicalsoftInfraModel.jar;. com/medicalsoft/servicios/model/*.java
```

Compila las clases contenidas en "servicios/model" utilizando las librerías previas
que son las siguientes: "medicalsoftRRHHModel.jar" y "medicalsoftInfraModel.jar".

------------------------------------------------------------------------

## 6. Generar librería "medicalsoftServModel.jar"

``` bash
jar cvf medicalsoftServModel.jar com/medicalsoft/servicios/model/*.class
```

Empaqueta el módulo de servicios llamado "medicalsoftServModel.jar".

------------------------------------------------------------------------

## 7. Compilar paquete "Principal"

``` bash
javac -cp medicalsoftRRHHModel.jar;medicalsoftInfraModel.jar;medicalsoftServModel.jar;. com/medicalsoft/program/main/*.java
```

Compila la clase principal del sistema "Principal.java" con las tres librerías ".jar" generados anteriormente.

------------------------------------------------------------------------

## 8. Ejecutar la aplicación

``` bash
java -jar medicalsoftPrincipal.jar
```

Ejecuta el sistema desde el archivo ".jar" principal.

------------------------------------------------------------------------

# CONTENIDO QUE DEBE IR EN "MANIFEST.MF"

``` txt
Manifest-Version: 1.0
Created-By: Alessandro Piero Ledesma Guerra
Class-Path: medicalsoftRRHHModel.jar medicalsoftInfraModel.jar medicalsoftServModel.jar
Main-Class: com/medicalsoft/program/main/Principal

```

Importante:
- Asegurar un salto de línea al final del archivo.
- Todas las librerías deben estar en el mismo directorio que el ".jar" principal.
