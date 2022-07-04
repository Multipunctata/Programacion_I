package Clase_2;

import java.util.Scanner;

// Desarrollar un programa que:

// Imprima si un número ingresado por teclado es o no primo

public class Ejercicio_12 {

	public static void main(String[] args) {
		int num;
		boolean sw = true;
		Scanner scan = new Scanner(System.in);
		System.out.println("Ingrese un numero: ");
		num = scan.nextInt();
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				sw = false;
				System.out.println(i);
			}
		}
		if (sw == true) {
			System.out.println("El numero " + num + " es primo");
		} else {
			System.out.println("El numero " + num + " no es primo");
		}
	}
	
}
