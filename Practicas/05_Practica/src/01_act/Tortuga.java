/**
 * Clase con los posibles movimientos de la tortuga.
 * @author Rodrigo Andre Decuir Fuentes
 * @version 1.0
 */

public class Tortuga {

	
	//Indice en donde se encuentra la tortuga en el arreglo principal
	//Atributos	
	private	int posArreglo;

	//Ponemos a la liebre en su posicion inicial (1)
	/**
	 * Constructor de la tortuga 
	 * (posiciona a la tortua en 1.
	 */	
	public Tortuga() {
		posArreglo = 1;
	}
	
	//Tipo de movimiento y movimiento a ejecutar
	/**
	 * Metodo para dar un pasoRapido.
	 * @return int -- posArreglo y 70 
	 * en caso de que posArreglo pase de 70.
	 */	
	public int pasoRapido() {
		posArreglo += 3;
		if(posArreglo > 70) {
			return 70;
		}	
		return posArreglo;
	}

	/**
	 * Metodo para dar un resbalon.
	 * @return int -- posArreglo y 
	 * posicion inicial en caso de que 
	 * posArreglo se vuelva menor a 1.
	 */
	public int resbalon() {
		posArreglo -= 6;	
		if(posArreglo < 1) {
			posArreglo = 1;
		} 
		return posArreglo;
	}
	
	/**
	 * Metodo para dar un pasoLento.
	 * @return int -- posArreglo y 
	 * 70 en caso de que posArreglo sea
	 * mayor a 70.
	 */
	public int pasoLento() {
		posArreglo += 1;
		if(posArreglo > 70) {
			return 70;
		}
		return posArreglo;
	}

		
}

