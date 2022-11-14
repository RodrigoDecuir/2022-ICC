/**
 * Clase para realizar operaciones.
 * @author Rodrigo Andre Decuir Fuentes
 * @version 20 oct 2022
 */

import java.util.*;

public class Calculadora {

	static Scanner sc = new Scanner(System.in);

//------------------------------------------

	//variables visibles
	public double operando1 = 0;
	public double operando2 = 0;
	public int operando3 = 0;
	public int operando4 = 0;
	public double resultado1 = 0;
	public int resultado2 = 0; 
	public double c1 = 1;
	public int c2 = 1;

//------------------------------------------

	//constructor por omision
	/**
	 * Constructor por omision.
	 */
	public Calculadora() { }

//------------------------------------------------


	//metodos modificadores 
	
	//metodos operacion binaria
	/**
	 * Metodo para obtener la suma de dos numeros.
	 * @param operando3 recibe un numero del usuario.
	 * @param operando2 recibe un numero del usuario.
	 */
	public void suma(int operando3, int operando4) {
		resultado2 = operando3 + operando4;	
	}		
	/**
	 * Metodo para obtener la resta de dos numeros.
	 * @param operando3 recibe un numero del usuario.
	 * @param operando4 recibe un numero del usuario.
	 */ 
	public void resta(int operando3, int operando4) {
		resultado2 = operando3 - operando4;
	}
	/**
	 * Metodo para obtener la multiplicacion de dos numeros.
	 * @param operando3 recibe un numero del usuario.
	 * @param operando2 recibe un numero del usuario.	
	 */
	public void multiplicacion(int operando3, int operando4) {
		resultado2 = operando3 * operando4;
	} 
	/**
	 * Metodo para obtener la divison de dos numeros.
	 * @param operando1 recibe un numero del usuario.
	 * @param operando2 recibe un numero del usuario.
	 */
	public void division(double operando1, double operando2) {
		resultado1 = operando1 / operando2;
	}
	/**
	 * Metodo para obtener la potencia de n a la m.
	 * @param operando3 recibe un numero del usuario.
	 * @param operando4 recibe un numero del usuario.
	 */
	public void potencia(int operando3, int operando4) {
		resultado2 = 1;	
		c2 = 1;
		while (c2 <= operando4) {
			resultado2 = resultado2 * operando3;	
			c2++;
		}	
	}
	/**
	 * Metodo para obtener el minimo comun multiplo de 2 numeros.
	 * @param operando3 recibe un numero del usuario.
	 * @param operando4 recibe un numero del usuario.
	 */ 
	public void mcm(int operando3, int operando4) {
		while (operando4 != 0) {
			c2 = operando4;
			operando4 = operando3 % operando4;
			operando3 = c2;
			resultado2 = operando3;
		}			
		resultado2 = (operando3 * operando4) / resultado2;
	}
	/**
	 * Metodo para obtener el maximo comun divisor de dos numeros.
	 * @param operando3 recibe un numero del usuario. 
	 * @param operando4 recibe un numero del usuario.
	 */
	public void MCD(int operando3, int operando4) {
		while (operando4 != 0) {
			c2 = operando4;
			operando4 = operando3 % operando4;
			operando3 = c2;
			resultado2 = operando3;
		}	
	}

	
	//metodos operacion unaria
	/**
	 * Metodo para realizar la suma de los digitos de un numero.
	 * @param operando3 recibe un numero del usuario.
	 */	
	public void sumaDigitos(int operando3) {
		while (operando3 > 0) {
			if (operando3 != 0) {
				c2 = operando3 % 10;
				resultado2 = resultado2 + c2;
				operando2 = operando3/10;
			} else { }
		}
	}
	/**
	 * Metodo para encontrar el factorial de un numero.
	 * @param operando3 recibe un numero del usuario.
	 */
	public void factorial(int operando3) {
		resultado2 = 1;
		while (c2 < operando3) {
			resultado2 *= ++c2;
		}
	}
	
	/**
	 * Metodo para encontrar la serie de fibonacci de un numero.
	 * @param operando3 recibe un numero del usuario.
	 */
	public void fibonacci(int operando3) {
		int var1 = 0;
		int var2 = 1;
		while (var1 <= operando3) {
			System.out.print(var1 + "  ");	
			int var3 = var1 + var2;
			var1 = var2;
			var2 = var3; 
			c1++;	
		}
	}
	/**
	 * Metodo para pasar un numero de decimal a binario.
	 * @param operando3 recibe un numero del usuario.
	 */
	public void binario(int operando3) {
		String almacen = "";
		int cociente;
		while (operando3 != 0) {
			cociente = operando3 % 2;
			almacen = cociente + almacen;
			operando3 = operando3 / 2;		
		}
		while (almacen.length() != 4) {
			almacen = "0" + almacen;
		}	
		System.out.println(almacen + "");
	}
	/**
	 * Metodo para sacar la raiz cuadrada de un numero.
	 * @param operando1 recibe un numero del usuario.
	 */
	public void raizCuadrada(double operando1) {
		resultado1 = operando1 / 2;
		c1 = 1;
		while ((c1 - resultado1) != 0) {
			c1 = resultado1;
			resultado1 = (c1 + (operando1 / c1)) / 2;
		}
	}
	
		
	//metodos verificar numero
	/**
	 * Metodo para verificar si un numero es armstrong.
	 * @param operando3 recibe un numero del usuario.
	 */
	public void esArmstrong(int operando3) {
		int copiaOperando3 = operando3;
		int suma = 0;
		boolean esArmstrong = true;
		if (operando3 > 100 && operando3 < 1000) {
			while (operando3 > 0 ) {
				c2 = operando3 % 10;
				operando3 = operando3 / 10;
				suma = suma + c2 * c2 * c2;
			}
			if (copiaOperando3 == suma) {
				esArmstrong = true;
				System.out.println("Es armstrong? ---> " + esArmstrong + " " );
			} else {
				esArmstrong = false;
				System.out.println("Es armstrong? ---> " + esArmstrong + " ") ;
			}	

		} else {
			System.out.println("Solo son aceptados numeros de 3 cifras para esta operacion");			
		}
	}
	/**
	 * Metodo para verificar si un numero es perfecto.
	 * @param operando1 recibe un numero del usuario.
	 */
	public void esPerfecto(int operando3) {
		int suma = 0;	
		boolean esPerfecto;
		c2 = 1;
		
		while (c2 <= operando3/2) {
			if (operando3 % c2 == 0) {
				suma = suma + c2;
			}
			c2++;
		}
		if (suma == operando3) {
			esPerfecto = true;
			System.out.println("Es perfecto? ---> " + esPerfecto);
		} else {
			esPerfecto = false;
			System.out.println("Es perfecto? ---> " + esPerfecto);
		}
	}

//------------------------------------------------

	//metodo toString
	/**
	 * Metodo para regresar el resultado.
	 * @return imprime el resultado.
	 */
	public String toString() {
		if (resultado1 != 0) {			
			//resultado con decimales
			return "\nResultado: " + resultado1;
		} else {
			//resultado entero
			return "\nResultado: " + resultado2;
		}
	}

}	
