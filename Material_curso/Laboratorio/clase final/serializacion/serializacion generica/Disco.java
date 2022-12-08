/** Clase para crear objetos de tipo Disco
*/
public class Disco extends Articulo{
	private String idioma;
	private String genero;
	int canciones;
	/**Constructor que inicializa las variables con los valores pasados como parametros
	@param titulo Nombre del Disco
	@param autor Interprete del Disco
	@param anio Anio de lanzamiento
	@param idioma Idioma del Disco
	@param canciones Numero de canciones del Disco
	@param genero Genero musical del disco
	*/
	public Disco(String titulo,String autor,int anio,String idioma,int canciones,String genero){
	super (titulo,autor,anio);
	this.idioma=idioma;	
	this.genero=genero;	
	this.canciones=canciones;	
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
	@param genero Genero musical del disco
	*/
	public void setGenero(String genero){
		this.genero=genero;
	}
	/**Metodo para obtener el valor de la variable canciones
	@return canciones
	*/
	public int getCanciones(){
		return canciones;
	}	
	/**Metodo  para asignar valor a variable canciones
	@param canciones Numero de canciones del Disco
	*/
	public void setCanciones(int canciones){
		this.canciones=canciones;
	}
		
	/** Metodo para recuperrar el objeto en forma de cadena
	* @return cadena con los valores del objeto en formato
	*/
	public String toString(){
		return "Nombre del disco: "+obtenerTitulo()+
		"\n"+"Interprete: "+obtenerAutor()+
		"\n"+"Genero: "+genero+"\n"+
		"Numero de canciones: "+canciones+"\n"+
		"Anio de lanzamiento: "+obtenerAnio()+"\n"+
		"Idioma: " + idioma+"\n";
	}

	
}