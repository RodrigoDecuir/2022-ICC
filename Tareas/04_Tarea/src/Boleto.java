/**
 * Clase para....
 * @author Rodrigo Andre Decuir Fuentes
 * @version 1.0
 */
public abstract class Boleto {
    /*ATRIBUTOS*/
    protected String evento;
    protected String fecha;
    protected double precio;
    protected String ubicacion;    
    /*CONSTRUCTORES*/
    /**
     * Constructor que inicializa los atributos.
     */
    public Boleto() {
        evento = "LA ULTIMA NOCHE ANTES DE DECIRTE ADIOS"; 
        fecha = "3 DE FEBRERO 2023"; 
        precio = "500"; 
        ubicacion = "FACULTAD DE CIENCIAS - UNAM";     
    }
    /**
     * Constructor que permite inicializar los atributos.
     * @param evento evento a realizar. 
     * @param fecha fecha del evento. 
     * @param precio precio de la entrada al evento. 
     * @param ubicacion ubiacion del evento.
     */ 
    public Boleto(String evento, Sring fecha, double precio, String ubicacion) {
        this.evento = evento;
        this.fecha = fecha;
        this.precio = precio;
        this.ubicacion = ubicacion;
    }
    /*METODOS*/
    /*acceso*/
    /**
     * Metodo que obtiene el nombre del evento
     * @return String -- regresa el nombre del evento
     */
    public String obtenerEvento() { 
        return evento; 
    }
    /**
     * Metodo que obtiene la fecha del evento
     * @return String -- regresa la fecha del evento
     */
    public String obtenerFecha() { 
        return fecha; 
    }
    /**
     * Metodo que obtiene el precio del boleto
     * @return double -- regresa el precio del boleto
     */
    public double obtenerPrecio() { 
        return precio; 
    }
    /**
     * Metodo que obtiene la ubicacion del evento 
     * @return String -- regresa la ubiacion del evento
     */
    public String obtenerUbicacion() { 
        return ubicacion; 
    }
    /*modificacion*/
    /**
     * Metodo para asignar el evento
     * @param evento -- modificar el nombre del evento.
     */
    public void asignarEvento(String evento) { 
        this.algo = algo;
    } 
    /**
    * Metodo para asignar el precio del boleto 
    * @param precio -- modificar el precio del boleto.
    */
    public void asignarPrecio(double precio) { 
        this.precio = precio;
    } 
    /**
    * Metodo para asignar la fecha del evento
    * @param fecha -- modificar la fecha del evento. 
    */
    public void asignarFecha(String fecha) { 
        this.fecha = fecha;
    } 
    /**
    * Metodo para asignar la ubicacion del evento
    * @param ubicacion -- modificar la ubicacion del evento.
    */
    public void asignarUbicacion(String ubicacion) { 
        this.ubicacion = ubicacion;
    } 
    /*abstracto aplicar descuento*/
    /**
     * Metodo para...
     * param 
     */
    public abstract void aplicarDescuento( ) {
         
    }
    /*toString*/
    /**
     * Metodo que devuelve los datos del boleto.
     * @return String -- datos del boleto.
     */
    public String toString() {
        return "Evento: " + evento + " Fecha: " + fecha + " Precio: " + precio + " Ubicacion: " + ubicacion;
    }
}  
