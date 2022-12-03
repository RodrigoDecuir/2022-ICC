
import java.util.Random;


public class  DistanciaEntrePuntosHallarMayor {


	public static void main(String[] args) {

		//Este es para los números del (0-30)
		Random aleatorios = new Random();

		//Este es para decidir si es positivo o negativo
		Random aleatorios2 = new Random();

		int x1;
		int y1;
		int x2;
		int y2;
		int x3;
		int y3;

		//P1
		int posNeg = aleatorios2.nextInt(2); //0 y 1
		if(posNeg==0) {
			x1 = aleatorios.nextInt(30)+1;
		} else {
			x1 = aleatorios.nextInt(30)+1;
			x1 = x1*(-1);
		}

		posNeg = aleatorios2.nextInt(2); //0 y 1
		if(posNeg==0) {
			y1 = aleatorios.nextInt(30)+1;
		} else {
			y1 = aleatorios.nextInt(30)+1;
			y1 = y1*(-1);
		}


		//P2
		posNeg = aleatorios2.nextInt(2); //0 y 1
		if(posNeg==0) {
			x2 = aleatorios.nextInt(30)+1;
		} else {
			x2 = aleatorios.nextInt(30)+1;
			x2 = x2*(-1);
		}

		posNeg = aleatorios2.nextInt(2); //0 y 1
		if(posNeg==0) {
			y2 = aleatorios.nextInt(30)+1;
		} else {
			y2 = aleatorios.nextInt(30)+1;
			y2 = y2*(-1);
		}

		//P3
		posNeg = aleatorios2.nextInt(2); //0 y 1
		if(posNeg==0) {
			x3 = aleatorios.nextInt(30)+1;
		} else {
			x3 = aleatorios.nextInt(30)+1;
			x3 = x3*(-1);
		}

		posNeg = aleatorios2.nextInt(2); //0 y 1
		if(posNeg==0) {
			y3 = aleatorios.nextInt(30)+1;
		} else {
			y3 = aleatorios.nextInt(30)+1;
			y3 = y3*(-1);
		}

		//Imprimimos los puntos
		System.out.println("P1:(" + x1 + "," + y1 +")");
		System.out.println("P2:(" + x2 + "," + y2 +")");
		System.out.println("P3:(" + x3 + "," + y3 +")");



		//Distancia de P1 a P2
		double d1 = Math.sqrt( Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2) );

		//Distancia de P1 a P3
		double d2 = Math.sqrt( Math.pow(x3-x1, 2) + Math.pow(y3-y1, 2) );

		//Distancia de P2 a P3
		double d3 = Math.sqrt( Math.pow(x2-x3, 2) + Math.pow(y2-y3, 2) );


		if(d1!=d2 && d1!=d3 && d2!=d3) {

			System.out.println("Podemos proceder");

			//d1 es la mayor distancia
			if(d1>d2 && d1>d3) {
				System.out.println(d1);
				System.out.println("Los puntos más alejados son: P1 y P2");
			//d2 es la mayor distancia
			} else if (d2>d1 && d2>d3) {
				System.out.println(d2);
				System.out.println("Los puntos más alejados son: P1 y P3");
			} else {
				System.out.println(d3);
				System.out.println("Los puntos más alejados son: P2 y P3");
			}

		}

		System.out.println("Imprimimos las distancias");
		System.out.println("d1: " +  d1);
		System.out.println("d2: " +  d2);
		System.out.println("d3: " +  d3);

	}

}