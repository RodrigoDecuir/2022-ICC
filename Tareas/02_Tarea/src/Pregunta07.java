/**
 * Clase para calcular el producto de los primeros 'n' naturales impares.
 * @author Rodrigo Andre Decuir Fuentes
 * @version 18 oct 2022
 */

import java.util.*;

public class Pregunta07 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int producto = 1;
		int c = 1;
		
		System.out.println("Bienvenid@! Este programa calcula el producto de los primeros 'n' naturales impares");
		System.out.println("Ingresa un valor para n: ");
		int n = sc.nextInt();

		while (c <= n) {
			if (c % 2 != 0) {
				producto *= c;
			} else {}
			c++;
		}
		System.out.println("El producto de los primeros 'n' naturales impares para n = " + n + " es " + producto);
	}
}

