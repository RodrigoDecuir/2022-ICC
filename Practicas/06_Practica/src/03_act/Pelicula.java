/**
 * Clase para crear objetos de tipo Pelicula.
 * @author Rodrigo Andre Decuir Fuentes
 * @version 1.0
 */
public class Pelicula extends Articulo{
    //ATRIBUTOS	
    private String idioma;
	private String genero;
	int duracion;
	/**Constructor que inicializa las variables con los valores pasados como parametros
	@param titulo Nombre de la pelicula
	@param autor Director de la pelicula
	@param anio Anio de lanzamiento
	@param idioma Idioma de la pelicula
	@param canciones Duracion de la pelicula
	@param genero Genero de la pelicula
	*/
	public Pelicula(String titulo,String autor,String genero, int anio, String idioma, int duracion) {
	super (titulo,autor,anio);
	this.idioma=idioma;	
	this.genero=genero;	
	this.duracion=duracion;	
	}
	/**Metodo para obtener el valor de la variable idioma
	@return idioma
	*/
	public String getIdioma(){
		return idioma;
	}
	/**Metodo  para asignar valor a variable idioma
	@param idioma Idioma del Disco
	*/
	public void setIdioma(String idioma){
		this.idioma=idioma;
	}
	/**Metodo para obtener el valor de la variable genero
	@return genero 
	*/
	public String getGenero(){
		return genero;
	}
	/**Metodo  para asignar valor a variable genero
	@param genero Genero de la pelicula
	*/
	public void setGenero(String genero){
		this.genero=genero;
	}
	/**Metodo para obtener el valor de la variable duracion
	@return duracion
	*/
	public int getDuracion(){
		return duracion;
	}	
	/**Metodo  para asignar valor a la duracion
	@param duracion duracion de la pelicula
	*/
	public void setDuracion(int duracion){
		this.duracion=duracion;
	}
	/** Metodo para recuperar el objeto en forma de cadena
	* @return cadena con los valores del objeto en formato
	*/
	public String toString(){
		return "💽Nombre de la pelicula: "+obtenerTitulo()+
		"\n"+"🧑🏻Director: "+obtenerAutor()+
		"\n"+"🎵Genero: "+genero+"\n"+
		"🔢Duracion de la pelicula: "+duracion+"\n"+
		"📅Anio de lanzamiento: "+obtenerAnio()+"\n"+
		"📜Idioma: " + idioma+"\n";
	}
}
