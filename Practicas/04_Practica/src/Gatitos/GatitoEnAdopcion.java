/**
 * Clase para dar un gatito en adopcion.
 * @author Rodrigo Andre Decuir Fuentes
 * @version 27 oct 2022
 */

public class GatitoEnAdopcion {

	//Atributos
	String nombre;
	String raza;
	
	/**
	 * Constructor por parametros.
	 * @param n nombre del gato.
	 * @param r raza del gato.
	 */
	public GatitoEnAdopcion(String n, String r){
		nombre = n;
		raza = r;
	}
	
	/**
	 * Constructor por omision.
	 */
	public GatitoEnAdopcion() { }


	//SET
	/**
	 * Metodo para asignar un nombre al gatito.
	 */
	public void setNombre(String n) {		
		nombre = n;
	}
	
	/**
	 * Metodo para asingar la raza al gatito.
	 */
	public void setRaza(String r) {
		raza = r;
	}
	
			
	//GET
	/**
	 * Metodo para obtener el nombre del gatito.
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Metodo para obtener la raza del gatito.
	 */
	public String getRaza() {
		return raza;
	}


	/**
	 * Metodo para imprimir la cartilla de vacunacion del gatito.
	 */
	public String toString() {
		return "\nGatito: " + nombre + "\n" + 
		       "Raza: " + raza + "\n" + 
		       "***********************************" + "\n" + "CARTILLA" + 
		       " \n***********************************";
	}	

}
