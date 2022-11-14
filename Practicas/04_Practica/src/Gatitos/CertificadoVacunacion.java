/**
 * Clase para definir el certificado de vacunacion.
 * @author Rodrigo Andre Decuir Fuentes.
 * @version 29 oct 2022.
 */

public class CertificadoVacunacion {
	
	//Atributos
	String antiRabia;
	String gripaGatuna;
	String fiebreMinina;
	String covidEnMascotas;

	//constructor por parametros	
	/**
	 * Construtor por parametros.
	 * @param rabia vacuna anti-rabia.
	 * @param gripa vacuna contra la gripa gatuna.
	 * @param fiebre vacuna contra la fiebre minina.
	 * @param covid vacuna contra el covid en mascotas.
	 */
	public CertificadoVacunacion(String rabia, String gripa, String fiebre, String covid) {
		antiRabia = rabia;
		gripaGatuna = gripa;
		fiebreMinina = fiebre;
		covidEnMascotas = covid;
	}
	
	//Constructor por omision
	/**
	 * Constructor por omision.
	 */
	public CertificadoVacunacion() { }
	

	//SET
	/**
	 * Metodo para asignar una vacuna.
	 * @param rabia vacuna anti-rabia.
	 */
	public void setAntiRabia(String rabia) { 
		antiRabia = rabia;
	}
	/**
	 * Metodo para asignar una vacuna.
	 * @param gripa vacuna contra la gripa gatuna.
	 */	
	public void setGripaGatuna(String gripa) {
		gripaGatuna = gripa;
	}
	/**
	 * Metodo para asignar una vacuna.
	 * @param fiebre vacuna contra la fiebre minina.
	 */	
	public void setFiebreMinina(String fiebre) {
		fiebreMinina = fiebre;
	}
	/**
	 * Metodo para asignar una vacuna.
	 * @param covid vacuna contra el covid en mascotas.
	 */
	public void setCovidEnMascotas(String covid) {
		covidEnMascotas = covid;
	}		



	//GET
	/**
	 * Metodo para ver si ya se aplico una vacuna.
	 */
	public String getAntiRabia() {
		return antiRabia;
	}

	/**
	 * Metodo para ver si ya se aplico una vacuna.
	 */
	public String getGripaGatuna() {
		return gripaGatuna;
	}

	/**
	 * Metodo para ver si ya se aplico una vacuna.
	 */

	public String getFiebreMinina() {
		return fiebreMinina;
	}

	/**
	 * Metodo para ver si ya se aplico una vacuna.
	 */
	public String getCovidEnMascotas() {
		return covidEnMascotas;
	}


	//metodo para aplicar vacunas
	/**
	 * Metodo para aplicar una vacuna al gato dependiendo de las vacunas previas.
	 * @param p recibe una vacuna.
	 */
	public void aplicaVacuna(String p) {
		if (antiRabia.equals("No aplicada") && p.equals("Anti-rabia")) {
			antiRabia = "Aplicada";
		} else if (antiRabia.equals("Aplicada") && p.equals("Anti-rabia")) {
			System.out.println("El gatito ya tiene dicha vacuna");
		} 
		
		if (gripaGatuna.equals("No aplicada") && p.equals("Gripa gatuna")) {
			gripaGatuna = "Aplicada";
		} else if (gripaGatuna.equals("Aplicada") && p.equals("Gripa gatuna")) {
			System.out.println("El gatito ya tiene dicha vacuna");
		}

		if (fiebreMinina.equals("No aplicada") && p.equals("Fiebre minina")) {
			fiebreMinina = "Aplicada";
		} else if (fiebreMinina.equals("Aplicada") && p.equals("Fiebre minina")) {
			System.out.println("El gatito ya tiene dicha vacuna");
		}

		if (covidEnMascotas.equals("No aplicada") && p.equals("Covid en mascotas")
			       			       	&& gripaGatuna.equals("Aplicada")) {
			covidEnMascotas = "Aplicada";
		} else if (covidEnMascotas.equals("No aplicada") && p.equals("Covid en mascotas")) {
			System.out.println("Solo se puede aplicar la vacuna del Covid en mascotas si el gato cuenta con la vacuna de la gripa gatuna");	
		} else if (covidEnMascotas.equals("Aplicada") && p.equals("Covid en mascotas")) {
			System.out.println("El gatito ya tiene dicha vacuna");
		}
		
	}

	//toString
	/**
	 * Metodo que imprime la lista de vacunas.
	 */
	public String toString() {
		return "Anti-rabia: " + antiRabia + "\n" + 
		       "Gripa gatuna: " + gripaGatuna + "\n" + 
		       "Fiebre minina: " + fiebreMinina + "\n" + 
		       "Covid en mascotas: " + covidEnMascotas + 
		       "\n***********************************";	
	}	

}
