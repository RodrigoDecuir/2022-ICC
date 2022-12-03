
public class UsoGelatina {
	
	public static void main(String[] args) {

		//SI el sabor es fresa, no creas la gelatina
		String flavor = "fresa";

		/*if(!flavor.equals("fresa")) {
			Gelatina g = new Gelatina(flavor, 3.4);
			System.out.println(g);
		} else {
			System.out.println("No se pueden crear Gelatinas de sabor: " + flavor);


		}
		*/

		
		Gelatina g = new Gelatina(flavor, 3.4);
		System.out.println(g);
		

		


	}





}
