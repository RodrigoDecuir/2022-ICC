public class Tablero{
    private Piezas pieza;
    private String[][] cuadros;

    //metodo constructor
    public Tablero(){
	cuadros = new String[8][8];
	for(int i=0; i<8; i++){
	    for(int j=0; j<8; j++){
		cuadros[i][j]=" ";
	    }
	}
    }

    //metodo para imprimir el tablero
    public void getTablero(){
	for(int i=7; i>=0; i--){
	    System.out.print("---------------------------------\n");
	    for(int j=0; j<8; j++){		
		System.out.print("| "+cuadros[i][j]+" ");
	    }
	    System.out.print("|\n");
	}
	System.out.print("---------------------------------\n");
    }

    //metodo para poner una pieza en un cuadro del tablero
    public void colocarPieza(Piezas p){
	int x,y;
	x = p.getX()-1;
	y = p.getY()-1;
	cuadros[y][x] = p.getPieza();
    }

    //metodo para asignar los movimientos posibles de una pieza al tablero
    public void posiblesMovimientos(String[] posibles){
	int x,y;
	for(int i=0; i<posibles.length; i++){
	    if(posibles[i]==null){}
	    else{
		x = Integer.parseInt(posibles[i].substring(0,1))-1;
		y = Integer.parseInt(posibles[i].substring(2,3))-1;
		cuadros[y][x] = "*";
	    }
	}
    }

    
}
