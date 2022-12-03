import java.util.Random;


public class Arreglos {
	
	public static void main(String[] args) {

		// [0,0,0,0,0,0,0,0,0,0]
		/*int[] arr = {1,2,3,4,5};

		for(int i=0; i<arr.length; i+=2) {
			System.out.print(arr[i] + " ");
		}

		System.out.println();

		for(int elem : arr) {
			System.out.print(elem + " ");
		}

		System.out.println();

	*/

		Random aleatorios = new Random();


		//Simulación de votos
		int[] casillas = new int[3];
		String[] nombreCandidados = {"Juanito", "Martín", "Lupita"};

		int contador=1;
		int voto=0;
		while(contador<=700) {
			voto = aleatorios.nextInt(3);
			casillas[voto]++;
			contador++;
		}



		for(int elem : casillas) {
			System.out.print(elem + " ");
		}

		System.out.println();

		//Buscar ganador, no considera empates
		int maximo=0;
		int posicionGanador=0;
		maximo = casillas[0];
		for(int i=1; i<casillas.length; i++) {

			if(casillas[i]>maximo) {
				maximo = casillas[i];
				posicionGanador = i;
			}

		}

		System.out.println("El ganador de la votación es " + nombreCandidados[posicionGanador] + " con " + maximo + " votos");


	}


}
