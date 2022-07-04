package Clase_7;

import java.util.Scanner;

// Ingresar por teclado la cantidad de elementos a ser impresos de la serie Fibonacci

public class Ejercicio_2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n, ant = 1, sig = 1, act = 1;
		System.out.println("Ingrese la cantidad de elementos: ");
		n = scan.nextInt();
		
		for (int i = 1; i <= n; i++) {
			ant = sig;
			sig = act;
			act = ant + sig;
			System.out.println(ant);
		}
	}
	
}
