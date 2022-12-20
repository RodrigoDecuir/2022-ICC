/**
 * Clase padre para simplificar las clases AvionIda, AvionRegreso, HabitacionSencilla y HabitacionFamiliar.
 * @author Rodrigo Andre Decuir Fuentes
 * @version 1.0
 */
package mx.unam.ciencias.icc;
public class Hotel {
    //ATTRIBUTES
    private double precio;
    private boolean ocupado;
    private String tipoDeReservacion;
    //METHODS
    /*
    public Hotel() {
        precio = 0;
        ocupado = false;
        tipoDeReservacion = "";
    }
     */
    public Hotel(double precio, boolean ocupado, String tipoDeReservacion) {
        this.precio = precio;
        this.ocupado = ocupado;
        this.tipoDeReservacion = tipoDeReservacion;
        switch (tipoDeReservacion) {
            case "sencilla" -> precio = 580;//580 por noche
            //modificas el cupo acorde
            case "familiar" -> precio = 1200;//1200 por noche
            //modificas el cupo acorde
            case "ida" -> precio = 2000;//2000 por ida
            //modificas el cupo acorde
            case "regreso" -> precio = 2000;//2000 por regreso
            //modificas el cupo acorde
        }
    }
    public double getPrecio() {
        return precio;
    }
    public boolean getOcupado() {return ocupado; }
    public String getTipoDeReservacion() { return tipoDeReservacion; }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }
    public void setTipoDeReservacion(String tipoDeReservacion) {
        this.tipoDeReservacion = tipoDeReservacion;
    }
}
