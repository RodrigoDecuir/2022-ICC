// usar replace(" "",");
/**
 * Clase para enviar un telegrama
 * @author Rodrigo André Decuir Fuentes
*/
import java.util.Scanner;
	public class Telegrama {
		public static void main(String[] args) {
			Scanner entrada = new Scanner(System.in);
// 		Se declaran las variables y su tipo
//
			String Remitente;
			String Profesion;
			String Destinatario;
			String ProfesionDestinatario;
			String Mensaje;
			String Direccion;
			double CostoTotal = 0;
			double Costo = 0;
			double preciourgente = 4;
			double precionourgente = 2;
			int a;
			String Urgente = "";
			
// 		las siguientes variables las estaba usando pero no las habia declarado
			 
			String SubstringProf;
			String UpperCaseProf;
			String UpperCaseRem;
			String SubstringProfDest;
			String UpperCaseProfDest;
			String UpperCaseDest;
			int CuantasLetras;

			System.out.println("Nombre del remitente: ");
			Remitente = entrada.nextLine();
			System.out.println("Profesión del remitente: ");
			Profesion = entrada.nextLine();
			System.out.println("Nombre del destinatario: ");
			Destinatario = entrada.nextLine();
			System.out.println("Profesión del destinatario: ");
			ProfesionDestinatario = entrada.nextLine();
			System.out.println("Mensaje: ");
			Mensaje = entrada.nextLine();
			System.out.println("Dirección del destinatario en formato Calle numero.ciudad, CP");
			Direccion = entrada.nextLine();

			System.out.println("¿El mensaje es urgente? 1-si/2-no: ");
			a = entrada.nextInt();
			if (a == 1){
				Urgente = ("Este mensaje es Urgente 😱" + "\n");
				CostoTotal = Mensaje.length() * preciourgente;
				Costo = 4;
			} else {
			      //  Urgente;
			       CostoTotal = Mensaje.length() * precionourgente;
			       Costo = 2;
			}	       

//			Se cambia el estado de las variables

			SubstringProf = Profesion.substring(0,3);
			UpperCaseProf = SubstringProf.toUpperCase();
			UpperCaseRem = Remitente.toUpperCase();
			SubstringProfDest = ProfesionDestinatario.substring(0,3);
			UpperCaseProfDest = SubstringProfDest.toUpperCase(); 
			UpperCaseDest = Destinatario.toUpperCase();
			CuantasLetras = Mensaje.length();	

			int posespacio = Direccion.indexOf(".");
		       	String calleynum = Direccion.substring(0, posespacio);
			String uppercalleynum = calleynum.toUpperCase();
		
			int FinDeLaDireccion = Direccion.length()-1;
			String ciudadycp = Direccion.substring(posespacio + 1, FinDeLaDireccion);
			String upperciudadycp = ciudadycp.toUpperCase();

			System.out.println("\n" + " ***Telegrama***" + "\n" + "\n" + "De: " + UpperCaseProf + ". " + UpperCaseRem + "\n" + "Para: " + UpperCaseProfDest + ". " + UpperCaseDest + "\n" + "Mensaje: " +  Mensaje + "\n\n" + Urgente + "Costo: $" + CostoTotal);
			System.out.printf(CuantasLetras + " letras. " + "Costo por letra $%.2f", Costo);
			System.out.println("\n" + "\n" + "Dirección: " + "\n" + uppercalleynum + "\n" + upperciudadycp);
	}
}
