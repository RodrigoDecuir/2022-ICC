
import java.util.Scanner;

public class Zodiaco {
	
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		/*Estas son las variables de mi programa
		que voy a usar para calcular el signo
		del zodiaco de una persona */

		int diaCumple;
		int mesCumple;

		System.out.println("Escribe tu día de cumpleaños (1-31)");
		diaCumple = entrada.nextInt();

		System.out.println("Escribe tu mesCumple de cumpleaños (1-12)");
		mesCumple = entrada.nextInt();

		if((diaCumple>=21 && mesCumple==3) || (diaCumple<=20 && mesCumple==4)) {
			System.out.println("Eres Aries");
		} else if((diaCumple>=21 && mesCumple==4) || (diaCumple<=20 && mesCumple==5)) {
			System.out.println("Eres Tauro");
		} else if((diaCumple>=21 && mesCumple==5) || (diaCumple<=20 && mesCumple==6)) {
			System.out.println("Eres Géminis");
		} else if((diaCumple>=21 && mesCumple==6) || (diaCumple<=20 && mesCumple==7)) {
			System.out.println("Eres Cáncer");
		} else if((diaCumple>=21 && mesCumple==7) || (diaCumple<=20 && mesCumple==8)) {
			System.out.println("Eres Leo");
		} else if((diaCumple>=21 && mesCumple==8) || (diaCumple<=20 && mesCumple==9)) {
			System.out.println("Eres Virgo");
		} else if((diaCumple>=21 && mesCumple==9) || (diaCumple<=20 && mesCumple==10)) {
			System.out.println("Eres Libra");
		} else if((diaCumple>=21 && mesCumple==10) || (diaCumple<=20 && mesCumple==11)) {
			System.out.println("Eres Escorpión");
		} else if((diaCumple>=21 && mesCumple==11) || (diaCumple<=20 && mesCumple==12)) {
			System.out.println("Eres Sagitario");
		} else if((diaCumple>=21 && mesCumple==12) || (diaCumple<=20 && mesCumple==1)) {
			System.out.println("Eres Capricornio");
		} else if((diaCumple>=21 && mesCumple==1) || (diaCumple<=20 && mesCumple==2)) {
			System.out.println("Eres Acuario");
		} else if((diaCumple>=21 && mesCumple==2) || (diaCumple<=20 && mesCumple==3)) {
			System.out.println("Eres Piscis");
		} else {
			System.out.println("Error en fecha de nacimiento :V");
		}
		


	}


}
