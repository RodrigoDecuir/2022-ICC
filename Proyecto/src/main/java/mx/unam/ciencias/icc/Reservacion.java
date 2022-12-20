/**
 * Clase para guardar la informacion de la reservacion.
 * @author Rodrigo Andre Decuir Fuentes
 * @version 1.0
 */
package mx.unam.ciencias.icc;
import java.util.*;
public class Reservacion {
    Random random = new Random();
    //ATTRIBUTES
    private String id;
    private String nombreTitular;
    private int numeroAcompaniantes;
    Hotel hs;//Habitacion Sencilla
    Hotel hf;//Habitacion Familiar
    Hotel ai;//Avion Ida
    Hotel ar;//Avion Regreso
    //METHODS
    //se llenan los arreglos
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
    public Reservacion(String nombreTitular, int numeroAcompaniantes, Hotel hs, Hotel hf, Hotel ai, Hotel ar){
        //recibe solo objetos de tipo hotel y ya con eso se puede obtener la informacion que necesito
        this.id = setId();
        this.nombreTitular = nombreTitular;
        this.numeroAcompaniantes = numeroAcompaniantes;
        this.hs = hs;
        this.hf = hf;
        this.ai = ai;
        this.ar = ar;
    }
    public String getId() {
       return id;
    }
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
    public String getNombreTitular(){
        return nombreTitular;
    }
    public void setNombreTitular(String nombreTitular){
       this.nombreTitular = nombreTitular;
    }
    public int getNumeroAcompaniantes(){
        return numeroAcompaniantes;
    }
    public void setNumeroAcompaniantes(int numeroAcompaniantes){
        this.numeroAcompaniantes = numeroAcompaniantes;
    }
    public String toString() {
        String i = "ID: "+ getId();
        String t = "Titular: "+ getNombreTitular();
        String a = "Acompaniantes: " + getNumeroAcompaniantes();
        return i + "\n" + t + "\n" + a;
    }
}