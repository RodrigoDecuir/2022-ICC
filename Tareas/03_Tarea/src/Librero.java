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
    /*revisar si se encuentra vacio*/
    public boolean vacio(int i) {
        boolean vacio = false; 
        if(librero[i] == null) {
            vacio = true;
        }
        return vacio;
    }        
    public int vacio2() {
        int vacio2 = 0;
        for(int i=0; i<librero.length; i++) {
            if(librero[i] == null) {
                vacio2 = i;
            }
        }
        return vacio2;
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
        } 
    }
    /*vaciar librero*/
    public void vaciarLibrero() {
        for(int i=0; i<librero.length; i++) {
            librero[i] = null; 
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
            } else {
                System.out.println("El librero se encuentra lleno");
            }
        }
    }
    /*eliminar un libro*/
    public void eliminarLibro(int n) {
        librero[n] = null;
    }
    /*compara numero de paginas*/
    public int compararPaginas(int ni, int numPag) {
        if(librero[ni].obtenerNumeroDePaginas() == numPag) {
           return 0;
        } else if(librero[ni].obtenerNumeroDePaginas() < numPag) { 
            return -1;
        } else {//caso: > (mayor estricto)
            return 1;
        }
    } 
    /*compara fecha de publicacion*/
    public int compararFecha(int n, int fecha) {
        if(librero[n].obtenerFechaDePublicacion() == fecha) {
            return 0;
        } else if(librero[n].obtenerFechaDePublicacion() < fecha) {
            return -1;
        } else {//caso: > (mayor estricto) 
            return 1;
        } 
    }
    /*buscar un libro(recursivo)*/
    /**
    * Metodo recursivo para localizar un dato en un arreglo ordenado, en este caso un libro
    * @param datos -- arreglo de enteros en donde esta el espacio de busqueda
    * @param inicio -- posicion inicial para la busqueda
    * @param fin -- posicion final para la busqueda
    * @param buscado -- elemento a buscar
    * @return int -- posicion del elemento encontrado o -1 si no esta
    */
    public int busquedaBinaria(/*Libro[] datos, */int n, int inicio, int fin, int buscado) {
        int mitad = (inicio + fin)/2; 
       /* if(inicio > fin) { 
            return 0;
        } else if(Librero.compararFecha(n, buscado) == -1) {// <
            return busquedaBinaria(n, mitad + 1, fin, buscado);
        } else if(Librero.compararFecha(n, buscado) == 1) {// >
            return busquedaBinaria(n, inicio, mitad - 1, buscado); 
        } else {
            return mitad; //Lo encontro
        }
       */
        return 12;
    }
    /*ordenar por numero de paginas(recursivo)*/
    public void ordenPorNumPag(int ne) { 
        //ITERATIVO 
        ne = librero.length;
        for(int i=ne-1; i>0; i--) {
            for(int j=0; j<i; j++) {
                if(compararPaginas(i, librero.length) == 1 && librero[j] != null) {
                    Libro temp = librero[ne];
                    librero[ne] = librero[ne+1];
                    librero[ne+1] = temp;
                } else {
                }
            }
        }
       
        //RECURSIVO
        //int n = datos.length;
       // if(n == 0) {//en caso de que 
       //    return librero[];
       // } //casoBase 
        
    }
    /*ordenar por fecha de publicacion(recursivo)*/
    public void ordenPorFecha() { 
        //RECURSIVO 
    }
    /*toString*/
    public String toString() {
        return "tuku wana min naku = que dice tu corazon?";
    }
}  
