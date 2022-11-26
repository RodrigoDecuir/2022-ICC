/**
 * Clase para...
 * @author Rodrigo Andre Decuir Fuentes
 * @version 1.0
 */
public class Libro {
    /*ATRIBUTOS*/
    private String titulo;
    private String autor;
    private int numeroDePaginas;
    private int fechaDePublicacion;
    /*CONSTRUCTORES*/
    /**
     * Constructor que inicializa un libro vacio.
     */
    public Libro() {
       titulo = null; 
       autor = null; 
       numeroDePaginas = 0;
       fechaDePublicacion = 0; 
    }
    /**
     * Constructor que inicializa un libro con parametros.
     * @param titulo -- titulo del libro. 
     * @param autor -- autor del libro. 
     * @param numeroDePaginas -- numero de paginas del libro.
     * @param fechaDePublicacion -- fecha de publicacion del libro.
     */ 
    public Libro(String titulo, String autor, int numeroDePaginas, int fechaDePublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroDePaginas = numeroDePaginas;
        this.fechaDePublicacion = fechaDePublicacion;
    }
    /*METODOS*/
    /*acceso*/
    /**
     * Metodo que obtiene el titulo de un libro.
     * @return String -- titulo del libro.
     */
    public String obtenerTitulo() { 
        return titulo; 
    }
    /**
     * Metodo que obtiene el autor de un libro.
     * @return String -- autor del libro.
     */
    public String obtenerAutor() {
        return autor; 
    }
    /**
     * Metodo que obtiene el numero de paginas de un libro.
     * @return int -- numero de paginas del libro.
     */
    public int obtenerNumeroDePaginas() {
        return numeroDePaginas; 
    } 
    /**
     * Metodo que obtiene la fecha de publicacion de un libro.
     * @return int -- fecha de publicacion del libro.
     */
    public int obtenerFechaDePublicacion() {
        return fechaDePublicacion; 
    }   
    /*modificacion*/
    /**
     * Metodo para asignar el titulo a un libro.
     * @param String -- nuevo titulo del libro.
     */
    public void asignarTitulo(String titulo) { 
        this.titulo = titulo;
    } 
    /**
     * Metodo para asignar el autor a un libro.
     * @param String -- nuevo autor del libro.
     */
    public void asignarAutor(String autor) {
        this.autor = autor;
    }
    /**
     * Metodo para asignar numero de paginas a un libro.
     * @param int -- nuevo numero de paginas del libro.
     */
    public void asignarNumeroDePaginas(int numeroDePaginas) {
        this.numeroDePaginas = numeroDePaginas;
    }
    /**
     * Metodo para asignar fecha de publicacion a un libro.
     * @param int -- nueva fecha de publicacion del libro.
     */
    public void asignarFechaDePublicacion(int fechaDePublicacion) {
        this.fechaDePublicacion = fechaDePublicacion; 
    }
    /*toString*/
    /**
     * Metodo que devuelve la informacion de un libro.
     * @return string -- informacion del libro.
     */
    public String toString() {
        return "Titulo: " + titulo + "\n" +
               "Autor: " + autor + "\n" + 
               "N. pag: " + numeroDePaginas + "\n" + 
               "Fecha de publicacion: " + fechaDePublicacion;  
    }
}  
