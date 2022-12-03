
public class Autor {

	String nombre;
	String nacionalidad;
	boolean finado;

	public Autor(String n, String nac, boolean fi) {
		nombre = n;
		nacionalidad = nac;
		finado = fi;
	}

	//SETS
	
	//Gets
	public String getNombre() {
		return nombre;
	}


	public String getNacionalidad() {
		return nacionalidad;
	}

	public boolean getFinado() {
		return finado;
	}


	public String toString() {

		String cadenaVivo="";

		if(this.finado==true) {
		 	cadenaVivo = " Q.E.D";
		} 

		return "Autor: " + nombre + " nacionalidad " + nacionalidad + cadenaVivo;
	}



} 