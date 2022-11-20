/**
 * Clase con los posibles movimientos de la liebre.
 * @author Rodrigo Andre Decuir Fuentes
 * @version 1.0
 */

public class Liebre {
	
	//Indice en donde se encuentra la liebre en el arreglo principal
	int posArreglo;

	//Ponemos a la liebre en su posicion inicial (1)
	public Liebre() {
		posArreglo = 1;
	}

	//Tipo de movimiento y movimiento a ejecutar
	public int dormir() {
		//Ningun movimiento	
		return posArreglo;
	}

	public int granSalto() {
		posArreglo += 9;
		if(posArreglo > 70) {
			return 70;
		}
		return posArreglo;
	}

	public int granResbalon() {
		posArreglo -= 12;
		if(posArreglo < 1) {
			posArreglo = 1;
		}
		return posArreglo;
	}

	public int pequenioSalto() {
		posArreglo += 1;
		if(posArreglo > 70) {
			return 70;
		}
		return posArreglo;
	}

	public int pequenioResbalon() {
		posArreglo -= 2;
		if(posArreglo < 1) {
			posArreglo = 1;
		} 
		return posArreglo;
	}
		
}

