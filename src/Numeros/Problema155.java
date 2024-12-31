package Numeros;

public class Problema155 {

	static java.util.Scanner in;

	public static boolean casoDePrueba() {
		
		if (!in.hasNext())
			return false;
		else {
			int coordenadaX = in.nextInt();
			int coordenadaY = in.nextInt();

			if (coordenadaX < 0 || coordenadaY < 0) {
				return false;
			} else {
				System.out.println((coordenadaX * 2) + (coordenadaY * 2));
				return true;
			}
		}
	}

	public static void main(String[] args) {
		in = new java.util.Scanner(System.in);
		while (casoDePrueba()) {
		}
	}

}