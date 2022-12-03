
public class DistanciaEntrePuntos {
	

	public static void main(String[] args) {
		
		//P1
		int x1 = -9;
		int y1 = 10;

		//P2
		int x2 = 4;
		int y2 = -1;


		double distancia = Math.sqrt( Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2) );

		System.out.println(distancia);


	}

}


