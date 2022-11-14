/**
 * Clase para declarar un numero racional y
 * sus posibles operaciones.
 * @author Rodrigo Andre Decuir Fuentes
 * @version 26 oct 2022
 */

public class Racional {
	
	int numerador;
	int denominador;

	/**
	 * Constructor por parametros.
	 * @param p numerador.
	 * @param q denominador.
	 */
	public Racional(int p, int q) {
		numerador = p;
		denominador = q;
	}
	
	/**
	 * Constructor por omision.
	 */
	public Racional() {
		
	}


	//SET
	/**
	 * Metodo para asignar un numerador.
	 * @param p recibe el numerador.
	 */
	public void setNumerador(int p) {
		numerador = p;
	}
	/**
	 * Metodo para asignar el denominador.
	 * @param q establece el denominador.
	 */
	public void setDenominador(int q) {
		denominador = q;
	}


	//GET
	/**
	 * Metodo para obtener el numerador.
	 */
	public int getNumerador() {
		return numerador;
	}

	/**
	 * Metodo para obtener el denominador.
	 */
	public int getDenominador() {
		return denominador;
	}

	
	//Multiplicacion de fracciones
	/**
	 * Metodo para multiplicar fracciones.
	 * @param r1 recibe el primer racional.
	 * @param r2 recibe el segundo racional.
	 */
	public Racional multiplicacion(Racional r1, Racional r2) {
		int numeradorNuevo = r1.getNumerador()*r2.getNumerador();
		int denominadorNuevo = r1.getDenominador()*r2.getDenominador();
		Racional resultado = new Racional(numeradorNuevo, denominadorNuevo);
		return resultado;
	}

	/**
	 * Metodo para multiplicar fracciones de otro modo.
	 * @param r1 recibe un racional.
	 */
	public Racional multiplicacion2(Racional r1) {
		int numeradorNuevo = r1.getNumerador()*this.getNumerador();
		int denominadorNuevo = r1.getDenominador()*this.getDenominador();
		Racional resultado = new Racional(numeradorNuevo, denominadorNuevo);
		return resultado;

	}


	//simplifica y fraccion mixta ~ completar	
	//simplificar tiene que regresar un objeto racional reducido a su minima expresion
	/**
	 * Metodo para simplificar un racional.
	 * @param r1 es el racional a simplificar.
	 */
	public Racional simplifica(Racional r1) {
		
		//MCD	
		int c = 1;	
		int mcd = 0;
		int n = r1.getNumerador();
		int d = r1.getDenominador(); 
		while (d != 0) {
			c = d;
			d = n % d;
			n = c;
			mcd = n;
		}	
			
		int numeradorNuevo = r1.getNumerador()/mcd;
		int denominadorNuevo = r1.getDenominador()/mcd;
		Racional resultado = new Racional(numeradorNuevo, denominadorNuevo);
		return resultado;

	}

	//recibe un numero racional p/q y muestra como se representa en forma de fraccion mixta
	//ej. 7/3 = 2 1/3
	/**
	 * Metodo para obtener una fraccion mixta a partir de un racional.
	 * @param r1 es el racional a convertir en fraccion mixta.
	 */ 
	public Racional fraccionMixta(Racional r1) {
		int n = r1.getNumerador(); 
		int d = r1.getDenominador();
		int entero = n / d;
		int cociente = n % d;
		Racional resultado = new Racional(cociente, d);
		System.out.print(entero + " ");	
		return resultado;
	}

	/**
	 * Metodo para imprimir el racional.
	 */
	public String toString() {
		return numerador + "/" + denominador;	
	}


	
}
