package Numeros;

import java.util.Scanner;

public class Problema119 {

	static Scanner in;

	public static boolean casoDePrueba() {

		String numeroLegionariosString = in.nextLine();

		if (numeroLegionariosString.equals("0")) {
			return false;
		} else {

			int numeroLegionarios = Integer.parseInt(numeroLegionariosString);

			boolean repetir = true;
			int numeroPrueba = 1;
			int numeroEscudos = 0;

			do {
				
				int numeroCuadrado = numeroPrueba * numeroPrueba;
				int numeroCuadradoAnterior = (numeroPrueba - 1) * (numeroPrueba - 1);

				if (numeroCuadrado > numeroLegionarios) {

					numeroLegionarios = numeroLegionarios - numeroCuadradoAnterior;

					int legionActual = numeroPrueba - 1;
					numeroEscudos += (legionActual * 4) + (legionActual * legionActual);
					
					numeroPrueba = 0;

				} else if (numeroCuadrado == numeroLegionarios) {

					numeroLegionarios = 0;

					int legionActual = numeroPrueba;
					numeroEscudos += (legionActual * 4) + (legionActual * legionActual);

				}

				if (numeroLegionarios == 0) {
					repetir = false;
				}

				numeroPrueba++;

			} while (repetir);

			System.out.println(numeroEscudos);

			return true;
		}

	}

	public static void main(String[] args) {

		in = new java.util.Scanner(System.in);

		while (casoDePrueba())
			;

	}

}
