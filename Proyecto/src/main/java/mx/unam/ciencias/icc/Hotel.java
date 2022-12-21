/**
 * Clase para simplificar las clases AvionIda, AvionRegreso, HabitacionSencilla y HabitacionFamiliar.
 * @author Rodrigo Andre Decuir Fuentes
 * @version 1.0
 */
package mx.unam.ciencias.icc;
import java.io.Serializable;
public class Hotel implements Serializable {
    //ATTRIBUTES
    private double precio;
    private boolean ocupado;
    private String tipoDeReservacion;
    //METHODS
    /**
     * Metodo constructor sin parametros, les da un valor inicial a los objetos.
      */
    public Hotel() {
        precio = 0;
        ocupado = false;
        tipoDeReservacion = "";
    }

    /**
     * Metodo para inicializar un objeto de tipo hotel.
     * @param precio precio (puede ser 0).
     * @param ocupado ocupacion.
     * @param tipoDeReservacion tipo de reservacion.
     */
    public Hotel(double precio, boolean ocupado, String tipoDeReservacion) {
        this.precio = precio;
        this.ocupado = ocupado;
        this.tipoDeReservacion = tipoDeReservacion;
        switch (tipoDeReservacion) {
            case "sencilla" -> precio = 580;//580 por noche 580 * 4;
            //modificas el cupo acorde
            case "familiar" -> precio = 1200;//1200 por noche 1200 * 4;
            //modificas el cupo acorde
            case "ida" -> precio = 2000;//2000 por ida
            //modificas el cupo acorde
            case "regreso" -> precio = 2000;//2000 por regreso
            //modificas el cupo acorde
        }
    }

    /**
     * Metodo para obtener el precio.
     * @return precio.
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * Metodo para ver la ocupacion.
     * @return ocupado (true o false).
     */
    public boolean getOcupado() {return ocupado; }

    /**
     * Metodo para obtener el tipo de reservacion.
     * @return tipo de reservacion.
     */
    public String getTipoDeReservacion() { return tipoDeReservacion; }

    /**
     * Metodo para modificar el precio.
      * @param precio precio.
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * Metodo para modificar la ocupacion.
     * @param ocupado true o false.
     */
    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }

    /**
     * Metodo para modificar el tipo de reservacion.
     * @param tipoDeReservacion nos dice cual tipo de reservacion se realizo.
     */
    public void setTipoDeReservacion(String tipoDeReservacion) {
        this.tipoDeReservacion = tipoDeReservacion;
    }
}
