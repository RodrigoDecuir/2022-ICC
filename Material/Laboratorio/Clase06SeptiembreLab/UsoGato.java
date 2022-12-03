
public class UsoGato {
	

	public static void main(String[] args) {
		

		//Galletita 1
		Gato g1 = new Gato("Félix", "macho", "siamés", true, true, 2);

		//Galletita 2
		Gato g2 = new Gato("Esponjita", "hembra", "egipcia", false, false, 3);

		Gato g3 = new Gato("Botitas", "macho", "egipcia", false, false, 3);



		//Objeto chismoso, fantasma o nulo
		//Gato pruebas = new Gato();
		//pruebas.pelea(g1, g3);

		g1.pelea(g3);


/*


		System.out.println(g1);
		System.out.println(g2);

		//Cambiamos de nombre al gato g1


		g1.setNombre("Betito");


		System.out.println("El gato g1 va a saludar, diciendo su nombre");
		System.out.println(g1.getNombre());


		//queremos conocer si los gatos se pueden cruzar
		if(g1.getGenero().equals(g2.getGenero()) == false) {

			System.out.println("Los gatos son candidatos a cruzarse");

			if(g1.getOperado()==false && g2.getOperado()==false) {

				System.out.println("Podemos cruzar a los gatos");
			} else {
				System.out.println("Al menos uno de ellos está operado :V ");
			}


		} else {
	
			System.out.println("Gatos del mismo sexo no se cruzan");			
		}

*/



	}



}
