package Numeros;

import java.util.Arrays;
import java.util.Scanner;

public class Problema161 {

	static Scanner in;

	public static boolean casoDePrueba() {

		String numeroNumeros = in.nextLine();

		if (numeroNumeros.equals("0")) {
			return false;
		} else {

			String numeros = in.nextLine();
			
			String[] arrayNumerosString = numeros.split(" ");
			
			int[] arrayNumerosInt = new int[arrayNumerosString.length];
			
			for (int i = 0; i < arrayNumerosString.length; i++) {
				arrayNumerosInt[i] = Integer.parseInt(arrayNumerosString[i]);
			}
			
			Arrays.sort(arrayNumerosInt);
			
			if (arrayNumerosInt.length % 2 == 1) {
				int posicion = arrayNumerosInt.length / 2;
				System.out.println(arrayNumerosInt[posicion] * 2);
			} else {
				int posicion1 = (arrayNumerosInt.length / 2) - 1;
				int posicion2 = posicion1 + 1;
				
				double media = (double) (arrayNumerosInt[posicion1] + arrayNumerosInt[posicion2]) / 2;
				int mediaInt = (int) (media * 2);
				System.out.println(mediaInt);
			}
			
			return true;
		}

	}

	public static void main(String[] args) {

		in = new java.util.Scanner(System.in);

		while (casoDePrueba())
			;

	}
}
