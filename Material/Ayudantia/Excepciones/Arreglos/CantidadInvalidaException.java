/**
  * Excepcion para una cantidad invalida en un arreglo
  * @author Ramses Lopez Soto
  * @version 2.0
  */
 public class CantidadInvalidaException extends Exception{

   /**
     * Constructor que llama al costructor por omision
     * de la clase madre
     */
    public CantidadInvalidaException(){
      super();
    }

    /**
      * Constructor que manda un mensaje de error
      * @param msj - mensaje dd error
      */
     public CantidadInvalidaException(String msj){
       super(msj);
     }
 }
