/**
  * Excepcion si un numero es 
  * mayor a tres cifras
  * @author Ramses Lopez Soto
  * @version 2.0
  */
 public class TresCifrasException extends Exception {

   /**
     * Constructor por omision
    */
    public TresCifrasException() {
      super();
    }

    /**
      * Constructor que manda un mensaje de error
      * @param msj - mensaje de error
      */
     public TresCifrasException(String msj) {
       super(msj);
     }
 }