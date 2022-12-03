
public class Pais {
	
	String nombre;
	String capital;

	public Pais(String n, String c) {
		nombre = n;
		capital = c;
	}


	//Get
	public String getNombre() {
		return nombre;
	}

	public String getCapital() {
		return capital;
	}


	public String toString() {
		return "País: " + nombre + ", capital: " + capital;
	}


}