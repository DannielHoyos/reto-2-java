# reto-2-java
Misión Tic 2022 Ciclo #2 Universidad Nacional


Reto semana 2: Registro de estudiantes

La Universidad Nacional de Colombia ha decidido brindarle la oportunidad de desarrollar un pequeño demo de una aplicación para el registro de estudiantes de pregrado y posgrado. Como información se tiene que todos los estudiantes poseen atributos como nombre, edad, programa en el cual realiza sus estudios y tipo de etnia (indígena, afrocolombiano, raizal, gitana o ninguna).

Los estudiantes se clasifican como de pregrado o posgrado. El estudiante de pregrado tiene como característica el número de créditos aprobados de su programa, para el estudiante de posgrado es importante almacenar la modalidad de su programa la cual puede ser de profundidad o de investigación

Considere la especificación del siguiente diagrama de clases para este reto:

Diagrama de clases

Procesar Comandos
En la clase Registro, se debe definir la función procesarComandos que realiza las siguientes operaciones:

Agregar estudiante: Opción 1

Se puede añadir un estudiante de pregrado con el siguiente comando:

1&Pregrado&nombreEstudiante&edad&programa&etnia&creditosAprobados

Ejemplo

1&Pregrado&Luis Parra&21&Medicina&Raizal&15

Se puede añadir un estudiante de posgrado con el siguiente comando:

1&Posgrado&nombreEstudiante&edad&programa&etnia&modalidad

 Ejemplo:

1&Posgrado&María Sarmiento&25&Maestría en economía&Ninguna&Investigación

 

Listar ítems del registro: Opción 2

Se debe mostrar la frase: “***Listado de estudiantes***” Seguida por los estudiantes en el orden en el que fueron agregados.

Si se trata de un estudiante de pregrado se mostrará así. Recuerde que \t implica correr el ítem unos espacios a la derecha:

\tEstudiante Pregrado

\tNombre: Luis Parra

\tEdad: 21 anios

\tPrograma: Medicina

\tEtnia: Raizal

\tCreditos aprobados: 15

Si se trata de un estudiante de posgrado se mostrará así:

\tEstudiante Posgrado

\tNombre: María Sarmiento

\tEdad: 25 anios

\tPrograma: Maestría en economía

\tEtnia: Ninguna

\tModalidad: Investigación



Salir: Opción 3

Esta opción genera que la aplicación termine su ejecución.




Nota 1: Observe que el único comando que tiene salida es el listar.

Nota 2: En este ejercicio se requiere subir cuatro archivos. 

Uno correspondiente a la clase Estudiante llamado  Estudiante.java,
otro correspondiente al Estudiante de pregrado llamado  Pregrado.java
otro correspondiente al Estudiante de posgrado llamado  Posgrado.java
otro correspondiente al Registros llamado Registro.java (aquí va el método main)
Recuerde eliminar la línea de package al hacer el envío y utilizar el botón de [+] para agregar más de un archivo de código fuente. 
 

Ejemplo:

Un ejemplo de ejecución del programa es el siguiente:

Entrada

Salida

1&Posgrado&Maria Sarmiento&25&Maestria en economia&Ninguna&Investigacion

1&Pregrado&Luis Parra&21&Medicina&Raizal&15

1&Pregrado&Martha Casas&19&Derecho&Ninguna&42

1&Posgrado&Luz Salas&23&Maestria en ingenieria&Ninguna&Profundizacion

2

3

***Listado de estudiantes***

       Estudiante Posgrado

       Nombre: Maria Sarmiento

       Edad: 25 anios

       Programa: Maestria en economia

       Etnia: Ninguna

       Modalidad: Investigacion

       Estudiante Pregrado

       Nombre: Luis Parra

       Edad: 21 anios

       Programa: Medicina

       Etnia: Raizal

       Creditos aprobados: 15

       Estudiante Pregrado

       Nombre: Martha Casas

       Edad: 19 anios

       Programa: Derecho

       Etnia: Ninguna

       Creditos aprobados: 42

       Estudiante Posgrado

       Nombre: Luz Salas

       Edad: 23 anios

       Programa: Maestria en ingenieria

       Etnia: Ninguna

       Modalidad: Profundizacion

