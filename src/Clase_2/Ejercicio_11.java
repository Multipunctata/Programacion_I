package Clase_2;

import java.util.Scanner;

// Desarrollar un programa que:

// Imprima n numeros de la serie Fibonacci

public class Ejercicio_11 {

	public static void main(String[] args) {
		int n, uno = 1, dos = 1, tres = 1;
		Scanner scan = new Scanner(System.in);
		System.out.println("Ingrese la cantidad de elementos de la serie Fibonacci: ");
		n = scan.nextInt();
		for (int i = 0; i <= n; i++) {
			uno = dos;
			dos = tres;
			tres = uno + dos;
			System.out.println(uno);
		}
	}
	
}
