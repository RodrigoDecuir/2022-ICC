/**
 * Clase para hacer uso de la clase Racional.
 * @author Rodrigo Andre Decuir Fuentes
 * @version 26 oct 2022
 */

public class UsoRacional {
	

	public static void main(String[] args) {


		Racional fraccion1 = new Racional(10,3); 
		Racional fraccion2 = new Racional(4,2); 
		Racional chimosito = new Racional();
		
		System.out.println("Fracciones:");
		System.out.println(fraccion1);
		System.out.println(fraccion2);
	
		//multiplica
		System.out.println("Multiplicacion:");	
		System.out.println(chimosito.multiplicacion(fraccion1, fraccion2));

		//System.out.println(fraccion1.multiplicacion2(fraccion2));

		//simplifica
		System.out.println("Simplificacion:");
		System.out.println(chimosito.simplifica(fraccion1));

		System.out.println(chimosito.simplifica(fraccion2));

		//fraccion mixta
		System.out.println("Fraccion Mixta:");
			
		System.out.println(chimosito.fraccionMixta(fraccion1));
		
		
	}





}
