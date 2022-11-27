/**
 * Clase para...
 * @author Rodrigo Andre Decuir Fuentes
 * @version 1.0
 */
import java.util.*;
public class Librero {
    /*ATRIBUTOS*/
    public Libro[] lili;//arreglo de libros 
    /*CONSTRUCTORES*/
    /**
     * Constructor para un librero vacio.
     */
    public Librero() {
        lili = new Libro[0]; 
    }
    /*METODOS*/
    /*acceso*/
/*
    public static Libro obtenerLibrero(Libro[] librero) {
        for(int i=0; i<librero.length; i++) {
            return librero[i].toString();
        }
    } 
*/
    /*modificacion*/
    public static void asignarLibrero() { 
                
    }
    /*llenar librero*/
/*
    public static void llenarLibrero() {
        for(int i=0; i< ?; i++) {
           librero[i] 
        } 
    }
*/
    /*vaciar librero*/
/*
    public static void vaciarLibrero() {
        for(int i=0; i< ?; i++) {
            librero[i]=;
        }
    }
*/
    /*agregar un libro*/
/*
    public static void agregarLibro() {
        for(int i=0; i < librero.length; i++) {
            if([i] != null) {
                [i] = ...;
                break;
            }
        }
    }
*/
    /*eliminar un libro*/
/*
    public static void eliminarLibro() {
        [n] = null;
    }
*/
    /*buscar un libro(recursivo)*/
    /**
    * Metodo recursivo para localizar un dato en un arreglo ordenado
    * @param datos -- arreglo de enteros en donde esta el espacio de busqueda
    * @param inicio -- posicion inicial para la busqueda
    * @param fin -- posicion final para la busqueda
    * @param buscado -- elemento a buscar
    * @return int -- posicion del elemento encontrado o -1 si no esta
    */
/*
    public int busquedaBinaria(int[] datos, int inicio, int fin, int buscado) {
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
/* 
    public int ordenamientoPorNumeroDePaginas() { 
    }
*/
    /*ordenar por fecha de publicacion(recursivo)*/
/*
    public int ordenamientoPorFecha() { 
    }
*/
    /*toString*/
/*
    public String toString() {
        return ;
    }
*/
    public static void main(String[]args) {
        
        Scanner in = new Scanner(System.in); 
        
    }
}  
