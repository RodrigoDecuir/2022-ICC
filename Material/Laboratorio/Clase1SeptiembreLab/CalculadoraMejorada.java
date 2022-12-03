
import java.util.Scanner;

public class CalculadoraMejorada {


	public static int hazOperacion(int op, int a, int b) {

		int resultado;
		if(op==1) {
			resultado = a+b;
		} else if(op==2) {
			resultado=a-b;
		} else {
			resultado= a*b;
		}

		return resultado;

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

		if(opcion>=1 && opcion <=3) {

			int v = hazOperacion(opcion, a, b);
			System.out.println(v);

		} else {
			System.out.println("Opción inválida");
		}

 
	}

}
