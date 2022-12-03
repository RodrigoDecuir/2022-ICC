import java.util.Random;

public class UsoGato {
	

	public static void main(String[] args) {
		
		Gato juegoGato = new Gato();

		Random aleatorios = new Random();
		int comienzo = aleatorios.nextInt(2);

		//juegoGato.imprimeTablero();


		//Si cae 0 empezamos nosotros
		//Si cae 1 empieza la compu

		int valor = juegoGato.buscaGanador();

		


		while(valor==0) {

			if(comienzo%2 == 0) {
				juegoGato.tiradaHumano();
				juegoGato.imprimeTablero();
			} else {
				juegoGato.tiradaCompu();
				juegoGato.imprimeTablero();
			}

			System.out.println();
			comienzo++;

			valor =  juegoGato.buscaGanador();

		}

		
		if(valor==1) {
			System.out.println("Gana el usuario");
		} else if(valor==2) {
			System.out.println("Gana la compu");
		}
		

	}

}
