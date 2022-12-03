
import java.util.Random;


public class Aleatorios {
	
	public static void main(String[] args) {
		
		Random alea = new Random();

		int valorAleatorio = (alea.nextInt(3)+1)*2;
		System.out.println(valorAleatorio);

	}

}






