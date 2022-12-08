
public class Rey extends Pieza{
	private String color;
	private int x;
	private int y;
	/**
	 * Constructor de rey
	 * @param color color de la pieza
	 * @param x coordenada x 
	 * @param y coordenada y
	 */
	public Rey(String color,int x,int y){
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
	 * En este caso del rey se hacen las cuentas, para que la 
	 * pieza del rey se pueda mover en todas las direcciones 
	 * pero solo la cantidad de 1.
	 * 
	 * @return cadena de todos los posibles movimientos de la pieza.
	 */
	public String posiblesMovimientos(){
		String cadena="";
		int[] arregloY={1,-1};
		for(int i=0;i<arregloY.length;i++){
			//arriba y abajo en la misma x
			int nuevaX=this.x;
			int nuevaY=this.y+arregloY[i];

			int nuevaX2=this.x-1;
			int nuevaY2=this.y+arregloY[i];

			int nuevaX3=this.x+1;
			int nuevaY3=this.y+arregloY[i];

			int nuevaX4=this.x+arregloY[i];
			int nuevaY4=this.y;

			if(nuevaX>0 && nuevaX<=8 && nuevaY>0 && nuevaY<=8){
				cadena+="("+nuevaX+","+nuevaY+")";
			}
			if(nuevaX2>0 && nuevaX2<=8 && nuevaY2>0 && nuevaY2<=8){
				cadena+="("+nuevaX2+","+nuevaY2+")";
			}
			if(nuevaX3>0 && nuevaX3<=8 && nuevaY3>0 && nuevaY3<=8){
				cadena+="("+nuevaX3+","+nuevaY3+")";
			}
			if(nuevaX4>0 && nuevaX4<=8 && nuevaY4>0 && nuevaY4<=8){
				cadena+="("+nuevaX4+","+nuevaY4+")";
			}
		}
		return cadena;
	}

}