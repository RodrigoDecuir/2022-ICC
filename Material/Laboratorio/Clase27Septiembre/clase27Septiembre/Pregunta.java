
public class Pregunta {
	

	public static void main(String[] args) {
		

		int i=1;
		int j=1;
		int k=0;
		while(i<=5) {

			j=i*2;
			while(j>=i) {
				k = (i+j)*3;
				System.out.println("k: " + k);
				j=j-4;
			}
			i++;
			
		}

	}


}
