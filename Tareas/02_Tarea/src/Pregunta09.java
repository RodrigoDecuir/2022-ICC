/**
 * Clase en la que por medio del teclado se ingrese un numero natural entre el 1 y el 250 y se muestre en pantalla su tabla de multiplicar del 1 al 10.
 * @author Rodrigo Andre Decuir Fuentes 
 * @version 18 oct 2022
 */

import java.util.*;

public class Pregunta09 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int c = 1;
		
		System.out.println("Bienvenid@! Este programa muestra en pantalla la tabla de multiplicar de un numero del 1 al 10.");
		System.out.println("Ingresa un valor entre 1 y 250: ");
		int n = sc.nextInt();
		
		System.out.println("La tabla de mutliplicar de " + n + " es: ");
		if (n <= 250 && n >= 1) {
			while (c <= 10) {
				if (c < 10) {
					System.out.println("  " + c + " * " + n + " = " + n*c);
				} else if (c == 10) {
					System.out.println(" " + c + " * " + n + " = " + n*c);
				} else {} 
				
				c++;
			}
		} else {
			System.out.println("Tu valor no se encuentra entre 1 y 250");	
		}
	}
}
		
