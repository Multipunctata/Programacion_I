package Clase_7;

import java.util.Scanner;

// Ingresar la temperatura en escala Farenheit y convertir a Celsius

public class Ejercicio_5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int f, el;
		System.out.println("Ingresa la temperatura en Farenheit: ");
		f = scan.nextInt();
		System.out.println("1- Convertirla a Celsius \n2- Convertirla a Kelvin");
		System.out.println("Ingrese la elección: ");
		el = scan.nextInt();
		
		if (el == 1) {
			System.out.println("La temperatura en Celsius: " + (f-32)*5/9 + "°");
		} else {
			if (el == 2) {
				System.out.println("La temperatura en Kelvin: " + ((f-32)*5/9+273) + "°");
			} else {
				System.out.println("No se reconoce la elección");
			}
		}
	}
	
}
