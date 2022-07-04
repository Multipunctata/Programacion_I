package Clase_6;

import java.util.Scanner;

/*Ingresar 2 valores:

    * Si la sumatoria es par, imprimir el producto de los valores.
    * Si la diferencia es negativa, imprimir el cuadrado de la sumatoria.
    * Si el producto es impar, imprimir todos los valores desde la unidad hasta el producto.
    * Si la división entre el primer valor y el segundo valor es mayor a 10, imprimir el resultado 
      de la división entre el segundo valor con el primero.
    * En caso de no cumplir ninguna condición, imprimir… LOGRASTE IMPRIMIR NADA. */

public class Ejercicio_5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int uno, dos;
		boolean sw = false; // Utilizaré este switch para saber si al final se ha cumplido alguna de las condiciones
		System.out.println("Ingrese el primer valor: ");
		uno = scan.nextInt();
		System.out.println("Ingrese el segundo valor: ");
		dos = scan.nextInt();
		if ((uno+dos) % 2 == 0) {
			System.out.println("La sumatoria es par, el producto de los valores es: " + uno*dos);
			sw = true;
		}
		if ((uno-dos) < 0) {
			System.out.println("La diferencia es negativa, el cuadrado de la sumatoria es: " + ((uno+dos)*(uno+dos)));
			sw = true;
		}
		if ((uno*dos) % 2 != 0) {
			System.out.print("El producto es impar: ");
			for (int i = 1; i < (uno*dos); i++) {
				System.out.print(i);
			}
			sw = true;
		}
		if ((uno/dos) > 10) {
			System.out.println("La división entre el primer valor y el segundo es mayor a 10, el inverso es: " + (dos/uno));
			sw = true;
		}
		if (sw == false) { // Si el switch se mantiene con el valor false, significa que no se ha cumplido ninguna condición
			System.out.println("LOGRASTE IMPRIMIR NADA");
		}
	}
	
}
