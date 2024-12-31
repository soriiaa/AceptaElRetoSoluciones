package Numeros;

import java.util.*;

public class Problema659 {

	static Scanner in;

	public static boolean casoDePrueba() {

		int numero1 = in.nextInt();
		
		String numero = Integer.toString(numero1);

		if (numero.equals("0")) {
			return false;
		}
		else {

			String[] numeroArrayString = numero.split("");

			int[] numeroArrayInt = new int[numero.length()];

			for (int i = 0; i < numero.length(); i++) {
				numeroArrayInt[i] = Integer.parseInt(numeroArrayString[i]);
			}

			int diferencia = 7 - numeroArrayInt.length;

			LinkedList<Integer> listaNumeros = new LinkedList<>();

			if (diferencia > 0) {
				for (int i = 0; i < diferencia; i++) {
					listaNumeros.add(0);
				}
			}

			for (int i = 0; i < numeroArrayInt.length; i++) {
				listaNumeros.add(numeroArrayInt[i]);
			}

			int siete = listaNumeros.poll();
			int seis = listaNumeros.poll();
			int cinco = listaNumeros.poll();
			int cuatro = listaNumeros.poll();
			int tres = listaNumeros.poll();
			int dos = listaNumeros.poll();
			int uno = listaNumeros.poll();

			if (siete > 0) {
				for (int i = 0; i < siete; i++) {
					System.out.print("H");
				}
			}

			if (seis > 0) {
				for (int i = 0; i < seis; i++) {
					System.out.print("R");
				}
			}

			if (cinco > 0) {
				for (int i = 0; i < cinco; i++) {
					System.out.print("D");
				}
			}

			if (cuatro > 0) {
				for (int i = 0; i < cuatro; i++) {
					System.out.print("F");
				}
			}

			if (tres > 0) {
				for (int i = 0; i < tres; i++) {
					System.out.print("C");
				}
			}

			if (dos > 0) {
				for (int i = 0; i < dos; i++) {
					System.out.print("G");
				}
			}

			if (uno > 0) {
				for (int i = 0; i < uno; i++) {
					System.out.print("T");
				}
			}

			System.out.println("");

			return true;

		}
	}

	public static void main(String[] args) {

		in = new java.util.Scanner(System.in);
		while (casoDePrueba())
			;
	}
}
