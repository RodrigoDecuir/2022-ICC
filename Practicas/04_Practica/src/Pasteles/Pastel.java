/**
 * Clase para crear pasteles.
 * @author Rodrigo Andre Decuir Fuentes
 * @version 27 oct 2022
 */

import java.util.*;
import java.lang.Math;

public class Pastel { 

	String saborDelRelleno;
	String saborDelPan;
	String tamanio;
	double precio;
	double frescura;
		
	/**
	 * Constructor por parametros.
	 * @param inside sabor del relleno.
	 * @param flavor sabor del pan.
	 * @param length tamanio del pastel.
	 * @param price precio del pastel.
	 * @param percent frescura del pastel.
	 */
	public Pastel(String inside, String flavor, String length,
		      double price, double percent) {
		saborDelRelleno = inside; 
		saborDelPan = flavor;
		tamanio = length; 
		precio = price; 
		frescura = percent; 
	}
	/**
	 * Constructor por omision.
	 */
	public Pastel() {

	}


	//SET
	/**
	 * Metodo para asignar el sabor del relleno.
	 * @param inside nuevo relleno.
	 */
	public void setSaborDelRelleno(String inside) {
		saborDelRelleno = inside;
	}
	/**
	 * Metodo para asignar el sabor del pan.
	 * @param flavor nuevo sabor.
	 */
	public void setSaborDelPan(String flavor) {
		saborDelPan = flavor;
	}
	/**
	 * Metodo para asingar un nuevo tamanio.
	 * @param length nuevo tamanio.
	 */
	public void setTamanio(String length) {
		tamanio = length;
	}
	/**
	 * Metodo para asingar un nuevo precio.
	 * @param price nuevo precio.
	 */
	public void setPrecio(double price) {
		precio = price;
	}
	/**
	 * Metodo para asignar una nueva frescura.
	 * @param percent nueva frescura.
	 */
	public void setFrescura(double percent) {
		frescura = percent;
	}


	//GET
	/**
	 * Metodo para obtener el sabor del relleno.
	 */
	public String getSaborDelRelleno() {
		return saborDelRelleno;
	}
	/**
	 * Metodo para obtener el sabor del pan.
	 */
	public String getSaborDelPan() {
		return saborDelPan;
	}
	/**
	 * Metodo para obtener el tamanio.
	 */	
	public String getTamanio() {
		return tamanio;
	}
	/**
	 * Metodo para obtener el precio.
	 */
	public double getPrecio() {
		return precio;
	}
	/**
	 * Metodo para obtener la frescura.
	 */
	public double getFrescura() {
		return frescura;
	}



	/**
	 * Metodo para aplicar un descuento al precio de un pastel.
	 * @param porcentaje porcentaje de descuento.
	 */
	public void aplicaDescuento(double porcentaje) {
		porcentaje = (porcentaje / 100) * precio;	
		precio = (precio - porcentaje);	
	}



	/**
	 * Metodo para determinar si dos pasteles comparten el mismo
	 * sabor de relleno y de pan.
	 * @param p pastel a comparar.
	 */ 	
	public boolean mismoSabor(Pastel p) {
		String sabor1 = this.getSaborDelRelleno();		
		String sabor11 = this.getSaborDelPan();
		String sabor2 = p.getSaborDelRelleno();
		String sabor22 = p.getSaborDelPan();
		if (sabor1.equals(sabor2) && sabor11.equals(sabor22)) {
			return true;
		} else {
			return false;
		}	
	}



	/**
	 * Metodo para combinar 2 pasteles con ciertas caracteristicas.
	 * @param p recibe el pastel a combinar.
	 */	
	public Pastel mezclaPasteles(Pastel p) {
		String sabor1 = this.getSaborDelRelleno();
		String sabor11 = this.getSaborDelPan();
		String tamanio1 = this.getTamanio();
		double precio1 = this.getPrecio();
		double frescura1 = this.getFrescura();

		String sabor2 = p.getSaborDelRelleno();
		String sabor22 = p.getSaborDelPan();
		String tamanio2 = p.getSaborDelPan();
		double precio2 = p.getPrecio();
		double frescura2 = p.getFrescura();
		
		//promedio de las frescuras:
		double frescura3 = (frescura1 + frescura2)/2;

		//nuevo tamanio	
		String tamanio3 = "G";

		//sabor de relleno del pastel mas fresco:
		String sabor3 = " ";	
		if (frescura1 >= frescura2) {
			sabor3 = sabor1;
		} else if (frescura2 > frescura1) {
			sabor3 = sabor2;
		}

		//sabor de pan del pastel menos fresco:
		String sabor33 = " ";
		if (frescura1 <= frescura2) {
			sabor33 = sabor11;
		} else if (frescura2 < frescura1) {
			sabor33 = sabor22;
		}

		//precio 30% mas barato que el pastel mas caro
		double precio3 =  0.0;
		double porcentaje = 30.0;

		if (precio2 >= precio3) {
			porcentaje = (porcentaje / 100) * precio2;	
			precio3 = (precio2 - porcentaje);	
		} else if (precio3 > precio2) {
			porcentaje = (porcentaje / 100) * precio3;	
			precio3 = (precio3 - porcentaje);	
		}		
			
		Pastel milagro = new Pastel(sabor3, sabor33, tamanio3, precio3, frescura3); 	
		
		return milagro;
	}



	/**
	 * Metodo para cambiar la frescura de los pasteles.
	 * @param p recibe el pastel.
	 */
	public void caducaPasteles(Pastel p) {
		String sabor0 = p.getSaborDelRelleno();
		String sabor00 = p.getSaborDelPan();
		String tamanio0 = p.getTamanio();
		double precio0 = p.getPrecio();	
		double frescura0 = p.getFrescura();		

		double[] probabilidad = {0.1, 0.4, 1};
		int evento = Arrays.binarySearch(probabilidad, Math.random());
		if (evento < 0) evento = -evento -1;
		switch (evento) {
			case 0:
				frescura0 = 0;
				break;
			case 1:
				frescura0 -= 10;
				break;	
			case 2: 
				frescura0 -= 5;
				break;
		}
	
		Pastel comico = new Pastel(sabor0, sabor00, tamanio0, precio0, frescura0); 	

		System.out.println(comico);
	}	



	/**
	 * Metodo para determinar si es o no conveniente comprar un pastel.
	 * @param p recibe un pastel.
	 */
	public void conviene(Pastel p) {
		String sabor0 = p.getSaborDelRelleno();
		String sabor00 = p.getSaborDelPan();
		String tamanio0 = p.getTamanio();
		double precio0 = p.getPrecio();	
		double frescura0 = p.getFrescura();		
		
		boolean bandera = false; 
		
		/**
		 * Si la frescura del pastel es menor a 90 no 
		 * es conveniente comprar el pastel pues el sabor
		 * no va a ser el mejor.
		 */	
		if (frescura0 > 89) {
			bandera = true;
		} else {
			bandera = false;
			System.out.println("No conviene comprar el pastel");
		}
			
		while (bandera) {
			/**
			 * Si el precio del pastel grande es menor a 650 
			 * es conveniente comprar el pastel.
			 */
			if (tamanio0.equals("G") && precio0 < 650) {
				System.out.println("Conviene comprar el pastel");
				System.out.println("gggg");
				break;
			/**
			 * Si el precio del pastel mediano es menor a 450 
			 * es conveniente comprar el pastel.
			 */
			} else if (tamanio0.equals("M") && precio0 < 450) {
				System.out.println("Conviene comprar el pastel");
				System.out.println("mmmmm");
				break;
			/**
			 * Si el precio del pastel chico es menor a 300 
			 * es conveniente comprar el pastel.
			 */
			} else if (tamanio0.equals("CH") && precio0 < 300) {
				System.out.println("chchchchc");
				System.out.println("Conviene comprar el pastel");
				break;
			} else {
				System.out.println("No conviene comprar el pastel");
				break;
			}
		}
	
	}



	/**
	 * Metodo para imprimir el contenido de los pasteles.
	 */	
	public String toString() {
		return "Sabor del relleno: " + saborDelRelleno
		       	+ " ~ Sabor del pan: " + saborDelPan + 
			" ~ Tamanio: " + tamanio + " ~ Precio: $"
		       	+ precio + " ~ Frescura: " + frescura + "%";	
	}
}
