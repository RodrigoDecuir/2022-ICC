
public class CiclosAnidadosTriples {
	

	public static void main(String[] args) {


		int contador=0;
		
		for(int i=1; i<=10; i++) {

			System.out.println("Valor de la i: " + i);

			for(int j=1; j<=10; j++) {

				System.out.println("Valor de la j: " + j);

				for(int k=1; k<=10; k++) {
					System.out.println(i + "," + j + "," + k);
					contador++;
				}
			}
		}

		System.out.println("Cuantas veces hicimos ternas " + contador);
 

	}

}
