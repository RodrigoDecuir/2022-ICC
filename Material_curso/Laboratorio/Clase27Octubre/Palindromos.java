
public class Palindromos {
	
	public static void main(String[] args) {

		/*
		char[] cadena = {'o', 's', 'i', 't', 'o', 's'};

		int j=0;
		int seCumple=0;

		for(int i=cadena.length-1; i>=0; i--) {
			if(cadena[j] == cadena[i]) {
				seCumple++;
			}
			j++;
		}

		if(seCumple==cadena.length) {
			System.out.println("La palabra es palídroma");
		} else {
			System.out.println("La palabra NO es palídroma");
		}
		
		*/


		String[] cadena = {"s", "u", "g", "u", "s"};

		int j=0;
		int seCumple=0;


		int a = cadena.length;
		int a2 = (int)a/2;
		int limiteInf = a2-1;

		

		int limiteSuperior = cadena.length-1;


		for(int i=0; i<=limiteInf; i++) {
			if(cadena[i].equals(cadena[limiteSuperior])) {
				seCumple++;
			}
			limiteSuperior--;
		}

		//System.out.println(seCumple);

		if(seCumple==limiteInf+1) {
			System.out.println("La palabra es palídroma");
		} else {
			System.out.println("La palabra NO es palídroma");
		}
		

	}

}
