/**
  *Clase que modela una pelicula
  * @author Ramses Lopez
  * @version 2.0
  */

public class Pelicula {
    
    private String director;
    private String titulo;
    private int anio;

    /**
      * Constructor que inicializa una pelicula vacia
      */
    public Pelicula() {
        asignarDirector("");
        asignarTitulo("");
        asignarAnio(0);
    }

    /**
      * Constructor que inicializa una pelicula
      * @param d - director de la pelicula
      * @param t - titulo de la pelicula
      * @param a - anio de la pelicula
      */
    public Pelicula (String d, String t, int a) {
        asignarDirector(d);
        asignarTitulo(t);
        asignarAnio(a);
    }

    /**
      * Metodo que obtiene el titulo de una pelicula
      * @return String - titulo de la peliculo
      */
    public String obtenerTitulo() {
        return titulo;
    }

    /**
      * Metodo que obtiene el director de una pelicula
      * @return String - director de la peliculo
      */
    public String obtenerDirector() {
        return director;
    }

    /**
      * Metodo que obtiene el anio de una pelicula
      * @return int - anio de la peliculo
      */
    public int obtenerAnio() {
        return anio;
    }

    /**
      * Metodo de asigna un nuevo director a una pelicula
      * @param d - nuevo director a asignar
      */
    public void asignarDirector(String d) {
        director = d;
    }

    /**
      * Metodo de asigna un nuevo titulo a una pelicula
      * @param t - nuevo titulo a asignar
      */
    public void asignarTitulo(String t) {
        titulo = t;
    }

    /**
      * Metodo de asigna un nuevo anio a una pelicula
      * @param a - nuevo anio a asignar
      */
    public void  asignarAnio(int a) {
        anio = a;
    }

    /**
      * Metodo que verifica si dos peliculas son iguales
      * @param p - pelicula a comparar
      * @return boolean - true si son iguales, false en otro caso
      */
    public boolean equals(Pelicula p) {
        if (titulo.equals(p.obtenerTitulo()) && 
             director.equals(p.obtenerDirector()) && 
             anio == obtenerAnio()) {
                return  true;
                } else{
                    return false;
                    }
    }
  	
    /**
      * Metodo que devuelce la informacion de una pelicula
      * @return String - informacion de una pelicula
      */
    public String toString() {
        return "Director: "+ obtenerDirector() + "\n" + 
                   "Titulo: " + obtenerTitulo() + "(" + obtenerAnio() +")";
    }
}


