package Clase_7;

import java.util.Scanner;

// Ingresar tres valores e imprimirlos en forma ascendente (de menor a mayor)
 
public class Ejercicio_3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x, y, z;
		System.out.println("Ingrese el primer valor: ");
		x = scan.nextInt();
		System.out.println("Ingrese el segundo valor: ");
		y = scan.nextInt();
		System.out.println("Ingrese el tercer valor: ");
		z = scan.nextInt();
		
		if (x > y && y > z) { // x > y > z
			System.out.println(x + " > " + y + " > " + z);
		} else {
			if (x > z && z > y) { // x > z > y
				System.out.println(x + " > " + z + " > " + y);
			} else {
				if (z > x && x > y) { // z > x > y
					System.out.println(z + " > " + x + " > " + y);
				} else {
					if (z > y && y > x) { // z > y > x
						System.out.println(z + " > " + y + " > " + x);
					} else {
						if (y > z && z > x) { // y > z > x
							System.out.println(y + " > " + z + " > " + x);
						} else {
							if (y > x && x > z) { // y > x > z
								System.out.println(y + " > " + x + " > " + z);
							} else { // x == y || x == z || z == y
								System.out.println("Ninguno de los valores debe ser igual a otro");
							}
						}
					}
				}
			}
		}
	}
	
}
