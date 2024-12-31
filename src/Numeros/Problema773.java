package Numeros;

import java.util.Scanner;

public class Problema773 {

	static Scanner in;

	public static boolean casoDePrueba() {

		String limiteMedicoTipos = in.nextLine();

		if (limiteMedicoTipos.equals("0 0")) {
			return false;
		} else {

			String maximaCantidadPorTipo = in.nextLine();
			String polvoronesPorTipo = in.nextLine();

			String[] arrayLimitePolvoronesString = limiteMedicoTipos.split(" ");
			String[] arrayMaximaCantidadPorTipoString = maximaCantidadPorTipo.split(" ");
			String[] arrayPolvoronesPorTipoString = polvoronesPorTipo.split(" ");

			int limitePolvorones = Integer.parseInt(arrayLimitePolvoronesString[0]);
			int[] arrayMaximaCantidadPorTipo = new int[arrayMaximaCantidadPorTipoString.length];
			int[] arrayPolvoronesPorTipo = new int[arrayPolvoronesPorTipoString.length];

			for (int i = 0; i < arrayMaximaCantidadPorTipoString.length; i++) {
				arrayMaximaCantidadPorTipo[i] = Integer.parseInt(arrayMaximaCantidadPorTipoString[i]);
			}
			
			for (int i = 0; i < arrayPolvoronesPorTipoString.length; i++) {
				arrayPolvoronesPorTipo[i] = Integer.parseInt(arrayPolvoronesPorTipoString[i]);
			}
			
			boolean puedePorTipo = true;
			
			for (int i = 0; i < arrayMaximaCantidadPorTipo.length; i++) {
				if (arrayMaximaCantidadPorTipo[i] - arrayPolvoronesPorTipo[i] < 0) {
					puedePorTipo = false;
				}
			}
			
			int cantidadTotalPolvorones = 0;
			
			for (int i = 0; i < arrayPolvoronesPorTipo.length; i++) {
				cantidadTotalPolvorones += arrayPolvoronesPorTipo[i];
			}
			
			if ((limitePolvorones >= cantidadTotalPolvorones) && (puedePorTipo)) {
				System.out.println("SI");
			} else {
				System.out.println("NO");
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
