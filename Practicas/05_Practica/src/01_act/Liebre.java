/**
 * Clase con los posibles movimientos de la liebre.
 * @author Rodrigo Andre Decuir Fuentes
 * @version 1.0
 */

public class Liebre {

	//Ponemos a la liebre en su posicion inicial (1)
	public Liebre(int[] carril) {
		carril[1] = 1;	
//		pasoLiebre = 1;
	}


	//Tipo de movimiento y movimiento a ejecutar
	public void dormir() {
		pasoLiebre += 0;
	}
	public void granSalto() {
		pasoLiebre += 9;
	}
	public void granResbalon() {
		pasoLiebre -= 12;
	}
	public void pequenioSalto() {
		pasoLiebre += 1;
	}
	public void pequenioResbalon() {
		pasoLiebre -= 2;
	}

		
}

