package Clase_6;

import java.util.Scanner;

// Desarrollar un programa que pueda:

// Hacer el ejercicio anterior, pero imprimiendo sólo múltiplos de 5

public class Ejercicio_3 {

	public static void main(String[] args) {
		int n;
		Scanner scan = new Scanner(System.in);
		System.out.println("Ingrese un limite: ");
		n = scan.nextInt();
		for (int i = 1; i < n; i++) {
			if (i % 5 == 0) {
				System.out.println(i);
			}
		}
	}
	
}
