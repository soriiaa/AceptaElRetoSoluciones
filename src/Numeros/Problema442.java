package Numeros;

public class Problema442 {

	static java.util.Scanner in;

	public static boolean casoDePrueba() {
		if (!in.hasNext())
			return false;
		else {

			String palabra = in.nextLine();

			String[] partes = palabra.split(" ");

			String parte1 = partes[0];
			String parte2 = partes[1];

			if (parte2.equals("CamelCase")) {
				parte1 = Character.toUpperCase(parte1.charAt(0)) + parte1.substring(1);
				for (int i = 0; i < parte2.length(); i++) {
					if (parte1.contains("_")) {
						
					}
				}
			}
			if (partes[1].equals("snake_case")) {

			}
			if (partes[1].equals("kebab-case")) {

			}

			System.out.println(parte1);

			return true;
		}
	}

	public static void main(String[] args) {

		in = new java.util.Scanner(System.in);
		while (casoDePrueba()) {

		}
	}
}
