
import java.util.Scanner;

public class AreaCirculo2 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Indica el valor de r para calcular el área de un círculo");
		double r = entrada.nextDouble();

		double a = Math.PI * (r * r);
		System.out.println("El área del círculo de radio: " + r + " es " + a );


		
	}


}