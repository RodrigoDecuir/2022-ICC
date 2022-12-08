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
    	
    	Utilidades<Libro> ut = new Utilidades<Libro>();
    	//Utilidades<Disco> utDisc = new Utilidades<Disco>();
    	
    	//Leemos los objetos del archivo libros.txt
    	ut.leerObjetosArchivoLibro("libros.txt");
    	//utDisc.leerObjetosArchivoLibro("discos.txt");
    	
    	int lector = 0;
    
		do{	
			/** 
	 		* Se imprime el menu y se lee la eleccion del usuario
     		*/
			System.out.println("\n1.- Agregar libros");
			System.out.println("2.- Mostrar articulos");
			System.out.println("3.- Agregar Disco por default");
			System.out.println("4.- Salir");
		 
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
					ut.agregarAArreglo(nuevo);
				break;
	
			    /** 
				 * Si el usuario elije un numero de 4 a 7, se muestra el arreglo mediante un for, mostrando
				 * cuantos articulos tiene registrados y tambien cada uno de estos
			     */
			    case 2:
				    ut.leerArreglo("Libros");
				    //utDisc.leerArreglo("Discos");
			    break;

			    case 3:
				    //utDisc.agregarAArreglo(new Disco("titulo","autor",1998,"idioma",22,"genero"));
				    //utDisc.agregarAArreglo(new Libro("titulo","autor",1998,"editorial"));
			    break;
   
	    		case 4:

	    			//Guardamos los elementos de nuestro arreglo libros	
	    			ut.escribirObjetosArchivo("libros.txt");
	    			//utDisc.escribirObjetosArchivo("discos.txt");

	    			System.out.println("\nHasta luego");
	       		break;

			     /** 
				 * Si el usuario elije un numero mayor a 8 o menor a 0 se muestra un mensaje de error
			     */
	     		default:
	    			System.out.println("\nOpcion no valida,solo puedes poner numeros del 1 al 8");
	       		break;
       		}
	       /** 
		 * Si el usuario elije el numero 8 se acaba el ciclo y se cierra el programa
	     */
	    }while(lector != 4);
	}
}
