/**
 * Con esta clase se pretende calcular el valor aproximado de ln(1+x)
 * Para un valor 'x' y una cantidad de aproximaciones 'n' ingresadas por el usuario.
 * @author Rodrigo Andre Decuir Fuentes
 * @version 13 oct 2022
 */

import java.util.*;
import java.lang.Math;

public class ValorAproximado {

	public static void main(String[]args) {

		Scanner sc = new Scanner(System.in);

		int x = 0;
		int n = 0;
		boolean flag = true;
		double k = 2;

		System.out.println("Este programa calcula el valor aproximado de ln(1+x).");
		
		System.out.println("Ingresa un valor para x:");
		x = sc.nextInt();
		
		System.out.println("Ingresa el numero de aproximaciones deseadas:");
		n = sc.nextInt();
		
		// se inicializa la variable aqui porque de otro modo 
		// se cambia el valor de x y no se llega al resultado 
		// correcto	
		double formula = ((Math.pow(x,1))/(1));

		//si x es 1 y n es 1
		if (x == 1 && n == 1) {
			formula = 1;
			flag = false;

		//si x es 0 y n es 0
		} else if (x == 0 && n == 0) {
			formula = 0;
			flag = false;

		//si x es mayor que 0 y n es 0
		} else if (x > 0 && n == 0) {
			formula = 1111;
			flag = false;

		//si x es 0 y n es mayor que 0
		} else if (x == 0 && n > 0) {
			formula = 0;
			flag = false;
		//en el ultimo caso
		} else {
			flag = true;
		}

		//ciclo para realizar el calculo de ln(1+x)
		while ((k <= n) && (flag == true)) {
			//Si k es par
			if (k % 2 == 0) {
				formula = formula - ((Math.pow(x,k))/k);
			//si k es impar
			} else {
				formula = -formula + ((Math.pow(x,k))/k);
			}		
			k++;
		}
		if (flag == true) {
			System.out.println("El valor aproximado de ln(1+x) dados los valores: x = " + x + " y n = " + n + " es: " + formula);
		} else if (flag == false && formula == 1111) {
			System.out.println("indefinido");
		} else {
			System.out.println("El valor aproximado de ln(1+x) dados los valores: x = " + x + " y n = " + n + " es: " + formula);
		}

	}
}	
