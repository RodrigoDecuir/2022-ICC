import java.util.Scanner;

public class UsoPersona {
	

	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		String nombre;
		double peso;
		double estatura;

		System.out.println("Bienvenido al consultorio del Dr Simi");
		System.out.println("Cómo te llamas?");
		nombre = entrada.next();

		System.out.println("Cuánto pesas?");
		peso = entrada.nextDouble();

		System.out.println("Cuánto mides?");
		estatura = entrada.nextDouble();


		Persona p1 = new Persona(nombre, peso, estatura);
		System.out.println(p1);



	}


}

