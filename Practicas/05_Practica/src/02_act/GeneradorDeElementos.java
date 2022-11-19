/**
 * Clase para generar un arreglo 'A' de 10 enteros aleatorio
 * y un sub arreglo de 'A' sin elementos repetidos 
 * @author Rodrigo Andre Decuir Fuentes
 * @version 1.0
 */
import java.util.*;

import java.util.Arrays;

public class GeneradorDeElementos {

	public static void main(String[]args) {
		
		//Escribe un programa que trabaje con un arreglo A de enteros de longitud 10
		//Cada elemento en A está en el rango de 1 a 10
		int[] A = new int[10];
		int[] B = new int[10];
		Random in = new Random();
	
		//Genera aleatoriamente un valor de 1 a 10 en 
		//cada posicion de A e imprimelo en pantalla.		
		System.out.println("Arreglo generado: ");
		for(int i=0; i < A.length; i++) {
			A[i] = in.nextInt(10);
			System.out.print(A[i] + " | ");
		}

		//Genera un sub arreglo de A sin elementos repetidos			
		System.out.println("\nSub arreglo sin duplicados: ");
		for(int i=0; i<A.length-1; i++) {
			for(int j=i+1; j<A.length; j++) {
				if((i != j) && (A[i] == A[j])) {//si hay un duplicado imprimelo
					B[i] = A[j];
					System.out.print(B[i] + " | ");
				} 
				
				
				/*else if ((i != j) && (A[i] != A[j])) {
					System.out.print(A[j] + " | ");	
				}*/
			/*	if((i != j) && (A[i] == A[j])) {
					A[i] = 22;
				}
			
				if((i != j) && (A[i] != A[j])){
					B[i] = A[i+1];
					System.out.print(B[i] + " | ");
				}  
			*/
			}
		}
	}
}



