public abstract class Piezas{
    protected String color;
    protected String posicion = "0,0";    

    //metodo constructor para inicializar una posicion
    public Piezas(String pos){
	posicion = pos;
    }

    //metodo abstracto para ver los posibles movimientos
    public abstract String[] posiblesMov();

    //metodo abstracto para obtener la imagen de la pieza
    public abstract String getPieza();

    //metodo para regresar la x
    public int getX(){
	int x;
	x = Integer.parseInt(posicion.substring(0,1));
	return x;
    }

    //metodo para obtener la y
    public int getY(){
	int y;
	y = Integer.parseInt(posicion.substring(2,3));
	return y;
    }
    
    
}
