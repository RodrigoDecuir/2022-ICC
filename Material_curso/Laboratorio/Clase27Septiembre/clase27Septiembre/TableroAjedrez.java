import java.util.Random;

public class TableroAjedrez {
	

	public static void main(String[] args) {

		Random aleatorios = new Random();

		int m = aleatorios.nextInt(8)+1; 
		int n = aleatorios.nextInt(8)+1; 
	
		for(int i=1; i<=8; i++) {
			for(int j=1; j<=8; j++) {

				if(i==m && j==n) {
					System.out.print("P ");
				} else {

					if((i%2==1 && j%2==1) || (i%2==0 && j%2==0)) {
						System.out.print("# ");
					} else {
						System.out.print("- ");
					}
				}
			}
			System.out.println();
		}		
	}


}

