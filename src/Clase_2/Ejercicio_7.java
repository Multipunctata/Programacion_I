package Clase_2;

import java.util.Scanner;

// Desarrollar un programa que:

/* Desarrolle un algoritmo que permita convertir calificaciones numéricas, según la siguiente tabla:
   A = 19 y 20, B = 16, 17 y 18, C = 13, 14 y 15, D = 10, 11 y 12, E = 1 hasta el 9. Se asume que
   la nota está comprendida entre 1 y 20*/

public class Ejercicio_7 {

	public static void main(String[] args) {
		int nota;
		Scanner scan = new Scanner(System.in);
		System.out.println("Ingrese su nota: ");
		nota = scan.nextInt();
		if (nota >= 19 && nota <= 20) {
			System.out.println("A");
		} else {
			if (nota >= 16 && nota <= 18) {
				System.out.println("B");
			} else {
				if (nota >= 13 && nota <= 15) {
					System.out.println("C");
				} else {
					if (nota >= 10 && nota <= 12) {
						System.out.println("D");
					} else {
						if (nota >= 1 && nota <= 9) {
							System.out.println("E");
						} else {
							System.out.println("La nota debe estar comprendida entre el rango del 1 al 20");
						}
					}
				}
			}
		}
	}
	
}
