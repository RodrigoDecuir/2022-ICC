/**
 * Clase para...
 * @author Rodrigo Andre Decuir Fuentes
 * @version 1.0
 */
import java.util.*;

public class GeneradorDeElementos {

	public static void main(String[]args) {

		int[] A = new int[10];
		int[] B = new int[10];
		Random in = new Random();
		
		System.out.println("Arreglo generado: ");
		for(int i=0; i < A.length; i++) {
			A[i] = in.nextInt(10);
			System.out.print(A[i] + " | ");
		}
	
		System.out.println("\nSub arreglo sin duplicados: ");
		for(int i=0; i < A.length; i++) {
			for(int j=0; j < A.length; j++) {		
				if(A[i] != A[j] && A[i] != A[j]) {
					B[i] = A[i];	
				}
					System.out.print(B[i] + " | ");
			}
	 	}		
	}
}

