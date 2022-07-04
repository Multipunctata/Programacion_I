package Clase_6;

import java.util.Scanner;

// Desarrollar un programa que pueda:

// Imprimir todos los valores desde la unidad hasta un valor ingresado por teclado

public class Ejercicio_2 {

	public static void main(String[] args) {
		int n;
		Scanner scan = new Scanner(System.in);
		System.out.println("Ingrese un limite: ");
		n = scan.nextInt();
		
		for (int i = 1; i <= n; i++) {
			System.out.println(i);
		}
	}
	
}
