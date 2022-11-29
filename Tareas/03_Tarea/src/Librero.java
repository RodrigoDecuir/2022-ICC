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
    public int comparar(Libro l1, Libro l2) {
        if(l1.getNumeroDePaginas() == l2.getNumeroDePaginas()) {
           return 0;
        } else if(l1.getNumeroDePaginas() < getNumeroDePaginas()) { 
            return -1;
        } else {
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
  /*  public int busquedaBinaria(Libro[] datos, int inicio, int fin, Libro buscado) {
   *  //implementar compare, buscar libros no enteros
        int mitad = (inicio + fin)/2; 
        if(inicio > fin) { 
            return false;
        } else if(Libro.compare(librero[mitad], buscado) == -1) {// <
            return busquedaBinaria(a, mitad + 1, fin, buscado);
        } else if(Libro.compare(librero[mitad], buscado) == 1) {// >
            return busquedaBinaria(a, inicio, mitad - 1, buscado); 
        } else {
            return mitad; //Lo encontro
        }
    }
   */
    
    /*ordenar por numero de paginas(recursivo)*/
    public void ordenPorNumPag(Libro[] datos/*, int n*/) { 
        //para hacer un bubble recursivo necesito un metodo compare que compare los titulos, o fechas, 
        //o los numeros de paginas o autores, lo mas conveniente es comparar por fecha de publicacion 
        //ITERATIVO 
        /*int n = datos.length;
        for(int i=n-1; i>0; i--) {
            for(int j=0; j<i; j++) {
                if(datos[j] > datos[j+1]) {
                    Libro temp = datos[j];
                    datos[j] = datos[j+1];
                    datos[j+1] = temp;
                }
            }
        }
       */
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
