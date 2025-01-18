package Numeros;

import java.util.Scanner;

public class Problema101 {

	static Scanner in;

	public static boolean casoDePrueba() {

		String tamanoMatrizString = in.nextLine();
		int tamanoMatriz = Integer.parseInt(tamanoMatrizString);

		if (tamanoMatrizString.equals("0")) {
			return false;
		} else {

			String numeros = in.nextLine();

			String[] arrayNumeros = numeros.split(" ");
			int[][] arrayNumerosBidimensional = new int[tamanoMatriz][tamanoMatriz];
			String[][] arrayNumerosBidimensionalString = new String[tamanoMatriz][tamanoMatriz];

			int contador = 0;

			for (int i = 0; i < tamanoMatriz; i++) {
				for (int j = 0; j < tamanoMatriz; j++) {
					arrayNumerosBidimensional[i][j] = Integer.parseInt(arrayNumeros[contador]);
					arrayNumerosBidimensionalString[i][j] = arrayNumeros[contador];
					contador++;
				}
			}
			
			// Tengo que contar aqui las filas y las columnas y después hacer las diagonales
			int contarNumeros = 0;
			
			for (int i = 0; i < tamanoMatriz; i++) {
				for (int j = 0; j < tamanoMatriz; j++) {
					contarNumeros += arrayNumerosBidimensional[i][j];
				}
			}

			boolean esEsoterico = true;
			int contador2 = 0;
			int longitudComprobacion = 0;

			// Aqui compruebo si el cuadrado es esotérico
			for (int i = 0; i < tamanoMatriz; i++) {
				for (int j = 0; j < tamanoMatriz; j++) {

					if (contador2 == 0) {
						longitudComprobacion = arrayNumerosBidimensionalString[i][j].length();
					}

					contador2++;

					if (arrayNumerosBidimensionalString[i][j].length() != longitudComprobacion) {
						esEsoterico = false;
					}
				}
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
