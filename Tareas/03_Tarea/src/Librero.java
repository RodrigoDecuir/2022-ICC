/**
 * Clase para...
 * @author Rodrigo Andre Decuir Fuentes
 * @version 1.0
 */
public class Librero {
            
    /*ATRIBUTOS*/
       
    /*CONSTRUCTORES*/
        
    /*METODOS*/
    /*acceso*/
        
    /*modificacion*/
        
    /*llenar librero*/

    /*vaciar librero*/

    /*agregar un libro*/

    /*eliminar un libro*/

    /*buscar un libro(recursivo)*/
    /**
    * Metodo recursivo para localizar un dato en un arreglo ordenado
    * @param datos -- arreglo de enteros en donde esta el espacio de busqueda
    * @param inicio -- posicion inicial para la busqueda
    * @param fin -- posicion final para la busqueda
    * @param buscado -- elemento a buscar
    * @return int -- posicion del elemento encontrado o -1 si no esta
    */
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

    /*ordenar por numero de paginas(recursivo)*/
        
    /*ordenar por fecha de publicacion(recursivo)*/

    /*toString*/

    public static void main(String[]args) {
    
    }

}  
