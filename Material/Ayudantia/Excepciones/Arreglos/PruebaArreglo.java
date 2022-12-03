/**
  * Clase para verificar la clase Arreglo
  * @see Arreglo
  * @author Ramses Lopez Soto
  * @version 2.0
  */
public class PruebaArreglo{

	public static void main(String[] args) {
	
		Arreglo a;

		try {
			System.out.println("Creamos arreglo con capacidad para -1 elementos");
			a = new Arreglo(-1);
		} catch (Exception e){
			System.out.println(e);
		} finally {
			System.out.println("Sigue ejecutando ...");
			System.out.println();
		}

		try {
			System.out.println("Creamos arreglo con capacidad para 5 elementos, e insertamos el numero 13 en la posicion 5");
			a = new Arreglo(5);
			a.insertar(13,5);
		} catch (Exception ex){
			System.out.println(ex);
		} finally {
			System.out.println("Sigue ejecutando ...");
			System.out.println();
		}


		try {
			System.out.println("Creamos arreglo con capacidad para 5 elementos y obtenemos el numero almacenado en la posicion -15");
			a = new Arreglo(5);
			a.obtener(-15);
		} catch (Exception ex){
			System.out.println(ex);
		} finally {
			System.out.println("Sigue ejecutando ...");
			System.out.println();
		}

		try {
			System.out.println("Creamos arreglo con capacidad para 5 elementos y dividimos los numeros de la posicion 0 y 3");
			a = new Arreglo(5);
			System.out.println(a.dividir(0,3));
		} catch (Exception ex){
			System.out.println(ex);
		} finally {
			System.out.println("Sigue ejecutando ...");
			System.out.println();
		}



		try {
			System.out.println("Creamos arreglo con capacidad para 5 elementos, lo llenamos, mostramos su informacion y dividmos los numeros de la posicion 4 y 0");
			a = new Arreglo(5);
			for (int i=0, j=10; i<5; i++, j=j-2) {
				a.insertar(j,i);
			}
			for (int i=0; i<5;i++) {
				System.out.print(a.obtener(i) + ", ");
			}
			System.out.println();
			System.out.println("Division: " + a.dividir(0,4));
		} catch (Exception ex) {
			System.out.println(ex);
		} finally {
			System.out.println("Ya acabe :)");
			System.out.println();
		}

	}
}
