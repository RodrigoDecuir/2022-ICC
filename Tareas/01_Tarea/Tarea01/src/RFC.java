/**
 *  * Clase para obtener el RFC
 *  * @author Rodrigo André Decuir Fuentes
*/
import java.util.Scanner;
public class RFC {
	public static void main(String[]args){
	Scanner entrada = new Scanner(System.in);
// Se declaran las variables y su tipo
	String nombreCompleto; 
	String nombreCompletoUpp;
	String fechaNacimiento;
	String primerNombre;
	int encuentraApellidos;
	String apellidoPaterno;
	int encuentraEspacio;
	String apellidoMaterno;
	String dia;
	String mes;
	String año;
	int encuentraMes;
	int encuentraAño;
// a) Solicitar al usuario su nombre completo, en una lınea.
	System.out.println("Bienvenid@! Este programa obtiene tu RFC");
	System.out.println("Introduce tu nombre completo en una línea. Mediante el formato: Nombre(s), ApellidoPaterno ApellidoMaterno");
	nombreCompleto = entrada.nextLine();
	nombreCompletoUpp = nombreCompleto.toUpperCase();
// b) Solicitar al usuario su fecha de nacimiento, en formato dd/mm/aa, es decir, dos dígitos
//    para el día, dos para el mes y dos mas para el año. Cada dato separado por una diagonal.
	System.out.println("Introduce tu fecha de nacimiento en formato dd/mm/aa");
	fechaNacimiento = entrada.nextLine();
// c) Recabar los datos solicitados.	
// d) Extraer la inicial del nombre de la persona.
	primerNombre = nombreCompletoUpp.substring(0, 1); 
// e) Extraer las dos primeras letras del apellido paterno.
	encuentraApellidos = nombreCompletoUpp.indexOf(",");
	apellidoPaterno = nombreCompletoUpp.substring(encuentraApellidos + 1).trim().substring(0,2); 
// f ) Extraer la inicial del apellido materno.
	encuentraEspacio = nombreCompletoUpp.lastIndexOf(" ");	
	apellidoMaterno = nombreCompletoUpp.substring(encuentraEspacio + 1).substring(0,1);	
// g) Formar el RFC con las letras antes obtenidas.
//    apellidoPaterno + apellidoMaterno + primerNombre
// h) Manipular la fecha de nacimiento, es decir extraer el año, el mes y el día y agregarlo al RFC.
	dia = fechaNacimiento.substring(0, 2);
	encuentraMes = fechaNacimiento.indexOf("/");
	mes = fechaNacimiento.substring(encuentraMes + 1).substring(0,2);
	encuentraAño = fechaNacimiento.lastIndexOf("/");
	año = fechaNacimiento.substring(encuentraAño + 1).substring(0,2);
	System.out.println("--> RFC --> " + apellidoPaterno + apellidoMaterno + primerNombre + año + mes + dia); 
	}
}
