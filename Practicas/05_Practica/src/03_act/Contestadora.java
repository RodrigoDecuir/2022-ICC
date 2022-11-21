/**
 * Clase para almacenar y manejar mensajes.
 * @author Rodrigo Andre Decuir Fuentes
 * @version 1.0
 */

public class Contestadora {
	
	Mensaje[] mensaje;	

	//Estructura de la contestadora	
	/**
	* Constructor de una contestadora con capacidad para 10 mensajes.
	*/
	public Contestadora() {
		mensaje = new Mensaje[10];		
	}

	/**
	 * Constructor de una contestadora con capacidad para n mensajes.
	 * @param n - capacidad de la contestadora
	*/
	public Contestadora(int n) {
		mensaje = new Mensaje[n];
	}


	/**
	*  Metodo que agrega un nuevo mensaje a la contestadora.
	*  @param nuevoMensaje Nuevo mensaje que sera agregado a la contestadora.
	*/
	public void agregarMensaje(Mensaje nuevoMensaje){
		int contador = 0;
	
		for(int i=1; i < mensaje.length; i++) {
			if((mensaje[i]==null) || (mensaje[i].fueEscuchado()==true))  { 
				mensaje[i] = nuevoMensaje;
				break;
			}
		}
		
		for(int i=1; i < mensaje.length; i++) {
			if(mensaje[i] != null) {
				contador++;
			}
		}

		if(contador == mensaje.length) {
			System.out.println("La Contestadora esta llena!");
		}

	}
   

	/**
	*  Metodo que imprime en pantalla el contenido del mensaje reciente.
	*/
	public void escucharMensajeReciente(){
		int mensajeReciente = 1;
		for(int i = mensaje.length-1; i >= 0; i--) {
			if(mensaje[i] != null) {
				if((mensajeReciente == 1) && (mensaje[i].fueEscuchado() == false)) {
					System.out.print("Mensaje mas reciente--> ");	
					System.out.println(mensaje[i].escucha());
					mensajeReciente++;
					break;
				} else if(mensaje[i].fueEscuchado() == false) {
					System.out.println("No hay mensajes sin escuchar");
					break;
				}
			}	
		}	 
	}

    
	/**
	*  Metodo que imprime en pantalla el contenido de la contestadora.
	*/
	public void escucharMensajes(){
		int mensajesLeidos = 0;
		for(int i=1; i < mensaje.length; i++) {
			if((mensaje[i] != null) && (mensaje[i].fueEscuchado() == false)) {
				System.out.print("Mensaje " + i + ": ");	
				System.out.println(mensaje[i].escucha());
				mensajesLeidos++;
			}	
		}	

		if(mensajesLeidos > 0) {	
			System.out.println(mensajesLeidos + " mensaje(s) escuchados");
		} else if(mensajesLeidos == 0) {
			System.out.println("No hay mensaje(s)");
			System.out.println("");
		}
	}
        
}
