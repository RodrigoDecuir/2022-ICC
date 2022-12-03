import java.util.Random;


public class CicloForInterrumpido {

	
	public static void main(String[] args) {

		Random aleatorios = new Random();
		int valor=0;
		int contador=0;
		
		for(int i=1; i!=0; i++) {

			valor = aleatorios.nextInt(50)+1;
			if(valor==5) {
				break;
			}
			contador++;
			System.out.println("i " + i);

		}

		System.out.println("Estuvimos en el ciclo " + contador + " veces");

	}



}

