
import java.util.Random;

public class Metodos {



	//No paramétros, no return
	public static void saluda() {

		System.out.println("Hola");

	}

	//No parámetros, si return
	public static int generaAleatorio() {

		Random aleatorios = new Random();
		int valor = aleatorios.nextInt(2); //0,1
		return valor;

	}

	//Sí parámetros, no return
	public static void muestraValores(String a, int b) {
		System.out.println(a);
		System.out.println(b);		
	}


	//Sí parámetros, sí return
	public static int suma(int a, int b) {

		int suma = a + b;
		return suma;

	}



	

	public static void main(String[] args) {

		saluda();

		int v = generaAleatorio();
		System.out.println(v);

		muestraValores("Hola",60);

		int s = suma(10, 4);
		System.out.println(s);

	
	}


}

