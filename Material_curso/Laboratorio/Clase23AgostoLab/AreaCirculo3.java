import java.util.Random;

public class AreaCirculo3 {
	

	public static void main(String[] args) {
		
		Random alea = new Random();

		double r = alea.nextInt(16)+1;
		r = (double)r/( (double) (1.4/(alea.nextInt(5)+1)));


		double a = Math.PI * (r * r);
		System.out.println("El área del círculo de radio: " + r + " es " + a );

	}

}