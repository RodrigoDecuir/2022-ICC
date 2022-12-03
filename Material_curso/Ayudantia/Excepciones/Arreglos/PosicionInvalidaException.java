/**
 * Excepcion para una posicion en invalida en un arreglo
 * @author Ramses Lopez Soto
 * @version diciembre 2017
 */
 public class PosicionInvalidaException extends Exception{

   private int [] arr;

   /**
     * Constructor que manda a llamar al constructor
     * por omision de la calse padre
     */
    public PosicionInvalidaException(){
      super();
    }

    /**
      * Constructor que manda un mensaje de error
      * @param msj - mensaje de error
      */
     public PosicionInvalidaException(String msj){
       super(msj);
     }

     /**
       * Constructor que recibe el tamanio del arreglo
       * @param tam - tamanio del arreglo
       */
      public PosicionInvalidaException(int tam) {
        arr = new int [tam];
      }

      /**
        * Metodo para devolver un mensaje
        * @param i - indice del arreglo
        * @return String - mensaje
        */
       public String getMessage(int i){
         return "El indice debe ir entre 0 y" + i;
       }
 }
