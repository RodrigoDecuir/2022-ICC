/**
  * Clase para emular una cuenta
  * @see SaldoInsuficienteException
  * @author Ramse Lopez Soto
  * @version 2.0
  */
public class Cuenta {

    double saldo;

    /**
      * Contructor que inicialia un cuenta con un saldo
      * @param saldo - saldo a asignar a la cuenta
      */
	public Cuenta(double saldo){
		this.saldo = saldo;
	}

    /**
      * Metodo para retirar fondos de una cuenta
      * @param monto - cantidad a retirar de una cuenta
      * @throws SaldoInsuficienteException si el monto a retirar es mayor al saldo actual
      */
	public void retiro(double monto) throws SaldoInsuficienteException {
		if((saldo - monto) < 0) {
			throw new SaldoInsuficienteException(saldo);
		}
		saldo -= monto;
	}
    
}