package Clase_2;

import java.util.Scanner;

// Desarrollar un programa que:

// Verifique si un numero ingresado es positivo o negativo

public class Ejercicio_5 {

	public static void main(String[] args) {
		int num;
		Scanner scan = new Scanner(System.in);
		System.out.println("Ingrese un numero: ");
		num = scan.nextInt();
		if (num == 0) {
			System.out.println("El numero es cero");
		} else {
			if (num > 0) {
				System.out.println("El numero es positivo");
			} else {
				System.out.println("El numero es negativo");
			}
		}
	}
	
}
