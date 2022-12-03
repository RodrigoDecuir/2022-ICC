
public class Gato {
	
	String nombre;
	String raza;
	Duenio duenio;

	public Gato(String nombre, String r, Duenio d) {
		this.nombre = nombre;
		raza = r;
		duenio = d;
	}

	//SET
	public void setNombre(String n) {
		nombre = n;
	}

	public void setRaza(String r) {
		raza = r;
	}


	public void setDuenio(Duenio d) {
		duenio = d;
	}


	//GET
	public String getNombre() {
		return nombre;
	}

	public String getRaza() {
		return raza;
	}


	public Duenio getDuenio() {
		return duenio;
	}


	public String toString() {
		return "El gatito se llama " + nombre + " es de raza " + raza + " y su dueño es: " + duenio.getNombre() + " su mes de cumpleaños es " + duenio.getFechaCumpleanios().getMesFC();
	}


}