package Numeros;

import java.util.ArrayList;
import java.util.Scanner;

public class Problema623 {
	
	/*
	 *  Usuario: soriiaa._
	 */

	static Scanner in;

	public static void casoDePrueba() {

		// Introduzco los numeros en una variable
		String numero = in.nextLine();

		// Los separo en un array con el metodo split
		String[] numeros = numero.split(" ");

		// Guardo cada numero en una variable String
		String numero1 = numeros[0];
		String numero2 = numeros[1];

		// Transformo cada numero en un array de String con el metodo split
		String[] numero1Array = numero1.split("");
		String[] numero2Array = numero2.split("");

		// Creo una lista para manipular los datos
		ArrayList<String> listaNumeros2 = new ArrayList<>();

		// Añado los numeros a la lista mediante un for y el metodo add
		for (int i = 0; i < numero2Array.length; i++) {
			listaNumeros2.add(numero2Array[i]);
		}

		// Creo una variable booleana iniciada en true para que se convierta a false en caso de error.
		boolean comprobador = true;

		// Creo un bucle for
		for (int i = 0; i < numero1Array.length; i++) {
			// Si la lista contiene el numero que está en la posición i del array.
			if (listaNumeros2.contains(numero1Array[i])) {
				// Lo elimina con el metodo remove, para que si aparece otro numero igual después, se pueda comparar correctamente.
				listaNumeros2.remove(numero1Array[i]);
				// Si no
			} else {
				// Establezco el comprobador en false
				comprobador = false;
			}
		}

		// Si el comprobador es true
		if (comprobador) {
			// Imprimo GANA
			System.out.println("GANA");
			// Si no
		} else {
			// Imprimo PIERDE
			System.out.println("PIERDE");
		}

	}

	public static void main(String[] args) {

		in = new java.util.Scanner(System.in);
		// He hecho el método con un nextLine porque sino luego da problemas
		String numCasos = in.nextLine();

		int numCasosInt = Integer.parseInt(numCasos);
		for (int i = 0; i < numCasosInt; i++) {
			casoDePrueba();
		}
	}
}
