

public class ProbandoString {
	

	public static void main(String[] args) {
		

		//Probamos charAt
		String cadena = "HolaMundo";

		//Imprimir el caracter en la posición 3
		System.out.println(cadena.charAt(3));
		char car = cadena.charAt(3);
		System.out.println(car);

		//Probar contains
		String cadena1 = "anitalavalatina";
		String cadena2 = "tina";

		boolean respuesta = cadena2.contains(cadena1);
		System.out.println(respuesta);

		//Probando indexOf
		String cadena3 = "";
		int v = cadena3.indexOf("P");
		System.out.println(v);

		//Una cadena es vacía?

		//Probar con empty
		System.out.println(cadena3.isEmpty());

		//Probar con longitud
		System.out.println(cadena3.length());

		boolean cadenaVacia=true;

		if(cadena3.length()>0) {
			System.out.println("La longitud es mayor a cero");
			cadenaVacia=false;
		}

		if(!cadenaVacia) {
			System.out.println("La cadena tiene contenido");
		} else {
			System.out.println("La cadena es nula");
		}
		
		
		String cad1 = "Hoy va a llover";
		String cad2 = "Hoy";

		System.out.println(cad1.startsWith(cad2));

		//Substring
		String cadenaParaSubstring = "El grupode ICC sabe mucho";
		System.out.println(cadenaParaSubstring.substring(6));
		System.out.println(cadenaParaSubstring.substring(6,9));

		


	}



}

