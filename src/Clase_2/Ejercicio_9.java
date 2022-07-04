package Clase_2;

import java.util.Scanner;

// Desarrollar un programa que:

// Pida un día de la semana y que nos diga si es un día laboral o no

public class Ejercicio_9 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String dia;
		System.out.println("Ingrese un día de la semana: ");
		dia = scan.nextLine();
		dia = dia.toUpperCase();
		
		if (dia.equals("SABADO") || dia.equals("SÁBADO") || dia.equals("DOMINGO")) {
			System.out.println("No es un día laboral");
		} else {
			System.out.println("Es un día laboral ");
		}
	}
	
}
