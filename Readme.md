# MÉTODO MONTECARLO

Este proyecto implementa un algoritmo para calcular una aproximación al número Pi utilizando el método de Montecarlo. El programa genera un número definido de puntos aleatorios en un cuadrado unitario y determina cuántos de esos puntos caen dentro de un círculo inscrito en el cuadrado. Luego, utiliza la relación entre el área del círculo y el área del cuadrado para calcular una aproximación al valor de Pi. Ahora, el cálculo se ha optimizado utilizando **expresiones lambda y programación funcional** en Java.

## CLONACIÓN DEL PROGRAMA A SU PC.

- Después de abrir la terminal de Linux/Ubuntu o Git Bash en Windows.

- Navega al directorio en el que deseas clonar el repositorio. Puedes usar el comando cd para cambiar al directorio deseado.

 *|Por ejemplo: cd directorio/de/destino|*

## GIT.

- En GitHub, ve al repositorio que deseas clonar. Copia la URL del repositorio. Puedes encontrar la URL en la página principal del repositorio, generalmente en la esquina superior derecha. La URL tendrá un formato similar a https://github.com/nombreusuario/nombrerepositorio.git.

- En tu terminal, usa el comando git clone seguido de la URL del repositorio.

*|Por ejemplo: git clone https://github.com/nombreusuario/nombrerepositorio.git|*

- Reemplaza https://github.com/nombreusuario/nombrerepositorio.git con la URL del repositorio que deseas clonar, en este caso:

*|https://github.com/Feder1711/Pr-ctica-3-Programaci-n-II.git|*

- Git clonará el repositorio en tu directorio de destino. Verás un mensaje que indica que el clon se ha completado.


### INSTALACIÓN DEL PROGRAMA.

- Navega al directorio del programa como se ha mencionado anteriormente (cd directorio/de/destino)

- Debe escribir en su consola "make compilar" (con esto se compila, se limpian los .class anteriores, los html)

- Si solo desea compilar el programa puede hacerlo con "make compilar"


### EJECUCIÓN DEL PROGRAMA.

- Navega al directorio del programa como se ha mencionado anteriormente (cd directorio/de/destino)
- Ejecutar el siguiente comando para utilizar el programa con la nueva versión optimizada con expresiones lambda:

	java -cp bin aplicacion.Principal <numero_de_pasos>
----------------------------------------------------------------------------------------------------------
	"java -cp bin aplicacion.Principal 10000"


## GENERACIÓN DEL JAVADOC EN HTML.

- Navega al directorio del programa como se ha mencionado anteriormente (cd directorio/de/destino)
- Debe escribir en su consola "make javadoc"
- La consola le indicará que se ha completado la creación del javadoc.

# ESTRUCTURA INTERNA DEL PROGRAMA / APLICACIÓN.

En el directorio del programa tenemos un diagrama que indica de manera gráfica lo que hay aquí abajo.

## Paquete *mates*:
Este paquete contiene la clase Matematicas, que se encarga de realizar los cálculos para obtener una aproximación al número Pi utilizando el método de Montecarlo con **expresiones lambda** y programación funcional para mejorar la eficiencia del cálculo.



## Paquete *aplicacion*: 
La clase Principal contiene el método main, que se encarga de llamar al método generarNumeroPiIterativo de la clase Matematicas para obtener una aproximación al número Pi. Toma el número de pasos como argumento de línea de comandos y muestra el resultado por consola.
