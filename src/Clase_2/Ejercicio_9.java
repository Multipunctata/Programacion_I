package Clase_2;

import java.util.Scanner;

// Desarrollar un programa que:

// Pida un d�a de la semana y que nos diga si es un d�a laboral o no

public class Ejercicio_9 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String dia;
		System.out.println("Ingrese un d�a de la semana: ");
		dia = scan.nextLine();
		dia = dia.toUpperCase();
		
		if (dia.equals("SABADO") || dia.equals("S�BADO") || dia.equals("DOMINGO")) {
			System.out.println("No es un d�a laboral");
		} else {
			System.out.println("Es un d�a laboral ");
		}
	}
	
}
