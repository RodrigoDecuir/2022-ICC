
public class ProfesorTC {
	
	String numeroTrabajador;
	String nombre;
	int antiguedadAcademica;

	public ProfesorTC(String nt, String nom, int ant) {
		numeroTrabajador = nt;
		nombre = nom;
		antiguedadAcademica = ant;
	}

	//SETTERS... tarea moral

	public String getNumeroTrabajador() {
		return numeroTrabajador;
	}


	public String getNombre() {
		return nombre;
	}


	public int getAntiguedad() {
		return antiguedadAcademica;
	}


	//Tostring
	public String toString() {
		return "Profesor: " + nombre + "NT: "+ numeroTrabajador + "\n" + "Antigüedad" + antiguedadAcademica;
	}


}
