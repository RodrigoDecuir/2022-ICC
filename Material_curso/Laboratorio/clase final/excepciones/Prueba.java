/**
 * Programa para mostrar el funcionamiento de las excepciones en java
 * hacemos un menu robusto
 * @author Francisco Manuel Monreal Gamboa
 * @version 1
 */
 
import java.util.Scanner;
import java.util.InputMismatchException;

public class Prueba {

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

	public static void main (String [] args) {

		int opcion = 0;

   		do{	
			System.out.println("\n1.- Agregar libros");
			System.out.println("2.- Agregar discos");
			System.out.println("3.- Agregar películas");
			System.out.println("4.- Mostrar libros");
			System.out.println("5.- Mostrar discos");
			System.out.println("6.- Mostrar peliculas");
			System.out.println("7.- Mostrar todos los artículos");
			System.out.println("8.- Salir");
			//lector = on.nextInt();
			opcion = preguntar2();
	
    		switch (opcion){
				case 1:
					System.out.println("caso 1");
				break;

				case 2:
					System.out.println("caso 2");
				break;

				case 3:
					System.out.println("caso 3");
				break;

				case 4:
					System.out.println("caso 4");
				break;

				case 5:
					System.out.println("caso 5");
				break;

				case 6:
					System.out.println("caso 6");
				break;

				case 7:
					System.out.println("caso 7");
				break;

				case 8:
					System.out.println("Adios");
				break;

				default:
					System.out.println("Numero no valido");
				break;

			}

    	}while(opcion != 8);

	}
}
