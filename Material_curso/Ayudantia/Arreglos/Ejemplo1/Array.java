import java.util.Random;
/**
 * Clase para leer un arreglo de numeros enteros
 * @author Ramses Lopez
 * @version 2.0
 */
public class Array {

  private Random in = new Random();
  private int[] enteros;

  /**
    * Contructor que llena el arreglos de -1
    * @param tam - tamanio del arreglo
    */
  public Array(int tam){
    enteros = new int[tam];
    for (int i = 0; i < enteros.length; i++){
      enteros[i] = -1;
    }
  }

  /**
    * Constructor de copia
    * @param copia - arreglo que copia un arreglo
    */
  public Array(Array copia) {
    enteros = copia.obtenerEnteros(); 
  }

 /**
   * Metodo que obtiene el arreglo de enteros
   * @return int[] - arreglo de enteros 
   */
  public int[] obtenerEnteros() {
    return enteros;
  }

  public void setEnteros(int[] newEnteros) {
    enteros = newEnteros;
  }

  /**
    * Metodo para llenar el arreglo hasta un tope
    * @param tope - tope hasta donde se llena en arreglo
    */
  public void llenar(int tope) {
    for(int i = 0; i <= tope; i++){
      enteros[i] = in.nextInt(10);
      }
  }

  /**
    * Metodo para llenar el arreglo
    */
  public void llenar() {
    for(int i = 0; i <enteros.length; i++){
      enteros[i] = in.nextInt(10);
      }
  }

  /**
    * Metodo para calcular el promedio del arreglo
    * @return double - promedio del arreglo
    */
  public double promedio(){
    double suma = 0;
    for(int i = 0; i < enteros.length; i++) {
      suma += enteros[i];
    }
    return suma/enteros.length;
  }

  /**
    * Metodo para determinar si un numero
    * se encuentra dentro del arreglo
    * @param m - numero que se quiere encontrar
    * @return boolean - true si se encuentra, false en otro caso
    */
  public boolean buscar(int m) {
    for(int i = 0; i < enteros.length; i++) {
      if (enteros[i] == m) {
        return true;
      }
    }
    return false;
  }

  /**
    * Metodo para invertir un arreglo
    * @return int[] - arreglo invertido
    */
  public int[] invertir() {
    int[] reversa = new int [enteros.length];
    for (int i = 0, j = enteros.length - 1; i < enteros.length; i++) {
      reversa[i] = enteros[enteros.length - 1 - i];
    }
    enteros = reversa;
    return enteros;
  }

  /**
    * Metodo para determinar si dos arreglos
    * son iguales
    * @param array - arreglo a comparar
    * @return boolean - true si son iguales, en otro caso
    */
    public boolean sonIguales(int[] array) {
      if (enteros.length == array.length) {
        for (int i = 0; i < enteros.length; i++) {
          for (int j = 0; j < array.length; j++) {
            if (enteros[i] == array[j]) {
              return true;
            } else {
              return false;
            }
          }
        }
      }
      return false;
    }

    /**
      * Muestra la informacion del arreglo
      * @return String - informacion del arreglo
      */
    public String toString() {
      String r1= "[" + enteros[0];
      for (int i = 1; i < enteros.length; i++) {
        r1 += "," + enteros[i];
      }
      r1 += "]";
      return r1;
}
}
