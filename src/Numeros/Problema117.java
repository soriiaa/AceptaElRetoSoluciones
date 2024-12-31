package Numeros;

import java.util.Scanner;

public class Problema117 {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int numDesconocidos = in.nextInt();
		in.nextLine();
		
		String [] nombres = new String[numDesconocidos];
		String [] nombres2 = new String[numDesconocidos];
		
		for (int i = 0; i < nombres.length; i++) {
			nombres[i] = in.nextLine();
		}
		
		for (int i = 0; i < nombres.length; i++) {
			nombres2[i] = nombres[i].substring(4, nombres[i].length());
		}
		
		for (int i = 0; i < nombres2.length; i++) {
			System.out.println("Hola, " + nombres2[i] + ".");
		}
	}
}
