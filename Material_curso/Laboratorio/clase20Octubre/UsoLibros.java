	

public class UsoLibros {
	

	public static void main(String[] args) {

		Autor au1 = new Autor("Oscar Wilde", "irlandesa", true);
		Autor au2 = new Autor("Herman Melville", "USA", true);
		Autor au3 = new Autor("Rosell Norving", "USA", true);
		Autor au4 = new Autor("Adolfo Villegas", "mexicano", false);

		Libro libro1 = new Libro("AHSJKSK-11", "EL ruiseñor y la rosa", "Drama", au1, 1900);
		Libro libro2 = new Libro("BBB222-WE", "El príncipe feliz", "Aventuras", au2, 1900);

		Libro chismoso = new Libro();


		System.out.println(au1);
		System.out.println(libro1);

		libro2.mismoAutorVersion1(libro1, libro2);
		libro1.mismoAutorVersion2(libro2);

		libro1.mismoTema(libro2);


		libro1.getMasReciente(libro2);


		AtlasMapas atlas1 = new AtlasMapas("HAJA-111", "África insólita", "Geografía", au4, 2020, 200, "África");

		System.out.println(atlas1);

		System.out.println(atlas1.getAutor().getNombre());


		atlas1.saluda();

	}






}



