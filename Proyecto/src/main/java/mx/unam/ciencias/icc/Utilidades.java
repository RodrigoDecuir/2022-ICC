/**
 * Clase utilidades.
 * @author Rodrigo Andre Decuir Fuentes
 * @version 1.0
 */
package mx.unam.ciencias.icc;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
public class Utilidades {
	//ATTRIBUTES
	Hotel[] arreglo = new Hotel[0];
	//METHODS
	/**
	  * Metodo para agregar un elemento al arreglo
	  * @param elemento elemento que vamos a agregar
	  * @return Arreglo con el elemento insertado
	*/
	public Hotel[] agregarArregloHotel(Hotel elemento) {
		Hotel[] nuevo = new Hotel[arreglo.length+1];
        for(int i=0; i<arreglo.length; i++){
        	nuevo[i] = arreglo[i];
        }
        nuevo[nuevo.length-1] = elemento;
        arreglo = nuevo;
        return arreglo;
	}

	/**
	  * Metodo para leer objetos de un archivo de texto.
	  * @param ruta_del_archivo ruta del archivo donde estan guardado los objetos.
	  * @return Arreglo con todos los elementos guardados en el archivo de texto.
	*/
	public Hotel[] leerObjetosArchivoHotel(String ruta_del_archivo) {
		ObjectInputStream lect = null;
		 // Hacemos un ciclo para poder guardar en nuestro arreglo
		 // todos los objetos del .txt
		try{
			lect = new ObjectInputStream(new FileInputStream(ruta_del_archivo));
			Object objeto;
		do{
			objeto = lect.readObject();
			if (objeto != null){
				agregarArregloHotel((Hotel) objeto);
			}
		}while (objeto != null);

		}catch(java.lang.ClassNotFoundException e){
		}catch(java.io.EOFException e){
		}catch(IOException e){
			System.out.println("Lectura fallida: "+e);
		}finally{
			if(lect !=null){
				try { lect.close();} catch (IOException e){}  
			}
    	}
    	return arreglo;
	}

	/**
	  * Metodo para leer objetos de un archivo de texto.
	  * @param ruta_del_archivo ruta del archivo donde guardaremos los objetos.
	  * @param arreglo Arreglo que contiene los objetos que guardaremos.
	*/
	public void EscribirObjetosArchivo(String ruta_del_archivo, Hotel[] arreglo){
		ObjectOutputStream escritor = null;
		try{
			escritor = new ObjectOutputStream(new FileOutputStream(ruta_del_archivo));
			for(int i=0;i<arreglo.length;i++){
				escritor.writeObject(arreglo[i]);
			}
		}catch(IOException e){
			System.out.println("Error en la grabacion: " + e);
		}finally{
			try{escritor.close();}catch(IOException e){}
		}
	}
}
