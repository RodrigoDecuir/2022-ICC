
public class Persona {
	

	//Atributos
	String nombre;
	double peso;
	double estatura;


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
		return "Hola me llamo: " + nombre + " peso: " + peso + " y mido" + estatura + " m";
	}

}
