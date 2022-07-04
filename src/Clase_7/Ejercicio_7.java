package Clase_7;

import java.util.Scanner;

// Desarrollar un programa que pueda:

// Permitir saber si un año es bisiesto

/* Para que un año sea bisiesto debe ser divisible por 4 y no debe ser divisible entre 100,
   excepto que también sea divisible entre 400*/

public class Ejercicio_7 {

	public static void main(String[] args) {
		int año;
		Scanner scan = new Scanner(System.in);
		System.out.println("Ingrese un año: ");
		año = scan.nextInt();
		if ((año % 4 == 0 && año % 100 != 0) || (año % 4 == 0 && año % 100 == 0 && año % 400 == 0)) {
			System.out.println("El año " + año + " es bisiesto");
		} else {
			System.out.println("El año " + año + " no es bisiesto");
		}
	}
	
}
