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
    static Reservacion[] reservaciones2 = new Reservacion[0];
    static Agencia miAgencia;
    //METHODS
    /**
     * Metodo para llenar los arreglos.
      */
    public Agencia() {
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

    /**
     * Metodo para guardar el estado en las siguientes iteraciones.
     * Permite recuperar el estado de los arreglos.
     * @param segundaVez verifica si no es la primera iteracion.
     */
    public Agencia(boolean segundaVez) {
        Utilidades ut = new Utilidades();
        avionIda = ut.leerObjetosArchivoHotel("avionesIda.txt");
        avionRegreso = ut.leerObjetosArchivoHotel("avionesRegreso.txt");
        habitacionSencilla = ut.leerObjetosArchivoHotel("habitacionSencilla.txt");
        habitacionFamiliar = ut.leerObjetosArchivoHotel("habitacionFamiliar.txt");
        //reservaciones2 = ut.leerObjetosArchivoReservaciones("reservaciones.txt");//recuperar el estado del arreglo
    }

    /**
     * Metodo para crear una reservacion.
     * @return identificacion de reservacion generada con datos de dicha reservacion.
     */
    public static String crearReservacion() {
        Hotel senci = null;
        Hotel fami = null;
        Hotel vueloIda = null;
        Hotel vueloRegreso = null;
        System.out.print("\nNombre del titular de la reservacion --> ");
        String titular = in.nextLine();
        System.out.print("");
        System.out.print("Numero de acompaniantes del titular (0 a 4) --> ");
        int acompaniante = in.nextInt();
        System.out.print("");
        System.out.print("Incluye vuelos? 1.Si/2.No ---> ");
        int incluye = in.nextInt();
        int incluyeRegreso = 0;
        int huespedes = acompaniante + 1;
        if(incluye == 1) {
            System.out.println("VUELO DE IDA\nSelecciona uno de los asientos disponibles:");
                int c = 1;
                while(huespedes+1 > c) {
                    for(int i=1; i<avionIda.length+1; i++) {
                        if(i<25) {
                            System.out.print("A" + i + " ");
                        } else if(i==27) {
                            System.out.println("");
                            System.out.print("A" + i + " ");
                        } else {
                            System.out.print("A" + i + " ");
                        }
                    }
                    System.out.println("");
                    System.out.print("Asiento no." + c + " --> ");
                    int asientoIda = in.nextInt();
                    c++;
                }
            System.out.print("Desea incluir el vuelo de regreso? 1.Si/2.No --> ");
            incluyeRegreso = in.nextInt();
            if(incluyeRegreso == 1) {
                System.out.println("VUELO DE REGRESO\nSelecciona uno de los asientos disponibles:");
                    int e = 1;
                    while(huespedes+1 > e) {
                        for(int i=1; i<avionRegreso.length+1; i++) {
                            if(i<25) {
                                System.out.print("A" + i + " ");
                            } else if(i==27){
                                System.out.println("");
                                System.out.print("A" + i + " ");
                            } else {
                                System.out.print("A" + i + " ");
                            }
                        }
                        System.out.println("");
                        System.out.print("Asiento no." + e + " --> ");
                        int asientoRegreso = in.nextInt();
                        e++;
                    }
            }
        }
        //Si el numero de huespedes ocupa una habitacion sencilla y no vuela:
        if(acompaniante < 2 && acompaniante > -1 && incluye == 2 && incluyeRegreso == 2) {
            for (int i = 0; i < habitacionSencilla.length; i++) {
                if (!habitacionSencilla[i].getOcupado()) {
                    habitacionSencilla[i].setOcupado(true);
                    senci = habitacionSencilla[i];
                    System.out.println("Habitacion Sencilla: " + i);
                    break;
                } else {
                    System.out.println("No hay habitaciones sencillas disponibles.");
                }
            }
            //Si el numero de huespedes ocupa una habitacion sencilla y si vuela, pero solo de ida:
        } else if(acompaniante < 2 && acompaniante > -1 && incluye == 1 && incluyeRegreso == 2) {
            for(int i=0; i<habitacionSencilla.length; i++) {
                if(!habitacionSencilla[i].getOcupado()) {
                    habitacionSencilla[i].setOcupado(true);
                    senci = habitacionSencilla[i];
                    System.out.println("Habitacion Sencilla: " + i);
                    break;
                } else {
                    System.out.println("No hay habitaciones sencillas disponibles.");
                }
            }
            for(int i=0; i<avionIda.length; i++) {
                if(!avionIda[i].getOcupado()) {
                    avionIda[i].setOcupado(true);
                    vueloIda = avionIda[i];
                    System.out.println("Asiento de ida: A" + i);
                    break;
                } else {
                    System.out.println("No hay lugares disponibles en el vuelo de ida.");
                }
            }
            //Si el numero de huespedes ocupa una habitacion sencilla y si vuela de ida y de regreso:
        } else if(acompaniante < 2 && acompaniante > -1 && incluye == 1 && incluyeRegreso == 1) {
            for(int i=0; i<habitacionSencilla.length; i++) {
                if(!habitacionSencilla[i].getOcupado()) {
                    habitacionSencilla[i].setOcupado(true);
                    senci = habitacionSencilla[i];
                    System.out.println("Habitacion Sencilla: " + i);
                    break;
                } else {
                    System.out.println("No hay habitaciones sencillas disponibles.");
                }
            }
            for(int i=0; i<avionIda.length; i++) {
                if(!avionIda[i].getOcupado()) {
                    avionIda[i].setOcupado(true);
                    vueloIda = avionIda[i];
                    System.out.println("Asiento de ida: A" + i);
                    break;
                } else {
                    System.out.println("No hay lugares disponibles en el vuelo de ida.");
                }
            }
            for(int i=0; i<avionRegreso.length; i++) {
                if(!avionRegreso[i].getOcupado()) {
                    avionRegreso[i].setOcupado(true);
                    vueloRegreso = avionRegreso[i];
                    System.out.println("Asiento de regreso: A"+ i);
                    break;
                } else {
                    System.out.println("No hay lugares disponibles en el vuelo de regreso.");
                }
            }
            //Si el numero de huespedes ocupa una habitacion familiar y no vuela:
        } else if(acompaniante < 5 && acompaniante > 1 && incluye == 2 && incluyeRegreso == 2) {
            for(int i=0; i<habitacionFamiliar.length; i++) {
                if(!habitacionFamiliar[i].getOcupado()) {
                    habitacionFamiliar[i].setOcupado(true);
                    fami = habitacionFamiliar[i];
                    System.out.println("Habitacion Familiar: " + i);
                    break;
                } else {
                    System.out.println("No hay habitaciones familiares disponibles.");
                }
            }
            //Si el numero de huespedes ocupa una habitacion familiar y si vuela, pero solo de ida:
        } else if(acompaniante < 5 && acompaniante > 1 && incluye == 1 && incluyeRegreso == 2) {
            for(int i=0; i<habitacionFamiliar.length; i++) {
                if(!habitacionFamiliar[i].getOcupado()) {
                    habitacionFamiliar[i].setOcupado(true);
                    fami = habitacionFamiliar[i];
                    System.out.println("Habitacion Sencilla: " + i);
                    break;
                } else {
                    System.out.println("No hay habitaciones familiares disponibles.");
                }
            }
            for(int i=0; i<avionIda.length; i++) {
                if(!avionIda[i].getOcupado()) {
                    avionIda[i].setOcupado(true);
                    vueloIda = avionIda[i];
                    System.out.println("Asiento de ida: A" + i);
                    break;
                } else {
                    System.out.println("No hay lugares disponibles en el vuelo de ida.");
                }
            }
            //Si el numero de huespedes ocupa una habitacion familiar y si vuela de ida y de regreso:
        } else if(acompaniante < 5 && acompaniante > 1 && incluye == 1 && incluyeRegreso == 1) {
            for(int i=0; i<habitacionFamiliar.length; i++) {
                if(!habitacionFamiliar[i].getOcupado()) {
                    habitacionFamiliar[i].setOcupado(true);
                    fami = habitacionFamiliar[i];
                    System.out.println("Habitacion Familiar: " + i);
                    break;
                } else {
                    System.out.println("No hay habitaciones familiares disponibles.");
                }
            }
            for(int i=0; i<avionIda.length; i++) {
                if(!avionIda[i].getOcupado()) {
                    avionIda[i].setOcupado(true);
                    vueloIda = avionIda[i];
                    System.out.println("Asiento de ida: A" + i);
                    break;
                } else {
                    System.out.println("No hay lugares disponibles en el vuelo de ida.");
                }
            }
            for(int i=0; i<avionRegreso.length; i++) {
                if(!avionRegreso[i].getOcupado()) {
                    avionRegreso[i].setOcupado(true);
                    vueloRegreso = avionRegreso[i];
                    System.out.println("Asiento de regreso: A"+ i);
                    break;
                } else {
                    System.out.println("No hay lugares disponibles en el vuelo de regreso.");
                }
            }
        }
        //imprimir el numero de identificacion
        Reservacion miReservacion = new Reservacion(titular, acompaniante, senci, fami, vueloIda, vueloRegreso);
        Reservacion[] aux = new Reservacion[reservaciones2.length+1];
        for(int i=0; i<reservaciones2.length; i++) {
            aux[i] = reservaciones2[i];
        }
        aux[aux.length-1] = miReservacion;
        reservaciones2 = aux;
        return "hola";
    }

    /**
     * Metodo para cancelar una reservacion .
     */
    public static void cancelarReservacion() {
        System.out.print("\nIngrese el numero de identificacion de la reservacion --> ");
        String numId = in.nextLine();
        for(int i = 0; i<reservaciones2.length; i++) {
            if(reservaciones2[i] != null){
                if(numId.equals(reservaciones2[i].getId())){
                    reservaciones2[i] = null;
                }
            }
        }
    }

    /**
     * Metodo para ver una reservacion.
     * @return los datos de la reservacion dependiendo del id de reservacion ingresado.
     */
    public static String verMiReservacion() {
        System.out.print("\nIngrese el numero de identificacion de la reservacion --> ");
        String numId = in.nextLine();
        for(int i = 0; i<reservaciones2.length; i++) {
            if (reservaciones2[i] != null) {
                if (numId.equals(reservaciones2[i].getId())) {
                    reservaciones2[i].toString();
                }
            }
        }
        //imprimir si incluye vuelo
        //imprimir numero de asientos apartados en el vuelo de ida(en caso de que se incluyan)
        //imprimir numero de asientos apartados en el vuelo de regreso(en caso de que se incluyan)
        return "holaVerMiReservacion";
    }

    /**
     * Metodo para ver todas las reservaciones.
     * @return todas las reservaciones.
     */
    public static String verTodasLasReservaciones() {
        return "holaVerTodasLasReservaciones";
    }

    /**
     * Metodo para consultar habitaciones.
     * @return regresa toda la informacion de las habitaciones.
     */
    public static String consultarHabitaciones() {
        return "hola";
    }

    /**
     * Metodo para consultar la informacion del avion.
     * @return informacion de los aviones.
     */
    public static String consultarInformacionDelAvion() {
        return "hola";
    }

    /**
     * Metodo para guardar el estado de los arreglos,
     * se manda a llamar en el main cuando el usuario sale del programa.
      */
    public static void guardamosEstado() {
        Utilidades ut = new Utilidades();
        ut.EscribirObjetosArchivo("avionesIda.txt", avionIda);
        ut.EscribirObjetosArchivo("avionesRegreso.txt", avionRegreso);
        ut.EscribirObjetosArchivo("habitacionesSencillas.txt", habitacionSencilla);
        ut.EscribirObjetosArchivo("habitacionFamiliar.txt", habitacionFamiliar);
        //ut.EscribirObjetosArchivo("reservaciones.txt", reservaciones2);
    }

    /**
     * Metodo para solicitar un opcion, leerla y verificar que sea un numero entero.
     * @return int -- opcion seleccionada.
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
     * Menu de opciones para trabajar con una reservacion.
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
     * Metodo para realizar las acciones del menu.
     * @param opcion - opcion elegida por el usuario.
     */
    public static void realizarAccion(int opcion){
        switch(opcion) {
            case 1:
                miAgencia.crearReservacion();
                break;
            case 2:
                miAgencia.cancelarReservacion();
                break;
            case 3:
                miAgencia.verMiReservacion();
                break;
            case 4:
                miAgencia.verTodasLasReservaciones();
                break;
            case 5:
                miAgencia.consultarHabitaciones();
                break;
            case 6:
                miAgencia.consultarInformacionDelAvion();
                break;
            case 7:
                System.out.println("Hasta luego");
                //ya en el main solo se ve a cual de los dos constructores mandar a llamar,
                //se puede escribir en un auxiliar.txt la palabra "segunda vez"
                String line = "";
                /*try {
                Buffered reader = new BufferedReader(new FileReader("auxiliar.txt"));
                line = reader.readLine();
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
                break;
            default:
                System.out.println("Opcion invalida. Ingresa un numero del 1 al 7.");
                break;
        }
    }

    public static void main(String[] args) {
        int operacion;
        do {
            menu();//Menu de opciones
            operacion = opcion();
            realizarAccion(operacion);//Eleccion de opcion
        } while(operacion != 7);
    }
}