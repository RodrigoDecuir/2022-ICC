
public class Tarjeta {
	
	
	char simbolo;
	boolean nombrada;


	public Tarjeta() {
		
	}

	public Tarjeta(char s, boolean n) {
		simbolo = s;
		nombrada = n;
	}


	public void setNombrada(boolean n) {
		nombrada = n;
	}

	public char getSimbolo() {
		return simbolo;
	}

	public boolean getNombrada() {
		return nombrada;
	}


	public String toString() {
		String s = "";
		s = simbolo + " " ;
		return s;
	}



}

