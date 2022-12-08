
public class Caballo extends Pieza{

	private String color;
	private int x;
	private int y;
	/**
	 * Constructor de caballo
	 * 
	 * @param color color del caballo
	 * @param x coordenada x de la pieza
	 * @param y coordenada y de la pieza
	 */
	public Caballo(String color,int x,int y){
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
	 * En este caso del caballo las cuentas que se hacen son 
	 * para simular el movimiento en L del caballo a lo largo del 
	 * tablero que este dentro de los limites 1 y 8.
	 * 
	 * @return cadena de todos los posibles movimientos de la pieza.
	 */
	public String posiblesMovimientos(){
		int[] arregloX= {-1,1};
		int[] arregloY= {2,2};
		int[] arregloX2={-2,2};
		String cadena="";

		for(int i=0; i< arregloX.length ;i++){
			//los de arriba
			int nuevaX=this.x+ arregloX[i];
			int nuevaY=this.y+ arregloY[i];
			//los de abajo
			int nuevaX2=this.x+ arregloX[i];
			int nuevaY2=this.y+ (-2);

			//los de a lado arriba
			int nuevaX3=this.x+ arregloX2[i];
			int nuevaY3=this.y+ 1;

			//los de a lado abajo
			int nuevaX4=this.x+ arregloX2[i];
			int nuevaY4=this.y+ (-1);

			if((nuevaX>0 && nuevaY>0) && (nuevaX <=8 && nuevaY <=8)){
				cadena+="("+nuevaX+","+nuevaY+")";
			}

			if((nuevaX2>0 && nuevaY2>0) && (nuevaX2 <=8 && nuevaY2 <=8)){
				cadena+="("+nuevaX2+","+nuevaY2+")";
			}
			if((nuevaX3>0 && nuevaY3>0) && (nuevaX3 <=8 && nuevaY3 <=8)){
				cadena+="("+nuevaX3+","+nuevaY3+")";
			}
			if((nuevaX4>0 && nuevaY4>0) && (nuevaX4 <=8 && nuevaY4 <=8)){
				cadena+="("+nuevaX4+","+nuevaY4+")";
			}
		}
		return cadena;
	}

}