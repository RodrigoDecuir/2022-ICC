/**
 * Clase para implementar la clase Libro.
 * @author Rodrigo Andre Decuir Fuentes
 * @version 1.0
 */
import java.util.*;
import java.util.Comparator;
public class Librero {
    /*ATRIBUTOS*/
    private Libro[] librero;
    /*CONSTRUCTORES*/
    /**
     * Constructor para un librero vacio.
     */
    public Librero(int n) {
        librero = new Libro[n]; 
    }
    /*METODOS*/
    /*acceso*/
    public Libro[] obtenerLibrero() {
        return librero;     
    } 
    /*modificacion*/
    /*public void asignarElementos() { 
               
    }
    */
    public boolean vacio(int i) {
        boolean vacio = false; 
        if(librero[i] == null) {
            vacio = true;
        }
        return vacio;
    }        
    public void asignarT(int i, String titulo) {
        librero[i].asignarTitulo(titulo);
    }
    public void asignarA(int i, String autor) {
        librero[i].asignarAutor(autor);
    }
    public void asignarNp(int i, int np) {
        librero[i].asignarNumeroDePaginas(np);
    }
    public void asignarFp(int i, int fp) {
        librero[i].asignarFechaDePublicacion(fp);
    }
    
    /*visualizar librero*/
    public void visualizar() {
        System.out.println("++++++++++");
        for (int i=0; i<librero.length; i++) {
            System.out.println("LIBRO: "+i+". \nCONTENIDO:\n"+librero[i]+",\n");
        }
        System.out.print("++++++++++");
    } 
    /*llenar librero*/
    public void llenarLibrero() {
        for(int i=0; i<librero.length; i++) {
            librero[i] = new Libro(); 
            /*coleccion[i].asignarTitulo("A cuerpo de gato");
            coleccion[i].asignarAutor("Hiro Arikawa");
            coleccion[i].asignarNumeroDePaginas(320);
            coleccion[i].asignarFechaDePublicacion(2017);
            */
        } 
    }
    /*vaciar librero*/
    public void vaciarLibrero() {
        for(int i=0; i<librero.length; i++) {
            librero[i] = null; 
           /* coleccion[i] = new Libro();
            coleccion[i].asignarTitulo(null);
            coleccion[i].asignarAutor(null);
            coleccion[i].asignarNumeroDePaginas(0);
            coleccion[i].asignarFechaDePublicacion(0);
           */ 
        }
    }
    /*agregar un libro*/
    public void agregarLibro(String titulo, String autor, int numeroDePaginas, int fechaDePublicacion) {
        for(int i=0; i < librero.length; i++) {
            if(librero[i] == null) {
                librero[i] = new Libro();
                librero[i].asignarTitulo(titulo);
                librero[i].asignarAutor(autor);
                librero[i].asignarNumeroDePaginas(numeroDePaginas);
                librero[i].asignarFechaDePublicacion(fechaDePublicacion);
                break;
            }
        }
    }
    /*eliminar un libro*/
    public void eliminarLibro(int n) {
        librero[n] = null;
       /* coleccion[n].asignarTitulo(null);
        coleccion[n].asignarAutor(null);
        coleccion[n].asignarNumeroDePaginas(0);
        coleccion[n].asignarFechaDePublicacion(0);
       */ 
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
