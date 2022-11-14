/**
 * Clase para usar 3 metodos no vistos en clase
 * @author Rodrigo André Decuir Fuentes
 */

// Los 3 metodos van a ser:
// concat, subSequence y replaceAll

public class elmetod {
	public static void  main(String[]args){

		String d1 = "Luke"; 
		String d2 = "Lindy";
		String d3 = "Land";
		String d4 = "Larbs";
		String d5 = "Dos son tres, tenlo presente, tres son cuatro, si los miras con ojos inteligentes.";
		String d6 = "Mis primeros padres fueron Mamá Lupe y Papá Guille.";
		String d7 = "La realidad es una broma que ya me está poniendo nervioso.";
		String d8 = "Un pastel de cumpleaños en tu cumpleaños.";
/*
 * El método concat() nos permite concadenar cadenas o Strings,
 * es decir, 
 * permite unir estrechamente dos elementos del tipo String.
 */
		System.out.println("\n" + "Vamos a empezar con el metodo concat()\n ");	
		System.out.println("Concadenar " + d1 + " + Smith + . + xyz , nos da: " + "\n" + d1.concat ("Smith").concat(".").concat("xyz \n"));
		System.out.println("Concadenar " + d2 + " + Press + . + net , nos da: " + "\n" + d2.concat("Press").concat(".").concat("net \n"));
		System.out.println("Concadenar " + d3 + " + Chad + . + net , nos da: \n" +  d3.concat("Chad").concat(".").concat("net \n"));
		System.out.println("Concadenar " + d4 + " + . + xyz , nos da: \n" +  d4.concat(".").concat("xyz \n"));

		System.out.println("--------------------------------------------------------------------\n");
/*
 * El método subSequence() nos permite abstraer una cantidad de caracteres,
 * dependiendo de que quieras extraer de una cadena.
 *
 *
 */
		System.out.println("Vamos a continuar con el metodo subSequence()\n ");
		System.out.println("Sacar el subSequence(0,2) de " + d1 + " nos regresa: " + d1.subSequence(0,2) + "\n");
		System.out.println("Sacar el subSequence(0,3) de " + d2 + " nos regresa: " + d2.subSequence(0,3) + "\n");
		System.out.println("Sacar el subSequence(0,4) de " + d3 + " nos regresa: " + d3.subSequence(0,4) + "\n");
		System.out.println("Sacar el subSequence(0,5) de " + d4 + " nos regresa: " + d4.subSequence(0,5) + "\n");

		System.out.println("--------------------------------------------------------------------\n");

/*
 * El método replaceAll() nos permite sustituir una cadena por otra,
 * al aplicarlo en caso de que la cadena que estamos sustituyendo se 
 * repita multiples veces lo que queramos poner en lugar de eso 
 * se va a susitutir para todas las partes que contengan la misma palabra o oración.
 */
		System.out.println("Por último vamos a ver el método replaceAll \n");
		System.out.println("Aplicar replaceAll a: " + d5 + "\nNos da: " + d5.replaceAll("tres", "cuatro") + "\n");	
		System.out.println("Aplicar replaceAll a: " + d6 + "\nNos da: " + d6.replaceAll("Lupe", "Guille") + "\n");
		System.out.println("Aplicar replaceAll a: " + d7 + "\nNos da: " + d7.replaceAll("realidad", "ilusión") + "\n");
		System.out.println("Aplicar replaceAll a: " + d8 + "\nNos da: " + d8.replaceAll("cumpleaños", "juego") + "\n");
	}
}
