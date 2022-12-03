
public class Euclides {
	
	public static void main(String[] args) {
		
		int a = 6;
		int b = 9;

		while(b!=0) {


			System.out.println("a%b es residuo de a/b, " + a + "/" + b);
			int r = a%b;

			System.out.println("r " + r);

			a = b;
			b = r;

			System.out.println("a " + a);
			System.out.println("b " + b);

		}


		System.out.println("Final a " + a);




	}




}

