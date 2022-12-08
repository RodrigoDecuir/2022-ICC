/**
 * Programa para comprobar la jerarquía de clases
 * Pelicula,Disco y Libro
 * @author Francisco Manuel Monreal Gamboa
 * @version 1
 */
import java.util.Scanner;
import java.util.ArrayList;
import java.util.InputMismatchException;

public class PruebaArticulos{

	public static int preguntar(){
		Scanner s=new Scanner(System.in);
		
		int resp=-1;
		
        do{
            System.out.print("Dame un numero : ");
            try{
                resp= s.nextInt();
            }catch(InputMismatchException e){
                //System.out.println(e);
                System.out.println("Porfavor pasa un numero entero");
                s.nextLine();
            }//finally{
            	//System.out.println("hooasdbsa");
            //}
        }while( resp == -1);

        return resp;
	}

	public static int preguntar2(){
		Scanner io =new Scanner(System.in);
		int num;

		System.out.println("Dame un numero");


		while (!io.hasNextInt()) {
   			System.out.println("Porfavor pasa un numero entero");
   			io.nextLine();
		}

		num = io.nextInt();

		return num;
	}


	public static void main(String []pps){
		Scanner on = new Scanner(System.in);
    	Scanner in = new Scanner(System.in);
    	
    	Libro[] libros = new Libro[0];
    	Utilidades ut = new Utilidades();
    	
    	//Leemos los objetos del archivo libros.txt
    	libros = ut.leerObjetosArchivoLibro("libros.txt");
    	
    	int lector = 0;

    	
    
		do{	
			/** 
	 		* Se imprime el menu y se lee la eleccion del usuario
     		*/
			System.out.println("\n1.- Agregar libros");
			System.out.println("2.- Mostrar libros");
			System.out.println("3.- Salir");
		 
			lector = preguntar();

    		switch (lector){
				/** 
		 		* Si el usuario elije un numero del 1 al 3, se crea un nuevo objeto de 
		 		* la clase Pelicula,Libro o Disco, con los datos necesarios
		 		* que dara el usuario,para luego añadirlo al arreglo 
		 		* correspondiente
	     		*/
				case 1:
					System.out.println("\nTitulo de libro: ");
					String titulo = in.next();
					System.out.println("Autor del libro: ");
					String autor = in.next();
					System.out.println("Año de publcaion: ");
					int anio =in.nextInt(); 
					System.out.println("Editorial del libro: ");
					String editorial = in.next();
					Libro nuevo = new Libro(titulo,autor,anio,editorial);
					//Agregamos el nuevo elemento creado
					libros = ut.agregarAArregloLibro(nuevo);
				break;
	
			    /** 
				 * Si el usuario elije un numero de 4 a 7, se muestra el arreglo mediante un for, mostrando
				 * cuantos articulos tiene registrados y tambien cada uno de estos
			     */
			    case 2:
				    System.out.println("\nTienes un total de "+libros.length +" libros registrados\n");
				    for(int i = 0; i < libros.length; i++) {   
				    	System.out.println("Libro "+(i+1));
				    	System.out.println(libros[i]);
				    	System.out.println("");
					}  
			    break;
   
	    		case 3:

	    			//Guardamos los elementos de nuestro arreglo libros	
	    			ut.EscribirObjetosArchivo("libros.txt",libros);

	    			System.out.println("\nHasta luego");
	       		break;

			     /** 
				 * Si el usuario elije un numero mayor a 8 o menor a 0 se muestra un mensaje de error
			     */
	     		default:
	    			System.out.println("\nOpcion no valida,solo puedes poner numeros del 1 al 3");
	       		break;
       		}
	       /** 
		 * Si el usuario elije el numero 8 se acaba el ciclo y se cierra el programa
	     */
	    }while(lector != 3);
	}
}
