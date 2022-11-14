/**
 * Clase para determinar si una palabra esta contenida en otra
 * @author Rodrigo Andre Decuir Fuentes
 * @version 12 oct 2022
 */

import java.util.*;

public class PalabraContenida {

	public static void main(String[]args) {

		Scanner sc = new Scanner(System.in);

		boolean lasLetrasViven = false;

		System.out.println("Este programa verifica si una palabra se encuentra contenida en otra");
		System.out.println("Ingresa una palabra");
		String cadena1 = new String(sc.next());
		
		System.out.println("Ingresa la palabra a verificar");
	        String cadena2 = new String(sc.next());

		for (int i = 0; i < cadena1.length(); i++) {
			char letraCadena1 = cadena1.charAt(i);
			
			for (int j = 0; j < cadena2.length(); j++) {
				char letraCadena2 = cadena2.charAt(j);

				if(letraCadena1==letraCadena2) {
					lasLetrasViven = true;

				} else {
					lasLetrasViven = false;
				}
			}
		}
		System.out.println(lasLetrasViven);	
	}
}
