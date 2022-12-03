import java.util.Random;
import java.util.Scanner;

public class PiedraPapelTijera {
	

	public static void main(String[] args) {
		

		Random aleatorios = new Random();
		Scanner entrada = new Scanner(System.in);

		int manoUsuario;
		int manoCompu;


		


		System.out.println("Bienvenido al juego de piedra, papel o tijeras");

		
		boolean bandera=true;

		while(bandera) {

			//Compu elige su mano en secreto
			manoCompu = aleatorios.nextInt(3);

			System.out.println("Elige con qué mano juegas");
			System.out.println("0. Piedra");
			System.out.println("1. Papel");
			System.out.println("2. Tijeras");

			manoUsuario = entrada.nextInt();


			if(manoUsuario == manoCompu) {
				System.out.println("Empate");
			} else {

				//Eligimos piedra
				if(manoUsuario==0) {
					if(manoCompu==1) {
						System.out.println("Perdimos :(");
					} else {
						System.out.println("Ganamos");
					}
				}

				//Eligimos papel
				if(manoUsuario==1) {
					if(manoCompu==0) {
						System.out.println("Ganamos");
					} else {
						System.out.println("Perdimos :(");
					}
				}			


				//Elegimos tijeras
				if(manoUsuario==2) {
					if(manoCompu==1) {
						System.out.println("Ganamos");
					} else {
						System.out.println("Perdimos :(");
					}
				}	

				bandera = false;

				System.out.println("Las manos fueron");
				System.out.println("Nosotros " + manoUsuario);
				System.out.println("Compu " + manoCompu);

			}


		}

		

		


	}

}


