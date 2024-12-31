package Numeros;

import java.util.Scanner;

public class Problema300 {

	static Scanner in;

	public static void casoDePrueba() {
		
		String palabra = in.nextLine();
		
		int[] arrayVocales = new int[5];
		
		for (int i = 0; i < 5; i++) {
			arrayVocales[i] = 0;
		}
		
		for (int i = 0; i < palabra.length(); i++) {
			
			String letra = String.valueOf(palabra.charAt(i));
			
			if(letra.equals("a")) {
				arrayVocales[0] += 1;
			} else if(letra.equals("e")) {
				arrayVocales[1] += 1;
			} else if(letra.equals("i")) {
				arrayVocales[2] += 1;
			} else if(letra.equals("o")) {
				arrayVocales[3] += 1;
			} else if(letra.equals("u")) {
				arrayVocales[4] += 1;
			}
			
		}
		
		String respuesta = "SI";

		for (int i = 0; i < arrayVocales.length; i++) {
			if (arrayVocales[i] == 0) {
				respuesta = "NO";
			}
		}
		
		System.out.println(respuesta);
		
	}

	public static void main(String[] args) {

		in = new java.util.Scanner(System.in);

		String numCasosString = in.nextLine();
		int numCasos = Integer.parseInt(numCasosString);
		
		for (int i = 0; i < numCasos; i++)
			casoDePrueba();
	}

}
