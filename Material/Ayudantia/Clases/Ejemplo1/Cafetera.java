/**
 * Clase que emula una cafetera
 * @author Ramses Lopez Soto
 * @version 2.0
 */
 public class Cafetera {
    
    private int capacidadMaxima; // mililitros
    private int cantidadActual; // mililitros

    /**
      * Constructor por omision con
      * capacidad de 1 litro y con
      * 0 ml de cantidad actual.
      */
    public Cafetera() {
        this.asignarCapacidadMaxima(1000);
        this.asignarCantidadActual(0);
    }

    /**
      * Constructor con una cafetera llena.
      * @param cMax - capcidad maxima de la cafetera
      */
    public Cafetera(int cMax) {
        this.asignarCantidadActual(cMax);
    }

    /**
      * Constructor que asigna la capacdadMaxima y
      * la cantidadActual de una cafetera.
      * @param cMax - capacidad maxima de la cafetera
      * @param cAct - cantidad actual en la cafetera
      */
    public Cafetera(int cMax, int cAct) {
        if (cAct > cMax) {
            this.asignarCantidadActual(cMax);
        }
        this.asignarCapacidadMaxima(cMax);
        this.asignarCantidadActual(cAct);
    }

    /**
      * Obtiene la capacidad maxima de la cafetera
      * @return int - capacidad maxima de la cafetera
      */
    public int obtenerCapacidadMaxima() {
        return capacidadMaxima;
    }

    /**
      * Asigna una nueva capacidad maxima a la cafetera
      * @param newCMax - nueva capacidad maxima
      */
    public void asignarCapacidadMaxima(int newCMax) {
        capacidadMaxima = newCMax;
    }

    /**
      * Obtiene la cantidad actual en la cafetera
      * @return int - cantidad actual en la cafetera
      */
    public int obtenerCantidadActual() {
        return cantidadActual;
    }

    /**
      * Asigna una nueva cantidad actual a la cafetera
      * @param newCAct - nueva cantidad actual
      */
    public void asignarCantidadActual(int newCAct) {
        cantidadActual = newCAct;
    }

    /**
      * Metodo que se encarga de llenar la cafetera.
      */
    public void llenarCafetera() {
        this.asignarCantidadActual(this.obtenerCapacidadMaxima());
    }

    /**
      * Metodo que se encarga de servir cafe.
      * @param cantidadCafeServido - cantidad de cafe a servir
      */
    public void servirCafe(int cantidadCafeServido) {
        this.asignarCantidadActual(this.obtenerCantidadActual() - cantidadCafeServido);
    }

    /**
      * Metodo que se encarga de vaciar la cafetera
      */
    public void vaciarCafetera() {
        this.asignarCantidadActual(0);
    }

    /**
      * Se encarga de aniadir cafe a la cafetera.
      * @param cantidadCafeAgregado - cantidad de cafe a agregar
      */
    public void agregarCafe(int cantidadCafeAgregado) {
        if (cantidadCafeAgregado > this.obtenerCapacidadMaxima() ||
             (this.obtenerCantidadActual() + cantidadCafeAgregado) > this.obtenerCapacidadMaxima()) {
            this.asignarCantidadActual(this.obtenerCapacidadMaxima());
        }
        this.asignarCantidadActual(this.obtenerCantidadActual() + cantidadCafeAgregado);
    }

    /**
      * Metodo que devuelve la informacion de la cafetera
      * @return String - informacion de la cafetera
      */
    public String toString() {
        return "Cafetera:" + "\n" + 
                    "Capacidad maxima: " + this.obtenerCapacidadMaxima() + "\n" +
                    "Cantidad actual de cafe: " + this.obtenerCantidadActual();
    }

 }