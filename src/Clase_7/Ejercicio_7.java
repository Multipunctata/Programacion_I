package Clase_7;

import java.util.Scanner;

// Desarrollar un programa que pueda:

// Permitir saber si un a�o es bisiesto

/* Para que un a�o sea bisiesto debe ser divisible por 4 y no debe ser divisible entre 100,
   excepto que tambi�n sea divisible entre 400*/

public class Ejercicio_7 {

	public static void main(String[] args) {
		int a�o;
		Scanner scan = new Scanner(System.in);
		System.out.println("Ingrese un a�o: ");
		a�o = scan.nextInt();
		if ((a�o % 4 == 0 && a�o % 100 != 0) || (a�o % 4 == 0 && a�o % 100 == 0 && a�o % 400 == 0)) {
			System.out.println("El a�o " + a�o + " es bisiesto");
		} else {
			System.out.println("El a�o " + a�o + " no es bisiesto");
		}
	}
	
}
