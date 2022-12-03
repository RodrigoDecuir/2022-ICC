
import java.util.Scanner;

public class UsoTarjeta {
	

	public static void main(String[] args) {
		

		Scanner entrada = new Scanner(System.in);

		TarjetaDebito tarjetita = new TarjetaDebito("1234578822", 1200);
		TarjetaDebito tarjetita2 = new TarjetaDebito("9979797", 700);
		TarjetaDebito t3 = new TarjetaDebito();

		System.out.println(tarjetita);
		System.out.println(tarjetita2);

		//Método1 sin this
		t3.comparaTarjetas(tarjetita, tarjetita2);

		tarjetita.comparaTarjetas(tarjetita2);



		/*
		System.out.println("Cuánto cuesta lo que quieres comprar?");
		double precioArticulo = entrada.nextDouble();

		tarjetita.comprar(precioArticulo);

		System.out.println(tarjetita);


		//Abonar
		System.out.println("Cuánto vas a depositar?");
		double montoAFavor = entrada.nextDouble();

		System.out.println(tarjetita.abonar(montoAFavor));

		System.out.println(tarjetita);

		*/

	}




}