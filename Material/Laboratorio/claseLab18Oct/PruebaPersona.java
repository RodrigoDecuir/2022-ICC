import java.util.Random;

public class PruebaPersona {
	

	public static int getEdadAleatoria() {
		Random aleatorios = new Random();
		//1 a 10 años de edad
		int edadGenerada = aleatorios.nextInt(10)+1;
		return edadGenerada;

	}



	public static void main(String[] args) {

		int edadAl = getEdadAleatoria();
		Persona p = new Persona("Anita", edadAl);

		System.out.println(p);

		
	}
	








}
