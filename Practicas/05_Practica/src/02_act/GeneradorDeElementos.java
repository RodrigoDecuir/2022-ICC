import java.util.*;

public class GeneradorDeElementos {

	public static void main(String[]args) {

		int[] A = new int[10];
		Random in = new Random();
		
		System.out.println("Arreglo generado: ");
		for(int i=0; i < A.length; i++) {
			A[i] = in.nextInt(10);
			System.out.print(A[i] + " | ");
		}

		System.out.println("Arreglo sin duplicados: ");
			
	}
}

