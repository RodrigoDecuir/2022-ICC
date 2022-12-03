
public class Punto {
	
	//Atributos
	int coordenada_x;
	int coordenada_y;


	//Constructor
	public Punto(int x, int y) {
		coordenada_x = x;
		coordenada_y = y;
	}


	//Métodos set
	public void setCoordenadaX(int x) {
		coordenada_x = x;
	}

	public void setCoordenadaY(int y) {
		coordenada_y = y;
	}	



	//Métodos get
	public int getCoordenadaX() {
		return coordenada_x;
	}


	public int getCoordenadaY() {
		return coordenada_y;
	}


	public String toString() {
		return "(" +  coordenada_x + "," + coordenada_y + ")";
	}



}


