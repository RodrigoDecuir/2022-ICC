/**
 * Clase con los posibles movimientos de la tortuga.
 * @author Rodrigo Andre Decuir Fuentes
 * @version 1.0
 */

public class Tortuga {

	
	//Indice en donde se encuentra la liebre en el arreglo principal
	int posArreglo;

	//Ponemos a la liebre en su posicion inicial (1)
	public Tortuga() {
		posArreglo = 1;
	}

	//Tipo de movimiento y movimiento a ejecutar
	public int pasoRapido() {
		posArreglo += 3;
		if(posArreglo > 70) {
			return 70;
		}	
		return posArreglo;
	}

	public int resbalon() {
		posArreglo -= 6;	
		if(posArreglo < 1) {
			posArreglo = 1;
		} 
		return posArreglo;
	}

	public int pasoLento() {
		posArreglo += 1;
		if(posArreglo > 70) {
			return 70;
		}
		return posArreglo;
	}

		
}

