package Numeros;

import java.util.Scanner;

public class Problema771 {

	static Scanner in;

	public static void casoDePrueba() {
		
		String numeroAnos = in.next();
		int numeroAnosInt = Integer.parseInt(numeroAnos);
		System.out.println(numeroAnosInt * 4);

	}

	public static void main(String[] args) {

		in = new java.util.Scanner(System.in);

		int numCasos = in.nextInt();
		for (int i = 0; i < numCasos; i++)
			casoDePrueba();

	}

}
