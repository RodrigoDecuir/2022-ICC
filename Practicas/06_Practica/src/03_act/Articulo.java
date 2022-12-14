/**
 * Clase padre para simplificar las clases libro, disco y pelicula. 
 * @author Rodrigo Andre Decuir Fuentes
 * @version 1.0 
 */
import java.io.Serializable;

public class Articulo implements Serializable{
    //ATRIBUTOS 
    private String titulo;
    private String autor;
    private int anio;
    /**
     * Metodo constructor con parametros para inicializar los atributos.
     * @param string --titulo.
     * @param string2 -- autor.
     * @param n -- anio.
     */
    public Articulo(String string, String string2, int n) { 
        this.titulo = string;
        this.autor = string2;
        this.anio = n;
    }
    /**
     * Metodo para obtener el anio.
     * @return anio.
     */
    public int obtenerAnio() {
        return this.anio;
    }
    /**
     * Metodo para obtener el titulo.
     * @return titulo.
     */
    public String obtenerTitulo() {
        return this.titulo;
    }
    /**
     * Metodo para obtener el autor.
     * @return autor.
     */
    public String obtenerAutor() {
        return this.autor;
    }
    /**
     * Metodo para asignar el autor.
     * @param string -- autor.
     */
    public void asignarAutor(String string) {
        this.autor = string;
    }
    /** 
     * Metodo para asignar el titulo.
     * @param string -- titulo.
     */
    public void asignarTitulo(String string) {
        this.titulo = string;
    }
    /**
     * Metodo para asignar el anio.
     * @param n -- anio.
     */
    public void asignarAnio(int n) {
        this.anio = n;
    }
    /**
     * Metodo para obtener la cadena del articulo.
     * @return cadena del articulo.
     */ 
    public String toString() {
        return "***🔤Titulo" + this.titulo + "📅Anio:" + this.anio + "🙋Autor " + this.autor+ "***";
    }
}
