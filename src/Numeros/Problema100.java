package Numeros;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Problema100 {

	static Scanner in;

	public static void casoDePrueba() {

		int numeroIntroducido = in.nextInt();
		String numeroIntroducidoString = String.valueOf(numeroIntroducido);
		int c = numeroIntroducido;

		if (numeroIntroducido == 6174) {
			System.out.println("0");
		} else if (c == 0 || c == 1111 || c == 2222 || c == 3333 || c == 4444 || c == 5555 || c == 6666 || c == 7777
				|| c == 8888 || c == 9999) {
			System.out.println("8");
		} else {

			int resultado = 0;
			int contador = 0;

			do {

				contador++;

				char[] arrayNumeroModificadoChar = numeroIntroducidoString.toCharArray();
				String[] arrayNumeroModificadoString = new String[arrayNumeroModificadoChar.length];

				for (int i = 0; i < arrayNumeroModificadoChar.length; i++) {
				    arrayNumeroModificadoString[i] = String.valueOf(arrayNumeroModificadoChar[i]);
				}
				
				int[] arrayNumerosProvisional = new int[arrayNumeroModificadoString.length];

				ArrayList<Integer> listaDigitosAscendente = new ArrayList<>();
				ArrayList<Integer> listaDigitosDescendente = new ArrayList<>();

				/* Use esto para comprobar que fallaba en el compilador de acepta el reto.
				
				if (arrayNumeroModificadoString.length == 5) {
					while (true) {
						int hola = 0;
						hola++;
					}
				}
				
				*/
							
				for (int i = 0; i < arrayNumerosProvisional.length; i++) {
					arrayNumerosProvisional[i] = Integer.parseInt(arrayNumeroModificadoString[i]);
				}

				

				for (int i = 0; i < arrayNumeroModificadoString.length; i++) {

					listaDigitosAscendente.add(arrayNumerosProvisional[i]);
					listaDigitosDescendente.add(arrayNumerosProvisional[i]);

				}

				Collections.sort(listaDigitosAscendente);
				Collections.sort(listaDigitosDescendente, Collections.reverseOrder());

				int numeroMayor = 0;
				int numeroMenor = 0;

				for (int i = 0; i < listaDigitosAscendente.size(); i++) {
					numeroMenor = (numeroMenor * 10) + listaDigitosAscendente.get(i);
				}

				for (int i = 0; i < listaDigitosDescendente.size(); i++) {
					numeroMayor = (numeroMayor * 10) + listaDigitosDescendente.get(i);
				}

				String numeroMayorString = numeroMayor + "";

				if (numeroMayorString.length() == 3) {
					numeroMayor = numeroMayor * 10;
				} else if (numeroMayorString.length() == 2) {
					numeroMayor = numeroMayor * 100;
				} else if (numeroMayorString.length() == 1) {
					numeroMayor = numeroMayor * 1000;
				}

				resultado = numeroMayor - numeroMenor;

				numeroIntroducidoString = Integer.toString(resultado);

			} while (resultado != 6174);

			System.out.println(contador);

		}

	}

	public static void main(String[] args) {

		in = new java.util.Scanner(System.in);

		int numCasos = in.nextInt();

		for (int i = 0; i < numCasos; i++) {
			casoDePrueba();
		}

		in.close();

	}
}
