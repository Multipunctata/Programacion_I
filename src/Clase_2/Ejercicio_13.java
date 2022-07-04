package Clase_2;

// Desarrollar un programa que:

// Imprima todos los números primos entre el 1 y el 100

public class Ejercicio_13 {

	public static void main(String[] args) {
		boolean sw;
		for (int i = 1; i < 100; i++) {
			sw = true;
			for (int x = 2; x < i; x++) {
				if (i % x == 0) {
					sw = false;
				}
			}
			if (sw == true) {
				System.out.println(i);
			}
		}
	}
	
}
