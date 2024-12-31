package Numeros;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Problema774 {

	static Scanner in;

	public static boolean casoDePrueba() {

		String numeroLuces = in.nextLine();

		if (numeroLuces.equals("0")) {
			return false;
		} else {

			String tira = in.nextLine();

			String[] arrayTiraString = tira.split(" ");

			ArrayList<Integer> listaTira = new ArrayList<>();
			HashSet<Integer> numeros = new HashSet<>();

			for (int i = 0; i < arrayTiraString.length; i++) {
				listaTira.add(Integer.parseInt(arrayTiraString[i]));
				numeros.add((Integer.parseInt(arrayTiraString[i])));
			}

			int numeroActual = 0;

			ArrayList<Integer> listaNoRepetidos = new ArrayList<>(numeros);
			HashMap<Integer, Integer> ultimasPosiciones = new HashMap<>();

			for (int i = 0; i < listaTira.size(); i++) {
				ultimasPosiciones.put(listaTira.get(i), i);
			}

			int distanciaTotal = 0;

			for (int i = 0; i < listaTira.size(); i++) {
				numeroActual = listaTira.get(i);

				if (numeros.contains(numeroActual)) {

					int distancia = 0;

					int ultimaPosicion = ultimasPosiciones.get(numeroActual);

					distancia = ultimaPosicion - i;

					distanciaTotal += distancia;

				}

			}

			System.out.println(distanciaTotal);

			return true;
		}

	}

	public static void main(String[] args) {

		in = new java.util.Scanner(System.in);

		while (casoDePrueba())
			;

	}

}