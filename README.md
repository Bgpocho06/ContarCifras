# 🔢 `ContarCifras` — Ficha Técnica del Proyecto

> **Resumen ejecutivo:** Aplicación de línea de comandos (CLI) desarrollada en lenguaje **Java** cuyo propósito es calcular y mostrar la cantidad exacta de dígitos que componen cualquier número entero positivo introducido por entrada estándar (`System.in`).

## 📑 Tabla de Contenidos

* [1. Ficha Resumen del Proyecto](#1-ficha-resumen-del-proyecto)
* [2. Descripción y Propósito Funcional](#2-descripción-y-propósito-funcional)
* [3. Especificaciones Técnicas y Arquitectura](#3-especificaciones-técnicas-y-arquitectura)
* [4. Requisitos de Instalación y Ejecución](#4-requisitos-de-instalación-y-ejecución)
* [5. Estructura del Repositorio](#5-estructura-del-repositorio)
* [6. Autoría y Enlaces de Interés](#6-autoría-y-enlaces-de-interés)

## 1. Ficha Resumen del Proyecto

| Atributo                            | Especificación                                                                                 |
| ----------------------------------- | ----------------------------------------------------------------------------------------------- |
| **Nombre del proyecto**       | `ContarCifras`                                                                                |
| **Tipo de software**          | Aplicación de consola / Interfaz de Línea de Comandos (CLI)                                   |
| **Lenguaje de programación** | [Java (Java SE)](https://www.oracle.com/java/)                                                   |
| **Paradigma**                 | Programación Imperativa / Estructurada                                                         |
| **Plataformas soportadas**    | Multiplataforma (Windows, Linux, macOS mediante JVM) y ejecutable nativo (`ContarCifras.exe`) |
| **Licencia**                  | Uso académico / Código abierto                                                                |
| **Autor**                     | Edgar Barreto González                                                                         |

## 2. Descripción y Propósito Funcional

**`ContarCifras`** es una utilidad ligera de consola diseñada para resolver el conteo de dígitos de números enteros no negativos ($n \ge 0$).

### Capacidades principales:

* **Lectura interactiva:** Captura de datos numéricos enteros desde el flujo de entrada estándar mediante la clase `java.util.Scanner`.
* **Validación de dominio:** Filtrado lógico de valores negativos ($n < 0$), notificando al usuario mediante mensajes descriptivos sin ejecutar cálculos erróneos.
* **Tratamiento de casos límite:** Reconocimiento explícito del valor neutro `0` como un número válido compuesto por `1` cifra.
* **Control de flujo de salida:** Pausa controlada antes de la finalización del proceso para evitar el cierre abrupto de la ventana de terminal en sistemas Windows.

## 3. Especificaciones Técnicas y Arquitectura

El núcleo de la aplicación se apoya exclusivamente en la biblioteca estándar de Java (**Java Standard Edition**), eliminando la necesidad de dependencias externas o *frameworks* adicionales.

### 3.1. Componentes de la Plataforma Java

* **Entorno de ejecución:** [Java Runtime Environment (JRE)](https://www.java.com/es/) / [OpenJDK](https://openjdk.org/).
* **Entrada/Salida estándar:** Uso de `System.in` y `System.out` junto con [`java.util.Scanner`](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/Scanner.html) para el análisis léxico de tipos primitivos (`int`).
* **Tipos de datos y límites:** Los valores se almacenan como enteros de 32 bits con signo (`int`), operando en un rango válido de $[0, 2\,147\,483\,647]$ (hasta 10 cifras decimales).
* **Algoritmo de conteo:** Descomposición aritmética iterativa mediante divisiones enteras sucesivas entre base 10 (`numero /= 10`) o evaluación condicional directa para el caso base `0`.

### 3.2. Ejemplo de Interacción en Consola

```
Introduce un número entero positivo: 45892
El número 45892 tiene 5 cifra(s).
Pulsa Enter para salir...

```

## 4. Requisitos de Instalación y Ejecución

### 4.1. Prerrequisitos del Sistema

* **Java Development Kit (JDK)** versión 8 o superior (recomendado [JDK 17 LTS](https://adoptium.net/)) correctamente configurado en la variable de entorno `PATH`.
* Terminal de comandos (`cmd`, PowerShell, Bash o Zsh).

Comprobación rápida de la instalación de Java:

```
java -version
javac -version

```

### 4.2. Compilación y Ejecución desde Código Fuente

1. **Clonar el repositorio:**

   ```
   git clone https://github.com/Bgpocho06/ContarCifras.git
   cd ContarCifras

   ```
2. **Compilar el código fuente Java:**

   ```
   javac src/ContarCifras.java -d bin

   ```
3. **Ejecutar el bytecode en la JVM:**

   ```
   java -cp bin ContarCifras

   ```

### 4.3. Ejecución mediante Binario Empaquetado (Windows)

Si dispones de la distribución empaquetada para Windows, ejecuta directamente el archivo binario desde la terminal o mediante doble clic:

```
.\ContarCifras.exe

```

## 5. Estructura del Repositorio

```
ContarCifras/
├── src/
│   └── ContarCifras.java      # Código fuente principal de la aplicación
├── img/
│   └── ...                    # Capturas de evidencia de ejecución en consola
├── ContarCifras.exe           # Ejecutable empaquetado para entornos Windows
└── README.md                  # Ficha técnica del proyecto
```

## 6. Autoría y Enlaces de Interés

### Datos del Autor

* **Desarrollador:** Edgar Barreto González
* **Fecha de documentación:** 10/11/2026
* **Perfil de GitHub:** https://github.com/Bgpocho06

### Recursos Técnicos Consultados

* [Documentación Oficial de Java SE (Oracle)](https://docs.oracle.com/en/java/)
* [Especificación de la clase `Scanner` — Java API](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/Scanner.html)
* [Guía de sintaxis básica de Markdown — GitHub Docs](https://docs.github.com/es/get-started/writing-on-github/getting-started-with-writing-and-formatting-on-github/basic-writing-and-formatting-syntax)
