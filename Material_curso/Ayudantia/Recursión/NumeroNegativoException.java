/**
  * Excepcion si un numero es negativo
  * @author Ramses Lopez Soto
  * @version 2.0
  */
 public class NumeroNegativoException extends Exception {

   /**
     * Constructor por omision
    */
    public NumeroNegativoException() {
      super();
    }

    /**
      * Constructor que manda un mensaje de error
      * @param msj - mensaje de error
      */
     public NumeroNegativoException(String msj) {
       super(msj);
     }
 }