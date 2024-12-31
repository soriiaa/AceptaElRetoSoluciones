package Numeros;

import java.util.Scanner;

public class Problema313 {

	static Scanner in;

	public static void casoDePrueba() {
		
		String numeros = in.nextLine();	
		
		String[] arrayNumerosString = numeros.split(" ");
		int numeroInicial = Integer.parseInt(arrayNumerosString[0]);
		int numeroFinal = Integer.parseInt(arrayNumerosString[1]);
		
		if (numeroInicial + numeroFinal >= 0) {
			System.out.println("SI");
		} else {
			System.out.println("NO");
		}

	}

	public static void main(String[] args) {

		in = new java.util.Scanner(System.in);

		String numCasosString = in.nextLine();
		int numCasos = Integer.parseInt(numCasosString);
		
		for (int i = 0; i < numCasos; i++)
			casoDePrueba();

	}

}
