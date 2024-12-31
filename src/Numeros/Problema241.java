package Numeros;

import java.util.Scanner;

public class Problema241 {

	static Scanner in;

	public static void casoDePrueba() {

		String numeroHojasString = in.next();
		int numeroHojas = Integer.parseInt(numeroHojasString);
		
		if (numeroHojas < 3 || numeroHojas == 5) {
			System.out.println("IMPOSIBLE");
		} else {
			System.out.println(numeroHojas % 3);
		}
		
		
	} 

	public static void main(String[] args) {

		in = new java.util.Scanner(System.in);

		int numCasos = in.nextInt();
		
		for (int i = 0; i < numCasos; i++)
			casoDePrueba();

	}

}
