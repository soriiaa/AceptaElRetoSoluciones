package Numeros;

import java.util.Scanner;

public class Problema368 {

	  static Scanner in;

	  public static boolean casoDePrueba() {

	    String casoDePrueba = in.nextLine();
	    
	    if (casoDePrueba.equals("0 0")) {
	    	return false;
	    } else {

	    	String[] arrayCasosDePrueba = casoDePrueba.split(" ");
	    	int numeroHuevos = Integer.parseInt(arrayCasosDePrueba[0]);
	    	int capacidad = Integer.parseInt(arrayCasosDePrueba[1]);
	    	
	    	int proporcion = numeroHuevos / capacidad;
	    	double proporcionDouble = (double) numeroHuevos / capacidad;
	    	
	    	if (proporcionDouble > proporcion) {
	    		proporcion = proporcion + 1;
	    	}
	    	
	    	if (proporcion == 0) {
	    		proporcion++;
	    	}
	    	 
	    	System.out.println(10 * (proporcion));
	    	
	      return true;
	    }

	  }

	  public static void main(String[] args) {

	    in = new java.util.Scanner(System.in);

	    while(casoDePrueba())
	      ;

	  }

}
