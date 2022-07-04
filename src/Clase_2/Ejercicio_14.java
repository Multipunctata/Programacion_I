package Clase_2;

import java.util.Scanner;

// Desarrollar un programa que:

// Verifique si dos numeros ingresados por teclado son numeros amigos

public class Ejercicio_14 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int uno, dos;
		int sumaUno = 0;
		int sumaDos = 0;
		System.out.println("Ingrese el primer numero: ");
		uno = scan.nextInt();
		System.out.println("Ingrese el segundo numero: ");
		dos = scan.nextInt();
		for (int i = 1; i < uno; i++) {
			if (uno % i == 0) {
				sumaUno = sumaUno + i;
			}
		}
		for (int i = 1; i < dos; i++) {
			if (dos % i == 0) {
				sumaDos = sumaDos + i;
			}
		}
		if (sumaUno == dos && sumaDos == uno) {
			System.out.println("Los numeros " + uno + " y " + dos + " son numeros amigos");
		} else {
			System.out.println("Los numeros " + uno + " y " + dos + " no son numeros amigos");
		}
	}
	
}
