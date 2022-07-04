package Clase_2;

import java.util.Scanner;

// Desarrollar un programa que:

// Verifique si un numero ingresado por teclado es par o impar

public class Ejercicio_4 {

	public static void main(String[] args) {
		int num;
		Scanner scan = new Scanner(System.in);
		System.out.println("Ingrese un numero: ");
		num = scan.nextInt();
		if (num % 2 == 0 && num != 0) {
			System.out.println("El numero es par");
		} else {
			if (num % 2 != 0 && num != 0) {
				System.out.println("El numero es impar");
			} else {
				System.out.println("El numero es cero");
			}
		}
	}
	
}
