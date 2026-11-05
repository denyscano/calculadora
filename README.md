# Calculadora (Java)

Calculadora de consola desarrollada en Java que realiza las cuatro operaciones matemáticas básicas mediante un menú interactivo con colores ANSI.

## Características

- Menú interactivo que se repite hasta que el usuario elige salir
- Operaciones: suma, resta, multiplicación y división
- Soporta números decimales (usa `double`)
- Validación de entradas: solo números entre 1 y 5
- Control de la división entre cero

## Requisitos

- Java JDK 8 o superior
- Una terminal con soporte de colores ANSI (la mayoría lo tienen; en Windows funciona bien en Windows Terminal, PowerShell moderno o Git Bash)

Para comprobar tu versión de Java:

```bash
java -version
```

## Instalación y ejecución

1. Clona el repositorio:

```bash
git clone https://github.com/denyscano/calculadora.git
cd calculadora
```

2. Compila el proyecto:

```bash
javac App.java
```

3. Ejecuta el programa:

```bash
java App
```

## Uso

Al iniciar se muestra el menú principal:

```
+----------------------------------------+
|             MENU PRINCIPAL             |
+----------------------------------------+
|                                        |
|   1. SUMAR                             |
|   2. RESTAR                            |
|   3. MULTIPLICAR                       |
|   4. DIVIDIR                           |
|                                        |
|   5. SALIR                             |
|                                        |
+----------------------------------------+
```

Elige una opción, introduce los dos números y el programa mostrará el resultado. Después vuelve al menú para realizar otra operación.

**Ejemplo:**

```
Seleccione que operacion quiere Realiza: 1

Inserte el primer número: 8

Inserte el segundo número: 2.5

Resultado:  10.5
```

## Validaciones

- Si escribes texto en lugar de un número, se muestra un error y se vuelve a pedir el dato.
- Si eliges una opción fuera del rango del menú (1 a 5), se muestra un error y se vuelve a pedir.
- Si intentas dividir entre cero, se muestra un aviso en lugar de que el programa falle.

## Estructura del proyecto

```
calculadora/
├── App.java
└── README.md
```

## Funciones principales

| Método | Descripción |
|--------|-------------|
| `sumar(a, b)` | Devuelve `a + b` |
| `restar(a, b)` | Devuelve `a - b` |
| `multiplicar(a, b)` | Devuelve `a * b` |
| `dividir(a, b)` | Devuelve `a / b`; lanza `ArithmeticException` si `b` es 0 |

## Autores

- [Elena M. Gonzales](https://github.com/elenaxf)
- [Denys Sifonte](https://github.com/denyscano)
- [Pablo Martinez](https://github.com/Ska-sudosu)
- [Roberto Guisado](https://github.com/robertoguisado1)

