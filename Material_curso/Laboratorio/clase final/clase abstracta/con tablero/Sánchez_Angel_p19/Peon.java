import java.lang.System;
public class Peon extends Piezas{
    //metodo constructorque inicializa con una posicion de coordenadas
    public Peon(String pos){
	super(pos);
    }

    //metodo que regresa la imagen de la pieza
    public String getPieza(){
	return "\u2659";
    }

    //metodo para obtener los posibles movimientos
    public String[] posiblesMov(){        
	String[] posibles = new String[2];
	int x,y;
	x=this.getX();
	y=this.getY();
	if(y == 8){
	    System.out.println("no hay movimientos");
	}else{
	    if(y == 2){
		posibles[0] = x+","+(y+1);
		posibles[1] = x+","+(y+2);
	    }else{
		posibles[0] = x+","+(y+1);
		posibles[1] = null;
	    }
	}
	return posibles;
    }
}
