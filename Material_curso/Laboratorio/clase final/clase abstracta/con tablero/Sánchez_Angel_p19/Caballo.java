import java.lang.System;
public class Caballo extends Piezas{
    ////metodo constructorque inicializa con una posicion de coordenadas
    public Caballo(String pos){
	super(pos);
    }

    //metodo que regresa la imagen de la pieza
    public String getPieza(){
	return "\u2658";
    }

    //metodo para obtener los posibles movimientos
    public String[] posiblesMov(){
	String[] posibles = new String[8];
	int x,y;
	x = this.getX();
	y = this.getY();
	
	posibles[0] = (x+2)+","+(y+1);
	posibles[1] = (x+2)+","+(y-1);
	posibles[2] = (x-2)+","+(y+1);
	posibles[3] = (x-2)+","+(y-1);
	posibles[4] = (x+1)+","+(y+2);
	posibles[5] = (x+1)+","+(y-2);
	posibles[6] = (x-1)+","+(y+2);
	posibles[7] = (x-1)+","+(y-2);

	if (y==8){
	    posibles[4] = (x+1)+","+(0);
	    posibles[6] = (x-1)+","+(0);
	}
	
	for(int i=0; i<8; i++){
	    try{
		x = Integer.parseInt(posibles[i].substring(0,1));
		y = Integer.parseInt(posibles[i].substring(2,3));
	    }catch(Exception e){
		x = -2;
		y = -2;
	    }
	    if(x>8||x<1||y>8||y<1){
		posibles[i]=null;
	    }
	}
	return posibles;	
    }
}
