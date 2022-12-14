/**
 * Clase para...
 * @author Rodrigo Andre Decuir Fuentes
 * @version 1.0
 */

import java.util.*;

public class UsoTortugaMecanica {
    public static void main(Sring[] args) {
        Scanner in = new Scanner(System.in);
        String[][] tablero = new String[15][15];
        TortugaMecanica tm = new TortugaMecanica();
         
        System.out.println("-----Bienvenido-----");
        System.out.println("🐢🖋️🐢A la tortuga mecanica🐢🖋️🐢");

        int valor = 0; 
        while (valor != 8) {

            System.out.println("\nTortugaMecanica");
            System.out.println("1. Bajar pluma");
            System.out.println("2. Subir pluma");
            System.out.println("3. Desplazamiento hacia arriba");
            System.out.println("4. Desplazamiento hacia abajo");
            System.out.println("5. Desplazamiento hacia la izquierda");
            System.out.println("6. Desplazamiento hacia la derecha");
            System.out.println("7. Imprimir tablero");
            System.out.println("8. Salir");
            System.out.println("Seleccione la opcion--> ");
            valor = entrada.nextInt(); 
        
            Switch(valor) {
                case 1:
                    System.out.println("hola"); 

                    break;
                case 2:
                    System.out.println("hola");

                    break;
                case 3:
                    System.out.println("Ingresa el numero de casillas a desplazar-->");

                    break;
                case 4:
                    System.out.println("Ingresa el numero de casillas a desplazar-->");

                    break;
                case 5:
                    System.out.println("Ingresa el numero de casillas a desplazar-->");

                    break;
                case 6:
                    System.out.println("Ingresa el numero de casillas a desplazar-->");

                    break;
                case 7:
                    System.out.println("hola");  

                    break;
                case 8:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opcion invalida");
            }
        }
    }
}
