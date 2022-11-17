/**
 * Clase para...
 * @author Rodrigo Andre Decuir Fuentes
 * @version 1.0
 */

public class Mensaje {

	private String contenido;
	private boolean escuchado;
    
	public Mensaje(String contenido) {
		this.contenido = contenido;
		this.escuchado = false;	
	}
    	
	public boolean fueEscuchado() {	
		return this.escuchado;
	}
    
	public String escucha() {
		this.escuchado = true;
		return this.contenido;
	}

}
