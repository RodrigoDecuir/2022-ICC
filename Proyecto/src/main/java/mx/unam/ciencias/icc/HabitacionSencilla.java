/**
 * Clase para crear objetos de tipo HabitacionSencilla.
 * @author Rodrigo Andre Decuir Fuentes
 * @version 1.0
 */
package mx.unam.ciencias.icc;
public class HabitacionSencilla extends Reservacion {
    //ATTRIBUTES
    private String nombreDelTitular;
    private int numeroDeAcompaniantes;
    private int numeroDeHabitacion;
    //METHODS
    public String getNombreDelTitular() {
        return nombreDelTitular;
    }
    public int getNumeroDeAcompaniantes() {
        return numeroDeAcompaniantes;
    }
    public int getNumeroDeHabitacion() {
        return numeroDeHabitacion;
    }
    public void setNombreDelTitular(String nombreDelTitular) {
        this.nombreDelTitular = nombreDelTitular;
    }
    public void setNumeroDeAcompaniantes(int numeroDeAcompaniantes) {
        this.numeroDeAcompaniantes = numeroDeAcompaniantes;
    }
    public void setNumeroDeHabitacion(int numeroDeHabitacion) {
        this.numeroDeHabitacion = numeroDeHabitacion;
    }
}
