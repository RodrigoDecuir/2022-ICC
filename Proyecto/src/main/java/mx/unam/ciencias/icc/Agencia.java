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
    private int espacioTotalAvion = 50;//para tener mas control en cada arreglo
    private int espacioTotalHabitacion = 15;//para tener mas control en cada arreglo
    //METHODS
    public static String crearReservacion(String nombreDelTitular, int numeroDeAcompaniantes, int incluyeVuelo, int incluyeRegreso) {
        //Si el numero de huespedes ocupa una habitacion sencilla y no vuela:
        if(numeroDeAcompaniantes < 2 && numeroDeAcompaniantes > -1 && incluyeVuelo == 2 && incluyeRegreso == 2) {
            for(int i=0; i<habitacionSencilla.length(); i++) {
                if(habitacionSencilla[i].getOcupado == false) {
                    habitacionSencilla[i].setOcupado(true);
                    System.out.println("Habitacion: " + i);
                    break;
                } else {
                    System.out.println("No hay habitaciones sencillas disponibles.");
                }
            }
            //Si el numero de huespedes ocupa una habitacion sencilla y si vuela, pero solo de ida:
        } else if(numeroDeAcompaniantes < 2 && numeroDeAcompaniantes > -1 && incluyeVuelo == 1 && incluyeRegreso == 2) {
            for(int i=0; i<habitacionSencilla.length(); i++) {
                if(habitacionSencilla[i].getOcupado == false) {
                    habitacionSencilla[i].setOcupado(true);
                    System.out.println("Habitacion: " + i);
                    break;
                } else {
                    System.out.println("No hay habitaciones sencillas disponibles.");
                }
            }
            for(int i=0; i<avionIda.length(); i++) {
                if(avionIda[i].getOcupado == false) {
                    avionIda[i].setOcupado(true);
                    System.out.println("Asiento de ida: A" + i);
                    break;
                } else {
                    System.out.println("No hay lugares disponibles en el vuelo de ida.");
                }
            }
            //Si el numero de huespedes ocupa una habitacion sencilla y si vuela de ida y de regreso:
        } else if(numeroDeAcompaniantes < 2 && numeroDeAcompaniantes > -1 && incluyeVuelo == 1 && incluyeRegreso == 1) {
            for(int i=0; i<habitacionSencilla.length(); i++) {
                if(habitacionSencilla[i].getOcupado == false) {
                    habitacionSencilla[i].setOcupado(true);
                    System.out.println("Habitacion: " + i);
                    break;
                } else {
                    System.out.println("No hay habitaciones sencillas disponibles.");
                }
            }
            for(int i=0; i<avionIda.length(); i++) {
                if(avionIda[i].getOcupado == false) {
                    avionIda[i].setOcupado(true);
                    System.out.println("Asiento de ida: A" + i);
                    break;
                } else {
                    System.out.println("No hay lugares disponibles en el vuelo de ida.");
                }
            }
            for(int i=0; i<avionRegreso.length(); i++) {
                if(avionRegreso[i].getOcupado == false) {
                    avionRegreso[i].setOcupado(true);
                    System.out.println("Asiento: A"+ i);
                    break;
                } else {
                    System.out.println("No hay lugares disponibles en el vuelo de ida.");
                }
            }
        }
        if(numeroDeAcompaniantes < 5 && numeroDeAcompaniantes > 1 && incluyeVuelo == 2 && incluyeRegreso == 2) {
            for(int i=0; i<habitacionSencilla.length(); i++) {
                if(habitacionSencilla[i].getOcupado == false) {
                    habitacionSencilla[i].setOcupado(true);
                    System.out.println("Habitacion: " + i);
                    break;
                } else {
                    System.out.println("No hay habitaciones sencillas disponibles.");
                }
            }
            //Si el numero de huespedes ocupa una habitacion sencilla y si vuela, pero solo de ida:
        } else if(numeroDeAcompaniantes < 5 && numeroDeAcompaniantes > 1 && incluyeVuelo == 1 && incluyeRegreso == 2) {
            for(int i=0; i<habitacionFamiliar.length(); i++) {
                if(habitacionFamiliar[i].getOcupado == false) {
                    habitacionFamiliar[i].setOcupado(true);
                    System.out.println("Habitacion: " + i);
                    break;
                } else {
                    System.out.println("No hay habitaciones sencillas disponibles.");
                }
            }
            for(int i=0; i<avionIda.length(); i++) {
                if(avionIda[i].getOcupado == false) {
                    avionIda[i].setOcupado(true);
                    System.out.println("Asiento de ida: A" + i);
                    break;
                } else {
                    System.out.println("No hay lugares disponibles en el vuelo de ida.");
                }
            }
            //Si el numero de huespedes ocupa una habitacion sencilla y si vuela de ida y de regreso:
        } else if(numeroDeAcompaniantes < 5 && numeroDeAcompaniantes > 1 && incluyeVuelo == 1 && incluyeRegreso == 1) {
            for(int i=0; i<habitacionFamiliar.length(); i++) {
                if(habitacionFamiliar[i].getOcupado == false) {
                    habitacionFamiliar[i].setOcupado(true);
                    System.out.println("Habitacion: " + i);
                    break;
                } else {
                    System.out.println("No hay habitaciones sencillas disponibles.");
                }
            }
            for(int i=0; i<avionIda.length(); i++) {
                if(avionIda[i].getOcupado == false) {
                    avionIda[i].setOcupado(true);
                    System.out.println("Asiento de ida: A" + i);
                    break;
                } else {
                    System.out.println("No hay lugares disponibles en el vuelo de ida.");
                }
            }
            for(int i=0; i<avionRegreso.length(); i++) {
                if(avionRegreso[i].getOcupado == false) {
                    avionRegreso[i].setOcupado(true);
                    System.out.println("Asiento: A"+ i);
                    break;
                } else {
                    System.out.println("No hay lugares disponibles en el vuelo de ida.");
                }
            }
        }

        Reservacion reservacion = new Reservacion(String nombreDelTitular, int numeroDeAcompaniantes, hs[i], hf[i], ai[i], ar[i]);//null en caso de que no se reservara algo
        Reservacion[] reservaciones = new Reservaciones[15];//arreglo que contiene todas las reservaciones
        reservaciones[1] = reservacion;//guardamos la reservacion actual
    }
    public static void cancelarReservacion(String id) {

    }
    public static String buscarReservacion() {

    }
    public static String verTodasLasReservaciones() {

    }
    public static String consultarHabitaciones() {

    }
    public static String consultarInformacionDelAvion() {

    }
    /**
     Metodo para solicitar un opcion, leerla y verificar que sea un numero entero.
     @return int -- opcion seleccionada.
     */
    public static int opcion() {
        Scanner scan = new Scanner(System.in);
        int numero = -1;
        do {
            System.out.println("Dame un numero -->");
            try {
                numero = scan.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Valor invalido. Pasa un numero entero.");
                scan.nextInt();
            }
        } while(numero == -1);
        return numero;
    }
    /**
     Menu de opciones para trabajar con una reservacion.
     */
    public static void menu() {
        System.out.println("BIENVENIDO A LA AGENCIA PUMA-TOURS");
        System.out.println("Selecciona una de las siguientes opciones:");
        System.out.println("1. Crear reservación para el hotel “Tropical”.");
        System.out.println("2. Cancelar reservación.");
        System.out.println("3. Buscar reservación.");
        System.out.println("4. Ver todas las reservaciones.");
        System.out.println("5. Consultar el estatus de las habitaciones del hotel “Tropical”.");
        System.out.println("6. Consultar información del avión.");
        System.out.println("7. Salir del programa.");
    }
    /**
     Metodo para realizar las acciones del menu.
     @param opcion - opcion elegida por el usuario.
     */
    public static void realizarAccion(int opcion){
        switch(opcion) {
            case 1:
                String titular = in.nextLine();
                System.out.println("Nombre del titular de la reservacion -->");
                int acompaniante = in.nextInt();
                System.out.println("Numero de acompaniantes del titular (0 a 4) -->");
                int incluye = in.nextInt();
                System.out.println("Incluye vuelos? 1.Si/2.No --->");
                int incluyeRegreso = 0;
                if(incluye == 1) {
                    incluyeRegreso = in.nextInt();
                    System.out.println("Desea incluir el vuelo de regreso? 1.Si/2.No");
                }
                crearReservacion(String titular, int acompaniante, int incluye, int incluyeRegreso);
                break;
            case 2:
                System.out.println("Ingrese el numero de identifiacion de la reservacion -->")
                String numId = in.nextLine();
                Reservaciones.cancelarReservacion(String numId);
                break;
            case 3:
                System.out.println("Ingrese el numero de identificacion de la reservacion -->")
                String numId = in.nextLine();
                Reservaciones.buscarReservacion(String numId);
                Reservacion[i].toString();//imprime el id, titular, nacompaniantes, precio total
                //imprimir si incluye vuelo
                //imprimir numero de asientos apartados en el vuelo de ida(en caso de que se incluyan)
                //imprimir numero de asientos apartados en el vuelo de regreso(en caso de que se incluyan)
                break;
            case 4:
                //for(int...)//muestra lo mismo que el 3 pero para todas las reservaciones que se tengan registradas
                Reservaciones.verTodasLasReservaciones();//no recibe
                break;
            case 5:
                //for...
                //   if()
                consultarHabitaciones();//no recibe
                break;
            case 6:
                //for
                consultarInformacionDelAvion();//no recibe
                break;
            case 7:
                //guardamos los elementos de nuestros arreglos

                System.out.println("Hasta luego");
                break;
            default:
                System.out.println("Opcion invalida. Ingresa un numero del 1 al 7.");
                break;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int operacion;
        Hotel[] avionIda = new Hotel[50];
        Hotel[] avionRegreso = new Hotel[50];
        Hotel[] habitacionSencilla = new Hotel[5];
        Hotel[] habitacionFamiliar = new Hotel[10];
        do {//Muestra menu de opciones y pide seleccionar alguna
            menu();
            operacion = opcion();
            realizarAccion(operacion);
        } while(operacion != 7);
    }
}
