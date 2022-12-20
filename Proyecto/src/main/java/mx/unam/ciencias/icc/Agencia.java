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
    private int espacioTotalAvion = 50;
    private int espacioTotalHabitacion = 15;
    //METHODS
    public class Agencia(){
        Hotel[] avionIda = new Hotel[50];
        Hotel[] avionRegreso = new Hotel[50];
        Hotel[] habitacionSencilla = new Hotel[5];
    }
    public class Agencia() {
        for(int i; i<avionida.length; i++){

            avionIda[i] = new Hotel(0,false,"ida");

        }
        for(int i; i<avionida.length; i++){
            avionRegreso[i] = new Hotel(0,false,"regreso");
        }
    }
    public class Agencia(boolean segundaVez) {
        Utilidades ut = new Utilidades();
        //Leemos los objetos del archivo avionesIda.txt
        avionIda = ut.leerObjetosArchivoLibro("avionesIda.txt"); //cambiale el nombre al metodo jejeje
        avionRegreso = ut.leerObjetosArchivoLibro("avionesRegreso.txt");
    }
    //public class Agencia(){
        //llenar los arreglos
    //}
    public static String crearReservacion(String nombreDelTitular, int numeroDeAcompaniantes, int incluyeVuelo,
                                          int incluyeRegreso, Hotel[] habitacionSencilla, Hotel[] habitacionFamiliar,
                                          Hotel[] avionIda, Hotel[] avionRegreso) {
        //Si el numero de huespedes ocupa una habitacion sencilla y no vuela:
        if(numeroDeAcompaniantes < 2 && numeroDeAcompaniantes > -1 && incluyeVuelo == 2 && incluyeRegreso == 2) {
            for(int i=0; i<habitacionSencilla.length(); i++) {
                if(habitacionSencilla[i].getOcupado() == false) {
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
                if(habitacionSencilla[i].getOcupado() == false) {
                    habitacionSencilla[i].setOcupado(true);
                    System.out.println("Habitacion: " + i);
                    break;
                } else {
                    System.out.println("No hay habitaciones sencillas disponibles.");
                }
            }
            for(int i=0; i<avionIda.length(); i++) {
                if(avionIda[i].getOcupado() == false) {
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
                if(habitacionSencilla[i].getOcupado() == false) {
                    habitacionSencilla[i].setOcupado(true);
                    System.out.println("Habitacion: " + i);
                    break;
                } else {
                    System.out.println("No hay habitaciones sencillas disponibles.");
                }
            }
            for(int i=0; i<avionIda.length(); i++) {
                if(avionIda[i].getOcupado() == false) {
                    avionIda[i].setOcupado(true);
                    System.out.println("Asiento de ida: A" + i);
                    break;
                } else {
                    System.out.println("No hay lugares disponibles en el vuelo de ida.");
                }
            }
            for(int i=0; i<avionRegreso.length(); i++) {
                if(avionRegreso[i].getOcupado() == false) {
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
                if(habitacionSencilla[i].getOcupado() == false) {
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
                if(habitacionFamiliar[i].getOcupado() == false) {
                    habitacionFamiliar[i].setOcupado(true);
                    System.out.println("Habitacion: " + i);
                    break;
                } else {
                    System.out.println("No hay habitaciones sencillas disponibles.");
                }
            }
            for(int i=0; i<avionIda.length(); i++) {
                if(avionIda[i].getOcupado() == false) {
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
                if(habitacionFamiliar[i].getOcupado() == false) {
                    habitacionFamiliar[i].setOcupado(true);
                    System.out.println("Habitacion: " + i);
                    break;
                } else {
                    System.out.println("No hay habitaciones sencillas disponibles.");
                }
            }
            for(int i=0; i<avionIda.length(); i++) {
                if(avionIda[i].getOcupado() == false) {
                    avionIda[i].setOcupado(true);
                    System.out.println("Asiento de ida: A" + i);
                    break;
                } else {
                    System.out.println("No hay lugares disponibles en el vuelo de ida.");
                }
            }
            for(int i=0; i<avionRegreso.length(); i++) {
                if(avionRegreso[i].getOcupado() == false) {
                    avionRegreso[i].setOcupado(true);
                    System.out.println("Asiento: A"+ i);
                    break;
                } else {
                    System.out.println("No hay lugares disponibles en el vuelo de ida.");
                }
            }
        }
        Reservacion reservacion = new Reservacion(String nombreDelTitular,; int numeroDeAcompaniantes, Hotel[1] habitacionSencilla, Hotel[2] habitacionFamiliar, Hotel[10] avionIda, Hotel[1] avionRegreso);//null en caso de que no se reservara algo
        reservaciones[1] = reservacion;//guardamos la reservacion actual
    }
    public static void cancelarReservacion(String id) {
        //trabaja con el arreglo reservaciones
    }
    public static String verMiReservacion(String id) {
        //trabaja con el arreglo reservaciones
    }
    public static String verTodasLasReservaciones() {
        //trabaja con el arreglo reservaciones
    }
    public static String consultarHabitaciones() {
        //trabaja con el arreglo reservaciones
    }
    public static String consultarInformacionDelAvion() {
        //trabaja con el arreglo reservaciones
    }
    public static void guardamosEstado() {
        Utilidades ut = new Utilidades();
        ut.EscribirObjetosArchivo("avionesIda.txt", avionIda);
        ut.EscribirObjetosArchivo("avionesRegreso.txt", avionRegreso);
        ut.EscribirObjetosArchivo("habitacionesSencillas.txt", habitacionSencilla);
        ut.EscribirObjetosArchivo("habitacionFamiliar.txt", habitacionFamiliar);
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
                Reservaciones.verMiReservacion(String numId);
                Reservaciones[i].toString();//imprime el id, titular, nAcompaniantes, precio total
                //imprimir si incluye vuelo
                //imprimir numero de asientos apartados en el vuelo de ida(en caso de que se incluyan)
                //imprimir numero de asientos apartados en el vuelo de regreso(en caso de que se incluyan)
                break;
            case 4:
                Reservaciones.verTodasLasReservaciones();
                break;
            case 5:
                consultarHabitaciones(Hotel[] habitacionSencilla, Hotel[] habitacionFamiliar);
                break;
            case 6:
                consultarInformacionDelAvion(Hotel[] avionIda, Hotel[] avionRegreso);
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
        Reservacion[] reservaciones = new Reservacion[15];//Contiene todas las reservaciones
        do {//Muestra menu de opciones y pide seleccionar alguna mientras la opcion no sea salir del programa.
            menu();
            operacion = opcion();
            realizarAccion(operacion);
        } while(operacion != 7);
        try {
            reader = new BufferedReader(new FileReader("auxiliar.txt"));
            String line = reader.readLine();
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        //Aqui vemos a cual de los constructores llamar
        if(line.equals("segunda vez")) {
            Agencia a = new Agencia(true);
        } else {
            Agencia a = new Agencia();
        }
        //modificar el archivo auxiliar cuando el usuario cierre el programa
        try {
            String str = "segunda vez";
            BufferedWriter writer = new BufferedWriter(new FileWriter("auxiliar.txt"));
            writer.write(str);
            writer.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
