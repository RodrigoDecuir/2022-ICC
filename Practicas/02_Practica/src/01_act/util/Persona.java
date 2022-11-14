/**
 *
 * / ICC /
 * / Cinthia Rodriguez Maya /
 * / Facultad de Ciencias - UNAM /
 * @author Rodrigo Andre Decuir Fuentes
 *
*/

//Declaracion del paquete 
//al cual pertenece la clase
package util;

public class Persona {
	

	//Atributos
	String nombre;
	double peso, estatura;
	

	//Constructor
	public Persona(String n, double p, double e) {
		nombre = n;
		peso = p;
		estatura = e;
	}


	//Métodos set
	public void setNombre(String n) {
		nombre = n;
	}

	public void setPeso(double p) {
		peso = p;
	}

	public void setEstatura(double e) {
		estatura = e;
	}


	//Métodos get
	public String getNombre() {
		return nombre;
	}


	public double getPeso() {
		return peso;
	}

	public double getEstatura() {
		return estatura;
	}


	//toString
	public String toString() {
		return "\n" + "Hola " + nombre + " ! " + "\n" + "Con base a tu " + "Peso (" + peso + " kg) y tu " + "Estatura ("  + estatura + " m) la evaluacion es la siguiente:";
	}	
}

