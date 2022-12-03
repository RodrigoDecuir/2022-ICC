import java.util.Scanner;
import java.util.Random;

public class Gato {
	

	Scanner entrada = new Scanner(System.in);
	int[][] gato = new int[3][3];


	public void tiradaHumano() {
		int renglonHumano=0;
		int columnaHumano=0;
		System.out.println("Donde tiras en el tablero(3x3)");
		System.out.println("Valor del renglón (0-2)");
		renglonHumano = entrada.nextInt();
		System.out.println("Valor de la columna (0-2)");
		columnaHumano = entrada.nextInt();
		if(gato[renglonHumano][columnaHumano]==0) {
			gato[renglonHumano][columnaHumano] = 1;
		} else {
			System.out.println("Esa casilla ya está seleccionada :V");
		}

	}


	public void tiradaCompu() {

		Random aleatorios = new Random();
		int renglonCPU=0;
		int columnaCPU=0;
		boolean PusoTirada=false;

		while(PusoTirada==false) {

			renglonCPU = aleatorios.nextInt(3);
			columnaCPU = aleatorios.nextInt(3);

			if(gato[renglonCPU][columnaCPU]==0) {
				gato[renglonCPU][columnaCPU] = 2;
				PusoTirada = true;
			}

		}

	}


	public void imprimeTablero() {

		for(int i=0; i<gato.length; i++) {
			for(int j=0; j<gato[i].length; j++) {
				if(gato[i][j] == 0) {
					System.out.print(" - ");
				} else if (gato[i][j] == 1) {
					System.out.print(" X ");
				} else {
					System.out.print(" O ");
				}
			}
			System.out.println();
		}
	}


	public int buscaGanador() {

		int ganador=0;

		//Buscar victorias verticales
		//Ganamos nosotros?
		//regresar 1
		if(gato[0][0] == 1 && gato[1][0] == 1 && gato[2][0] == 1) {
			ganador=1;
		}

		if(gato[0][1] == 1 && gato[1][1] == 1 && gato[2][1] == 1) {
			ganador=1;
		}

		if(gato[0][2] == 1 && gato[1][2] == 1 && gato[2][2] == 1) {
			ganador=1;
		}

		//Ganó cpu?
		if(gato[0][0] == 2 && gato[1][0] == 2 && gato[2][0] == 2) {
			ganador=2;
		}

		if(gato[0][1] == 2 && gato[1][1] == 2 && gato[2][1] == 2) {
			ganador=2;
		}

		if(gato[0][2] == 2 && gato[1][2] == 2 && gato[2][2] == 2) {
			ganador=2;
		}


		//Victoria de horizontal 
		//Ganamos nosotros?
		if(gato[0][0] == 1 && gato[0][1] == 1 && gato[0][2] == 1) {
			ganador=1;
		}

		if(gato[1][0] == 1 && gato[1][1] == 1 && gato[1][2] == 1) {
			ganador=1;
		}

		if(gato[2][0] == 1 && gato[2][1] == 1 && gato[2][2] == 1) {
			ganador=1;
		}


		//Victoria de horizontal 
		//Ganó CPU?
		if(gato[0][0] == 2 && gato[0][1] == 2 && gato[0][2] == 2) {
			ganador=2;
		}

		if(gato[1][0] == 2 && gato[1][1] == 2 && gato[1][2] == 2) {
			ganador=2;
		}

		if(gato[2][0] == 2 && gato[2][1] == 2 && gato[2][2] == 2) {
			ganador=2;
		}


		//Victoria diagonal 1 izquierda sup a derecha inf
		//Ganamos nosotros?
		if(gato[0][0] == 1 && gato[1][1] == 1 && gato[2][2] == 1) {
			ganador=1;
		}


		//Ganó CPU?
		if(gato[0][0] == 2 && gato[1][1] == 2 && gato[2][2] == 2) {
			ganador=2;
		}


		//Victoria diagonal 1 derecha sup a izq inf
		//Ganamos nosotros?
		if(gato[0][2] == 1 && gato[1][1] == 1 && gato[2][0] == 1) {
			ganador=1;
		}


		//Ganó CPU?
		if(gato[0][2] == 2 && gato[1][1] == 2 && gato[2][0] == 2) {
			ganador=2;
		}


		return ganador;

	}


}

