// Importamos la clase Scanner
import java.util.Scanner;
// Le damos un nombre a nuestra clase
public class ZodiaCoco {
	
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
// Inicializamos nuestras variables
// Mes nos va a permitir manipular el mes que el usuario ingrese
// Dia nos va a permitir manipular el dia que el usuario ingrese
// i nos sirve para tomar el momento en que el mes no coincida y para introducir la sentencia while
		int mes, dia, i=0;
			
		do {
		System.out.println("¿En qué mes naciste?");
		mes = entrada.nextInt(); // Guardamos el mes
		
		if (mes < 1 || mes > 12){
			i=1;
			System.out.println("El mes que ingresaste no existe");
		} else
			i=0;

		}while(i==1);
		System.out.println("¿Qué día naciste?");
		dia = entrada.nextInt(); // Guardamos el día	
					 //
		// Probamos para cada caso dependiendo del mes y día que el usuario ingreso
//--------------------------------------------------------------------------------
			if (mes == 1) {
				if (dia >= 20 && dia <= 31){
					System.out.println("Eres aquaaaaaario ♒");
				} else if (dia >= 1 && dia < 20){
					System.out.println("Eres capricoooooornio ♑");
				} else {
					System.out.println("Nunca naciste");}
			}
//---------------------------------------------------------------------------------
			if (mes == 2) {
				if (dia >= 1 && dia <= 18){
					System.out.println("Eres aquaaaaaario ♒");
				} else if (dia > 18 && dia <= 28){
					System.out.println("Eres pisciiiiiis ♓");
				} else {
					System.out.println("Nunca naciste");}
			}
//---------------------------------------------------------------------------------
			if (mes == 3) {
				if (dia >= 1 && dia <= 20){
					System.out.println("Eres pisciiiiiis ♓");
				} else if (dia > 20 && dia <= 31){
					System.out.println("Eres arieeeeees ♈");
				} else { 
					System.out.println("Nunca naciste");}
			}
//---------------------------------------------------------------------------------
			if (mes == 4) {
				if (dia >= 1 && dia <= 19){
					System.out.println("Eres arieeeeees ♈");
				} else if (dia > 19 && dia <= 30){
					System.out.println("Eres tauroooooo ♉");
				} else { 
					System.out.println("Nunca naciste");}
			}
//---------------------------------------------------------------------------------
			if (mes == 5) {
				if (dia >= 1 && dia <= 20){
					System.out.println("Eres tauroooooo ♉");
				} else if (dia > 20 && dia <= 31){
					System.out.println("Eres geminiiiiiis ♊");
				} else { 
					System.out.println("Nunca naciste");}
			}
//--------------------------------------------------------------------------------
			if (mes == 6) {
				if (dia >= 1 && dia <= 20){
					System.out.println("Eres geminiiiiiis ♊");
				} else if (dia > 20 && dia <= 30){
					System.out.println("Eres canceeeeeer ♋");
				} else { 
					System.out.println("Nunca naciste");}
			}
//-------------------------------------------------------------------------------
			if (mes == 7) {
				if (dia >= 1 && dia <= 22){
					System.out.println("Eres canceeeeeer ♋");
				} else if (dia > 22 && dia <= 31){
					System.out.println("Eres leoooooo ♌");
				} else { 
					System.out.println("Nunca naciste");}
			}
//-------------------------------------------------------------------------------
			if (mes == 8) {
				if (dia >= 1 && dia <= 22){
					System.out.println("Eres leoooooo ♌");
				} else if (dia > 22 && dia <= 31){
					System.out.println("Eres virgoooooo ♍");
				} else { 
					System.out.println("Nunca naciste");}
			}
//-------------------------------------------------------------------------------
			if (mes == 9) {
				if (dia >= 1 && dia <= 22){
					System.out.println("Eres virgoooooo ♍");
				} else if (dia > 22 && dia <= 30){
					System.out.println("Eres libraaaaaa ♎");
				} else { 
					System.out.println("Nunca naciste");}
			}
//-----------------------------------------------------------------------------
			if (mes == 10) {
				if (dia >= 1 && dia <= 22){
					System.out.println("Eres libraaaaaa ♎");
				} else if (dia > 22 && dia <= 31){
					System.out.println("Eres escorpioooooo ♏");
				} else { 
					System.out.println("Nunca naciste");}
			}
//-------------------------------------------------------------------------------

			if (mes == 11) {
				if (dia >= 1 && dia <= 21){
					System.out.println("Eres escorpioooooo ♏");
				} else if (dia > 22 && dia <= 30){
					System.out.println("Eres sagitarioooooo ♐");
				} else { 
					System.out.println("Nunca naciste");}
			}
//-------------------------------------------------------------------------------

			if (mes == 12) {
				if (dia >= 1 && dia <= 21){
					System.out.println("Eres sagitarioooooo ♐");
				} else if (dia > 21 && dia <= 31){
					System.out.println("Eres capricornioooooo ♑");
				} else { 
					System.out.println("Nunca naciste");}
			}

	}
}
