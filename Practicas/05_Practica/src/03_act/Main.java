/**
 * Clase para...
 * @author Rodrigo Andre Decuir Fuentes
 * @version 1.0
 */
import java.util.Scanner;

public class Main {

	public static void main(String[]args) {
		
		Scanner entrada = new Scanner(System.in);
		Contestadora contestadora = new Contestadora();	
		
		int valor = 0;

		while(valor != 4) {
			System.out.println("Contestadora");
			System.out.println("1. Agregar mensaje");
			System.out.println("2. Revisar mensaje reciente");
			System.out.println("3. Revisar mensajes");
			System.out.println("4. Salir");
			
			valor = entrada.nextInt();

			switch(valor) {
				case 1:
					Mensaje msj = new Mensaje(entrada.nextLine());
					contestadora.agregarMensaje(msj);
					break;
				case 2:
					contestadora.escucharMensajeReciente();
					break;
				case 3:
					contestadora.escucharMensajes();
					break;
				case 4:
					System.exit(0);
					break;
				default:
					System.out.println("Opcion invalida");
					break;

			}

		}

	}

}
