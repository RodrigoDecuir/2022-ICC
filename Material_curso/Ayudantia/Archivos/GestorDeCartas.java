import java.io.*;
import java.util.Scanner;
/**
 * @see Carta
 * @author Ramses Lopez Soto
 * @version diciembre 2017
 */
 public class GestorDeCartas{

   private static Carta [] cartas = new Carta [15];
   private static Scanner io;
   private static String nombreDeArchivo;

   public static void menu(){
     System.out.println("Elige una opcion");
     System.out.println("1. Escribir carta");
     System.out.println("2. Leer carta");
     System.out.println("3. Salir");
   }

 /**
  * Metodo para guardar una carta
  */
  public static void guardar(){
    ObjectOutputStream c = null;

    try {
      c = new ObjectOutputStream(new FileOutputStream(nombreDeArchivo));
      for (int i = 0; i < cartas.length; i++) {
        c.writeObject(cartas[i]);
      }
    } catch (NotSerializableException e) {
        System.out.println("Error: " + e + "objeto no serializable");
    }catch (IOException e) {
        System.out.println("Error: " + e);
    } finally {
        if (c != null) {
          System.out.println("Cerrar archivo " + nombreDeArchivo);
          try {
            c.close();
          } catch (IOException e) {}
        } else {
            System.out.println("No se abrio el archivo");
        }
      }
   }

 /**
  * Metodo para leer una carta
  */
  public static void leer(){
    ObjectInputStream l = null;

    try {
      l = new ObjectInputStream(new FileInputStream(nombreDeArchivo));
      int i = 0;
      Object obj;
      do {
        obj = l.readObject();
        System.out.println(obj);
      } while (obj != null);
    } catch (ClassNotFoundException e) {}
      catch (EOFException e) {
          System.out.println("Fin del archivo");
    } catch (IOException e) {
          System.out.println("Error: " + e);
    } finally {
        if (l != null) {
              System.out.println("Cerrando archivo " + nombreDeArchivo);
            try {
                l.close();
            } catch (IOException e) {}
          } else {
              System.out.println("No se abrio archivo");
      }
    }
  }

  /**
   * Metodo para conocer el nombre del archivo
   */
   public static String obtenerNombreArchivo(){
     return nombreDeArchivo;
   }

  /**
   * Metodo para agregrar cartas
   * @param p carta que se va a agregrar
   */
   public static void agregarCarta(Carta p){
     int i = 0;
     cartas[i++] = p;
   }

   /**
    * Metodo que realiza la accion seleccionada
    * @param opcion opcion a elegir
    */
   public static void realizarAccion(int opcion){
     String nombre = null;
     String correo = null;
     String texto = null;

     switch (opcion){
       case 1:
          System.out.println("Dame tu nombre");
          nombre = io.next();
          System.out.println("Dame tu correo electronico");
          correo = io.next();
          System.out.println("Dame el nombre del archivo");
          nombreDeArchivo = io.next();
          nombreDeArchivo = nombreDeArchivo + ".txt";
          System.out.println("Escibe lo que desees");
          texto = io.next();
          texto = texto.trim();
          agregarCarta(new Carta(nombre, correo, texto));
          break;
       case 2:
          System.out.println("Dame el nombre del archivo");
          nombreDeArchivo = io.next();
          nombreDeArchivo = nombreDeArchivo + ".txt";
          leer();
       case 3:
          System.out.println("Hasta pronto");
          break;
       default:
          System.out.println("opcion incorrecta");
     }
   }

   public static void main(String[] args) {

     int opcion;
     nombreDeArchivo = nombreDeArchivo + ".txt";
     io = new Scanner(System.in);

     do {
       menu();
       opcion = io.nextInt();
       realizarAccion(opcion);
     } while (opcion != 3);

     guardar();
   }
 }
