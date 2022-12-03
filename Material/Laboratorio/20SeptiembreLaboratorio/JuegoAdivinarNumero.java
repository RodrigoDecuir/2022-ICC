import java.util.Random;
import java.util.Scanner;

public class JuegoAdivinarNumero {
	

	public static void main(String[] args) {
		

		Random aleatorios = 	new Random();
		Scanner entrada = new Scanner(System.in);

		int numeroCompu = aleatorios.nextInt(100)+1;
		int numeroUsuario = 0;

		int contadorOportunidades=1;

		System.out.println(numeroCompu);

		while(contadorOportunidades<=3) {

			System.out.println("Trata de adivinar un número entre 1 y 100");
			numeroUsuario = entrada.nextInt();

			if(numeroUsuario==numeroCompu) {
				System.out.println("Adivinaste el número! ");
				break;
			} else {

				if(numeroUsuario<numeroCompu) {
					System.out.println("Tu número es menor al que yo pensé, intenta con uno más grande");
				} else {
					System.out.println("Tu número es mayor al que yo pensé, intenta con uno más pequeño");
				}

				contadorOportunidades++;


			}	

		}

		if(contadorOportunidades==4) {
			System.out.println("No adivinaste, el número que yo pensé era " + numeroCompu);
		}


	}


}
