/**
 * Clase para obtener el volumen de ciertas figuras dado un radio y en su caso una altura que el usuario ingrese
 * @author Rodrigo André Decuir Fuentes
*/

// Importamos la clase Scanner
import java.util.Scanner;
// Asignamos una identidad a nuestra clase \
public class Volumen {

	public static void main(String[] args) {
		// Creamos un objeto Scanner
		Scanner entrada = new Scanner(System.in);

		System.out.println("Bienvenid@! Este programa calcula el volumen de un Cono, una Esfera y una Hemiesfera");
		System.out.println("Si quieres obtener el volumen digita: 1 para el Cono, 2 para la Esfera y 3 para la Hemiesfera");


		int Figura = entrada.nextInt();
		
		if (Figura == 1) {
			System.out.println("Ingresa el radio: ");
			double r = info.nextDouble(); // radio
			System.out.println("Ingresa la altura: ");
			double a = info.nextDouble(); // altura
			double Cono = ((1.0/3.0) * (Math.PI) * (Math.pow(r, 2)) * (a)); // Formulon que saca el volumen del cono 
			System.out.println("El volumen de tu cono de radio: " + r + "y de altura: " + a + "es: " + Cono);
		} 	

		if (Figura == 2) {
			System.out.println("Ingresa el radio: ");
			double r = entrada.nextDouble(); // radio
			double Esfera = ((4.0/3.0)*(Math.PI)*(Math.pow(r, 3)));
			System.out.println("El volumen de tu Esfera de radio: " + r + "es: " + Esfera); // Formulon que saca el volumen de la esfera


		}

		if (Figura == 3) {
			System.out.println("Ingresa el radio: ");
			double r = entrada.nextDouble(); // radio
			double Hemiesfera = ((2.0/3.0)*(Math.PI)*(Math.pow(r, 3)));	
			System.out.println("El volumen de tu Hemiesfera de radio: " + r + "es: " + Hemiesfera); // Formulon que saca el volumen de la hemiesfera
		}
	}
}
