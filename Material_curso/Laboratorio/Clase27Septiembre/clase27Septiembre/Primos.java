
public class Primos {
	
	public static void main(String[] args) {
		

		int contador=0;

		for(int i=1; i<=200; i++) {
			contador=0;
			for(int j=1; j<=i; j++) {
				if( i%j==0) {
					contador++;
				}
			}
			if(contador==2) {
				System.out.println("Es primo " + i);
			} 
		}

	}

}