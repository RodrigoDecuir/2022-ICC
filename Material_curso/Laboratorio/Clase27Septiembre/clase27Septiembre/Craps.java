import java.util.Random;

public class Craps {
	
	public static void main(String[] args) {
		

		Random aleatorios = new Random();
		int dado1=0;
		int dado2=0;
		int punto=0;
		int suma=0;
		boolean continuar = true;

		dado1 = aleatorios.nextInt(6)+1; //{1,2,3,4,5,6}
		dado2 = aleatorios.nextInt(6)+1;
		suma = dado1 + dado2;

		System.out.println("SUMA: " + suma);

		//Ganamos o perdemos a la primera
		if(suma==2 || suma==4 || suma==6) {
			System.out.println("Ganamos a la primera");
			continuar=false;
		} else if(suma==7 || suma==9) {
			System.out.println("Perdimos a la primera");
			continuar=false;
		} else {
			punto = suma;
			System.out.println("Tu punto es " + punto);
		}


		while(continuar) {

			dado1 = aleatorios.nextInt(6)+1; 
			dado2 = aleatorios.nextInt(6)+1;
			suma = dado1 + dado2;
			System.out.println("Suma " + suma);

			if(suma== 2 || suma==4 || suma==6) {
				System.out.println("Perdemos");
				continuar=false;
			} else if (suma==punto) {
				System.out.println("Ganamos");
				continuar=false;
			}


		}

	}

}

