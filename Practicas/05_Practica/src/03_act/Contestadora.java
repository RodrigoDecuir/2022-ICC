/**
 * Clase para ...
 * @author Rodrigo Andre Decuir Fuentes
 * @version 1.0
 */
public class Contestadora {
	
	private Mensaje[] mensaje;	
	//Estructura de la contestadora
    	
	/**
	* Constructor de una contestadora con capacidad para 10 mensajes
	*/
	public Contestadora() {
		Mensaje[] mensaje = new Mensaje[10];		
	}

	/**
	 * Constructor de una contestadora con capacidad para n mensajes
	 * @param n - capacidad de la contestadora
	*/
	public Contestadora(int n) {
		Mensaje[] mensaje = new Mensaje[n];
	}

	/**
	*  Metodo que agrega un nuevo mensaje a la contestadora.
	*  @param nuevoMensaje Nuevo mensaje que sera agregado a la contestadora.
	*/
	public void agregarMensaje(Mensaje nuevoMensaje){
		for(int i=0; i < mensaje.length; i++) {
			if(mensaje[i].fueEscuchado() == true) { 
				mensaje[i] = null;
			} else if(mensaje[i] != null) {
				System.out.println("La Contestadora esta llena!");
			}		
		} 
	}
    
	/**
	*  Metodo que imprime en pantalla el contenido de la contestadora.
	*/
	public void escucharMensajes(){
		for(int i=0; i < mensaje.length; i++) {
			if(mensaje[i].fueEscuchado() == true) {
				mensaje[i].escucha();
			} else if(mensaje[i].fueEscuchado() != true) {
				System.out.println("No hay mensajes sin escuchar");
			}	
		}	
	}
    
	/**
	*  Metodo que imprime en pantalla el contenido del mensaje reciente.
	*/
	public void escucharMensajeReciente(){
		int mensajesLeidos = 0;
		for(int i=0; i < mensaje.length; i++) {
			if(mensaje[i].fueEscuchado() == true) {
				mensaje[i].escucha();
				mensajesLeidos ++;
			} else if(mensaje[i].fueEscuchado() != true) {
				System.out.println("No hay mensajes sin escuchar");
			}	
		}	 
		System.out.println("Cantidad de mensajes leidos: " + mensajesLeidos);
	}
        
}
