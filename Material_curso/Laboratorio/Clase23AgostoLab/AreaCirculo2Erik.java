
import java.util.Scanner;

public class AreaCirculo2Erik {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		double r, a;

		System.out.println("Indica el valor de r para calcular el área de un círculo");
		r = entrada.nextDouble();

		a = Math.PI * (r * r);
		System.out.println("El área del círculo de radio: " + r + " es " + a );


		
	}


}