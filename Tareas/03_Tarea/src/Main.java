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
	            
        System.out.println("Cuantos libros piensas guardar en tu librero?");
        int espacio = in.nextInt(); 
        Librero moderno = new Librero(espacio);	
        
        int valor = 0;
        int valor2 = 0;
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
			valor = in.nextInt();

			switch(valor) {
				case 1:
				    System.out.println(moderno.obtenerLibrero());	
                    break;
				case 2:
                    while(valor != 5) {
                        System.out.println("1. Modificar titulo");
					    System.out.println("2. Modificar autor");
                        System.out.println("3. Modificar numero de paginas");
                        System.out.println("4. Modificar la fecha");
                        System.out.println("5. Salir");
                        System.out.println("Seleccione la opcion--> ");
                        valor2 = in.nextInt();
                        switch(valor2) {
                            case 1: 
                                moderno[n].asignarTitulo(String t);  
                                break; 
                            case 2:
                                moderno[n].asignarAutor(String a);  
                                break;
                            case 3:
                                moderno[n].asignarNumeroDePaginas(int np);
                                break;
                            case 4:
                                moderno[n].asignarFechaDePublicacion(int fp); 
                                break;
                            case 5:
                                System.exit(0); 
                                break;
                            default:
                                System.out.println("Opcion invalida");
					            break;
                        */
                        }
				case 3:
				    moderno.llenarLibrero();   
                    System.out.println(moderno.obtenerLibrero());
                    break;
                case 4:
                    moderno.vaciarLibrero(); 
                    System.out.println(moderno.obtenerLibrero());
                    break; 
                case 5:
                    System.out.println("Titulo --> ");
                    String t = in.nextLine();
                    System.out.println("Autor --> ");
                    String a = in.nextLine();
                    System.out.println("Numero de paginas --> ");
                    int np = in.nextInt();
                    System.out.println("Fecha de publicacion --> ");
                    int fp = in.nextInt();
                    moderno.agregarLibro(t, a, np, fp); 
                    break;  
                case 6:
                    System.out.println("hola"); 
                    break;  
                case 7:
                    System.out.println("hola"); 
                    break;  
                case 8:
                    System.out.println("hola");                    
                    break; 
                case 9:
                    System.out.println("hola");
                    break;  
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
