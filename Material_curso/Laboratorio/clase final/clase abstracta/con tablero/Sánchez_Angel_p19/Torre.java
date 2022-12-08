import java.lang.System;
public class Torre extends Piezas{
    //metodo constructorque inicializa con una posicion de coordenadas
    public Torre(String pos){
	super(pos);
    }

    //metodo que regresa la imagen de la pieza
    public String getPieza(){
	return "\u2656";
    }

    //metodo para obtener los posibles movimientos
    public String[] posiblesMov(){
	String[] posibles = new String[14];
	int x,y,contador;
	x = this.getX();
	y = this.getY();

	contador=0;
	for(int i=x; i<8; i++){
	    posibles[contador] = (i+1)+","+(y);
	    contador=contador+1;
	}
	for(int i=x; i>1; i--){
	    posibles[contador] = (i-1)+","+(y);
	    contador=contador+1;
	}//7
	for(int i=y; i<8; i++){
	    posibles[contador] = (x)+","+(i+1);
	    contador=contador+1;
	}//13
	for(int i=y; i>1; i--){
	    posibles[contador] = (x)+","+(i-1);
	    contador=contador+1;
	}

	return posibles;
	
    }
}
