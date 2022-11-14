/**
 *
 * / ICC /
 * / Cinthia Rodriguez Maya / 
 * / Facultad de Ciencias - UNAM /
 * @author Rodrigo Andre Decuir Fuentes
 *
*/

package util; 

public class Punto {
	

	//Atributos
	double coordenada_x;
	double coordenada_y;


	//Constructor
	public Punto(double x, double y) {
		coordenada_x = x;
		coordenada_y = y;
	}


	//Métodos set
	public void setCoordenadaX(double x) {
		coordenada_x = x;
	}

	public void setCoordenadaY(double y) {
		coordenada_y = y;
	}	


	//Métodos get
	public double getCoordenadaX() {
		return coordenada_x;
	}


	public double getCoordenadaY() {
		return coordenada_y;
	}


	public String toString() {
		return "(" +  coordenada_x + "," + coordenada_y + ")";
	}
}


