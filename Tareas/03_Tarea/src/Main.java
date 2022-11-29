/**
 * Clase para implementar el librero. 
 * @author Rodrigo Andre Decuir Fuentes
 * @version 1.0
 */
import java.util.Scanner;
import java.util.Arrays;
public class Main {

	public static void main(String[]args) {
		
		Scanner in = new Scanner(System.in);
	    System.out.println("---Bienvenido---");
        System.out.println("📁Este es un sistema para manejar un librero 📁"); 
        System.out.print("Cuantos libros piensas guardar en tu librero? --> ");
        int n = in.nextInt(); 
        Librero librero = new Librero(n);	
        int v1 = 0;
        int v2 = 0;
		while(v1 != 10 && v1 < 10) {
			System.out.println("\n--📚LIBRERO 📚--");
            System.out.println(":::Opciones Disponibles:::");
			System.out.println("1. Enlistar libros existentes");
			System.out.println("2. Modificar un libro");
			System.out.println("3. Llenar librero");
			System.out.println("4. Vaciar librero");
            System.out.println("5. Agregar un libro");
		    System.out.println("6. Eliminar un libro");
            System.out.println("7. Buscar un libro");
            System.out.println("8. Ordenar libros por numero de paginas");
            System.out.println("9. Ordenar libros por fecha");
            System.out.println("10. Salir");
			System.out.print("Seleccione la opcion --> ");
			v1 = in.nextInt();
			switch(v1) {
				case 1:
                    librero.visualizar();    
                    break;
				case 2:
                    while(v2 != 5 && v2 < 5) {
                        System.out.println("");
                        System.out.println("1. Modificar titulo");
					    System.out.println("2. Modificar autor");
                        System.out.println("3. Modificar numero de paginas");
                        System.out.println("4. Modificar la fecha");
                        System.out.println("5. Salir");
                        System.out.print("Seleccione la opcion --> ");
                        v2 = in.nextInt();
                        int nl = 0; 
                        if(v2 != 5) { 
                            librero.visualizar();
                            System.out.print("Digite el numero de libro a modificar --> "); 
                            nl = in.nextInt();
                        }
                        if(librero.vacio(nl) != true && nl <= n) {
                            switch(v2) {
                                case 1: 
                                    System.out.print("Nuevo titulo --> ");
                                    String t = in.nextLine();
                                    librero.asignarT(nl, t);  
                                    break; 
                                case 2:
                                    System.out.print("Nuevo autor --> ");
                                    String a = in.nextLine();
                                    librero.asignarA(nl, a);  
                                    break;
                                case 3:
                                    System.out.print("Nuevo numero de paginas --> ");
                                    int np = in.nextInt();
                                    librero.asignarNp(nl, np);
                                    break;
                                case 4:
                                    System.out.print("Nueva fecha de publicacion --> ");
                                    int fp = in.nextInt();
                                    librero.asignarFp(nl, fp); 
                                    break;
                                case 5:
                                    System.exit(0); 
                                    break;
                                default:
                                    System.out.print("Opcion invalida");
					                break;
                            }
                        } else {
                            System.out.println("El libro elegido esta vacio o no existe, por lo tanto no se puede modificar.");
                            break;
                        } 
                        
                    }
                case 3:
				    librero.llenarLibrero();   
                    break;
                case 4:
                    librero.vaciarLibrero(); 
                    break; 
                case 5:
                    if(librero.vacio2() != 0) {
                        System.out.print("Titulo --> ");
                        String auxiliar = in.nextLine();//sirve para leer la siguiente linea
                        String t = in.nextLine(); 
                        System.out.print("Autor --> ");
                        String a = in.nextLine();
                        System.out.print("Numero de paginas --> ");
                        int np = in.nextInt();
                        System.out.print("Fecha de publicacion --> ");
                        int fp = in.nextInt();
                        librero.agregarLibro(t, a, np, fp); 
                    } else {
                        System.out.println("El librero se encuentra lleno");
                    }
                    break;  
                case 6:
                    int nu = 0;
                    System.out.println("*******Libros disponibles*******"); 
                    librero.visualizar();
                    System.out.println("\n*******Libros disponibles*******"); 
                    System.out.print("Digite el numero de libro a eliminar --> "); 
                    nu = in.nextInt();
                    if(nu < n) {
                        librero.eliminarLibro(nu); 
                    } else {
                        System.out.println("El libro elegido no existe, por lo tanto no se puede eliminar.");
                    } 
                    break;  
                case 7:
                   // librero.busquedaBinaria(); 
                    System.out.println("hola eliminar"); 
                    break;  
                case 8:
                    //librero.ordenamientoPorNuPag();
                    System.out.println("hola");                    
                    break; 
                case 9:
                    //librero.ordenPorFecha();
                    System.out.println("hola");
                    break;  
		    	case 10:
					System.exit(0);
					break;
			    default:
					System.out.println("***Opcion invalida***");
					break;
            }
		}
	}
}
