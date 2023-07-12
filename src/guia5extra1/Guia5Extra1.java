/*
 En un nuevo proyecto implementaremos una Pila, una Pila es una estructura de datos donde las
inserciones y recuperaciones/borrados de datos se hacen en uno de los finales, que es conocido
como tope de la pila. Como el último elemento insertado es el primero en recuperarse/borrarse,
los desarrolladores se refieren a estas pilas como pilas LIFO (last-in, first-out).

    Agregar___     ___>quitar  
              |   |
              |   |
Tope--->  |   > 8     |
          |___________|    
          |	5     |
          |___________|	    	  
          |	2     |	
          |___________|
          |     7     |	  
          |___________|
          |     3     |
          |___________|
              Pila 

En este caso implementarán una Pila con las características y
comportamientos que se detallan en el siguiente modelo:

 ____________________________
|Clase: Pila                 |
|____________________________|
|-tope:int = -1              |
|-elementos: String[]        |
|____________________________|
|+Pila(tamaño:int)           |
|+agregar(elem:String):void  |
|+verTope():String           |
|+quitar():String            |
|+pilaVacia():boolean        | 
|+pilaLlena():boolean        |
|____________________________|

Según el modelo, la Pila tiene como atributos: el tope que es un entero que guardará la ubicación
del último elemento de la Pila y un arreglo de String cuyo tamaño se inicializará en el constructor
de la misma; posee además una serie de métodos que se describirán a continuación:
 agregar(elem:String):void  Incrementa en 1 el valor de tope y el String que recibe se
guardará en el tope de la Pila, siempre y cuando la Pila no esté llena.
 verTope():String  Retorna el String guardado en el tope de la Pila sin eliminarlo

 quitar():String  Retorna el String guardado en el tope de la Pila eliminándolo
(decrementa en 1 el valor de tope).
 pilaVacia():boolean  Devuelve true si el valor de tope es igual a -1.
 pilaLlena():boolean  Devuelve true si el valor de tope es igual a la longitud del arreglo
menos uno.

Luego, desde el método main de una clase TestPila, se pide:
a) Crear una Pila de 10 posiciones.
b) Agregar a la Pila 5 palabras.
c) Mostrar los datos guardados en la Pila sin perderlos.
 */
package guia5extra1;

import java.util.Scanner;


public class Guia5Extra1 {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        // Crear una Pila de 10 posiciones
        Pila pila = new Pila(10);

        // Solicitar al usuario que ingrese los elementos en la Pila
        System.out.println("Ingrese 5 palabras para agregar a la Pila:");
        for (int i = 0; i < 5; i++) {
            String palabra = leer.nextLine();
            pila.agregar(palabra);
        }

        // Mostrar los datos guardados en la Pila sin perderlos
        System.out.println("Datos en la Pila:");
        Pila pilaAuxiliar = new Pila(10);

        while (!pila.pilaVacia()) {
            String elem = pila.quitar();
            System.out.println(elem);
            pilaAuxiliar.agregar(elem);
        }

        // Restaurar los datos en la Pila original
        while (!pilaAuxiliar.pilaVacia()) {
            String elem = pilaAuxiliar.quitar();
            pila.agregar(elem);
        }

        leer.close();
    }
}
