package Clase_7;

import java.util.Scanner;

import javax.swing.JOptionPane;

// Ingresar el nombre por teclado e imprimir un mensaje de Bienvenida

public class Ejercicio_4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String nombre;
		nombre = JOptionPane.showInputDialog("Ingresa tu nombre");
		JOptionPane.showMessageDialog(null, "¡Bienvenido " + nombre + "!");
	}
	
}
