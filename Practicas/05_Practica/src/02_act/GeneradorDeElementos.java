/**
 * Clase para generar un arreglo 'A' de 10 enteros aleatorios
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
		Random in = new Random();


		//Genera aleatoriamente un valor de 1 a 10 en 
		//cada posicion de A e imprimelo en pantalla.		
		System.out.println("Arreglo generado: ");
		for(int i=0; i < A.length; i++) {
			A[i] = in.nextInt(10);
			System.out.print(A[i] + " | ");
		}


		//Ordenar los elementos del arreglo de forma ascendente o descendente (opcional)
		System.out.println("\nArreglo ordenado: ");	
		Arrays.sort(A);
		for(int i=0; i < A.length; i++) {
			System.out.print(A[i] + " | ");
		}


		//Genera un sub arreglo de A sin elementos repetidos			
		System.out.println("\nSub arreglo sin duplicados: ");	
	      	int[] B =  new int[10];
		int temp=0;	
		for(int i=0; i < A.length - 1; i++) {
            		if (A[i] != A[i + 1]) {
                		B[temp++] = A[i];
            		}
        	}

        	B[temp++] = A[A.length - 1];

       		for (int j=0; j < temp; j++) {
           		System.out.print(B[j] + " | ");
        	}	
	}
}	
