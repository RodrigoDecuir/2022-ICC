
public class CiclosAnidados {
	

	public static void main(String[] args) {


		//Ciclo anidado while
		int i=1;
		int j=1;
		while(i<=5) {
			j=1;
			while(j<=10) {
				System.out.println( i + "," + j);
				j++;
			}
			i++;
		}


		System.out.println("***********************");

		//Ciclo anidado con for
		for(int x=1; x<=5; x++) {

			for(int y=1; y<=10; y++) {
				System.out.println( x + "," + y);
			}

		}

		
	}

}

