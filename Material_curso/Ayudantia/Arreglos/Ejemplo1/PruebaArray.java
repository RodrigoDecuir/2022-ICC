/**
  * Clase para probar la clase Array
  * @see Array
  * @author Ramses Lopez 
  * @version 2.0
  */
public class PruebaArray {

    public static void main(String[] args) {

        Array array1 = new Array(10);
        Array array2 = new Array(10);
        Array array3 = new Array(array1);
        Array array4 = new Array(6);

        System.out.println();

        System.out.println("Arreglo 1: " + array1);
        System.out.println("Arreglo 2: " + array2);
        System.out.println("Arreglo 3: " + array3);
        System.out.println("Arreglo 4: " + array4);

        System.out.println();

        System.out.println("Llenamos el arreglo 1 y 4: ");
        array1.llenar(5);
        array4.llenar();
        System.out.println("Arreglo 1: " + array1);
        System.out.println("Arreglo 2: " + array2);
        System.out.println("Arreglo 3: " + array3);
        System.out.println("Arreglo 4: " + array4);

        System.out.println();

        System.out.println("Revisamos si los arreglos son iguales:");
        System.out.println("Arreglo 1 igual al arreglo 2? " + array1.sonIguales(array2.obtenerEnteros()));
        System.out.println("Arreglo 1 igual al arreglo 3? " + array1.sonIguales(array3.obtenerEnteros()));
        System.out.println("Arreglo 1 igual al arreglo 4? " + array1.sonIguales(array4.obtenerEnteros()));

        System.out.println();

        System.out.println("Invertivos el Arreglo 4: ");
        array4.invertir();
        System.out.println(array4);

        System.out.println();

        System.out.println("Obtenemos el promedio del Arreglo 1 y Arreglo 4: ");
        System.out.println("Arreglo 1: " + array1.promedio());
        System.out.println("Arreglo 4: " + array4.promedio());

        System.out.println();

        System.out.println("Buscamos el elemento 3 en los Arreglos: ");
        System.out.println("Arreglo 1: " + array1.buscar(3));
        System.out.println("Arreglo 2: " + array2.buscar(3));
        System.out.println("Arreglo 3: " + array3.buscar(3));
        System.out.println("Arreglo 4: " + array4.buscar(3));
        
        


    }
}