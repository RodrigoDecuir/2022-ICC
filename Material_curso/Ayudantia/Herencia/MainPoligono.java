import java.util.Scanner;

/**
 * Clase principal para verificar el
 * funcionamiento de un Poligono Regular
 * @see PoligonoRegular
 * @see Cuadrado
 * @see Triangulo
 * @author Ramses Lopez Soto
 * @version 2.0
 */
public class MainPoligono {

 public static void main (String[] args) {

    Scanner in = new Scanner(System.in);

    PoligonoRegular cuadrado = new Cuadrado(5);
    PoligonoRegular triangulo = new Triangulo(7);

    System.out.println(cuadrado);
    System.out.println();
    System.out.println(triangulo);


 }
 
}