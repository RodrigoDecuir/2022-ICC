/**
 * Clase para calcular la suma de los primeros 'n' naturales pares.
 * @author Rodrigo Andre Decuir Fuentes
 * @version 18 oct 2022
 */

import java.util.*;
public class Pregunta06 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int sum = 0;
		int c = 1;
	
		System.out.println("Bienvenid@! Este programa calcula la suma de los primeros 'n' naturales pares.");	
		System.out.println("Ingresa un valor para n: ");
		int n = sc.nextInt();
		
		while (c <= n) {
			if ( c % 2 == 0) {
				sum += c;
			} else{}
			c++;
		}
		System.out.println("La suma de los primeros 'n' naturales pares para n = " + n + " es " + sum);
	}
}

