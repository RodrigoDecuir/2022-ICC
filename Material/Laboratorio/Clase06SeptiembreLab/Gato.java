import java.util.Random;

public class Gato {
	

	String nombre;
	String genero;
	String raza;
	boolean vacunado;
	boolean operado;
	int edad;

	public Gato() {

	}


	public Gato(String nombre, String g, String ra, boolean v, boolean op , int e) {
		this.nombre = nombre; 
		genero = g;
		raza = ra;
		vacunado = v;
		operado = op;
		edad= e;
	}


	//Métodos set (cambiar el estado de un objeto)
	public void setNombre(String n) {
		nombre = n;
	}


	public void setGenero(String g) {
		genero = g;
	}


	public void setRaza(String r) {
		raza = r;
	}


	public void setVacunado(boolean v) {
		vacunado = v;
	}


	public void setOperado(boolean o) {
		operado = o;
	}


	public void setEdad(int e) {
		edad = e;
	}


	//Métodos get (conocer el estado de un objeto)
	public String getNombre() {
		return nombre;
	}

	public String getRaza() {
		return raza;
	}

	public String getGenero() {
		return genero;
	}


	public boolean getVacunado() {
		return vacunado;
	}

	public boolean getOperado() {
		return operado;
	}


	public int getEdad() {
		return edad;
	}



	//Métodos aparte
	public void pelea(Gato primerGato, Gato segundoGato) {

		if(primerGato.getGenero().equals("macho") && segundoGato.getGenero().equals("macho") ) {

			Random aleatorios = new Random();

			int volado = aleatorios.nextInt(2);

			if(volado==1) {
				System.out.println("Gana la pelea " + primerGato.getNombre());
			} else {
				System.out.println("Gana la pelea " + segundoGato.getNombre());
			}


		} else {

			System.out.println("Sólo los gatos machos pelean entre sí");
		}
	}



	public void pelea(Gato gato) {

		if(this.getGenero().equals("macho") && gato.getGenero().equals("macho") ) {

			Random aleatorios = new Random();

			int volado = aleatorios.nextInt(2);

			if(volado==1) {
				System.out.println("Gana la pelea " + this.getNombre());
			} else {
				System.out.println("Gana la pelea " + gato.getNombre());
			}

		} else {



			System.out.println("Sólo los gatos machos pelean entre sí");
		}


	}



	public String toString() {
		return "El gato " + nombre + " tiene " + edad + " años de edad y es de raza " + raza;
	}
	


}





