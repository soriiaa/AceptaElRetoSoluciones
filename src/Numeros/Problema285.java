package Numeros;

import java.util.*;

public class Problema285 {

	static Scanner in;

	public static boolean casoDePrueba() {

		String numeroCubos = in.nextLine();

		if (numeroCubos.equals("0")) {
			return false;
		} else {

			String comidaEnCubos = in.nextLine();
			String[] comidaEnCubosArrayString = comidaEnCubos.split(" ");

			LinkedList<Integer> listaCubos = new LinkedList<>();

			for (int i = 0; i < comidaEnCubosArrayString.length; i++) {
				listaCubos.add(Integer.parseInt(comidaEnCubosArrayString[i]));
			}

			int recuento = 0;
			int turno = 0;

			while (!listaCubos.isEmpty()) {

				if (listaCubos.size() == 1) {
					if (turno % 2 == 0) {
						recuento = recuento + listaCubos.getFirst();
						listaCubos.removeFirst();
					} else if (turno % 2 != 0) {
						listaCubos.removeFirst();
					}
				} else if (listaCubos.size() > 1) {

					int extremo1 = listaCubos.getFirst();
					int extremo2 = listaCubos.getLast();

					if ((extremo1 > extremo2) && (turno % 2 == 0)) {
						recuento = recuento + extremo1;
						listaCubos.removeFirst();
					}

					if ((extremo2 > extremo1) && (turno % 2 == 0)) {
						recuento = recuento + extremo2;
						listaCubos.removeLast();
					}

					if ((extremo1 > extremo2) && (turno % 2 != 0)) {
						listaCubos.removeFirst();
					}

					if ((extremo2 > extremo1) && (turno % 2 != 0)) {
						listaCubos.removeLast();
					}
				}
				turno++;
			}

			System.out.println(recuento);

			return true;
		}
	}

	public static void main(String[] args) {

		in = new Scanner(System.in);
		
		while (casoDePrueba());

	}
}
