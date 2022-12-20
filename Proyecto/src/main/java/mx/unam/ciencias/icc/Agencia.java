/**
 * Clase titular.
 * @author Rodrigo Andre Decuir Fuentes
 * @version 1.0
 */
package mx.unam.ciencias.icc;
import java.util.*;
public class Agencia {
    static Scanner in = new Scanner(System.in);
    //ATTRIBUTES
    private final static String FECHA_DE_SALIDA = "10 de Julio";
    private final static String FECHA_DE_REGRESO = "15 de Julio";
    private static int espacioTotalAvion = 50;
    private static int espacioTotalHabitacion = 15;
    static Hotel[] avionIda = new Hotel[50];
    static Hotel[] avionRegreso = new Hotel[50];
    static Hotel[] habitacionSencilla = new Hotel[5];
    static Hotel[] habitacionFamiliar = new Hotel[10];
    //objeto que contiene los arreglos de reservaciones
    static Reservacion reservaciones = new Reservacion(avionIda, avionRegreso, habitacionSencilla, habitacionFamiliar);
    //METHODS
    public Agencia() {//constructor para llenar los arreglos
        for(int i=0; i<avionIda.length; i++) {
            avionIda[i] = new Hotel(0,false,"ida");
        }
        for(int i=0; i<avionRegreso.length; i++) {
            avionRegreso[i] = new Hotel(0,false,"regreso");
        }
        for(int i=0; i<habitacionSencilla.length; i++) {
            habitacionSencilla[i] = new Hotel(0, false, "sencilla");
        }
        for(int i=0; i<habitacionFamiliar.length; i++) {
            habitacionFamiliar[i] = new Hotel(0, false, "familiar");
        }
    }
    public Agencia(boolean segundaVez) {
        //permite que para siguientes iteraciones se guarde el estado de las habitaciones
        //ya con esto recuperamos el estado de nuestros arreglos
        Utilidades ut = new Utilidades();
        //Leemos los objetos del archivo avionesIda.txt
        avionIda = ut.leerObjetosArchivoHotel("avionesIda.txt"); //cambiale el nombre al metodo jejeje
        avionRegreso = ut.leerObjetosArchivoHotel("avionesRegreso.txt");
        habitacionSencilla = ut.leerObjetosArchivoHotel("habitacionSencilla.txt");
        habitacionFamiliar = ut.leerObjetosArchivoHotel("habitacionFamiliar.txt");
    }
    public static String crearReservacion(String nombreDelTitular, int numeroDeAcompaniantes, int incluyeVuelo, int incluyeRegreso) {
        //Si el numero de huespedes ocupa una habitacion sencilla y no vuela:
        if(numeroDeAcompaniantes < 2 && numeroDeAcompaniantes > -1 && incluyeVuelo == 2 && incluyeRegreso == 2) {
            for (int i = 0; i < habitacionSencilla.length; i++) {
                if (!habitacionSencilla[i].getOcupado()) {
                    habitacionSencilla[i].setOcupado(true);
                    System.out.println("Habitacion Sencilla: " + i);
                    break;
                } else {
                    System.out.println("No hay habitaciones sencillas disponibles.");
                }
            }
            //Si el numero de huespedes ocupa una habitacion sencilla y si vuela, pero solo de ida:
        } else if(numeroDeAcompaniantes < 2 && numeroDeAcompaniantes > -1 && incluyeVuelo == 1 && incluyeRegreso == 2) {
            for(int i=0; i<habitacionSencilla.length; i++) {
                if(!habitacionSencilla[i].getOcupado()) {
                    habitacionSencilla[i].setOcupado(true);
                    System.out.println("Habitacion Sencilla: " + i);
                    break;
                } else {
                    System.out.println("No hay habitaciones sencillas disponibles.");
                }
            }
            for(int i=0; i<avionIda.length; i++) {
                if(!avionIda[i].getOcupado()) {
                    avionIda[i].setOcupado(true);
                    System.out.println("Asiento de ida: A" + i);
                    break;
                } else {
                    System.out.println("No hay lugares disponibles en el vuelo de ida.");
                }
            }
            //Si el numero de huespedes ocupa una habitacion sencilla y si vuela de ida y de regreso:
        } else if(numeroDeAcompaniantes < 2 && numeroDeAcompaniantes > -1 && incluyeVuelo == 1 && incluyeRegreso == 1) {
            for(int i=0; i<habitacionSencilla.length; i++) {
                if(!habitacionSencilla[i].getOcupado()) {
                    habitacionSencilla[i].setOcupado(true);
                    System.out.println("Habitacion Sencilla: " + i);
                    break;
                } else {
                    System.out.println("No hay habitaciones sencillas disponibles.");
                }
            }
            for(int i=0; i<avionIda.length; i++) {
                if(!avionIda[i].getOcupado()) {
                    avionIda[i].setOcupado(true);
                    System.out.println("Asiento de ida: A" + i);
                    break;
                } else {
                    System.out.println("No hay lugares disponibles en el vuelo de ida.");
                }
            }
            for(int i=0; i<avionRegreso.length; i++) {
                if(!avionRegreso[i].getOcupado()) {
                    avionRegreso[i].setOcupado(true);
                    System.out.println("Asiento de regreso: A"+ i);
                    break;
                } else {
                    System.out.println("No hay lugares disponibles en el vuelo de regreso.");
                }
            }
            //Si el numero de huespedes ocupa una habitacion familiar y no vuela:
        } else if(numeroDeAcompaniantes < 5 && numeroDeAcompaniantes > 1 && incluyeVuelo == 2 && incluyeRegreso == 2) {
            for(int i=0; i<habitacionFamiliar.length; i++) {
                if(!habitacionFamiliar[i].getOcupado()) {
                    habitacionFamiliar[i].setOcupado(true);
                    System.out.println("Habitacion Familiar: " + i);
                    break;
                } else {
                    System.out.println("No hay habitaciones familiares disponibles.");
                }
            }
            //Si el numero de huespedes ocupa una habitacion familiar y si vuela, pero solo de ida:
        } else if(numeroDeAcompaniantes < 5 && numeroDeAcompaniantes > 1 && incluyeVuelo == 1 && incluyeRegreso == 2) {
            for(int i=0; i<habitacionFamiliar.length; i++) {
                if(!habitacionFamiliar[i].getOcupado()) {
                    habitacionFamiliar[i].setOcupado(true);
                    System.out.println("Habitacion Sencilla: " + i);
                    break;
                } else {
                    System.out.println("No hay habitaciones familiares disponibles.");
                }
            }
            for(int i=0; i<avionIda.length; i++) {
                if(!avionIda[i].getOcupado()) {
                    avionIda[i].setOcupado(true);
                    System.out.println("Asiento de ida: A" + i);
                    break;
                } else {
                    System.out.println("No hay lugares disponibles en el vuelo de ida.");
                }
            }
            //Si el numero de huespedes ocupa una habitacion familiar y si vuela de ida y de regreso:
        } else if(numeroDeAcompaniantes < 5 && numeroDeAcompaniantes > 1 && incluyeVuelo == 1 && incluyeRegreso == 1) {
            for(int i=0; i<habitacionFamiliar.length; i++) {
                if(!habitacionFamiliar[i].getOcupado()) {
                    habitacionFamiliar[i].setOcupado(true);
                    System.out.println("Habitacion Familiar: " + i);
                    break;
                } else {
                    System.out.println("No hay habitaciones familiares disponibles.");
                }
            }
            for(int i=0; i<avionIda.length; i++) {
                if(!avionIda[i].getOcupado()) {
                    avionIda[i].setOcupado(true);
                    System.out.println("Asiento de ida: A" + i);
                    break;
                } else {
                    System.out.println("No hay lugares disponibles en el vuelo de ida.");
                }
            }
            for(int i=0; i<avionRegreso.length; i++) {
                if(!avionRegreso[i].getOcupado()) {
                    avionRegreso[i].setOcupado(true);
                    System.out.println("Asiento de regreso: A"+ i);
                    break;
                } else {
                    System.out.println("No hay lugares disponibles en el vuelo de regreso.");
                }
            }
        }
        //imprimir el numero de identificacion
        Reservacion reservacion = new Reservacion(nombreDelTitular, numeroDeAcompaniantes, habitacionSencilla[1], habitacionFamiliar[2], avionIda[3], avionRegreso[4]);
        //reservaciones[1] = reservacion;//guardamos la reservacion actual
        return "hola";
    }

    /*
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

    public static String consultarInformacionDelAvion() {}
        //trabaja con el arreglo reservaciones
     */
    //para guardar el estado de los arreglos:
    //se manda a llamar en el main cuando el usuario sale del programa
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
            System.out.print("Dame un numero --> ");
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
        System.out.println("1. Crear reservacion para el hotel “Tropical”.");
        System.out.println("2. Cancelar reservacion.");
        System.out.println("3. Buscar reservacion.");
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
                System.out.print("Nombre del titular de la reservacion --> ");
                String titular = in.nextLine();
                System.out.print("");
                System.out.print("Numero de acompaniantes del titular (0 a 4) --> ");
                int acompaniante = in.nextInt();
                System.out.print("");
                System.out.print("Incluye vuelos? 1.Si/2.No ---> ");
                int incluye = in.nextInt();
                int incluyeRegreso = 0;
                if(incluye == 1) {
                    System.out.println("VUELO DE IDA\nSelecciona uno de los asientos disponibles:");
                    //imprimir asientos de ida
                    System.out.print("");
                    System.out.print("Desea incluir el vuelo de regreso? 1.Si/2.No --> ");
                    incluyeRegreso = in.nextInt();
                    if(incluyeRegreso == 1) {
                        System.out.println("VUELO DE REGRESO\nSelecciona uno de los asientos disponibles:");
                        //imprimir asientos de regreso
                        //while huespedes > 0
                        //selecciona uno de los asientos disponibles
                    }
                }
                crearReservacion(titular, acompaniante, incluye, incluyeRegreso);
                break;
            case 2:
                System.out.println("Ingrese el numero de identificacion de la reservacion -->");
                String numId = in.nextLine();
                //revisar que el id coincida con una reservacion
                //reservaciones.cancelarReservacion(String numId);
                break;
            case 3:
                System.out.println("Ingrese el numero de identificacion de la reservacion -->");
                numId = in.nextLine();
                //Reservaciones.verMiReservacion(String numId);
                //reservaciones[i].toString();//imprime el id, titular, nAcompaniantes, precio total
                //imprimir si incluye vuelo
                //imprimir numero de asientos apartados en el vuelo de ida(en caso de que se incluyan)
                //imprimir numero de asientos apartados en el vuelo de regreso(en caso de que se incluyan)
                break;
            case 4:
                //reservaciones.verTodasLasReservaciones();
                break;
            case 5:
                //reservaciones.consultarHabitaciones(Hotel[] habitacionSencilla, Hotel[] habitacionFamiliar);
                break;
            case 6:
                //reservaciones.consultarInformacionDelAvion(Hotel[] avionIda, Hotel[] avionRegreso);
                break;
            case 7:
                System.out.println("Hasta luego");

                //guardamos los elementos de nuestros arreglos
                break;
            default:
                System.out.println("Opcion invalida. Ingresa un numero del 1 al 7.");
                break;
        }
    }

    public static void main(String[] args) {
        int operacion;
        //Reservacion[] reservaciones = new Reservacion[15];//Contiene todas las reservaciones
        do {//Muestra menu de opciones y pide seleccionar alguna mientras la opcion no sea salir del programa.
            menu();
            operacion = opcion();
            realizarAccion(operacion);
        } while(operacion != 7);
        //ya en el main solo se ve a cual de los dos constructores mandar a llamar,
        //se puede escribir en un auxiliar.txt la palabra "segunda vez"
        /*try {
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
        //*************************************************************
        //asegurarme de modificar el archivo auxiliar cuando el usuario cierre el programa:
        try {
            String str = "segunda vez";
            BufferedWriter writer = new BufferedWriter(new FileWriter("auxiliar.txt"));
            writer.write(str);
            writer.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
         */
    }
}