package Numeros;

import java.util.ArrayDeque;
import java.util.Scanner;

public class Problema473 {
	
	/*
	 * @Author Alejandro Soria Problema 473
	 * 
	 * Usuario: soriiaa._
	 */
	
	/*
	 * @2ºAuthor Steven García
	 */

	static Scanner in;

	public static boolean casoDePrueba() {

		// Guardo en la variable info la entrada
		String info = in.nextLine();
		// Si en la variable aparece 0 0, se finaliza el programa
		if (info == "0 0")
			return false;
		else {
			
			// Añado un array de Strings de 2 espacios
			String[] infoArray = new String[2];
			// Guardo en el array la cadena cortada
			infoArray = info.split(" ");
			// Creo un array de int de 2 posiciones
			int[] infoArrayInt = new int[2];
			// Almaceno en las posiciones del array de int los valores con un Integer.parseInt
			infoArrayInt[0] = Integer.parseInt(infoArray[0]);
			infoArrayInt[1] = Integer.parseInt(infoArray[1]);
			
			// Si las posiciones 0 y 1 son iguales a 0
			if ((infoArrayInt[0] == 0) && (infoArrayInt[1] == 0)) {
				// Salgo abruptamente del programa con un .exit      Lo siento Pedro :( 
				System.exit(0);
			}

			// Creo una cola de Integer llamada colaBalones
			ArrayDeque<Integer> colaBalones = new ArrayDeque<>();

			// Creo un bucle for para recorrer el array
			for (int i = 1; i < infoArrayInt[0] + 1; i++) {
				// Introduzco el numero i en colaBalones
				colaBalones.offer(i);
			}

			// Inicio una variable de tipo int llamada contador en 0
			int contador = 0;
			
			// Mientras que el tamaño del colaBalones sea mayor que 1
			while (colaBalones.size() > 1) {
				// Si el contador es igual al array en la posicion 1 menos 1
				if (contador == infoArrayInt[1] - 1) {
					// Saco el valor de la cola
					colaBalones.poll();
				} else {
					// Si no, introduzco el valor que he sacado previamente
					colaBalones.offer(colaBalones.poll());
				}
				// Sumo 1 al contador
				contador++;
				// El contador es igual al contador mantenido por debajo del valor de infoArrayInt en la posicion 1
				contador = contador % infoArrayInt[1];
			}
			
			// Imprimo el valor que saco
			System.out.println(colaBalones.poll());

			return true;
		}

	}

	public static void main(String[] args) {

		in = new java.util.Scanner(System.in);
		while (casoDePrueba());

	}
}
