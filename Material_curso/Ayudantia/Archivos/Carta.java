import java.io.*;
/**
 * Clase para registrar una carta
 * @author Ramses Lopez Soto
 * @version diciembre 2017
 */
 public class Carta implements Serializable{

   private String nombre;
   private String correo;
   private String texto;

   /**
    * Constructor con una carta vacia
    */
    public Carta(){
      nombre = " ";
      correo = " ";
      texto = " ";
    }
   /**
    * Constructor de una carta
    * @param nameR nombre
    * @param emailR correo electronico
    * @param txt cuerpo del texto
    */
    public Carta(String nameR, String emailR, String txt){
      nombre = nameR;
      correo = emailR;
      texto = txt;
    }

    /**
     * Metodo para conocer el nombre
     * @return String - devuelve el nombre
     */
     public String obtenerNombre(){
       return nombre;
     }

     /**
      * Metodo para asignar un nuevo nombre
      * @param t nuevo nombre
      */
      public void asignarNombre(String t){
        nombre = t;
      }

      /**
       * Metodo para conocer el correo electronico
       * @return String - devuelve el correo electronico
       */
       public String obtenerCorreo(){
         return correo;
       }

       /**
        * Metodo para asignar un nuevo correo electronico
        * @param a nuevo correo electronico d
        */
        public void asignarCorreo(String a){
          correo = a;
        }

        /**
         * Metodo para conoce el contenido del texto
         * @return String - devuelve el texto
         */
         public String obtenerTexto(){
           return texto;
         }

         /**
          * Metodo para modificar el contenidop del texto
          * @param t texto que va a modificar el el texto
          */
          public void asignarTexto(String t){
            texto = t;
          }

          /**
           * Metodo para obtener los dotos de la carta
           * @return String - devuelve los datos de la carta
           */
           public String toString(){
             return " " + nombre + "(" + correo + ")" + "\n"
                  + "\t" + obtenerTexto();
           }
 }
