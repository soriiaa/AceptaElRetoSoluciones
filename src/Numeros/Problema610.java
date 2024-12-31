package Numeros;

import java.util.ArrayDeque;
import java.util.Deque;

public class Problema610 {
	
	/*
	 * @Author Alejandro Soria Problema 610
	 * 
	 * Usuario: soriiaa._
	 */

	static java.util.Scanner in;

	public static void casoDePrueba() {

		// Almaceno la los datos iniciales en numeroString
		String numeroString = in.nextLine();
		// Lo introduzco en un array con .split
		String[] numeroStringArray = numeroString.split(" ");

		// Introduzco cada dato en una variable int con integer
		int numeroHumanos = Integer.parseInt(numeroStringArray[0]);
		int numeroStark = Integer.parseInt(numeroStringArray[1]);
		int numeroPeter = Integer.parseInt(numeroStringArray[2]);
		int numeroSalto = Integer.parseInt(numeroStringArray[3]);

		// Creo una cola Integer
		Deque<Integer> cola = new ArrayDeque<>();

		// Introduzco los datos mediante un for y un .add a la cola
		for (int i = 1; i < numeroHumanos + 1; i++) {
			cola.add(i);
		}

		// Mientras que la cola sea mayor que la mitad inicial de humanos
		while (cola.size() > (numeroHumanos / 2)) {
			// Bucle for que recorre la cola y saca y mete a los humanos
			for (int i = 1; i < numeroSalto + 1; i++) {
				cola.offer(cola.poll());
			}
			// Cuando acaba el bucle, saca a un humano
			cola.poll();
		}
		// Si los dos siguen vivos
		if ((cola.contains(numeroStark)) && (cola.contains(numeroPeter))) {
			System.out.println("No hay abrazo");
		// si los dos mueren
		} else if ((!cola.contains(numeroStark)) && (!cola.contains(numeroPeter))) {
			System.out.println("No hay abrazo");
			// Si Peter vive
		} else if (!cola.contains(numeroStark)) {
			System.out.println("No quiero irme, Peter!");
			// si Ironman vive
		} else if (!cola.contains(numeroPeter)) {
			System.out.println("No quiero irme, Sr. Stark!");
		}
	}

	public static void main(String[] args) {

		in = new java.util.Scanner(System.in);
		// Modificado para que no de error por el tipo de lectura int
		String numCasos = in.nextLine();
		int numCasos2 = Integer.parseInt(numCasos);

		for (int i = 0; i < numCasos2; i++) {
			casoDePrueba();
		}
	}
}