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
    Hotel[] hs = new Hotel[5];//Habitacion Sencilla
    Hotel[] hf = new Hotel[10];//Habitacion Familiar
    Hotel[] ai = new Hotel[50];//Avion Ida
    Hotel[] ar = new Hotel[50];//Avion Regreso
    //METHODS
    public Reservacion(String nombreTitular, int numeroAcompaniantes, Hotel[] hs, Hotel[] hf, Hotel[] ai, Hotel[] ar){
        this.id = setId();
        this.nombreTitular = nombreTitular;
        this.numeroAcompaniantes = numeroAcompaniantes;
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