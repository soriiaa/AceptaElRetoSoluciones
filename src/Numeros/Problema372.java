package Numeros;

public class Problema372 {

	static java.util.Scanner in;

	public static void casoDePrueba() {
		
		String palabra = in.nextLine();
		
		char letra = palabra.charAt(0);
		
		StringBuilder palabra2 = new StringBuilder(palabra);
			
		palabra2.reverse();
		
		String palabra3 = palabra2.toString();

		
		System.out.println(palabra3);
		
		if (Character.isUpperCase(letra)) {
			palabra3 = Character.toUpperCase(palabra3.charAt(0)) + palabra3.substring(1);
		}
	}

	public static void main(String[] args) {

		in = new java.util.Scanner(System.in);

		int numCasos = in.nextInt();
		for (int i = 0; i < numCasos; i++)
			casoDePrueba();
	}
}