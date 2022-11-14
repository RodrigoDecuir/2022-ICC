/**
 * Clase uso para GatitoEnAdopcion.
 * @author Rodrigo Andre Decuir Fuentes.
 * @version 29 oct 2022.
 */

public class UsoGatitoEnAdopcion {

	public static void main(String[]args) {

		GatitoEnAdopcion amina = new GatitoEnAdopcion("Amina", "Bobtail");
		CertificadoVacunacion aminaC = new CertificadoVacunacion("No aplicada", "No aplicada",
			       		                        	"No aplicada", "No aplicada");
/*	
		GatitoEnAdopcion amlo = new GatitoEnAdopcion("Amlo", "Oriental");
		CertificadoVacunacion amloC = new CertificadoVacunacion("No aplicada", "No aplicada",
			       		                        	"No aplicada", "No aplicada");
		
		GatitoEnAdopcion yanina = new GatitoEnAdopcion("Yanina", "Sphynx");
		CertificadoVacunacion yaninaC = new CertificadoVacunacion("No aplicada", "No aplicada",
			       		                        	"No aplicada", "No aplicada");
*/		
		System.out.println(amina);
		System.out.println(aminaC);
/*	
		System.out.println(yanina);
		System.out.println(yaninaC);
*/	
		/*
		 * Vacunas disponibles:
		 * Anti-rabia
		 * Gripa gatuna
		 * Fiebre minina
		 * Covid en mascotas
		 */	 
		aminaC.aplicaVacuna("Anti-rabia");
		System.out.println(amina);
		System.out.println(aminaC);

		aminaC.aplicaVacuna("Covid en mascotas");
		aminaC.aplicaVacuna("Gripa gatuna");
		aminaC.aplicaVacuna("Covid en mascotas");

		System.out.println(amina);
		System.out.println(aminaC);
		
		aminaC.aplicaVacuna("Fiebre minina");	
		System.out.println(amina);
		System.out.println(aminaC);

		System.out.println("Felicidades tu gatito tiene todas las vacunas");
	}


}	
