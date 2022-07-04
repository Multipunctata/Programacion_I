package Clase_2;

import java.util.Scanner;

// Escribir un programa que:

// Permita leer dos números e intercambie sus valores utilizando una variable auxiliar

public class Ejercicio_2 {

	public static void main(String[] args) {
		int uno, dos, aux;
		Scanner scan = new Scanner(System.in);
		System.out.println("Ingrese el primer valor: ");
		uno = scan.nextInt();
		System.out.println("Ingrese el segundo valor: ");
		dos = scan.nextInt();
		System.out.println("Valores sin intercambiar: \nuno: " + uno + "\ndos: " + dos);
		aux = uno;
		uno = dos;
		dos = aux;
		System.out.println("Valores intercambiados: \nuno: " + uno + "\ndos: " + dos);
	}
	
}
