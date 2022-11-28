/**
 * Clase para...
 * @author Rodrigo Andre Decuir Fuentes
 * @version 1.0
 */
import java.util.*;
public class Librero {
     
    /*ATRIBUTOS*/
    private Libro[] coleccion;
    /*CONSTRUCTORES*/
    /**
     * Constructor para un librero vacio.
     */
    public Librero(int espacio) {
        coleccion = new Libro[espacio]; 
    }
    /*METODOS*/
    /*acceso*/
    public Libro[] obtenerLibrero() {
        return coleccion;     
    } 
    /*modificacion*/
    public void asignarElementos() { 
            
    }
    
    /*llenar librero*/
    public void llenarLibrero() {
        for(int i=0; i<coleccion.length; i++) {
            coleccion[i] = new Libro(); 
            coleccion[i].asignarTitulo("A cuerpo de gato");
            coleccion[i].asignarAutor("Hiro Arikawa");
            coleccion[i].asignarNumeroDePaginas(320);
            coleccion[i].asignarFechaDePublicacion(2017);
        } 
    }
    /*vaciar librero*/
    public void vaciarLibrero() {
        for(int i=0; i<coleccion.length; i++) {
            coleccion[i] = new Libro();
            coleccion[i].asignarTitulo(null);
            coleccion[i].asignarAutor(null);
            coleccion[i].asignarNumeroDePaginas(0);
            coleccion[i].asignarFechaDePublicacion(0);
        }
    }
    /*agregar un libro*/
    public void agregarLibro(String titulo, String autor, int numeroDePaginas, int fechaDePublicacion) {
        for(int i=0; i < coleccion.length; i++) {
            if(coleccion[i].obtenerTitulo() == null && coleccion[i].obtenerAutor() == null &&
               coleccion[i].obtenerNumeroDePaginas() == 0 && coleccion[i].obtenerFechaDePublicacion() == 0) {
                coleccion[i] = new Libro();
                coleccion[i].asignarTitulo(titulo);
                coleccion[i].asignarAutor(autor);
                coleccion[i].asignarNumeroDePaginas(numeroDePaginas);
                coleccion[i].asignarFechaDePublicacion(fechaDePublicacion);
                break;
            }
        }
    }
    /*eliminar un libro*/
    public void eliminarLibro(int n) {
        coleccion[n].asignarTitulo(null);
        coleccion[n].asignarAutor(null);
        coleccion[n].asignarNumeroDePaginas(0);
        coleccion[n].asignarFechaDePublicacion(0);
    }
    /*buscar un libro(recursivo)*/
    /**
    * Metodo recursivo para localizar un dato en un arreglo ordenado
    * @param datos -- arreglo de enteros en donde esta el espacio de busqueda
    * @param inicio -- posicion inicial para la busqueda
    * @param fin -- posicion final para la busqueda
    * @param buscado -- elemento a buscar
    * @return int -- posicion del elemento encontrado o -1 si no esta
    */

/*  public int busquedaBinaria(int[] datos, int inicio, int fin, int buscado) { */
//    public Libro busquedaBinaria(Libro[] coleccion, int coleccion[0], int coleccion.lastIndexOf(), Libro buscado) { //debe de buscar libros, no enteros 
/*
        int mitad = (inicio + fin)/2;
        if(inicio > fin) { 
            return false;
        } else if(datos[mitad] < buscado) {
            return busquedaBinaria(a, mitad + 1, fin, buscado);
        } else if(datos[mitad] > buscado) {
            return busquedaBinaria(a, inicio, mitad - 1, buscado);
        } else {
            return mitad; //Lo encontro
        }
    }
*/
    /*ordenar por numero de paginas(recursivo)*/
    public int ordenamientoPorNumeroDePaginas() { 
        return 10;  
    }
    /*ordenar por fecha de publicacion(recursivo)*/
    public int ordenamientoPorFecha() { 
        return 10; 
    }
    /*toString*/
    public String toString() {
        return "titulo y autor";
    }
}  
