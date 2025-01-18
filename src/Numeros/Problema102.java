package Numeros;

import java.util.ArrayList;
import java.util.Scanner;

public class Problema102 {

	static Scanner in;

	public static boolean casoDePrueba() {

		String fraseInicial = in.nextLine();

		char primeraLetra = fraseInicial.charAt(0);

		char letraP = 'p';

		int distancia = primeraLetra - letraP;
		distancia = distancia % 26;

		int contarVocales = 0;

		ArrayList<Character> listaLetras = new ArrayList<>();

		for (int i = 1; i < fraseInicial.length(); i++) {

			if (fraseInicial.charAt(i) < 123 && fraseInicial.charAt(i) > 96) {

				char letraModificada = (char) (fraseInicial.charAt(i) - distancia);
				
				if (letraModificada > 122) {
					letraModificada = (char) (letraModificada - 26);
				}
				
				if (letraModificada < 97) {
					letraModificada = (char) (letraModificada + 26);
				}
				

				if (letraModificada == 'a' || letraModificada == 'e' || letraModificada == 'i' || letraModificada == 'o' || letraModificada == 'u') {
					contarVocales++;
				}

				listaLetras.add(letraModificada);

			} else if (fraseInicial.charAt(i) < 91 && fraseInicial.charAt(i) > 64) {

				char letraModificada = (char) (fraseInicial.charAt(i) - distancia);

				if (letraModificada > 90) {
					letraModificada = (char) (letraModificada - 26);
				}
				
				if (letraModificada < 64) {
					letraModificada = (char) (letraModificada + 26);
				}
				
				
				if (letraModificada == 'A' || letraModificada == 'E' || letraModificada == 'I' || letraModificada == 'O' || letraModificada == 'U') {
					contarVocales++;
				}

				listaLetras.add(letraModificada);

			} else {
				listaLetras.add(fraseInicial.charAt(i));
			}

		}

		if (listaLetras.size() == 3) {

			if ((listaLetras.get(0) == 'F') && (listaLetras.get(1) == 'I') && (listaLetras.get(2) == 'N')) {
				return false;
			}

		}

		System.out.println(contarVocales);

		return true;

	}

	public static void main(String[] args) {

		in = new java.util.Scanner(System.in);

		while (casoDePrueba())
			;

	}

}
