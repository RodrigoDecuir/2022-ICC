/**
  
   Con esta clase se pretende imprimir una imagen. 
   @author Rodrigo Andre Decuir Fuentes
   @version 11 Oct 2022

 */

import java.util.*;

public class Imagen {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = 0;
		
		System.out.println("Este progama imprime una imagen."+"\n"+"Ingresa el numero de renglones que quieres que tenga la imagen:");
		n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			for (int j = i; j <= n; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}	
