/**
 * Clase para mostrar en pantalla los primeros 'n' primos.
 * @author Rodrigo Andre Decuir Fuentes
 * @version 19 oct 2022
 */

import java.util.*;
//Arreglo redimensionable
import java.util.ArrayList;
import java.util.List;

public class Pregunta10 {

	public static void main(String[] args) {

		List<Integer> listaPrimos = new ArrayList<>();	
		Scanner sc = new Scanner(System.in);

		System.out.println("Bienvenid@! Este programa encuentra numeros primos.");
		System.out.println("Cuantos numeros primos quieres encontrar?");
		int cuantosPrimos = sc.nextInt();
		
		int i = 2;
		while (i <= cuantosPrimos) {

			boolean primo = true;

			for(int j = 2; j <= i/2; j++) {
				if (i % j == 0) {
					primo = false;
				     	break;
				}
			}

			if (primo) {
				listaPrimos.add(i);
			}

			i++;
		}
		
		System.out.println("Lista de numeros primos: ");
		for (int k : listaPrimos) {
			System.out.println(k);
		}
	}
}
