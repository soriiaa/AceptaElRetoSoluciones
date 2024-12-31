package Numeros;

import java.util.Scanner;

public class Problema772 {

	static Scanner in;

	public static boolean casoDePrueba() {

		String entrada = in.nextLine();

		if (entrada.equals("0 0")) {
			return false;
		} else {

			String[] arrayAnoVecesString = entrada.split(" ");
			int[] arrayAnoVeces = new int[2];
			
			arrayAnoVeces[0] = Integer.parseInt(arrayAnoVecesString[0]);
			arrayAnoVeces[1] = Integer.parseInt(arrayAnoVecesString[1]);
			
			int anoMayor = arrayAnoVeces[0];
			int anoMenor = arrayAnoVeces[0];
			
			for (int i = 0; i < arrayAnoVeces[1]; i++) {
				anoMayor += 79;
				anoMenor += 74;
			}
			
			System.out.println("[" + anoMenor + " .. " + anoMayor + "]");
			
			return true;
		}

	}

	public static void main(String[] args) {

		in = new java.util.Scanner(System.in);

		while (casoDePrueba())
			;

	}

}
