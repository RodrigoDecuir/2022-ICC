import java.util.Scanner;
/**
  * Clase pruba para la enumeracion de color
  * @see Color
  * @author Ramses Lopez
  * @version 1.0
  */
public class Colores {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Color c;
        String col;

        System.out.println("Elige unos de los siguientes colores: \n rojo, negro, azul, verde, amarillo, morado, rosa, blanco o cafe");

        col = in.nextLine();
        c = Color.valueOf(col.toUpperCase());

        switch (c) {
            case ROJO:
                System.out.println("\nElegiste el color de la sangre");
                break;
            case NEGRO:
                System.out.println("\nElegiste el color de la noche");
                break;
            case AZUL:
                System.out.println("\nElegiste el color del cielo");
                break;
            case VERDE:
                System.out.println("\nElegiste el color del pasto");
                break;
            case AMARILLO: 
                System.out.println("\nElegiste el color del sol solecito");
                break;
            case MORADO:
                System.out.println("\nElegiste el color del que te dejaron en el ojo");
                break;
            case ROSA:
                System.out.println("\nElegiste el color de las granadas");
                break;
            case BLANCO:
                System.out.println("\nElegiste el color de la pureza");
                break;
            case CAFE:
                System.out.println("\nElegiste el color del cafe");
                break;
        }
    }
}