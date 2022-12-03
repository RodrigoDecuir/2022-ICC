
import java.util.Scanner;

public class Condicionales {
	

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Bienvenido a la computadora" + "\n" + "Proporciona tu usuario y contraseña");

		String usuario;
		String contrasenia;
		int contadorErrores=0;

		boolean accedio=false;


		System.out.println("Escribe tu usuario");
		usuario = entrada.next();

		System.out.println("Escribe tu contraseña");
		contrasenia = entrada.next();	


		if(usuario.equals("papa") && (contrasenia.equals("familia")  || contrasenia.equals("susi")) ) {
			System.out.println("Puedes acceder");
			System.out.println("Bienvenido");

			accedio=true;



		} else if( usuario.equals("beto") && contrasenia.equals("moxi") ) {
			System.out.println("Puedes acceder");
			System.out.println("Bienvenido");

			accedio=true;

		} else {

			System.out.println("Usuario o contraseña incorrectos");
			contadorErrores++;

			System.out.println("Escribe tu usuario");
			usuario = entrada.next();

			System.out.println("Escribe tu contraseña");
			contrasenia = entrada.next();
		}

			



		if(usuario.equals("papa") && (contrasenia.equals("familia")  || contrasenia.equals("susi")) ) {

			if(accedio!=true) {
				System.out.println("Puedes acceder");
				System.out.println("Bienvenido");
			}

		} else if( usuario.equals("beto") && contrasenia.equals("moxi") ) {

			if(accedio!=true) {
				System.out.println("Puedes acceder");
				System.out.println("Bienvenido");
			}

		} else {

			System.out.println("Usuario o contraseña incorrectos");
			contadorErrores++;

			System.out.println("Escribe tu usuario");
			usuario = entrada.next();

			System.out.println("Escribe tu contraseña");
			contrasenia = entrada.next();

		}	



		if(contadorErrores==3) {
			System.out.println("Número de intentos de sesión excedidos");
		}



	}


}









