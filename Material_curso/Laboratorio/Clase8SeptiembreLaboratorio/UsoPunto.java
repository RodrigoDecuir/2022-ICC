
public class UsoPunto {
	

	public static void main(String[] args) {
		
		Punto p1 = new Punto(2, -3);
		Punto p2 = new Punto(-1, -6);
		Punto p3 = new Punto(-3, 14);

		boolean puedoRevisarTriangulo=true;

		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);


		//Revisar si todos los puntos están en la misma recta (vertical)
		if(p1.getCoordenadaX() == p2.getCoordenadaX() && p1.getCoordenadaX() == p3.getCoordenadaX() && p2.getCoordenadaX() == p3.getCoordenadaX() ||  p1.getCoordenadaY() == p2.getCoordenadaY() && p1.getCoordenadaY() == p3.getCoordenadaY() && p2.getCoordenadaY() == p3.getCoordenadaY() )   {

			System.out.println("Todos los puntos están en la misma recta vertical");

			puedoRevisarTriangulo = false;

		} else {


			//Validar si dos puntos están en una misma recta vertical u horizontal

			//Vertical
			if(p1.getCoordenadaX() == p2.getCoordenadaX() || p1.getCoordenadaX() == p3.getCoordenadaX() || p2.getCoordenadaX() == p3.getCoordenadaX() ) {

				System.out.println("Los puntos están en una misma recta vertical");

				puedoRevisarTriangulo = false;
			}

			//Horizontal

			if(p1.getCoordenadaY() == p2.getCoordenadaY() || p1.getCoordenadaY() == p3.getCoordenadaY() || p2.getCoordenadaY() == p3.getCoordenadaY() ) {

				System.out.println("Los puntos están en una misma recta horizontal");

				puedoRevisarTriangulo = false;
			}

		}


		System.out.println(puedoRevisarTriangulo);
		
		if(puedoRevisarTriangulo)  {

			System.out.println("Ejercicio de la práctica");

		}





	}




}
