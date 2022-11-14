/**
 * Clase para simular el comportamiento de una cuenta de banco.
 * @author Rodrigo Andre Decuir Fuentes
 * @version 15 oct 2022
 */ 

public class Cajero {
	
	public static void main(String[] args) {

		//1
		Cuenta cuentaPrincipal = new Cuenta(2000, "Ana", "Neza", "55 4433 2211");		
	       	Cuenta cuentaSecundaria = new Cuenta(1500, "Pepe Juan", "Tlatelolco", "55 9988 7766");

		//2
		System.out.println("Saldo de la primera cuenta: " + cuentaPrincipal.getSaldo());
		System.out.println("Saldo de la segunda cuenta: " + cuentaSecundaria.getSaldo());

		//3
		System.out.print("Retiro de la primera cuenta de: ");
		cuentaPrincipal.retirar(500);

		//4
		System.out.print("Deposito a la segunda cuenta de: ");
		cuentaSecundaria.depositar(300);

		//5
		System.out.println("Saldo de la primera cuenta: " + cuentaPrincipal.getSaldo());
		System.out.println("Saldo de la segunda cuenta: " + cuentaSecundaria.getSaldo());
		
		//6
		System.out.print("Se realizo un retiro en la primera cuenta de: ");
		cuentaPrincipal.retirar(5000);

		//7
		System.out.print("Se realizo un deposito a la segunda cuenta de: ");
		cuentaSecundaria.depositar(-500);

		//8
		System.out.println("Saldo de la primera cuenta: " + cuentaPrincipal.getSaldo());
		System.out.println("Saldo de la segunda cuenta: " + cuentaSecundaria.getSaldo());

		//9
		System.out.print("Se realizo un pago de servicio con la primera cuenta por un monto de: ");
		cuentaPrincipal.pagoServicios(1000);

		//10
		System.out.print("Se realizo un pago de servicio con la segunda cuenta por un monto de: ");
		cuentaSecundaria.pagoServicios(500);
		
		//11
		System.out.println("Puntos de la primera cuenta: " + cuentaPrincipal.getTotalPuntos());
		System.out.println("Puntos de la segunda cuenta: " + cuentaSecundaria.getTotalPuntos());
		
	/*	//12
		System.out.println("ncuenta: " + cuentaPrincipal.getNumeroCuenta());
		System.out.println("nCuenta: " + cuentaSecundaria.getNumeroCuenta());
	*/
	}
}
