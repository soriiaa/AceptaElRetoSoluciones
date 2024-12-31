package Numeros;

import java.util.HashSet;
import java.util.Scanner;

public class Problema624 {
	
	/*
	 *  Usuario: soriiaa._
	 */

	static Scanner in;

	public static boolean casoDePrueba() {

		// Creo una variable en la que almaceno el numero de calcetines
		String numeroEmparejar = in.nextLine();

		// Si el número es igual a 0
		if (numeroEmparejar.equals("0")) {
			// retorno false y se finaliza el programa
			return false;
		// Si no
		} else {
			
			// Creo una variable en la que almaceno el orden de los calcetines en ser sacados del barreño
			String ordenCalcetines = in.nextLine();
			// Almaceno en un array de strings los valores con un split
			String [] ordenCalcetinesArray = ordenCalcetines.split(" ");
			// Creo un conjunto de strings
			HashSet<String> conjuntoCalcetines = new HashSet<>();
			
			// Creo e inicializo un contador a 0.
			int contadorLongitud = 0;
			
			// Bucle for hasta la longitud del array del orden de los calcetines
			for (int i = 0; i < ordenCalcetinesArray.length; i++) {
				// Si el conjunto de los calcetines no contiene el valor del array en i
				if (!conjuntoCalcetines.contains(ordenCalcetinesArray[i])) {
					// Lo añade con el método add
					conjuntoCalcetines.add(ordenCalcetinesArray[i]);
					// Si el tamaño del conjunto es mayor que el contador
					if (conjuntoCalcetines.size() > contadorLongitud) {
						// Establezco el contador en el valor del tamaño del conjunto
						contadorLongitud = conjuntoCalcetines.size();
					}
				// Si el valor ya existe
				} else {
					// Se elimina el valor del conjunto
					conjuntoCalcetines.remove(ordenCalcetinesArray[i]);
				}
			}
				
			// Imprimo el contador del conjunto
			System.out.println(contadorLongitud);
			
			// Devuelvo true
			return true;
		}
	}

	public static void main(String[] args) {

		in = new java.util.Scanner(System.in);

		while (casoDePrueba());
	}
}
