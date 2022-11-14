/**
 *
 * / ICC /
 * / Cinthia Rodriguez Maya /
 * / Facultad de Ciencias - UNAM /
 * @author Rodrigo Andre Decuir Fuentes
 *
*/

//Importamos la clase Scanner
import java.util.Scanner;
//Importamos la clase Math
import java.lang.Math;

//Nombre de la clase
public class EcuacionGeneral {	
	//Metodo main
	public static void main(String[]args){

		//Creamos nuestro objeto entrada,
		//el cual nos permite recibir datos 
		//del usuario	
		Scanner entrada = new Scanner(System.in);

		//Atributos
		int a = 0;
		int b = 0;
		int c = 0;

		//Valores del usuario
		System.out.println("\n" + "Bienvenid@. Vamos a calcular tu ecuacion de segundo grado:" + "\n");
		System.out.println("Ingresa el valor de a");
		a = entrada.nextInt();
		System.out.println("Ingresa el valor de b");
		b = entrada.nextInt();
		System.out.println("Ingresa el valor de c");
		c = entrada.nextInt();

		//Discriminante	
		double discriminante = Math.pow(b, 2) - 4*a*c;
		//Formula positiva
		double x1 = (-b + Math.sqrt(discriminante)) / 2*a;
		//Formula negativa
		double x2 = (-b - Math.sqrt(discriminante)) / 2*a;

		/*Verificamos si hubo alguna raiz negativa,
		* de ser asi le avisamos al usuario.
		* En el caso contrario,
		* damos ambas raizes al usuario. 
		*/

		if(discriminante < 0) { 
			System.out.println("\n" + "La ecuacion no tiene solucion en el campo de los numeros reales" + "\n");	
		} else {
			System.out.println("\n" + "Primera raiz: " + x1 + "\n" +  "Segunda raiz: " + x2 + "\n");
		}
	}
}


