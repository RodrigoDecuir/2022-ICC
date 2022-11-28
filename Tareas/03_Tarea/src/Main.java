/**
 * Clase para... 
 * @author Rodrigo Andre Decuir Fuentes
 * @version 1.0
 */
import java.util.Scanner;
public class Main {

	public static void main(String[]args) {
		
		Scanner entrada = new Scanner(System.in);
	    Librero moderno = new Librero();	

        System.out.println("Cuantos libros piensas guardar en tu librero?");
        espacio = entrada.nextInt(); 
        moderno.Librero(espacio);
                
        int valor = 0;
		while(valor != 10) {

			System.out.println("\nLibrero");
			System.out.println("1. Enlistar libros existentes");
			System.out.println("2. Modificar un libro");
			System.out.println("3. Llenar librero");
			System.out.println("4. Vaciar librero");
            System.out.println("5. Agregar un libro");
		    System.out.println("6. Elminar un libro");
            System.out.println("7. Buscar un libro");
            System.out.println("8. Ordenar libros por numero de paginas");
            System.out.println("9. Ordenar libros por fecha");
            System.out.println("10. Salir");

			System.out.print("Seleccione la opcion--> ");
			valor = entrada.nextInt();

			Mensaje msj = new Mensaje(entrada.nextLine());

			switch(valor) {
				case 1:
					System.out.print("Introduce mensaje --> ");
					msj = new Mensaje(entrada.nextLine());
					c.agregarMensaje(msj);
					break;
				case 2:
					System.out.println("");
					c.escucharMensajeReciente();
					break;
				case 3:
					System.out.println("");
					c.escucharMensajes();
					break;
                case 4:
                
                case 5:

                case 6:

                case 7:

                case 8:

                case 9:

				case 10:
					System.exit(0);
					break;
				default:
					System.out.println("Opcion invalida");
					break;
			}

		}

	}

}
