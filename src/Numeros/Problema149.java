package Numeros;

import java.util.Arrays;

public class Problema149 {

	static java.util.Scanner in;

	public static boolean casoDePrueba() {
		
		if (!in.hasNext())
			return false;
		else {
			
			int contador;
			int cantidadToros = in.nextInt();
			int [] toros = new int [cantidadToros];
			for (int i = 0; i < cantidadToros; i++) {
				toros[i] = in.nextInt();
			}
			
			Arrays.sort(toros);
			contador = toros[toros.length - 1];
			System.out.println(contador);
			
			return true;
		}
	}

	public static void main(String[] args) {
		in = new java.util.Scanner(System.in);
		while (casoDePrueba()) {
		}
	}
}