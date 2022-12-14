/**
 * Programa para comprobar la jerarquía de clases
 * Pelicula,Disco y Libro
 * @author Rodrigo Andre Decuir Fuentes
 * @version 1.0
 */
import java.util.Scanner;
import java.util.ArrayList;
import java.util.InputMismatchException;

public class PruebaArticulos{

	public static int preguntar(){
		Scanner s=new Scanner(System.in);
		
		int resp=-1;
		
        do{
            System.out.print("          Dame un numero : ");
            try{
                resp= s.nextInt();
            }catch(InputMismatchException e){
                //System.out.println(e);
                System.out.println("          Porfavor pasa un numero entero");
                s.nextLine();
            }//finally{
            	//System.out.println("sasasa");
            //}
        }while( resp == -1);

        return resp;
	}

	public static int preguntar2(){
		Scanner io =new Scanner(System.in);
		int num;

		System.out.println("          Dame un numero");

		while (!io.hasNextInt()) {
   			System.out.println("          Porfavor pasa un numero entero");
   			io.nextLine();
		}

		num = io.nextInt();
		return num;
	}


	public static void main(String []pps){
		Scanner on = new Scanner(System.in);
    	Scanner in = new Scanner(System.in);
    	
    	Libro[] libros = new Libro[0];
        Disco[] discos = new Disco[0];
        Pelicula[] peliculas = new Pelicula[0];
    	Utilidades ut = new Utilidades();
    	
    	//Leemos los objetos del archivo libros.txt
    	libros = ut.leerObjetosArchivoLibro("libros.txt");
        //Leemos los objetos del archivo discos.txt
        discos = ut.leerObjetosArchivoDisco("discos.txt"); 
        //Leemos los objetos del archivo peliculas.txt    
        peliculas = ut.leerObjetosArchivoPelicula("peliculas.txt");
    	int lector = 0;

		do{	
			/** 
	 		* Se imprime el menu y se lee la eleccion del usuario
     		*/
            System.out.println("\n          1. Agregar libro"); 
            System.out.println("          2. Agregar disco");
            System.out.println("          3. Agregar pelicula");
            System.out.println("          4. Mostrar libro(s)");
            System.out.println("          5. Mostrar disco(s)");
			System.out.println("          6. Mostrar pelicula(s)");
			System.out.println("          7. Mostrar todos los articulos");
			System.out.println("          8. Salir");
		 
			lector = preguntar();

    		switch (lector){
				/** 
		 		* Si el usuario elije un numero del 1 al 3, se crea un nuevo objeto de 
		 		* la clase Pelicula, Libro o Disco, con los datos necesarios
		 		* que dara el usuario, para luego añadirlo al arreglo 
		 		* correspondiente
	     		*/
				case 1:
					System.out.println("\n          Dame el nombre del libro: ");
					String titulo = in.nextLine();
					System.out.println("          Dame el autor del libro: ");
					String autor = in.nextLine();
					System.out.println("          Dame la editorial del libro: ");
					String editorial = in.nextLine();
                    System.out.println("          Dame el anio de publicacion: ");
					int anio =in.nextInt(); 
					Libro libro = new Libro(titulo,autor,anio,editorial);
					//Agregamos el nuevo elemento creado
					libros = ut.agregarArregloLibro(libro);
				break;
                
                case 2:
                    System.out.println("\n          Dame el nombre del disco:");
                    String nombreDisco = in.nextLine();
                    System.out.print("");
                    System.out.println("          Dame el interprete del disco:");
                    String interprete = in.nextLine();
                    System.out.print("");
                    System.out.println("          Dame el anio de lanzamiento del disco:");
                    int lanzDisco = in.nextInt();
                    System.out.print("");
                    System.out.println("          Dame el idioma del disco:");
                    String idiom = in.nextLine();
                    System.out.print("");
                    System.out.println("          Dame el numero de canciones del disco:");
                    int nCanciones = in.nextInt();
                    System.out.print("");
                    System.out.println("          Dame el genero musical del disco:"); 
                    String gen = in.nextLine(); 
                    System.out.print("");
                    Disco disco = new Disco(nombreDisco, interprete, lanzDisco, idiom, nCanciones, gen);
                    //Agregamos el nuevo elemento creado
                    discos = ut.agregarArregloDisco(disco); 
                break;
                 
                case 3:
                    System.out.println("\n          Dame el nombre de la pelicula:");
                    String nombre = in.nextLine();
                    System.out.print("");
                    System.out.println("          Dame el director de la pelicula:");
                    String director = in.nextLine();
                    System.out.print("");
                    System.out.println("          Dame el genero de la pelicula:");
                    String genero = in.nextLine();
                    System.out.print("");
                    System.out.println("          Dame el idioma de la pelicula:");
                    String idioma = in.nextLine();
                    System.out.print("");
                    System.out.println("          Dame el anio de lanzamiento de la pelicula:");
                    int lanzamiento = in.nextInt();
                    System.out.print("");
                    System.out.println("          Dame la duracion de la pelicula(min):"); 
                    int duracion = in.nextInt(); 
                    System.out.print("");
                    Pelicula pelicula = new Pelicula(nombre, director, genero, lanzamiento, idioma, duracion);
                    //Agregamos el nuevo elemento creado
                    peliculas = ut.agregarArregloPelicula(pelicula); 
                break;
			    
                /** 
				 * Si el usuario elije un numero de 4 a 7, se muestra el arreglo
                 * mediante un for, mostrando cuantos articulos tiene registrados
                 * y tambien cada uno de estos
			     */
			    case 4:
				    System.out.println("<------------------->");
                    System.out.println("\nTienes un total de "+libros.length +" libros registrados\n");
				    for(int i = 0; i < libros.length; i++) {   
				    	System.out.println("Libro "+(i+1));
				    	System.out.println(libros[i]);
				    	System.out.println("");
					}  
                    System.out.println("<------------------->");
			    break;
                
                case 5:
                    System.out.println("<------------------->");
                    System.out.println("\nTienes un total de" +discos.length+" discos registrados\n");  
                    for(int j = 0; j < discos.length; j++) {
                       System.out.println("Disco "+ (j+1));
                       System.out.println(discos[j]); 
                       System.out.println("");
                    }
                    System.out.println("<------------------->");
                break; 
    
                case 6:
                    System.out.println("<------------------->");
                    System.out.println("\nTienes un total de" +peliculas.length+" peliculas registradas\n"); 
                    for(int k = 0; k < peliculas.length; k++) {
                        System.out.println("Pelicula " + (k+1)); 
                        System.out.println(peliculas[k]);
                        System.out.println("");
                    }
                    System.out.println("<------------------->");
                break;

                case 7:
                    System.out.println("<-------------------------->"); 
                    int suma = peliculas.length + discos.length + libros.length;
                    System.out.println("\nTienes un total de " + suma + " articulos." ); 
                    for(int i = 0; i < libros.length; i++) {   
				    	System.out.println("Libro "+(i+1));
				    	System.out.println(libros[i]);
				    	System.out.println("");
                    }
                    for(int j = 0; j < discos.length; j++) {
                       System.out.println("Disco "+ (j+1));
                       System.out.println(discos[j]); 
                       System.out.println("");
                    }
                    for(int k = 0; k < peliculas.length; k++) {
                        System.out.println("Pelicula " + (k+1)); 
                        System.out.println(peliculas[k]);
                        System.out.println("");
                    }
                    System.out.println("<--------------------------->");
                break;

	    		case 8:
	    			//Guardamos los elementos de nuestro arreglo libros	
	    			ut.EscribirObjetosArchivoLibro("libros.txt", libros);
                    //Guardamos los elementos de nuestro arreglo de discos
                    ut.EscribirObjetosArchivoDisco("discos.txt", discos);
                    //Guardamos los elementos de nuestro arreglo de peliculas
                    ut.EscribirObjetosArchivoPelicula("peliculas.txt", peliculas);
	    			System.out.println("\nHasta luego");
	       		break;
			     /** 
				 * Si el usuario elije un numero mayor a 8 o menor a 0 se muestra un mensaje de error
			     */
	     		default:
	    			System.out.println("\nOpcion invalida, ingresa un numero del 1 al 8");
	       		break;
       		}
	       /** 
		 * Si el usuario elije el numero 8 se acaba el ciclo y se cierra el programa
	     */
	    }while(lector != 8);
	}
}
