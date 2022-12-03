import java.util.Random;
import java.util.Scanner;

public class Volados {
	
	public static void main(String[] args) {
		

		Scanner entrada = new Scanner(System.in);
		Random aleatorios = new Random();

		// 0 -> Sol,  1 -> Águila
		int v = aleatorios.nextInt(2);
		int valor;

		System.out.println("Sol o águila?");
		System.out.println("0: Sol");
		System.out.println("1: Águila");
		valor = entrada.nextInt();

		if(v==valor) {
			System.out.println("Adivinaste el volado");
		} else {
			System.out.println("No adivinaste el volado");
		}

		System.out.println("cayó: " + v);



	}


}
