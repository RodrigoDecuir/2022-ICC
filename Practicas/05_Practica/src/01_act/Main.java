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
		int [] carrilLiebre = new int[71];
		int [] carrilTortuga = new int[71];

		//Se inicializan a los corredores en su posicion inicial(1)
		Liebre l = new Liebre(carrilLiebre[]);
		Tortuga t = new Tortuga(carrilTortuga[]);
	
		//Inicia la carrea	
		System.out.println("Simulacion de una carrera entre una liebre y una tortuga:");
		
		//Mientras la ultima casilla se encuentre vacia:	
		while((carrilLiebre[70] == null) && (carrilTortuga[70] == null)) {
			
			//Se usa un ciclo para recorrer 70 posiciones	
			for(int i = 1; i <= 70; i++) {
				//Avanza la tortuga (vamos a darle ventaja a la tortuga dejando que inicie primero)
				double a = r.nextDouble();
				if(a < 0.5) {
					t.pasoRapido(carrilTortuga[i]);
				} else if(a > 0.5 && a < 0.7) {
					t.resbalon(carrilTortuga[i]);
				} else if(a > 0.7 && a < 1.0) {
					t.pasoLento(carrilTortuga[i]);
				}

				//Avanza la liebre	
				double b = r.nextDouble();
				if(b < 0.2) {
					l.dormir(carrilLiebre[i]);
				} else if(b > 0.2 && b < 0.4) {
					l.granSalto(carrilLiebre[i]);
				} else if(b > 0.4 && b < 0.5) {
					l.granResbalon(carrilLiebre[i]);
				} else if(b > 0.5 && b < 0.8) {
					l.pequenioSalto(carrilLiebre[i]);
				} else if(b > 0.8 && b < 1.0) { 
					l.pequenioResbalon();
				}
			}//fin de for
		}//fin de while
		if(carrilLiebre[70] != null && carrilTortuga[70] != null) {
			System.out.println("Empate"); 
		} else if(carrilTortuga[70] != null) {
			System.out.println("Gana la Tortuga");
		} else if(carrilLiebre[70] != null) {
			System.out.println("Gana la Liebre");
		} else {
			System.out.println("No gana nadie");
		}
	}//fin de main
}//fin de clase
					
