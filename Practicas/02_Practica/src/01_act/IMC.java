/**
 *
 *  / ICC /
 *  / Cinthia Rodriguez Maya /
 *  / Facultad de ciencias - UNAM / 
 *  @author Rodrigo Andre Decuir Fuentes
 *
*/

//Importamos la clase Persona,
//la cual se encuentra en el 
//paquete(directorio) util
import util.Persona;

//Se importa la clase Scanner
import java.util.Scanner;

//Nombre de la clase
public class IMC { 
	
	//Metodo main
	public static void main(String[] args) { 

		//Creamos un objeto entrada,
		//el cual nos permite recibir 
		//una entrada del usuario
		Scanner entrada = new Scanner(System.in);

		//Creamos un objeto (a)
		//de la clase Persona 
		//y le damos valores iniciales
		Persona a = new Persona("Andres",45.0,1.7);

		/*Hacemos uso de nuestro objeto (a),
		* el cual definimos previamente 
		* con la clase Persona.*/
        	
		/*Lo vamos a usar para actualizar 
	 	* los atributos, con los datos
	 	* que el usuario ingrese. */

		System.out.println("Bienvenid@. Vamos a calcular tu IMC.");
		System.out.println("Ingresa tu nombre: ");
		a.setNombre(entrada.nextLine());//Actualizamos el Nombre
	
		System.out.println("Ingresa tu peso en kg: ");
		a.setPeso(entrada.nextDouble());//Actualizamos el Peso

		System.out.println("Ingresa tu estatura en m: ");
		a.setEstatura(entrada.nextDouble());//Actualizamos la Estatura
		
		//Llamado al metodo toString() de la clase Persona	
		System.out.println(a.toString());	
	
		//Formula para calcular el IMC
		double imc = a.getPeso() / (Math.pow(a.getEstatura(), 2));
		
		//Evaluacion del estado de salud	
		if(imc > 0 && imc < 16) {
			System.out.println("Presentas Desnutricion severa");
		} else if (imc >= 16.1 && imc <= 18.4) {
			System.out.println("Presentas Desnutricion moderada");
		} else if (imc >= 18.5 && imc <= 22) {
		       	System.out.println("Presentas Bajo Peso");
		} else if (imc >= 22.1 && imc <= 24.9) {
			System.out.println("Presentas un peso normal");
		} else if (imc >= 25 && imc <= 29.9) {
			System.out.println("Presentas Sobrepeso");
		} else if (imc >= 30 && imc <= 34.9) {
			System.out.println("Presentas Obesidad tipo I");
		} else if (imc >= 35 && imc <= 39.9) {
			System.out.println("Presentas Obesidad tipo II");
		} else if (imc > 40) {
			System.out.println("Presentas Obesidad tipo III");
	       	} else {
			System.out.println("Tu estado de salud no existe.");
		}

	}
}
