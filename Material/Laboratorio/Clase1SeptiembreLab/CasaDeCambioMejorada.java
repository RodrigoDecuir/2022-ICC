import java.util.Scanner;

public class CasaDeCambioMejorada {
	

	public static void compra() {

		Scanner entrada = new Scanner(System.in);

		int tipoMoneda;
		double pesosMex;
		double conversion1;
		String cadCompra="";

		System.out.println("¿Qué moneda quieres adquirir");
		System.out.println("1. Dólar (USA)");
		System.out.println("2. Dólar (CAD)");
		System.out.println("3. EURO");
		System.out.println("4. Yen");

		tipoMoneda = entrada.nextInt();

		System.out.println("¿Cuántos pesos MEX tienes?");

		pesosMex = entrada.nextDouble();

		if(tipoMoneda==1) {
			cadCompra = "Dólares (USA)";
			conversion1 = pesosMex/20.66;
		} else if(tipoMoneda==2) {
			cadCompra = "Dólares (CAD)";
			conversion1 = pesosMex/16.29;
		} else if (tipoMoneda==3) {
			cadCompra = "Euros";
			conversion1 = pesosMex/22.85;
		} else {
			cadCompra = "Yenes";
			conversion1 = pesosMex/0.18;
		}

		System.out.println("Te llevas a tu viaje " + conversion1 + " " + cadCompra );

	}


	public static void venta() {

		Scanner entrada = new Scanner(System.in);

		double monedaACambiar;
		int tipoMoneda;
		double conversion2;

		System.out.println("¿Qué moneda traes para darte pesos mexicanos?");
		System.out.println("1. Dólar (USA)");
		System.out.println("2. Dólar (CAD)");
		System.out.println("3. EURO");
		System.out.println("4. Yen");

		tipoMoneda = entrada.nextInt();

		System.out.println("¿Qué cantidad traes de tu moneda?");

		monedaACambiar = entrada.nextDouble();

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
			compra();
		} else if (opcion==2) {
			venta();
		} else {
			System.out.println("Opción inválida");
		}
 		


	}



}







