/**
  * Excepcion para saldo insuficiente en una cuenta
  * @author Ramses Lopez Soto
  * @version 2.0
  */
public class SaldoInsuficienteException extends Exception{

	private double saldo;

	/**
	  * Constructor que inicializa en saldo en -1
	  */
	public SaldoInsuficienteException(){
		super();
		this.saldo = -1;
	}

	/**
	 * Constructor que recibe el saldo actual
	 * @param  saldo monto actual en la cuenta
	 */
	public SaldoInsuficienteException(double saldo){
		this.saldo = saldo;
	}

	public String getMessage(){
		if(saldo !=-1) {
			return "Saldo insuficiente. Actualmente cuentas con $" + saldo + " en tu cuenta.";
		}
		return null;
	}
}