/**
  * Clase para simular arreglos
  * @see PosicionInvalidaException
  * @see DivisionEntreCeroException
  * @see CantidadInvalidaException
  * @author Ramses Lopez
  * @version 2.0
  */

public class Arreglo {

	private int[] arr;

	/**
	* Crea un arreglo con espacio para n numeros enteros
	* @param n Entero mayor a 0
	* @throws CantidadInvalidaException Si n es menor a 1
	*/
	public Arreglo(int n) throws CantidadInvalidaException{
		if (n <= 0){
			throw new CantidadInvalidaException("La capacidad del arreglo debe ser mayor a 0");
		}
		arr = new int [n];
	}

	/**
	  * Ingresa un numero en la posicion indicada
	  * @param n - Numero a insertar dentro del arreglo
	  * @param i - Posicion en la que se insertara el entero
	  * @throws PosicionInvalidaException Si i no esta dentro del rango permitido
	  */
	public void insertar(int n, int i) throws PosicionInvalidaException{
		if (i < 0 || i > arr.length - 1) {
			throw new PosicionInvalidaException("La posicion es invalida");
		}
		arr[i] = n;
	}

	/**
	  * Devuelve el numero que se encuentra en una posicion dada
	  * @param i - Posicion de la que se quiere obtener un numero
	  * @return int - Numero almacenado en la posicion i
	  * @throws PosicionInvalidaException Si i no esta dentro del rango permitido
	  */
	public int obtener(int i) throws PosicionInvalidaException{
		if (i < 0 || i > arr.length - 1 ) {
			throw new PosicionInvalidaException("La posicion es invalida");
		}
		return arr[i];
	}

	/**
	  * Dadas dos posiciones del arreglo devuelve la division de ambos
	  * @param i1 - Posicion del dividendo
	  * @param i2 - Posicion del divisor
	  * @return int El resultado de la operacion i1/i2
	  * @throws DivisionEntreCeroException Si i2 es igual a cero
	  */
	public int dividir(int i1, int i2) throws DivisionEntreCeroException{
		if (arr[i2] == 0) {
			throw new DivisionEntreCeroException("No puedes dividir entre cero");
		}
		return arr[i1]/arr[i2];
	}
}
