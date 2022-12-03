

public class Palindromos {
	

	public static void main(String[] args) {
		

		String cad = "abcdef";
		String cadenaVerificar="";

		int i = cad.length()-1;
		while (i>=0) {
			char c = cad.charAt(i);
			cadenaVerificar += c;
			i--;
		}

		if(cad.equals(cadenaVerificar)) {
			System.out.println("La cadena " +  cad + " es palíndroma");
		} else {
			System.out.println("La cadena " +  cad + " NO es palíndroma");
		}


	}


}
