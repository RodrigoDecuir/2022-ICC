/**
 * Clase para guardar la informacion de la reservacion.
 * @author Rodrigo Andre Decuir Fuentes
 * @version 1.0
 */
package mx.unam.ciencias.icc;
import java.io.Serializable;
import java.util.*;
public class Reservacion implements Serializable{
    Random random = new Random();
    //ATTRIBUTES
    private String id;//identificacion de reservacion
    private String nombreTitular;
    private int numeroAcompaniantes;
    Hotel hs;//Habitacion Sencilla
    Hotel hf;//Habitacion Familiar
    Hotel ai;//Avion Ida
    Hotel ar;//Avion Regreso
    //METHODS
    /**
     * Metodo para llenar los arreglos.
     * @param avionIda arreglo de aviones de ida.
     * @param avionRegreso arreglo de aviones de regreso.
     * @param habitacionSencilla arreglo de habitaciones sencillas.
     * @param habitacionFamiliar arreglo de habitaciones familiares.
     */
    public Reservacion(Hotel[] avionIda, Hotel[] avionRegreso, Hotel[] habitacionSencilla, Hotel[] habitacionFamiliar) {
        for(int i=0; i<avionIda.length; i++) {
            avionIda[i] = new Hotel(0,false,"ida");
        }
        for(int i=0; i<avionRegreso.length; i++) {
            avionRegreso[i] = new Hotel(0,false,"regreso");
        }
        for(int i=0; i<habitacionSencilla.length; i++) {
            habitacionSencilla[i] = new Hotel(0, false, "sencilla");
        }
        for(int i=0; i<habitacionFamiliar.length; i++) {
            habitacionFamiliar[i] = new Hotel(0, false, "familiar");
        }
    }

    /**
     * Metodo para inicializar los atributos.
     * @param nombreTitular nombre del titular.
     * @param numeroAcompaniantes numero de acompaniantes.
     * @param hs habitacion sencilla.
     * @param hf habitacion familiar.
     * @param ai avion ida.
     * @param ar avion regreso.
     */
    public Reservacion(String nombreTitular, int numeroAcompaniantes, Hotel hs, Hotel hf, Hotel ai, Hotel ar){
        this.id = setId();
        this.nombreTitular = nombreTitular;
        this.numeroAcompaniantes = numeroAcompaniantes;
        this.hs = hs;
        this.hf = hf;
        this.ai = ai;
        this.ar = ar;
    }

    /**
     * Metodo para obtener el id de reservacion.
     * @return id - cadena alfanumerica.
     */
    public String getId() {
       return id;
    }

    /**
     * Metodo para configurar la identificacion de reservacion.
     * @return String aleatorio alfanumerio de tamanio 4.
     */
    public String setId() {
        //random alphanumeric chain with length 4
        char[] alfabeto = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
        int random = new Random().nextInt(alfabeto.length);
        int random2 = new Random().nextInt(alfabeto.length);
        char uno = alfabeto[random];
        char tres = alfabeto[random2];
        int dos = new Random().nextInt(9);
        int cuatro = new Random().nextInt(9);
        return uno +""+ dos +""+ tres +""+ cuatro;
    }

    /**
     * Metodo para obtener el nombre del titular.
      * @return nombre del titular.
     */
    public String getNombreTitular(){
        return nombreTitular;
    }

    /**
     * Metodo para modificar el nombre del titular.
     * @param nombreTitular nombre del titular.
     */
    public void setNombreTitular(String nombreTitular){
       this.nombreTitular = nombreTitular;
    }

    /**
     * Metodo para obtener el numero de acompaniantes.
     * @return numero de acompaniantes.
     */
    public int getNumeroAcompaniantes(){
        return numeroAcompaniantes;
    }

    /**
     * Metodo para modificar el numero de acompaniantes.
     * @param numeroAcompaniantes numero de acompaniantes.
     */
    public void setNumeroAcompaniantes(int numeroAcompaniantes){
        this.numeroAcompaniantes = numeroAcompaniantes;
    }

    /**
     * Metodo para imprimir una cadena con los datos de la reservacion.
     * @return datos de la reservacion.
     */
    public String toString() {
        String i = "ID: "+ getId();
        String t = "Titular: "+ getNombreTitular();
        String a = "Acompaniantes: " + getNumeroAcompaniantes();
        //mandar a imprimir objetos hoteles
        return i + "\n" + t + "\n" + a;
    }
}