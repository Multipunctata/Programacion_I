package Clase_2;

import java.util.Scanner;

// Desarrollar un programa que:

// Permita leer dos valores distintos, determinar cuál de los dos valores es el mayor y escribirlo

public class Ejercicio_1 {

	public static void main(String[] args) {
		int uno, dos;
		Scanner scan = new Scanner(System.in);
		System.out.println("Ingrese el primer valor: ");
		uno = scan.nextInt();
		System.out.println("Ingrese el segundo valor: ");
		dos = scan.nextInt();
		if (uno == dos) {
			System.out.println("Un numero debe ser mayor al otro");
		} else {
			if (uno > dos) {
				System.out.println("El primer valor es mayor");
			} else {
				System.out.println("El segundo valor es mayor");
			}
		}
	}
	
}
