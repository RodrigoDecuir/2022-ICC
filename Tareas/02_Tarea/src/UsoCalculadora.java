/**
 * Clase para usar la calculadora.
 * @author Rodrigo Andre Decuir Fuentes
 * @version 20 oct 2022
 */

import java.util.*;

public class UsoCalculadora {

	public static void main(String[]args) {	

		Scanner sc = new Scanner(System.in);	

		//variables locales	
		int op = 0;
		int op2 = 0;		
		int prosigue = 1;
		double operando1 = 0;
		double operando2 = 0;
		int operando3 = 0;
		int operando4 = 0;

		//creamos un objeto calculadora 
		Calculadora test = new Calculadora();
	
		while (prosigue == 1) {
			System.out.println("\nTipos de operaciones disponibles: ");
			System.out.println("1. Operacion Binaria");
			System.out.println("2. Operacion Unaria");
			System.out.println("3. Verificar Numero");
			System.out.println("Selecciona el tipo de operacion ingresando un digito (1 o 2 o 3)");
			op = sc.nextInt();
			
			//seleccion de operacion
			if (op == 1) {
				System.out.println("\nOperaciones Binarias:");
				System.out.println("1. +");
				System.out.println("2. -");
				System.out.println("3. *");
				System.out.println("4. /");
				System.out.println("5. ^");
				System.out.println("6. mcm");
				System.out.println("7. MCD");
				System.out.println("Selecciona una operacion:");
				op2 = sc.nextInt();
			} else if (op == 2) {
				System.out.println("\nOperaciones Unarias");
				System.out.println("1. Suma Digitos");
				System.out.println("2. Factorial");
				System.out.println("3. Fibonacci");
				System.out.println("4. Binario");
				System.out.println("5. Raiz Cuadrada");
				System.out.println("Selecciona una operacion:");
				op2 = sc.nextInt();
			} else if (op == 3) {
				System.out.println("\nOperaciones para verificar numeros:");
				System.out.println("1. Es Armstrong");
				System.out.println("2. Es Perfecto");
				System.out.println("Selecciona una operacion:");
				op2 = sc.nextInt();
			}
			
			switch (op) {

				//Operacion Binaria
				case 1:
					switch (op2) {
						case 1:
							System.out.println("\nIngresa 2 numeros para realizar la operacion binaria: ");
							operando3 = sc.nextInt();
							operando4 = sc.nextInt();
							test.suma(operando3, operando4);
							System.out.println(test.toString());
							break;
						case 2:
							System.out.println("\nIngresa 2 numeros para realizar la operacion binaria: ");
							operando3 = sc.nextInt();
							operando4 = sc.nextInt();
							test.resta(operando3, operando4);
							System.out.println(test.toString());
							break;
						case 3:
							System.out.println("\nIngresa 2 numeros para realizar la operacion binaria: ");
							operando3 = sc.nextInt();
							operando4 = sc.nextInt();
							test.multiplicacion(operando3, operando4);
							System.out.println(test.toString());
							break;
						case 4:	
							System.out.println("\nIngresa 2 numeros para realizar la operacion binaria: ");
							operando1 = sc.nextDouble();
							operando2 = sc.nextDouble();
							test.division(operando1, operando2);
							System.out.println(test.toString());
							break;
						case 5:
							System.out.println("\nIngresa 2 numeros para realizar la operacion binaria: ");
							operando3 = sc.nextInt();
							operando4 = sc.nextInt();
							test.potencia(operando3, operando4);
							System.out.println(test.toString());
							break;
						case 6:
							System.out.println("\nIngresa 2 numeros para realizar la operacion binaria: ");
							operando3 = sc.nextInt();
							operando4 = sc.nextInt();
							test.mcm(operando3, operando4);
							System.out.println(test.toString());
							break;
						case 7:
							System.out.println("\nIngresa 2 numeros para realizar la operacion binaria: ");
							operando3 = sc.nextInt();
							operando4 = sc.nextInt();
							test.MCD(operando3, operando4);
							System.out.println(test.toString());
							break;
						default:
							System.out.println("Ingrese un digito valido");
					}
					break;

				//Operacion Unaria
				case 2:
					switch (op2) {
						case 1:
							System.out.println("\nIngresa un numero para realizar la operacion unaria: ");
							operando3 = sc.nextInt();
							test.sumaDigitos(operando3);
							System.out.println(test.toString());
							break;
						case 2:
							System.out.println("\nIngresa un numero para realizar la operacion unaria: ");
							operando3 = sc.nextInt();
							test.factorial(operando3);
							System.out.println(test.toString());
							break;
						case 3:
							System.out.println("\nIngresa un numero para realizar la operacion unaria: ");
							operando3 = sc.nextInt();
							test.fibonacci(operando3);
							break;
						case 4:
							System.out.println("\nIngresa un numero para realizar la operacion unaria: ");
							operando3 = sc.nextInt();
							test.binario(operando3);
							break;
						case 5:
							System.out.println("\nIngresa un numero para realizar la operacion unaria: ");
							operando1 = sc.nextDouble();	
							test.raizCuadrada(operando1);
							System.out.println(test.toString());
							break;
						default:
							System.out.println("Ingrese un digito valido");
					}		
					break;

				//Operacion Verificar Numero

				case 3:
					System.out.println("\nIngresa un numero para realizar la operacion verificar numero: ");
					operando3 = sc.nextInt();
					switch (op2) {
						case 1:
							test.esArmstrong(operando3);
							break;
						case 2:
							test.esPerfecto(operando3);
							break;
						default:
							System.out.println("Ingrese un digito valido");
					}
					break;
			default:
				System.out.println("Ingrese un digito valido");
			}				
			System.out.println("\nQuieres realizar otra operacion? Ingresa -> 0/1");
			prosigue = sc.nextInt();
		}	
	}
}
