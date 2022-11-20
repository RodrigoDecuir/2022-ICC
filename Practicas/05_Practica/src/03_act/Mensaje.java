/**
 * Clase para manejar mensajes de texto.
 * @author Rodrigo Andre Decuir Fuentes
 * @version 1.0
 */

public class Mensaje {
	
	//ATRIBUTOS
	private String contenido;
	private boolean escuchado;
   	
	/**
	 * Constructor del mensaje(recibe el mensaje 
	 * y lo marca como no leido).
	 * @param contenido -- contenido del mensaje.
	 */	
	public Mensaje(String contenido) {
		this.contenido = contenido;
		this.escuchado = false;	
	}
    
	/**
	 * Metodo para saber si el mensaje ya fue escuchado.
	 * @return boolean -- true si el metodo fue escuchado, falso en caso contrario.	
	 */
	public boolean fueEscuchado() {	
		return this.escuchado;
	}
   	
       	/**
	 * Metodo para escuchar un mensaje.
	 * @return String -- cadena con el mensaje que se ha escuchado.
	 */	
	public String escucha() {
		this.escuchado = true;
		return this.contenido;
	}

}
