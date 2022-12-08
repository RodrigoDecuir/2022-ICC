import java.util.Scanner;

public class Main {
	public static void main (String [] pps) {
		Scanner io = new Scanner(System.in);

		//Pieza a = new Peon("blanca",2,2);

		Caballo c = new Caballo("Blanco",5,4);
		//Peon peon = new Peon("blanca",2,3);
		
		//System.out.println(peon.posiblesMovimientos());
		System.out.println(c.posiblesMovimientos());


	}
}
