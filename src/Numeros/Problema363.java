package Numeros;

import java.util.Scanner;

public class Problema363 {

	static Scanner in;

	public static boolean casoDePrueba() {

		int numeroCaloriasEntrenamiento = in.nextInt();
		

		if (numeroCaloriasEntrenamiento == 0) {
			return false;
		} else {

			int numeroComilonasString = in.nextInt();
			in.nextLine();

			String caloriasPorComidaString = in.nextLine();
			String[] arrayCaloriasPorComidaString = caloriasPorComidaString.split(" ");

			int sumaCaloriasGanadas = 0;

			for (int i = 0; i < arrayCaloriasPorComidaString.length; i++) {
				sumaCaloriasGanadas += Integer.parseInt(arrayCaloriasPorComidaString[i]);
			}

			double division = (double) sumaCaloriasGanadas / numeroCaloriasEntrenamiento;
			int comprobador = (int) division;

			if (division != comprobador) {
				System.out.println(comprobador + 1);
			} else {
				System.out.println(comprobador);
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
