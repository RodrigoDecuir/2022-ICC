/**
 * Clase titular.
 * @author Rodrigo Andre Decuir Fuentes
 * @version 1.0
 */
package mx.unam.ciencias.icc;
import java.util.*;
public class Agencia {
    //ATTRIBUTES
    private String fechaDeSalida = "10 de Julio";
    private String fechaDeRegreso = "15 de Julio";

    //METHODS
    public static String crearReservacion(String nombreDelTitular, numeroDeAcompaniantes, int incluyeVuelo) {

    }
    public static void cancelarReservacion() {

    }
    public static confirmarVuelo() {

    }
    public static String buscarReservacion() {

    }
    public static String verTodasLasReservaciones() {

    }
    public static String consultarHabitaciones() {

    }
    public static String consultarInformacionDelAvion() {

    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        AvionIda[] ai = new AvionIda[50];
        AvionRegreso[] ar = new AvionRegreso[50];
        HabitacionSencilla[] hs = new HabitacionSencilla[5];
        SuiteFamiliar[] hf = new SuiteFamiliar[10];
        do {
            System.out.println("BIENVENIDO A LA AGENCIA PUMA-TOURS");
            System.out.println("Selecciona una de las siguientes opciones:");
            System.out.println("1. Crear reservación para el hotel “Tropical”.");
            System.out.println("2. Cancelar reservación.");
            System.out.println("3. Buscar reservación.");
            System.out.println("4. Ver todas las reservaciones.");
            System.out.println("5. Consultar el estatus de las habitaciones del hotel “Tropical”.");
            System.out.println("6. Consultar información del avión.");
            System.out.println("7. Salir del programa.");
            operacion = ;
            switch(operacion) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                default:
                    System.out.println("Opcion invalida. Ingresa un numero del 1 al 7.");
                break;
            }
        } while(operacion != 7);
    }
}
