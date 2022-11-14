/**
 *
 * / ICC /
 * / Cinthia Rodriguez Maya / 
 * / Facultad de Ciencias - UNAM /
 * @author Rodrigo Andre Decuir Fuentes
 *
*/

//Importamos la clase Punto,
//la cual se encuentra en el
//paquete(directorio) util
import util.Punto;

//Importamos la clase Math
import java.lang.Math;

//Importamos la clase Random
import java.util.Random;

//Nombre de la clase
public class TresPuntos {

	//Metodo main
	public static void main(String[] args) {
		
		//Creamos un objeto rand,
		//el cual nos va a permitir
		//generar un valor aleatorio
		Random rand = new Random();

		//Creamos un objeto (a)
		//de la clase Punto
		//y le asignamos valores iniciales
		Punto a = new Punto(3.0, -6.2);

		//Se crean dos atributos para contener
		//al valor maximo y minimo de las 
		//coordenadas aleatorias	
		double valMin = -100;
		double valMax = 100;
		
		//Creamos los "puntos" como objetos,
		//con un parametro de 2 coordenadas 
		//aleatorias (x, y) entre el valorMin 
		//y el valorMax
		
		Punto p1 = new Punto(rand.nextDouble(valMin, valMax), rand.nextDouble(valMin, valMax));
		Punto p2 = new Punto(rand.nextDouble(valMin, valMax), rand.nextDouble(valMin, valMax));
		Punto p3 = new Punto(rand.nextDouble(valMin, valMax), rand.nextDouble(valMin, valMax));
		
		//Declaramos los atributos
		//de las coordenadas,
		//que nos permiten obtener el
		//valor aleatorio
		double x1 = p1.getCoordenadaX();
		double y1 = p1.getCoordenadaY();
		double x2 = p2.getCoordenadaX(); 
		double y2 = p2.getCoordenadaY();
		double x3 = p3.getCoordenadaX(); 
		double y3 = p3.getCoordenadaY();
		
		//Declaramos atributos redondeados
		//para darle al usuario una idea de 
		//que esta sucediendo sin muchos decimales	
		double x1round = Math.ceil(p1.getCoordenadaX());
		double y1round = Math.ceil(p1.getCoordenadaY());
		double x2round = Math.ceil(p2.getCoordenadaX()); 
		double y2round = Math.ceil(p2.getCoordenadaY());
		double x3round = Math.ceil(p3.getCoordenadaX()); 
		double y3round = Math.ceil(p3.getCoordenadaY());
	
		String coordenadasPunto1 = "(" + x1round + ", " + y1round + ")";
		String coordenadasPunto2 = "(" + x2round + ", " + y2round + ")";
		String coordenadasPunto3 = "(" + x3round + ", " + y3round + ")";
	
		//Damos la bienvenida e indicamos
		//la funcionalidad del programa	
		System.out.println("Bienvenid@. Este programa genera 3 puntos aleatorios y nos dice que triangulo puedes crear con ellos:");
		 
		//Calculamos la distancia entre los puntos 
		int distEntreP1yP2 = (int)Math.ceil(Math.sqrt(Math.pow(x1-x2, 2) + Math.pow(y1-y2, 2)));
		int distEntreP2yP3 = (int)Math.ceil(Math.sqrt(Math.pow(x2-x3, 2) + Math.pow(y2-y3, 2)));	
		int distEntreP3yP1 = (int)Math.ceil(Math.sqrt(Math.pow(x3-x1, 2) + Math.pow(y3-y1, 2)));
		
		//Obtenemos el cuadrado de las distancias
		double d1 = (int)Math.ceil(Math.pow(distEntreP1yP2, 2));
		double d2 = (int)Math.ceil(Math.pow(distEntreP2yP3, 2));
		double d3 = (int)Math.ceil(Math.pow(distEntreP3yP1, 2));

		//Aplicamos la ley del coseno para encontrar los angulos en radianes	
		double alpha = (int)Math.ceil((Math.acos((d2 + d3 - d1)/(2*distEntreP2yP3*distEntreP3yP1))));
		double beta = (int)Math.ceil((Math.acos((d1 + d3 - d2))/(2*distEntreP1yP2*distEntreP3yP1)));
		double gamma = (int)Math.ceil((Math.acos((d1 + d2 - d3)/(2*distEntreP1yP2*distEntreP2yP3))));
	
		//Pasamos los angulos de radianes a grados
		alpha = (alpha * 180) / Math.PI;
		beta = (beta * 180) / Math.PI;
		gamma = (gamma * 180) / Math.PI;
		
		//Hay que verificar que sea posible construir un triangulo 
		//No se puede generar un triangulo si:
		//-- Dos o mas puntos tienen exactamente las mismas coordenadas --
		//-- Los tres puntos estan en una misma linea --
		if (((x1 == x2) && (y1 == y2)) || ((x1 == x3) && (y1 ==y3)) || ((x2 == x3) && (x2 == y3))) {
			System.out.println("No es posible construir un triangulo, intentalo de nuevo");
		//Verificamos si con los puntos se puede construir un triangulo equilatero,
		//cuya caracteristica es que tiene 3 lados iguales
		} else if ((distEntreP1yP2 == distEntreP2yP3) && (distEntreP2yP3 == distEntreP3yP1)) {
			System.out.println("Se puede construir un triangulo equilatero con los puntos: " + "\n" + coordenadasPunto1 + ", " + coordenadasPunto2 + ", " + coordenadasPunto3);
		//Verificamos si con los puntos se puede construir un triangulo isosceles,
		//cuya caracteristica es que tienen 2 lados iguales
		} else if ((distEntreP1yP2 == distEntreP2yP3) || (distEntreP1yP2 == distEntreP3yP1) || (distEntreP2yP3 == distEntreP3yP1)) {
			System.out.println("Se puede construir un triangulo isosceles con los puntos: " + "\n" + coordenadasPunto1 + ", " + coordenadasPunto2 + ", " + coordenadasPunto3);
		//Verificamos si con los puntos se puede construir un triangulo rectangulo,
		//cuya caracteristica es que tiene un angulo de 90 grados 
		} else if ((alpha == 90.0) || (beta == 90.0) || (gamma == 90.0)) {
			System.out.println("Se puede construir un triangulo rectangulo con los puntos: " + "\n" + coordenadasPunto1 + ", " + coordenadasPunto2 + ", " + coordenadasPunto3); 
		//En el ultimo caso estariamos hablando de un triangulo escaleno, 
		//ya que su caracteristica es que ninguno de sus lados son iguales
		//aunque es similar al rectangulo, el rectangulo se encuentra mas 
		//definido que el escaleno, es por esto que lo puse antes que el escaleno
		} else {
			System.out.println("Se puede construir un triangulo escaleno con los puntos: " + "\n" + coordenadasPunto1 + ", " + coordenadasPunto2 + ", " + coordenadasPunto3); 	
		}
	}
}	
