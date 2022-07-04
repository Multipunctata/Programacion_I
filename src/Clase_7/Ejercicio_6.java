package Clase_7;

import java.util.Scanner;

// Solicitar al usuario ingresar tres números para luego mostrarle el promedio de los tres

public class Ejercicio_6 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		float x, y, z;
		System.out.println("Ingrese el primer valor: ");
		x = scan.nextFloat();
		System.out.println("Ingrese el segundo valor: ");
		y = scan.nextFloat();
		System.out.println("Ingrese el tercer valor: ");
		z = scan.nextFloat();
		System.out.printf("El promedio: %.2f", (x+y+z)/3);
	}
	
}
