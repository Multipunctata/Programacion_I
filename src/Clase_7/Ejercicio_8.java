package Clase_7;

import java.util.Scanner;

// Imprimir el factorial de un número ingresado por teclado

public class Ejercicio_8 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int fact = 1, n;
		System.out.println("Ingrese un número: ");
		n = scan.nextInt();
		
		for (int i = 1; i <= n; i++) {
			fact *= i;
		}
		
		System.out.println("El factorial: " + fact);
	}
	
}
