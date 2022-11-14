/**
 * Clase para obtener a modo de cadena todos los numeros divisibles de un numero natural.
 * @author Rodrigo Andre Decuir Fuentes
 * @version 18 oct 2022
 */

import java.util.*;

public class Pregunta08 {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int c = 1;

		System.out.println("Bienvenid@! Este programa obtiene los numeros para los cuales 'n' es divisible.");
		System.out.println("Ingresa un valor entero para n: ");
		int n = sc.nextInt();
		
		System.out.print("Los numeros divisibles entre " + n + " son: \n"); 
		while (c <= n) {
			if (n % c == 0) {
				System.out.printf("%d%n", c);
			} else {}
			c++;
		}
	}
}
