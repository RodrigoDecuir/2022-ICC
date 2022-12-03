
public class AreaCirculo1 {
	

	public static void main(String[] args) {
		
		double r = 18.5;

		if( r>0.0 ) {

			System.out.println("Radio válido");


			if(r >= 10) {

				System.out.println("El círculo es grande");

			}

			double a = Math.PI * (r * r);
			//double a = Math.PI * Math.pow(r, 2);
			System.out.println("El área del círculo de radio: " + r + " es " + a );
		} else {

			System.out.println("El valor del radio no puede ser negativo o cero!");
		}
	  
	  	System.out.println("Siguientes líneas de codigo");


	}



}


