
public class Perro {
	
	String nombre;
	String raza;
	boolean vacunado;


	public Perro() {
		
	}


	public Perro(String n, String r) {
		nombre = n;
		raza = r;
		//Al nacer un perro se vacuna
		/*if(v==true) {
			vacunado = v;
		} else {
			vacunado = true;
		}*/
		vacunado = false;
	}


	//Metodos set
	public void setVacunado() {
		vacunado = true;
	}

	//Get
	public String getRaza() {
		return raza;
	}

	public String getNombre() {
		return nombre;
	}


	public boolean getVacunado() {
		return vacunado;
	}


	public void vacunar() {
		if(this.getVacunado()==true) {
			System.out.println("El perrito ya está vacunado");
		} else {
			this.setVacunado();
		}

	}


	public String toString() {
		String cad="";
		if(this.getVacunado()==true) {
			cad = "Perrito de nombre: " + nombre + ", raza " + raza + " está vacunado";
		} else {
			cad = "Perrito de nombre: " + nombre + ", raza " + raza + " NO está vacunado";
		}
		return cad;
	}



}