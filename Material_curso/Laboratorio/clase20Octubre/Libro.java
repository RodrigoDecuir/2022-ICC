public class Libro {
	
	String ISBN;
	String titulo;
	String tema;
	Autor autor;
	int anioPub;

	public Libro() {

	}


	public Libro(String ISBN, String tit, String te, Autor a, int ap) {
		this.ISBN = ISBN;
		titulo = tit;
		tema = te;
		autor = a;
		anioPub = ap;
	}

	//Métodos set
	public void setISBN(String ISBN) {
		this.ISBN = ISBN;
	} 

	public void setTitulo(String tit) {
		titulo = tit;
	}


	public void setTema(String te) {
		tema = te;
	}

	public void setAutor(Autor a) {
		autor = a;
	}

	public void setAnioPub(int ap) {
		anioPub = ap;
	}
	

	//Public get
	public String getISBN() {
		return ISBN;
	}

	public String getTitulo() {
		return titulo;
	}

	public String getTema() {
		return tema;
	}

	public Autor getAutor() {
		return autor;
	}

	public int getAnioPub() {
		return anioPub;
	}

	//Imprime en pantalla, si dos libros tienen el mismo
	//autor
	public void mismoAutorVersion1(Libro l1, Libro l2) {
		if(l1.getAutor().getNombre().equals(l2.getAutor().getNombre()) )	{
			System.out.println("Los libros tienen el mismo autor");
		} else {
			System.out.println("Los libros son de autores diferentes");
		}

	}



	public void mismoAutorVersion2(Libro l) {
		if(this.getAutor().getNombre().equals(l.getAutor().getNombre()) )	{
			System.out.println("Los libros tienen el mismo autor");
		} else {
			System.out.println("Los libros son de autores diferentes");
		}

	}


	public void getMasReciente(Libro l) {

		int anio1 = this.getAnioPub();
		int anio2 = l.getAnioPub();

		if(anio1 < anio2)	{
			System.out.println(l.getTitulo() + " es más actual");
		} else if(anio1 > anio2){
			System.out.println(this.getTitulo() + " es más actual");
		} else {
			System.out.println("Tienen la misma fecha de publicación");
		}


	}

	public void saluda() {
		System.out.println("Hola, soy un libro");
	}



	public void mismoTema(Libro l) {
		if(this.getTema().equals(l.getTema()) )	{
			System.out.println("Los libros son del mismo tema");
		} else {
			System.out.println("Los libros son de temas diferentes");
		}

	}



	public String toString() {
		return "LIBRO: " + titulo + "\n" + "ISBN: " + ISBN + "\n" + "Autor: " + autor.getNombre() + "\n" + "Publicado en: " + anioPub;
	}


}

