/**
 * Programa para mostrar el funcionamiento de las excepciones en java
 * @author Francisco Manuel Monreal Gamboa
 * @version 1
 */
import java.util.Scanner;
import java.util.InputMismatchException;

public class Prueba2 {
	public static void main (String [] args) {

		// Scanner s =new Scanner(System.in);
        
  //       int resp=-1;
        
  //       do{
  //           System.out.print("Dame un numero : ");
  //           try{
  //               resp= s.nextInt();
  //           }catch(InputMismatchException e){
  //               //System.out.println(e);
  //               System.out.println("Porfavor pasa un numero entero");
  //               s.nextLine();
  //           }//finally{
  //               //System.out.println("hooasdbsa");
  //           //}
  //       }while( resp == -1);

  //       System.out.println("Gracias! (" + resp + ")");

        Scanner io =new Scanner(System.in);
        int num;

        System.out.println("Dame un numero");


        while (!io.hasNextInt()) {
            System.out.println("Porfavor pasa un numero entero");
            io.nextLine();
        }

        num = io.nextInt();

        System.out.println("Gracias! (" + num + ")");

	}
}
