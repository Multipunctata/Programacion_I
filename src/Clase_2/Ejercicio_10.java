package Clase_2;

import java.util.Scanner;

// Desarrollar un programa que:

// Calcule la función factorial de un numero ingresado por teclado

public class Ejercicio_10 {

	public static void main(String[] args) {
		int num, fact = 1;
		Scanner scan = new Scanner(System.in);
		System.out.println("Ingrese un numero: ");
		num = scan.nextInt();
		for (int i = 1; i <= num; i++) {
			fact = fact * i;
		}
		System.out.println("El factorial de " + num + " es: " + fact);
	}
	
}
