/**
 * Clase para simular el comportamiento de una cuenta de banco
 * @author Rodrigo Andre Decuir Fuentes
 * @version 15 oct 2022
 */

import java.util.Random;

public class Cuenta {

	static Random r = new Random();

//--------------------------------------------------------
	
	//variables no visibles

	private static int a = r.nextInt(10000)+1000;
	private static int b = r.nextInt(10000)+1000;
	private static int c = r.nextInt(10000)+1000;
	private static int d = r.nextInt(10000)+1000;

	public static String numeroCuenta;

//---------------------------------------------------------
	
	//variables visibles
	
	public double saldoInicial;
	public double totalPuntos;
	public double monto;
	public double pago;
	public String nombre;
	public String direccion;
	public String telefono;	
	
//----------------------------------------------------------

	//metodos constructores

	/**
	 * Constructor para crear una cuenta.
	 * @param saldoInicial Establece un saldo inicial.
	 * @param nombre Establece el nombre del usuario de la cuenta. 
	 * @param direccion Establece la direccion del usuario de la cuenta.
	 * @param telefono Establece el telefono del usuario de la cuenta. 
	 */
	public Cuenta (double saldoInicial, String nombre, String direccion, String telefono) {	
		this.saldoInicial = saldoInicial;
		this.nombre = nombre;
		this.direccion = direccion;
		this.telefono = telefono;
		System.out.println("Saldo inicial: " + saldoInicial + ". Nombre: " + nombre + ". Direccion: " + direccion + ". Telefono: " + telefono + ".");
	}

//----------------------------------------------------------
	
	//metodos observadores
	
	/**
	 * Regresa el saldo actual.
	 * @return el saldo actual.
	 */
	public double getSaldo() {
		return saldoInicial;
	}

	/**
	 * Regresa el numero de cuenta.
	 * @return el numero de cuenta.
	 */
	public String getNumeroCuenta() {
		String numeroCuenta = (a + " " + b + " " + c + " " + d); 
		return numeroCuenta;
	}
	
	/**
	 * Regresa los puntos totales.
	 * @return los puntos totales.
	 */
	public double getTotalPuntos() {
		return totalPuntos;
	}

	/**
	 * Regresa el nombre.
	 * @return el nombre.
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Regresa la direccion.
	 * @return la direccion.
	 */
	public String getDireccion() {
		return direccion;
	}

	/**
	 * Regresa el telefono.
	 * @return el telefono.
	 */
	public String getTelefono() {
		return telefono;
	}

//----------------------------------------------------------
	
	//metodos modificadores
	
	/**
	 * Define el saldo
	 * @param saldoInicial el saldo.
	 */
	public void setSaldo(double saldoInicial) {
		this.saldoInicial = saldoInicial;
	}

	/**
	 * Define los puntos totales.
	 * @param totalPuntos los puntos totales.
	 */
	public void setTotalPuntos(double totalPuntos) {
		this.totalPuntos = totalPuntos;	
	}

	/**
	 * Define el nombre.
	 * @param nombre el nombre del usuario.
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;	
	}

	/**
	 * Define la direccion.
	 * @param direccion la direccion del usuario.
	 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;	
	}

	/**
	 * Define el telefono.
	 * @param telefono el telefono del usuario.
	 */
	public void setTelefono(String telefono) {
		this.telefono = telefono;	
	}

//----------------------------------------------------------

	//metodos calculadores

	/**
	 * Realiza un deposito.
	 * @param monto el monto del deposito.	
	 */

	public void depositar(double monto) {
		if (monto > 1) {
			this.saldoInicial = saldoInicial + monto;	
		}
		System.out.println(monto);
	}

	/**
	 * Realiza un retiro.
	 * @param monto el monto del retiro.  */ 
	public void retirar(double monto) {
		if (saldoInicial > 0 && monto > 1) {
			this.saldoInicial = saldoInicial - monto;
		}
		System.out.println(monto);
	}

	/**
	 * Realiza el pago de un servicio.
	 * @param pago el monto del pago.
	 */
	public void pagoServicios(double pago) {
		if ((pago > 0) && (saldoInicial > 0)) {
			this.pago = pago;
			if (this.pago > 1000) {
				this.totalPuntos = (10 * this.pago) / 100;
			} else if (this.pago < 1000 && this.pago >= 500) {
				this.totalPuntos = (5 * this.pago) / 100;
			} else if (this.pago < 500) {
				this.totalPuntos = 0;
			} else {}
		}
		System.out.println(pago);
	}

	/**
	 * Genera un numero de cuenta.
	 */
	public static void generaNumeroCuenta() {		
	}

//----------------------------------------------------------

}	
