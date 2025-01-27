package Numeros;

public class Problema157 {

	static java.util.Scanner in;

	public static void casoDePrueba() {
		
		String numeros = in.nextLine();
		String[] numerosArrayString = numeros.split(" ");
		
		int numero1 = Integer.parseInt(numerosArrayString[0]);
		int numero2 = Integer.parseInt(numerosArrayString[1]);
		
		int contador = 0;
		
		for (int i = 1; i < numero2; i++) {
			
			if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12) {
				contador += 31;
			} else if (i == 2) {
				contador += 28;
			} else {
				contador += 30;
			}
		}
		
		System.out.println(365 - (contador + numero1));
		
		

	}

	public static void main(String[] args) {

		in = new java.util.Scanner(System.in);

		String numeroCasosString = in.nextLine();
		int numCasos = Integer.parseInt(numeroCasosString);
		for (int i = 0; i < numCasos; i++)
			casoDePrueba();
	}

}
