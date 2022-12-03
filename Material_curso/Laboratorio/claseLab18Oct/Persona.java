
public class Persona {
	
	String nombre;
	//Edad aleatoria, generada con un método estático
	int edad;



	public Persona(String n) {
		nombre = n;
		edad = getEdadAleatoria();
	}


	//SETS y GETS
	public String toString() {
		return "Hola, soy la persona " + nombre + " y tengo " + edad + " años";
	}


}


