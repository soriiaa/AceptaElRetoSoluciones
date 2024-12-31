package Numeros;

import java.util.Scanner;

public class Problema314 {

	static Scanner in;

	public static void casoDePrueba() {

		String numeroTemperaturasString = in.nextLine();
		int numeroTemperaturas = Integer.parseInt(numeroTemperaturasString);

		String temperaturas = in.nextLine();
		String[] arrayTemperaturasString = temperaturas.split(" ");
		int[] arrayTemperaturasInt = new int[numeroTemperaturas];

		for (int i = 0; i < numeroTemperaturas; i++) {
			arrayTemperaturasInt[i] = Integer.parseInt(arrayTemperaturasString[i]);
		}
		
		int pendiente = 0;
		
		for (int i = 0; i < arrayTemperaturasInt.length; i++)  {
			
			//if (arrayTemperaturasInt[i] < arr)
			
			
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
