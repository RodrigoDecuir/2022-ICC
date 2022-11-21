/**
 * Clase para ejecutar los metodos programados en la contestadora. 
 * @author Rodrigo Andre Decuir Fuentes
 * @version 1.0
 */
import java.util.Scanner;

public class Main {

	public static void main(String[]args) {
		
		Scanner entrada = new Scanner(System.in);
		Contestadora c = new Contestadora();	

		int valor = 0;

		while(valor != 4) {

			System.out.println("Contestadora");
			System.out.println("1. Agregar mensaje");
			System.out.println("2. Revisar mensaje reciente");
			System.out.println("3. Revisar mensajes");
			System.out.println("4. Salir");
			
			valor = entrada.nextInt();
			
			System.out.println("");
			Mensaje msj = new Mensaje(entrada.nextLine());

			switch(valor) {
				case 1:
					System.out.println("Introduce mensaje -->");
					msj = new Mensaje(entrada.nextLine());
					c.agregarMensaje(msj);
					System.out.println("");
					break;
				case 2:
					c.escucharMensajeReciente();
					break;
				case 3:
					c.escucharMensajes();
					break;
				case 4:
					System.exit(0);
					break;
				default:
					System.out.println("Opcion invalida");
					break;
			}

		}

	}//fin del main

}//fin de clase
