
public class AtlasMapas extends Libro {
	

	int numeroImagenes;
	String region;

	public AtlasMapas(String ISBN, String tit, String te, Autor a, int ap, int ni, String r) {
		super(ISBN, tit, te, a, ap);
		numeroImagenes = ni;
		region = r;
	}

	/*public void saluda() {
		System.out.println("Hola, soy un atlas de mapas");
	}
	*/

	public String toString() {
		return "ATLAS: " + titulo + "\n" + "ISBN: " + ISBN + "\n" + "Autor: " + autor.getNombre() + "\n" + "Publicado en: " + anioPub + "\n" + "Imágenes: " + numeroImagenes + " de la región " + region;
	}







}
