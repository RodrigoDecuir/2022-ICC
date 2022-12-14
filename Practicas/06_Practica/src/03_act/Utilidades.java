/**
 * Programa para guardar un objeto Libro
 * @author Rodrigo Andre Decuir Fuentes
 * @version 1.0
 */
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Utilidades {

	Libro[] arreglo = new Libro[100];
    Disco[] arreglo2 = new Disco[100];
    Pelicula[] arreglo3 = new Pelicula[100]; 

	/**
	  * Metodo para agregar un elemento al arreglo
	  * @param elemento. elemento que vamos a agregar
	  * @return Arreglo con el elemento insertado
	*/
	public Libro[] agregarArregloLibro(Libro elemento) {
		Libro[] nuevo = new Libro[arreglo.length+1];
        for(int i=0; i<arreglo.length; i++){
        	nuevo[i] = arreglo[i];
        }

        nuevo[nuevo.length-1] = elemento;

        arreglo = nuevo;

        return arreglo;
	}
    /**
     * Metodo para agregar un elemento al arreglo
     * @param elemento2. elemento que vamos a agregar
     * @return Arreglo con el elemento insertado
     */
    public Disco[] agregarArregloDisco(Disco elemento2) {
        Disco[] nuevo2 = new Disco[arreglo2.length+1];
        for(int j=0; j<arreglo2.length; j++) {
            nuevo2[j] = arreglo2[j];
        }

        nuevo2[nuevo2.length-1] = elemento2;

        arreglo2 = nuevo2;
            
        return arreglo2;
    }
    /**
     * Metodo para agregar un elemento al arreglo 
     * @param elemento3. elemento que vamos a agregar
     * @return Arreglo con el elemento insertado
     */
    public Pelicula[] agregarArregloPelicula(Pelicula elemento3) {
        Pelicula[] nuevo3 = new Pelicula[arreglo3.length+1];
        for(int k=0; k<arreglo3.length; k++) {
            nuevo3[k] = arreglo3[k];
        }

        nuevo3[nuevo3.length-1] = elemento3;

        arreglo3 = nuevo3;
            
        return arreglo3;
    }
	/**
	  * Metodo para leer objetos de un archivo de texto
	  * @param ruta_del_archivo. ruta del archivo donde estan guardado los objetos
	  * @return Arreglo con todos los elementos guardados en el archivo de texto
	*/
	public Libro[] leerObjetosArchivoLibro(String ruta_del_archivo){
		ObjectInputStream lect = null;
		/** 
		 * Hacemos un ciclo para poder guardar en nuestro arreglo
		 * todos los objetos del .txt
    	 */
		try{
			lect = new ObjectInputStream(new FileInputStream(ruta_del_archivo));
			Object objeto;
		do{
			
			objeto = lect.readObject();
			if (objeto != null){
				agregarArregloLibro((Libro) objeto);
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
	  * Metodo para leer objetos de un archivo de texto
	  * @param ruta_del_archivo. ruta del archivo donde estan guardado los objetos
	  * @return Arreglo con todos los elementos guardados en el archivo de texto
	*/
	public Disco[] leerObjetosArchivoDisco(String ruta_del_archivo){
		ObjectInputStream lect = null;
		/** 
		 * Hacemos un ciclo para poder guardar en nuestro arreglo
		 * todos los objetos del .txt
    	 */
		try{
			lect = new ObjectInputStream(new FileInputStream(ruta_del_archivo));
			Object objeto;
		do{
			
			objeto = lect.readObject();
			if (objeto != null){
				agregarArregloDisco((Disco) objeto);
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
    	return arreglo2;
	}

	/**
	  * Metodo para leer objetos de un archivo de texto
	  * @param ruta_del_archivo. ruta del archivo donde estan guardado los objetos
	  * @return Arreglo con todos los elementos guardados en el archivo de texto
	*/
	public Pelicula[] leerObjetosArchivoPelicula(String ruta_del_archivo){
		ObjectInputStream lect = null;
		/** 
		 * Hacemos un ciclo para poder guardar en nuestro arreglo
		 * todos los objetos del .txt
    	 */
		try{
			lect = new ObjectInputStream(new FileInputStream(ruta_del_archivo));
			Object objeto;
		do{
			
			objeto = lect.readObject();
			if (objeto != null){
				agregarArregloPelicula((Pelicula) objeto);
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
    	return arreglo3;
	}
	/**
	  * Metodo para leer objetos de un archivo de texto
	  * @param ruta_del_archivo. ruta del archivo donde guardaremos los objetos
	  * @param arreglo. Arreglo que contiene los objetos que guardaremos
	*/
	public void EscribirObjetosArchivoLibro(String ruta_del_archivo, Libro[] arreglo){
		ObjectOutputStream escritor = null;
		try{
			escritor = new ObjectOutputStream(new FileOutputStream(ruta_del_archivo));
			for(int i=0;i<arreglo.length;i++){
				escritor.writeObject(arreglo[i]);
			}
		}catch(IOException e){
			System.out.println("Error en la grabacion: "+e);
		}finally{
			try{escritor.close();}catch(IOException e){}
		}
	}
	/**
	  * Metodo para leer objetos de un archivo de texto
	  * @param ruta_del_archivo. ruta del archivo donde guardaremos los objetos
	  * @param arreglo. Arreglo que contiene los objetos que guardaremos
	*/
	public void EscribirObjetosArchivoDisco(String ruta_del_archivo, Disco[] arreglo2){
		ObjectOutputStream escritor = null;
		try{
			escritor = new ObjectOutputStream(new FileOutputStream(ruta_del_archivo));
			for(int i=0;i<arreglo2.length;i++){
				escritor.writeObject(arreglo2[i]);
			}
		}catch(IOException e){
			System.out.println("Error en la grabacion: "+e);
		}finally{
			try{escritor.close();}catch(IOException e){}
		}
	}
	/**
	  * Metodo para leer objetos de un archivo de texto
	  * @param ruta_del_archivo. ruta del archivo donde guardaremos los objetos
	  * @param arreglo. Arreglo que contiene los objetos que guardaremos
	*/
	public void EscribirObjetosArchivoPelicula(String ruta_del_archivo, Pelicula[] arreglo3){
		ObjectOutputStream escritor = null;
		try{
			escritor = new ObjectOutputStream(new FileOutputStream(ruta_del_archivo));
			for(int i=0;i<arreglo3.length;i++){
				escritor.writeObject(arreglo3[i]);
			}
		}catch(IOException e){
			System.out.println("Error en la grabacion: "+e);
		}finally{
			try{escritor.close();}catch(IOException e){}
		}
	}

}
