package Numeros;

import java.util.Scanner;

public class Problema116 {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int numeroVeces;
		
		do {
			
			numeroVeces = in.nextInt();
			
		} while ((numeroVeces < 0) || (numeroVeces > 5));
		
		for (int i = 0; i < numeroVeces; i++) {
			System.out.println("Hola mundo.");
		}
	}
}
