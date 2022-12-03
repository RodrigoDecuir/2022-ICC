import java.util.Random;


public class DadosMejorado {
	
	
	public static void main(String[] args) {
		

		Random aleatorios = new Random();
		int dado1, dado2;
		int suma=0;

		//Ciclo con centinela
		boolean bandera = true;

		while(bandera) {
			dado1 = aleatorios.nextInt(6)+1;
			dado2 = aleatorios.nextInt(6)+1;
			suma = dado1 + dado2;
			System.out.println("Suma " + suma);
			if(suma==4) {
				bandera = false;
			}
		}

	}


}  
