/**
 * Clase con los posibles movimientos de la liebre.
 * @author Rodrigo Andre Decuir Fuentes
 * @version 1.0
 */

public class Liebre {
	
	//Indice en donde se encuentra la liebre en el arreglo principal
	//Atributos	
	private int posArreglo;

	//Ponemos a la liebre en su posicion inicial (1)
	/**
	 * Constructor de la liebre
	 * Pone a la liebre en su posicion inicial.
	 */	
	public Liebre() {
		posArreglo = 1;
	}

	//Tipo de movimiento y movimiento a ejecutar
	/**
	 * Metodo para ejecutar el movimiento de dormir.
	 * @return int -- posicion actual en el arreglo.
	 */	
	public int dormir() {
		//Ningun movimiento	
		return posArreglo;
	}
	
	/**
	 * Metodo para ejecutar el movimiento de gran salto.
	 * @return int -- posicion actual del arreglo o
	 * en caso de que la posicion del arreglo sea mayor a 
	 * 70 se regresa un 70.
	 */
	public int granSalto() {
		posArreglo += 9;
		if(posArreglo > 70) {
			return 70;
		}
		return posArreglo;
	}

	/**
	 * Metodo para ejecutar el movimiento gran resbalon.
	 * @return int -- posicion actual en el arreglo o 
	 * en caso de que la posicion tienda hacia abajo de 1
	 * se regresa a la posicion inicial.
	 */
	public int granResbalon() {
		posArreglo -= 12;
		if(posArreglo < 1) {
			posArreglo = 1;
		}
		return posArreglo;
	}

	/**
	 * Metodo para ejecutar el pequenio salto.
	 * @return int -- posArreglo y 70 en caso de 
	 * que posArreglo pase de 70.
	 */
	public int pequenioSalto() {
		posArreglo += 1;
		if(posArreglo > 70) {
			return 70;
		}
		return posArreglo;
	}

	/**
	 * Metodo para ejecutar el pequenio resbalon.
	 * @return int -- posArreglo y en caso de que 
	 * posArreglo sea menor a 1 la posicion inicial.
	 */
	public int pequenioResbalon() {
		posArreglo -= 2;
		if(posArreglo < 1) {
			posArreglo = 1;
		} 
		return posArreglo;
	}
		
}

