
public class Peon extends Pieza{

	private String color;
	private int x;
	private int y;
	/**
	 * Constructor de peon
	 * 
	 * @param color color de la pieza
	 * @param x coordenada x de la pieza
	 * @param y coordenada y de la pieza
	 */
	public Peon(String color, int x, int y){
		this.color=color;
		this.x=x;
		this.y=y;
	}
	/**
	 * Metodo coordenadas
	 * 
	 * Este metodo solo ocupa las mismas variables x,y para 
	 * hacerlos una cadena.
	 * @return cadena que representa las coordenadas de la pieza
	 */
	public String coordenadas(){
		return "("+x+","+y+")";
	}
	/**
	 * Metodo que regresa una cadena con todos los posibles 
	 * movimientos de una pieza.
	 * 
	 * En este caso, peon, se hacen las cuentas para que puede 
	 * moverse solo en la coordenada y, en el caso de que la 
	 * coordenada y sea igual a 2, podra moverse en un +2.
	 * 
	 * @return cadena de todos los posibles movimientos de la pieza.
	 */
	public String posiblesMovimientos(){
		String cadena= "No digitaste las coordenadas correctas";
		if((this.x>0 && this.x<=8) &&(this.y>0 && this.y<=8)){
			cadena= "("+this.x+","+(this.y+1)+")";
			if(this.y==2){
				cadena+=" , "+"("+this.x+","+(this.y+2)+")";
			}
		}
		return cadena;
	}

	public static void main(String [] args){
		Peon peonsito=new Peon("blanco",2,2);
		String movements;
		movements=peonsito.posiblesMovimientos();
		System.out.println(movements);
	}

}