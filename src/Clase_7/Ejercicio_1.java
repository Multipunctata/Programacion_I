package Clase_7;

import java.util.Scanner;

// Ingresar 2 valores por teclado y compararlos, imprimir cual es el mayor

public class Ejercicio_1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x, y;
		System.out.println("Ingrese el primer valor: ");
		x = scan.nextInt();
		System.out.println("Ingrese el segundo valor: ");
		y = scan.nextInt();
		if (x == y) {
			System.out.println("Los valores son iguales");
		} else {
			if (x > y) {
				System.out.println("El primer valor es mayor");
			} else {
					System.out.println("El segundo valor es mayor");
			}
		}
	}
	
}
