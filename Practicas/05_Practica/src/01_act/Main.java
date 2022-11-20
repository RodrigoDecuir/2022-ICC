/**
 * Clase para simular una carrera e imprimir en pantalla al ganador.
 * @author Rodrigo Andre Decuir Fuentes
 * @version 1.0
 */

import java.util.Random;

public class Main {
	
	public static void main(String[]args) {

		Random r = new Random();

		//Inicializamos un arreglo para todas las posiciones de la carrera
		//en este caso inicializo 2 porque no se me ocurre como 2 objetos
		//pueden recorrer el mismo arreglo, asi que vamos a pensar que 
		//corren en distintos carriles dentro de una carrera
		String[] carrilLiebre = new String[71];
		String[] carrilTortuga = new String[71];

		//Se inicializan a los corredores en su posicion inicial(1)
		Liebre l = new Liebre();
		Tortuga t = new Tortuga();
	
		//Inicia la carrea	
		System.out.println("Simulacion de una carrera entre una liebre y una tortuga:");
		
		//Mientras la ultima casilla se encuentre vacia:	
		boolean ganador = false;
		while(!ganador) {
		
			//Avanza la tortuga
			double a = r.nextDouble();
			if(a < 0.5 && a > 0.0) {
				carrilTortuga[t.pasoRapido()] = "tortuga";	
			} else if(a > 0.5 && a < 0.7) {
				carrilTortuga[t.resbalon()] = "tortuga";
			} else if(a > 0.7 && a < 1.0) {
				carrilTortuga[t.pasoLento()] = "tortuga";
			}

			//Avanza la liebre	
			double b = r.nextDouble();
			if(b < 0.2 && b > 0.0) {
				carrilLiebre[l.dormir()] = "liebre";	
			} else if(b > 0.2 && b < 0.4) {
				carrilLiebre[l.granSalto()] = "liebre";	
			} else if(b > 0.4 && b < 0.5) {
				carrilLiebre[l.granResbalon()] = "liebre";
			} else if(b > 0.5 && b < 0.8) {
				carrilLiebre[l.pequenioSalto()] = "liebre";
			} else if(b > 0.8 && b < 1.0) { 
				carrilLiebre[l.pequenioResbalon()] = "liebre";
			}

			if((carrilLiebre[70] == "liebre") && (carrilTortuga[70] == "tortuga")) {
				System.out.println("---------------> 🐇");
				System.out.println("---------------> 🐢");
				System.out.println("Empate");
				ganador = true;
			} else if(carrilTortuga[70] == "tortuga") {
				System.out.println("----------> 🐇");
				System.out.println("---------------> 🐢");
				System.out.println("Gana la tortuga");
				ganador = true;
			} else if(carrilLiebre[70] == "liebre") {
				System.out.println("----------> 🐢");
				System.out.println("---------------> 🐇");
				System.out.println("Gana la liebre");	
				ganador = true;
			}
		}//fin de while
	}//fin de main
}//fin de clase
					
