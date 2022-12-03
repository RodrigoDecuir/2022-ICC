import java.util.Random;

public class LanzarDados {
	

	public static void main(String[] args) {
		
		Random aleatorios = new Random();

		int contador = 1;
		int dado1, dado2;
		int suma=0;

		int j;

		while(contador<=10) {
			dado1 = aleatorios.nextInt(6)+1;
			dado2 = aleatorios.nextInt(6)+1;

			//Imprimir los puntos de los dados

			//Dado 1
			j=1;
			while(j<=dado1) {
				System.out.print("*");
				j++;
			}

			System.out.println();

			j=1;
			while(j<=dado2) {
				System.out.print("*");
				j++;
			}

			System.out.println();

			suma = dado1 + dado2;

			System.out.println(suma);

			contador++;

		}

		


	}


}
