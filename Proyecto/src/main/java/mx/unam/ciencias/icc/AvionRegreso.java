/**
 * Clase para crear objetos de tipo Avion.
 * @author Rodrigo Andre Decuir Fuentes
 * @version 1.0
 */
package mx.unam.ciencias.icc;
public class AvionRegreso extends Reservacion {
    //ATTRIBUTES
    private int numeroDeAsientos;
    private boolean ocupado;
    //METHODS
    public int getNumeroDeAsientos() {
        return numeroDeAsientos;
    }
    public boolean getOcupado() {
        return ocupado;
    }
    public void setNumeroDeAsientos(int numeroDeAsientos) {
        this.numeroDeAsientos = numeroDeAsientos;
    }
    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }
}

