import java.util.Scanner;

public class CasaDeCambioMejorada {
	

	public static void compra(int tipoMonedaQuiero, double pesosMex) {

		double conversion1;
		String cadCompra="";

		if(tipoMonedaQuiero==1) {
			cadCompra = "Dólares (USA)";
			conversion1 = pesosMex/20.66;
		} else if(tipoMonedaQuiero==2) {
			cadCompra = "Dólares (CAD)";
			conversion1 = pesosMex/16.29;
		} else if (tipoMonedaQuiero==3) {
			cadCompra = "Euros";
			conversion1 = pesosMex/22.85;
		} else {
			cadCompra = "Yenes";
			conversion1 = pesosMex/0.18;
		}

		System.out.println("Te llevas a tu viaje " + conversion1 + " " + cadCompra );

	}


	public static void venta(int tipoMoneda, double monedaACambiar) {

		
		double conversion2;

		if(tipoMoneda==1) {
			conversion2 = monedaACambiar*20.10;
		} else if(tipoMoneda==2) {	
			conversion2 = monedaACambiar*16;
		} else if (tipoMoneda==3) {
			conversion2 = monedaACambiar*22.55;
		} else {
			conversion2 = monedaACambiar*0.10;
		}

		System.out.println("Te quedas con " + conversion2 + " pesos Mexicanos");


	}



	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		System.out.println("Bienvenido a la casa de cambio");
		System.out.println("¿Qué transacción vas a realizar");
		System.out.println("1. Compra de divisas");
		System.out.println("2. Venta de divisas");
		
		int opcion;
		opcion = entrada.nextInt();

		if(opcion==1) {

			System.out.println("¿Qué moneda quieres adquirir");
			System.out.println("1. Dólar (USA)");
			System.out.println("2. Dólar (CAD)");
			System.out.println("3. EURO");
			System.out.println("4. Yen");


			int tipoMoneda = entrada.nextInt();

			System.out.println("¿Cuántos pesos MEX tienes?");

			double pesosMex = entrada.nextDouble();

			compra(tipoMoneda, pesosMex);

		} else if (opcion==2) {


			System.out.println("¿Qué moneda traes para darte pesos mexicanos?");
			System.out.println("1. Dólar (USA)");
			System.out.println("2. Dólar (CAD)");
			System.out.println("3. EURO");
			System.out.println("4. Yen");

			int tipoMoneda2 = entrada.nextInt();

			System.out.println("¿Qué cantidad traes de tu moneda?");

			double monedaACambiar = entrada.nextDouble();


			venta(tipoMoneda2, monedaACambiar);



		} else {
			System.out.println("Opción inválida");
		}
 		


	}



}







