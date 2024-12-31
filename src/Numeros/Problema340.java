package Numeros;

import java.util.Scanner;

public class Problema340 {

	static Scanner in;

	public static void casoDePrueba() {
		
		String numeros = in.nextLine();
		String[] arrayNumeros = numeros.split(" ");
		int numero1 = Integer.parseInt(arrayNumeros[0]);
		int numero2 = Integer.parseInt(arrayNumeros[1]);
		
		int numeroCerillas = 0;
		
		if (numero1 == 1) {
			numeroCerillas = 4;
		} else {
			numeroCerillas = 4 + (3 * (numero1 - 1));
		}
		
		if (numero2 != 1) {
			numeroCerillas += ((3 + (2 * (numero1 - 1))) * (numero2 - 1));
		}
		
		System.out.println(numeroCerillas);

	}

	public static void main(String[] args) {

		in = new java.util.Scanner(System.in);

		String numCasosString = in.nextLine();
		int numCasos = Integer.parseInt(numCasosString);
		for (int i = 0; i < numCasos; i++)
			casoDePrueba();

	}

}
