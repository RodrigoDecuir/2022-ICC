import java.util.Scanner;
/**
  * Clase para probar una cuenta
  * @see Cuenta
  * @author Ramses Lopez Soto
  * @version 2.0
  */
public class PruebaCuenta {

	public static void main(String[] args) {

		double s = 1000.00;
		Cuenta c = new Cuenta(s);
		Scanner in = new Scanner(System.in);

		try {
			System.out.println("Saldo actual: " + c.saldo );
			c.retiro(500);
			System.out.println("Retiramos: $500.00");
			System.out.println("Saldo actual: " + c.saldo + "\n");
	
			System.out.println("Retiramos $3500");
			c.retiro(3500);
			System.out.println("Retiramos $3500.00\nSaldo actual: " + c.saldo);
		}catch(Exception e){
			System.out.println(e.getMessage());
			//System.out.println("toString:" +  e.toString());
		}

	}
}