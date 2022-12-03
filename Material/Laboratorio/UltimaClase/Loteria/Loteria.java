import java.util.Random;
import java.util.Scanner;

public class Loteria {
	
	Tarjeta[] paqueteCartas = new Tarjeta[15];

	Tarjeta[][] tableroUsuario = new Tarjeta[3][2];
	Tarjeta[][] tableroCPU = new Tarjeta[3][2];

	final String ANSI_RESET = "\u001B[0m";
    final String ANSI_YELLOW = "\u001B[33m";

	
	public void arrancarJuego() {

		char[] simbolitos = {'\u2600', '\u2602', '\u2605', '\u260E', '\u262F', '\u263A', '\u2665', '\u266B', '\u2603',  '\u265E', '\u263E', '\u2660', '\u2663', '\u269B', '\u2646' };


		//Llenar el arreglo con tarjetas
		for(int i=0; i<paqueteCartas.length; i++) {
			Tarjeta t = new Tarjeta(simbolitos[i], false);
			paqueteCartas[i] = t;
		}

		//Imprimir las cartas en el paquete
		for(int i=0; i<paqueteCartas.length; i++) {
			System.out.print( paqueteCartas[i] );
		}
		System.out.println();
		revolver();


	}


	
	public void revolver() {

		Random aleatorios = new Random();

		for(int i=0; i<paqueteCartas.length; i++) {

			int posAleatoria = aleatorios.nextInt(paqueteCartas.length);
			Tarjeta temporal = new Tarjeta();
			temporal = paqueteCartas[i];
			paqueteCartas[i] = paqueteCartas[posAleatoria];
			paqueteCartas[posAleatoria] = temporal; 	

		}


		//Imprimir las cartas en el paquete
		for(int i=0; i<paqueteCartas.length; i++) {
			System.out.print(paqueteCartas[i]);
		}
		System.out.println();

		

	}


	public void jugar() {

		int contador=0;

		//Crear tableros de usuario (nosotros) y CPU

		//Crear tablero de usuario
		for(int i=0; i<tableroUsuario.length; i++) {
			for(int j=0; j<tableroUsuario[i].length; j++) {
				tableroUsuario[i][j] = paqueteCartas[contador];
				contador++;
			}
		}

		revolver();
		contador = 0;

		//Crear tablero de CPU
		for(int i=0; i<tableroCPU.length; i++) {
			for(int j=0; j<tableroCPU[i].length; j++) {
				tableroCPU[i][j] = paqueteCartas[contador];
				contador++;
			}
		}

		
		System.out.println("Tus cartas");
		for(Tarjeta[] t : tableroUsuario) {
			for(Tarjeta tar: t) {
				System.out.print(tar);
			}
			System.out.println();

		}


		System.out.println("Las cartas de la compu");
		for(int i=0; i<tableroCPU.length; i++) {
			for(int j=0; j<tableroCPU[i].length; j++) {
				System.out.print(tableroCPU[i][j]);
			}
			System.out.println();
		}

		revolver();
		iniciarPartida();


	}

	
	public void iniciarPartida() {


		Scanner entrada = new Scanner(System.in);
		System.out.println("EMPIEZA EL JUEGO");
		int marcar=0;
		int ganador=0;

		for(int i=0; i<paqueteCartas.length; i++) {

			ganador = revisaGanador();
			if(ganador==1 || ganador==2) {
				break;
			}

			System.out.println("Sale la carta");

			System.out.println("\t****");
			System.out.println("\t*"+ paqueteCartas[i] + "*");
			System.out.println("\t****");
			System.out.println();


			System.out.println("¿Tienes esta carta?");
			System.out.println("1. Sí");
			System.out.println("2. No");
			marcar = entrada.nextInt();
			boolean estaba=false;

			Tarjeta salida = paqueteCartas[i];


			if( marcar==1) {

				//Revisar si sí está
				for(int k=0; k<tableroUsuario.length; k++) {
					for(int j=0; j<tableroUsuario[k].length; j++) {
						if(tableroUsuario[k][j] == salida) {

							tableroUsuario[k][j].setNombrada(true);
							estaba=true;
						}
					}
				}


				if(estaba==false) {
					System.out.println("No, no la tenías");
				}

			}



			for(int k=0; k<tableroCPU.length; k++) {
				for(int j=0; j<tableroCPU[k].length; j++) {
					if(tableroCPU[k][j] == salida) {
						tableroCPU[k][j].setNombrada(true);
					}
				}
			}


			imprimirCartasColores();


		}

		if(ganador==1) {
			System.out.println("Ganamos!!!");
		} else if (ganador==2) {
			System.out.println("Gana la compu");
		} else {
			System.out.println("Empate");
		}


	}


	public int revisaGanador() {

		int valor=0;
		int contadorUsuario=0;
		int contadorCPU=0;


		for(int k=0; k<tableroUsuario.length; k++) {
			for(int j=0; j<tableroUsuario[k].length; j++) {
				if(tableroUsuario[k][j].getNombrada()) {
					contadorUsuario++;
				}
			}
		}

		for(int k=0; k<tableroCPU.length; k++) {
			for(int j=0; j<tableroCPU[k].length; j++) {
				if(tableroCPU[k][j].getNombrada()) {
					contadorCPU++;
				}
			}
		}

		if(contadorUsuario==6) {
			valor=1;
		} else if(contadorCPU==6) {
			valor=2;
		} else {
			valor=0;
		}

		return valor;

	}


	public void imprimirCartasColores() {


		System.out.println("Tus cartas");
		for(int k=0; k<tableroUsuario.length; k++) {
			for(int j=0; j<tableroUsuario[k].length; j++) {
				if(tableroUsuario[k][j].getNombrada()) {
					System.out.print(ANSI_YELLOW + tableroUsuario[k][j] + ANSI_RESET);
				} else {
					System.out.print(tableroUsuario[k][j]);

				}
			}
			System.out.println();

		}


		System.out.println();

		System.out.println("Cartas CPU");
		for(int k=0; k<tableroCPU.length; k++) {
			for(int j=0; j<tableroCPU[k].length; j++) {
				if(tableroCPU[k][j].getNombrada()) {
					System.out.print(ANSI_YELLOW + tableroCPU[k][j] + ANSI_RESET);
				} else {
					System.out.print(tableroCPU[k][j]);

				}
			}
			System.out.println();
		}
	}



}

