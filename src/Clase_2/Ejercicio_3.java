package Clase_2;

import java.util.Scanner;

// Desarrollar un programa que:

// Permita leer dos números e intercambie sus valores sin utilizar una variable auxiliar

public class Ejercicio_3 {

	public static void main(String[] args) {
		int uno, dos;
		Scanner scan = new Scanner(System.in);
		System.out.println("Ingrese el primer valor: ");
		uno = scan.nextInt();
		System.out.println("Ingrese el segundo valor: ");
		dos = scan.nextInt();
		System.out.println("Los valores sin intercambiar: \nuno: " + uno + "\ndos: " + dos);
		uno = uno + dos;
		dos = uno - dos;
		uno = uno - dos;
		System.out.println("Los valores intercambiados: \nuno: " + uno + "\ndos: " + dos);
	}
	
}
