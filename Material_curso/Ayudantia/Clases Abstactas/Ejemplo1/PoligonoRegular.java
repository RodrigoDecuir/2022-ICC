/**
 * Clase que simula un poligono regular como
 * una clase abstracta
 * @author Ramses Lopez Soto
 * @version 2022
 */
 public abstract class PoligonoRegular implements Angulo {

   protected int lados;
   protected double longitud;

   /**
    * Constructor que recibe el numero de lados
    * y la longitud de los lados
    * @param numLados numero de lados del poligono
    * @param longi logitud de los lados
    */
    public PoligonoRegular(int numLados, double longi) {
      if (numLados < 3) {
        numLados = 3;
      }
      if(longi <= 1){
        longi = 3;
      }
      lados = numLados;
      longitud = longi;
    }

    /**
      * Metodo para obtener el numero de lados
      * @return int - numero de lados del poligono
      */
    public int obtenerNumeroLados(){
      return lados;
    }

    /**
    * Metodo para obtener la longitud de los lados en centimetros
    * @return double - longitud de los lados
    */
    public double obtenerLongitud(){
        return longitud;
    }

   /**
      * Metodo para calcular el perimetro de un
      * poligono regular
      * @return double - pelimetro del poligono
      */
      public double perimetro(){
         return longitud * lados;
      }

    /**
      * Metodo para calcular el area de un
      * poligono regular
      * @return double - area del poligono
      */
    public abstract double area();

    /**
      * Metodo para imprimir la informacion del poligono
      * @return String - informacion del poligono
      */
      public String toString(){
        return "La figura: ";
      }

 }
