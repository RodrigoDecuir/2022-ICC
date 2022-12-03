
public class Alumno {
	
	String numeroCuenta;
	String nombre;

	public Alumno(String nc, String nom) {
		numeroCuenta = nc;
		nombre = nom;
	}

	//Setters
	public void setNumeroCuenta(String nc) {
		numeroCuenta = nc;
	}

	public void setNombre(String nom) {
		nombre = nom;
	}

	//Getters
	public String getNumeroCuenta() {
		return numeroCuenta;
	}

	public String getNombre() {
		return nombre;
	}


	public void inscribirse() {
		System.out.println("No puedes meter más de 6 materias");
	}

	private int getMateriasDebe() {
		return 2;
	}

	public int regresaValorMateriasDebe() {
		return getMateriasDebe();
	}



	//toString
	public String toString() {
		return "Alumno: " + nombre + ", con número de cuenta: " +numeroCuenta;
	}




}

