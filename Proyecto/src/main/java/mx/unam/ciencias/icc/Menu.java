package mx.unam.ciencias.icc;

public static class Menu {
    /**
     * Metodo para solicitar una opcion, leerla y verificar que sea un numero entero.
     * @return int -- opcion seleccionada.
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
        } while (numero == -1);
        return numero;
    }

    /**
     * Menu de opciones para trabajar con una reservacion.
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
     * Metodo para realizar las acciones del menu.
     *
     * @param opcion - opcion elegida por el usuario.
     */
    public static void realizarAccion(int opcion) {
        switch (opcion) {
            case 1:
                String titular = in.nextLine();
                System.out.println("Nombre del titular de la reservacion -->");
                int acompaniante = in.nextInt();
                System.out.println("Numero de acompaniantes del titular (0 a 4) -->");
                int incluye = in.nextInt();
                System.out.println("Incluye vuelos? 1.Si/2.No --->");
                int incluyeRegreso = 0;
                if (incluye == 1) {
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
                consultarHabitaciones(Hotel[]habitacionSencilla, Hotel[]habitacionFamiliar);
                break;
            case 6:
                consultarInformacionDelAvion(Hotel[]avionIda, Hotel[]avionRegreso);
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
}