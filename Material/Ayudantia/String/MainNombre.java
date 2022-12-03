import java.util.Scanner;

/**
  * Clase principal para modificacon
  * del orden de un nombre cualquiera
  * @see clase Nombre
  * @author yo mero
  * @version -3.0
  */

public class MainNombre {

  public static void main(String[] args) {

    Scanner in = new Scanner(System.in); // se crea un objeto de la clase Scanner
    String nombreEntrada; 
    Nombre nombre;

    System.out.println("Ingresa tu(s) nombre(s) y apellidos separados por una coma."); // muestra el mensaje en pantalla

    nombreEntrada = in.nextLine(); // se ingresa el nombre

    nombre = new Nombre(nombreEntrada); // se crea un objeto Nombre con el nombre ingresado

    nombre.modificarNombre(nombre.getNombreReal()); // se modifica el nombre ingresado

    System.out.println(nombre); // se imprime el resultado en pantalla 

  }

}
