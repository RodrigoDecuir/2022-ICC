
import java.util.Scanner;

public class Calculadora {


	
	

	public static void suma(int a, int b) {
		int suma = a+b;
		System.out.println(suma);
	}

	public static int resta(int a, int b) {
		int resta = a-b;
		return resta;
	}

	public static int multiplicacion(int a, int b) {
		int multi = a*b;
		return multi;
	}


	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		int opcion;

		System.out.println("Hola, selecciona una opción para hacer operaciones");

		System.out.println("1. Suma (a+b)");
		System.out.println("2. Resta (a-b)");
		System.out.println("3. Multiplicación (a*b)");


		opcion = entrada.nextInt();

		int a, b;

		System.out.println("Introduce el valor de a");
		a = entrada.nextInt();

		System.out.println("Introduce el valor de b");
		b = entrada.nextInt();

		if(opcion==1) {
			
			suma(a,b);

		} else if(opcion==2) {

			System.out.println(resta(a,b));
			
		} else if(opcion==3) {

			System.out.println(multiplicacion(a,b));
			
		} else {

			System.out.println("Opción inválida");
		}
 
	}

}
