public class Duenio {
	
	
	String nombre;
	int edad;
	FechaCumpleanios fecha;


	public Duenio(String n, int e, FechaCumpleanios fc) {
		nombre = n;
		edad = e;
		fecha = fc;
	}


	//SET
	public void setNombre(String n) {
		nombre = n;
	}


	public void setEdad(int e) {
		edad = e;
	}

	public void setFechaCumple(FechaCumpleanios fc) {
		fecha = fc;
	}


	//GEts
	public String getNombre() {
		return nombre;
	}

	public int getEdad() {
		return edad;
	}


	public FechaCumpleanios getFechaCumpleanios() {
		return fecha;
	}

	public String toString() {
		return "Hola soy: " + nombre + ", tengo " + edad + " años de edad" + "cumplo años el " + fecha;
	}


}