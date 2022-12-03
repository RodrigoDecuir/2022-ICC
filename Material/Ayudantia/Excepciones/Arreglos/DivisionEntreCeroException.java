/**
  * Excepcion si el divisor es cero
  * @author Ramses Lopez Soto
  * @version 2.0
  */
 public class DivisionEntreCeroException extends Exception{

   /**
     * Constructor por omision
    */
    public DivisionEntreCeroException() {
      super();
    }

    /**
      * Constructor que manda un mensaje de error
      * @param msj - mensaje de error
      */
     public DivisionEntreCeroException(String msj) {
       super(msj);
     }
 }
