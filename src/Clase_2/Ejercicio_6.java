package Clase_2;

import java.util.Scanner;

// Desarrollar un programa que:

// Imprima la sumatoria de 100 numeros ingresados por teclado

public class Ejercicio_6 {

	public static void main(String[] args) {
		int num;
		int sum = 0;
		Scanner scan = new Scanner(System.in);
		
		for (int i = 0; i < 3; i++) {
			System.out.println("Ingrese el valor "+ (i+1) +": ");
			num = scan.nextInt();
			sum += num;	
		}
		System.out.println("La suma: " + sum);
	}
	
}
