/**
 * Clase Pasaporte
 * Esta clase modela un pasaporte a través de la composición
 * de objetos
 * @atributos: numeracion: String, paisOrigenEmision: Pais
 * 
 **/

public class Pasaporte {
	
	//Atributos
	String numeracion;
	Pais paisOrigenEmision;

	//Constructor
	/*
	*	@params: n: String, paisOE: Pais 
	*/
	public Pasaporte(String n, Pais paisOE) {
		numeracion = n;
		paisOrigenEmision = paisOE;
	}

	//SETS
	/*
	*  Método setNumeracion
	*  @return void
	*  @param n: String
	*/
	public void setNumeracion(String n) {
		numeracion = n;
	}


	/*
	*  Método setPais
	*  @return void
	*  @param paisOE: Pais
	*/
	public void setNumeracion(Pais paisOE) {
		paisOrigenEmision = paisOE;
	}


	//Gets
	/*
	*   Método getNumeracion
	*	@return numeracion:String
	*/
	public String getNumeracion() {
		return numeracion;
	}


	//Gets
	/*
	*   Método getPaisEmision
	*	@return paisOE: Pais
	*/
	public Pais getPaisEmision() {
		return paisOrigenEmision;
	}


	/*
	*   Método toString
	*	@return String
	*/
	public String toString() {
		String cadena="";
		if(paisOrigenEmision!=null) {
			cadena = "Pasaporte: " + numeracion + " Pais de emisión: " + paisOrigenEmision.getNombre() + ", " + "Capital: " + paisOrigenEmision.getCapital();
		} else {
			cadena = "Pasaporte posiblemente fraudulento";
		}
		return cadena;
		
	}


}

