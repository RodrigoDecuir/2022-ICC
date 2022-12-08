
public class Torre extends Pieza{

	private String color;
	private int x;
	private int y;
	/**
	 * Constructor de Torre
	 * @param color color de la pieza
	 * @param x coordenada x
	 * @param y coordenada y
	 */
	public Torre(String color,int x,int y){
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
	 * En este caso que es la torre, se puede mover en todas
	 * casillas de su x como de y, pero no en diagonal, asi que solo
	 * se hacen las cuentas para ello.
	 * 
	 * @return cadena de todos los posibles movimientos de la pieza.
	 */
	public String posiblesMovimientos(){
		String cadena="";
		for(int i=1; i<=8;i++){
			if(i!=this.y){
				cadena+="("+this.x+","+i+")";
			}
			if(i!=this.x){
				cadena+="("+i+","+this.y+")";
			}
		}
		return cadena;
	}

}