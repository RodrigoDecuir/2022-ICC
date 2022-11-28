/**
 * Clase para... 
 * @author Rodrigo Andre Decuir Fuentes
 * @version 1.0
 */
import java.util.Scanner;
import java.util.Arrays;
public class Main {

	public static void main(String[]args) {
		
		Scanner in = new Scanner(System.in);
	    Librero moderno = new Librero(15); //se crea un arreglo de libros [15]	
        
        //System.out.println("Cuantos libros piensas guardar en tu librero?");
        //int espacio = in.nextInt(); 
        //moderno.Librero(espacio);
        
        moderno.llenarLibrero();
        //System.out.println(moderno.ordenamientoPorFecha()); 
        System.out.println(moderno.obtenerLibrero());
        //System.out.println(Arrays.toString(moderno));

        /*        
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

			switch(valor) {
				case 1:
					
                    break;
				case 2:
					
                    break;
				case 3:
					
                    break;
                case 4:
                    
                    break; 
                case 5:
                    
                    break;  
                case 6:
                
                    break;  
                case 7:
                
                    break;  
                case 8:
                    
                    break; 
                case 9:
                    break;  
				case 10:
					System.exit(0);
					break;
				default:
					System.out.println("Opcion invalida");
					break;
			}

		}
        */
	}

}
